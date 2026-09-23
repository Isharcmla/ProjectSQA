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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60662;
     Object term60754;
     Object term61226;
     Object term61110;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60662 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term60754 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term60754, term60754.getClass(), "type", 0);
        setField(term60754, term60754.getClass(), "first", null);
        term61226 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61277 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term61312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61226, term61226.getClass(), "type", 0);
        setIntField(term61277, term61277.getClass(), "propType", 0);
        setField(term61277, term61277.getClass(), "next", null);
        setField(term61226, term61226.getClass(), "propListHead", term61277);
        setIntField(term61226, term61226.getClass(), "sourcePosition", 0);
        setField(term61226, term61226.getClass(), "next", term61312);
        setField(term61226, term61226.getClass(), "parent", null);
        term61110 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61180, term61180.getClass(), "type", 0);
        setField(term61110, term61110.getClass(), "next", term61180);
        setField(term61110, term61110.getClass(), "propListHead", null);
        setIntField(term61110, term61110.getClass(), "sourcePosition", 0);
        setField(term61110, term61110.getClass(), "first", term61226);
        setField(term61110, term61110.getClass(), "last", term61382);
        setField(term61110, term61110.getClass(), "parent", term61452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term60754;
        args[1] = term61226;
        args[2] = term61110;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term60662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


