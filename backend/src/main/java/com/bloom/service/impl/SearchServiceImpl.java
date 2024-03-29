package com.bloom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloom.dao.ISearchDao;
import com.bloom.model.Search;
import com.bloom.service.ISearchService;

@Service
public class SearchServiceImpl implements ISearchService {

	@Autowired
	private ISearchDao searchDao;

	@Override
	public List<Search> getAllSearch(long num) {
		return searchDao.getAllSearch(num);
	}

	@Override
	public Search isSearched(Search search) {
		return searchDao.isSearched(search);
	}

	@Override
	public int search(Search search) {
		return searchDao.search(search);
	}

	@Override
	public int deleteSearch(Search search) {
		return searchDao.deleteSearch(search);
	}

	@Override
	public int updateSearch(Search search) {
		return searchDao.updateSearch(search);
	}

}
