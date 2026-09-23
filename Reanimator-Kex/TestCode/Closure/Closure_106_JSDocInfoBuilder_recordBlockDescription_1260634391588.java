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

public class JSDocInfoBuilder_recordBlockDescription_1260634391588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207924;
     Object term208025;

    public JSDocInfoBuilder_recordBlockDescription_1260634391588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207924 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term208004 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term207924, term207924.getClass(), "parseDocumentation", false);
        setField(term207924, term207924.getClass(), "currentInfo", term208004);
        term208025 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term208026 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term208026, term208026.getClass(), "info", null);
        setField(term208026, term208026.getClass(), "documentation", null);
        setField(term208026, term208026.getClass(), "sourceName", null);
        setField(term208026, term208026.getClass(), "visibility", null);
        setIntField(term208026, term208026.getClass(), "bitset", 0);
        setField(term208026, term208026.getClass(), "type", null);
        setField(term208026, term208026.getClass(), "thisType", null);
        setBooleanField(term208026, term208026.getClass(), "includeDocumentation", false);
        setField(term208025, term208025.getClass(), "currentInfo", term208026);
        setBooleanField(term208025, term208025.getClass(), "populated", false);
        setBooleanField(term208025, term208025.getClass(), "parseDocumentation", false);
        setField(term208025, term208025.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "recordBlockDescription", argTypes, term207924, args);
        assertTrue(recursiveEquals(term207924, term208025));
    }

};


