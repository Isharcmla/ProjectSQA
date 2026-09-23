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

public class JSDocInfoBuilder_recordConstructor_1941880501246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124249;
     Object term124380;

    public JSDocInfoBuilder_recordConstructor_1941880501246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124249 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term124329 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term124329, term124329.getClass(), "bitset", 512);
        setField(term124249, term124249.getClass(), "currentInfo", term124329);
        term124380 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term124381 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term124381, term124381.getClass(), "info", null);
        setField(term124381, term124381.getClass(), "documentation", null);
        setField(term124381, term124381.getClass(), "sourceName", null);
        setField(term124381, term124381.getClass(), "visibility", null);
        setIntField(term124381, term124381.getClass(), "bitset", 512);
        setField(term124381, term124381.getClass(), "type", null);
        setField(term124381, term124381.getClass(), "thisType", null);
        setBooleanField(term124381, term124381.getClass(), "includeDocumentation", false);
        setField(term124380, term124380.getClass(), "currentInfo", term124381);
        setBooleanField(term124380, term124380.getClass(), "populated", false);
        setBooleanField(term124380, term124380.getClass(), "parseDocumentation", false);
        setField(term124380, term124380.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordConstructor", argTypes, term124249, args);
        assertTrue(recursiveEquals(term124249, term124380));
        assertTrue(recursiveEquals(retValue, false));
    }

};


