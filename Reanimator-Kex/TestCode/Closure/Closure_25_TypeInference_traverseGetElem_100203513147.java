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

public class TypeInference_traverseGetElem_100203513147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46124;
     Object term46194;

    public TypeInference_traverseGetElem_100203513147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46124 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term46194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46264, term46264.getClass(), "type", -1792504217);
        setField(term46264, term46264.getClass(), "propListHead", null);
        setIntField(term46334, term46334.getClass(), "type", 89);
        setField(term46264, term46264.getClass(), "next", term46334);
        setField(term46194, term46194.getClass(), "first", term46264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term46194;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term46124, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


