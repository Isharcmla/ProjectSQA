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

public class MinimizeExitPoints_tryMinimizeExits_1223942745376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144398;
     Object term144468;
     Object term144849;
     Object term144850;

    public MinimizeExitPoints_tryMinimizeExits_1223942745376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144398 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term144468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144468, term144468.getClass(), "type", 4);
        setField(term144468, term144468.getClass(), "first", term144468);
        term144849 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term144849, term144849.getClass(), "compiler", null);
        term144850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144850, term144850.getClass(), "type", 4);
        setField(term144850, term144850.getClass(), "next", null);
        setField(term144850, term144850.getClass(), "first", term144850);
        setField(term144850, term144850.getClass(), "last", null);
        setField(term144850, term144850.getClass(), "propListHead", null);
        setIntField(term144850, term144850.getClass(), "sourcePosition", 0);
        setField(term144850, term144850.getClass(), "jsType", null);
        setField(term144850, term144850.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term144468;
        args[1] = 4;
        args[2] = null;
        callMethod(klass, "tryMinimizeExits", argTypes, term144398, args);
        assertTrue(recursiveEquals(term144398, term144849));
        assertTrue(recursiveEquals(term144468, term144850));
    }

};


