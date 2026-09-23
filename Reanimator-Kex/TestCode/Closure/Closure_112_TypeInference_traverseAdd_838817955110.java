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

public class TypeInference_traverseAdd_838817955110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63949;
     Object term64019;

    public TypeInference_traverseAdd_838817955110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63949 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term64019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64019, term64019.getClass(), "first", term64019);
        setIntField(term64089, term64089.getClass(), "type", 22);
        setField(term64019, term64019.getClass(), "next", term64089);
        setIntField(term64019, term64019.getClass(), "type", 1045547089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term64019;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term63949, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


