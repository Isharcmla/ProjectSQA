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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90459;
     Object term90551;
     Object term90643;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90459 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term90551 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term90551, term90551.getClass(), "type", 0);
        setField(term90551, term90551.getClass(), "first", null);
        term90643 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90821 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term90929 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term90643, term90643.getClass(), "next", term90713);
        setIntField(term90821, term90821.getClass(), "propType", 40);
        setField(term90821, term90821.getClass(), "objectValue", null);
        setIntField(term90929, term90929.getClass(), "propType", 51);
        setField(term90821, term90821.getClass(), "next", term90929);
        setField(term90643, term90643.getClass(), "propListHead", term90821);
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
        args[0] = term90551;
        args[1] = null;
        args[2] = term90643;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term90459, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


