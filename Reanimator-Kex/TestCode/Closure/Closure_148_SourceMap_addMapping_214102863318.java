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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class SourceMap_addMapping_214102863318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1547;
     Object term1617;
     Object term2512;
     Object term2513;

    public SourceMap_addMapping_214102863318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1547 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        term1617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1617, term1617.getClass(), "propListHead", null);
        term2512 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term2512, term2512.getClass(), "mappings", null);
        setField(term2512, term2512.getClass(), "offsetPosition", null);
        setField(term2512, term2512.getClass(), "prefixPosition", null);
        setField(term2512, term2512.getClass(), "lastSourceFile", null);
        setField(term2512, term2512.getClass(), "lastSourceFileEscaped", null);
        term2513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2513, term2513.getClass(), "type", 0);
        setField(term2513, term2513.getClass(), "next", null);
        setField(term2513, term2513.getClass(), "first", null);
        setField(term2513, term2513.getClass(), "last", null);
        setField(term2513, term2513.getClass(), "propListHead", null);
        setIntField(term2513, term2513.getClass(), "sourcePosition", 0);
        setField(term2513, term2513.getClass(), "jsType", null);
        setField(term2513, term2513.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Position");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Position");
        Object[] args = new Object[3];
        args[0] = term1617;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "addMapping", argTypes, term1547, args);
        assertTrue(recursiveEquals(term1547, term2512));
        assertTrue(recursiveEquals(term1617, term2513));
    }

};


