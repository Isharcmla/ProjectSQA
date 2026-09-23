package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class JSDocInfoBuilder_build_574575553172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111940;
     Object term112078;
     Object term112056;

    public JSDocInfoBuilder_build_574575553172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111940 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term112020 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term111940, term111940.getClass(), "populated", true);
        setField(term111940, term111940.getClass(), "currentInfo", term112020);
        term112078 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term112079 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term112079, term112079.getClass(), "info", null);
        setField(term112079, term112079.getClass(), "documentation", null);
        setField(term112079, term112079.getClass(), "sourceName", null);
        setField(term112079, term112079.getClass(), "visibility", null);
        setIntField(term112079, term112079.getClass(), "bitset", 0);
        setField(term112079, term112079.getClass(), "type", null);
        setField(term112079, term112079.getClass(), "thisType", null);
        setBooleanField(term112079, term112079.getClass(), "includeDocumentation", false);
        setField(term112078, term112078.getClass(), "currentInfo", term112079);
        setBooleanField(term112078, term112078.getClass(), "populated", false);
        setBooleanField(term112078, term112078.getClass(), "parseDocumentation", false);
        setField(term112078, term112078.getClass(), "currentMarker", null);
        Class<? extends Object> term112081 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term112080 = ((Class) term112081).getDeclaredField((String) "INHERITED");
        ((Field) term112080).setAccessible(true);
        Object enum151 = ((Field) term112080).get((Object) null);
        term112056 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term112056, term112056.getClass(), "info", null);
        setField(term112056, term112056.getClass(), "documentation", null);
        setField(term112056, term112056.getClass(), "sourceName", null);
        setField(term112056, term112056.getClass(), "visibility", enum151);
        setIntField(term112056, term112056.getClass(), "bitset", 0);
        setField(term112056, term112056.getClass(), "type", null);
        setField(term112056, term112056.getClass(), "thisType", null);
        setBooleanField(term112056, term112056.getClass(), "includeDocumentation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "build", argTypes, term111940, args);
        assertTrue(recursiveEquals(term111940, term112078));
        assertTrue(recursiveEquals(retValue, term112056));
    }

};


