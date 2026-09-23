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

public class TypeInference_traverseNew_850871778178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55502;
     Object term55572;

    public TypeInference_traverseNew_850871778178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55502 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term55572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55642, term55642.getClass(), "type", -233024044);
        setField(term55642, term55642.getClass(), "propListHead", null);
        setField(term55642, term55642.getClass(), "jsType", null);
        setIntField(term55712, term55712.getClass(), "type", 14);
        setField(term55642, term55642.getClass(), "next", term55712);
        setField(term55572, term55572.getClass(), "first", term55642);
        setField(term55572, term55572.getClass(), "jsType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term55572;
        args[1] = null;
        try {
            callMethod(klass, "traverseNew", argTypes, term55502, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


