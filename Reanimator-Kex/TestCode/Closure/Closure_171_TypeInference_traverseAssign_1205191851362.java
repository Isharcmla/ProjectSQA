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

public class TypeInference_traverseAssign_1205191851362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term900960;
     Object term901030;

    public TypeInference_traverseAssign_1205191851362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term900960 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term901030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term901100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term901170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term901030, term901030.getClass(), "first", term901030);
        setField(term901030, term901030.getClass(), "last", term901100);
        setIntField(term901030, term901030.getClass(), "type", 1072005683);
        setIntField(term901170, term901170.getClass(), "type", 131);
        setField(term901030, term901030.getClass(), "next", term901170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term901030;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term900960, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


