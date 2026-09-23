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
import java.lang.Object;

public class DevirtualizePrototypeMethods_isCall_137261513533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3492;
     Object term6520;

    public DevirtualizePrototypeMethods_isCall_137261513533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3492 = newInstance(Class.forName("com.google.javascript.jscomp.UseSite"));
        Object term3562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3562, term3562.getClass(), "parent", term3562);
        setField(term3492, term3492.getClass(), "node", term3562);
        term6520 = newInstance(Class.forName("com.google.javascript.jscomp.UseSite"));
        Object term6521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6521, term6521.getClass(), "type", 0);
        setField(term6521, term6521.getClass(), "next", null);
        setField(term6521, term6521.getClass(), "first", null);
        setField(term6521, term6521.getClass(), "last", null);
        setField(term6521, term6521.getClass(), "propListHead", null);
        setIntField(term6521, term6521.getClass(), "sourcePosition", 0);
        setField(term6521, term6521.getClass(), "jsType", null);
        setField(term6521, term6521.getClass(), "parent", term6521);
        setField(term6520, term6520.getClass(), "node", term6521);
        setField(term6520, term6520.getClass(), "module", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.UseSite");
        Object[] args = new Object[1];
        args[0] = term3492;
        Object retValue = callMethod(klass, "isCall", argTypes, null, args);
        assertTrue(recursiveEquals(term3492, term6520));
        assertTrue(recursiveEquals(retValue, false));
    }

};


