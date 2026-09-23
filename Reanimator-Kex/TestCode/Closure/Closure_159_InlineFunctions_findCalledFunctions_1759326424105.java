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
import java.util.HashSet;

public class InlineFunctions_findCalledFunctions_1759326424105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16944;
     Object term17014;
     Object term17202;

    public InlineFunctions_findCalledFunctions_1759326424105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16944 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term17014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17014, term17014.getClass(), "type", 0);
        setIntField(term17084, term17084.getClass(), "type", 0);
        setField(term17084, term17084.getClass(), "first", null);
        setIntField(term17154, term17154.getClass(), "type", 37);
        setField(term17084, term17084.getClass(), "next", term17154);
        setField(term17014, term17014.getClass(), "first", term17084);
        term17202 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term17014;
        args[1] = term17202;
        try {
            callMethod(klass, "findCalledFunctions", argTypes, term16944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


