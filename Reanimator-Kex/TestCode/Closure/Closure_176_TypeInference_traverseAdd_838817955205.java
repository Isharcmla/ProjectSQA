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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseAdd_838817955205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96872;
     Object term96942;

    public TypeInference_traverseAdd_838817955205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96872 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term96942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96942, term96942.getClass(), "first", term96942);
        setField(term96942, term96942.getClass(), "next", term97012);
        setIntField(term96942, term96942.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term96942;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term96872, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


