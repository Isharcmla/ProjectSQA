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

public class ScopedAliases_hotSwapScript_88341709182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103191;
     Object term103261;
     Object term103960;
     Object term103961;

    public ScopedAliases_hotSwapScript_88341709182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103191 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term103191, term103191.getClass(), "compiler", null);
        term103261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103261, term103261.getClass(), "type", 0);
        setField(term103261, term103261.getClass(), "parent", null);
        setField(term103331, term103331.getClass(), "next", null);
        setIntField(term103331, term103331.getClass(), "type", 0);
        setField(term103401, term103401.getClass(), "next", term103471);
        setIntField(term103401, term103401.getClass(), "type", 0);
        setField(term103401, term103401.getClass(), "first", null);
        setField(term103331, term103331.getClass(), "first", term103401);
        setField(term103261, term103261.getClass(), "first", term103331);
        term103960 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term103960, term103960.getClass(), "compiler", null);
        setField(term103960, term103960.getClass(), "preprocessorSymbolTable", null);
        setField(term103960, term103960.getClass(), "transformationHandler", null);
        term103961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103961, term103961.getClass(), "type", 0);
        setField(term103961, term103961.getClass(), "next", null);
        setIntField(term103962, term103962.getClass(), "type", 0);
        setField(term103962, term103962.getClass(), "next", null);
        setIntField(term103963, term103963.getClass(), "type", 0);
        setIntField(term103964, term103964.getClass(), "type", 0);
        setField(term103964, term103964.getClass(), "next", null);
        setField(term103964, term103964.getClass(), "first", null);
        setField(term103964, term103964.getClass(), "last", null);
        setField(term103964, term103964.getClass(), "propListHead", null);
        setIntField(term103964, term103964.getClass(), "sourcePosition", 0);
        setField(term103964, term103964.getClass(), "jsType", null);
        setField(term103964, term103964.getClass(), "parent", null);
        setField(term103963, term103963.getClass(), "next", term103964);
        setField(term103963, term103963.getClass(), "first", null);
        setField(term103963, term103963.getClass(), "last", null);
        setField(term103963, term103963.getClass(), "propListHead", null);
        setIntField(term103963, term103963.getClass(), "sourcePosition", 0);
        setField(term103963, term103963.getClass(), "jsType", null);
        setField(term103963, term103963.getClass(), "parent", null);
        setField(term103962, term103962.getClass(), "first", term103963);
        setField(term103962, term103962.getClass(), "last", null);
        setField(term103962, term103962.getClass(), "propListHead", null);
        setIntField(term103962, term103962.getClass(), "sourcePosition", 0);
        setField(term103962, term103962.getClass(), "jsType", null);
        setField(term103962, term103962.getClass(), "parent", null);
        setField(term103961, term103961.getClass(), "first", term103962);
        setField(term103961, term103961.getClass(), "last", null);
        setField(term103961, term103961.getClass(), "propListHead", null);
        setIntField(term103961, term103961.getClass(), "sourcePosition", 0);
        setField(term103961, term103961.getClass(), "jsType", null);
        setField(term103961, term103961.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term103261;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term103191, args);
        assertTrue(recursiveEquals(term103191, term103960));
        assertTrue(recursiveEquals(term103261, term103961));
    }

};


