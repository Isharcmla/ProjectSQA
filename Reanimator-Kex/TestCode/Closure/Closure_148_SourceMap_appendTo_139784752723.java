package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class SourceMap_appendTo_139784752723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2969;
     Object term3159;

    public SourceMap_appendTo_139784752723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3021 = new ArrayList();
        term2969 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term3101 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term2969, term2969.getClass(), "mappings", term3021);
        setIntField(term3101, term3101.getClass(), "lineNumber", 0);
        setField(term2969, term2969.getClass(), "prefixPosition", term3101);
        term3159 = newInstance(Class.forName("java.io.OutputStreamWriter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3159;
        args[1] = null;
        try {
            callMethod(klass, "appendTo", argTypes, term2969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


