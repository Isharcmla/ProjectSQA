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

public class TypedScopeCreator_createScope_26573221596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69626;
     Object term69696;
     Object term70050;

    public TypedScopeCreator_createScope_26573221596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69626 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term69626, term69626.getClass(), "compiler", null);
        term69696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69696, term69696.getClass(), "jsType", null);
        setIntField(term69696, term69696.getClass(), "type", 0);
        setField(term69696, term69696.getClass(), "parent", null);
        setField(term69906, term69906.getClass(), "next", null);
        setIntField(term69906, term69906.getClass(), "type", 47);
        setField(term69906, term69906.getClass(), "first", null);
        setField(term69836, term69836.getClass(), "next", term69906);
        setIntField(term69836, term69836.getClass(), "type", 0);
        setField(term69836, term69836.getClass(), "first", null);
        setField(term69836, term69836.getClass(), "parent", null);
        setField(term69766, term69766.getClass(), "next", term69836);
        setIntField(term69766, term69766.getClass(), "type", 0);
        setField(term69976, term69976.getClass(), "next", null);
        setIntField(term69976, term69976.getClass(), "type", 0);
        setField(term69976, term69976.getClass(), "first", null);
        setField(term69976, term69976.getClass(), "parent", null);
        setField(term69766, term69766.getClass(), "first", term69976);
        setField(term69766, term69766.getClass(), "parent", null);
        setField(term69696, term69696.getClass(), "first", term69766);
        term70050 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term70120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70050, term70050.getClass(), "rootNode", term70120);
        setField(term70050, term70050.getClass(), "thisType", null);
        setIntField(term70050, term70050.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term69696;
        args[1] = term70050;
        try {
            callMethod(klass, "createScope", argTypes, term69626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


