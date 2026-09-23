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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseAssign_157422923147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78589;
     Object term78659;

    public TypeInference_traverseAssign_157422923147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78589 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term78659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78729, term78729.getClass(), "type", 116);
        setField(term78659, term78659.getClass(), "first", term78729);
        setField(term78659, term78659.getClass(), "last", term78799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term78659;
        args[1] = null;
        callMethod(klass, "traverseAssign", argTypes, term78589, args);
    }

};


