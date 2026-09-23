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

public class TypeInference_traverseGetElem_100203513279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587925;
     Object term587995;

    public TypeInference_traverseGetElem_100203513279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term587925 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term587995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term588065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term588135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term588065, term588065.getClass(), "type", -1794965320);
        setIntField(term588135, term588135.getClass(), "type", 146);
        setField(term588065, term588065.getClass(), "next", term588135);
        setField(term587995, term587995.getClass(), "first", term588065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term587995;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term587925, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


