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

public class JSType_getGreatestSubtype_1951394506295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39349;
     Object term39441;
     Object term39518;
     Object term39519;
     Object term39450;

    public JSType_getGreatestSubtype_1951394506295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term39441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term39518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term39518, term39518.getClass(), "resolved", false);
        setField(term39518, term39518.getClass(), "resolveResult", null);
        setBooleanField(term39518, term39518.getClass(), "inTemplatedCheckVisit", false);
        setField(term39518, term39518.getClass(), "registry", null);
        term39519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term39519, term39519.getClass(), "resolved", false);
        setField(term39519, term39519.getClass(), "resolveResult", null);
        setBooleanField(term39519, term39519.getClass(), "inTemplatedCheckVisit", false);
        setField(term39519, term39519.getClass(), "registry", null);
        term39450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term39450, term39450.getClass(), "resolved", false);
        setField(term39450, term39450.getClass(), "resolveResult", null);
        setBooleanField(term39450, term39450.getClass(), "inTemplatedCheckVisit", false);
        setField(term39450, term39450.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term39349;
        args[1] = term39441;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term39349, term39518));
        assertTrue(recursiveEquals(term39441, term39519));
        assertTrue(recursiveEquals(retValue, term39450));
    }

};


