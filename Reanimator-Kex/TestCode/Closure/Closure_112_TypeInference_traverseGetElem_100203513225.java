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

public class TypeInference_traverseGetElem_100203513225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135529;
     Object term135599;

    public TypeInference_traverseGetElem_100203513225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135529 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term135599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term135669, term135669.getClass(), "type", 98);
        setField(term135739, term135739.getClass(), "next", null);
        setIntField(term135739, term135739.getClass(), "type", 98);
        setField(term135809, term135809.getClass(), "next", null);
        setIntField(term135809, term135809.getClass(), "type", 98);
        setField(term135879, term135879.getClass(), "next", null);
        setIntField(term135879, term135879.getClass(), "type", 98);
        setField(term135949, term135949.getClass(), "next", null);
        setIntField(term135949, term135949.getClass(), "type", 98);
        setField(term136019, term136019.getClass(), "next", null);
        setIntField(term136019, term136019.getClass(), "type", 98);
        setField(term136089, term136089.getClass(), "next", null);
        setIntField(term136089, term136089.getClass(), "type", 98);
        setField(term136159, term136159.getClass(), "next", null);
        setIntField(term136159, term136159.getClass(), "type", 98);
        setField(term136229, term136229.getClass(), "next", null);
        setIntField(term136229, term136229.getClass(), "type", 98);
        setField(term136299, term136299.getClass(), "next", null);
        setIntField(term136299, term136299.getClass(), "type", 98);
        setField(term136369, term136369.getClass(), "next", null);
        setIntField(term136369, term136369.getClass(), "type", 98);
        setField(term136439, term136439.getClass(), "next", null);
        setIntField(term136439, term136439.getClass(), "type", 98);
        setField(term136509, term136509.getClass(), "next", null);
        setIntField(term136509, term136509.getClass(), "type", 98);
        setField(term136579, term136579.getClass(), "next", null);
        setIntField(term136579, term136579.getClass(), "type", 98);
        setField(term136649, term136649.getClass(), "next", null);
        setIntField(term136649, term136649.getClass(), "type", 98);
        setField(term136719, term136719.getClass(), "next", null);
        setIntField(term136719, term136719.getClass(), "type", 98);
        setField(term136789, term136789.getClass(), "next", null);
        setIntField(term136789, term136789.getClass(), "type", 98);
        setField(term136859, term136859.getClass(), "next", null);
        setIntField(term136859, term136859.getClass(), "type", 98);
        setField(term136929, term136929.getClass(), "next", null);
        setIntField(term136929, term136929.getClass(), "type", 98);
        setField(term136999, term136999.getClass(), "next", null);
        setIntField(term136999, term136999.getClass(), "type", 98);
        setField(term137069, term137069.getClass(), "next", null);
        setIntField(term137069, term137069.getClass(), "type", 98);
        setField(term137139, term137139.getClass(), "next", null);
        setIntField(term137139, term137139.getClass(), "type", 98);
        setField(term137209, term137209.getClass(), "next", null);
        setIntField(term137209, term137209.getClass(), "type", 98);
        setField(term137279, term137279.getClass(), "next", null);
        setIntField(term137279, term137279.getClass(), "type", 98);
        setField(term137349, term137349.getClass(), "next", null);
        setIntField(term137349, term137349.getClass(), "type", 98);
        setField(term137419, term137419.getClass(), "next", null);
        setIntField(term137419, term137419.getClass(), "type", 98);
        setField(term137489, term137489.getClass(), "next", null);
        setIntField(term137489, term137489.getClass(), "type", 98);
        setField(term137559, term137559.getClass(), "next", null);
        setIntField(term137559, term137559.getClass(), "type", 98);
        setField(term137629, term137629.getClass(), "next", null);
        setIntField(term137629, term137629.getClass(), "type", 98);
        setField(term137699, term137699.getClass(), "next", null);
        setIntField(term137699, term137699.getClass(), "type", 98);
        setField(term137769, term137769.getClass(), "next", null);
        setIntField(term137769, term137769.getClass(), "type", 98);
        setField(term137839, term137839.getClass(), "next", null);
        setIntField(term137839, term137839.getClass(), "type", 98);
        setField(term137909, term137909.getClass(), "next", null);
        setIntField(term137909, term137909.getClass(), "type", 98);
        setField(term137979, term137979.getClass(), "next", null);
        setIntField(term137979, term137979.getClass(), "type", 98);
        setField(term138049, term138049.getClass(), "next", null);
        setIntField(term138049, term138049.getClass(), "type", 145);
        setField(term137979, term137979.getClass(), "first", term138049);
        setField(term137979, term137979.getClass(), "last", null);
        setField(term137909, term137909.getClass(), "first", term137979);
        setField(term137909, term137909.getClass(), "last", null);
        setField(term137839, term137839.getClass(), "first", term137909);
        setField(term137839, term137839.getClass(), "last", null);
        setField(term137769, term137769.getClass(), "first", term137839);
        setField(term137769, term137769.getClass(), "last", null);
        setField(term137699, term137699.getClass(), "first", term137769);
        setField(term137699, term137699.getClass(), "last", null);
        setField(term137629, term137629.getClass(), "first", term137699);
        setField(term137629, term137629.getClass(), "last", null);
        setField(term137559, term137559.getClass(), "first", term137629);
        setField(term137559, term137559.getClass(), "last", null);
        setField(term137489, term137489.getClass(), "first", term137559);
        setField(term137489, term137489.getClass(), "last", null);
        setField(term137419, term137419.getClass(), "first", term137489);
        setField(term137419, term137419.getClass(), "last", null);
        setField(term137349, term137349.getClass(), "first", term137419);
        setField(term137349, term137349.getClass(), "last", null);
        setField(term137279, term137279.getClass(), "first", term137349);
        setField(term137279, term137279.getClass(), "last", null);
        setField(term137209, term137209.getClass(), "first", term137279);
        setField(term137209, term137209.getClass(), "last", null);
        setField(term137139, term137139.getClass(), "first", term137209);
        setField(term137139, term137139.getClass(), "last", null);
        setField(term137069, term137069.getClass(), "first", term137139);
        setField(term137069, term137069.getClass(), "last", null);
        setField(term136999, term136999.getClass(), "first", term137069);
        setField(term136999, term136999.getClass(), "last", null);
        setField(term136929, term136929.getClass(), "first", term136999);
        setField(term136929, term136929.getClass(), "last", null);
        setField(term136859, term136859.getClass(), "first", term136929);
        setField(term136859, term136859.getClass(), "last", null);
        setField(term136789, term136789.getClass(), "first", term136859);
        setField(term136789, term136789.getClass(), "last", null);
        setField(term136719, term136719.getClass(), "first", term136789);
        setField(term136719, term136719.getClass(), "last", null);
        setField(term136649, term136649.getClass(), "first", term136719);
        setField(term136649, term136649.getClass(), "last", null);
        setField(term136579, term136579.getClass(), "first", term136649);
        setField(term136579, term136579.getClass(), "last", null);
        setField(term136509, term136509.getClass(), "first", term136579);
        setField(term136509, term136509.getClass(), "last", null);
        setField(term136439, term136439.getClass(), "first", term136509);
        setField(term136439, term136439.getClass(), "last", null);
        setField(term136369, term136369.getClass(), "first", term136439);
        setField(term136369, term136369.getClass(), "last", null);
        setField(term136299, term136299.getClass(), "first", term136369);
        setField(term136299, term136299.getClass(), "last", null);
        setField(term136229, term136229.getClass(), "first", term136299);
        setField(term136229, term136229.getClass(), "last", null);
        setField(term136159, term136159.getClass(), "first", term136229);
        setField(term136159, term136159.getClass(), "last", null);
        setField(term136089, term136089.getClass(), "first", term136159);
        setField(term136089, term136089.getClass(), "last", null);
        setField(term136019, term136019.getClass(), "first", term136089);
        setField(term136019, term136019.getClass(), "last", null);
        setField(term135949, term135949.getClass(), "first", term136019);
        setField(term135949, term135949.getClass(), "last", null);
        setField(term135879, term135879.getClass(), "first", term135949);
        setField(term135879, term135879.getClass(), "last", null);
        setField(term135809, term135809.getClass(), "first", term135879);
        setField(term135809, term135809.getClass(), "last", null);
        setField(term135739, term135739.getClass(), "first", term135809);
        setField(term135739, term135739.getClass(), "last", null);
        setField(term135669, term135669.getClass(), "first", term135739);
        setField(term135669, term135669.getClass(), "last", null);
        setField(term135599, term135599.getClass(), "first", term135669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term135599;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term135529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


