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

public class TypeInference_traverseGetElem_100203513140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44704;
     Object term44774;

    public TypeInference_traverseGetElem_100203513140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44704 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term44774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44844, term44844.getClass(), "type", -1792504217);
        setField(term44844, term44844.getClass(), "propListHead", null);
        setIntField(term44914, term44914.getClass(), "type", 130);
        setField(term44844, term44844.getClass(), "next", term44914);
        setField(term44774, term44774.getClass(), "first", term44844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term44774;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term44704, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


