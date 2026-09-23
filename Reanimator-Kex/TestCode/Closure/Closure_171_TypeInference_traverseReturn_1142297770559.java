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

public class TypeInference_traverseReturn_1142297770559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1806888;
     Object term1806958;

    public TypeInference_traverseReturn_1142297770559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1806888 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1806958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1808008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1808078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1808148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1808218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1808288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1807028, term1807028.getClass(), "type", 92);
        setIntField(term1807098, term1807098.getClass(), "type", 92);
        setIntField(term1807168, term1807168.getClass(), "type", 92);
        setIntField(term1807238, term1807238.getClass(), "type", 92);
        setIntField(term1807308, term1807308.getClass(), "type", 92);
        setIntField(term1807378, term1807378.getClass(), "type", 92);
        setIntField(term1807448, term1807448.getClass(), "type", 92);
        setIntField(term1807518, term1807518.getClass(), "type", 92);
        setIntField(term1807588, term1807588.getClass(), "type", 92);
        setIntField(term1807658, term1807658.getClass(), "type", 92);
        setIntField(term1807728, term1807728.getClass(), "type", 92);
        setIntField(term1807798, term1807798.getClass(), "type", 92);
        setIntField(term1807868, term1807868.getClass(), "type", 92);
        setIntField(term1807938, term1807938.getClass(), "type", 92);
        setIntField(term1808008, term1808008.getClass(), "type", 92);
        setIntField(term1808078, term1808078.getClass(), "type", 92);
        setIntField(term1808148, term1808148.getClass(), "type", 92);
        setIntField(term1808218, term1808218.getClass(), "type", 92);
        setIntField(term1808288, term1808288.getClass(), "type", 147);
        setField(term1808218, term1808218.getClass(), "first", term1808288);
        setField(term1808148, term1808148.getClass(), "first", term1808218);
        setField(term1808078, term1808078.getClass(), "first", term1808148);
        setField(term1808008, term1808008.getClass(), "first", term1808078);
        setField(term1807938, term1807938.getClass(), "first", term1808008);
        setField(term1807868, term1807868.getClass(), "first", term1807938);
        setField(term1807798, term1807798.getClass(), "first", term1807868);
        setField(term1807728, term1807728.getClass(), "first", term1807798);
        setField(term1807658, term1807658.getClass(), "first", term1807728);
        setField(term1807588, term1807588.getClass(), "first", term1807658);
        setField(term1807518, term1807518.getClass(), "first", term1807588);
        setField(term1807448, term1807448.getClass(), "first", term1807518);
        setField(term1807378, term1807378.getClass(), "first", term1807448);
        setField(term1807308, term1807308.getClass(), "first", term1807378);
        setField(term1807238, term1807238.getClass(), "first", term1807308);
        setField(term1807168, term1807168.getClass(), "first", term1807238);
        setField(term1807098, term1807098.getClass(), "first", term1807168);
        setField(term1807028, term1807028.getClass(), "first", term1807098);
        setField(term1806958, term1806958.getClass(), "first", term1807028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1806958;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1806888, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


