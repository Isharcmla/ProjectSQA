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

public class TypeInference_traverseAssign_1205191851242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411748;
     Object term411818;

    public TypeInference_traverseAssign_1205191851242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411748 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term411818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term411888, term411888.getClass(), "type", -615654495);
        setField(term411888, term411888.getClass(), "propListHead", null);
        setIntField(term411958, term411958.getClass(), "type", 7);
        setField(term411888, term411888.getClass(), "next", term411958);
        setField(term411818, term411818.getClass(), "first", term411888);
        setField(term411818, term411818.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term411818;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term411748, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


