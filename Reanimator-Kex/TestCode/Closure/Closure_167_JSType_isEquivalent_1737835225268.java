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

public class JSType_isEquivalent_1737835225268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34401;
     Object term34493;
     Object term35739;
     Object term35740;

    public JSType_isEquivalent_1737835225268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        term34493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        term35739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term35739, term35739.getClass(), "source", null);
        setField(term35739, term35739.getClass(), "elementsType", null);
        setField(term35739, term35739.getClass(), "elements", null);
        setField(term35739, term35739.getClass(), "className", null);
        setField(term35739, term35739.getClass(), "properties", null);
        setBooleanField(term35739, term35739.getClass(), "nativeType", false);
        setField(term35739, term35739.getClass(), "implicitPrototypeFallback", null);
        setField(term35739, term35739.getClass(), "ownerFunction", null);
        setBooleanField(term35739, term35739.getClass(), "prettyPrint", false);
        setBooleanField(term35739, term35739.getClass(), "visited", false);
        setField(term35739, term35739.getClass(), "docInfo", null);
        setBooleanField(term35739, term35739.getClass(), "unknown", false);
        setBooleanField(term35739, term35739.getClass(), "resolved", false);
        setField(term35739, term35739.getClass(), "resolveResult", null);
        setBooleanField(term35739, term35739.getClass(), "inTemplatedCheckVisit", false);
        setField(term35739, term35739.getClass(), "registry", null);
        term35740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term35740, term35740.getClass(), "source", null);
        setField(term35740, term35740.getClass(), "elementsType", null);
        setField(term35740, term35740.getClass(), "elements", null);
        setField(term35740, term35740.getClass(), "className", null);
        setField(term35740, term35740.getClass(), "properties", null);
        setBooleanField(term35740, term35740.getClass(), "nativeType", false);
        setField(term35740, term35740.getClass(), "implicitPrototypeFallback", null);
        setField(term35740, term35740.getClass(), "ownerFunction", null);
        setBooleanField(term35740, term35740.getClass(), "prettyPrint", false);
        setBooleanField(term35740, term35740.getClass(), "visited", false);
        setField(term35740, term35740.getClass(), "docInfo", null);
        setBooleanField(term35740, term35740.getClass(), "unknown", false);
        setBooleanField(term35740, term35740.getClass(), "resolved", false);
        setField(term35740, term35740.getClass(), "resolveResult", null);
        setBooleanField(term35740, term35740.getClass(), "inTemplatedCheckVisit", false);
        setField(term35740, term35740.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term34401;
        args[1] = term34493;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term34401, term35739));
        assertTrue(recursiveEquals(term34493, term35740));
        assertTrue(recursiveEquals(retValue, false));
    }

};


