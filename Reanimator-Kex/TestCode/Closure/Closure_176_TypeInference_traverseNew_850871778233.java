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

public class TypeInference_traverseNew_850871778233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260864;
     Object term260934;

    public TypeInference_traverseNew_850871778233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260864 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term260934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term261004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term261074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term261004, term261004.getClass(), "type", 864645689);
        setIntField(term261074, term261074.getClass(), "type", 30);
        setField(term261004, term261004.getClass(), "next", term261074);
        setField(term260934, term260934.getClass(), "first", term261004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term260934;
        args[1] = null;
        try {
            callMethod(klass, "traverseNew", argTypes, term260864, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


