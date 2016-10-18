package com.nullcognition.android.bittwiddling;

/**
 * Created by mms on 10/18/16.
 * Java bit manipulation
 */

public class DataDisk {

  // & bitwise AND set to one if corresponding and this are 1 so: 1 1 = 1
  // | bitwise inclusive OR sets bit to 1 if any of the bit are1 so: 10, 01, 11 = 1
  // ^ bitwise exclusive OR sets the bit to 1 if only exactly one bit is one so: 10, 01 = 1
  // << left shifts the bits from right to left by x with left fill 0 so: 01001 << 2 = 00100
  // >> right shift with sign extension, filling 1 if negative 0 if positive so: -4 >> 2 ... to be determined
  // >>> right shift with 0 extension, filling both negative and positive numbers with 0
  // ~ ones compliment, all 0's are set to 1 and all 1's are set to 0 so: 110011 ~ = 001100
}
