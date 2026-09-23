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

public class ProcessCommonJSModules_process_627866047299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154096;
     Object term154268;

    public ProcessCommonJSModules_process_627866047299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154096 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term154176 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term154096, term154096.getClass(), "compiler", term154176);
        term154268 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term154360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term154452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term154522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term154614 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term154268, term154268.getClass(), "type", 0);
        setField(term154268, term154268.getClass(), "parent", null);
        setField(term154522, term154522.getClass(), "next", term154522);
        setIntField(term154522, term154522.getClass(), "type", 33);
        setField(term154522, term154522.getClass(), "first", null);
        setField(term154452, term154452.getClass(), "next", term154522);
        setIntField(term154452, term154452.getClass(), "type", 37);
        setField(term154452, term154452.getClass(), "first", null);
        setField(term154360, term154360.getClass(), "next", term154452);
        setIntField(term154360, term154360.getClass(), "type", 37);
        setField(term154614, term154614.getClass(), "next", null);
        setIntField(term154614, term154614.getClass(), "type", 0);
        setField(term154614, term154614.getClass(), "first", null);
        setField(term154360, term154360.getClass(), "first", term154614);
        setField(term154268, term154268.getClass(), "first", term154360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term154268;
        callMethod(klass, "process", argTypes, term154096, args);
    }

};


