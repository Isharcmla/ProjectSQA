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

public class CheckAccessControls_getTypeDeprecationInfo_972924409367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112225;
     Object term191189;

    public CheckAccessControls_getTypeDeprecationInfo_972924409367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term112335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term112225, term112225.getClass(), "docInfo", null);
        setField(term112225, term112225.getClass(), "implicitPrototypeFallback", term112335);
        term191189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term191190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term191189, term191189.getClass(), "call", null);
        setField(term191189, term191189.getClass(), "prototype", null);
        setField(term191189, term191189.getClass(), "kind", null);
        setField(term191189, term191189.getClass(), "typeOfThis", null);
        setField(term191189, term191189.getClass(), "source", null);
        setField(term191189, term191189.getClass(), "implementedInterfaces", null);
        setField(term191189, term191189.getClass(), "subTypes", null);
        setField(term191189, term191189.getClass(), "templateTypeName", null);
        setField(term191189, term191189.getClass(), "className", null);
        setField(term191189, term191189.getClass(), "properties", null);
        setBooleanField(term191189, term191189.getClass(), "nativeType", false);
        setField(term191190, term191190.getClass(), "call", null);
        setField(term191190, term191190.getClass(), "prototype", null);
        setField(term191190, term191190.getClass(), "kind", null);
        setField(term191190, term191190.getClass(), "typeOfThis", null);
        setField(term191190, term191190.getClass(), "source", null);
        setField(term191190, term191190.getClass(), "implementedInterfaces", null);
        setField(term191190, term191190.getClass(), "subTypes", null);
        setField(term191190, term191190.getClass(), "templateTypeName", null);
        setField(term191190, term191190.getClass(), "className", null);
        setField(term191190, term191190.getClass(), "properties", null);
        setBooleanField(term191190, term191190.getClass(), "nativeType", false);
        setField(term191190, term191190.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term191190, term191190.getClass(), "prettyPrint", false);
        setBooleanField(term191190, term191190.getClass(), "visited", false);
        setField(term191190, term191190.getClass(), "docInfo", null);
        setBooleanField(term191190, term191190.getClass(), "unknown", false);
        setBooleanField(term191190, term191190.getClass(), "resolved", false);
        setField(term191190, term191190.getClass(), "resolveResult", null);
        setField(term191190, term191190.getClass(), "registry", null);
        setField(term191189, term191189.getClass(), "implicitPrototypeFallback", term191190);
        setBooleanField(term191189, term191189.getClass(), "prettyPrint", false);
        setBooleanField(term191189, term191189.getClass(), "visited", false);
        setField(term191189, term191189.getClass(), "docInfo", null);
        setBooleanField(term191189, term191189.getClass(), "unknown", false);
        setBooleanField(term191189, term191189.getClass(), "resolved", false);
        setField(term191189, term191189.getClass(), "resolveResult", null);
        setField(term191189, term191189.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term112225;
        Object retValue = callMethod(klass, "getTypeDeprecationInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term112225, term191189));
        assertTrue(recursiveEquals(retValue, null));
    }

};


