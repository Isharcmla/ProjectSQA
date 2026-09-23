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

public class TypeInference_traverseAdd_838817955123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70656;
     Object term70726;

    public TypeInference_traverseAdd_838817955123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70656 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term70726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70726, term70726.getClass(), "first", term70726);
        setIntField(term70796, term70796.getClass(), "type", 98);
        setField(term70726, term70726.getClass(), "next", term70796);
        setIntField(term70726, term70726.getClass(), "type", 1045547089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term70726;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term70656, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


