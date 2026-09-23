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

public class TypeInference_traverseReturn_1142297770158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80895;
     Object term80965;

    public TypeInference_traverseReturn_1142297770158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80895 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term80965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81035, term81035.getClass(), "type", -344842608);
        setIntField(term81105, term81105.getClass(), "type", 86);
        setField(term81035, term81035.getClass(), "next", term81105);
        setField(term80965, term80965.getClass(), "first", term81035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term80965;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term80895, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


