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

public class TypeInference_traverseHook_73608969135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75928;
     Object term75998;

    public TypeInference_traverseHook_73608969135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75928 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term75998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76068, term76068.getClass(), "next", term76138);
        setIntField(term76068, term76068.getClass(), "type", 138);
        setField(term75998, term75998.getClass(), "first", term76068);
        setField(term75998, term75998.getClass(), "last", term76208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term75998;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term75928, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


