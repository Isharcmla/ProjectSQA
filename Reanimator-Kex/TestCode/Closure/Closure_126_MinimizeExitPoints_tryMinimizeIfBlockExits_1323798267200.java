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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63430;
     Object term63522;
     Object term63614;
     Object term63814;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63430 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term63522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term63522, term63522.getClass(), "type", 0);
        setField(term63522, term63522.getClass(), "first", null);
        term63614 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63722 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term63614, term63614.getClass(), "type", 0);
        setField(term63614, term63614.getClass(), "propListHead", term63722);
        term63814 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63906 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term64008 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term63814, term63814.getClass(), "next", term63906);
        setIntField(term64008, term64008.getClass(), "propType", 0);
        setField(term64008, term64008.getClass(), "next", null);
        setField(term63814, term63814.getClass(), "propListHead", term64008);
        setIntField(term63814, term63814.getClass(), "sourcePosition", 0);
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
        args[0] = term63522;
        args[1] = term63614;
        args[2] = term63814;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term63430, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


