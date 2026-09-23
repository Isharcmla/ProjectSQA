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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class JSType_isSubtype_437021077363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77798;
     Object term77904;
     Object term78051;
     Object term78053;

    public JSType_isSubtype_437021077363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        term77904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term78010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term78010, term78010.getClass(), "unknown", false);
        setField(term77904, term77904.getClass(), "referencedType", term78010);
        term78051 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term78052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term78052, term78052.getClass(), "primitiveType", null);
        setField(term78052, term78052.getClass(), "primitiveObjectType", null);
        setField(term78052, term78052.getClass(), "name", null);
        setBooleanField(term78052, term78052.getClass(), "visited", false);
        setField(term78052, term78052.getClass(), "docInfo", null);
        setBooleanField(term78052, term78052.getClass(), "unknown", false);
        setBooleanField(term78052, term78052.getClass(), "resolved", false);
        setField(term78052, term78052.getClass(), "resolveResult", null);
        setField(term78052, term78052.getClass(), "registry", null);
        setField(term78051, term78051.getClass(), "referencedType", term78052);
        setBooleanField(term78051, term78051.getClass(), "visited", false);
        setField(term78051, term78051.getClass(), "docInfo", null);
        setBooleanField(term78051, term78051.getClass(), "unknown", false);
        setBooleanField(term78051, term78051.getClass(), "resolved", false);
        setField(term78051, term78051.getClass(), "resolveResult", null);
        setField(term78051, term78051.getClass(), "registry", null);
        term78053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term78053, term78053.getClass(), "resolved", false);
        setField(term78053, term78053.getClass(), "resolveResult", null);
        setField(term78053, term78053.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term77798;
        args[1] = term77904;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term77798, term78051));
        assertTrue(recursiveEquals(term77904, term78053));
        assertTrue(recursiveEquals(retValue, false));
    }

};


