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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118010;
     Object term118102;
     Object term118194;
     Object term118286;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118010 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term118102 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term118102, term118102.getClass(), "type", 0);
        setField(term118102, term118102.getClass(), "first", null);
        term118194 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term118286 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term118356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118464 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term118286, term118286.getClass(), "next", term118356);
        setIntField(term118464, term118464.getClass(), "propType", 40);
        setField(term118464, term118464.getClass(), "objectValue", null);
        setField(term118464, term118464.getClass(), "next", null);
        setField(term118286, term118286.getClass(), "propListHead", term118464);
        setIntField(term118286, term118286.getClass(), "sourcePosition", 0);
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
        args[0] = term118102;
        args[1] = term118194;
        args[2] = term118286;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term118010, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


