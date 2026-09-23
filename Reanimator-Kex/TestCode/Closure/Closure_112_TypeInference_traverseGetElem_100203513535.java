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

public class TypeInference_traverseGetElem_100203513535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2986862;
     Object term2986932;

    public TypeInference_traverseGetElem_100203513535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2986862 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2986932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2987982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2987002, term2987002.getClass(), "type", 98);
        setField(term2987072, term2987072.getClass(), "next", term2987142);
        setIntField(term2987072, term2987072.getClass(), "type", 98);
        setField(term2987212, term2987212.getClass(), "next", term2987282);
        setIntField(term2987212, term2987212.getClass(), "type", 98);
        setField(term2987352, term2987352.getClass(), "next", term2987422);
        setIntField(term2987352, term2987352.getClass(), "type", 98);
        setField(term2987492, term2987492.getClass(), "next", term2987562);
        setIntField(term2987492, term2987492.getClass(), "type", 98);
        setField(term2987632, term2987632.getClass(), "next", term2987702);
        setIntField(term2987632, term2987632.getClass(), "type", 98);
        setField(term2987772, term2987772.getClass(), "next", term2987842);
        setIntField(term2987772, term2987772.getClass(), "type", 98);
        setField(term2987912, term2987912.getClass(), "next", term2987982);
        setIntField(term2987912, term2987912.getClass(), "type", 98);
        setField(term2988052, term2988052.getClass(), "next", term2988122);
        setIntField(term2988052, term2988052.getClass(), "type", 19);
        setField(term2987912, term2987912.getClass(), "first", term2988052);
        setField(term2987912, term2987912.getClass(), "last", term2988192);
        setField(term2987772, term2987772.getClass(), "first", term2987912);
        setField(term2987772, term2987772.getClass(), "last", term2988262);
        setField(term2987632, term2987632.getClass(), "first", term2987772);
        setField(term2987632, term2987632.getClass(), "last", term2988332);
        setField(term2987492, term2987492.getClass(), "first", term2987632);
        setField(term2987492, term2987492.getClass(), "last", term2988402);
        setField(term2987352, term2987352.getClass(), "first", term2987492);
        setField(term2987352, term2987352.getClass(), "last", term2988472);
        setField(term2987212, term2987212.getClass(), "first", term2987352);
        setField(term2987212, term2987212.getClass(), "last", term2988542);
        setField(term2987072, term2987072.getClass(), "first", term2987212);
        setField(term2987072, term2987072.getClass(), "last", term2988612);
        setField(term2987002, term2987002.getClass(), "first", term2987072);
        setField(term2987002, term2987002.getClass(), "last", term2988682);
        setField(term2986932, term2986932.getClass(), "first", term2987002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2986932;
        args[1] = null;
        callMethod(klass, "traverseGetElem", argTypes, term2986862, args);
    }

};


