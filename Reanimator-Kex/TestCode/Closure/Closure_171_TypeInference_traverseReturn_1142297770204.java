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

public class TypeInference_traverseReturn_1142297770204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98500;
     Object term98570;

    public TypeInference_traverseReturn_1142297770204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98500 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term98570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98640, term98640.getClass(), "type", -344842608);
        setIntField(term98710, term98710.getClass(), "type", 13);
        setField(term98640, term98640.getClass(), "next", term98710);
        setField(term98570, term98570.getClass(), "first", term98640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term98570;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term98500, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


