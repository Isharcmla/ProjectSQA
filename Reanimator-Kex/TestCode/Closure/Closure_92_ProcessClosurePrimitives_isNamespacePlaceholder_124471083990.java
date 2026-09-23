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

public class ProcessClosurePrimitives_isNamespacePlaceholder_124471083990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39638;

    public ProcessClosurePrimitives_isNamespacePlaceholder_124471083990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39734 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term39734, term39734.getClass(), "type", -46);
        setField(term39734, term39734.getClass(), "next", term39734);
        setField(term39638, term39638.getClass(), "propListHead", term39734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39638;
        callMethod(klass, "isNamespacePlaceholder", argTypes, null, args);
    }

};


