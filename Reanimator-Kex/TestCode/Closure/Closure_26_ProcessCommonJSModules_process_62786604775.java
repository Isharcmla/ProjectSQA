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

public class ProcessCommonJSModules_process_62786604775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40107;
     Object term40177;
     Object term40745;
     Object term40746;

    public ProcessCommonJSModules_process_62786604775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40107 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term40107, term40107.getClass(), "compiler", null);
        term40177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40177, term40177.getClass(), "type", 37);
        setField(term40177, term40177.getClass(), "parent", null);
        setField(term40317, term40317.getClass(), "next", null);
        setIntField(term40317, term40317.getClass(), "type", 0);
        setField(term40317, term40317.getClass(), "first", null);
        setField(term40247, term40247.getClass(), "next", term40317);
        setIntField(term40247, term40247.getClass(), "type", 0);
        setField(term40247, term40247.getClass(), "first", null);
        setField(term40177, term40177.getClass(), "first", term40247);
        term40745 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term40745, term40745.getClass(), "compiler", null);
        setField(term40745, term40745.getClass(), "filenamePrefix", null);
        setBooleanField(term40745, term40745.getClass(), "reportDependencies", false);
        setField(term40745, term40745.getClass(), "module", null);
        term40746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40746, term40746.getClass(), "type", 37);
        setField(term40746, term40746.getClass(), "next", null);
        setIntField(term40747, term40747.getClass(), "type", 0);
        setIntField(term40748, term40748.getClass(), "type", 0);
        setField(term40748, term40748.getClass(), "next", null);
        setField(term40748, term40748.getClass(), "first", null);
        setField(term40748, term40748.getClass(), "last", null);
        setField(term40748, term40748.getClass(), "propListHead", null);
        setIntField(term40748, term40748.getClass(), "sourcePosition", 0);
        setField(term40748, term40748.getClass(), "jsType", null);
        setField(term40748, term40748.getClass(), "parent", null);
        setField(term40747, term40747.getClass(), "next", term40748);
        setField(term40747, term40747.getClass(), "first", null);
        setField(term40747, term40747.getClass(), "last", null);
        setField(term40747, term40747.getClass(), "propListHead", null);
        setIntField(term40747, term40747.getClass(), "sourcePosition", 0);
        setField(term40747, term40747.getClass(), "jsType", null);
        setField(term40747, term40747.getClass(), "parent", null);
        setField(term40746, term40746.getClass(), "first", term40747);
        setField(term40746, term40746.getClass(), "last", null);
        setField(term40746, term40746.getClass(), "propListHead", null);
        setIntField(term40746, term40746.getClass(), "sourcePosition", 0);
        setField(term40746, term40746.getClass(), "jsType", null);
        setField(term40746, term40746.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term40177;
        callMethod(klass, "process", argTypes, term40107, args);
        assertTrue(recursiveEquals(term40107, term40745));
        assertTrue(recursiveEquals(term40177, null));
    }

};


