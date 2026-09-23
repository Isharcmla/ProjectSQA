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

public class ProcessCommonJSModules_process_62786604796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51774;
     Object term51924;

    public ProcessCommonJSModules_process_62786604796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51774 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term51854 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term51774, term51774.getClass(), "compiler", term51854);
        term51924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51924, term51924.getClass(), "type", 0);
        setField(term51924, term51924.getClass(), "parent", null);
        setField(term52064, term52064.getClass(), "next", term52134);
        setIntField(term52064, term52064.getClass(), "type", 37);
        setField(term52064, term52064.getClass(), "first", null);
        setField(term51994, term51994.getClass(), "next", term52064);
        setIntField(term51994, term51994.getClass(), "type", 0);
        setField(term52204, term52204.getClass(), "next", null);
        setIntField(term52204, term52204.getClass(), "type", 0);
        setField(term52204, term52204.getClass(), "first", null);
        setField(term51994, term51994.getClass(), "first", term52204);
        setField(term51924, term51924.getClass(), "first", term51994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term51924;
        callMethod(klass, "process", argTypes, term51774, args);
    }

};


