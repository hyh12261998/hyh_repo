package com.osals.base.service;

import java.io.Serializable;
import java.util.List;

import com.osals.base.domain.BaseTreeEntity;

@SuppressWarnings("rawtypes")
public interface GenericTreeManager<T extends BaseTreeEntity, PK extends Serializable> extends GenericManager<T, PK> {

	/**
	 * ��ȡ�ƶ�id��ȫ������ʵ�弯�ϣ�
	 *
	 * @param id
	 * @return
	 */
	public List<T> getAncestors(PK id);

	/**
	 * ��ȡ�ƶ�id��ֱ�Ӻ���ʵ�弯�ϣ�
	 *
	 * @param id
	 * @return
	 */
	public List<T> getChildren(PK id);

	/**
	 * ��ȡ�ƶ�id��ȫ������ʵ�弯�ϣ�
	 *
	 * @param id
	 * @return
	 */
	public List<T> getDescendants(PK id);

	/**
	 * ��ȡ���ڵ�ʵ�弯��
	 *
	 * @return
	 */
	public List<T> getRoot();

}

