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

public class TypeInference_traverseReturn_1142297770359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895112;
     Object term895182;

    public TypeInference_traverseReturn_1142297770359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term895112 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term895182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term896022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term896092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term896162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term896232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term895252, term895252.getClass(), "type", 92);
        setIntField(term895322, term895322.getClass(), "type", 92);
        setIntField(term895392, term895392.getClass(), "type", 92);
        setIntField(term895462, term895462.getClass(), "type", 92);
        setIntField(term895532, term895532.getClass(), "type", 92);
        setIntField(term895602, term895602.getClass(), "type", 92);
        setIntField(term895672, term895672.getClass(), "type", 92);
        setIntField(term895742, term895742.getClass(), "type", 92);
        setIntField(term895812, term895812.getClass(), "type", 92);
        setIntField(term895882, term895882.getClass(), "type", 92);
        setIntField(term895952, term895952.getClass(), "type", 92);
        setIntField(term896022, term896022.getClass(), "type", 92);
        setIntField(term896092, term896092.getClass(), "type", 92);
        setIntField(term896162, term896162.getClass(), "type", 92);
        setIntField(term896232, term896232.getClass(), "type", 73);
        setField(term896162, term896162.getClass(), "first", term896232);
        setField(term896092, term896092.getClass(), "first", term896162);
        setField(term896022, term896022.getClass(), "first", term896092);
        setField(term895952, term895952.getClass(), "first", term896022);
        setField(term895882, term895882.getClass(), "first", term895952);
        setField(term895812, term895812.getClass(), "first", term895882);
        setField(term895742, term895742.getClass(), "first", term895812);
        setField(term895672, term895672.getClass(), "first", term895742);
        setField(term895602, term895602.getClass(), "first", term895672);
        setField(term895532, term895532.getClass(), "first", term895602);
        setField(term895462, term895462.getClass(), "first", term895532);
        setField(term895392, term895392.getClass(), "first", term895462);
        setField(term895322, term895322.getClass(), "first", term895392);
        setField(term895252, term895252.getClass(), "first", term895322);
        setField(term895182, term895182.getClass(), "first", term895252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term895182;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term895112, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


