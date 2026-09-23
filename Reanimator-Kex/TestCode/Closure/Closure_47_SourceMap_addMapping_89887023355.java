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

public class SourceMap_addMapping_89887023355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99807;
     Object term99899;
     Object term99910;
     Object term99911;

    public SourceMap_addMapping_89887023355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99807 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        term99899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term99910 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term99910, term99910.getClass(), "generator", null);
        setField(term99910, term99910.getClass(), "prefixMappings", null);
        setField(term99910, term99910.getClass(), "sourceLocationFixupCache", null);
        term99911 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term99911, term99911.getClass(), "str", null);
        setIntField(term99911, term99911.getClass(), "type", 0);
        setField(term99911, term99911.getClass(), "next", null);
        setField(term99911, term99911.getClass(), "first", null);
        setField(term99911, term99911.getClass(), "last", null);
        setField(term99911, term99911.getClass(), "propListHead", null);
        setIntField(term99911, term99911.getClass(), "sourcePosition", 0);
        setField(term99911, term99911.getClass(), "jsType", null);
        setField(term99911, term99911.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.debugging.sourcemap.FilePosition");
        argTypes[2] = Class.forName("com.google.debugging.sourcemap.FilePosition");
        Object[] args = new Object[3];
        args[0] = term99899;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "addMapping", argTypes, term99807, args);
        assertTrue(recursiveEquals(term99807, term99910));
        assertTrue(recursiveEquals(term99899, term99911));
    }

};


