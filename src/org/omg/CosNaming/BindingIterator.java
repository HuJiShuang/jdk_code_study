package org.omg.CosNaming;


/**
* org/omg/CosNaming/BindingIterator.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /scratch/jenkins/workspace/8-2-build-linux-x64/jdk8u361/3183/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Monday, January 9, 2023 8:35:54 AM GMT
*/


/**
   * The BindingIterator interface allows a client to iterate through
   * the bindings using the next_one or next_n operations.
   * 
   * The bindings iterator is obtained by using the <tt>list</tt>
   * method on the <tt>NamingContext</tt>. 
   * @see org.omg.CosNaming.NamingContext#list
   */
public interface BindingIterator extends BindingIteratorOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface BindingIterator
