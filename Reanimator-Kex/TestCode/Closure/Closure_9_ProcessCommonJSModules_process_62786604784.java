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

public class ProcessCommonJSModules_process_62786604784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33353;
     Object term33445;
     Object term34713;
     Object term34714;

    public ProcessCommonJSModules_process_62786604784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33353 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term33353, term33353.getClass(), "compiler", null);
        term33445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term33537 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term33607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term33445, term33445.getClass(), "type", 33);
        setField(term33445, term33445.getClass(), "parent", null);
        setField(term33607, term33607.getClass(), "next", null);
        setIntField(term33607, term33607.getClass(), "type", 0);
        setField(term33607, term33607.getClass(), "first", null);
        setField(term33537, term33537.getClass(), "next", term33607);
        setIntField(term33537, term33537.getClass(), "type", 37);
        setField(term33699, term33699.getClass(), "next", null);
        setIntField(term33699, term33699.getClass(), "type", 0);
        setField(term33699, term33699.getClass(), "first", null);
        setField(term33537, term33537.getClass(), "first", term33699);
        setField(term33445, term33445.getClass(), "first", term33537);
        term34713 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term34713, term34713.getClass(), "compiler", null);
        setField(term34713, term34713.getClass(), "filenamePrefix", null);
        setBooleanField(term34713, term34713.getClass(), "reportDependencies", false);
        setField(term34713, term34713.getClass(), "module", null);
        term34714 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term34715 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term34716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34717 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term34714, term34714.getClass(), "number", 0.0);
        setIntField(term34714, term34714.getClass(), "type", 33);
        setField(term34714, term34714.getClass(), "next", null);
        setDoubleField(term34715, term34715.getClass(), "number", 0.0);
        setIntField(term34715, term34715.getClass(), "type", 37);
        setIntField(term34716, term34716.getClass(), "type", 0);
        setField(term34716, term34716.getClass(), "next", null);
        setField(term34716, term34716.getClass(), "first", null);
        setField(term34716, term34716.getClass(), "last", null);
        setField(term34716, term34716.getClass(), "propListHead", null);
        setIntField(term34716, term34716.getClass(), "sourcePosition", 0);
        setField(term34716, term34716.getClass(), "jsType", null);
        setField(term34716, term34716.getClass(), "parent", null);
        setField(term34715, term34715.getClass(), "next", term34716);
        setDoubleField(term34717, term34717.getClass(), "number", 0.0);
        setIntField(term34717, term34717.getClass(), "type", 0);
        setField(term34717, term34717.getClass(), "next", null);
        setField(term34717, term34717.getClass(), "first", null);
        setField(term34717, term34717.getClass(), "last", null);
        setField(term34717, term34717.getClass(), "propListHead", null);
        setIntField(term34717, term34717.getClass(), "sourcePosition", 0);
        setField(term34717, term34717.getClass(), "jsType", null);
        setField(term34717, term34717.getClass(), "parent", null);
        setField(term34715, term34715.getClass(), "first", term34717);
        setField(term34715, term34715.getClass(), "last", null);
        setField(term34715, term34715.getClass(), "propListHead", null);
        setIntField(term34715, term34715.getClass(), "sourcePosition", 0);
        setField(term34715, term34715.getClass(), "jsType", null);
        setField(term34715, term34715.getClass(), "parent", null);
        setField(term34714, term34714.getClass(), "first", term34715);
        setField(term34714, term34714.getClass(), "last", null);
        setField(term34714, term34714.getClass(), "propListHead", null);
        setIntField(term34714, term34714.getClass(), "sourcePosition", 0);
        setField(term34714, term34714.getClass(), "jsType", null);
        setField(term34714, term34714.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term33445;
        callMethod(klass, "process", argTypes, term33353, args);
        assertTrue(recursiveEquals(term33353, term34713));
        assertTrue(recursiveEquals(term33445, null));
    }

};


