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

public class JSDocInfoBuilder_markText_1612155383478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174318;
     Object term174346;

    public JSDocInfoBuilder_markText_1612155383478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174318 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(term174318, term174318.getClass(), "currentMarker", null);
        term174346 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(term174346, term174346.getClass(), "currentInfo", null);
        setBooleanField(term174346, term174346.getClass(), "populated", false);
        setBooleanField(term174346, term174346.getClass(), "parseDocumentation", false);
        setField(term174346, term174346.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        callMethod(klass, "markText", argTypes, term174318, args);
        assertTrue(recursiveEquals(term174318, term174346));
    }

};


