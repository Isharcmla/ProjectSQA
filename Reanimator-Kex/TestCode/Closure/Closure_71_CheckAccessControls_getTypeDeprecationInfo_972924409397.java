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

public class CheckAccessControls_getTypeDeprecationInfo_972924409397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201119;
     Object term201661;

    public CheckAccessControls_getTypeDeprecationInfo_972924409397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201119 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term201229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term201119, term201119.getClass(), "docInfo", null);
        setField(term201119, term201119.getClass(), "implicitPrototypeFallback", term201229);
        term201661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term201662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term201661, term201661.getClass(), "call", null);
        setField(term201661, term201661.getClass(), "prototype", null);
        setField(term201661, term201661.getClass(), "kind", null);
        setField(term201661, term201661.getClass(), "typeOfThis", null);
        setField(term201661, term201661.getClass(), "source", null);
        setField(term201661, term201661.getClass(), "implementedInterfaces", null);
        setField(term201661, term201661.getClass(), "subTypes", null);
        setField(term201661, term201661.getClass(), "templateTypeName", null);
        setField(term201661, term201661.getClass(), "className", null);
        setField(term201661, term201661.getClass(), "properties", null);
        setBooleanField(term201661, term201661.getClass(), "nativeType", false);
        setField(term201662, term201662.getClass(), "call", null);
        setField(term201662, term201662.getClass(), "prototype", null);
        setField(term201662, term201662.getClass(), "kind", null);
        setField(term201662, term201662.getClass(), "typeOfThis", null);
        setField(term201662, term201662.getClass(), "source", null);
        setField(term201662, term201662.getClass(), "implementedInterfaces", null);
        setField(term201662, term201662.getClass(), "subTypes", null);
        setField(term201662, term201662.getClass(), "templateTypeName", null);
        setField(term201662, term201662.getClass(), "className", null);
        setField(term201662, term201662.getClass(), "properties", null);
        setBooleanField(term201662, term201662.getClass(), "nativeType", false);
        setField(term201662, term201662.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term201662, term201662.getClass(), "prettyPrint", false);
        setBooleanField(term201662, term201662.getClass(), "visited", false);
        setField(term201662, term201662.getClass(), "docInfo", null);
        setBooleanField(term201662, term201662.getClass(), "unknown", false);
        setBooleanField(term201662, term201662.getClass(), "resolved", false);
        setField(term201662, term201662.getClass(), "resolveResult", null);
        setField(term201662, term201662.getClass(), "registry", null);
        setField(term201661, term201661.getClass(), "implicitPrototypeFallback", term201662);
        setBooleanField(term201661, term201661.getClass(), "prettyPrint", false);
        setBooleanField(term201661, term201661.getClass(), "visited", false);
        setField(term201661, term201661.getClass(), "docInfo", null);
        setBooleanField(term201661, term201661.getClass(), "unknown", false);
        setBooleanField(term201661, term201661.getClass(), "resolved", false);
        setField(term201661, term201661.getClass(), "resolveResult", null);
        setField(term201661, term201661.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term201119;
        Object retValue = callMethod(klass, "getTypeDeprecationInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term201119, term201661));
        assertTrue(recursiveEquals(retValue, null));
    }

};


