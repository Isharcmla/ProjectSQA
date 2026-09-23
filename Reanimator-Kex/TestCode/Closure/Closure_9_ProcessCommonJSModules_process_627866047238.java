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

public class ProcessCommonJSModules_process_627866047238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123219;
     Object term123369;

    public ProcessCommonJSModules_process_627866047238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123219 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term123299 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term123219, term123219.getClass(), "compiler", term123299);
        term123369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123369, term123369.getClass(), "type", 37);
        setField(term123369, term123369.getClass(), "parent", null);
        setField(term123509, term123509.getClass(), "next", null);
        setIntField(term123509, term123509.getClass(), "type", 0);
        setField(term123509, term123509.getClass(), "first", null);
        setField(term123439, term123439.getClass(), "next", term123509);
        setIntField(term123439, term123439.getClass(), "type", 0);
        setField(term123719, term123719.getClass(), "next", null);
        setIntField(term123719, term123719.getClass(), "type", 0);
        setField(term123719, term123719.getClass(), "first", null);
        setField(term123649, term123649.getClass(), "next", term123719);
        setIntField(term123649, term123649.getClass(), "type", 37);
        setField(term123649, term123649.getClass(), "first", null);
        setField(term123579, term123579.getClass(), "next", term123649);
        setIntField(term123579, term123579.getClass(), "type", 37);
        setField(term123579, term123579.getClass(), "first", null);
        setField(term123439, term123439.getClass(), "first", term123579);
        setField(term123369, term123369.getClass(), "first", term123439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term123369;
        callMethod(klass, "process", argTypes, term123219, args);
    }

};


