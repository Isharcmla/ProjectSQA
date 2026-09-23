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

public class ProcessCommonJSModules_process_627866047327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170798;
     Object term170890;
     Object term171955;
     Object term171956;

    public ProcessCommonJSModules_process_627866047327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170798 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term170798, term170798.getClass(), "compiler", null);
        term170890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term171144 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171236 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171328 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171420 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term170890, term170890.getClass(), "type", 0);
        setField(term170890, term170890.getClass(), "parent", null);
        setField(term170982, term170982.getClass(), "next", term171052);
        setIntField(term170982, term170982.getClass(), "type", 0);
        setField(term171328, term171328.getClass(), "next", term171420);
        setIntField(term171328, term171328.getClass(), "type", 37);
        setField(term171328, term171328.getClass(), "first", null);
        setField(term171236, term171236.getClass(), "next", term171328);
        setIntField(term171236, term171236.getClass(), "type", 37);
        setField(term171236, term171236.getClass(), "first", null);
        setField(term171144, term171144.getClass(), "next", term171236);
        setIntField(term171144, term171144.getClass(), "type", 0);
        setField(term171144, term171144.getClass(), "first", null);
        setField(term170982, term170982.getClass(), "first", term171144);
        setField(term170890, term170890.getClass(), "first", term170982);
        term171955 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term171955, term171955.getClass(), "compiler", null);
        setField(term171955, term171955.getClass(), "filenamePrefix", null);
        setBooleanField(term171955, term171955.getClass(), "reportDependencies", false);
        setField(term171955, term171955.getClass(), "module", null);
        term171956 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171957 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term171959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171960 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171961 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term171956, term171956.getClass(), "number", 0.0);
        setIntField(term171956, term171956.getClass(), "type", 0);
        setField(term171956, term171956.getClass(), "next", null);
        setDoubleField(term171957, term171957.getClass(), "number", 0.0);
        setIntField(term171957, term171957.getClass(), "type", 0);
        setIntField(term171958, term171958.getClass(), "type", 0);
        setField(term171958, term171958.getClass(), "next", null);
        setField(term171958, term171958.getClass(), "first", null);
        setField(term171958, term171958.getClass(), "last", null);
        setField(term171958, term171958.getClass(), "propListHead", null);
        setIntField(term171958, term171958.getClass(), "sourcePosition", 0);
        setField(term171958, term171958.getClass(), "jsType", null);
        setField(term171958, term171958.getClass(), "parent", null);
        setField(term171957, term171957.getClass(), "next", term171958);
        setDoubleField(term171959, term171959.getClass(), "number", 0.0);
        setIntField(term171959, term171959.getClass(), "type", 0);
        setDoubleField(term171960, term171960.getClass(), "number", 0.0);
        setIntField(term171960, term171960.getClass(), "type", 37);
        setDoubleField(term171961, term171961.getClass(), "number", 0.0);
        setIntField(term171961, term171961.getClass(), "type", 37);
        setField(term171961, term171961.getClass(), "next", null);
        setField(term171961, term171961.getClass(), "first", null);
        setField(term171961, term171961.getClass(), "last", null);
        setField(term171961, term171961.getClass(), "propListHead", null);
        setIntField(term171961, term171961.getClass(), "sourcePosition", 0);
        setField(term171961, term171961.getClass(), "jsType", null);
        setField(term171961, term171961.getClass(), "parent", null);
        setField(term171960, term171960.getClass(), "next", term171961);
        setField(term171960, term171960.getClass(), "first", null);
        setField(term171960, term171960.getClass(), "last", null);
        setField(term171960, term171960.getClass(), "propListHead", null);
        setIntField(term171960, term171960.getClass(), "sourcePosition", 0);
        setField(term171960, term171960.getClass(), "jsType", null);
        setField(term171960, term171960.getClass(), "parent", null);
        setField(term171959, term171959.getClass(), "next", term171960);
        setField(term171959, term171959.getClass(), "first", null);
        setField(term171959, term171959.getClass(), "last", null);
        setField(term171959, term171959.getClass(), "propListHead", null);
        setIntField(term171959, term171959.getClass(), "sourcePosition", 0);
        setField(term171959, term171959.getClass(), "jsType", null);
        setField(term171959, term171959.getClass(), "parent", null);
        setField(term171957, term171957.getClass(), "first", term171959);
        setField(term171957, term171957.getClass(), "last", null);
        setField(term171957, term171957.getClass(), "propListHead", null);
        setIntField(term171957, term171957.getClass(), "sourcePosition", 0);
        setField(term171957, term171957.getClass(), "jsType", null);
        setField(term171957, term171957.getClass(), "parent", null);
        setField(term171956, term171956.getClass(), "first", term171957);
        setField(term171956, term171956.getClass(), "last", null);
        setField(term171956, term171956.getClass(), "propListHead", null);
        setIntField(term171956, term171956.getClass(), "sourcePosition", 0);
        setField(term171956, term171956.getClass(), "jsType", null);
        setField(term171956, term171956.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term170890;
        callMethod(klass, "process", argTypes, term170798, args);
        assertTrue(recursiveEquals(term170798, term171955));
        assertTrue(recursiveEquals(term170890, null));
    }

};


