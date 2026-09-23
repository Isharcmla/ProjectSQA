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

public class ProcessCommonJSModules_process_627866047258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132532;
     Object term132602;
     Object term133689;
     Object term133690;

    public ProcessCommonJSModules_process_627866047258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132532 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term132532, term132532.getClass(), "compiler", null);
        term132602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term132602, term132602.getClass(), "type", 0);
        setField(term132602, term132602.getClass(), "parent", null);
        setField(term132742, term132742.getClass(), "next", null);
        setIntField(term132742, term132742.getClass(), "type", 37);
        setField(term132742, term132742.getClass(), "first", null);
        setField(term132672, term132672.getClass(), "next", term132742);
        setIntField(term132672, term132672.getClass(), "type", 0);
        setField(term132882, term132882.getClass(), "next", null);
        setIntField(term132882, term132882.getClass(), "type", 0);
        setField(term132882, term132882.getClass(), "first", null);
        setField(term132812, term132812.getClass(), "next", term132882);
        setIntField(term132812, term132812.getClass(), "type", 37);
        setField(term132812, term132812.getClass(), "first", null);
        setField(term132672, term132672.getClass(), "first", term132812);
        setField(term132602, term132602.getClass(), "first", term132672);
        term133689 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term133689, term133689.getClass(), "compiler", null);
        setField(term133689, term133689.getClass(), "filenamePrefix", null);
        setBooleanField(term133689, term133689.getClass(), "reportDependencies", false);
        setField(term133689, term133689.getClass(), "module", null);
        term133690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term133690, term133690.getClass(), "type", 0);
        setField(term133690, term133690.getClass(), "next", null);
        setIntField(term133691, term133691.getClass(), "type", 0);
        setField(term133691, term133691.getClass(), "next", false);
        setIntField(term133692, term133692.getClass(), "type", 37);
        setIntField(term133693, term133693.getClass(), "type", 0);
        setField(term133693, term133693.getClass(), "next", null);
        setField(term133693, term133693.getClass(), "first", null);
        setField(term133693, term133693.getClass(), "last", null);
        setField(term133693, term133693.getClass(), "propListHead", null);
        setIntField(term133693, term133693.getClass(), "sourcePosition", 0);
        setField(term133693, term133693.getClass(), "jsType", null);
        setField(term133693, term133693.getClass(), "parent", null);
        setField(term133692, term133692.getClass(), "next", term133693);
        setField(term133692, term133692.getClass(), "first", null);
        setField(term133692, term133692.getClass(), "last", null);
        setField(term133692, term133692.getClass(), "propListHead", null);
        setIntField(term133692, term133692.getClass(), "sourcePosition", 0);
        setField(term133692, term133692.getClass(), "jsType", null);
        setField(term133692, term133692.getClass(), "parent", null);
        setField(term133691, term133691.getClass(), "first", term133692);
        setField(term133691, term133691.getClass(), "last", null);
        setField(term133691, term133691.getClass(), "propListHead", null);
        setIntField(term133691, term133691.getClass(), "sourcePosition", 0);
        setField(term133691, term133691.getClass(), "jsType", null);
        setField(term133691, term133691.getClass(), "parent", null);
        setField(term133690, term133690.getClass(), "first", term133691);
        setField(term133690, term133690.getClass(), "last", null);
        setField(term133690, term133690.getClass(), "propListHead", null);
        setIntField(term133690, term133690.getClass(), "sourcePosition", 0);
        setField(term133690, term133690.getClass(), "jsType", null);
        setField(term133690, term133690.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term132602;
        callMethod(klass, "process", argTypes, term132532, args);
        assertTrue(recursiveEquals(term132532, term133689));
        assertTrue(recursiveEquals(term132602, null));
    }

};


