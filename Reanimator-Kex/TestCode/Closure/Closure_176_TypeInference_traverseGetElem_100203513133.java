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

public class TypeInference_traverseGetElem_100203513133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72172;
     Object term72242;

    public TypeInference_traverseGetElem_100203513133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72172 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term72242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72312, term72312.getClass(), "type", -1794965320);
        setIntField(term72382, term72382.getClass(), "type", 82);
        setField(term72312, term72312.getClass(), "next", term72382);
        setField(term72242, term72242.getClass(), "first", term72312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term72242;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term72172, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


