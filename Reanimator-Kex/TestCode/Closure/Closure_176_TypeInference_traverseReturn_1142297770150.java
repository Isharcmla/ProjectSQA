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

public class TypeInference_traverseReturn_1142297770150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78813;
     Object term78883;

    public TypeInference_traverseReturn_1142297770150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78813 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term78883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78953, term78953.getClass(), "type", -344842608);
        setIntField(term79023, term79023.getClass(), "type", 99);
        setField(term78953, term78953.getClass(), "next", term79023);
        setField(term78883, term78883.getClass(), "first", term78953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term78883;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term78813, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


