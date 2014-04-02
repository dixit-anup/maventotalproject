package com.learn.patterns.abstractpatterns.delegator.notsimple;

/**
 * Created by IntelliJ IDEA.
 * User: bilyk
 * Date: 02.07.12
 * Time: 16:09
 * To change this template use File | Settings | File Templates.
 */

//Сложный пример

  //      Используя интерфейсы, делегирование может быть осуществлено более гибко и c защитой типов (typesafe).
  // В этом примере, класс C может делегировать либо классу A либо классу B. Класс C имеет методы для переключения между классами A и B.
  // Включение расширения implements улучшает безопасность типа, потому что каждый класс должен выполнять методы в интерфейсе.
  // Основным недостатком является большее количество кода.

  //    Приведем пример. Допустим, нужно реализовать таймер таким образом, чтобы через определённое количество времени вызывалась некоторая функция.
  // Программист таймера хочет предоставить задание функции пользователям своего класса (другим программистам)

public class InterFaceDelegation {
}
