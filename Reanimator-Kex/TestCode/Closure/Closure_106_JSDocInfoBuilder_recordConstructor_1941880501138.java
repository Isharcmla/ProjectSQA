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

public class JSDocInfoBuilder_recordConstructor_1941880501138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107122;
     Object term107257;

    public JSDocInfoBuilder_recordConstructor_1941880501138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107122 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term107202 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term107202, term107202.getClass(), "bitset", 1073741824);
        setField(term107122, term107122.getClass(), "currentInfo", term107202);
        term107257 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term107258 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term107258, term107258.getClass(), "info", null);
        setField(term107258, term107258.getClass(), "documentation", null);
        setField(term107258, term107258.getClass(), "sourceName", null);
        setField(term107258, term107258.getClass(), "visibility", null);
        setIntField(term107258, term107258.getClass(), "bitset", 1073741826);
        setField(term107258, term107258.getClass(), "type", null);
        setField(term107258, term107258.getClass(), "thisType", null);
        setBooleanField(term107258, term107258.getClass(), "includeDocumentation", false);
        setField(term107257, term107257.getClass(), "currentInfo", term107258);
        setBooleanField(term107257, term107257.getClass(), "populated", true);
        setBooleanField(term107257, term107257.getClass(), "parseDocumentation", false);
        setField(term107257, term107257.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordConstructor", argTypes, term107122, args);
        assertTrue(recursiveEquals(term107122, term107257));
        assertTrue(recursiveEquals(retValue, true));
    }

};


