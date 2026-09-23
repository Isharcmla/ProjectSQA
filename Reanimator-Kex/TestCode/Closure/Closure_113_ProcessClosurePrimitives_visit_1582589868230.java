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

public class ProcessClosurePrimitives_visit_1582589868230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66617;
     Object term66687;
     Object term66827;

    public ProcessClosurePrimitives_visit_1582589868230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66617 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term66687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66687, term66687.getClass(), "type", 37);
        setField(term66687, term66687.getClass(), "first", term66757);
        term66827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66827, term66827.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term66687;
        args[2] = term66827;
        callMethod(klass, "visit", argTypes, term66617, args);
    }

};


