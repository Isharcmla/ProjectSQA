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

public class TypeInference_traverseGetElem_100203513177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88525;
     Object term88595;

    public TypeInference_traverseGetElem_100203513177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88525 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term88595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88665, term88665.getClass(), "type", -31751777);
        setIntField(term88735, term88735.getClass(), "type", 24);
        setField(term88665, term88665.getClass(), "next", term88735);
        setField(term88595, term88595.getClass(), "first", term88665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term88595;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term88525, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


