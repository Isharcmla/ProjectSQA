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
import java.lang.Object;

public class ProcessCommonJSModules_process_62786604790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47939;
     Object term48089;

    public ProcessCommonJSModules_process_62786604790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47939 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term48019 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term47939, term47939.getClass(), "compiler", term48019);
        term48089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48181 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term48089, term48089.getClass(), "type", 0);
        setField(term48089, term48089.getClass(), "parent", null);
        setField(term48181, term48181.getClass(), "next", term48181);
        setIntField(term48181, term48181.getClass(), "type", 37);
        setField(term48273, term48273.getClass(), "next", null);
        setIntField(term48273, term48273.getClass(), "type", 0);
        setField(term48273, term48273.getClass(), "first", null);
        setField(term48181, term48181.getClass(), "first", term48273);
        setField(term48089, term48089.getClass(), "first", term48181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term48089;
        callMethod(klass, "process", argTypes, term47939, args);
    }

};


