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

public class ProcessCommonJSModules_process_62786604799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43338;
     Object term43430;
     Object term44009;
     Object term44010;

    public ProcessCommonJSModules_process_62786604799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43338 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term43338, term43338.getClass(), "compiler", null);
        term43430 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term43522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term43592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43684 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term43430, term43430.getClass(), "type", 33);
        setField(term43430, term43430.getClass(), "parent", null);
        setField(term43592, term43592.getClass(), "next", null);
        setIntField(term43592, term43592.getClass(), "type", 0);
        setField(term43592, term43592.getClass(), "first", null);
        setField(term43522, term43522.getClass(), "next", term43592);
        setIntField(term43522, term43522.getClass(), "type", 37);
        setField(term43684, term43684.getClass(), "next", null);
        setIntField(term43684, term43684.getClass(), "type", 0);
        setField(term43684, term43684.getClass(), "first", null);
        setField(term43522, term43522.getClass(), "first", term43684);
        setField(term43430, term43430.getClass(), "first", term43522);
        term44009 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term44009, term44009.getClass(), "compiler", null);
        setField(term44009, term44009.getClass(), "filenamePrefix", null);
        setBooleanField(term44009, term44009.getClass(), "reportDependencies", false);
        setField(term44009, term44009.getClass(), "module", null);
        term44010 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term44011 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term44012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44013 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term44010, term44010.getClass(), "number", 0.0);
        setIntField(term44010, term44010.getClass(), "type", 33);
        setField(term44010, term44010.getClass(), "next", null);
        setDoubleField(term44011, term44011.getClass(), "number", 0.0);
        setIntField(term44011, term44011.getClass(), "type", 37);
        setIntField(term44012, term44012.getClass(), "type", 0);
        setField(term44012, term44012.getClass(), "next", null);
        setField(term44012, term44012.getClass(), "first", null);
        setField(term44012, term44012.getClass(), "last", null);
        setField(term44012, term44012.getClass(), "propListHead", null);
        setIntField(term44012, term44012.getClass(), "sourcePosition", 0);
        setField(term44012, term44012.getClass(), "jsType", null);
        setField(term44012, term44012.getClass(), "parent", null);
        setField(term44011, term44011.getClass(), "next", term44012);
        setDoubleField(term44013, term44013.getClass(), "number", 0.0);
        setIntField(term44013, term44013.getClass(), "type", 0);
        setField(term44013, term44013.getClass(), "next", null);
        setField(term44013, term44013.getClass(), "first", null);
        setField(term44013, term44013.getClass(), "last", null);
        setField(term44013, term44013.getClass(), "propListHead", null);
        setIntField(term44013, term44013.getClass(), "sourcePosition", 0);
        setField(term44013, term44013.getClass(), "jsType", null);
        setField(term44013, term44013.getClass(), "parent", null);
        setField(term44011, term44011.getClass(), "first", term44013);
        setField(term44011, term44011.getClass(), "last", null);
        setField(term44011, term44011.getClass(), "propListHead", null);
        setIntField(term44011, term44011.getClass(), "sourcePosition", 0);
        setField(term44011, term44011.getClass(), "jsType", null);
        setField(term44011, term44011.getClass(), "parent", null);
        setField(term44010, term44010.getClass(), "first", term44011);
        setField(term44010, term44010.getClass(), "last", null);
        setField(term44010, term44010.getClass(), "propListHead", null);
        setIntField(term44010, term44010.getClass(), "sourcePosition", 0);
        setField(term44010, term44010.getClass(), "jsType", null);
        setField(term44010, term44010.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term43430;
        callMethod(klass, "process", argTypes, term43338, args);
        assertTrue(recursiveEquals(term43338, term44009));
        assertTrue(recursiveEquals(term43430, null));
    }

};


