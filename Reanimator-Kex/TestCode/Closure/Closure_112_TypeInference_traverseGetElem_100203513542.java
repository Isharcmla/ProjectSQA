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

public class TypeInference_traverseGetElem_100203513542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2386877;
     Object term2386947;

    public TypeInference_traverseGetElem_100203513542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2386877 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2386947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2388067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2388137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2388207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2388277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2387017, term2387017.getClass(), "type", 98);
        setField(term2387087, term2387087.getClass(), "next", term2387157);
        setIntField(term2387087, term2387087.getClass(), "type", 98);
        setField(term2387227, term2387227.getClass(), "next", term2387297);
        setIntField(term2387227, term2387227.getClass(), "type", 98);
        setField(term2387367, term2387367.getClass(), "next", term2387437);
        setIntField(term2387367, term2387367.getClass(), "type", 98);
        setField(term2387507, term2387507.getClass(), "next", term2387577);
        setIntField(term2387507, term2387507.getClass(), "type", 98);
        setField(term2387647, term2387647.getClass(), "next", term2387717);
        setIntField(term2387647, term2387647.getClass(), "type", 98);
        setField(term2387787, term2387787.getClass(), "next", term2387857);
        setIntField(term2387787, term2387787.getClass(), "type", 34);
        setField(term2387647, term2387647.getClass(), "first", term2387787);
        setField(term2387647, term2387647.getClass(), "last", term2387927);
        setField(term2387507, term2387507.getClass(), "first", term2387647);
        setField(term2387507, term2387507.getClass(), "last", term2387997);
        setField(term2387367, term2387367.getClass(), "first", term2387507);
        setField(term2387367, term2387367.getClass(), "last", term2388067);
        setField(term2387227, term2387227.getClass(), "first", term2387367);
        setField(term2387227, term2387227.getClass(), "last", term2388137);
        setField(term2387087, term2387087.getClass(), "first", term2387227);
        setField(term2387087, term2387087.getClass(), "last", term2388207);
        setField(term2387017, term2387017.getClass(), "first", term2387087);
        setField(term2387017, term2387017.getClass(), "last", term2388277);
        setField(term2386947, term2386947.getClass(), "first", term2387017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2386947;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term2386877, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


