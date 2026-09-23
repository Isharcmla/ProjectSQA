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

public class TypeInference_traverseGetProp_1268327995147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47816;
     Object term47886;

    public TypeInference_traverseGetProp_1268327995147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47816 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term47886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47956, term47956.getClass(), "type", -941356098);
        setField(term47956, term47956.getClass(), "propListHead", null);
        setIntField(term48026, term48026.getClass(), "type", 12);
        setField(term47956, term47956.getClass(), "next", term48026);
        setField(term47886, term47886.getClass(), "first", term47956);
        setField(term47886, term47886.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term47886;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term47816, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


