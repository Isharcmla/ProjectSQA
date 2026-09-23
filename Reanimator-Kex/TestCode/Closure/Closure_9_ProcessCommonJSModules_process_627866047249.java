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

public class ProcessCommonJSModules_process_627866047249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128865;
     Object term129037;

    public ProcessCommonJSModules_process_627866047249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128865 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term128945 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term128865, term128865.getClass(), "compiler", term128945);
        term129037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term129129 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term129037, term129037.getClass(), "type", 37);
        setField(term129037, term129037.getClass(), "parent", null);
        setField(term129129, term129129.getClass(), "next", null);
        setIntField(term129129, term129129.getClass(), "type", 0);
        setField(term129129, term129129.getClass(), "first", null);
        setField(term129037, term129037.getClass(), "first", term129129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term129037;
        callMethod(klass, "process", argTypes, term128865, args);
        assertTrue(recursiveEquals(term129037, null));
    }

};


