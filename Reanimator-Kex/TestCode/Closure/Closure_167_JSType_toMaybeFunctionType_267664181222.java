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

public class JSType_toMaybeFunctionType_267664181222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27733;
     Object term27840;

    public JSType_toMaybeFunctionType_267664181222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        term27840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term27840, term27840.getClass(), "primitiveType", null);
        setField(term27840, term27840.getClass(), "primitiveObjectType", null);
        setField(term27840, term27840.getClass(), "name", null);
        setBooleanField(term27840, term27840.getClass(), "visited", false);
        setField(term27840, term27840.getClass(), "docInfo", null);
        setBooleanField(term27840, term27840.getClass(), "unknown", false);
        setBooleanField(term27840, term27840.getClass(), "resolved", false);
        setField(term27840, term27840.getClass(), "resolveResult", null);
        setBooleanField(term27840, term27840.getClass(), "inTemplatedCheckVisit", false);
        setField(term27840, term27840.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term27733;
        Object retValue = callMethod(klass, "toMaybeFunctionType", argTypes, null, args);
        assertTrue(recursiveEquals(term27733, term27840));
        assertTrue(recursiveEquals(retValue, null));
    }

};


