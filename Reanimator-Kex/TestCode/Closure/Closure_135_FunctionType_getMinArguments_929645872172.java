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

public class FunctionType_getMinArguments_929645872172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78438;
     Object term79065;

    public FunctionType_getMinArguments_929645872172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term79065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term79065, term79065.getClass(), "this$0", null);
        setField(term79065, term79065.getClass(), "call", null);
        setField(term79065, term79065.getClass(), "prototype", null);
        setField(term79065, term79065.getClass(), "kind", null);
        setField(term79065, term79065.getClass(), "typeOfThis", null);
        setField(term79065, term79065.getClass(), "source", null);
        setField(term79065, term79065.getClass(), "implementedInterfaces", null);
        setField(term79065, term79065.getClass(), "subTypes", null);
        setField(term79065, term79065.getClass(), "templateTypeName", null);
        setField(term79065, term79065.getClass(), "className", null);
        setField(term79065, term79065.getClass(), "properties", null);
        setField(term79065, term79065.getClass(), "implicitPrototype", null);
        setBooleanField(term79065, term79065.getClass(), "nativeType", false);
        setBooleanField(term79065, term79065.getClass(), "visited", false);
        setField(term79065, term79065.getClass(), "docInfo", null);
        setBooleanField(term79065, term79065.getClass(), "unknown", false);
        setBooleanField(term79065, term79065.getClass(), "resolved", false);
        setField(term79065, term79065.getClass(), "resolveResult", null);
        setField(term79065, term79065.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinArguments", argTypes, term78438, args);
        assertTrue(recursiveEquals(term78438, term79065));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


