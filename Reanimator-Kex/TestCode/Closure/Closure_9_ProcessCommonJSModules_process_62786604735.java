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

public class ProcessCommonJSModules_process_62786604735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7056;
     Object term7126;
     Object term7756;
     Object term7757;

    public ProcessCommonJSModules_process_62786604735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7056 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term7056, term7056.getClass(), "compiler", null);
        term7126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7126, term7126.getClass(), "type", 0);
        setField(term7126, term7126.getClass(), "parent", null);
        setField(term7266, term7266.getClass(), "next", term7336);
        setIntField(term7266, term7266.getClass(), "type", 0);
        setField(term7266, term7266.getClass(), "first", null);
        setField(term7196, term7196.getClass(), "next", term7266);
        setIntField(term7196, term7196.getClass(), "type", 0);
        setField(term7406, term7406.getClass(), "next", null);
        setIntField(term7406, term7406.getClass(), "type", 0);
        setField(term7406, term7406.getClass(), "first", null);
        setField(term7196, term7196.getClass(), "first", term7406);
        setField(term7126, term7126.getClass(), "first", term7196);
        term7756 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term7756, term7756.getClass(), "compiler", null);
        setField(term7756, term7756.getClass(), "filenamePrefix", null);
        setBooleanField(term7756, term7756.getClass(), "reportDependencies", false);
        setField(term7756, term7756.getClass(), "module", null);
        term7757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7757, term7757.getClass(), "type", 0);
        setField(term7757, term7757.getClass(), "next", null);
        setIntField(term7758, term7758.getClass(), "type", 0);
        setIntField(term7759, term7759.getClass(), "type", 0);
        setIntField(term7760, term7760.getClass(), "type", 0);
        setField(term7760, term7760.getClass(), "next", null);
        setField(term7760, term7760.getClass(), "first", null);
        setField(term7760, term7760.getClass(), "last", null);
        setField(term7760, term7760.getClass(), "propListHead", null);
        setIntField(term7760, term7760.getClass(), "sourcePosition", 0);
        setField(term7760, term7760.getClass(), "jsType", null);
        setField(term7760, term7760.getClass(), "parent", null);
        setField(term7759, term7759.getClass(), "next", term7760);
        setField(term7759, term7759.getClass(), "first", null);
        setField(term7759, term7759.getClass(), "last", null);
        setField(term7759, term7759.getClass(), "propListHead", null);
        setIntField(term7759, term7759.getClass(), "sourcePosition", 0);
        setField(term7759, term7759.getClass(), "jsType", null);
        setField(term7759, term7759.getClass(), "parent", null);
        setField(term7758, term7758.getClass(), "next", term7759);
        setIntField(term7761, term7761.getClass(), "type", 0);
        setField(term7761, term7761.getClass(), "next", null);
        setField(term7761, term7761.getClass(), "first", null);
        setField(term7761, term7761.getClass(), "last", null);
        setField(term7761, term7761.getClass(), "propListHead", null);
        setIntField(term7761, term7761.getClass(), "sourcePosition", 0);
        setField(term7761, term7761.getClass(), "jsType", null);
        setField(term7761, term7761.getClass(), "parent", null);
        setField(term7758, term7758.getClass(), "first", term7761);
        setField(term7758, term7758.getClass(), "last", null);
        setField(term7758, term7758.getClass(), "propListHead", null);
        setIntField(term7758, term7758.getClass(), "sourcePosition", 0);
        setField(term7758, term7758.getClass(), "jsType", null);
        setField(term7758, term7758.getClass(), "parent", null);
        setField(term7757, term7757.getClass(), "first", term7758);
        setField(term7757, term7757.getClass(), "last", null);
        setField(term7757, term7757.getClass(), "propListHead", null);
        setIntField(term7757, term7757.getClass(), "sourcePosition", 0);
        setField(term7757, term7757.getClass(), "jsType", null);
        setField(term7757, term7757.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7126;
        callMethod(klass, "process", argTypes, term7056, args);
        assertTrue(recursiveEquals(term7056, term7756));
        assertTrue(recursiveEquals(term7126, null));
    }

};


