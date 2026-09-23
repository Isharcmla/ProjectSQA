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

public class PeepholeFoldConstants_tryFoldComparison_8484431791021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319050;
     Object term319142;
     Object term319234;
     Object term319326;
     Object term319854;
     Object term319855;
     Object term319856;
     Object term319857;
     Object term319833;

    public PeepholeFoldConstants_tryFoldComparison_8484431791021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319050 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term319142 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term319142, term319142.getClass(), "type", 16);
        term319234 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term319234, term319234.getClass(), "type", 42);
        term319326 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term319326, term319326.getClass(), "type", 42);
        term319854 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term319854, term319854.getClass(), "currentTraversal", null);
        term319855 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term319855, term319855.getClass(), "str", null);
        setIntField(term319855, term319855.getClass(), "type", 42);
        setField(term319855, term319855.getClass(), "next", null);
        setField(term319855, term319855.getClass(), "first", null);
        setField(term319855, term319855.getClass(), "last", null);
        setField(term319855, term319855.getClass(), "propListHead", null);
        setIntField(term319855, term319855.getClass(), "sourcePosition", 0);
        setField(term319855, term319855.getClass(), "jsType", null);
        setField(term319855, term319855.getClass(), "parent", null);
        term319856 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term319856, term319856.getClass(), "str", null);
        setIntField(term319856, term319856.getClass(), "type", 16);
        setField(term319856, term319856.getClass(), "next", null);
        setField(term319856, term319856.getClass(), "first", null);
        setField(term319856, term319856.getClass(), "last", null);
        setField(term319856, term319856.getClass(), "propListHead", null);
        setIntField(term319856, term319856.getClass(), "sourcePosition", 0);
        setField(term319856, term319856.getClass(), "jsType", null);
        setField(term319856, term319856.getClass(), "parent", null);
        term319857 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term319857, term319857.getClass(), "number", 0.0);
        setIntField(term319857, term319857.getClass(), "type", 42);
        setField(term319857, term319857.getClass(), "next", null);
        setField(term319857, term319857.getClass(), "first", null);
        setField(term319857, term319857.getClass(), "last", null);
        setField(term319857, term319857.getClass(), "propListHead", null);
        setIntField(term319857, term319857.getClass(), "sourcePosition", 0);
        setField(term319857, term319857.getClass(), "jsType", null);
        setField(term319857, term319857.getClass(), "parent", null);
        term319833 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term319833, term319833.getClass(), "str", null);
        setIntField(term319833, term319833.getClass(), "type", 16);
        setField(term319833, term319833.getClass(), "next", null);
        setField(term319833, term319833.getClass(), "first", null);
        setField(term319833, term319833.getClass(), "last", null);
        setField(term319833, term319833.getClass(), "propListHead", null);
        setIntField(term319833, term319833.getClass(), "sourcePosition", 0);
        setField(term319833, term319833.getClass(), "jsType", null);
        setField(term319833, term319833.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term319142;
        args[1] = term319234;
        args[2] = term319326;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term319050, args);
        assertTrue(recursiveEquals(term319050, term319854));
        assertTrue(recursiveEquals(term319142, term319855));
        assertTrue(recursiveEquals(term319234, term319856));
        assertTrue(recursiveEquals(term319326, term319857));
        assertTrue(recursiveEquals(retValue, term319833));
    }

};


