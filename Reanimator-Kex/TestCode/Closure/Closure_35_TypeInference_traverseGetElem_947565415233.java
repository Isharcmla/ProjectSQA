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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseGetElem_947565415233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327292;
     Object term327362;

    public TypeInference_traverseGetElem_947565415233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327292 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term327362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term327432, term327432.getClass(), "type", 21);
        setField(term327502, term327502.getClass(), "next", null);
        setIntField(term327502, term327502.getClass(), "type", 21);
        setField(term327572, term327572.getClass(), "next", null);
        setIntField(term327572, term327572.getClass(), "type", 21);
        setField(term327642, term327642.getClass(), "next", null);
        setIntField(term327642, term327642.getClass(), "type", 21);
        setField(term327712, term327712.getClass(), "next", null);
        setIntField(term327712, term327712.getClass(), "type", 21);
        setField(term327782, term327782.getClass(), "next", null);
        setIntField(term327782, term327782.getClass(), "type", 21);
        setField(term327852, term327852.getClass(), "next", null);
        setIntField(term327852, term327852.getClass(), "type", 21);
        setField(term327922, term327922.getClass(), "next", null);
        setIntField(term327922, term327922.getClass(), "type", 21);
        setField(term327992, term327992.getClass(), "next", null);
        setIntField(term327992, term327992.getClass(), "type", 21);
        setField(term328062, term328062.getClass(), "next", null);
        setIntField(term328062, term328062.getClass(), "type", 21);
        setField(term328132, term328132.getClass(), "next", null);
        setIntField(term328132, term328132.getClass(), "type", 21);
        setField(term328202, term328202.getClass(), "next", null);
        setIntField(term328202, term328202.getClass(), "type", 21);
        setField(term328272, term328272.getClass(), "next", null);
        setIntField(term328272, term328272.getClass(), "type", 21);
        setField(term328342, term328342.getClass(), "next", null);
        setIntField(term328342, term328342.getClass(), "type", 21);
        setField(term328412, term328412.getClass(), "next", null);
        setIntField(term328412, term328412.getClass(), "type", 21);
        setField(term328482, term328482.getClass(), "next", null);
        setIntField(term328482, term328482.getClass(), "type", 21);
        setField(term328552, term328552.getClass(), "next", null);
        setIntField(term328552, term328552.getClass(), "type", 21);
        setField(term328622, term328622.getClass(), "next", null);
        setIntField(term328622, term328622.getClass(), "type", 21);
        setField(term328692, term328692.getClass(), "next", null);
        setIntField(term328692, term328692.getClass(), "type", 21);
        setField(term328762, term328762.getClass(), "next", null);
        setIntField(term328762, term328762.getClass(), "type", 21);
        setField(term328832, term328832.getClass(), "next", null);
        setIntField(term328832, term328832.getClass(), "type", 21);
        setField(term328902, term328902.getClass(), "next", null);
        setIntField(term328902, term328902.getClass(), "type", 21);
        setField(term328902, term328902.getClass(), "first", term327362);
        setField(term328832, term328832.getClass(), "first", term328902);
        setField(term328762, term328762.getClass(), "first", term328832);
        setField(term328692, term328692.getClass(), "first", term328762);
        setField(term328622, term328622.getClass(), "first", term328692);
        setField(term328552, term328552.getClass(), "first", term328622);
        setField(term328482, term328482.getClass(), "first", term328552);
        setField(term328412, term328412.getClass(), "first", term328482);
        setField(term328342, term328342.getClass(), "first", term328412);
        setField(term328272, term328272.getClass(), "first", term328342);
        setField(term328202, term328202.getClass(), "first", term328272);
        setField(term328132, term328132.getClass(), "first", term328202);
        setField(term328062, term328062.getClass(), "first", term328132);
        setField(term327992, term327992.getClass(), "first", term328062);
        setField(term327922, term327922.getClass(), "first", term327992);
        setField(term327852, term327852.getClass(), "first", term327922);
        setField(term327782, term327782.getClass(), "first", term327852);
        setField(term327712, term327712.getClass(), "first", term327782);
        setField(term327642, term327642.getClass(), "first", term327712);
        setField(term327572, term327572.getClass(), "first", term327642);
        setField(term327502, term327502.getClass(), "first", term327572);
        setField(term327432, term327432.getClass(), "first", term327502);
        setField(term327362, term327362.getClass(), "first", term327432);
        setField(term327362, term327362.getClass(), "next", null);
        setIntField(term327362, term327362.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term327362;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term327292, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


