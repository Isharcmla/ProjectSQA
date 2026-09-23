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

public class TypeCheck_visit_8595247841074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306073;
     Object term306143;

    public TypeCheck_visit_8595247841074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306073 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term306143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term306213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term306305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term306375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term306143, term306143.getClass(), "type", 12);
        setIntField(term306213, term306213.getClass(), "type", 12);
        setField(term306213, term306213.getClass(), "jsType", term306305);
        setField(term306143, term306143.getClass(), "first", term306213);
        setIntField(term306375, term306375.getClass(), "type", 12);
        setField(term306143, term306143.getClass(), "last", term306375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term306143;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term306073, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


