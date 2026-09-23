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

public class TypeInference_traverseAdd_1886586883155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103115;
     Object term103185;

    public TypeInference_traverseAdd_1886586883155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103115 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term103185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term103255, term103255.getClass(), "next", term103325);
        setIntField(term103255, term103255.getClass(), "type", 4);
        setIntField(term103395, term103395.getClass(), "type", 4);
        setIntField(term103465, term103465.getClass(), "type", 4);
        setIntField(term103535, term103535.getClass(), "type", 4);
        setIntField(term103605, term103605.getClass(), "type", 4);
        setIntField(term103675, term103675.getClass(), "type", 4);
        setIntField(term103745, term103745.getClass(), "type", 4);
        setIntField(term103815, term103815.getClass(), "type", 4);
        setIntField(term103885, term103885.getClass(), "type", 4);
        setIntField(term103955, term103955.getClass(), "type", 4);
        setIntField(term104025, term104025.getClass(), "type", 4);
        setIntField(term104095, term104095.getClass(), "type", 4);
        setIntField(term104165, term104165.getClass(), "type", 4);
        setIntField(term104235, term104235.getClass(), "type", 4);
        setIntField(term104305, term104305.getClass(), "type", 4);
        setIntField(term104375, term104375.getClass(), "type", 4);
        setIntField(term104445, term104445.getClass(), "type", 4);
        setIntField(term104515, term104515.getClass(), "type", 4);
        setIntField(term104585, term104585.getClass(), "type", 4);
        setIntField(term104655, term104655.getClass(), "type", 4);
        setIntField(term104725, term104725.getClass(), "type", 4);
        setIntField(term104795, term104795.getClass(), "type", 4);
        setIntField(term104865, term104865.getClass(), "type", 66);
        setField(term104795, term104795.getClass(), "first", term104865);
        setField(term104725, term104725.getClass(), "first", term104795);
        setField(term104655, term104655.getClass(), "first", term104725);
        setField(term104585, term104585.getClass(), "first", term104655);
        setField(term104515, term104515.getClass(), "first", term104585);
        setField(term104445, term104445.getClass(), "first", term104515);
        setField(term104375, term104375.getClass(), "first", term104445);
        setField(term104305, term104305.getClass(), "first", term104375);
        setField(term104235, term104235.getClass(), "first", term104305);
        setField(term104165, term104165.getClass(), "first", term104235);
        setField(term104095, term104095.getClass(), "first", term104165);
        setField(term104025, term104025.getClass(), "first", term104095);
        setField(term103955, term103955.getClass(), "first", term104025);
        setField(term103885, term103885.getClass(), "first", term103955);
        setField(term103815, term103815.getClass(), "first", term103885);
        setField(term103745, term103745.getClass(), "first", term103815);
        setField(term103675, term103675.getClass(), "first", term103745);
        setField(term103605, term103605.getClass(), "first", term103675);
        setField(term103535, term103535.getClass(), "first", term103605);
        setField(term103465, term103465.getClass(), "first", term103535);
        setField(term103395, term103395.getClass(), "first", term103465);
        setField(term103255, term103255.getClass(), "first", term103395);
        setField(term103185, term103185.getClass(), "first", term103255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term103185;
        args[1] = null;
        callMethod(klass, "traverseAdd", argTypes, term103115, args);
    }

};


