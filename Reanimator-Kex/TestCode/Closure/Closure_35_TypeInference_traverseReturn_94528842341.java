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

public class TypeInference_traverseReturn_94528842341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1207857;
     Object term1207927;

    public TypeInference_traverseReturn_94528842341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1207857 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1207927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1207997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1207997, term1207997.getClass(), "type", 9);
        setIntField(term1208067, term1208067.getClass(), "type", 9);
        setIntField(term1208137, term1208137.getClass(), "type", 9);
        setIntField(term1208207, term1208207.getClass(), "type", 9);
        setIntField(term1208277, term1208277.getClass(), "type", 9);
        setIntField(term1208347, term1208347.getClass(), "type", 9);
        setIntField(term1208417, term1208417.getClass(), "type", 9);
        setIntField(term1208487, term1208487.getClass(), "type", 9);
        setIntField(term1208557, term1208557.getClass(), "type", 9);
        setIntField(term1208627, term1208627.getClass(), "type", 9);
        setIntField(term1208697, term1208697.getClass(), "type", 9);
        setIntField(term1208767, term1208767.getClass(), "type", 9);
        setIntField(term1208837, term1208837.getClass(), "type", 9);
        setIntField(term1208907, term1208907.getClass(), "type", 9);
        setIntField(term1208977, term1208977.getClass(), "type", 9);
        setIntField(term1209047, term1209047.getClass(), "type", 9);
        setIntField(term1209117, term1209117.getClass(), "type", 121);
        setField(term1209047, term1209047.getClass(), "first", term1209117);
        setField(term1208977, term1208977.getClass(), "first", term1209047);
        setField(term1208907, term1208907.getClass(), "first", term1208977);
        setField(term1208837, term1208837.getClass(), "first", term1208907);
        setField(term1208767, term1208767.getClass(), "first", term1208837);
        setField(term1208697, term1208697.getClass(), "first", term1208767);
        setField(term1208627, term1208627.getClass(), "first", term1208697);
        setField(term1208557, term1208557.getClass(), "first", term1208627);
        setField(term1208487, term1208487.getClass(), "first", term1208557);
        setField(term1208417, term1208417.getClass(), "first", term1208487);
        setField(term1208347, term1208347.getClass(), "first", term1208417);
        setField(term1208277, term1208277.getClass(), "first", term1208347);
        setField(term1208207, term1208207.getClass(), "first", term1208277);
        setField(term1208137, term1208137.getClass(), "first", term1208207);
        setField(term1208067, term1208067.getClass(), "first", term1208137);
        setField(term1207997, term1207997.getClass(), "first", term1208067);
        setField(term1207927, term1207927.getClass(), "first", term1207997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1207927;
        args[1] = null;
        callMethod(klass, "traverseReturn", argTypes, term1207857, args);
    }

};


