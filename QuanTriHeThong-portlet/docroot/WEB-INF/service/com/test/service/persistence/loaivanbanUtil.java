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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.test.model.loaivanban;

import java.util.List;

/**
 * The persistence utility for the loaivanban service. This utility wraps {@link loaivanbanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see loaivanbanPersistence
 * @see loaivanbanPersistenceImpl
 * @generated
 */
public class loaivanbanUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(loaivanban loaivanban) {
		getPersistence().clearCache(loaivanban);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<loaivanban> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<loaivanban> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<loaivanban> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static loaivanban update(loaivanban loaivanban)
		throws SystemException {
		return getPersistence().update(loaivanban);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static loaivanban update(loaivanban loaivanban,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(loaivanban, serviceContext);
	}

	/**
	* Caches the loaivanban in the entity cache if it is enabled.
	*
	* @param loaivanban the loaivanban
	*/
	public static void cacheResult(com.test.model.loaivanban loaivanban) {
		getPersistence().cacheResult(loaivanban);
	}

	/**
	* Caches the loaivanbans in the entity cache if it is enabled.
	*
	* @param loaivanbans the loaivanbans
	*/
	public static void cacheResult(
		java.util.List<com.test.model.loaivanban> loaivanbans) {
		getPersistence().cacheResult(loaivanbans);
	}

	/**
	* Creates a new loaivanban with the primary key. Does not add the loaivanban to the database.
	*
	* @param id the primary key for the new loaivanban
	* @return the new loaivanban
	*/
	public static com.test.model.loaivanban create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the loaivanban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the loaivanban
	* @return the loaivanban that was removed
	* @throws com.test.NoSuchloaivanbanException if a loaivanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.loaivanban remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchloaivanbanException {
		return getPersistence().remove(id);
	}

	public static com.test.model.loaivanban updateImpl(
		com.test.model.loaivanban loaivanban)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(loaivanban);
	}

	/**
	* Returns the loaivanban with the primary key or throws a {@link com.test.NoSuchloaivanbanException} if it could not be found.
	*
	* @param id the primary key of the loaivanban
	* @return the loaivanban
	* @throws com.test.NoSuchloaivanbanException if a loaivanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.loaivanban findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchloaivanbanException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the loaivanban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the loaivanban
	* @return the loaivanban, or <code>null</code> if a loaivanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.loaivanban fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the loaivanbans.
	*
	* @return the loaivanbans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.loaivanban> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the loaivanbans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.loaivanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loaivanbans
	* @param end the upper bound of the range of loaivanbans (not inclusive)
	* @return the range of loaivanbans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.loaivanban> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the loaivanbans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.loaivanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loaivanbans
	* @param end the upper bound of the range of loaivanbans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of loaivanbans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.loaivanban> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the loaivanbans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of loaivanbans.
	*
	* @return the number of loaivanbans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static loaivanbanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (loaivanbanPersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					loaivanbanPersistence.class.getName());

			ReferenceRegistry.registerReference(loaivanbanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(loaivanbanPersistence persistence) {
	}

	private static loaivanbanPersistence _persistence;
}