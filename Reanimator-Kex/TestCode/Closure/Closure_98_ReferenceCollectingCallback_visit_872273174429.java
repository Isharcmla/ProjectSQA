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
import java.lang.Object;

public class ReferenceCollectingCallback_visit_872273174429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114287;
     Object term114517;
     Object term114471;
     Object term114877;
     Object term114878;
     Object term114879;

    public ReferenceCollectingCallback_visit_872273174429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114287 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term114517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term114517, term114517.getClass(), "type", 101);
        term114471 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term114471, term114471.getClass(), "type", 101);
        setField(term114471, term114471.getClass(), "first", term114517);
        term114877 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term114877, term114877.getClass(), "referenceMap", null);
        setField(term114877, term114877.getClass(), "blockStack", null);
        setField(term114877, term114877.getClass(), "behavior", null);
        setField(term114877, term114877.getClass(), "compiler", null);
        setField(term114877, term114877.getClass(), "varFilter", null);
        term114878 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term114878, term114878.getClass(), "number", 0.0);
        setIntField(term114878, term114878.getClass(), "type", 101);
        setField(term114878, term114878.getClass(), "next", null);
        setField(term114878, term114878.getClass(), "first", null);
        setField(term114878, term114878.getClass(), "last", null);
        setField(term114878, term114878.getClass(), "propListHead", null);
        setIntField(term114878, term114878.getClass(), "sourcePosition", 0);
        setField(term114878, term114878.getClass(), "jsType", null);
        setField(term114878, term114878.getClass(), "parent", null);
        term114879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114880 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term114879, term114879.getClass(), "number", 0.0);
        setIntField(term114879, term114879.getClass(), "type", 101);
        setField(term114879, term114879.getClass(), "next", null);
        setDoubleField(term114880, term114880.getClass(), "number", 0.0);
        setIntField(term114880, term114880.getClass(), "type", 101);
        setField(term114880, term114880.getClass(), "next", null);
        setField(term114880, term114880.getClass(), "first", null);
        setField(term114880, term114880.getClass(), "last", null);
        setField(term114880, term114880.getClass(), "propListHead", null);
        setIntField(term114880, term114880.getClass(), "sourcePosition", 0);
        setField(term114880, term114880.getClass(), "jsType", null);
        setField(term114880, term114880.getClass(), "parent", null);
        setField(term114879, term114879.getClass(), "first", term114880);
        setField(term114879, term114879.getClass(), "last", null);
        setField(term114879, term114879.getClass(), "propListHead", null);
        setIntField(term114879, term114879.getClass(), "sourcePosition", 0);
        setField(term114879, term114879.getClass(), "jsType", null);
        setField(term114879, term114879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term114517;
        args[2] = term114471;
        callMethod(klass, "visit", argTypes, term114287, args);
        assertTrue(recursiveEquals(term114287, term114877));
        assertTrue(recursiveEquals(term114517, term114879));
        assertTrue(recursiveEquals(term114471, null));
    }

};


