package com.osals.enwrap.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.osals.base.domain.BaseEntity;

/**
 * @author:
 * @Description:包裹类
 * @date:2019年5月7日 下午8:47:01
 */
@Entity
@Table(name="T_ADMIN_ENWRAP")
public class Enwrap extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	public String getEnwrap_type() {
		return enwrap_type;
	}

	public void setEnwrap_type(String enwrap_type) {
		this.enwrap_type = enwrap_type;
	}

	public String getAddress_origin() {
		return address_origin;
	}

	public void setAddress_origin(String address_origin) {
		this.address_origin = address_origin;
	}

	public String getAddress_end() {
		return address_end;
	}

	public void setAddress_end(String address_end) {
		this.address_end = address_end;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="E_ID")
	protected Long id;
	
	@Column(name="ENWRAP_TYPE")
	private String enwrap_type;
	
	@Column(name="ADDRESS_ORIGIN")
	private String address_origin;
	
	@Column(name="ADDRESS_END")
	private String address_end;
	
	@ManyToOne
	@JoinColumn(name = "C_ID")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name="S_ID")
	private Seller seller;
}
