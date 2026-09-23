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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8863;
     Object term8968;
     Object term8990;
     Object term8991;
     Object term8992;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8863 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term8968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8968, term8968.getClass(), "type", 4);
        setField(term8968, term8968.getClass(), "first", null);
        term8990 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term8990, term8990.getClass(), "compiler", null);
        term8991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8991, term8991.getClass(), "type", 4);
        setField(term8991, term8991.getClass(), "next", null);
        setField(term8991, term8991.getClass(), "first", null);
        setField(term8991, term8991.getClass(), "last", null);
        setField(term8991, term8991.getClass(), "propListHead", null);
        setIntField(term8991, term8991.getClass(), "sourcePosition", 0);
        setField(term8991, term8991.getClass(), "jsType", null);
        setField(term8991, term8991.getClass(), "parent", null);
        term8992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8992, term8992.getClass(), "type", 4);
        setField(term8992, term8992.getClass(), "next", null);
        setField(term8992, term8992.getClass(), "first", null);
        setField(term8992, term8992.getClass(), "last", null);
        setField(term8992, term8992.getClass(), "propListHead", null);
        setIntField(term8992, term8992.getClass(), "sourcePosition", 0);
        setField(term8992, term8992.getClass(), "jsType", null);
        setField(term8992, term8992.getClass(), "parent", null);
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
        args[0] = term8968;
        args[1] = null;
        args[2] = term8968;
        args[3] = 4;
        args[4] = null;
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term8863, args);
        assertTrue(recursiveEquals(term8863, term8990));
        assertTrue(recursiveEquals(term8968, term8991));
        assertTrue(recursiveEquals(term8968, null));
    }

};


