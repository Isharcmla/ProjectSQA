package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class CheckAccessControls_getTypeDeprecationInfo_972924409180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49708;
     Object term51091;

    public CheckAccessControls_getTypeDeprecationInfo_972924409180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term49818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term49708, term49708.getClass(), "docInfo", null);
        setField(term49708, term49708.getClass(), "implicitPrototypeFallback", term49818);
        term51091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term51092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term51091, term51091.getClass(), "call", null);
        setField(term51091, term51091.getClass(), "prototype", null);
        setField(term51091, term51091.getClass(), "kind", null);
        setField(term51091, term51091.getClass(), "typeOfThis", null);
        setField(term51091, term51091.getClass(), "source", null);
        setField(term51091, term51091.getClass(), "implementedInterfaces", null);
        setField(term51091, term51091.getClass(), "subTypes", null);
        setField(term51091, term51091.getClass(), "templateTypeName", null);
        setField(term51091, term51091.getClass(), "className", null);
        setField(term51091, term51091.getClass(), "properties", null);
        setBooleanField(term51091, term51091.getClass(), "nativeType", false);
        setField(term51092, term51092.getClass(), "call", null);
        setField(term51092, term51092.getClass(), "prototype", null);
        setField(term51092, term51092.getClass(), "kind", null);
        setField(term51092, term51092.getClass(), "typeOfThis", null);
        setField(term51092, term51092.getClass(), "source", null);
        setField(term51092, term51092.getClass(), "implementedInterfaces", null);
        setField(term51092, term51092.getClass(), "subTypes", null);
        setField(term51092, term51092.getClass(), "templateTypeName", null);
        setField(term51092, term51092.getClass(), "className", null);
        setField(term51092, term51092.getClass(), "properties", null);
        setBooleanField(term51092, term51092.getClass(), "nativeType", false);
        setField(term51092, term51092.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term51092, term51092.getClass(), "prettyPrint", false);
        setBooleanField(term51092, term51092.getClass(), "visited", false);
        setField(term51092, term51092.getClass(), "docInfo", null);
        setBooleanField(term51092, term51092.getClass(), "unknown", false);
        setBooleanField(term51092, term51092.getClass(), "resolved", false);
        setField(term51092, term51092.getClass(), "resolveResult", null);
        setField(term51092, term51092.getClass(), "registry", null);
        setField(term51091, term51091.getClass(), "implicitPrototypeFallback", term51092);
        setBooleanField(term51091, term51091.getClass(), "prettyPrint", false);
        setBooleanField(term51091, term51091.getClass(), "visited", false);
        setField(term51091, term51091.getClass(), "docInfo", null);
        setBooleanField(term51091, term51091.getClass(), "unknown", false);
        setBooleanField(term51091, term51091.getClass(), "resolved", false);
        setField(term51091, term51091.getClass(), "resolveResult", null);
        setField(term51091, term51091.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term49708;
        Object retValue = callMethod(klass, "getTypeDeprecationInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term49708, term51091));
        assertTrue(recursiveEquals(retValue, null));
    }

};


