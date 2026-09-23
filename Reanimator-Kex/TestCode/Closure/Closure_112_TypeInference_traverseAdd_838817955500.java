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

public class TypeInference_traverseAdd_838817955500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2110169;
     Object term2110239;

    public TypeInference_traverseAdd_838817955500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2110169 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2110239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2114019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2114089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2114159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2114229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2110309, term2110309.getClass(), "next", null);
        setIntField(term2110309, term2110309.getClass(), "type", 14);
        setIntField(term2110379, term2110379.getClass(), "type", 14);
        setIntField(term2110449, term2110449.getClass(), "type", 14);
        setIntField(term2110519, term2110519.getClass(), "type", 14);
        setIntField(term2110589, term2110589.getClass(), "type", 14);
        setIntField(term2110659, term2110659.getClass(), "type", 14);
        setIntField(term2110729, term2110729.getClass(), "type", 14);
        setIntField(term2110799, term2110799.getClass(), "type", 14);
        setIntField(term2110869, term2110869.getClass(), "type", 14);
        setIntField(term2110939, term2110939.getClass(), "type", 14);
        setIntField(term2111009, term2111009.getClass(), "type", 14);
        setIntField(term2111079, term2111079.getClass(), "type", 14);
        setIntField(term2111149, term2111149.getClass(), "type", 14);
        setIntField(term2111219, term2111219.getClass(), "type", 14);
        setIntField(term2111289, term2111289.getClass(), "type", 14);
        setIntField(term2111359, term2111359.getClass(), "type", 14);
        setIntField(term2111429, term2111429.getClass(), "type", 14);
        setIntField(term2111499, term2111499.getClass(), "type", 14);
        setIntField(term2111569, term2111569.getClass(), "type", 14);
        setIntField(term2111639, term2111639.getClass(), "type", 14);
        setIntField(term2111709, term2111709.getClass(), "type", 14);
        setIntField(term2111779, term2111779.getClass(), "type", 14);
        setIntField(term2111849, term2111849.getClass(), "type", 14);
        setIntField(term2111919, term2111919.getClass(), "type", 14);
        setIntField(term2111989, term2111989.getClass(), "type", 14);
        setIntField(term2112059, term2112059.getClass(), "type", 14);
        setIntField(term2112129, term2112129.getClass(), "type", 14);
        setIntField(term2112199, term2112199.getClass(), "type", 14);
        setIntField(term2112269, term2112269.getClass(), "type", 14);
        setIntField(term2112339, term2112339.getClass(), "type", 14);
        setIntField(term2112409, term2112409.getClass(), "type", 14);
        setIntField(term2112479, term2112479.getClass(), "type", 14);
        setIntField(term2112549, term2112549.getClass(), "type", 14);
        setIntField(term2112619, term2112619.getClass(), "type", 14);
        setIntField(term2112689, term2112689.getClass(), "type", 14);
        setIntField(term2112759, term2112759.getClass(), "type", 14);
        setIntField(term2112829, term2112829.getClass(), "type", 14);
        setIntField(term2112899, term2112899.getClass(), "type", 14);
        setIntField(term2112969, term2112969.getClass(), "type", 14);
        setIntField(term2113039, term2113039.getClass(), "type", 14);
        setIntField(term2113109, term2113109.getClass(), "type", 14);
        setIntField(term2113179, term2113179.getClass(), "type", 14);
        setIntField(term2113249, term2113249.getClass(), "type", 14);
        setIntField(term2113319, term2113319.getClass(), "type", 14);
        setIntField(term2113389, term2113389.getClass(), "type", 14);
        setIntField(term2113459, term2113459.getClass(), "type", 14);
        setIntField(term2113529, term2113529.getClass(), "type", 14);
        setIntField(term2113599, term2113599.getClass(), "type", 14);
        setIntField(term2113669, term2113669.getClass(), "type", 14);
        setIntField(term2113739, term2113739.getClass(), "type", 14);
        setIntField(term2113809, term2113809.getClass(), "type", 14);
        setIntField(term2113879, term2113879.getClass(), "type", 14);
        setIntField(term2113949, term2113949.getClass(), "type", 14);
        setIntField(term2114019, term2114019.getClass(), "type", 14);
        setIntField(term2114089, term2114089.getClass(), "type", 14);
        setIntField(term2114159, term2114159.getClass(), "type", 14);
        setIntField(term2114229, term2114229.getClass(), "type", 101);
        setField(term2114159, term2114159.getClass(), "first", term2114229);
        setField(term2114089, term2114089.getClass(), "first", term2114159);
        setField(term2114019, term2114019.getClass(), "first", term2114089);
        setField(term2113949, term2113949.getClass(), "first", term2114019);
        setField(term2113879, term2113879.getClass(), "first", term2113949);
        setField(term2113809, term2113809.getClass(), "first", term2113879);
        setField(term2113739, term2113739.getClass(), "first", term2113809);
        setField(term2113669, term2113669.getClass(), "first", term2113739);
        setField(term2113599, term2113599.getClass(), "first", term2113669);
        setField(term2113529, term2113529.getClass(), "first", term2113599);
        setField(term2113459, term2113459.getClass(), "first", term2113529);
        setField(term2113389, term2113389.getClass(), "first", term2113459);
        setField(term2113319, term2113319.getClass(), "first", term2113389);
        setField(term2113249, term2113249.getClass(), "first", term2113319);
        setField(term2113179, term2113179.getClass(), "first", term2113249);
        setField(term2113109, term2113109.getClass(), "first", term2113179);
        setField(term2113039, term2113039.getClass(), "first", term2113109);
        setField(term2112969, term2112969.getClass(), "first", term2113039);
        setField(term2112899, term2112899.getClass(), "first", term2112969);
        setField(term2112829, term2112829.getClass(), "first", term2112899);
        setField(term2112759, term2112759.getClass(), "first", term2112829);
        setField(term2112689, term2112689.getClass(), "first", term2112759);
        setField(term2112619, term2112619.getClass(), "first", term2112689);
        setField(term2112549, term2112549.getClass(), "first", term2112619);
        setField(term2112479, term2112479.getClass(), "first", term2112549);
        setField(term2112409, term2112409.getClass(), "first", term2112479);
        setField(term2112339, term2112339.getClass(), "first", term2112409);
        setField(term2112269, term2112269.getClass(), "first", term2112339);
        setField(term2112199, term2112199.getClass(), "first", term2112269);
        setField(term2112129, term2112129.getClass(), "first", term2112199);
        setField(term2112059, term2112059.getClass(), "first", term2112129);
        setField(term2111989, term2111989.getClass(), "first", term2112059);
        setField(term2111919, term2111919.getClass(), "first", term2111989);
        setField(term2111849, term2111849.getClass(), "first", term2111919);
        setField(term2111779, term2111779.getClass(), "first", term2111849);
        setField(term2111709, term2111709.getClass(), "first", term2111779);
        setField(term2111639, term2111639.getClass(), "first", term2111709);
        setField(term2111569, term2111569.getClass(), "first", term2111639);
        setField(term2111499, term2111499.getClass(), "first", term2111569);
        setField(term2111429, term2111429.getClass(), "first", term2111499);
        setField(term2111359, term2111359.getClass(), "first", term2111429);
        setField(term2111289, term2111289.getClass(), "first", term2111359);
        setField(term2111219, term2111219.getClass(), "first", term2111289);
        setField(term2111149, term2111149.getClass(), "first", term2111219);
        setField(term2111079, term2111079.getClass(), "first", term2111149);
        setField(term2111009, term2111009.getClass(), "first", term2111079);
        setField(term2110939, term2110939.getClass(), "first", term2111009);
        setField(term2110869, term2110869.getClass(), "first", term2110939);
        setField(term2110799, term2110799.getClass(), "first", term2110869);
        setField(term2110729, term2110729.getClass(), "first", term2110799);
        setField(term2110659, term2110659.getClass(), "first", term2110729);
        setField(term2110589, term2110589.getClass(), "first", term2110659);
        setField(term2110519, term2110519.getClass(), "first", term2110589);
        setField(term2110449, term2110449.getClass(), "first", term2110519);
        setField(term2110379, term2110379.getClass(), "first", term2110449);
        setField(term2110309, term2110309.getClass(), "first", term2110379);
        setField(term2110239, term2110239.getClass(), "first", term2110309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2110239;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term2110169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


