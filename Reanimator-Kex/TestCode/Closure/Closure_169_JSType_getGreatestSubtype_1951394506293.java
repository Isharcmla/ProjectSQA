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

public class JSType_getGreatestSubtype_1951394506293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39228;
     Object term39240;
     Object term39241;
     Object term39229;

    public JSType_getGreatestSubtype_1951394506293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term39240 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term39240, term39240.getClass(), "resolved", false);
        setField(term39240, term39240.getClass(), "resolveResult", null);
        setBooleanField(term39240, term39240.getClass(), "inTemplatedCheckVisit", false);
        setField(term39240, term39240.getClass(), "registry", null);
        term39241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term39241, term39241.getClass(), "resolved", false);
        setField(term39241, term39241.getClass(), "resolveResult", null);
        setBooleanField(term39241, term39241.getClass(), "inTemplatedCheckVisit", false);
        setField(term39241, term39241.getClass(), "registry", null);
        term39229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term39229, term39229.getClass(), "resolved", false);
        setField(term39229, term39229.getClass(), "resolveResult", null);
        setBooleanField(term39229, term39229.getClass(), "inTemplatedCheckVisit", false);
        setField(term39229, term39229.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term39228;
        args[1] = term39228;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term39228, term39240));
        assertTrue(recursiveEquals(term39228, term39241));
        assertTrue(recursiveEquals(retValue, term39229));
    }

};


