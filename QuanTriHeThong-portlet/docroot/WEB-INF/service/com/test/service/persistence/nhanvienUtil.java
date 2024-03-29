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

import com.test.model.nhanvien;

import java.util.List;

/**
 * The persistence utility for the nhanvien service. This utility wraps {@link nhanvienPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Duy Nguyen
 * @see nhanvienPersistence
 * @see nhanvienPersistenceImpl
 * @generated
 */
public class nhanvienUtil {
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
	public static void clearCache(nhanvien nhanvien) {
		getPersistence().clearCache(nhanvien);
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
	public static List<nhanvien> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<nhanvien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<nhanvien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static nhanvien update(nhanvien nhanvien) throws SystemException {
		return getPersistence().update(nhanvien);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static nhanvien update(nhanvien nhanvien,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(nhanvien, serviceContext);
	}

	/**
	* Caches the nhanvien in the entity cache if it is enabled.
	*
	* @param nhanvien the nhanvien
	*/
	public static void cacheResult(com.test.model.nhanvien nhanvien) {
		getPersistence().cacheResult(nhanvien);
	}

	/**
	* Caches the nhanviens in the entity cache if it is enabled.
	*
	* @param nhanviens the nhanviens
	*/
	public static void cacheResult(
		java.util.List<com.test.model.nhanvien> nhanviens) {
		getPersistence().cacheResult(nhanviens);
	}

	/**
	* Creates a new nhanvien with the primary key. Does not add the nhanvien to the database.
	*
	* @param id the primary key for the new nhanvien
	* @return the new nhanvien
	*/
	public static com.test.model.nhanvien create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the nhanvien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the nhanvien
	* @return the nhanvien that was removed
	* @throws com.test.NoSuchnhanvienException if a nhanvien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.nhanvien remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchnhanvienException {
		return getPersistence().remove(id);
	}

	public static com.test.model.nhanvien updateImpl(
		com.test.model.nhanvien nhanvien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(nhanvien);
	}

	/**
	* Returns the nhanvien with the primary key or throws a {@link com.test.NoSuchnhanvienException} if it could not be found.
	*
	* @param id the primary key of the nhanvien
	* @return the nhanvien
	* @throws com.test.NoSuchnhanvienException if a nhanvien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.nhanvien findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchnhanvienException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the nhanvien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the nhanvien
	* @return the nhanvien, or <code>null</code> if a nhanvien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.nhanvien fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the nhanviens.
	*
	* @return the nhanviens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.nhanvien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the nhanviens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.nhanvienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhanviens
	* @param end the upper bound of the range of nhanviens (not inclusive)
	* @return the range of nhanviens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.nhanvien> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the nhanviens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.nhanvienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhanviens
	* @param end the upper bound of the range of nhanviens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nhanviens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.nhanvien> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the nhanviens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of nhanviens.
	*
	* @return the number of nhanviens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static nhanvienPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (nhanvienPersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					nhanvienPersistence.class.getName());

			ReferenceRegistry.registerReference(nhanvienUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(nhanvienPersistence persistence) {
	}

	private static nhanvienPersistence _persistence;
}