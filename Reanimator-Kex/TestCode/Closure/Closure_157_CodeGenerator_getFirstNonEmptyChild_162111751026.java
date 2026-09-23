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
import java.lang.Object;

public class CodeGenerator_getFirstNonEmptyChild_162111751026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2369;

    public CodeGenerator_getFirstNonEmptyChild_162111751026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2382 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2392 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2369, term2369.getClass(), "type", -1896376975);
        setIntField(term2371, term2371.getClass(), "type", 584893196);
        setIntField(term2373, term2373.getClass(), "type", 0);
        setField(term2373, term2373.getClass(), "next", null);
        setField(term2373, term2373.getClass(), "first", null);
        setField(term2373, term2373.getClass(), "last", null);
        setField(term2373, term2373.getClass(), "propListHead", null);
        setIntField(term2373, term2373.getClass(), "sourcePosition", 0);
        setField(term2373, term2373.getClass(), "jsType", null);
        setField(term2373, term2373.getClass(), "parent", null);
        setField(term2371, term2371.getClass(), "next", term2373);
        setIntField(term2376, term2376.getClass(), "type", 0);
        setField(term2376, term2376.getClass(), "next", null);
        setField(term2376, term2376.getClass(), "first", null);
        setField(term2376, term2376.getClass(), "last", null);
        setField(term2376, term2376.getClass(), "propListHead", null);
        setIntField(term2376, term2376.getClass(), "sourcePosition", 0);
        setField(term2376, term2376.getClass(), "jsType", null);
        setField(term2376, term2376.getClass(), "parent", null);
        setField(term2371, term2371.getClass(), "first", term2376);
        setIntField(term2379, term2379.getClass(), "type", 0);
        setField(term2379, term2379.getClass(), "next", null);
        setField(term2379, term2379.getClass(), "first", null);
        setField(term2379, term2379.getClass(), "last", null);
        setField(term2379, term2379.getClass(), "propListHead", null);
        setIntField(term2379, term2379.getClass(), "sourcePosition", 0);
        setField(term2379, term2379.getClass(), "jsType", null);
        setField(term2379, term2379.getClass(), "parent", null);
        setField(term2371, term2371.getClass(), "last", term2379);
        setField(term2382, term2382.getClass(), "next", null);
        setIntField(term2382, term2382.getClass(), "type", 0);
        setIntField(term2382, term2382.getClass(), "intValue", 0);
        setField(term2382, term2382.getClass(), "objectValue", null);
        setField(term2371, term2371.getClass(), "propListHead", term2382);
        setIntField(term2371, term2371.getClass(), "sourcePosition", -1882480155);
        setField(term2371, term2371.getClass(), "jsType", null);
        setField(term2371, term2371.getClass(), "parent", null);
        setField(term2369, term2369.getClass(), "next", term2371);
        setIntField(term2386, term2386.getClass(), "type", 0);
        setField(term2386, term2386.getClass(), "next", null);
        setField(term2386, term2386.getClass(), "first", null);
        setField(term2386, term2386.getClass(), "last", null);
        setField(term2386, term2386.getClass(), "propListHead", null);
        setIntField(term2386, term2386.getClass(), "sourcePosition", 0);
        setField(term2386, term2386.getClass(), "jsType", null);
        setField(term2386, term2386.getClass(), "parent", null);
        setField(term2369, term2369.getClass(), "first", term2386);
        setIntField(term2389, term2389.getClass(), "type", 0);
        setField(term2389, term2389.getClass(), "next", null);
        setField(term2389, term2389.getClass(), "first", null);
        setField(term2389, term2389.getClass(), "last", null);
        setField(term2389, term2389.getClass(), "propListHead", null);
        setIntField(term2389, term2389.getClass(), "sourcePosition", 0);
        setField(term2389, term2389.getClass(), "jsType", null);
        setField(term2389, term2389.getClass(), "parent", null);
        setField(term2369, term2369.getClass(), "last", term2389);
        setField(term2392, term2392.getClass(), "next", null);
        setIntField(term2392, term2392.getClass(), "type", 0);
        setIntField(term2392, term2392.getClass(), "intValue", 0);
        setField(term2392, term2392.getClass(), "objectValue", null);
        setField(term2369, term2369.getClass(), "propListHead", term2392);
        setIntField(term2369, term2369.getClass(), "sourcePosition", -1410220680);
        setField(term2369, term2369.getClass(), "jsType", null);
        setField(term2369, term2369.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2369;
        callMethod(klass, "getFirstNonEmptyChild", argTypes, null, args);
    }

};


