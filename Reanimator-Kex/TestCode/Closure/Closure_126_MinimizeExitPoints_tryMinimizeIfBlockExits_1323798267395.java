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
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153544;
     Object term153636;
     Object term154146;
     Object term153928;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153544 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term153636 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term153636, term153636.getClass(), "type", 0);
        setField(term153636, term153636.getClass(), "first", null);
        term154146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term154200 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term154146, term154146.getClass(), "type", 0);
        setIntField(term154200, term154200.getClass(), "propType", 0);
        setField(term154200, term154200.getClass(), "next", null);
        setField(term154146, term154146.getClass(), "propListHead", term154200);
        setIntField(term154146, term154146.getClass(), "sourcePosition", 0);
        setField(term154146, term154146.getClass(), "next", null);
        term153928 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term154100 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term153928, term153928.getClass(), "next", term153998);
        setIntField(term154100, term154100.getClass(), "propType", 1);
        setField(term154100, term154100.getClass(), "next", null);
        setField(term153928, term153928.getClass(), "propListHead", term154100);
        setIntField(term153928, term153928.getClass(), "sourcePosition", 0);
        setField(term153928, term153928.getClass(), "first", term154146);
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
        args[0] = term153636;
        args[1] = term154146;
        args[2] = term153928;
        args[3] = 0;
        args[4] = null;
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term153544, args);
    }

};


