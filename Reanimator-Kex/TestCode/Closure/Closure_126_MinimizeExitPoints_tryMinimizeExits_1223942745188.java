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

public class MinimizeExitPoints_tryMinimizeExits_1223942745188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58986;
     Object term59056;
     Object term59087;
     Object term59088;

    public MinimizeExitPoints_tryMinimizeExits_1223942745188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58986 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term59056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59056, term59056.getClass(), "type", -5);
        setField(term59056, term59056.getClass(), "first", term59056);
        term59087 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term59087, term59087.getClass(), "compiler", null);
        term59088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59088, term59088.getClass(), "type", -5);
        setField(term59088, term59088.getClass(), "next", null);
        setField(term59088, term59088.getClass(), "first", term59088);
        setField(term59088, term59088.getClass(), "last", null);
        setField(term59088, term59088.getClass(), "propListHead", null);
        setIntField(term59088, term59088.getClass(), "sourcePosition", 0);
        setField(term59088, term59088.getClass(), "jsType", null);
        setField(term59088, term59088.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term59056;
        args[1] = -5;
        args[2] = null;
        callMethod(klass, "tryMinimizeExits", argTypes, term58986, args);
        assertTrue(recursiveEquals(term58986, term59087));
        assertTrue(recursiveEquals(term59056, term59088));
    }

};


