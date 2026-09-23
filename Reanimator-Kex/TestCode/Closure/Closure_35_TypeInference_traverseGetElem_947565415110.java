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

public class TypeInference_traverseGetElem_947565415110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32080;
     Object term32150;

    public TypeInference_traverseGetElem_947565415110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32080 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term32150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32220, term32220.getClass(), "type", -1792504217);
        setField(term32220, term32220.getClass(), "propListHead", null);
        setIntField(term32290, term32290.getClass(), "type", 86);
        setField(term32220, term32220.getClass(), "next", term32290);
        setField(term32150, term32150.getClass(), "first", term32220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term32150;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term32080, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


