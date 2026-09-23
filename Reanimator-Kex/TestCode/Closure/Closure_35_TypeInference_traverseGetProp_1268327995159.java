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

public class TypeInference_traverseGetProp_1268327995159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49468;
     Object term49538;

    public TypeInference_traverseGetProp_1268327995159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49468 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term49538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49608, term49608.getClass(), "type", -941356098);
        setField(term49608, term49608.getClass(), "propListHead", null);
        setIntField(term49678, term49678.getClass(), "type", 110);
        setField(term49608, term49608.getClass(), "next", term49678);
        setField(term49538, term49538.getClass(), "first", term49608);
        setField(term49538, term49538.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term49538;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term49468, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


