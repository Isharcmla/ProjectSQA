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

public class ProcessCommonJSModules_process_627866047163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79199;
     Object term79291;
     Object term79832;
     Object term79833;

    public ProcessCommonJSModules_process_627866047163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79199 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term79199, term79199.getClass(), "compiler", null);
        term79291 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term79361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term79291, term79291.getClass(), "type", 0);
        setField(term79291, term79291.getClass(), "parent", null);
        setField(term79361, term79361.getClass(), "next", term79431);
        setIntField(term79361, term79361.getClass(), "type", 33);
        setField(term79523, term79523.getClass(), "next", null);
        setIntField(term79523, term79523.getClass(), "type", 0);
        setField(term79523, term79523.getClass(), "first", null);
        setField(term79361, term79361.getClass(), "first", term79523);
        setField(term79291, term79291.getClass(), "first", term79361);
        term79832 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term79832, term79832.getClass(), "compiler", null);
        setField(term79832, term79832.getClass(), "filenamePrefix", null);
        setBooleanField(term79832, term79832.getClass(), "reportDependencies", false);
        setField(term79832, term79832.getClass(), "module", null);
        term79833 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term79834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79836 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term79833, term79833.getClass(), "number", 0.0);
        setIntField(term79833, term79833.getClass(), "type", 0);
        setField(term79833, term79833.getClass(), "next", null);
        setIntField(term79834, term79834.getClass(), "type", 33);
        setIntField(term79835, term79835.getClass(), "type", 0);
        setField(term79835, term79835.getClass(), "next", null);
        setField(term79835, term79835.getClass(), "first", null);
        setField(term79835, term79835.getClass(), "last", null);
        setField(term79835, term79835.getClass(), "propListHead", null);
        setIntField(term79835, term79835.getClass(), "sourcePosition", 0);
        setField(term79835, term79835.getClass(), "jsType", null);
        setField(term79835, term79835.getClass(), "parent", null);
        setField(term79834, term79834.getClass(), "next", term79835);
        setDoubleField(term79836, term79836.getClass(), "number", 0.0);
        setIntField(term79836, term79836.getClass(), "type", 0);
        setField(term79836, term79836.getClass(), "next", null);
        setField(term79836, term79836.getClass(), "first", null);
        setField(term79836, term79836.getClass(), "last", null);
        setField(term79836, term79836.getClass(), "propListHead", null);
        setIntField(term79836, term79836.getClass(), "sourcePosition", 0);
        setField(term79836, term79836.getClass(), "jsType", null);
        setField(term79836, term79836.getClass(), "parent", null);
        setField(term79834, term79834.getClass(), "first", term79836);
        setField(term79834, term79834.getClass(), "last", null);
        setField(term79834, term79834.getClass(), "propListHead", null);
        setIntField(term79834, term79834.getClass(), "sourcePosition", 0);
        setField(term79834, term79834.getClass(), "jsType", null);
        setField(term79834, term79834.getClass(), "parent", null);
        setField(term79833, term79833.getClass(), "first", term79834);
        setField(term79833, term79833.getClass(), "last", null);
        setField(term79833, term79833.getClass(), "propListHead", null);
        setIntField(term79833, term79833.getClass(), "sourcePosition", 0);
        setField(term79833, term79833.getClass(), "jsType", null);
        setField(term79833, term79833.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term79291;
        callMethod(klass, "process", argTypes, term79199, args);
        assertTrue(recursiveEquals(term79199, term79832));
        assertTrue(recursiveEquals(term79291, null));
    }

};


