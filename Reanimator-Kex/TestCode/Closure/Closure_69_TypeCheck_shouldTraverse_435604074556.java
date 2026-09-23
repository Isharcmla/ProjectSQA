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
import java.lang.Object;

public class TypeCheck_shouldTraverse_435604074556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173111;
     Object term173181;

    public TypeCheck_shouldTraverse_435604074556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173111 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term173181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173277 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term173373 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term173181, term173181.getClass(), "type", 118);
        setIntField(term173277, term173277.getClass(), "type", -30);
        setIntField(term173373, term173373.getClass(), "type", 29);
        setField(term173277, term173277.getClass(), "next", term173373);
        setField(term173181, term173181.getClass(), "propListHead", term173277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term173181;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term173111, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


