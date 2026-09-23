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

public class PeepholeFoldConstants_compareToUndefined_1311665781111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18861;
     Object term18931;
     Object term18958;
     Object term18959;

    public PeepholeFoldConstants_compareToUndefined_1311665781111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18861 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term18931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18931, term18931.getClass(), "type", 0);
        term18958 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term18958, term18958.getClass(), "currentTraversal", null);
        term18959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18959, term18959.getClass(), "type", 0);
        setField(term18959, term18959.getClass(), "next", null);
        setField(term18959, term18959.getClass(), "first", null);
        setField(term18959, term18959.getClass(), "last", null);
        setField(term18959, term18959.getClass(), "propListHead", null);
        setIntField(term18959, term18959.getClass(), "sourcePosition", 0);
        setField(term18959, term18959.getClass(), "jsType", null);
        setField(term18959, term18959.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term18931;
        args[1] = 12;
        Object retValue = callMethod(klass, "compareToUndefined", argTypes, term18861, args);
        assertTrue(recursiveEquals(term18861, term18958));
        assertTrue(recursiveEquals(term18931, term18959));
        assertTrue(recursiveEquals(retValue, false));
    }

};


