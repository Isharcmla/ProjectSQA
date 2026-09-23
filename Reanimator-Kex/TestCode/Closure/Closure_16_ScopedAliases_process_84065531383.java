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

public class ScopedAliases_process_84065531383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48381;
     Object term48451;
     Object term48816;
     Object term48817;

    public ScopedAliases_process_84065531383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48381 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term48381, term48381.getClass(), "compiler", null);
        term48451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48451, term48451.getClass(), "type", 105);
        setIntField(term48521, term48521.getClass(), "type", 0);
        setField(term48521, term48521.getClass(), "parent", null);
        setField(term48451, term48451.getClass(), "parent", term48521);
        term48816 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term48816, term48816.getClass(), "compiler", null);
        setField(term48816, term48816.getClass(), "preprocessorSymbolTable", null);
        setField(term48816, term48816.getClass(), "transformationHandler", null);
        term48817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48817, term48817.getClass(), "type", 105);
        setField(term48817, term48817.getClass(), "next", null);
        setField(term48817, term48817.getClass(), "first", null);
        setField(term48817, term48817.getClass(), "last", null);
        setField(term48817, term48817.getClass(), "propListHead", null);
        setIntField(term48817, term48817.getClass(), "sourcePosition", 0);
        setField(term48817, term48817.getClass(), "jsType", null);
        setIntField(term48818, term48818.getClass(), "type", 0);
        setField(term48818, term48818.getClass(), "next", null);
        setField(term48818, term48818.getClass(), "first", null);
        setField(term48818, term48818.getClass(), "last", null);
        setField(term48818, term48818.getClass(), "propListHead", null);
        setIntField(term48818, term48818.getClass(), "sourcePosition", 0);
        setField(term48818, term48818.getClass(), "jsType", null);
        setField(term48818, term48818.getClass(), "parent", null);
        setField(term48817, term48817.getClass(), "parent", term48818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term48451;
        callMethod(klass, "process", argTypes, term48381, args);
        assertTrue(recursiveEquals(term48381, term48816));
        assertTrue(recursiveEquals(term48451, null));
    }

};


