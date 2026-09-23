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

public class JSDocInfoBuilder_addReference_1701348467178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113058;
     Object term113154;

    public JSDocInfoBuilder_addReference_1701348467178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113058 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term113138 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term113138, term113138.getClass(), "includeDocumentation", false);
        setField(term113058, term113058.getClass(), "currentInfo", term113138);
        term113154 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term113155 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term113155, term113155.getClass(), "info", null);
        setField(term113155, term113155.getClass(), "documentation", null);
        setField(term113155, term113155.getClass(), "sourceName", null);
        setField(term113155, term113155.getClass(), "visibility", null);
        setIntField(term113155, term113155.getClass(), "bitset", 0);
        setField(term113155, term113155.getClass(), "type", null);
        setField(term113155, term113155.getClass(), "thisType", null);
        setBooleanField(term113155, term113155.getClass(), "includeDocumentation", false);
        setField(term113154, term113154.getClass(), "currentInfo", term113155);
        setBooleanField(term113154, term113154.getClass(), "populated", true);
        setBooleanField(term113154, term113154.getClass(), "parseDocumentation", false);
        setField(term113154, term113154.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "addReference", argTypes, term113058, args);
        assertTrue(recursiveEquals(term113058, term113154));
        assertTrue(recursiveEquals(retValue, true));
    }

};


