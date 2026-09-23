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

public class ProcessCommonJSModules_process_627866047274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140310;
     Object term140380;
     Object term141600;
     Object term141601;

    public ProcessCommonJSModules_process_627866047274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140310 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term140310, term140310.getClass(), "compiler", null);
        term140380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140380, term140380.getClass(), "type", 37);
        setField(term140380, term140380.getClass(), "parent", null);
        setField(term140520, term140520.getClass(), "next", null);
        setIntField(term140520, term140520.getClass(), "type", 0);
        setField(term140520, term140520.getClass(), "first", null);
        setField(term140450, term140450.getClass(), "next", term140520);
        setIntField(term140450, term140450.getClass(), "type", 33);
        setField(term140660, term140660.getClass(), "next", null);
        setIntField(term140660, term140660.getClass(), "type", 0);
        setField(term140660, term140660.getClass(), "first", null);
        setField(term140590, term140590.getClass(), "next", term140660);
        setIntField(term140590, term140590.getClass(), "type", 37);
        setField(term140590, term140590.getClass(), "first", null);
        setField(term140450, term140450.getClass(), "first", term140590);
        setField(term140380, term140380.getClass(), "first", term140450);
        term141600 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term141600, term141600.getClass(), "compiler", null);
        setField(term141600, term141600.getClass(), "filenamePrefix", null);
        setBooleanField(term141600, term141600.getClass(), "reportDependencies", false);
        setField(term141600, term141600.getClass(), "module", null);
        term141601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term141601, term141601.getClass(), "type", 37);
        setField(term141601, term141601.getClass(), "next", null);
        setIntField(term141602, term141602.getClass(), "type", 33);
        setIntField(term141603, term141603.getClass(), "type", 0);
        setField(term141603, term141603.getClass(), "next", null);
        setField(term141603, term141603.getClass(), "first", null);
        setField(term141603, term141603.getClass(), "last", null);
        setField(term141603, term141603.getClass(), "propListHead", null);
        setIntField(term141603, term141603.getClass(), "sourcePosition", 0);
        setField(term141603, term141603.getClass(), "jsType", null);
        setField(term141603, term141603.getClass(), "parent", null);
        setField(term141602, term141602.getClass(), "next", term141603);
        setIntField(term141604, term141604.getClass(), "type", 37);
        setIntField(term141605, term141605.getClass(), "type", 0);
        setField(term141605, term141605.getClass(), "next", null);
        setField(term141605, term141605.getClass(), "first", null);
        setField(term141605, term141605.getClass(), "last", null);
        setField(term141605, term141605.getClass(), "propListHead", null);
        setIntField(term141605, term141605.getClass(), "sourcePosition", 0);
        setField(term141605, term141605.getClass(), "jsType", null);
        setField(term141605, term141605.getClass(), "parent", null);
        setField(term141604, term141604.getClass(), "next", term141605);
        setField(term141604, term141604.getClass(), "first", null);
        setField(term141604, term141604.getClass(), "last", null);
        setField(term141604, term141604.getClass(), "propListHead", null);
        setIntField(term141604, term141604.getClass(), "sourcePosition", 0);
        setField(term141604, term141604.getClass(), "jsType", null);
        setField(term141604, term141604.getClass(), "parent", null);
        setField(term141602, term141602.getClass(), "first", term141604);
        setField(term141602, term141602.getClass(), "last", null);
        setField(term141602, term141602.getClass(), "propListHead", null);
        setIntField(term141602, term141602.getClass(), "sourcePosition", 0);
        setField(term141602, term141602.getClass(), "jsType", null);
        setField(term141602, term141602.getClass(), "parent", null);
        setField(term141601, term141601.getClass(), "first", term141602);
        setField(term141601, term141601.getClass(), "last", null);
        setField(term141601, term141601.getClass(), "propListHead", null);
        setIntField(term141601, term141601.getClass(), "sourcePosition", 0);
        setField(term141601, term141601.getClass(), "jsType", null);
        setField(term141601, term141601.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term140380;
        callMethod(klass, "process", argTypes, term140310, args);
        assertTrue(recursiveEquals(term140310, term141600));
        assertTrue(recursiveEquals(term140380, null));
    }

};


