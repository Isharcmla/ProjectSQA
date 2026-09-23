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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194993;
     Object term195143;

    public ProcessCommonJSModules_process_627866047366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194993 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term195073 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term194993, term194993.getClass(), "compiler", term195073);
        term195143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term195235 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term195397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195489 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195581 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term195143, term195143.getClass(), "type", 0);
        setField(term195143, term195143.getClass(), "parent", null);
        setField(term195235, term195235.getClass(), "next", term195305);
        setIntField(term195235, term195235.getClass(), "type", 0);
        setField(term195581, term195581.getClass(), "next", term195651);
        setIntField(term195581, term195581.getClass(), "type", 33);
        setField(term195581, term195581.getClass(), "first", null);
        setField(term195489, term195489.getClass(), "next", term195581);
        setIntField(term195489, term195489.getClass(), "type", 37);
        setField(term195489, term195489.getClass(), "first", null);
        setField(term195397, term195397.getClass(), "next", term195489);
        setIntField(term195397, term195397.getClass(), "type", 37);
        setField(term195397, term195397.getClass(), "first", null);
        setField(term195235, term195235.getClass(), "first", term195397);
        setField(term195143, term195143.getClass(), "first", term195235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term195143;
        try {
            callMethod(klass, "process", argTypes, term194993, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


