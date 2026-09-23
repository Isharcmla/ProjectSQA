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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class MinimizeExitPoints_tryMinimizeExits_122394274538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5394;
     Object term5464;
     Object term5788;
     Object term5789;

    public MinimizeExitPoints_tryMinimizeExits_122394274538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5394 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term5464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5464, term5464.getClass(), "type", -5);
        term5788 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term5788, term5788.getClass(), "compiler", null);
        term5789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5789, term5789.getClass(), "type", -5);
        setField(term5789, term5789.getClass(), "next", null);
        setField(term5789, term5789.getClass(), "first", null);
        setField(term5789, term5789.getClass(), "last", null);
        setField(term5789, term5789.getClass(), "propListHead", null);
        setIntField(term5789, term5789.getClass(), "sourcePosition", 0);
        setField(term5789, term5789.getClass(), "jsType", null);
        setField(term5789, term5789.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term5464;
        args[1] = -5;
        args[2] = "";
        callMethod(klass, "tryMinimizeExits", argTypes, term5394, args);
        assertTrue(recursiveEquals(term5394, term5788));
        assertTrue(recursiveEquals(term5464, term5789));
    }

};


