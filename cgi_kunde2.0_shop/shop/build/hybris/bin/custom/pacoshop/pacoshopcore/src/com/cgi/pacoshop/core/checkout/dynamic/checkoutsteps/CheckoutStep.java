/*
* [y] hybris Platform
*
* Copyright (c) 2000-2013 hybris AG
* All rights reserved.
*
* This software is the confidential and proprietary information of hybris
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with hybris.
*
*
*/
package com.cgi.pacoshop.core.checkout.dynamic.checkoutsteps;


import com.cgi.pacoshop.core.checkout.dynamic.FormDTO;
import com.cgi.pacoshop.core.checkout.dynamic.checkoutsteps.formelementgroups.FormElementGroup;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Checkout Step - interface for actual pages in frontend
 *
 * @module hybris - pacoshopcore
 * @version 1.0v Dec 17, 2013
 * @author symmetrics - a CGI Group brand <info@symmetrics.de>
 * @author Dmitry Popov <dmitry.popov@symmetrics.de>
 * @link http://www.symmetrics.de/
 * @see https://wiki.hybris.com/
 * @copyright 2013 symmetrics - a CGI Group brand
 *
 *
 */
public interface CheckoutStep
{

	/**
	 * @return the list of groups of controls that need to be rendered when the step is displayed.
	 */
	List<FormElementGroup> getElements();


	/**
	 * @return the label of the CMS page to be rendered.
	 */
	String getCMSPageLabel();

	/**
	 *
	 * @return the name of the step, which will be used in the frontend.
	 */
	String getStepName();

	/**
	 * Method determines if the step is completed and therefore doesn't need to be rendered.
	 * @return true if all formelemetgroups linked to the step are completed,
	 * 		  i.e pre-filled from the shopping cart or entered by the customer.
	 */
	boolean isCompleted();

	/**
	 * Method determines if the step is last step.
	 * @return true if corrent step is the last step
	 */
	boolean isLastStep();


	/**
	 * The step should be completed when non of it's form element groups are needed to be displayed.
	 * @param completed - completed setter.
	 */
	void setCompleted(boolean completed);

	/**
	 * Form getter.
	 * @return - Form data transfer object.
	 */
	FormDTO getForm();

	/**
	 * Method determines is the load from cart is allowed on current step, default value is true.
	 * @return true if population from card on current step is enabled.
	 */
	boolean isPopulateFromCart();

	/**
	 * The method to allow or deny reloading from cart.
	 * @param populateFromCart - populateFromCart flag setter
	 */
	void setPopulateFromCart(boolean populateFromCart);
}
