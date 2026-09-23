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

public class TypeInference_traverseGetElem_947565415248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415055;
     Object term415125;

    public TypeInference_traverseGetElem_947565415248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term415055 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term415125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term415195, term415195.getClass(), "type", 21);
        setField(term415265, term415265.getClass(), "next", null);
        setIntField(term415265, term415265.getClass(), "type", 21);
        setField(term415335, term415335.getClass(), "next", null);
        setIntField(term415335, term415335.getClass(), "type", 21);
        setField(term415405, term415405.getClass(), "next", null);
        setIntField(term415405, term415405.getClass(), "type", 21);
        setField(term415475, term415475.getClass(), "next", null);
        setIntField(term415475, term415475.getClass(), "type", 21);
        setField(term415545, term415545.getClass(), "next", null);
        setIntField(term415545, term415545.getClass(), "type", 21);
        setField(term415615, term415615.getClass(), "next", null);
        setIntField(term415615, term415615.getClass(), "type", 21);
        setField(term415685, term415685.getClass(), "next", null);
        setIntField(term415685, term415685.getClass(), "type", 21);
        setField(term415755, term415755.getClass(), "next", null);
        setIntField(term415755, term415755.getClass(), "type", 21);
        setField(term415825, term415825.getClass(), "next", null);
        setIntField(term415825, term415825.getClass(), "type", 21);
        setField(term415895, term415895.getClass(), "next", null);
        setIntField(term415895, term415895.getClass(), "type", 21);
        setField(term415965, term415965.getClass(), "next", null);
        setIntField(term415965, term415965.getClass(), "type", 21);
        setField(term416035, term416035.getClass(), "next", null);
        setIntField(term416035, term416035.getClass(), "type", 21);
        setField(term416105, term416105.getClass(), "next", null);
        setIntField(term416105, term416105.getClass(), "type", 21);
        setField(term416175, term416175.getClass(), "next", null);
        setIntField(term416175, term416175.getClass(), "type", 21);
        setField(term416245, term416245.getClass(), "next", null);
        setIntField(term416245, term416245.getClass(), "type", 21);
        setField(term416315, term416315.getClass(), "next", null);
        setIntField(term416315, term416315.getClass(), "type", 21);
        setField(term416385, term416385.getClass(), "next", null);
        setIntField(term416385, term416385.getClass(), "type", 21);
        setField(term416455, term416455.getClass(), "next", null);
        setIntField(term416455, term416455.getClass(), "type", 21);
        setField(term416525, term416525.getClass(), "next", null);
        setIntField(term416525, term416525.getClass(), "type", 21);
        setField(term416595, term416595.getClass(), "next", null);
        setIntField(term416595, term416595.getClass(), "type", 21);
        setField(term416665, term416665.getClass(), "next", null);
        setIntField(term416665, term416665.getClass(), "type", 21);
        setField(term416735, term416735.getClass(), "next", null);
        setIntField(term416735, term416735.getClass(), "type", 21);
        setField(term416805, term416805.getClass(), "next", null);
        setIntField(term416805, term416805.getClass(), "type", 21);
        setField(term416875, term416875.getClass(), "next", null);
        setIntField(term416875, term416875.getClass(), "type", 21);
        setField(term416945, term416945.getClass(), "next", null);
        setIntField(term416945, term416945.getClass(), "type", 21);
        setField(term417015, term417015.getClass(), "next", null);
        setIntField(term417015, term417015.getClass(), "type", 21);
        setField(term417085, term417085.getClass(), "next", null);
        setIntField(term417085, term417085.getClass(), "type", 21);
        setField(term417155, term417155.getClass(), "next", null);
        setIntField(term417155, term417155.getClass(), "type", 21);
        setField(term417225, term417225.getClass(), "next", null);
        setIntField(term417225, term417225.getClass(), "type", 120);
        setField(term417155, term417155.getClass(), "first", term417225);
        setField(term417085, term417085.getClass(), "first", term417155);
        setField(term417015, term417015.getClass(), "first", term417085);
        setField(term416945, term416945.getClass(), "first", term417015);
        setField(term416875, term416875.getClass(), "first", term416945);
        setField(term416805, term416805.getClass(), "first", term416875);
        setField(term416735, term416735.getClass(), "first", term416805);
        setField(term416665, term416665.getClass(), "first", term416735);
        setField(term416595, term416595.getClass(), "first", term416665);
        setField(term416525, term416525.getClass(), "first", term416595);
        setField(term416455, term416455.getClass(), "first", term416525);
        setField(term416385, term416385.getClass(), "first", term416455);
        setField(term416315, term416315.getClass(), "first", term416385);
        setField(term416245, term416245.getClass(), "first", term416315);
        setField(term416175, term416175.getClass(), "first", term416245);
        setField(term416105, term416105.getClass(), "first", term416175);
        setField(term416035, term416035.getClass(), "first", term416105);
        setField(term415965, term415965.getClass(), "first", term416035);
        setField(term415895, term415895.getClass(), "first", term415965);
        setField(term415825, term415825.getClass(), "first", term415895);
        setField(term415755, term415755.getClass(), "first", term415825);
        setField(term415685, term415685.getClass(), "first", term415755);
        setField(term415615, term415615.getClass(), "first", term415685);
        setField(term415545, term415545.getClass(), "first", term415615);
        setField(term415475, term415475.getClass(), "first", term415545);
        setField(term415405, term415405.getClass(), "first", term415475);
        setField(term415335, term415335.getClass(), "first", term415405);
        setField(term415265, term415265.getClass(), "first", term415335);
        setField(term415195, term415195.getClass(), "first", term415265);
        setField(term415125, term415125.getClass(), "first", term415195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term415125;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term415055, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


