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

public class TypeInference_traverseGetElem_947565415191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87361;
     Object term87431;

    public TypeInference_traverseGetElem_947565415191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87361 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term87431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87501, term87501.getClass(), "type", 21);
        setField(term87571, term87571.getClass(), "next", term87641);
        setIntField(term87571, term87571.getClass(), "type", 21);
        setField(term87711, term87711.getClass(), "next", term87781);
        setIntField(term87711, term87711.getClass(), "type", 21);
        setField(term87851, term87851.getClass(), "next", term87921);
        setIntField(term87851, term87851.getClass(), "type", 21);
        setField(term87991, term87991.getClass(), "next", term88061);
        setIntField(term87991, term87991.getClass(), "type", 21);
        setField(term88131, term88131.getClass(), "next", term88201);
        setIntField(term88131, term88131.getClass(), "type", 4);
        setField(term87991, term87991.getClass(), "first", term88131);
        setField(term87851, term87851.getClass(), "first", term87991);
        setField(term87711, term87711.getClass(), "first", term87851);
        setField(term87571, term87571.getClass(), "first", term87711);
        setField(term87501, term87501.getClass(), "first", term87571);
        setField(term87431, term87431.getClass(), "first", term87501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term87431;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term87361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


