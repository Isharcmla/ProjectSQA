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

public class JSType_filterNoResolvedType_427610386231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28973;
     Object term28984;
     Object term28975;

    public JSType_filterNoResolvedType_427610386231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        term28984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term28984, term28984.getClass(), "primitiveType", null);
        setField(term28984, term28984.getClass(), "primitiveObjectType", null);
        setField(term28984, term28984.getClass(), "name", null);
        setBooleanField(term28984, term28984.getClass(), "visited", false);
        setField(term28984, term28984.getClass(), "docInfo", null);
        setBooleanField(term28984, term28984.getClass(), "unknown", false);
        setBooleanField(term28984, term28984.getClass(), "resolved", false);
        setField(term28984, term28984.getClass(), "resolveResult", null);
        setBooleanField(term28984, term28984.getClass(), "inTemplatedCheckVisit", false);
        setField(term28984, term28984.getClass(), "registry", null);
        term28975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term28975, term28975.getClass(), "primitiveType", null);
        setField(term28975, term28975.getClass(), "primitiveObjectType", null);
        setField(term28975, term28975.getClass(), "name", null);
        setBooleanField(term28975, term28975.getClass(), "visited", false);
        setField(term28975, term28975.getClass(), "docInfo", null);
        setBooleanField(term28975, term28975.getClass(), "unknown", false);
        setBooleanField(term28975, term28975.getClass(), "resolved", false);
        setField(term28975, term28975.getClass(), "resolveResult", null);
        setBooleanField(term28975, term28975.getClass(), "inTemplatedCheckVisit", false);
        setField(term28975, term28975.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term28973;
        Object retValue = callMethod(klass, "filterNoResolvedType", argTypes, null, args);
        assertTrue(recursiveEquals(term28973, term28984));
        assertTrue(recursiveEquals(retValue, term28975));
    }

};


