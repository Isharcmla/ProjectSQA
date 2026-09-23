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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2628786;
     Object term2628856;
     Object term2629585;
     Object term2629586;
     Object term2629550;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2628786 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2628856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2628926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2628996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2628856, term2628856.getClass(), "type", 37);
        setIntField(term2628926, term2628926.getClass(), "type", 33);
        setField(term2628926, term2628926.getClass(), "first", term2628996);
        setField(term2628856, term2628856.getClass(), "first", term2628926);
        term2629585 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2629585, term2629585.getClass(), "currentTraversal", null);
        term2629586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2629587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2629588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2629586, term2629586.getClass(), "type", 37);
        setField(term2629586, term2629586.getClass(), "next", null);
        setIntField(term2629587, term2629587.getClass(), "type", 33);
        setField(term2629587, term2629587.getClass(), "next", null);
        setIntField(term2629588, term2629588.getClass(), "type", 0);
        setField(term2629588, term2629588.getClass(), "next", null);
        setField(term2629588, term2629588.getClass(), "first", null);
        setField(term2629588, term2629588.getClass(), "last", null);
        setField(term2629588, term2629588.getClass(), "propListHead", null);
        setIntField(term2629588, term2629588.getClass(), "sourcePosition", 0);
        setField(term2629588, term2629588.getClass(), "jsType", null);
        setField(term2629588, term2629588.getClass(), "parent", null);
        setField(term2629587, term2629587.getClass(), "first", term2629588);
        setField(term2629587, term2629587.getClass(), "last", null);
        setField(term2629587, term2629587.getClass(), "propListHead", null);
        setIntField(term2629587, term2629587.getClass(), "sourcePosition", 0);
        setField(term2629587, term2629587.getClass(), "jsType", null);
        setField(term2629587, term2629587.getClass(), "parent", null);
        setField(term2629586, term2629586.getClass(), "first", term2629587);
        setField(term2629586, term2629586.getClass(), "last", null);
        setField(term2629586, term2629586.getClass(), "propListHead", null);
        setIntField(term2629586, term2629586.getClass(), "sourcePosition", 0);
        setField(term2629586, term2629586.getClass(), "jsType", null);
        setField(term2629586, term2629586.getClass(), "parent", null);
        term2629550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2629552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2629554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2629550, term2629550.getClass(), "type", 37);
        setField(term2629550, term2629550.getClass(), "next", null);
        setIntField(term2629552, term2629552.getClass(), "type", 33);
        setField(term2629552, term2629552.getClass(), "next", null);
        setIntField(term2629554, term2629554.getClass(), "type", 0);
        setField(term2629554, term2629554.getClass(), "next", null);
        setField(term2629554, term2629554.getClass(), "first", null);
        setField(term2629554, term2629554.getClass(), "last", null);
        setField(term2629554, term2629554.getClass(), "propListHead", null);
        setIntField(term2629554, term2629554.getClass(), "sourcePosition", 0);
        setField(term2629554, term2629554.getClass(), "jsType", null);
        setField(term2629554, term2629554.getClass(), "parent", null);
        setField(term2629552, term2629552.getClass(), "first", term2629554);
        setField(term2629552, term2629552.getClass(), "last", null);
        setField(term2629552, term2629552.getClass(), "propListHead", null);
        setIntField(term2629552, term2629552.getClass(), "sourcePosition", 0);
        setField(term2629552, term2629552.getClass(), "jsType", null);
        setField(term2629552, term2629552.getClass(), "parent", null);
        setField(term2629550, term2629550.getClass(), "first", term2629552);
        setField(term2629550, term2629550.getClass(), "last", null);
        setField(term2629550, term2629550.getClass(), "propListHead", null);
        setIntField(term2629550, term2629550.getClass(), "sourcePosition", 0);
        setField(term2629550, term2629550.getClass(), "jsType", null);
        setField(term2629550, term2629550.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2628856;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2628786, args);
        assertTrue(recursiveEquals(term2628786, term2629585));
        assertTrue(recursiveEquals(term2628856, term2629586));
        assertTrue(recursiveEquals(retValue, term2629550));
    }

};


