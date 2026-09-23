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

public class TypeInference_traverseAssign_1205191851192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90556;
     Object term90626;

    public TypeInference_traverseAssign_1205191851192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90556 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term90626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90696, term90696.getClass(), "type", 151);
        setField(term90626, term90626.getClass(), "first", term90696);
        setField(term90626, term90626.getClass(), "last", term90766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term90626;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term90556, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


