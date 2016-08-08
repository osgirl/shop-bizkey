package com.mns;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/key")
public class BizKeyController {

	@Autowired
	BizKeyRepository bizKeyRepository;

	private List<Bizkey> bizkeyList;

	@RequestMapping(value = "/all/{release}", method = RequestMethod.GET)
	public List<Bizkey> getAllBusinessKeys(@PathVariable String release) {
		// return bizkeyList.stream().filter(x ->
		// release.equals(x.getRelease())).collect(Collectors.toList());
		return bizKeyRepository.findAll();
	}

	@RequestMapping(value = "/updated/{release}", method = RequestMethod.GET)
	public List<Bizkey> getUpdatedBusinessKeys(@PathVariable String release) {
		return bizkeyList.stream().filter(x -> x.getBizKeyType() == 1 && release.equals(x.getBizKeyRelease()))
				.collect(Collectors.toList());
	}

	@RequestMapping(value = "/new/{release}", method = RequestMethod.GET)
	public List<Bizkey> getNewBusinessKeys(@PathVariable String release) {
		return bizkeyList.stream().filter(x -> x.getBizKeyType() == 0 && release.equals(x.getBizKeyRelease()))
				.collect(Collectors.toList());
	}

	@RequestMapping(value = "/delete/{release}/{id}/{key}/{storeType}", method = RequestMethod.DELETE)
	public List<Bizkey> deleteBusinessKeys(@PathVariable long id, @PathVariable String release,
			@PathVariable String key, @PathVariable String storeType) {

		/*
		 * List<Bizkey> filteredList = bizkeyList.stream() .filter(x ->
		 * x.getKey() == key && release.equals(x.getRelease()) &&
		 * storeType.equals(x.getStore())) .collect(Collectors.toList());
		 */
		List<Bizkey> filteredList = bizkeyList.stream().filter(x -> x.getBizkeyId() == id).collect(Collectors.toList());
		System.out.println("Value in Filtered List" + filteredList);
		if (null != filteredList && filteredList.size() == 1) {
			Bizkey bizkey = filteredList.get(0);
			if (bizkey.getBizkeyName().equals(key) && bizkey.getBizKeyStore().equals(storeType)) {
				bizkeyList.removeAll(filteredList);
			} else {
				System.out.println("Key and StoreType does not match for the collection");
			}

		}
		return bizkeyList;
	}

	@RequestMapping(value = "/create/{release}", method = RequestMethod.POST)
	public List<Bizkey> createBusinessKeys(@PathVariable String release, @RequestBody Bizkey bizkey) {
		bizkeyList.add(bizkey);
		return bizkeyList;
	}

	@RequestMapping(value = "/modify/{release}", method = RequestMethod.PUT)
	public List<Bizkey> modifyBusinessKeys(@PathVariable String release, @RequestBody Bizkey bizkey) {

		List<Bizkey> filteredList = bizkeyList.stream()
				.filter(x -> x.getBizkeyId() == bizkey.getBizkeyId() && release.equals(x.getBizKeyRelease()))
				.collect(Collectors.toList());
		System.out.println("Value in Filtered List" + filteredList);
		if (null != filteredList && filteredList.size() == 1) {
			bizkeyList.removeAll(filteredList);
			bizkeyList.add(bizkey);
		} else {
			System.out.println("Nothing to modify");
		}
		System.out.println("Value in final List" + bizkeyList);
		return bizkeyList;

	}

}
