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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term864429;
     Object term864521;
     Object term864683;
     Object term864775;
     Object term865760;
     Object term865761;
     Object term865763;
     Object term865764;
     Object term865693;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term864429 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term864521 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term864591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term864591, term864591.getClass(), "type", 108);
        setField(term864521, term864521.getClass(), "parent", term864591);
        setIntField(term864521, term864521.getClass(), "type", 0);
        term864683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term864683, term864683.getClass(), "type", 0);
        term864775 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term864775, term864775.getClass(), "type", 64);
        term865760 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term865760, term865760.getClass(), "currentTraversal", null);
        term865761 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term865762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term865761, term865761.getClass(), "str", null);
        setIntField(term865761, term865761.getClass(), "type", 0);
        setField(term865761, term865761.getClass(), "next", null);
        setField(term865761, term865761.getClass(), "first", null);
        setField(term865761, term865761.getClass(), "last", null);
        setField(term865761, term865761.getClass(), "propListHead", null);
        setIntField(term865761, term865761.getClass(), "sourcePosition", 0);
        setField(term865761, term865761.getClass(), "jsType", null);
        setIntField(term865762, term865762.getClass(), "type", 108);
        setField(term865762, term865762.getClass(), "next", null);
        setField(term865762, term865762.getClass(), "first", null);
        setField(term865762, term865762.getClass(), "last", null);
        setField(term865762, term865762.getClass(), "propListHead", null);
        setIntField(term865762, term865762.getClass(), "sourcePosition", 0);
        setField(term865762, term865762.getClass(), "jsType", null);
        setField(term865762, term865762.getClass(), "parent", null);
        setField(term865761, term865761.getClass(), "parent", term865762);
        term865763 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term865763, term865763.getClass(), "str", null);
        setIntField(term865763, term865763.getClass(), "type", 0);
        setField(term865763, term865763.getClass(), "next", null);
        setField(term865763, term865763.getClass(), "first", null);
        setField(term865763, term865763.getClass(), "last", null);
        setField(term865763, term865763.getClass(), "propListHead", null);
        setIntField(term865763, term865763.getClass(), "sourcePosition", 0);
        setField(term865763, term865763.getClass(), "jsType", null);
        setField(term865763, term865763.getClass(), "parent", null);
        term865764 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term865764, term865764.getClass(), "str", null);
        setIntField(term865764, term865764.getClass(), "type", 64);
        setField(term865764, term865764.getClass(), "next", null);
        setField(term865764, term865764.getClass(), "first", null);
        setField(term865764, term865764.getClass(), "last", null);
        setField(term865764, term865764.getClass(), "propListHead", null);
        setIntField(term865764, term865764.getClass(), "sourcePosition", 0);
        setField(term865764, term865764.getClass(), "jsType", null);
        setField(term865764, term865764.getClass(), "parent", null);
        term865693 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term865696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term865693, term865693.getClass(), "str", null);
        setIntField(term865693, term865693.getClass(), "type", 0);
        setField(term865693, term865693.getClass(), "next", null);
        setField(term865693, term865693.getClass(), "first", null);
        setField(term865693, term865693.getClass(), "last", null);
        setField(term865693, term865693.getClass(), "propListHead", null);
        setIntField(term865693, term865693.getClass(), "sourcePosition", 0);
        setField(term865693, term865693.getClass(), "jsType", null);
        setIntField(term865696, term865696.getClass(), "type", 108);
        setField(term865696, term865696.getClass(), "next", null);
        setField(term865696, term865696.getClass(), "first", null);
        setField(term865696, term865696.getClass(), "last", null);
        setField(term865696, term865696.getClass(), "propListHead", null);
        setIntField(term865696, term865696.getClass(), "sourcePosition", 0);
        setField(term865696, term865696.getClass(), "jsType", null);
        setField(term865696, term865696.getClass(), "parent", null);
        setField(term865693, term865693.getClass(), "parent", term865696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term864521;
        args[1] = term864683;
        args[2] = term864775;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term864429, args);
        assertTrue(recursiveEquals(term864429, term865760));
        assertTrue(recursiveEquals(term864521, term865761));
        assertTrue(recursiveEquals(term864683, term865763));
        assertTrue(recursiveEquals(term864775, term865764));
        assertTrue(recursiveEquals(retValue, term865693));
    }

};


