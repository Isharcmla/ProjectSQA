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
import java.lang.String;

public class ProcessCommonJSModules_process_627866047188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92710;
     Object term92802;
     Object term97283;

    public ProcessCommonJSModules_process_627866047188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92710 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term92710, term92710.getClass(), "compiler", null);
        term92802 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92894 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92986 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93148 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term92802, term92802.getClass(), "type", 0);
        setField(term92802, term92802.getClass(), "parent", null);
        setField(term92986, term92986.getClass(), "next", term93056);
        setIntField(term92986, term92986.getClass(), "type", 0);
        setField(term92986, term92986.getClass(), "first", null);
        setField(term92894, term92894.getClass(), "next", term92986);
        setIntField(term92894, term92894.getClass(), "type", 0);
        setField(term93148, term93148.getClass(), "next", null);
        setIntField(term93148, term93148.getClass(), "type", 37);
        setField(term93148, term93148.getClass(), "first", null);
        setField(term92894, term92894.getClass(), "first", term93148);
        setField(term92802, term92802.getClass(), "first", term92894);
        term97283 = Class.forName((String) "com.google.javascript.rhino.head.ast.PropertyGet");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term92802;
        callMethod(klass, "process", argTypes, term92710, args);
        assertTrue(recursiveEquals(term92802, null));
    }

};


