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

public class LiveVariablesAnalysis_computeGenKill_155534733784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14288;
     Object term14358;
     Object term23452;
     Object term23453;

    public LiveVariablesAnalysis_computeGenKill_155534733784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14288 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term14358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14358, term14358.getClass(), "type", -344842608);
        setIntField(term14428, term14428.getClass(), "type", 125);
        setField(term14428, term14428.getClass(), "next", term14498);
        setField(term14358, term14358.getClass(), "first", term14428);
        term23452 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term23452, term23452.getClass(), "jsScope", null);
        setField(term23452, term23452.getClass(), "escaped", null);
        setField(term23452, term23452.getClass(), "cfg", null);
        setField(term23452, term23452.getClass(), "joinOp", null);
        setField(term23452, term23452.getClass(), "orderedWorkSet", null);
        term23453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23453, term23453.getClass(), "type", -344842608);
        setField(term23453, term23453.getClass(), "next", null);
        setIntField(term23454, term23454.getClass(), "type", 125);
        setIntField(term23455, term23455.getClass(), "type", 0);
        setField(term23455, term23455.getClass(), "next", null);
        setField(term23455, term23455.getClass(), "first", null);
        setField(term23455, term23455.getClass(), "last", null);
        setField(term23455, term23455.getClass(), "propListHead", null);
        setIntField(term23455, term23455.getClass(), "sourcePosition", 0);
        setField(term23455, term23455.getClass(), "jsType", null);
        setField(term23455, term23455.getClass(), "parent", null);
        setField(term23454, term23454.getClass(), "next", term23455);
        setField(term23454, term23454.getClass(), "first", null);
        setField(term23454, term23454.getClass(), "last", null);
        setField(term23454, term23454.getClass(), "propListHead", null);
        setIntField(term23454, term23454.getClass(), "sourcePosition", 0);
        setField(term23454, term23454.getClass(), "jsType", null);
        setField(term23454, term23454.getClass(), "parent", null);
        setField(term23453, term23453.getClass(), "first", term23454);
        setField(term23453, term23453.getClass(), "last", null);
        setField(term23453, term23453.getClass(), "propListHead", null);
        setIntField(term23453, term23453.getClass(), "sourcePosition", 0);
        setField(term23453, term23453.getClass(), "jsType", null);
        setField(term23453, term23453.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.BitSet");
        argTypes[2] = Class.forName("java.util.BitSet");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term14358;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term14288, args);
        assertTrue(recursiveEquals(term14288, term23452));
        assertTrue(recursiveEquals(term14358, term23453));
    }

};


