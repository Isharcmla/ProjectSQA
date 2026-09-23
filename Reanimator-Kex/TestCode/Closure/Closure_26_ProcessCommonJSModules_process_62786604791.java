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

public class ProcessCommonJSModules_process_62786604791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48603;
     Object term48775;

    public ProcessCommonJSModules_process_62786604791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48603 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term48683 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term48603, term48603.getClass(), "compiler", term48683);
        term48775 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term48867 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term48937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48775, term48775.getClass(), "type", 33);
        setField(term48775, term48775.getClass(), "parent", null);
        setField(term48937, term48937.getClass(), "next", null);
        setIntField(term48937, term48937.getClass(), "type", 0);
        setField(term48937, term48937.getClass(), "first", null);
        setField(term48867, term48867.getClass(), "next", term48937);
        setIntField(term48867, term48867.getClass(), "type", 0);
        setField(term48867, term48867.getClass(), "first", null);
        setField(term48775, term48775.getClass(), "first", term48867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term48775;
        callMethod(klass, "process", argTypes, term48603, args);
    }

};


