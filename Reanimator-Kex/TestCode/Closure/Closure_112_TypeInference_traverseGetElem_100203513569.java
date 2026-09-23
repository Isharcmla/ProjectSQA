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

public class TypeInference_traverseGetElem_100203513569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2569287;
     Object term2569357;

    public TypeInference_traverseGetElem_100203513569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2569287 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2569357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2569427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2569497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2569567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2569637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2569707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2569777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2569847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2569917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2569987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2571037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2571107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2571177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2571247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2571317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2571387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2571457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2571527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2569427, term2569427.getClass(), "type", 98);
        setField(term2569497, term2569497.getClass(), "next", null);
        setIntField(term2569497, term2569497.getClass(), "type", 98);
        setField(term2569567, term2569567.getClass(), "next", null);
        setIntField(term2569567, term2569567.getClass(), "type", 98);
        setField(term2569637, term2569637.getClass(), "next", null);
        setIntField(term2569637, term2569637.getClass(), "type", 98);
        setField(term2569707, term2569707.getClass(), "next", null);
        setIntField(term2569707, term2569707.getClass(), "type", 98);
        setField(term2569777, term2569777.getClass(), "next", null);
        setIntField(term2569777, term2569777.getClass(), "type", 98);
        setField(term2569847, term2569847.getClass(), "next", null);
        setIntField(term2569847, term2569847.getClass(), "type", 98);
        setField(term2569917, term2569917.getClass(), "next", null);
        setIntField(term2569917, term2569917.getClass(), "type", 98);
        setField(term2569987, term2569987.getClass(), "next", null);
        setIntField(term2569987, term2569987.getClass(), "type", 98);
        setField(term2570057, term2570057.getClass(), "next", null);
        setIntField(term2570057, term2570057.getClass(), "type", 98);
        setField(term2570127, term2570127.getClass(), "next", null);
        setIntField(term2570127, term2570127.getClass(), "type", 98);
        setField(term2570197, term2570197.getClass(), "next", null);
        setIntField(term2570197, term2570197.getClass(), "type", 98);
        setField(term2570267, term2570267.getClass(), "next", null);
        setIntField(term2570267, term2570267.getClass(), "type", 98);
        setField(term2570337, term2570337.getClass(), "next", null);
        setIntField(term2570337, term2570337.getClass(), "type", 98);
        setField(term2570407, term2570407.getClass(), "next", null);
        setIntField(term2570407, term2570407.getClass(), "type", 98);
        setField(term2570477, term2570477.getClass(), "next", null);
        setIntField(term2570477, term2570477.getClass(), "type", 98);
        setField(term2570547, term2570547.getClass(), "next", null);
        setIntField(term2570547, term2570547.getClass(), "type", 98);
        setField(term2570617, term2570617.getClass(), "next", null);
        setIntField(term2570617, term2570617.getClass(), "type", 98);
        setField(term2570687, term2570687.getClass(), "next", null);
        setIntField(term2570687, term2570687.getClass(), "type", 98);
        setField(term2570757, term2570757.getClass(), "next", null);
        setIntField(term2570757, term2570757.getClass(), "type", 98);
        setField(term2570827, term2570827.getClass(), "next", null);
        setIntField(term2570827, term2570827.getClass(), "type", 98);
        setField(term2570897, term2570897.getClass(), "next", null);
        setIntField(term2570897, term2570897.getClass(), "type", 98);
        setField(term2570967, term2570967.getClass(), "next", null);
        setIntField(term2570967, term2570967.getClass(), "type", 98);
        setField(term2571037, term2571037.getClass(), "next", null);
        setIntField(term2571037, term2571037.getClass(), "type", 98);
        setField(term2571107, term2571107.getClass(), "next", null);
        setIntField(term2571107, term2571107.getClass(), "type", 98);
        setField(term2571177, term2571177.getClass(), "next", null);
        setIntField(term2571177, term2571177.getClass(), "type", 98);
        setField(term2571247, term2571247.getClass(), "next", null);
        setIntField(term2571247, term2571247.getClass(), "type", 98);
        setField(term2571317, term2571317.getClass(), "next", null);
        setIntField(term2571317, term2571317.getClass(), "type", 98);
        setField(term2571387, term2571387.getClass(), "next", null);
        setIntField(term2571387, term2571387.getClass(), "type", 98);
        setField(term2571457, term2571457.getClass(), "next", null);
        setIntField(term2571457, term2571457.getClass(), "type", 98);
        setField(term2571527, term2571527.getClass(), "next", null);
        setIntField(term2571527, term2571527.getClass(), "type", 76);
        setField(term2571457, term2571457.getClass(), "first", term2571527);
        setField(term2571457, term2571457.getClass(), "last", null);
        setField(term2571387, term2571387.getClass(), "first", term2571457);
        setField(term2571387, term2571387.getClass(), "last", null);
        setField(term2571317, term2571317.getClass(), "first", term2571387);
        setField(term2571317, term2571317.getClass(), "last", null);
        setField(term2571247, term2571247.getClass(), "first", term2571317);
        setField(term2571247, term2571247.getClass(), "last", null);
        setField(term2571177, term2571177.getClass(), "first", term2571247);
        setField(term2571177, term2571177.getClass(), "last", null);
        setField(term2571107, term2571107.getClass(), "first", term2571177);
        setField(term2571107, term2571107.getClass(), "last", null);
        setField(term2571037, term2571037.getClass(), "first", term2571107);
        setField(term2571037, term2571037.getClass(), "last", null);
        setField(term2570967, term2570967.getClass(), "first", term2571037);
        setField(term2570967, term2570967.getClass(), "last", null);
        setField(term2570897, term2570897.getClass(), "first", term2570967);
        setField(term2570897, term2570897.getClass(), "last", null);
        setField(term2570827, term2570827.getClass(), "first", term2570897);
        setField(term2570827, term2570827.getClass(), "last", null);
        setField(term2570757, term2570757.getClass(), "first", term2570827);
        setField(term2570757, term2570757.getClass(), "last", null);
        setField(term2570687, term2570687.getClass(), "first", term2570757);
        setField(term2570687, term2570687.getClass(), "last", null);
        setField(term2570617, term2570617.getClass(), "first", term2570687);
        setField(term2570617, term2570617.getClass(), "last", null);
        setField(term2570547, term2570547.getClass(), "first", term2570617);
        setField(term2570547, term2570547.getClass(), "last", null);
        setField(term2570477, term2570477.getClass(), "first", term2570547);
        setField(term2570477, term2570477.getClass(), "last", null);
        setField(term2570407, term2570407.getClass(), "first", term2570477);
        setField(term2570407, term2570407.getClass(), "last", null);
        setField(term2570337, term2570337.getClass(), "first", term2570407);
        setField(term2570337, term2570337.getClass(), "last", null);
        setField(term2570267, term2570267.getClass(), "first", term2570337);
        setField(term2570267, term2570267.getClass(), "last", null);
        setField(term2570197, term2570197.getClass(), "first", term2570267);
        setField(term2570197, term2570197.getClass(), "last", null);
        setField(term2570127, term2570127.getClass(), "first", term2570197);
        setField(term2570127, term2570127.getClass(), "last", null);
        setField(term2570057, term2570057.getClass(), "first", term2570127);
        setField(term2570057, term2570057.getClass(), "last", null);
        setField(term2569987, term2569987.getClass(), "first", term2570057);
        setField(term2569987, term2569987.getClass(), "last", null);
        setField(term2569917, term2569917.getClass(), "first", term2569987);
        setField(term2569917, term2569917.getClass(), "last", null);
        setField(term2569847, term2569847.getClass(), "first", term2569917);
        setField(term2569847, term2569847.getClass(), "last", null);
        setField(term2569777, term2569777.getClass(), "first", term2569847);
        setField(term2569777, term2569777.getClass(), "last", null);
        setField(term2569707, term2569707.getClass(), "first", term2569777);
        setField(term2569707, term2569707.getClass(), "last", null);
        setField(term2569637, term2569637.getClass(), "first", term2569707);
        setField(term2569637, term2569637.getClass(), "last", null);
        setField(term2569567, term2569567.getClass(), "first", term2569637);
        setField(term2569567, term2569567.getClass(), "last", null);
        setField(term2569497, term2569497.getClass(), "first", term2569567);
        setField(term2569497, term2569497.getClass(), "last", null);
        setField(term2569427, term2569427.getClass(), "first", term2569497);
        setField(term2569427, term2569427.getClass(), "last", term2571527);
        setField(term2569357, term2569357.getClass(), "first", term2569427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2569357;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term2569287, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


