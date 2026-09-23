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

public class TypeInference_traverseGetProp_220559067216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136964;
     Object term137034;

    public TypeInference_traverseGetProp_220559067216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136964 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term137034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term137034, term137034.getClass(), "first", term137034);
        setField(term137034, term137034.getClass(), "last", term137104);
        setIntField(term137034, term137034.getClass(), "type", 1545119095);
        setIntField(term137174, term137174.getClass(), "type", 17);
        setField(term137034, term137034.getClass(), "next", term137174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term137034;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term136964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


