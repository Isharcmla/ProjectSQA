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

public class TypeInference_traverseReturn_1142297770448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1234109;
     Object term1234179;

    public TypeInference_traverseReturn_1142297770448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1234109 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1234179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1234249, term1234249.getClass(), "type", 92);
        setIntField(term1234319, term1234319.getClass(), "type", 92);
        setIntField(term1234389, term1234389.getClass(), "type", 92);
        setIntField(term1234459, term1234459.getClass(), "type", 92);
        setIntField(term1234529, term1234529.getClass(), "type", 92);
        setIntField(term1234599, term1234599.getClass(), "type", 92);
        setIntField(term1234669, term1234669.getClass(), "type", 92);
        setIntField(term1234739, term1234739.getClass(), "type", 92);
        setIntField(term1234809, term1234809.getClass(), "type", 92);
        setIntField(term1234879, term1234879.getClass(), "type", 92);
        setIntField(term1234949, term1234949.getClass(), "type", 92);
        setIntField(term1235019, term1235019.getClass(), "type", 92);
        setIntField(term1235089, term1235089.getClass(), "type", 92);
        setIntField(term1235159, term1235159.getClass(), "type", 92);
        setIntField(term1235229, term1235229.getClass(), "type", 92);
        setIntField(term1235299, term1235299.getClass(), "type", 79);
        setField(term1235229, term1235229.getClass(), "first", term1235299);
        setField(term1235159, term1235159.getClass(), "first", term1235229);
        setField(term1235089, term1235089.getClass(), "first", term1235159);
        setField(term1235019, term1235019.getClass(), "first", term1235089);
        setField(term1234949, term1234949.getClass(), "first", term1235019);
        setField(term1234879, term1234879.getClass(), "first", term1234949);
        setField(term1234809, term1234809.getClass(), "first", term1234879);
        setField(term1234739, term1234739.getClass(), "first", term1234809);
        setField(term1234669, term1234669.getClass(), "first", term1234739);
        setField(term1234599, term1234599.getClass(), "first", term1234669);
        setField(term1234529, term1234529.getClass(), "first", term1234599);
        setField(term1234459, term1234459.getClass(), "first", term1234529);
        setField(term1234389, term1234389.getClass(), "first", term1234459);
        setField(term1234319, term1234319.getClass(), "first", term1234389);
        setField(term1234249, term1234249.getClass(), "first", term1234319);
        setField(term1234179, term1234179.getClass(), "first", term1234249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1234179;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1234109, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


