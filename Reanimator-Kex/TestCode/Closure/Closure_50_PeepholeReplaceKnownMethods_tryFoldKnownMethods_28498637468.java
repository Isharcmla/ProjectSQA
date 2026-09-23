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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13231;
     Object term13323;
     Object term19735;
     Object term19736;
     Object term19722;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13231 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term13323 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term19735 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term19735, term19735.getClass(), "currentTraversal", null);
        term19736 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term19736, term19736.getClass(), "str", null);
        setIntField(term19736, term19736.getClass(), "type", 0);
        setField(term19736, term19736.getClass(), "next", null);
        setField(term19736, term19736.getClass(), "first", null);
        setField(term19736, term19736.getClass(), "last", null);
        setField(term19736, term19736.getClass(), "propListHead", null);
        setIntField(term19736, term19736.getClass(), "sourcePosition", 0);
        setField(term19736, term19736.getClass(), "jsType", null);
        setField(term19736, term19736.getClass(), "parent", null);
        term19722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term19722, term19722.getClass(), "str", null);
        setIntField(term19722, term19722.getClass(), "type", 0);
        setField(term19722, term19722.getClass(), "next", null);
        setField(term19722, term19722.getClass(), "first", null);
        setField(term19722, term19722.getClass(), "last", null);
        setField(term19722, term19722.getClass(), "propListHead", null);
        setIntField(term19722, term19722.getClass(), "sourcePosition", 0);
        setField(term19722, term19722.getClass(), "jsType", null);
        setField(term19722, term19722.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13323;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term13231, args);
        assertTrue(recursiveEquals(term13231, term19735));
        assertTrue(recursiveEquals(term13323, term19736));
        assertTrue(recursiveEquals(retValue, term19722));
    }

};


