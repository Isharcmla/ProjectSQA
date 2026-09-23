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

public class TypeInference_traverseGetElem_100203513116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66631;
     Object term66701;

    public TypeInference_traverseGetElem_100203513116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66631 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term66701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66771, term66771.getClass(), "type", -31751777);
        setIntField(term66841, term66841.getClass(), "type", 140);
        setField(term66771, term66771.getClass(), "next", term66841);
        setField(term66701, term66701.getClass(), "first", term66771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term66701;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term66631, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


