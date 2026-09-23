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

public class JSType_toMaybeParameterizedType_2105210159248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30959;
     Object term31091;

    public JSType_toMaybeParameterizedType_2105210159248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term31091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term31091, term31091.getClass(), "isChecked", false);
        setBooleanField(term31091, term31091.getClass(), "visited", false);
        setField(term31091, term31091.getClass(), "docInfo", null);
        setBooleanField(term31091, term31091.getClass(), "unknown", false);
        setBooleanField(term31091, term31091.getClass(), "resolved", false);
        setField(term31091, term31091.getClass(), "resolveResult", null);
        setBooleanField(term31091, term31091.getClass(), "inTemplatedCheckVisit", false);
        setField(term31091, term31091.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term30959;
        Object retValue = callMethod(klass, "toMaybeParameterizedType", argTypes, null, args);
        assertTrue(recursiveEquals(term30959, term31091));
        assertTrue(recursiveEquals(retValue, null));
    }

};


