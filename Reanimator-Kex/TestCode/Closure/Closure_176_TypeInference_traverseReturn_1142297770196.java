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

public class TypeInference_traverseReturn_1142297770196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92310;
     Object term92380;

    public TypeInference_traverseReturn_1142297770196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92310 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term92380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term92450, term92450.getClass(), "type", -344842608);
        setIntField(term92520, term92520.getClass(), "type", 87);
        setField(term92450, term92450.getClass(), "next", term92520);
        setField(term92380, term92380.getClass(), "first", term92450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term92380;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term92310, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


