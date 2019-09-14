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

package com.thuvien.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.thuvien.model.Theloai;

/**
 * The persistence interface for the theloai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author PC
 * @see TheloaiPersistenceImpl
 * @see TheloaiUtil
 * @generated
 */
public interface TheloaiPersistence extends BasePersistence<Theloai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TheloaiUtil} to access the theloai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the theloai in the entity cache if it is enabled.
	*
	* @param theloai the theloai
	*/
	public void cacheResult(com.thuvien.model.Theloai theloai);

	/**
	* Caches the theloais in the entity cache if it is enabled.
	*
	* @param theloais the theloais
	*/
	public void cacheResult(java.util.List<com.thuvien.model.Theloai> theloais);

	/**
	* Creates a new theloai with the primary key. Does not add the theloai to the database.
	*
	* @param id the primary key for the new theloai
	* @return the new theloai
	*/
	public com.thuvien.model.Theloai create(long id);

	/**
	* Removes the theloai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the theloai
	* @return the theloai that was removed
	* @throws com.thuvien.NoSuchTheloaiException if a theloai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thuvien.model.Theloai remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thuvien.NoSuchTheloaiException;

	public com.thuvien.model.Theloai updateImpl(
		com.thuvien.model.Theloai theloai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the theloai with the primary key or throws a {@link com.thuvien.NoSuchTheloaiException} if it could not be found.
	*
	* @param id the primary key of the theloai
	* @return the theloai
	* @throws com.thuvien.NoSuchTheloaiException if a theloai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thuvien.model.Theloai findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.thuvien.NoSuchTheloaiException;

	/**
	* Returns the theloai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the theloai
	* @return the theloai, or <code>null</code> if a theloai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.thuvien.model.Theloai fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the theloais.
	*
	* @return the theloais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.thuvien.model.Theloai> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the theloais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.TheloaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of theloais
	* @param end the upper bound of the range of theloais (not inclusive)
	* @return the range of theloais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.thuvien.model.Theloai> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the theloais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.TheloaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of theloais
	* @param end the upper bound of the range of theloais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of theloais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.thuvien.model.Theloai> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the theloais from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of theloais.
	*
	* @return the number of theloais
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}