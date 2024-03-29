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

package ispace.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ispace.model.KieuVanBan;

import java.util.List;

/**
 * The persistence utility for the kieu van ban service. This utility wraps {@link KieuVanBanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author PC
 * @see KieuVanBanPersistence
 * @see KieuVanBanPersistenceImpl
 * @generated
 */
public class KieuVanBanUtil {
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
	public static void clearCache(KieuVanBan kieuVanBan) {
		getPersistence().clearCache(kieuVanBan);
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
	public static List<KieuVanBan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KieuVanBan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KieuVanBan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static KieuVanBan update(KieuVanBan kieuVanBan)
		throws SystemException {
		return getPersistence().update(kieuVanBan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static KieuVanBan update(KieuVanBan kieuVanBan,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(kieuVanBan, serviceContext);
	}

	/**
	* Caches the kieu van ban in the entity cache if it is enabled.
	*
	* @param kieuVanBan the kieu van ban
	*/
	public static void cacheResult(ispace.model.KieuVanBan kieuVanBan) {
		getPersistence().cacheResult(kieuVanBan);
	}

	/**
	* Caches the kieu van bans in the entity cache if it is enabled.
	*
	* @param kieuVanBans the kieu van bans
	*/
	public static void cacheResult(
		java.util.List<ispace.model.KieuVanBan> kieuVanBans) {
		getPersistence().cacheResult(kieuVanBans);
	}

	/**
	* Creates a new kieu van ban with the primary key. Does not add the kieu van ban to the database.
	*
	* @param id the primary key for the new kieu van ban
	* @return the new kieu van ban
	*/
	public static ispace.model.KieuVanBan create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the kieu van ban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kieu van ban
	* @return the kieu van ban that was removed
	* @throws ispace.NoSuchKieuVanBanException if a kieu van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.KieuVanBan remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchKieuVanBanException {
		return getPersistence().remove(id);
	}

	public static ispace.model.KieuVanBan updateImpl(
		ispace.model.KieuVanBan kieuVanBan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(kieuVanBan);
	}

	/**
	* Returns the kieu van ban with the primary key or throws a {@link ispace.NoSuchKieuVanBanException} if it could not be found.
	*
	* @param id the primary key of the kieu van ban
	* @return the kieu van ban
	* @throws ispace.NoSuchKieuVanBanException if a kieu van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.KieuVanBan findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchKieuVanBanException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the kieu van ban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the kieu van ban
	* @return the kieu van ban, or <code>null</code> if a kieu van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.KieuVanBan fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the kieu van bans.
	*
	* @return the kieu van bans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.KieuVanBan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the kieu van bans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.KieuVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kieu van bans
	* @param end the upper bound of the range of kieu van bans (not inclusive)
	* @return the range of kieu van bans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.KieuVanBan> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the kieu van bans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.KieuVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kieu van bans
	* @param end the upper bound of the range of kieu van bans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kieu van bans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.KieuVanBan> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the kieu van bans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of kieu van bans.
	*
	* @return the number of kieu van bans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KieuVanBanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KieuVanBanPersistence)PortletBeanLocatorUtil.locate(ispace.service.ClpSerializer.getServletContextName(),
					KieuVanBanPersistence.class.getName());

			ReferenceRegistry.registerReference(KieuVanBanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(KieuVanBanPersistence persistence) {
	}

	private static KieuVanBanPersistence _persistence;
}