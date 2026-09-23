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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49411;
     Object term49503;
     Object term49595;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49411 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term49503 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term49503, term49503.getClass(), "type", 0);
        setField(term49503, term49503.getClass(), "first", null);
        term49595 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term49665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49773 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term49595, term49595.getClass(), "next", term49665);
        setField(term49595, term49595.getClass(), "propListHead", term49773);
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
        args[0] = term49503;
        args[1] = null;
        args[2] = term49595;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term49411, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


