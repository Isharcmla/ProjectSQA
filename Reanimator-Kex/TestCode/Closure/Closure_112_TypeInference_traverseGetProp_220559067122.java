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

public class TypeInference_traverseGetProp_220559067122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70057;
     Object term70127;

    public TypeInference_traverseGetProp_220559067122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70057 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term70127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70127, term70127.getClass(), "first", term70127);
        setField(term70127, term70127.getClass(), "last", term70197);
        setIntField(term70127, term70127.getClass(), "type", 1716165145);
        setIntField(term70267, term70267.getClass(), "type", 130);
        setField(term70127, term70127.getClass(), "next", term70267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term70127;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term70057, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


