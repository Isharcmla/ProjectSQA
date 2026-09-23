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

public class TypeInference_traverseGetProp_220559067174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84645;
     Object term84715;

    public TypeInference_traverseGetProp_220559067174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84645 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term84715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84785, term84785.getClass(), "type", 100);
        setField(term84715, term84715.getClass(), "first", term84785);
        setField(term84715, term84715.getClass(), "last", term84855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term84715;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term84645, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


