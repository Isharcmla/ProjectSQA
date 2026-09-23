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

public class JSDocInfoBuilder_recordDeprecated_1692631536174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112462;
     Object term112558;

    public JSDocInfoBuilder_recordDeprecated_1692631536174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112462 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term112542 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term112542, term112542.getClass(), "bitset", 256);
        setField(term112462, term112462.getClass(), "currentInfo", term112542);
        term112558 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term112559 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term112559, term112559.getClass(), "info", null);
        setField(term112559, term112559.getClass(), "documentation", null);
        setField(term112559, term112559.getClass(), "sourceName", null);
        setField(term112559, term112559.getClass(), "visibility", null);
        setIntField(term112559, term112559.getClass(), "bitset", 256);
        setField(term112559, term112559.getClass(), "type", null);
        setField(term112559, term112559.getClass(), "thisType", null);
        setBooleanField(term112559, term112559.getClass(), "includeDocumentation", false);
        setField(term112558, term112558.getClass(), "currentInfo", term112559);
        setBooleanField(term112558, term112558.getClass(), "populated", false);
        setBooleanField(term112558, term112558.getClass(), "parseDocumentation", false);
        setField(term112558, term112558.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordDeprecated", argTypes, term112462, args);
        assertTrue(recursiveEquals(term112462, term112558));
        assertTrue(recursiveEquals(retValue, false));
    }

};


