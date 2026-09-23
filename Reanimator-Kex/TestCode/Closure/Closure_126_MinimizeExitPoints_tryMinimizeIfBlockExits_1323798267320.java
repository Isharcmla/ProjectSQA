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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115610;
     Object term115702;
     Object term115794;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115610 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term115702 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term115702, term115702.getClass(), "type", 0);
        setField(term115702, term115702.getClass(), "first", null);
        term115794 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term115864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115972 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term116080 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term116188 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term115794, term115794.getClass(), "next", term115864);
        setIntField(term115972, term115972.getClass(), "propType", 40);
        setField(term115972, term115972.getClass(), "objectValue", null);
        setIntField(term116080, term116080.getClass(), "propType", 40);
        setField(term116080, term116080.getClass(), "next", term116188);
        setField(term115972, term115972.getClass(), "next", term116080);
        setField(term115794, term115794.getClass(), "propListHead", term115972);
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
        args[0] = term115702;
        args[1] = null;
        args[2] = term115794;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term115610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


