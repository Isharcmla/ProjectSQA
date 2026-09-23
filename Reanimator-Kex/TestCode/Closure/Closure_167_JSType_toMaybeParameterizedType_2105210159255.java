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

public class JSType_toMaybeParameterizedType_2105210159255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31781;
     Object term32412;

    public JSType_toMaybeParameterizedType_2105210159255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        term32412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term32412, term32412.getClass(), "source", null);
        setField(term32412, term32412.getClass(), "elementsType", null);
        setField(term32412, term32412.getClass(), "elements", null);
        setField(term32412, term32412.getClass(), "className", null);
        setField(term32412, term32412.getClass(), "properties", null);
        setBooleanField(term32412, term32412.getClass(), "nativeType", false);
        setField(term32412, term32412.getClass(), "implicitPrototypeFallback", null);
        setField(term32412, term32412.getClass(), "ownerFunction", null);
        setBooleanField(term32412, term32412.getClass(), "prettyPrint", false);
        setBooleanField(term32412, term32412.getClass(), "visited", false);
        setField(term32412, term32412.getClass(), "docInfo", null);
        setBooleanField(term32412, term32412.getClass(), "unknown", false);
        setBooleanField(term32412, term32412.getClass(), "resolved", false);
        setField(term32412, term32412.getClass(), "resolveResult", null);
        setBooleanField(term32412, term32412.getClass(), "inTemplatedCheckVisit", false);
        setField(term32412, term32412.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term31781;
        Object retValue = callMethod(klass, "toMaybeParameterizedType", argTypes, null, args);
        assertTrue(recursiveEquals(term31781, term32412));
        assertTrue(recursiveEquals(retValue, null));
    }

};


