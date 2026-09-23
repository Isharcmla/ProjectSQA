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

public class TypeInference_traverseChildren_1478920219364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1120719;
     Object term1120789;

    public TypeInference_traverseChildren_1478920219364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1120719 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1120789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1120859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1120929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1120999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1122049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1122119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1122189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1122259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1122329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1122399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1122469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1122539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1120859, term1120859.getClass(), "type", 18);
        setIntField(term1120929, term1120929.getClass(), "type", 18);
        setIntField(term1120999, term1120999.getClass(), "type", 18);
        setIntField(term1121069, term1121069.getClass(), "type", 18);
        setIntField(term1121139, term1121139.getClass(), "type", 18);
        setIntField(term1121209, term1121209.getClass(), "type", 18);
        setIntField(term1121279, term1121279.getClass(), "type", 18);
        setIntField(term1121349, term1121349.getClass(), "type", 18);
        setIntField(term1121419, term1121419.getClass(), "type", 18);
        setIntField(term1121489, term1121489.getClass(), "type", 18);
        setIntField(term1121559, term1121559.getClass(), "type", 18);
        setIntField(term1121629, term1121629.getClass(), "type", 18);
        setIntField(term1121699, term1121699.getClass(), "type", 18);
        setIntField(term1121769, term1121769.getClass(), "type", 18);
        setIntField(term1121839, term1121839.getClass(), "type", 18);
        setIntField(term1121909, term1121909.getClass(), "type", 18);
        setIntField(term1121979, term1121979.getClass(), "type", 18);
        setIntField(term1122049, term1122049.getClass(), "type", 18);
        setIntField(term1122119, term1122119.getClass(), "type", 18);
        setIntField(term1122189, term1122189.getClass(), "type", 18);
        setIntField(term1122259, term1122259.getClass(), "type", 18);
        setIntField(term1122329, term1122329.getClass(), "type", 18);
        setIntField(term1122399, term1122399.getClass(), "type", 18);
        setIntField(term1122469, term1122469.getClass(), "type", 18);
        setIntField(term1122539, term1122539.getClass(), "type", 115);
        setField(term1122469, term1122469.getClass(), "first", term1122539);
        setField(term1122399, term1122399.getClass(), "first", term1122469);
        setField(term1122329, term1122329.getClass(), "first", term1122399);
        setField(term1122259, term1122259.getClass(), "first", term1122329);
        setField(term1122189, term1122189.getClass(), "first", term1122259);
        setField(term1122119, term1122119.getClass(), "first", term1122189);
        setField(term1122049, term1122049.getClass(), "first", term1122119);
        setField(term1121979, term1121979.getClass(), "first", term1122049);
        setField(term1121909, term1121909.getClass(), "first", term1121979);
        setField(term1121839, term1121839.getClass(), "first", term1121909);
        setField(term1121769, term1121769.getClass(), "first", term1121839);
        setField(term1121699, term1121699.getClass(), "first", term1121769);
        setField(term1121629, term1121629.getClass(), "first", term1121699);
        setField(term1121559, term1121559.getClass(), "first", term1121629);
        setField(term1121489, term1121489.getClass(), "first", term1121559);
        setField(term1121419, term1121419.getClass(), "first", term1121489);
        setField(term1121349, term1121349.getClass(), "first", term1121419);
        setField(term1121279, term1121279.getClass(), "first", term1121349);
        setField(term1121209, term1121209.getClass(), "first", term1121279);
        setField(term1121139, term1121139.getClass(), "first", term1121209);
        setField(term1121069, term1121069.getClass(), "first", term1121139);
        setField(term1120999, term1120999.getClass(), "first", term1121069);
        setField(term1120929, term1120929.getClass(), "first", term1120999);
        setField(term1120859, term1120859.getClass(), "first", term1120929);
        setField(term1120789, term1120789.getClass(), "first", term1120859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1120789;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term1120719, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


