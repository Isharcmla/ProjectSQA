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

public class TypeInference_traverseCall_82554492129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74468;
     Object term74538;

    public TypeInference_traverseCall_82554492129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74468 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term74538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74608, term74608.getClass(), "type", -945116798);
        setIntField(term74678, term74678.getClass(), "type", 92);
        setField(term74608, term74608.getClass(), "next", term74678);
        setField(term74538, term74538.getClass(), "first", term74608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term74538;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term74468, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


