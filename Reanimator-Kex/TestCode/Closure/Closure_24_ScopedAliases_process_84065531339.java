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

public class ScopedAliases_process_84065531339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20407;
     Object term20477;
     Object term52742;
     Object term52743;

    public ScopedAliases_process_84065531339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20407 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term20407, term20407.getClass(), "compiler", null);
        term20477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20477, term20477.getClass(), "type", 105);
        setField(term20477, term20477.getClass(), "parent", null);
        term52742 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term52742, term52742.getClass(), "compiler", null);
        setField(term52742, term52742.getClass(), "preprocessorSymbolTable", null);
        setField(term52742, term52742.getClass(), "transformationHandler", null);
        term52743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52743, term52743.getClass(), "type", 105);
        setField(term52743, term52743.getClass(), "next", null);
        setField(term52743, term52743.getClass(), "first", null);
        setField(term52743, term52743.getClass(), "last", null);
        setField(term52743, term52743.getClass(), "propListHead", null);
        setIntField(term52743, term52743.getClass(), "sourcePosition", 0);
        setField(term52743, term52743.getClass(), "jsType", null);
        setField(term52743, term52743.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20477;
        callMethod(klass, "process", argTypes, term20407, args);
        assertTrue(recursiveEquals(term20407, term52742));
        assertTrue(recursiveEquals(term20477, null));
    }

};


