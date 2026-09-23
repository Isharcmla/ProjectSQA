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

public class JSDocInfoBuilder_build_574575553400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156161;
     Object term156739;
     Object term156718;

    public JSDocInfoBuilder_build_574575553400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term156744 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term156743 = ((Class) term156744).getDeclaredField((String) "PUBLIC");
        ((Field) term156743).setAccessible(true);
        Object enum156 = ((Field) term156743).get((Object) null);
        term156161 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term156241 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term156161, term156161.getClass(), "populated", true);
        setField(term156241, term156241.getClass(), "sourceName", null);
        setField(term156241, term156241.getClass(), "visibility", enum156);
        setField(term156161, term156161.getClass(), "currentInfo", term156241);
        term156739 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term156740 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term156740, term156740.getClass(), "info", null);
        setField(term156740, term156740.getClass(), "documentation", null);
        setField(term156740, term156740.getClass(), "sourceName", null);
        setField(term156740, term156740.getClass(), "visibility", null);
        setIntField(term156740, term156740.getClass(), "bitset", 0);
        setField(term156740, term156740.getClass(), "type", null);
        setField(term156740, term156740.getClass(), "thisType", null);
        setBooleanField(term156740, term156740.getClass(), "includeDocumentation", false);
        setField(term156739, term156739.getClass(), "currentInfo", term156740);
        setBooleanField(term156739, term156739.getClass(), "populated", false);
        setBooleanField(term156739, term156739.getClass(), "parseDocumentation", false);
        setField(term156739, term156739.getClass(), "currentMarker", null);
        Class<? extends Object> term157009 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term157008 = ((Class) term157009).getDeclaredField((String) "PUBLIC");
        ((Field) term157008).setAccessible(true);
        Object enum157 = ((Field) term157008).get((Object) null);
        term156718 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term156718, term156718.getClass(), "info", null);
        setField(term156718, term156718.getClass(), "documentation", null);
        setField(term156718, term156718.getClass(), "sourceName", "");
        setField(term156718, term156718.getClass(), "visibility", enum157);
        setIntField(term156718, term156718.getClass(), "bitset", 0);
        setField(term156718, term156718.getClass(), "type", null);
        setField(term156718, term156718.getClass(), "thisType", null);
        setBooleanField(term156718, term156718.getClass(), "includeDocumentation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "build", argTypes, term156161, args);
        assertTrue(recursiveEquals(term156161, term156739));
        assertTrue(recursiveEquals(retValue, term156718));
    }

};


