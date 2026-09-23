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

public class TypeInference_traverseReturn_94528842361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1087462;
     Object term1087532;

    public TypeInference_traverseReturn_94528842361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1087462 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1087532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1087602, term1087602.getClass(), "type", 9);
        setIntField(term1087672, term1087672.getClass(), "type", 9);
        setIntField(term1087742, term1087742.getClass(), "type", 9);
        setIntField(term1087812, term1087812.getClass(), "type", 9);
        setIntField(term1087882, term1087882.getClass(), "type", 9);
        setIntField(term1087952, term1087952.getClass(), "type", 9);
        setIntField(term1088022, term1088022.getClass(), "type", 9);
        setIntField(term1088092, term1088092.getClass(), "type", 9);
        setIntField(term1088162, term1088162.getClass(), "type", 9);
        setIntField(term1088232, term1088232.getClass(), "type", 9);
        setIntField(term1088302, term1088302.getClass(), "type", 9);
        setIntField(term1088372, term1088372.getClass(), "type", 78);
        setField(term1088302, term1088302.getClass(), "first", term1088372);
        setField(term1088232, term1088232.getClass(), "first", term1088302);
        setField(term1088162, term1088162.getClass(), "first", term1088232);
        setField(term1088092, term1088092.getClass(), "first", term1088162);
        setField(term1088022, term1088022.getClass(), "first", term1088092);
        setField(term1087952, term1087952.getClass(), "first", term1088022);
        setField(term1087882, term1087882.getClass(), "first", term1087952);
        setField(term1087812, term1087812.getClass(), "first", term1087882);
        setField(term1087742, term1087742.getClass(), "first", term1087812);
        setField(term1087672, term1087672.getClass(), "first", term1087742);
        setField(term1087602, term1087602.getClass(), "first", term1087672);
        setField(term1087532, term1087532.getClass(), "first", term1087602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1087532;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1087462, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


