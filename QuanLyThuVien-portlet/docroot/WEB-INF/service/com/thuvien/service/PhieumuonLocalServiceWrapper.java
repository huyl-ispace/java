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

package com.thuvien.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PhieumuonLocalService}.
 *
 * @author PC
 * @see PhieumuonLocalService
 * @generated
 */
public class PhieumuonLocalServiceWrapper implements PhieumuonLocalService,
	ServiceWrapper<PhieumuonLocalService> {
	public PhieumuonLocalServiceWrapper(
		PhieumuonLocalService phieumuonLocalService) {
		_phieumuonLocalService = phieumuonLocalService;
	}

	/**
	* Adds the phieumuon to the database. Also notifies the appropriate model listeners.
	*
	* @param phieumuon the phieumuon
	* @return the phieumuon that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.Phieumuon addPhieumuon(
		com.thuvien.model.Phieumuon phieumuon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.addPhieumuon(phieumuon);
	}

	/**
	* Creates a new phieumuon with the primary key. Does not add the phieumuon to the database.
	*
	* @param id the primary key for the new phieumuon
	* @return the new phieumuon
	*/
	@Override
	public com.thuvien.model.Phieumuon createPhieumuon(long id) {
		return _phieumuonLocalService.createPhieumuon(id);
	}

	/**
	* Deletes the phieumuon with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phieumuon
	* @return the phieumuon that was removed
	* @throws PortalException if a phieumuon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.Phieumuon deletePhieumuon(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.deletePhieumuon(id);
	}

	/**
	* Deletes the phieumuon from the database. Also notifies the appropriate model listeners.
	*
	* @param phieumuon the phieumuon
	* @return the phieumuon that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.Phieumuon deletePhieumuon(
		com.thuvien.model.Phieumuon phieumuon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.deletePhieumuon(phieumuon);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _phieumuonLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.PhieumuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.PhieumuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.thuvien.model.Phieumuon fetchPhieumuon(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.fetchPhieumuon(id);
	}

	/**
	* Returns the phieumuon with the primary key.
	*
	* @param id the primary key of the phieumuon
	* @return the phieumuon
	* @throws PortalException if a phieumuon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.Phieumuon getPhieumuon(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.getPhieumuon(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the phieumuons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.PhieumuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phieumuons
	* @param end the upper bound of the range of phieumuons (not inclusive)
	* @return the range of phieumuons
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.thuvien.model.Phieumuon> getPhieumuons(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.getPhieumuons(start, end);
	}

	/**
	* Returns the number of phieumuons.
	*
	* @return the number of phieumuons
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPhieumuonsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.getPhieumuonsCount();
	}

	/**
	* Updates the phieumuon in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phieumuon the phieumuon
	* @return the phieumuon that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.Phieumuon updatePhieumuon(
		com.thuvien.model.Phieumuon phieumuon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuonLocalService.updatePhieumuon(phieumuon);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _phieumuonLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_phieumuonLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _phieumuonLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PhieumuonLocalService getWrappedPhieumuonLocalService() {
		return _phieumuonLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPhieumuonLocalService(
		PhieumuonLocalService phieumuonLocalService) {
		_phieumuonLocalService = phieumuonLocalService;
	}

	@Override
	public PhieumuonLocalService getWrappedService() {
		return _phieumuonLocalService;
	}

	@Override
	public void setWrappedService(PhieumuonLocalService phieumuonLocalService) {
		_phieumuonLocalService = phieumuonLocalService;
	}

	private PhieumuonLocalService _phieumuonLocalService;
}