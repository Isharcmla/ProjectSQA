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

public class ProcessCommonJSModules_process_62786604763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22829;
     Object term22899;
     Object term23397;
     Object term23398;

    public ProcessCommonJSModules_process_62786604763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22829 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term22829, term22829.getClass(), "compiler", null);
        term22899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22899, term22899.getClass(), "type", 0);
        setField(term22899, term22899.getClass(), "parent", null);
        setField(term22969, term22969.getClass(), "next", term23039);
        setIntField(term22969, term22969.getClass(), "type", 37);
        setField(term23109, term23109.getClass(), "next", null);
        setIntField(term23109, term23109.getClass(), "type", 0);
        setField(term23109, term23109.getClass(), "first", null);
        setField(term22969, term22969.getClass(), "first", term23109);
        setField(term22899, term22899.getClass(), "first", term22969);
        term23397 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term23397, term23397.getClass(), "compiler", null);
        setField(term23397, term23397.getClass(), "filenamePrefix", null);
        setBooleanField(term23397, term23397.getClass(), "reportDependencies", false);
        setField(term23397, term23397.getClass(), "module", null);
        term23398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23398, term23398.getClass(), "type", 0);
        setField(term23398, term23398.getClass(), "next", null);
        setIntField(term23399, term23399.getClass(), "type", 37);
        setIntField(term23400, term23400.getClass(), "type", 0);
        setField(term23400, term23400.getClass(), "next", null);
        setField(term23400, term23400.getClass(), "first", null);
        setField(term23400, term23400.getClass(), "last", null);
        setField(term23400, term23400.getClass(), "propListHead", null);
        setIntField(term23400, term23400.getClass(), "sourcePosition", 0);
        setField(term23400, term23400.getClass(), "jsType", null);
        setField(term23400, term23400.getClass(), "parent", null);
        setField(term23399, term23399.getClass(), "next", term23400);
        setIntField(term23401, term23401.getClass(), "type", 0);
        setField(term23401, term23401.getClass(), "next", null);
        setField(term23401, term23401.getClass(), "first", null);
        setField(term23401, term23401.getClass(), "last", null);
        setField(term23401, term23401.getClass(), "propListHead", null);
        setIntField(term23401, term23401.getClass(), "sourcePosition", 0);
        setField(term23401, term23401.getClass(), "jsType", null);
        setField(term23401, term23401.getClass(), "parent", null);
        setField(term23399, term23399.getClass(), "first", term23401);
        setField(term23399, term23399.getClass(), "last", null);
        setField(term23399, term23399.getClass(), "propListHead", null);
        setIntField(term23399, term23399.getClass(), "sourcePosition", 0);
        setField(term23399, term23399.getClass(), "jsType", null);
        setField(term23399, term23399.getClass(), "parent", null);
        setField(term23398, term23398.getClass(), "first", term23399);
        setField(term23398, term23398.getClass(), "last", null);
        setField(term23398, term23398.getClass(), "propListHead", null);
        setIntField(term23398, term23398.getClass(), "sourcePosition", 0);
        setField(term23398, term23398.getClass(), "jsType", null);
        setField(term23398, term23398.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22899;
        callMethod(klass, "process", argTypes, term22829, args);
        assertTrue(recursiveEquals(term22829, term23397));
        assertTrue(recursiveEquals(term22899, null));
    }

};


