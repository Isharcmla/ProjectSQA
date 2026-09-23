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

public class TypeInference_traverseGetElem_100203513456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1642388;
     Object term1642458;

    public TypeInference_traverseGetElem_100203513456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1642388 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1642458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1642528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1642598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1642668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1642738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1642808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1642878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1642948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1644068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1644138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1644208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1644278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1644348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1644418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1642528, term1642528.getClass(), "type", 98);
        setField(term1642598, term1642598.getClass(), "next", term1642668);
        setIntField(term1642598, term1642598.getClass(), "type", 98);
        setField(term1642738, term1642738.getClass(), "next", term1642808);
        setIntField(term1642738, term1642738.getClass(), "type", 98);
        setField(term1642878, term1642878.getClass(), "next", term1642948);
        setIntField(term1642878, term1642878.getClass(), "type", 98);
        setField(term1643018, term1643018.getClass(), "next", term1643088);
        setIntField(term1643018, term1643018.getClass(), "type", 98);
        setField(term1643158, term1643158.getClass(), "next", term1643228);
        setIntField(term1643158, term1643158.getClass(), "type", 98);
        setField(term1643298, term1643298.getClass(), "next", term1643368);
        setIntField(term1643298, term1643298.getClass(), "type", 98);
        setField(term1643438, term1643438.getClass(), "next", term1643508);
        setIntField(term1643438, term1643438.getClass(), "type", 98);
        setField(term1643578, term1643578.getClass(), "next", term1643648);
        setIntField(term1643578, term1643578.getClass(), "type", 98);
        setField(term1643718, term1643718.getClass(), "next", term1643788);
        setIntField(term1643718, term1643718.getClass(), "type", 122);
        setField(term1643578, term1643578.getClass(), "first", term1643718);
        setField(term1643578, term1643578.getClass(), "last", term1643858);
        setField(term1643438, term1643438.getClass(), "first", term1643578);
        setField(term1643438, term1643438.getClass(), "last", term1643928);
        setField(term1643298, term1643298.getClass(), "first", term1643438);
        setField(term1643298, term1643298.getClass(), "last", term1643998);
        setField(term1643158, term1643158.getClass(), "first", term1643298);
        setField(term1643158, term1643158.getClass(), "last", term1644068);
        setField(term1643018, term1643018.getClass(), "first", term1643158);
        setField(term1643018, term1643018.getClass(), "last", term1644138);
        setField(term1642878, term1642878.getClass(), "first", term1643018);
        setField(term1642878, term1642878.getClass(), "last", term1644208);
        setField(term1642738, term1642738.getClass(), "first", term1642878);
        setField(term1642738, term1642738.getClass(), "last", term1644278);
        setField(term1642598, term1642598.getClass(), "first", term1642738);
        setField(term1642598, term1642598.getClass(), "last", term1644348);
        setField(term1642528, term1642528.getClass(), "first", term1642598);
        setField(term1642528, term1642528.getClass(), "last", term1644418);
        setField(term1642458, term1642458.getClass(), "first", term1642528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1642458;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term1642388, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


