package org.omg.IOP.CodecPackage;


/**
* org/omg/IOP/CodecPackage/TypeMismatch.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /scratch/jenkins/workspace/8-2-build-linux-x64/jdk8u361/3183/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Monday, January 9, 2023 8:35:54 AM GMT
*/

public final class TypeMismatch extends org.omg.CORBA.UserException
{

  public TypeMismatch ()
  {
    super(TypeMismatchHelper.id());
  } // ctor


  public TypeMismatch (String $reason)
  {
    super(TypeMismatchHelper.id() + "  " + $reason);
  } // ctor

} // class TypeMismatch
