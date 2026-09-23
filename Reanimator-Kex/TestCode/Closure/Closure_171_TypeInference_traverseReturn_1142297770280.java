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

public class TypeInference_traverseReturn_1142297770280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517194;
     Object term517264;

    public TypeInference_traverseReturn_1142297770280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term517194 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term517264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term517334, term517334.getClass(), "type", 29);
        setIntField(term517404, term517404.getClass(), "type", 29);
        setIntField(term517474, term517474.getClass(), "type", 29);
        setIntField(term517544, term517544.getClass(), "type", 29);
        setIntField(term517614, term517614.getClass(), "type", 29);
        setIntField(term517684, term517684.getClass(), "type", 29);
        setIntField(term517754, term517754.getClass(), "type", 29);
        setIntField(term517824, term517824.getClass(), "type", 29);
        setIntField(term517894, term517894.getClass(), "type", 29);
        setIntField(term517964, term517964.getClass(), "type", 29);
        setIntField(term518034, term518034.getClass(), "type", 29);
        setIntField(term518104, term518104.getClass(), "type", 29);
        setIntField(term518174, term518174.getClass(), "type", 29);
        setIntField(term518244, term518244.getClass(), "type", 29);
        setIntField(term518314, term518314.getClass(), "type", 29);
        setIntField(term518384, term518384.getClass(), "type", 29);
        setIntField(term518454, term518454.getClass(), "type", 29);
        setIntField(term518524, term518524.getClass(), "type", 81);
        setField(term518454, term518454.getClass(), "first", term518524);
        setField(term518384, term518384.getClass(), "first", term518454);
        setField(term518314, term518314.getClass(), "first", term518384);
        setField(term518244, term518244.getClass(), "first", term518314);
        setField(term518174, term518174.getClass(), "first", term518244);
        setField(term518104, term518104.getClass(), "first", term518174);
        setField(term518034, term518034.getClass(), "first", term518104);
        setField(term517964, term517964.getClass(), "first", term518034);
        setField(term517894, term517894.getClass(), "first", term517964);
        setField(term517824, term517824.getClass(), "first", term517894);
        setField(term517754, term517754.getClass(), "first", term517824);
        setField(term517684, term517684.getClass(), "first", term517754);
        setField(term517614, term517614.getClass(), "first", term517684);
        setField(term517544, term517544.getClass(), "first", term517614);
        setField(term517474, term517474.getClass(), "first", term517544);
        setField(term517404, term517404.getClass(), "first", term517474);
        setField(term517334, term517334.getClass(), "first", term517404);
        setField(term517264, term517264.getClass(), "first", term517334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term517264;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term517194, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


