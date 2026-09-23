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

public class TypeInference_traverseAssign_1205191851143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76881;
     Object term76951;

    public TypeInference_traverseAssign_1205191851143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76881 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term76951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76951, term76951.getClass(), "first", term76951);
        setField(term76951, term76951.getClass(), "last", term77021);
        setIntField(term76951, term76951.getClass(), "type", 1072005683);
        setIntField(term77091, term77091.getClass(), "type", 29);
        setField(term76951, term76951.getClass(), "next", term77091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term76951;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term76881, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


