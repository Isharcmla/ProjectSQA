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

public class TypeInference_traverseHook_73608969151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79133;
     Object term79203;

    public TypeInference_traverseHook_73608969151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79133 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term79203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79273, term79273.getClass(), "next", term79343);
        setIntField(term79273, term79273.getClass(), "type", 78);
        setField(term79203, term79203.getClass(), "first", term79273);
        setField(term79203, term79203.getClass(), "last", term79413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term79203;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term79133, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


