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

package ispace.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import ispace.model.NguoiDung;

import ispace.service.NguoiDungService;

import ispace.service.persistence.KieuVanBanPersistence;
import ispace.service.persistence.LoaiVanBanPersistence;
import ispace.service.persistence.LuanChuyenPersistence;
import ispace.service.persistence.NguoiDungPersistence;
import ispace.service.persistence.SoVanBanPersistence;
import ispace.service.persistence.VanBanDenPersistence;
import ispace.service.persistence.VanBanDiPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the nguoi dung remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link ispace.service.impl.NguoiDungServiceImpl}.
 * </p>
 *
 * @author PC
 * @see ispace.service.impl.NguoiDungServiceImpl
 * @see ispace.service.NguoiDungServiceUtil
 * @generated
 */
public abstract class NguoiDungServiceBaseImpl extends BaseServiceImpl
	implements NguoiDungService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ispace.service.NguoiDungServiceUtil} to access the nguoi dung remote service.
	 */

	/**
	 * Returns the kieu van ban local service.
	 *
	 * @return the kieu van ban local service
	 */
	public ispace.service.KieuVanBanLocalService getKieuVanBanLocalService() {
		return kieuVanBanLocalService;
	}

	/**
	 * Sets the kieu van ban local service.
	 *
	 * @param kieuVanBanLocalService the kieu van ban local service
	 */
	public void setKieuVanBanLocalService(
		ispace.service.KieuVanBanLocalService kieuVanBanLocalService) {
		this.kieuVanBanLocalService = kieuVanBanLocalService;
	}

	/**
	 * Returns the kieu van ban remote service.
	 *
	 * @return the kieu van ban remote service
	 */
	public ispace.service.KieuVanBanService getKieuVanBanService() {
		return kieuVanBanService;
	}

	/**
	 * Sets the kieu van ban remote service.
	 *
	 * @param kieuVanBanService the kieu van ban remote service
	 */
	public void setKieuVanBanService(
		ispace.service.KieuVanBanService kieuVanBanService) {
		this.kieuVanBanService = kieuVanBanService;
	}

	/**
	 * Returns the kieu van ban persistence.
	 *
	 * @return the kieu van ban persistence
	 */
	public KieuVanBanPersistence getKieuVanBanPersistence() {
		return kieuVanBanPersistence;
	}

	/**
	 * Sets the kieu van ban persistence.
	 *
	 * @param kieuVanBanPersistence the kieu van ban persistence
	 */
	public void setKieuVanBanPersistence(
		KieuVanBanPersistence kieuVanBanPersistence) {
		this.kieuVanBanPersistence = kieuVanBanPersistence;
	}

	/**
	 * Returns the loai van ban local service.
	 *
	 * @return the loai van ban local service
	 */
	public ispace.service.LoaiVanBanLocalService getLoaiVanBanLocalService() {
		return loaiVanBanLocalService;
	}

	/**
	 * Sets the loai van ban local service.
	 *
	 * @param loaiVanBanLocalService the loai van ban local service
	 */
	public void setLoaiVanBanLocalService(
		ispace.service.LoaiVanBanLocalService loaiVanBanLocalService) {
		this.loaiVanBanLocalService = loaiVanBanLocalService;
	}

	/**
	 * Returns the loai van ban remote service.
	 *
	 * @return the loai van ban remote service
	 */
	public ispace.service.LoaiVanBanService getLoaiVanBanService() {
		return loaiVanBanService;
	}

	/**
	 * Sets the loai van ban remote service.
	 *
	 * @param loaiVanBanService the loai van ban remote service
	 */
	public void setLoaiVanBanService(
		ispace.service.LoaiVanBanService loaiVanBanService) {
		this.loaiVanBanService = loaiVanBanService;
	}

	/**
	 * Returns the loai van ban persistence.
	 *
	 * @return the loai van ban persistence
	 */
	public LoaiVanBanPersistence getLoaiVanBanPersistence() {
		return loaiVanBanPersistence;
	}

	/**
	 * Sets the loai van ban persistence.
	 *
	 * @param loaiVanBanPersistence the loai van ban persistence
	 */
	public void setLoaiVanBanPersistence(
		LoaiVanBanPersistence loaiVanBanPersistence) {
		this.loaiVanBanPersistence = loaiVanBanPersistence;
	}

	/**
	 * Returns the luan chuyen local service.
	 *
	 * @return the luan chuyen local service
	 */
	public ispace.service.LuanChuyenLocalService getLuanChuyenLocalService() {
		return luanChuyenLocalService;
	}

	/**
	 * Sets the luan chuyen local service.
	 *
	 * @param luanChuyenLocalService the luan chuyen local service
	 */
	public void setLuanChuyenLocalService(
		ispace.service.LuanChuyenLocalService luanChuyenLocalService) {
		this.luanChuyenLocalService = luanChuyenLocalService;
	}

	/**
	 * Returns the luan chuyen remote service.
	 *
	 * @return the luan chuyen remote service
	 */
	public ispace.service.LuanChuyenService getLuanChuyenService() {
		return luanChuyenService;
	}

	/**
	 * Sets the luan chuyen remote service.
	 *
	 * @param luanChuyenService the luan chuyen remote service
	 */
	public void setLuanChuyenService(
		ispace.service.LuanChuyenService luanChuyenService) {
		this.luanChuyenService = luanChuyenService;
	}

	/**
	 * Returns the luan chuyen persistence.
	 *
	 * @return the luan chuyen persistence
	 */
	public LuanChuyenPersistence getLuanChuyenPersistence() {
		return luanChuyenPersistence;
	}

	/**
	 * Sets the luan chuyen persistence.
	 *
	 * @param luanChuyenPersistence the luan chuyen persistence
	 */
	public void setLuanChuyenPersistence(
		LuanChuyenPersistence luanChuyenPersistence) {
		this.luanChuyenPersistence = luanChuyenPersistence;
	}

	/**
	 * Returns the nguoi dung local service.
	 *
	 * @return the nguoi dung local service
	 */
	public ispace.service.NguoiDungLocalService getNguoiDungLocalService() {
		return nguoiDungLocalService;
	}

	/**
	 * Sets the nguoi dung local service.
	 *
	 * @param nguoiDungLocalService the nguoi dung local service
	 */
	public void setNguoiDungLocalService(
		ispace.service.NguoiDungLocalService nguoiDungLocalService) {
		this.nguoiDungLocalService = nguoiDungLocalService;
	}

	/**
	 * Returns the nguoi dung remote service.
	 *
	 * @return the nguoi dung remote service
	 */
	public ispace.service.NguoiDungService getNguoiDungService() {
		return nguoiDungService;
	}

	/**
	 * Sets the nguoi dung remote service.
	 *
	 * @param nguoiDungService the nguoi dung remote service
	 */
	public void setNguoiDungService(
		ispace.service.NguoiDungService nguoiDungService) {
		this.nguoiDungService = nguoiDungService;
	}

	/**
	 * Returns the nguoi dung persistence.
	 *
	 * @return the nguoi dung persistence
	 */
	public NguoiDungPersistence getNguoiDungPersistence() {
		return nguoiDungPersistence;
	}

	/**
	 * Sets the nguoi dung persistence.
	 *
	 * @param nguoiDungPersistence the nguoi dung persistence
	 */
	public void setNguoiDungPersistence(
		NguoiDungPersistence nguoiDungPersistence) {
		this.nguoiDungPersistence = nguoiDungPersistence;
	}

	/**
	 * Returns the so van ban local service.
	 *
	 * @return the so van ban local service
	 */
	public ispace.service.SoVanBanLocalService getSoVanBanLocalService() {
		return soVanBanLocalService;
	}

	/**
	 * Sets the so van ban local service.
	 *
	 * @param soVanBanLocalService the so van ban local service
	 */
	public void setSoVanBanLocalService(
		ispace.service.SoVanBanLocalService soVanBanLocalService) {
		this.soVanBanLocalService = soVanBanLocalService;
	}

	/**
	 * Returns the so van ban remote service.
	 *
	 * @return the so van ban remote service
	 */
	public ispace.service.SoVanBanService getSoVanBanService() {
		return soVanBanService;
	}

	/**
	 * Sets the so van ban remote service.
	 *
	 * @param soVanBanService the so van ban remote service
	 */
	public void setSoVanBanService(
		ispace.service.SoVanBanService soVanBanService) {
		this.soVanBanService = soVanBanService;
	}

	/**
	 * Returns the so van ban persistence.
	 *
	 * @return the so van ban persistence
	 */
	public SoVanBanPersistence getSoVanBanPersistence() {
		return soVanBanPersistence;
	}

	/**
	 * Sets the so van ban persistence.
	 *
	 * @param soVanBanPersistence the so van ban persistence
	 */
	public void setSoVanBanPersistence(SoVanBanPersistence soVanBanPersistence) {
		this.soVanBanPersistence = soVanBanPersistence;
	}

	/**
	 * Returns the van ban den local service.
	 *
	 * @return the van ban den local service
	 */
	public ispace.service.VanBanDenLocalService getVanBanDenLocalService() {
		return vanBanDenLocalService;
	}

	/**
	 * Sets the van ban den local service.
	 *
	 * @param vanBanDenLocalService the van ban den local service
	 */
	public void setVanBanDenLocalService(
		ispace.service.VanBanDenLocalService vanBanDenLocalService) {
		this.vanBanDenLocalService = vanBanDenLocalService;
	}

	/**
	 * Returns the van ban den remote service.
	 *
	 * @return the van ban den remote service
	 */
	public ispace.service.VanBanDenService getVanBanDenService() {
		return vanBanDenService;
	}

	/**
	 * Sets the van ban den remote service.
	 *
	 * @param vanBanDenService the van ban den remote service
	 */
	public void setVanBanDenService(
		ispace.service.VanBanDenService vanBanDenService) {
		this.vanBanDenService = vanBanDenService;
	}

	/**
	 * Returns the van ban den persistence.
	 *
	 * @return the van ban den persistence
	 */
	public VanBanDenPersistence getVanBanDenPersistence() {
		return vanBanDenPersistence;
	}

	/**
	 * Sets the van ban den persistence.
	 *
	 * @param vanBanDenPersistence the van ban den persistence
	 */
	public void setVanBanDenPersistence(
		VanBanDenPersistence vanBanDenPersistence) {
		this.vanBanDenPersistence = vanBanDenPersistence;
	}

	/**
	 * Returns the van ban di local service.
	 *
	 * @return the van ban di local service
	 */
	public ispace.service.VanBanDiLocalService getVanBanDiLocalService() {
		return vanBanDiLocalService;
	}

	/**
	 * Sets the van ban di local service.
	 *
	 * @param vanBanDiLocalService the van ban di local service
	 */
	public void setVanBanDiLocalService(
		ispace.service.VanBanDiLocalService vanBanDiLocalService) {
		this.vanBanDiLocalService = vanBanDiLocalService;
	}

	/**
	 * Returns the van ban di remote service.
	 *
	 * @return the van ban di remote service
	 */
	public ispace.service.VanBanDiService getVanBanDiService() {
		return vanBanDiService;
	}

	/**
	 * Sets the van ban di remote service.
	 *
	 * @param vanBanDiService the van ban di remote service
	 */
	public void setVanBanDiService(
		ispace.service.VanBanDiService vanBanDiService) {
		this.vanBanDiService = vanBanDiService;
	}

	/**
	 * Returns the van ban di persistence.
	 *
	 * @return the van ban di persistence
	 */
	public VanBanDiPersistence getVanBanDiPersistence() {
		return vanBanDiPersistence;
	}

	/**
	 * Sets the van ban di persistence.
	 *
	 * @param vanBanDiPersistence the van ban di persistence
	 */
	public void setVanBanDiPersistence(VanBanDiPersistence vanBanDiPersistence) {
		this.vanBanDiPersistence = vanBanDiPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return NguoiDung.class;
	}

	protected String getModelClassName() {
		return NguoiDung.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = nguoiDungPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = ispace.service.KieuVanBanLocalService.class)
	protected ispace.service.KieuVanBanLocalService kieuVanBanLocalService;
	@BeanReference(type = ispace.service.KieuVanBanService.class)
	protected ispace.service.KieuVanBanService kieuVanBanService;
	@BeanReference(type = KieuVanBanPersistence.class)
	protected KieuVanBanPersistence kieuVanBanPersistence;
	@BeanReference(type = ispace.service.LoaiVanBanLocalService.class)
	protected ispace.service.LoaiVanBanLocalService loaiVanBanLocalService;
	@BeanReference(type = ispace.service.LoaiVanBanService.class)
	protected ispace.service.LoaiVanBanService loaiVanBanService;
	@BeanReference(type = LoaiVanBanPersistence.class)
	protected LoaiVanBanPersistence loaiVanBanPersistence;
	@BeanReference(type = ispace.service.LuanChuyenLocalService.class)
	protected ispace.service.LuanChuyenLocalService luanChuyenLocalService;
	@BeanReference(type = ispace.service.LuanChuyenService.class)
	protected ispace.service.LuanChuyenService luanChuyenService;
	@BeanReference(type = LuanChuyenPersistence.class)
	protected LuanChuyenPersistence luanChuyenPersistence;
	@BeanReference(type = ispace.service.NguoiDungLocalService.class)
	protected ispace.service.NguoiDungLocalService nguoiDungLocalService;
	@BeanReference(type = ispace.service.NguoiDungService.class)
	protected ispace.service.NguoiDungService nguoiDungService;
	@BeanReference(type = NguoiDungPersistence.class)
	protected NguoiDungPersistence nguoiDungPersistence;
	@BeanReference(type = ispace.service.SoVanBanLocalService.class)
	protected ispace.service.SoVanBanLocalService soVanBanLocalService;
	@BeanReference(type = ispace.service.SoVanBanService.class)
	protected ispace.service.SoVanBanService soVanBanService;
	@BeanReference(type = SoVanBanPersistence.class)
	protected SoVanBanPersistence soVanBanPersistence;
	@BeanReference(type = ispace.service.VanBanDenLocalService.class)
	protected ispace.service.VanBanDenLocalService vanBanDenLocalService;
	@BeanReference(type = ispace.service.VanBanDenService.class)
	protected ispace.service.VanBanDenService vanBanDenService;
	@BeanReference(type = VanBanDenPersistence.class)
	protected VanBanDenPersistence vanBanDenPersistence;
	@BeanReference(type = ispace.service.VanBanDiLocalService.class)
	protected ispace.service.VanBanDiLocalService vanBanDiLocalService;
	@BeanReference(type = ispace.service.VanBanDiService.class)
	protected ispace.service.VanBanDiService vanBanDiService;
	@BeanReference(type = VanBanDiPersistence.class)
	protected VanBanDiPersistence vanBanDiPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private NguoiDungServiceClpInvoker _clpInvoker = new NguoiDungServiceClpInvoker();
}