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

public class ProcessCommonJSModules_process_627866047103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45050;
     Object term45142;
     Object term46012;
     Object term46013;

    public ProcessCommonJSModules_process_627866047103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45050 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term45050, term45050.getClass(), "compiler", null);
        term45142 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term45234 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term45326 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term45142, term45142.getClass(), "type", 37);
        setField(term45142, term45142.getClass(), "parent", null);
        setField(term45326, term45326.getClass(), "next", null);
        setIntField(term45326, term45326.getClass(), "type", 0);
        setField(term45326, term45326.getClass(), "first", null);
        setField(term45234, term45234.getClass(), "next", term45326);
        setIntField(term45234, term45234.getClass(), "type", 0);
        setField(term45234, term45234.getClass(), "first", null);
        setField(term45142, term45142.getClass(), "first", term45234);
        term46012 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term46012, term46012.getClass(), "compiler", null);
        setField(term46012, term46012.getClass(), "filenamePrefix", null);
        setBooleanField(term46012, term46012.getClass(), "reportDependencies", false);
        setField(term46012, term46012.getClass(), "module", null);
        term46013 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46014 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term46013, term46013.getClass(), "number", 0.0);
        setIntField(term46013, term46013.getClass(), "type", 37);
        setField(term46013, term46013.getClass(), "next", null);
        setDoubleField(term46014, term46014.getClass(), "number", 0.0);
        setIntField(term46014, term46014.getClass(), "type", 0);
        setDoubleField(term46015, term46015.getClass(), "number", 0.0);
        setIntField(term46015, term46015.getClass(), "type", 0);
        setField(term46015, term46015.getClass(), "next", null);
        setField(term46015, term46015.getClass(), "first", null);
        setField(term46015, term46015.getClass(), "last", null);
        setField(term46015, term46015.getClass(), "propListHead", null);
        setIntField(term46015, term46015.getClass(), "sourcePosition", 0);
        setField(term46015, term46015.getClass(), "jsType", null);
        setField(term46015, term46015.getClass(), "parent", null);
        setField(term46014, term46014.getClass(), "next", term46015);
        setField(term46014, term46014.getClass(), "first", null);
        setField(term46014, term46014.getClass(), "last", null);
        setField(term46014, term46014.getClass(), "propListHead", null);
        setIntField(term46014, term46014.getClass(), "sourcePosition", 0);
        setField(term46014, term46014.getClass(), "jsType", null);
        setField(term46014, term46014.getClass(), "parent", null);
        setField(term46013, term46013.getClass(), "first", term46014);
        setField(term46013, term46013.getClass(), "last", null);
        setField(term46013, term46013.getClass(), "propListHead", null);
        setIntField(term46013, term46013.getClass(), "sourcePosition", 0);
        setField(term46013, term46013.getClass(), "jsType", null);
        setField(term46013, term46013.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term45142;
        callMethod(klass, "process", argTypes, term45050, args);
        assertTrue(recursiveEquals(term45050, term46012));
        assertTrue(recursiveEquals(term45142, null));
    }

};


