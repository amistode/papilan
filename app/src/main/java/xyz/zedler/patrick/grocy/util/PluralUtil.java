/*
 * This file is part of Grocy Android.
 *
 * Grocy Android is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Grocy Android is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Grocy Android. If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (c) 2020-2021 by Patrick Zedler and Dominic Zedler
 */

package xyz.zedler.patrick.grocy.util;

import java.util.HashMap;
import xyz.zedler.patrick.grocy.model.QuantityUnit;

public class PluralUtil {

  public static String getQuantityUnitPlural(QuantityUnit quantityUnit, double amount) {
    return quantityUnit != null
        ? amount == 1
        ? quantityUnit.getName()
        : quantityUnit.getNamePlural()
        : "";
  }

  public static String getQuantityUnitPlural(
      HashMap<Integer, QuantityUnit> unitHashMap,
      int quantityUnitId,
      double amount
  ) {
    return getQuantityUnitPlural(unitHashMap.get(quantityUnitId), amount);
  }
}