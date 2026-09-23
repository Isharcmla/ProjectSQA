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

public class TypeInference_traverseGetProp_220559067180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88825;
     Object term88895;

    public TypeInference_traverseGetProp_220559067180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88825 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term88895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term88895, term88895.getClass(), "first", term88895);
        setField(term88895, term88895.getClass(), "last", term88965);
        setIntField(term88895, term88895.getClass(), "type", -728760750);
        setIntField(term89035, term89035.getClass(), "type", 97);
        setField(term88895, term88895.getClass(), "next", term89035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term88895;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term88825, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


