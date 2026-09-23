package com.google.javascript.rhino.jstype;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_getLeastSupertype_41885088694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11027;

    public FunctionType_getLeastSupertype_41885088694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43132 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term43131 = ((Class) term43132).getDeclaredField((String) "INTERFACE");
        ((Field) term43131).setAccessible(true);
        Object enum110 = ((Field) term43131).get((Object) null);
        term11027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term11058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term11029, term11029.getClass(), "type", -2003192918);
        setIntField(term11031, term11031.getClass(), "type", -2013924238);
        setIntField(term11033, term11033.getClass(), "type", 0);
        setField(term11033, term11033.getClass(), "next", null);
        setField(term11033, term11033.getClass(), "first", null);
        setField(term11033, term11033.getClass(), "last", null);
        setField(term11033, term11033.getClass(), "propListHead", null);
        setIntField(term11033, term11033.getClass(), "sourcePosition", 0);
        setField(term11033, term11033.getClass(), "jsType", null);
        setField(term11033, term11033.getClass(), "parent", null);
        setField(term11031, term11031.getClass(), "next", term11033);
        setIntField(term11036, term11036.getClass(), "type", 0);
        setField(term11036, term11036.getClass(), "next", null);
        setField(term11036, term11036.getClass(), "first", null);
        setField(term11036, term11036.getClass(), "last", null);
        setField(term11036, term11036.getClass(), "propListHead", null);
        setIntField(term11036, term11036.getClass(), "sourcePosition", 0);
        setField(term11036, term11036.getClass(), "jsType", null);
        setField(term11036, term11036.getClass(), "parent", null);
        setField(term11031, term11031.getClass(), "first", term11036);
        setIntField(term11039, term11039.getClass(), "type", 0);
        setField(term11039, term11039.getClass(), "next", null);
        setField(term11039, term11039.getClass(), "first", null);
        setField(term11039, term11039.getClass(), "last", null);
        setField(term11039, term11039.getClass(), "propListHead", null);
        setIntField(term11039, term11039.getClass(), "sourcePosition", 0);
        setField(term11039, term11039.getClass(), "jsType", null);
        setField(term11039, term11039.getClass(), "parent", null);
        setField(term11031, term11031.getClass(), "last", term11039);
        setField(term11031, term11031.getClass(), "propListHead", null);
        setIntField(term11031, term11031.getClass(), "sourcePosition", 0);
        setField(term11031, term11031.getClass(), "jsType", null);
        setField(term11031, term11031.getClass(), "parent", null);
        setField(term11029, term11029.getClass(), "next", term11031);
        setIntField(term11043, term11043.getClass(), "type", 0);
        setField(term11043, term11043.getClass(), "next", null);
        setField(term11043, term11043.getClass(), "first", null);
        setField(term11043, term11043.getClass(), "last", null);
        setField(term11043, term11043.getClass(), "propListHead", null);
        setIntField(term11043, term11043.getClass(), "sourcePosition", 0);
        setField(term11043, term11043.getClass(), "jsType", null);
        setField(term11043, term11043.getClass(), "parent", null);
        setField(term11029, term11029.getClass(), "first", term11043);
        setIntField(term11046, term11046.getClass(), "type", 0);
        setField(term11046, term11046.getClass(), "next", null);
        setField(term11046, term11046.getClass(), "first", null);
        setField(term11046, term11046.getClass(), "last", null);
        setField(term11046, term11046.getClass(), "propListHead", null);
        setIntField(term11046, term11046.getClass(), "sourcePosition", 0);
        setField(term11046, term11046.getClass(), "jsType", null);
        setField(term11046, term11046.getClass(), "parent", null);
        setField(term11029, term11029.getClass(), "last", term11046);
        setField(term11029, term11029.getClass(), "propListHead", null);
        setIntField(term11029, term11029.getClass(), "sourcePosition", 0);
        setField(term11029, term11029.getClass(), "jsType", null);
        setField(term11029, term11029.getClass(), "parent", null);
        setField(term11028, term11028.getClass(), "parameters", term11029);
        setField(term11028, term11028.getClass(), "returnType", null);
        setBooleanField(term11028, term11028.getClass(), "returnTypeInferred", false);
        setBooleanField(term11028, term11028.getClass(), "resolved", false);
        setField(term11028, term11028.getClass(), "resolveResult", null);
        setField(term11028, term11028.getClass(), "registry", null);
        setField(term11027, term11027.getClass(), "call", term11028);
        setField(term11052, term11052.getClass(), "className", null);
        setField(term11052, term11052.getClass(), "properties", null);
        setBooleanField(term11052, term11052.getClass(), "nativeType", false);
        setField(term11052, term11052.getClass(), "implicitPrototypeFallback", null);
        setField(term11052, term11052.getClass(), "ownerFunction", null);
        setBooleanField(term11052, term11052.getClass(), "prettyPrint", false);
        setBooleanField(term11052, term11052.getClass(), "visited", false);
        setField(term11052, term11052.getClass(), "docInfo", null);
        setBooleanField(term11052, term11052.getClass(), "unknown", false);
        setBooleanField(term11052, term11052.getClass(), "resolved", false);
        setField(term11052, term11052.getClass(), "resolveResult", null);
        setField(term11052, term11052.getClass(), "registry", null);
        setField(term11027, term11027.getClass(), "prototype", term11052);
        setField(term11058, term11058.getClass(), "name", null);
        setField(term11058, term11058.getClass(), "type", null);
        setBooleanField(term11058, term11058.getClass(), "inferred", false);
        setField(term11027, term11027.getClass(), "prototypeSlot", term11058);
        setField(term11027, term11027.getClass(), "kind", enum110);
        setField(term11027, term11027.getClass(), "typeOfThis", null);
        setField(term11027, term11027.getClass(), "source", null);
        setField(term11027, term11027.getClass(), "implementedInterfaces", null);
        setField(term11027, term11027.getClass(), "extendedInterfaces", null);
        setField(term11027, term11027.getClass(), "subTypes", null);
        setField(term11027, term11027.getClass(), "templateTypeName", null);
        setField(term11027, term11027.getClass(), "className", null);
        setField(term11027, term11027.getClass(), "properties", null);
        setBooleanField(term11027, term11027.getClass(), "nativeType", false);
        setField(term11027, term11027.getClass(), "implicitPrototypeFallback", null);
        setField(term11027, term11027.getClass(), "ownerFunction", null);
        setBooleanField(term11027, term11027.getClass(), "prettyPrint", false);
        setBooleanField(term11027, term11027.getClass(), "visited", false);
        setField(term11027, term11027.getClass(), "docInfo", null);
        setBooleanField(term11027, term11027.getClass(), "unknown", false);
        setBooleanField(term11027, term11027.getClass(), "resolved", false);
        setField(term11027, term11027.getClass(), "resolveResult", null);
        setField(term11027, term11027.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term11027, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


