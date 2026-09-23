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

public class TypeInference_traverseGetElem_100203513114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34816;
     Object term34886;

    public TypeInference_traverseGetElem_100203513114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34816 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term34886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34956, term34956.getClass(), "type", -1792504217);
        setField(term34956, term34956.getClass(), "propListHead", null);
        setIntField(term35026, term35026.getClass(), "type", 49);
        setField(term34956, term34956.getClass(), "next", term35026);
        setField(term34886, term34886.getClass(), "first", term34956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term34886;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term34816, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


