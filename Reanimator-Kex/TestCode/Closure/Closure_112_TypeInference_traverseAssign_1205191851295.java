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

public class TypeInference_traverseAssign_1205191851295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400331;
     Object term400401;

    public TypeInference_traverseAssign_1205191851295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400331 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term400401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term400401, term400401.getClass(), "first", term400401);
        setField(term400401, term400401.getClass(), "last", term400471);
        setIntField(term400401, term400401.getClass(), "type", 1072005683);
        setIntField(term400541, term400541.getClass(), "type", 25);
        setField(term400401, term400401.getClass(), "next", term400541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term400401;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term400331, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


