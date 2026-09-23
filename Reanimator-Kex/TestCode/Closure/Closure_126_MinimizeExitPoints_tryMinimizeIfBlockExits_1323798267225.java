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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72469;
     Object term72539;
     Object term72609;
     Object term72701;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72469 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term72539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72539, term72539.getClass(), "type", 0);
        setField(term72539, term72539.getClass(), "first", null);
        term72609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term72701 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term72771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72873 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term72975 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term72701, term72701.getClass(), "next", term72771);
        setIntField(term72873, term72873.getClass(), "propType", 0);
        setIntField(term72975, term72975.getClass(), "propType", 0);
        setField(term72975, term72975.getClass(), "next", null);
        setField(term72873, term72873.getClass(), "next", term72975);
        setField(term72701, term72701.getClass(), "propListHead", term72873);
        setIntField(term72701, term72701.getClass(), "sourcePosition", 0);
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
        args[0] = term72539;
        args[1] = term72609;
        args[2] = term72701;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term72469, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


