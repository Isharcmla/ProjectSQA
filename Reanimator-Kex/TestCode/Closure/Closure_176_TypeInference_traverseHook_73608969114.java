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

public class TypeInference_traverseHook_73608969114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66574;
     Object term66644;

    public TypeInference_traverseHook_73608969114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66574 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term66644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66714, term66714.getClass(), "next", term66784);
        setIntField(term66714, term66714.getClass(), "type", 116);
        setField(term66644, term66644.getClass(), "first", term66714);
        setField(term66644, term66644.getClass(), "last", term66854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term66644;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term66574, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


