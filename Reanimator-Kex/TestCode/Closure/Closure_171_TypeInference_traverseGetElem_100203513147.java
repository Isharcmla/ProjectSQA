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

public class TypeInference_traverseGetElem_100203513147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78395;
     Object term78465;

    public TypeInference_traverseGetElem_100203513147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78395 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term78465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78535, term78535.getClass(), "type", -31751777);
        setIntField(term78605, term78605.getClass(), "type", 76);
        setField(term78535, term78535.getClass(), "next", term78605);
        setField(term78465, term78465.getClass(), "first", term78535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term78465;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term78395, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


