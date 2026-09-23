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

public class TypeInference_traverseGetElem_100203513144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77573;
     Object term77643;

    public TypeInference_traverseGetElem_100203513144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77573 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term77643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77713, term77713.getClass(), "type", -31751777);
        setIntField(term77783, term77783.getClass(), "type", 12);
        setField(term77713, term77713.getClass(), "next", term77783);
        setField(term77643, term77643.getClass(), "first", term77713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term77643;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term77573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


