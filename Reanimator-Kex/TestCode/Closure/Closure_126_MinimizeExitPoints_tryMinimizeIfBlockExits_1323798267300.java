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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108292;
     Object term108362;
     Object term108432;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108292 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term108362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108362, term108362.getClass(), "type", 0);
        setField(term108362, term108362.getClass(), "first", null);
        term108432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108610 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term108680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108502, term108502.getClass(), "type", 0);
        setField(term108432, term108432.getClass(), "next", term108502);
        setIntField(term108610, term108610.getClass(), "propType", 0);
        setField(term108610, term108610.getClass(), "next", null);
        setField(term108432, term108432.getClass(), "propListHead", term108610);
        setIntField(term108432, term108432.getClass(), "sourcePosition", 0);
        setField(term108432, term108432.getClass(), "last", null);
        setField(term108432, term108432.getClass(), "first", null);
        setField(term108432, term108432.getClass(), "parent", term108680);
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
        args[0] = term108362;
        args[1] = null;
        args[2] = term108432;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term108292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


