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

public class JSType_isSubtype_437021077436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110808;
     Object term110914;
     Object term111595;
     Object term111597;

    public JSType_isSubtype_437021077436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        term110914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term111020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term111020, term111020.getClass(), "unknown", false);
        setField(term110914, term110914.getClass(), "referencedType", term111020);
        term111595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term111596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term111596, term111596.getClass(), "primitiveType", null);
        setField(term111596, term111596.getClass(), "primitiveObjectType", null);
        setField(term111596, term111596.getClass(), "name", null);
        setBooleanField(term111596, term111596.getClass(), "visited", false);
        setField(term111596, term111596.getClass(), "docInfo", null);
        setBooleanField(term111596, term111596.getClass(), "unknown", false);
        setBooleanField(term111596, term111596.getClass(), "resolved", false);
        setField(term111596, term111596.getClass(), "resolveResult", null);
        setField(term111596, term111596.getClass(), "registry", null);
        setField(term111595, term111595.getClass(), "referencedType", term111596);
        setBooleanField(term111595, term111595.getClass(), "visited", false);
        setField(term111595, term111595.getClass(), "docInfo", null);
        setBooleanField(term111595, term111595.getClass(), "unknown", false);
        setBooleanField(term111595, term111595.getClass(), "resolved", false);
        setField(term111595, term111595.getClass(), "resolveResult", null);
        setField(term111595, term111595.getClass(), "registry", null);
        term111597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term111597, term111597.getClass(), "className", null);
        setField(term111597, term111597.getClass(), "properties", null);
        setField(term111597, term111597.getClass(), "implicitPrototype", null);
        setBooleanField(term111597, term111597.getClass(), "nativeType", false);
        setBooleanField(term111597, term111597.getClass(), "prettyPrint", false);
        setBooleanField(term111597, term111597.getClass(), "visited", false);
        setField(term111597, term111597.getClass(), "docInfo", null);
        setBooleanField(term111597, term111597.getClass(), "unknown", false);
        setBooleanField(term111597, term111597.getClass(), "resolved", false);
        setField(term111597, term111597.getClass(), "resolveResult", null);
        setField(term111597, term111597.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term110808;
        args[1] = term110914;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term110808, term111595));
        assertTrue(recursiveEquals(term110914, term111597));
        assertTrue(recursiveEquals(retValue, false));
    }

};


