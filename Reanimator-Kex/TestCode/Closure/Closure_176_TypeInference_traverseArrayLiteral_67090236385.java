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

public class TypeInference_traverseArrayLiteral_67090236385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1395031;
     Object term1395101;

    public TypeInference_traverseArrayLiteral_67090236385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1395031 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1395101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1395171, term1395171.getClass(), "type", 83);
        setIntField(term1395241, term1395241.getClass(), "type", 83);
        setIntField(term1395311, term1395311.getClass(), "type", 83);
        setIntField(term1395381, term1395381.getClass(), "type", 83);
        setIntField(term1395451, term1395451.getClass(), "type", 83);
        setIntField(term1395521, term1395521.getClass(), "type", 83);
        setIntField(term1395591, term1395591.getClass(), "type", 83);
        setIntField(term1395661, term1395661.getClass(), "type", 83);
        setIntField(term1395731, term1395731.getClass(), "type", 83);
        setIntField(term1395801, term1395801.getClass(), "type", 83);
        setIntField(term1395871, term1395871.getClass(), "type", 83);
        setIntField(term1395941, term1395941.getClass(), "type", 83);
        setIntField(term1396011, term1396011.getClass(), "type", 83);
        setIntField(term1396081, term1396081.getClass(), "type", 83);
        setIntField(term1396151, term1396151.getClass(), "type", 83);
        setIntField(term1396221, term1396221.getClass(), "type", 83);
        setIntField(term1396291, term1396291.getClass(), "type", 83);
        setIntField(term1396361, term1396361.getClass(), "type", 83);
        setIntField(term1396431, term1396431.getClass(), "type", 83);
        setIntField(term1396501, term1396501.getClass(), "type", 83);
        setIntField(term1396571, term1396571.getClass(), "type", 83);
        setIntField(term1396641, term1396641.getClass(), "type", 83);
        setIntField(term1396711, term1396711.getClass(), "type", 83);
        setIntField(term1396781, term1396781.getClass(), "type", 57);
        setField(term1396711, term1396711.getClass(), "first", term1396781);
        setField(term1396641, term1396641.getClass(), "first", term1396711);
        setField(term1396571, term1396571.getClass(), "first", term1396641);
        setField(term1396501, term1396501.getClass(), "first", term1396571);
        setField(term1396431, term1396431.getClass(), "first", term1396501);
        setField(term1396361, term1396361.getClass(), "first", term1396431);
        setField(term1396291, term1396291.getClass(), "first", term1396361);
        setField(term1396221, term1396221.getClass(), "first", term1396291);
        setField(term1396151, term1396151.getClass(), "first", term1396221);
        setField(term1396081, term1396081.getClass(), "first", term1396151);
        setField(term1396011, term1396011.getClass(), "first", term1396081);
        setField(term1395941, term1395941.getClass(), "first", term1396011);
        setField(term1395871, term1395871.getClass(), "first", term1395941);
        setField(term1395801, term1395801.getClass(), "first", term1395871);
        setField(term1395731, term1395731.getClass(), "first", term1395801);
        setField(term1395661, term1395661.getClass(), "first", term1395731);
        setField(term1395591, term1395591.getClass(), "first", term1395661);
        setField(term1395521, term1395521.getClass(), "first", term1395591);
        setField(term1395451, term1395451.getClass(), "first", term1395521);
        setField(term1395381, term1395381.getClass(), "first", term1395451);
        setField(term1395311, term1395311.getClass(), "first", term1395381);
        setField(term1395241, term1395241.getClass(), "first", term1395311);
        setField(term1395171, term1395171.getClass(), "first", term1395241);
        setField(term1395101, term1395101.getClass(), "first", term1395171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1395101;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1395031, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


