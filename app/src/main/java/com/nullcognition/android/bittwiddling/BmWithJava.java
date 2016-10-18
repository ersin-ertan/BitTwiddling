package com.nullcognition.android.bittwiddling;

/**
 * Created by mms on 10/18/16.
 */

public class BmWithJava {

  // understand the way data is stored in computer hardware

  void endianness(){
    /**
     * the byte and bit ordering used in the storage and use of data, important for integer values
     * and network transmissions
     * **/
  }

  void bigEndian(){
    /**
     * big end first for higgest order byte stored in the lowest address, or highest order bit and
     * byte are first to be transmitted
     * **/
  }
  void littleEndian(){
    /**
     * little end first, for lowest order byte stored in lowest address or lowest order bit and byte are first to be transmitted**/
  }

  void lessCommonEndian(){
    /**
     * Mixed or middle endian where the bytes of a 32 bit woerd are stored as 2nd, 1st, 4th then 3rd.
     * byte values are unchanged by endianness but bits are conventionally addressed in same order
     * as their byte endianess
     *
     * Big endian byte addr   0           1         2         3
     * bit offset           01234567  01234567  01234567  01234567
     * binary               00001010  00001011  00001100  00001101
     * hex                    0A          0B        0C      0D
     *
     * little endian byte addr      3         2         1        0
     * bit offset               76543210  76543210  76543210  76543210
     * binary                   00001010  00001011  00001100  00001101
     * hex                        0A          0B        0C      0D
     *
     * Endianess is usually perscribed by hardware, or by applicative protocol. If choice is arbitrary,
     * little endian is convention to be matching increasing address with increasing significance.
     *
     * Effects cpu, memory busses, expansions cards and files, little endian is jvm. Ethernet cards are big endian,
     * PCI bus is little endian, TCP/IP is big endian
     *
     * GIF are little endian, jpeg are bigendian
     * **/
  }

  void significance(){
    /** the order of symbol in the place value notation that we use to represent numbers, convention
     * is most significant symbols to the left, this is high order and right hand is low order.
     **/
  }

  void bitWiseOperators(){}
}
