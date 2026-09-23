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

public class TypeInference_traverseAssign_1205191851134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75608;
     Object term75678;

    public TypeInference_traverseAssign_1205191851134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75608 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term75678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75678, term75678.getClass(), "first", term75678);
        setField(term75678, term75678.getClass(), "last", term75748);
        setIntField(term75678, term75678.getClass(), "type", 1072005683);
        setIntField(term75818, term75818.getClass(), "type", 122);
        setField(term75678, term75678.getClass(), "next", term75818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term75678;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term75608, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


