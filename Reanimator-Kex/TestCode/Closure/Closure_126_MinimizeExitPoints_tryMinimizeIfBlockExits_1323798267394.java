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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152878;
     Object term152970;
     Object term153062;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152878 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term152970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term152970, term152970.getClass(), "type", 0);
        setField(term152970, term152970.getClass(), "first", null);
        term153062 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153154 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153262 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term153332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term153154, term153154.getClass(), "type", 105);
        setField(term153062, term153062.getClass(), "next", term153154);
        setIntField(term153262, term153262.getClass(), "propType", 0);
        setField(term153262, term153262.getClass(), "next", null);
        setField(term153062, term153062.getClass(), "propListHead", term153262);
        setIntField(term153062, term153062.getClass(), "sourcePosition", 0);
        setField(term153062, term153062.getClass(), "last", null);
        setField(term153062, term153062.getClass(), "first", null);
        setField(term153062, term153062.getClass(), "parent", term153332);
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
        args[0] = term152970;
        args[1] = null;
        args[2] = term153062;
        args[3] = 0;
        args[4] = null;
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term152878, args);
    }

};


