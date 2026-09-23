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

public class TypeInference_traverseReturn_94528842306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748263;
     Object term748333;

    public TypeInference_traverseReturn_94528842306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term748263 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term748333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term748403, term748403.getClass(), "type", 9);
        setIntField(term748473, term748473.getClass(), "type", 9);
        setIntField(term748543, term748543.getClass(), "type", 9);
        setIntField(term748613, term748613.getClass(), "type", 9);
        setIntField(term748683, term748683.getClass(), "type", 9);
        setIntField(term748753, term748753.getClass(), "type", 9);
        setIntField(term748823, term748823.getClass(), "type", 9);
        setIntField(term748893, term748893.getClass(), "type", 9);
        setIntField(term748963, term748963.getClass(), "type", 9);
        setIntField(term749033, term749033.getClass(), "type", 9);
        setIntField(term749103, term749103.getClass(), "type", 9);
        setIntField(term749173, term749173.getClass(), "type", 9);
        setIntField(term749243, term749243.getClass(), "type", 9);
        setIntField(term749313, term749313.getClass(), "type", 9);
        setIntField(term749383, term749383.getClass(), "type", 9);
        setIntField(term749453, term749453.getClass(), "type", 9);
        setIntField(term749523, term749523.getClass(), "type", 9);
        setIntField(term749593, term749593.getClass(), "type", 9);
        setIntField(term749663, term749663.getClass(), "type", 9);
        setIntField(term749733, term749733.getClass(), "type", 9);
        setIntField(term749803, term749803.getClass(), "type", 9);
        setIntField(term749873, term749873.getClass(), "type", 28);
        setField(term749803, term749803.getClass(), "first", term749873);
        setField(term749733, term749733.getClass(), "first", term749803);
        setField(term749663, term749663.getClass(), "first", term749733);
        setField(term749593, term749593.getClass(), "first", term749663);
        setField(term749523, term749523.getClass(), "first", term749593);
        setField(term749453, term749453.getClass(), "first", term749523);
        setField(term749383, term749383.getClass(), "first", term749453);
        setField(term749313, term749313.getClass(), "first", term749383);
        setField(term749243, term749243.getClass(), "first", term749313);
        setField(term749173, term749173.getClass(), "first", term749243);
        setField(term749103, term749103.getClass(), "first", term749173);
        setField(term749033, term749033.getClass(), "first", term749103);
        setField(term748963, term748963.getClass(), "first", term749033);
        setField(term748893, term748893.getClass(), "first", term748963);
        setField(term748823, term748823.getClass(), "first", term748893);
        setField(term748753, term748753.getClass(), "first", term748823);
        setField(term748683, term748683.getClass(), "first", term748753);
        setField(term748613, term748613.getClass(), "first", term748683);
        setField(term748543, term748543.getClass(), "first", term748613);
        setField(term748473, term748473.getClass(), "first", term748543);
        setField(term748403, term748403.getClass(), "first", term748473);
        setField(term748333, term748333.getClass(), "first", term748403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term748333;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term748263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


