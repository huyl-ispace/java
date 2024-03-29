/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.test.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.test.NoSuchsovanbanException;

import com.test.model.impl.sovanbanImpl;
import com.test.model.impl.sovanbanModelImpl;
import com.test.model.sovanban;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sovanban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see sovanbanPersistence
 * @see sovanbanUtil
 * @generated
 */
public class sovanbanPersistenceImpl extends BasePersistenceImpl<sovanban>
	implements sovanbanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link sovanbanUtil} to access the sovanban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = sovanbanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(sovanbanModelImpl.ENTITY_CACHE_ENABLED,
			sovanbanModelImpl.FINDER_CACHE_ENABLED, sovanbanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(sovanbanModelImpl.ENTITY_CACHE_ENABLED,
			sovanbanModelImpl.FINDER_CACHE_ENABLED, sovanbanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(sovanbanModelImpl.ENTITY_CACHE_ENABLED,
			sovanbanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public sovanbanPersistenceImpl() {
		setModelClass(sovanban.class);
	}

	/**
	 * Caches the sovanban in the entity cache if it is enabled.
	 *
	 * @param sovanban the sovanban
	 */
	@Override
	public void cacheResult(sovanban sovanban) {
		EntityCacheUtil.putResult(sovanbanModelImpl.ENTITY_CACHE_ENABLED,
			sovanbanImpl.class, sovanban.getPrimaryKey(), sovanban);

		sovanban.resetOriginalValues();
	}

	/**
	 * Caches the sovanbans in the entity cache if it is enabled.
	 *
	 * @param sovanbans the sovanbans
	 */
	@Override
	public void cacheResult(List<sovanban> sovanbans) {
		for (sovanban sovanban : sovanbans) {
			if (EntityCacheUtil.getResult(
						sovanbanModelImpl.ENTITY_CACHE_ENABLED,
						sovanbanImpl.class, sovanban.getPrimaryKey()) == null) {
				cacheResult(sovanban);
			}
			else {
				sovanban.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sovanbans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(sovanbanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(sovanbanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sovanban.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(sovanban sovanban) {
		EntityCacheUtil.removeResult(sovanbanModelImpl.ENTITY_CACHE_ENABLED,
			sovanbanImpl.class, sovanban.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<sovanban> sovanbans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (sovanban sovanban : sovanbans) {
			EntityCacheUtil.removeResult(sovanbanModelImpl.ENTITY_CACHE_ENABLED,
				sovanbanImpl.class, sovanban.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sovanban with the primary key. Does not add the sovanban to the database.
	 *
	 * @param id the primary key for the new sovanban
	 * @return the new sovanban
	 */
	@Override
	public sovanban create(long id) {
		sovanban sovanban = new sovanbanImpl();

		sovanban.setNew(true);
		sovanban.setPrimaryKey(id);

		return sovanban;
	}

	/**
	 * Removes the sovanban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the sovanban
	 * @return the sovanban that was removed
	 * @throws com.test.NoSuchsovanbanException if a sovanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public sovanban remove(long id)
		throws NoSuchsovanbanException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the sovanban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sovanban
	 * @return the sovanban that was removed
	 * @throws com.test.NoSuchsovanbanException if a sovanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public sovanban remove(Serializable primaryKey)
		throws NoSuchsovanbanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			sovanban sovanban = (sovanban)session.get(sovanbanImpl.class,
					primaryKey);

			if (sovanban == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsovanbanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sovanban);
		}
		catch (NoSuchsovanbanException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected sovanban removeImpl(sovanban sovanban) throws SystemException {
		sovanban = toUnwrappedModel(sovanban);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sovanban)) {
				sovanban = (sovanban)session.get(sovanbanImpl.class,
						sovanban.getPrimaryKeyObj());
			}

			if (sovanban != null) {
				session.delete(sovanban);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sovanban != null) {
			clearCache(sovanban);
		}

		return sovanban;
	}

	@Override
	public sovanban updateImpl(com.test.model.sovanban sovanban)
		throws SystemException {
		sovanban = toUnwrappedModel(sovanban);

		boolean isNew = sovanban.isNew();

		Session session = null;

		try {
			session = openSession();

			if (sovanban.isNew()) {
				session.save(sovanban);

				sovanban.setNew(false);
			}
			else {
				session.merge(sovanban);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(sovanbanModelImpl.ENTITY_CACHE_ENABLED,
			sovanbanImpl.class, sovanban.getPrimaryKey(), sovanban);

		return sovanban;
	}

	protected sovanban toUnwrappedModel(sovanban sovanban) {
		if (sovanban instanceof sovanbanImpl) {
			return sovanban;
		}

		sovanbanImpl sovanbanImpl = new sovanbanImpl();

		sovanbanImpl.setNew(sovanban.isNew());
		sovanbanImpl.setPrimaryKey(sovanban.getPrimaryKey());

		sovanbanImpl.setId(sovanban.getId());
		sovanbanImpl.setTen(sovanban.getTen());

		return sovanbanImpl;
	}

	/**
	 * Returns the sovanban with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sovanban
	 * @return the sovanban
	 * @throws com.test.NoSuchsovanbanException if a sovanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public sovanban findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsovanbanException, SystemException {
		sovanban sovanban = fetchByPrimaryKey(primaryKey);

		if (sovanban == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsovanbanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sovanban;
	}

	/**
	 * Returns the sovanban with the primary key or throws a {@link com.test.NoSuchsovanbanException} if it could not be found.
	 *
	 * @param id the primary key of the sovanban
	 * @return the sovanban
	 * @throws com.test.NoSuchsovanbanException if a sovanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public sovanban findByPrimaryKey(long id)
		throws NoSuchsovanbanException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the sovanban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sovanban
	 * @return the sovanban, or <code>null</code> if a sovanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public sovanban fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		sovanban sovanban = (sovanban)EntityCacheUtil.getResult(sovanbanModelImpl.ENTITY_CACHE_ENABLED,
				sovanbanImpl.class, primaryKey);

		if (sovanban == _nullsovanban) {
			return null;
		}

		if (sovanban == null) {
			Session session = null;

			try {
				session = openSession();

				sovanban = (sovanban)session.get(sovanbanImpl.class, primaryKey);

				if (sovanban != null) {
					cacheResult(sovanban);
				}
				else {
					EntityCacheUtil.putResult(sovanbanModelImpl.ENTITY_CACHE_ENABLED,
						sovanbanImpl.class, primaryKey, _nullsovanban);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(sovanbanModelImpl.ENTITY_CACHE_ENABLED,
					sovanbanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sovanban;
	}

	/**
	 * Returns the sovanban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the sovanban
	 * @return the sovanban, or <code>null</code> if a sovanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public sovanban fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the sovanbans.
	 *
	 * @return the sovanbans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<sovanban> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sovanbans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.sovanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sovanbans
	 * @param end the upper bound of the range of sovanbans (not inclusive)
	 * @return the range of sovanbans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<sovanban> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sovanbans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.sovanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sovanbans
	 * @param end the upper bound of the range of sovanbans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sovanbans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<sovanban> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<sovanban> list = (List<sovanban>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOVANBAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOVANBAN;

				if (pagination) {
					sql = sql.concat(sovanbanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<sovanban>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<sovanban>(list);
				}
				else {
					list = (List<sovanban>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the sovanbans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (sovanban sovanban : findAll()) {
			remove(sovanban);
		}
	}

	/**
	 * Returns the number of sovanbans.
	 *
	 * @return the number of sovanbans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SOVANBAN);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the sovanban persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.sovanban")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<sovanban>> listenersList = new ArrayList<ModelListener<sovanban>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<sovanban>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(sovanbanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOVANBAN = "SELECT sovanban FROM sovanban sovanban";
	private static final String _SQL_COUNT_SOVANBAN = "SELECT COUNT(sovanban) FROM sovanban sovanban";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sovanban.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No sovanban exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(sovanbanPersistenceImpl.class);
	private static sovanban _nullsovanban = new sovanbanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<sovanban> toCacheModel() {
				return _nullsovanbanCacheModel;
			}
		};

	private static CacheModel<sovanban> _nullsovanbanCacheModel = new CacheModel<sovanban>() {
			@Override
			public sovanban toEntityModel() {
				return _nullsovanban;
			}
		};
}