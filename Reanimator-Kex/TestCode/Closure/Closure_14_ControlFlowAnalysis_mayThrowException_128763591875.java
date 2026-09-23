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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ControlFlowAnalysis_mayThrowException_128763591875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3228;

    public ControlFlowAnalysis_mayThrowException_128763591875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3228, term3228.getClass(), "type", 1902624392);
        setIntField(term3230, term3230.getClass(), "type", 904607217);
        setIntField(term3232, term3232.getClass(), "type", 434914590);
        setIntField(term3234, term3234.getClass(), "type", 1983756621);
        setIntField(term3236, term3236.getClass(), "type", -2134711835);
        setField(term3236, term3236.getClass(), "next", null);
        setField(term3236, term3236.getClass(), "first", null);
        setField(term3236, term3236.getClass(), "last", null);
        setField(term3236, term3236.getClass(), "propListHead", null);
        setIntField(term3236, term3236.getClass(), "sourcePosition", 0);
        setField(term3236, term3236.getClass(), "jsType", null);
        setField(term3236, term3236.getClass(), "parent", null);
        setField(term3234, term3234.getClass(), "next", term3236);
        setIntField(term3239, term3239.getClass(), "type", -1641244494);
        setField(term3239, term3239.getClass(), "next", null);
        setField(term3239, term3239.getClass(), "first", null);
        setField(term3239, term3239.getClass(), "last", term3236);
        setField(term3239, term3239.getClass(), "propListHead", null);
        setIntField(term3239, term3239.getClass(), "sourcePosition", 0);
        setField(term3239, term3239.getClass(), "jsType", null);
        setField(term3239, term3239.getClass(), "parent", null);
        setField(term3234, term3234.getClass(), "first", term3239);
        setField(term3234, term3234.getClass(), "last", term3232);
        setField(term3234, term3234.getClass(), "propListHead", null);
        setIntField(term3234, term3234.getClass(), "sourcePosition", 0);
        setField(term3234, term3234.getClass(), "jsType", null);
        setField(term3234, term3234.getClass(), "parent", null);
        setField(term3232, term3232.getClass(), "next", term3234);
        setField(term3232, term3232.getClass(), "first", term3236);
        setIntField(term3243, term3243.getClass(), "type", -489441521);
        setIntField(term3245, term3245.getClass(), "type", 225873732);
        setField(term3245, term3245.getClass(), "next", null);
        setField(term3245, term3245.getClass(), "first", term3239);
        setField(term3245, term3245.getClass(), "last", term3234);
        setField(term3245, term3245.getClass(), "propListHead", null);
        setIntField(term3245, term3245.getClass(), "sourcePosition", 0);
        setField(term3245, term3245.getClass(), "jsType", null);
        setField(term3245, term3245.getClass(), "parent", null);
        setField(term3243, term3243.getClass(), "next", term3245);
        setField(term3243, term3243.getClass(), "first", term3230);
        setField(term3243, term3243.getClass(), "last", term3230);
        setField(term3243, term3243.getClass(), "propListHead", null);
        setIntField(term3243, term3243.getClass(), "sourcePosition", 0);
        setField(term3243, term3243.getClass(), "jsType", null);
        setField(term3243, term3243.getClass(), "parent", null);
        setField(term3232, term3232.getClass(), "last", term3243);
        setField(term3232, term3232.getClass(), "propListHead", null);
        setIntField(term3232, term3232.getClass(), "sourcePosition", 0);
        setField(term3232, term3232.getClass(), "jsType", null);
        setField(term3232, term3232.getClass(), "parent", null);
        setField(term3230, term3230.getClass(), "next", term3232);
        setIntField(term3250, term3250.getClass(), "type", 529879356);
        setField(term3250, term3250.getClass(), "next", term3243);
        setField(term3250, term3250.getClass(), "first", term3245);
        setField(term3250, term3250.getClass(), "last", term3228);
        setField(term3250, term3250.getClass(), "propListHead", null);
        setIntField(term3250, term3250.getClass(), "sourcePosition", 0);
        setField(term3250, term3250.getClass(), "jsType", null);
        setField(term3250, term3250.getClass(), "parent", null);
        setField(term3230, term3230.getClass(), "first", term3250);
        setField(term3230, term3230.getClass(), "last", term3250);
        setField(term3230, term3230.getClass(), "propListHead", null);
        setIntField(term3230, term3230.getClass(), "sourcePosition", 0);
        setField(term3230, term3230.getClass(), "jsType", null);
        setField(term3230, term3230.getClass(), "parent", null);
        setField(term3228, term3228.getClass(), "next", term3230);
        setField(term3228, term3228.getClass(), "first", term3234);
        setField(term3228, term3228.getClass(), "last", term3236);
        setField(term3228, term3228.getClass(), "propListHead", null);
        setIntField(term3228, term3228.getClass(), "sourcePosition", 0);
        setField(term3228, term3228.getClass(), "jsType", null);
        setField(term3228, term3228.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3228;
        try {
            callMethod(klass, "mayThrowException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


