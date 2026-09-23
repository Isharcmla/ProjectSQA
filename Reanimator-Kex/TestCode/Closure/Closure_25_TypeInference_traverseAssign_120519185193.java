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

public class TypeInference_traverseAssign_120519185193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28262;
     Object term28332;

    public TypeInference_traverseAssign_120519185193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28262 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term28332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28402, term28402.getClass(), "type", -615654495);
        setField(term28402, term28402.getClass(), "propListHead", null);
        setIntField(term28472, term28472.getClass(), "type", 5);
        setField(term28402, term28402.getClass(), "next", term28472);
        setField(term28332, term28332.getClass(), "first", term28402);
        setField(term28332, term28332.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term28332;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term28262, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


