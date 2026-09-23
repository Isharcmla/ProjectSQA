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

public class JSDocInfoBuilder_hasAnySingletonTypeTags_540895192482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174941;
     Object term175204;

    public JSDocInfoBuilder_hasAnySingletonTypeTags_540895192482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174941 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term175021 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term175021, term175021.getClass(), "bitset", -2147483648);
        setField(term174941, term174941.getClass(), "currentInfo", term175021);
        term175204 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term175205 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term175205, term175205.getClass(), "info", null);
        setField(term175205, term175205.getClass(), "documentation", null);
        setField(term175205, term175205.getClass(), "sourceName", null);
        setField(term175205, term175205.getClass(), "visibility", null);
        setIntField(term175205, term175205.getClass(), "bitset", -2147483648);
        setField(term175205, term175205.getClass(), "type", null);
        setField(term175205, term175205.getClass(), "thisType", null);
        setBooleanField(term175205, term175205.getClass(), "includeDocumentation", false);
        setField(term175204, term175204.getClass(), "currentInfo", term175205);
        setBooleanField(term175204, term175204.getClass(), "populated", false);
        setBooleanField(term175204, term175204.getClass(), "parseDocumentation", false);
        setField(term175204, term175204.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnySingletonTypeTags", argTypes, term174941, args);
        assertTrue(recursiveEquals(term174941, term175204));
        assertTrue(recursiveEquals(retValue, true));
    }

};


