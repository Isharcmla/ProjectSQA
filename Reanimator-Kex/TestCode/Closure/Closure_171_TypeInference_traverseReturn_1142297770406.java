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

public class TypeInference_traverseReturn_1142297770406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049432;
     Object term1049502;

    public TypeInference_traverseReturn_1142297770406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1049432 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1049502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1049572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1049642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1049712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1049782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1049572, term1049572.getClass(), "type", 29);
        setIntField(term1049642, term1049642.getClass(), "type", 29);
        setIntField(term1049712, term1049712.getClass(), "type", 29);
        setIntField(term1049782, term1049782.getClass(), "type", 6);
        setField(term1049712, term1049712.getClass(), "first", term1049782);
        setField(term1049642, term1049642.getClass(), "first", term1049712);
        setField(term1049572, term1049572.getClass(), "first", term1049642);
        setField(term1049502, term1049502.getClass(), "first", term1049572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1049502;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1049432, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


