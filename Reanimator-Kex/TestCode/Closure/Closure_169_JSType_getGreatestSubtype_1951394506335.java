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

public class JSType_getGreatestSubtype_1951394506335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50439;
     Object term50452;
     Object term50453;
     Object term50440;

    public JSType_getGreatestSubtype_1951394506335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        term50452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term50452, term50452.getClass(), "alternates", null);
        setIntField(term50452, term50452.getClass(), "hashcode", 0);
        setBooleanField(term50452, term50452.getClass(), "resolved", false);
        setField(term50452, term50452.getClass(), "resolveResult", null);
        setBooleanField(term50452, term50452.getClass(), "inTemplatedCheckVisit", false);
        setField(term50452, term50452.getClass(), "registry", null);
        term50453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term50453, term50453.getClass(), "alternates", null);
        setIntField(term50453, term50453.getClass(), "hashcode", 0);
        setBooleanField(term50453, term50453.getClass(), "resolved", false);
        setField(term50453, term50453.getClass(), "resolveResult", null);
        setBooleanField(term50453, term50453.getClass(), "inTemplatedCheckVisit", false);
        setField(term50453, term50453.getClass(), "registry", null);
        term50440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term50440, term50440.getClass(), "alternates", null);
        setIntField(term50440, term50440.getClass(), "hashcode", 0);
        setBooleanField(term50440, term50440.getClass(), "resolved", false);
        setField(term50440, term50440.getClass(), "resolveResult", null);
        setBooleanField(term50440, term50440.getClass(), "inTemplatedCheckVisit", false);
        setField(term50440, term50440.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term50439;
        args[1] = term50439;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term50439, term50452));
        assertTrue(recursiveEquals(term50439, term50453));
        assertTrue(recursiveEquals(retValue, term50440));
    }

};


