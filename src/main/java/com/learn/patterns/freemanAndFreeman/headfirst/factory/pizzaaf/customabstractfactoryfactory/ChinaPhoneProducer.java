package com.learn.patterns.freemanAndFreeman.headfirst.factory.pizzaaf.customabstractfactoryfactory;


import org.apache.commons.lang.StringUtils;

/**
 * Created by bid on 8/1/14.
 */
public class ChinaPhoneProducer extends PhoneProducer
{

   @Override
   public Phone produceAndSellThePhone(final String model)
   {

      if(StringUtils.equals(model, "cellPhone")){
         return new ChinaCellPhone(new ChinaCellPhoneKeyBoardFactory());
      } else if(StringUtils.equals(model, "portablePhone")){
         return new PortablePhone();
      } else if(StringUtils.equals(model, "touchPhone")){
         return new TouchScreenPhone();
      }
      return new DefaultNokiaPhone();
   }
}
