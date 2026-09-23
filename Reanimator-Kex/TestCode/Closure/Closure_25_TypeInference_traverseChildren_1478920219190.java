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

public class TypeInference_traverseChildren_1478920219190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88440;
     Object term88510;

    public TypeInference_traverseChildren_1478920219190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88440 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term88510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88580, term88580.getClass(), "type", 18);
        setIntField(term88650, term88650.getClass(), "type", 18);
        setIntField(term88720, term88720.getClass(), "type", 18);
        setIntField(term88790, term88790.getClass(), "type", 18);
        setIntField(term88860, term88860.getClass(), "type", 18);
        setIntField(term88930, term88930.getClass(), "type", 18);
        setIntField(term89000, term89000.getClass(), "type", 18);
        setIntField(term89070, term89070.getClass(), "type", 18);
        setIntField(term89140, term89140.getClass(), "type", 18);
        setIntField(term89210, term89210.getClass(), "type", 18);
        setIntField(term89280, term89280.getClass(), "type", 104);
        setField(term89210, term89210.getClass(), "first", term89280);
        setField(term89140, term89140.getClass(), "first", term89210);
        setField(term89070, term89070.getClass(), "first", term89140);
        setField(term89000, term89000.getClass(), "first", term89070);
        setField(term88930, term88930.getClass(), "first", term89000);
        setField(term88860, term88860.getClass(), "first", term88930);
        setField(term88790, term88790.getClass(), "first", term88860);
        setField(term88720, term88720.getClass(), "first", term88790);
        setField(term88650, term88650.getClass(), "first", term88720);
        setField(term88580, term88580.getClass(), "first", term88650);
        setField(term88510, term88510.getClass(), "first", term88580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term88510;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term88440, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


