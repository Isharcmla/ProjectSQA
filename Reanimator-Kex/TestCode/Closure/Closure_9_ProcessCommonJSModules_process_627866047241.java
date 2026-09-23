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

public class ProcessCommonJSModules_process_627866047241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124514;
     Object term124606;
     Object term125368;
     Object term125369;

    public ProcessCommonJSModules_process_627866047241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124514 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term124514, term124514.getClass(), "compiler", null);
        term124606 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term124698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term124790 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term124882 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term124952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125044 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term124606, term124606.getClass(), "type", 37);
        setField(term124606, term124606.getClass(), "parent", null);
        setField(term124952, term124952.getClass(), "next", null);
        setIntField(term124952, term124952.getClass(), "type", 0);
        setField(term124952, term124952.getClass(), "first", null);
        setField(term124882, term124882.getClass(), "next", term124952);
        setIntField(term124882, term124882.getClass(), "type", 37);
        setField(term124882, term124882.getClass(), "first", null);
        setField(term124790, term124790.getClass(), "next", term124882);
        setIntField(term124790, term124790.getClass(), "type", 37);
        setField(term124790, term124790.getClass(), "first", null);
        setField(term124698, term124698.getClass(), "next", term124790);
        setIntField(term124698, term124698.getClass(), "type", 0);
        setField(term125044, term125044.getClass(), "next", null);
        setIntField(term125044, term125044.getClass(), "type", 0);
        setField(term125044, term125044.getClass(), "first", null);
        setField(term124698, term124698.getClass(), "first", term125044);
        setField(term124606, term124606.getClass(), "first", term124698);
        term125368 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term125368, term125368.getClass(), "compiler", null);
        setField(term125368, term125368.getClass(), "filenamePrefix", null);
        setBooleanField(term125368, term125368.getClass(), "reportDependencies", false);
        setField(term125368, term125368.getClass(), "module", null);
        term125369 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125370 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125371 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125372 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125374 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term125369, term125369.getClass(), "number", 0.0);
        setIntField(term125369, term125369.getClass(), "type", 37);
        setField(term125369, term125369.getClass(), "next", null);
        setDoubleField(term125370, term125370.getClass(), "number", 0.0);
        setIntField(term125370, term125370.getClass(), "type", 0);
        setDoubleField(term125371, term125371.getClass(), "number", 0.0);
        setIntField(term125371, term125371.getClass(), "type", 37);
        setDoubleField(term125372, term125372.getClass(), "number", 0.0);
        setIntField(term125372, term125372.getClass(), "type", 37);
        setIntField(term125373, term125373.getClass(), "type", 0);
        setField(term125373, term125373.getClass(), "next", null);
        setField(term125373, term125373.getClass(), "first", null);
        setField(term125373, term125373.getClass(), "last", null);
        setField(term125373, term125373.getClass(), "propListHead", null);
        setIntField(term125373, term125373.getClass(), "sourcePosition", 0);
        setField(term125373, term125373.getClass(), "jsType", null);
        setField(term125373, term125373.getClass(), "parent", null);
        setField(term125372, term125372.getClass(), "next", term125373);
        setField(term125372, term125372.getClass(), "first", null);
        setField(term125372, term125372.getClass(), "last", null);
        setField(term125372, term125372.getClass(), "propListHead", null);
        setIntField(term125372, term125372.getClass(), "sourcePosition", 0);
        setField(term125372, term125372.getClass(), "jsType", null);
        setField(term125372, term125372.getClass(), "parent", null);
        setField(term125371, term125371.getClass(), "next", term125372);
        setField(term125371, term125371.getClass(), "first", null);
        setField(term125371, term125371.getClass(), "last", null);
        setField(term125371, term125371.getClass(), "propListHead", null);
        setIntField(term125371, term125371.getClass(), "sourcePosition", 0);
        setField(term125371, term125371.getClass(), "jsType", null);
        setField(term125371, term125371.getClass(), "parent", null);
        setField(term125370, term125370.getClass(), "next", term125371);
        setDoubleField(term125374, term125374.getClass(), "number", 0.0);
        setIntField(term125374, term125374.getClass(), "type", 0);
        setField(term125374, term125374.getClass(), "next", null);
        setField(term125374, term125374.getClass(), "first", null);
        setField(term125374, term125374.getClass(), "last", null);
        setField(term125374, term125374.getClass(), "propListHead", null);
        setIntField(term125374, term125374.getClass(), "sourcePosition", 0);
        setField(term125374, term125374.getClass(), "jsType", null);
        setField(term125374, term125374.getClass(), "parent", null);
        setField(term125370, term125370.getClass(), "first", term125374);
        setField(term125370, term125370.getClass(), "last", null);
        setField(term125370, term125370.getClass(), "propListHead", null);
        setIntField(term125370, term125370.getClass(), "sourcePosition", 0);
        setField(term125370, term125370.getClass(), "jsType", null);
        setField(term125370, term125370.getClass(), "parent", null);
        setField(term125369, term125369.getClass(), "first", term125370);
        setField(term125369, term125369.getClass(), "last", null);
        setField(term125369, term125369.getClass(), "propListHead", null);
        setIntField(term125369, term125369.getClass(), "sourcePosition", 0);
        setField(term125369, term125369.getClass(), "jsType", null);
        setField(term125369, term125369.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term124606;
        callMethod(klass, "process", argTypes, term124514, args);
        assertTrue(recursiveEquals(term124514, term125368));
        assertTrue(recursiveEquals(term124606, null));
    }

};


