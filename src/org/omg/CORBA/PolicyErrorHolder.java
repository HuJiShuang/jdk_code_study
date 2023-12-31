package org.omg.CORBA;

/**
* org/omg/CORBA/PolicyErrorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /scratch/jenkins/workspace/8-2-build-linux-x64/jdk8u361/3183/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Monday, January 9, 2023 8:35:54 AM GMT
*/


/**
   * Thrown to indicate problems with parameter values passed to the
   * <code>ORB.create_policy</code> operation.  
   */
public final class PolicyErrorHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.PolicyError value = null;

  public PolicyErrorHolder ()
  {
  }

  public PolicyErrorHolder (org.omg.CORBA.PolicyError initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.PolicyErrorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.PolicyErrorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.PolicyErrorHelper.type ();
  }

}
