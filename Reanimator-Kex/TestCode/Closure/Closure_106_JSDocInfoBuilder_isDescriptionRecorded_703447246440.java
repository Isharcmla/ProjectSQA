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

public class JSDocInfoBuilder_isDescriptionRecorded_703447246440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165853;
     Object term165946;

    public JSDocInfoBuilder_isDescriptionRecorded_703447246440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165853 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term165933 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term165933, term165933.getClass(), "info", null);
        setField(term165853, term165853.getClass(), "currentInfo", term165933);
        term165946 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term165947 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term165947, term165947.getClass(), "info", null);
        setField(term165947, term165947.getClass(), "documentation", null);
        setField(term165947, term165947.getClass(), "sourceName", null);
        setField(term165947, term165947.getClass(), "visibility", null);
        setIntField(term165947, term165947.getClass(), "bitset", 0);
        setField(term165947, term165947.getClass(), "type", null);
        setField(term165947, term165947.getClass(), "thisType", null);
        setBooleanField(term165947, term165947.getClass(), "includeDocumentation", false);
        setField(term165946, term165946.getClass(), "currentInfo", term165947);
        setBooleanField(term165946, term165946.getClass(), "populated", false);
        setBooleanField(term165946, term165946.getClass(), "parseDocumentation", false);
        setField(term165946, term165946.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isDescriptionRecorded", argTypes, term165853, args);
        assertTrue(recursiveEquals(term165853, term165946));
        assertTrue(recursiveEquals(retValue, false));
    }

};


