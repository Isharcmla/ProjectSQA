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

public class ProcessCommonJSModules_process_627866047233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120467;
     Object term120559;

    public ProcessCommonJSModules_process_627866047233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120467 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term120467, term120467.getClass(), "compiler", null);
        term120559 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term120651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term120743 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term120835 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term120927 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term120559, term120559.getClass(), "type", 37);
        setField(term120559, term120559.getClass(), "parent", null);
        setField(term120835, term120835.getClass(), "next", null);
        setIntField(term120835, term120835.getClass(), "type", 0);
        setField(term120835, term120835.getClass(), "first", null);
        setField(term120743, term120743.getClass(), "next", term120835);
        setIntField(term120743, term120743.getClass(), "type", 37);
        setField(term120743, term120743.getClass(), "first", null);
        setField(term120651, term120651.getClass(), "next", term120743);
        setIntField(term120651, term120651.getClass(), "type", 0);
        setField(term120927, term120927.getClass(), "next", null);
        setIntField(term120927, term120927.getClass(), "type", 37);
        setField(term120927, term120927.getClass(), "first", null);
        setField(term120651, term120651.getClass(), "first", term120927);
        setField(term120559, term120559.getClass(), "first", term120651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term120559;
        callMethod(klass, "process", argTypes, term120467, args);
    }

};


