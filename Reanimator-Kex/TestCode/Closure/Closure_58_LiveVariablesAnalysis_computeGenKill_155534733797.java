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

public class LiveVariablesAnalysis_computeGenKill_155534733797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54978;
     Object term55048;
     Object term114677;
     Object term114678;

    public LiveVariablesAnalysis_computeGenKill_155534733797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54978 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term55048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55048, term55048.getClass(), "type", 108);
        setIntField(term55118, term55118.getClass(), "type", 118);
        setField(term55048, term55048.getClass(), "first", term55118);
        term114677 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term114677, term114677.getClass(), "jsScope", null);
        setField(term114677, term114677.getClass(), "escaped", null);
        setField(term114677, term114677.getClass(), "cfg", null);
        setField(term114677, term114677.getClass(), "joinOp", null);
        setField(term114677, term114677.getClass(), "orderedWorkSet", null);
        term114678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term114678, term114678.getClass(), "type", 108);
        setField(term114678, term114678.getClass(), "next", null);
        setIntField(term114679, term114679.getClass(), "type", 118);
        setField(term114679, term114679.getClass(), "next", null);
        setField(term114679, term114679.getClass(), "first", null);
        setField(term114679, term114679.getClass(), "last", null);
        setField(term114679, term114679.getClass(), "propListHead", null);
        setIntField(term114679, term114679.getClass(), "sourcePosition", 0);
        setField(term114679, term114679.getClass(), "jsType", null);
        setField(term114679, term114679.getClass(), "parent", null);
        setField(term114678, term114678.getClass(), "first", term114679);
        setField(term114678, term114678.getClass(), "last", null);
        setField(term114678, term114678.getClass(), "propListHead", null);
        setIntField(term114678, term114678.getClass(), "sourcePosition", 0);
        setField(term114678, term114678.getClass(), "jsType", null);
        setField(term114678, term114678.getClass(), "parent", null);
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
        args[0] = term55048;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term54978, args);
        assertTrue(recursiveEquals(term54978, term114677));
        assertTrue(recursiveEquals(term55048, term114678));
    }

};


