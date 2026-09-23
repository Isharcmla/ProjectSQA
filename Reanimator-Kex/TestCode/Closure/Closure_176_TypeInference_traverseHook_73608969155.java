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

public class TypeInference_traverseHook_73608969155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80377;
     Object term80447;

    public TypeInference_traverseHook_73608969155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80377 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term80447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80517, term80517.getClass(), "next", term80587);
        setIntField(term80517, term80517.getClass(), "type", 51);
        setField(term80447, term80447.getClass(), "first", term80517);
        setField(term80447, term80447.getClass(), "last", term80657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term80447;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term80377, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


