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

public class TypeInference_traverseGetElem_947565415369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1099745;
     Object term1099815;

    public TypeInference_traverseGetElem_947565415369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1099745 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1099815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1099885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1099955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1099885, term1099885.getClass(), "type", 21);
        setField(term1099955, term1099955.getClass(), "next", null);
        setIntField(term1099955, term1099955.getClass(), "type", 21);
        setField(term1100025, term1100025.getClass(), "next", null);
        setIntField(term1100025, term1100025.getClass(), "type", 21);
        setField(term1100095, term1100095.getClass(), "next", null);
        setIntField(term1100095, term1100095.getClass(), "type", 21);
        setField(term1100165, term1100165.getClass(), "next", null);
        setIntField(term1100165, term1100165.getClass(), "type", 21);
        setField(term1100235, term1100235.getClass(), "next", null);
        setIntField(term1100235, term1100235.getClass(), "type", 21);
        setField(term1100305, term1100305.getClass(), "next", null);
        setIntField(term1100305, term1100305.getClass(), "type", 21);
        setField(term1100375, term1100375.getClass(), "next", null);
        setIntField(term1100375, term1100375.getClass(), "type", 21);
        setField(term1100445, term1100445.getClass(), "next", null);
        setIntField(term1100445, term1100445.getClass(), "type", 21);
        setField(term1100585, term1100585.getClass(), "next", null);
        setIntField(term1100585, term1100585.getClass(), "type", 23);
        setField(term1100515, term1100515.getClass(), "next", term1100585);
        setIntField(term1100515, term1100515.getClass(), "type", 21);
        setField(term1100655, term1100655.getClass(), "next", null);
        setIntField(term1100655, term1100655.getClass(), "type", 21);
        setField(term1100725, term1100725.getClass(), "next", null);
        setIntField(term1100725, term1100725.getClass(), "type", 21);
        setField(term1100795, term1100795.getClass(), "next", null);
        setIntField(term1100795, term1100795.getClass(), "type", 21);
        setField(term1100865, term1100865.getClass(), "next", null);
        setIntField(term1100865, term1100865.getClass(), "type", 21);
        setField(term1100935, term1100935.getClass(), "next", null);
        setIntField(term1100935, term1100935.getClass(), "type", 21);
        setField(term1101005, term1101005.getClass(), "next", null);
        setIntField(term1101005, term1101005.getClass(), "type", 21);
        setField(term1101075, term1101075.getClass(), "next", null);
        setIntField(term1101075, term1101075.getClass(), "type", 21);
        setField(term1101145, term1101145.getClass(), "next", null);
        setIntField(term1101145, term1101145.getClass(), "type", 21);
        setField(term1101215, term1101215.getClass(), "next", null);
        setIntField(term1101215, term1101215.getClass(), "type", 21);
        setField(term1101285, term1101285.getClass(), "next", null);
        setIntField(term1101285, term1101285.getClass(), "type", 21);
        setField(term1101355, term1101355.getClass(), "next", null);
        setIntField(term1101355, term1101355.getClass(), "type", 21);
        setField(term1101425, term1101425.getClass(), "next", null);
        setIntField(term1101425, term1101425.getClass(), "type", 21);
        setField(term1101495, term1101495.getClass(), "next", null);
        setIntField(term1101495, term1101495.getClass(), "type", 21);
        setField(term1101565, term1101565.getClass(), "next", null);
        setIntField(term1101565, term1101565.getClass(), "type", 21);
        setField(term1101635, term1101635.getClass(), "next", null);
        setIntField(term1101635, term1101635.getClass(), "type", 21);
        setField(term1101635, term1101635.getClass(), "first", term1100585);
        setField(term1101565, term1101565.getClass(), "first", term1101635);
        setField(term1101495, term1101495.getClass(), "first", term1101565);
        setField(term1101425, term1101425.getClass(), "first", term1101495);
        setField(term1101355, term1101355.getClass(), "first", term1101425);
        setField(term1101285, term1101285.getClass(), "first", term1101355);
        setField(term1101215, term1101215.getClass(), "first", term1101285);
        setField(term1101145, term1101145.getClass(), "first", term1101215);
        setField(term1101075, term1101075.getClass(), "first", term1101145);
        setField(term1101005, term1101005.getClass(), "first", term1101075);
        setField(term1100935, term1100935.getClass(), "first", term1101005);
        setField(term1100865, term1100865.getClass(), "first", term1100935);
        setField(term1100795, term1100795.getClass(), "first", term1100865);
        setField(term1100725, term1100725.getClass(), "first", term1100795);
        setField(term1100655, term1100655.getClass(), "first", term1100725);
        setField(term1100515, term1100515.getClass(), "first", term1100655);
        setField(term1100445, term1100445.getClass(), "first", term1100515);
        setField(term1100375, term1100375.getClass(), "first", term1100445);
        setField(term1100305, term1100305.getClass(), "first", term1100375);
        setField(term1100235, term1100235.getClass(), "first", term1100305);
        setField(term1100165, term1100165.getClass(), "first", term1100235);
        setField(term1100095, term1100095.getClass(), "first", term1100165);
        setField(term1100025, term1100025.getClass(), "first", term1100095);
        setField(term1099955, term1099955.getClass(), "first", term1100025);
        setField(term1099885, term1099885.getClass(), "first", term1099955);
        setField(term1099815, term1099815.getClass(), "first", term1099885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1099815;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term1099745, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


