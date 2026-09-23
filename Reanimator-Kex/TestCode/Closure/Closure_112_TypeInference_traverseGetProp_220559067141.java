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

public class TypeInference_traverseGetProp_220559067141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74088;
     Object term74158;

    public TypeInference_traverseGetProp_220559067141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74088 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term74158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74158, term74158.getClass(), "first", term74158);
        setField(term74158, term74158.getClass(), "last", term74228);
        setIntField(term74158, term74158.getClass(), "type", 1716165145);
        setIntField(term74298, term74298.getClass(), "type", 25);
        setField(term74158, term74158.getClass(), "next", term74298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term74158;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term74088, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


