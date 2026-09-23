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

public class TypeInference_traverseGetElem_100203513173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87933;
     Object term88003;

    public TypeInference_traverseGetElem_100203513173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87933 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term88003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88073, term88073.getClass(), "type", -1639041228);
        setIntField(term88143, term88143.getClass(), "type", 13);
        setField(term88073, term88073.getClass(), "next", term88143);
        setField(term88003, term88003.getClass(), "first", term88073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term88003;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term87933, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


