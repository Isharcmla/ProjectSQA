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

public class ProcessCommonJSModules_process_627866047197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100501;
     Object term100651;

    public ProcessCommonJSModules_process_627866047197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100501 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term100581 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term100501, term100501.getClass(), "compiler", term100581);
        term100651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term100651, term100651.getClass(), "type", 37);
        setField(term100651, term100651.getClass(), "parent", null);
        setField(term100791, term100791.getClass(), "next", null);
        setIntField(term100791, term100791.getClass(), "type", 0);
        setField(term100791, term100791.getClass(), "first", null);
        setField(term100721, term100721.getClass(), "next", term100791);
        setIntField(term100721, term100721.getClass(), "type", 33);
        setField(term100861, term100861.getClass(), "next", null);
        setIntField(term100861, term100861.getClass(), "type", 0);
        setField(term100861, term100861.getClass(), "first", null);
        setField(term100721, term100721.getClass(), "first", term100861);
        setField(term100651, term100651.getClass(), "first", term100721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term100651;
        callMethod(klass, "process", argTypes, term100501, args);
    }

};


