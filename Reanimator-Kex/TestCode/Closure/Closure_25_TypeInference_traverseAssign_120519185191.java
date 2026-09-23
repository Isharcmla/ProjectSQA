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

public class TypeInference_traverseAssign_120519185191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27536;
     Object term27606;

    public TypeInference_traverseAssign_120519185191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27536 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term27606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27676, term27676.getClass(), "type", 27);
        setField(term27606, term27606.getClass(), "first", term27676);
        setField(term27606, term27606.getClass(), "last", term27746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term27606;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term27536, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


