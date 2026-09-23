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

public class TypeInference_traverseReturn_1142297770339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606282;
     Object term606352;

    public TypeInference_traverseReturn_1142297770339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term606282 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term606352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term606422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term606492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term606422, term606422.getClass(), "type", 110);
        setIntField(term606492, term606492.getClass(), "type", 106);
        setField(term606422, term606422.getClass(), "first", term606492);
        setField(term606352, term606352.getClass(), "first", term606422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term606352;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term606282, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


