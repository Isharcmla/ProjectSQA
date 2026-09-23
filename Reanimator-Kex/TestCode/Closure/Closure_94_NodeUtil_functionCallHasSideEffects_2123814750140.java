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

public class NodeUtil_functionCallHasSideEffects_2123814750140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;

    public NodeUtil_functionCallHasSideEffects_2123814750140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term556 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term566 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term543, term543.getClass(), "type", -1022990421);
        setIntField(term545, term545.getClass(), "type", -1254072822);
        setIntField(term547, term547.getClass(), "type", 0);
        setField(term547, term547.getClass(), "next", null);
        setField(term547, term547.getClass(), "first", null);
        setField(term547, term547.getClass(), "last", null);
        setField(term547, term547.getClass(), "propListHead", null);
        setIntField(term547, term547.getClass(), "sourcePosition", 0);
        setField(term547, term547.getClass(), "jsType", null);
        setField(term547, term547.getClass(), "parent", null);
        setField(term545, term545.getClass(), "next", term547);
        setIntField(term550, term550.getClass(), "type", 0);
        setField(term550, term550.getClass(), "next", null);
        setField(term550, term550.getClass(), "first", null);
        setField(term550, term550.getClass(), "last", null);
        setField(term550, term550.getClass(), "propListHead", null);
        setIntField(term550, term550.getClass(), "sourcePosition", 0);
        setField(term550, term550.getClass(), "jsType", null);
        setField(term550, term550.getClass(), "parent", null);
        setField(term545, term545.getClass(), "first", term550);
        setIntField(term553, term553.getClass(), "type", 0);
        setField(term553, term553.getClass(), "next", null);
        setField(term553, term553.getClass(), "first", null);
        setField(term553, term553.getClass(), "last", null);
        setField(term553, term553.getClass(), "propListHead", null);
        setIntField(term553, term553.getClass(), "sourcePosition", 0);
        setField(term553, term553.getClass(), "jsType", null);
        setField(term553, term553.getClass(), "parent", null);
        setField(term545, term545.getClass(), "last", term553);
        setField(term556, term556.getClass(), "next", null);
        setIntField(term556, term556.getClass(), "type", 0);
        setIntField(term556, term556.getClass(), "intValue", 0);
        setField(term556, term556.getClass(), "objectValue", null);
        setField(term545, term545.getClass(), "propListHead", term556);
        setIntField(term545, term545.getClass(), "sourcePosition", 479531250);
        setField(term545, term545.getClass(), "jsType", null);
        setField(term545, term545.getClass(), "parent", null);
        setField(term543, term543.getClass(), "next", term545);
        setIntField(term560, term560.getClass(), "type", 0);
        setField(term560, term560.getClass(), "next", null);
        setField(term560, term560.getClass(), "first", null);
        setField(term560, term560.getClass(), "last", null);
        setField(term560, term560.getClass(), "propListHead", null);
        setIntField(term560, term560.getClass(), "sourcePosition", 0);
        setField(term560, term560.getClass(), "jsType", null);
        setField(term560, term560.getClass(), "parent", null);
        setField(term543, term543.getClass(), "first", term560);
        setIntField(term563, term563.getClass(), "type", 0);
        setField(term563, term563.getClass(), "next", null);
        setField(term563, term563.getClass(), "first", null);
        setField(term563, term563.getClass(), "last", null);
        setField(term563, term563.getClass(), "propListHead", null);
        setIntField(term563, term563.getClass(), "sourcePosition", 0);
        setField(term563, term563.getClass(), "jsType", null);
        setField(term563, term563.getClass(), "parent", null);
        setField(term543, term543.getClass(), "last", term563);
        setField(term566, term566.getClass(), "next", null);
        setIntField(term566, term566.getClass(), "type", 0);
        setIntField(term566, term566.getClass(), "intValue", 0);
        setField(term566, term566.getClass(), "objectValue", null);
        setField(term543, term543.getClass(), "propListHead", term566);
        setIntField(term543, term543.getClass(), "sourcePosition", 1320570890);
        setField(term543, term543.getClass(), "jsType", null);
        setField(term543, term543.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term543;
        args[1] = null;
        try {
            callMethod(klass, "functionCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


