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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135282;
     Object term135352;
     Object term135422;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135282 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term135352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term135352, term135352.getClass(), "type", 4);
        setField(term135352, term135352.getClass(), "first", null);
        term135422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135594 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term135696 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term135798 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term135900 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term135422, term135422.getClass(), "next", term135492);
        setIntField(term135594, term135594.getClass(), "propType", 286565025);
        setIntField(term135696, term135696.getClass(), "propType", 268451968);
        setIntField(term135798, term135798.getClass(), "propType", 2014559097);
        setIntField(term135900, term135900.getClass(), "propType", 51);
        setField(term135900, term135900.getClass(), "next", null);
        setField(term135798, term135798.getClass(), "next", term135900);
        setField(term135696, term135696.getClass(), "next", term135798);
        setField(term135594, term135594.getClass(), "next", term135696);
        setField(term135422, term135422.getClass(), "propListHead", term135594);
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
        args[0] = term135352;
        args[1] = null;
        args[2] = term135422;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term135282, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


