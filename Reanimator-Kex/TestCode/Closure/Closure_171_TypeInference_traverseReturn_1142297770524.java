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

public class TypeInference_traverseReturn_1142297770524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1616883;
     Object term1616953;

    public TypeInference_traverseReturn_1142297770524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1616883 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1616953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1617023, term1617023.getClass(), "type", 29);
        setIntField(term1617093, term1617093.getClass(), "type", 29);
        setIntField(term1617163, term1617163.getClass(), "type", 29);
        setIntField(term1617233, term1617233.getClass(), "type", 29);
        setIntField(term1617303, term1617303.getClass(), "type", 29);
        setIntField(term1617373, term1617373.getClass(), "type", 29);
        setIntField(term1617443, term1617443.getClass(), "type", 29);
        setIntField(term1617513, term1617513.getClass(), "type", 29);
        setIntField(term1617583, term1617583.getClass(), "type", 131);
        setField(term1617513, term1617513.getClass(), "first", term1617583);
        setField(term1617443, term1617443.getClass(), "first", term1617513);
        setField(term1617373, term1617373.getClass(), "first", term1617443);
        setField(term1617303, term1617303.getClass(), "first", term1617373);
        setField(term1617233, term1617233.getClass(), "first", term1617303);
        setField(term1617163, term1617163.getClass(), "first", term1617233);
        setField(term1617093, term1617093.getClass(), "first", term1617163);
        setField(term1617023, term1617023.getClass(), "first", term1617093);
        setField(term1616953, term1616953.getClass(), "first", term1617023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1616953;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1616883, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


