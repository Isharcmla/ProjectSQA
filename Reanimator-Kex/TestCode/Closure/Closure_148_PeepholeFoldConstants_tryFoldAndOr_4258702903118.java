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

public class PeepholeFoldConstants_tryFoldAndOr_4258702903118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922834;
     Object term922926;
     Object term923088;
     Object term923180;
     Object term923296;
     Object term923297;
     Object term923299;
     Object term923300;
     Object term923249;

    public PeepholeFoldConstants_tryFoldAndOr_4258702903118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term922834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term922926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term922996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term922926, term922926.getClass(), "parent", term922996);
        setIntField(term922926, term922926.getClass(), "type", 0);
        term923088 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term923088, term923088.getClass(), "type", 0);
        term923180 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term923180, term923180.getClass(), "type", 63);
        term923296 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term923296, term923296.getClass(), "currentTraversal", null);
        term923297 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term923298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term923297, term923297.getClass(), "str", null);
        setIntField(term923297, term923297.getClass(), "type", 0);
        setField(term923297, term923297.getClass(), "next", null);
        setField(term923297, term923297.getClass(), "first", null);
        setField(term923297, term923297.getClass(), "last", null);
        setField(term923297, term923297.getClass(), "propListHead", null);
        setIntField(term923297, term923297.getClass(), "sourcePosition", 0);
        setField(term923297, term923297.getClass(), "jsType", null);
        setIntField(term923298, term923298.getClass(), "type", 0);
        setField(term923298, term923298.getClass(), "next", null);
        setField(term923298, term923298.getClass(), "first", null);
        setField(term923298, term923298.getClass(), "last", null);
        setField(term923298, term923298.getClass(), "propListHead", null);
        setIntField(term923298, term923298.getClass(), "sourcePosition", 0);
        setField(term923298, term923298.getClass(), "jsType", null);
        setField(term923298, term923298.getClass(), "parent", null);
        setField(term923297, term923297.getClass(), "parent", term923298);
        term923299 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term923299, term923299.getClass(), "str", null);
        setIntField(term923299, term923299.getClass(), "type", 0);
        setField(term923299, term923299.getClass(), "next", null);
        setField(term923299, term923299.getClass(), "first", null);
        setField(term923299, term923299.getClass(), "last", null);
        setField(term923299, term923299.getClass(), "propListHead", null);
        setIntField(term923299, term923299.getClass(), "sourcePosition", 0);
        setField(term923299, term923299.getClass(), "jsType", null);
        setField(term923299, term923299.getClass(), "parent", null);
        term923300 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term923300, term923300.getClass(), "str", null);
        setIntField(term923300, term923300.getClass(), "type", 63);
        setField(term923300, term923300.getClass(), "next", null);
        setField(term923300, term923300.getClass(), "first", null);
        setField(term923300, term923300.getClass(), "last", null);
        setField(term923300, term923300.getClass(), "propListHead", null);
        setIntField(term923300, term923300.getClass(), "sourcePosition", 0);
        setField(term923300, term923300.getClass(), "jsType", null);
        setField(term923300, term923300.getClass(), "parent", null);
        term923249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term923252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term923249, term923249.getClass(), "str", null);
        setIntField(term923249, term923249.getClass(), "type", 0);
        setField(term923249, term923249.getClass(), "next", null);
        setField(term923249, term923249.getClass(), "first", null);
        setField(term923249, term923249.getClass(), "last", null);
        setField(term923249, term923249.getClass(), "propListHead", null);
        setIntField(term923249, term923249.getClass(), "sourcePosition", 0);
        setField(term923249, term923249.getClass(), "jsType", null);
        setIntField(term923252, term923252.getClass(), "type", 0);
        setField(term923252, term923252.getClass(), "next", null);
        setField(term923252, term923252.getClass(), "first", null);
        setField(term923252, term923252.getClass(), "last", null);
        setField(term923252, term923252.getClass(), "propListHead", null);
        setIntField(term923252, term923252.getClass(), "sourcePosition", 0);
        setField(term923252, term923252.getClass(), "jsType", null);
        setField(term923252, term923252.getClass(), "parent", null);
        setField(term923249, term923249.getClass(), "parent", term923252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term922926;
        args[1] = term923088;
        args[2] = term923180;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term922834, args);
        assertTrue(recursiveEquals(term922834, term923296));
        assertTrue(recursiveEquals(term922926, term923297));
        assertTrue(recursiveEquals(term923088, term923299));
        assertTrue(recursiveEquals(term923180, term923300));
        assertTrue(recursiveEquals(retValue, term923249));
    }

};


