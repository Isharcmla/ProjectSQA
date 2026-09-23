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

public class JSDocInfoBuilder_recordOverride_1744167415120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104481;
     Object term104604;

    public JSDocInfoBuilder_recordOverride_1744167415120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104481 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term104561 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term104561, term104561.getClass(), "bitset", 64);
        setField(term104481, term104481.getClass(), "currentInfo", term104561);
        term104604 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term104605 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term104605, term104605.getClass(), "info", null);
        setField(term104605, term104605.getClass(), "documentation", null);
        setField(term104605, term104605.getClass(), "sourceName", null);
        setField(term104605, term104605.getClass(), "visibility", null);
        setIntField(term104605, term104605.getClass(), "bitset", 64);
        setField(term104605, term104605.getClass(), "type", null);
        setField(term104605, term104605.getClass(), "thisType", null);
        setBooleanField(term104605, term104605.getClass(), "includeDocumentation", false);
        setField(term104604, term104604.getClass(), "currentInfo", term104605);
        setBooleanField(term104604, term104604.getClass(), "populated", false);
        setBooleanField(term104604, term104604.getClass(), "parseDocumentation", false);
        setField(term104604, term104604.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordOverride", argTypes, term104481, args);
        assertTrue(recursiveEquals(term104481, term104604));
        assertTrue(recursiveEquals(retValue, false));
    }

};


