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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151368;
     Object term151438;
     Object term151508;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151368 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term151438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term151438, term151438.getClass(), "type", 4);
        setField(term151438, term151438.getClass(), "first", null);
        term151508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151680 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term151782 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term151884 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term151508, term151508.getClass(), "next", term151578);
        setIntField(term151680, term151680.getClass(), "propType", 304963087);
        setIntField(term151782, term151782.getClass(), "propType", 689143664);
        setIntField(term151884, term151884.getClass(), "propType", -725187423);
        setField(term151884, term151884.getClass(), "next", term151884);
        setField(term151782, term151782.getClass(), "next", term151884);
        setField(term151680, term151680.getClass(), "next", term151782);
        setField(term151508, term151508.getClass(), "propListHead", term151680);
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
        args[0] = term151438;
        args[1] = null;
        args[2] = term151508;
        args[3] = 4;
        args[4] = null;
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term151368, args);
    }

};


