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

public class ScopedAliases_process_840655313103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61088;
     Object term61158;
     Object term61711;
     Object term61712;

    public ScopedAliases_process_840655313103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61088 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term61088, term61088.getClass(), "compiler", null);
        term61158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61158, term61158.getClass(), "type", 105);
        setField(term61158, term61158.getClass(), "parent", null);
        term61711 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term61711, term61711.getClass(), "compiler", null);
        setField(term61711, term61711.getClass(), "preprocessorSymbolTable", null);
        setField(term61711, term61711.getClass(), "transformationHandler", null);
        term61712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61712, term61712.getClass(), "type", 105);
        setField(term61712, term61712.getClass(), "next", null);
        setField(term61712, term61712.getClass(), "first", null);
        setField(term61712, term61712.getClass(), "last", null);
        setField(term61712, term61712.getClass(), "propListHead", null);
        setIntField(term61712, term61712.getClass(), "sourcePosition", 0);
        setField(term61712, term61712.getClass(), "jsType", null);
        setField(term61712, term61712.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term61158;
        callMethod(klass, "process", argTypes, term61088, args);
        assertTrue(recursiveEquals(term61088, term61711));
        assertTrue(recursiveEquals(term61158, null));
    }

};


