package controllers;

import models.Brand;

public class BrandController {

  public Brand[] sortBubbleDesc(Brand[] brands) {
    int n = brands.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (brands[j].getTotalValidYears() < brands[j + 1].getTotalValidYears()) {
          Brand temp = brands[j];
          brands[j] = brands[j + 1];
          brands[j + 1] = temp;
        }
      }
    }
    return brands;
  }


}
