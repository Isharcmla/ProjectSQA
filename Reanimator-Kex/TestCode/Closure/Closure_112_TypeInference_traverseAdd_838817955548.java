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

public class TypeInference_traverseAdd_838817955548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2423709;
     Object term2423779;

    public TypeInference_traverseAdd_838817955548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2423709 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2423779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2423849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2423919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2423989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2424969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2426019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2426089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2426159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2423849, term2423849.getClass(), "next", null);
        setIntField(term2423849, term2423849.getClass(), "type", 14);
        setIntField(term2423919, term2423919.getClass(), "type", 14);
        setIntField(term2423989, term2423989.getClass(), "type", 14);
        setIntField(term2424059, term2424059.getClass(), "type", 14);
        setIntField(term2424129, term2424129.getClass(), "type", 14);
        setIntField(term2424199, term2424199.getClass(), "type", 14);
        setIntField(term2424269, term2424269.getClass(), "type", 14);
        setIntField(term2424339, term2424339.getClass(), "type", 14);
        setIntField(term2424409, term2424409.getClass(), "type", 14);
        setIntField(term2424479, term2424479.getClass(), "type", 14);
        setIntField(term2424549, term2424549.getClass(), "type", 14);
        setIntField(term2424619, term2424619.getClass(), "type", 14);
        setIntField(term2424689, term2424689.getClass(), "type", 14);
        setIntField(term2424759, term2424759.getClass(), "type", 14);
        setIntField(term2424829, term2424829.getClass(), "type", 14);
        setIntField(term2424899, term2424899.getClass(), "type", 14);
        setIntField(term2424969, term2424969.getClass(), "type", 14);
        setIntField(term2425039, term2425039.getClass(), "type", 14);
        setIntField(term2425109, term2425109.getClass(), "type", 14);
        setIntField(term2425179, term2425179.getClass(), "type", 14);
        setIntField(term2425249, term2425249.getClass(), "type", 14);
        setIntField(term2425319, term2425319.getClass(), "type", 14);
        setIntField(term2425389, term2425389.getClass(), "type", 14);
        setIntField(term2425459, term2425459.getClass(), "type", 14);
        setIntField(term2425529, term2425529.getClass(), "type", 14);
        setIntField(term2425599, term2425599.getClass(), "type", 14);
        setIntField(term2425669, term2425669.getClass(), "type", 14);
        setIntField(term2425739, term2425739.getClass(), "type", 14);
        setIntField(term2425809, term2425809.getClass(), "type", 14);
        setIntField(term2425879, term2425879.getClass(), "type", 14);
        setIntField(term2425949, term2425949.getClass(), "type", 14);
        setIntField(term2426019, term2426019.getClass(), "type", 14);
        setIntField(term2426089, term2426089.getClass(), "type", 14);
        setIntField(term2426159, term2426159.getClass(), "type", 117);
        setField(term2426089, term2426089.getClass(), "first", term2426159);
        setField(term2426019, term2426019.getClass(), "first", term2426089);
        setField(term2425949, term2425949.getClass(), "first", term2426019);
        setField(term2425879, term2425879.getClass(), "first", term2425949);
        setField(term2425809, term2425809.getClass(), "first", term2425879);
        setField(term2425739, term2425739.getClass(), "first", term2425809);
        setField(term2425669, term2425669.getClass(), "first", term2425739);
        setField(term2425599, term2425599.getClass(), "first", term2425669);
        setField(term2425529, term2425529.getClass(), "first", term2425599);
        setField(term2425459, term2425459.getClass(), "first", term2425529);
        setField(term2425389, term2425389.getClass(), "first", term2425459);
        setField(term2425319, term2425319.getClass(), "first", term2425389);
        setField(term2425249, term2425249.getClass(), "first", term2425319);
        setField(term2425179, term2425179.getClass(), "first", term2425249);
        setField(term2425109, term2425109.getClass(), "first", term2425179);
        setField(term2425039, term2425039.getClass(), "first", term2425109);
        setField(term2424969, term2424969.getClass(), "first", term2425039);
        setField(term2424899, term2424899.getClass(), "first", term2424969);
        setField(term2424829, term2424829.getClass(), "first", term2424899);
        setField(term2424759, term2424759.getClass(), "first", term2424829);
        setField(term2424689, term2424689.getClass(), "first", term2424759);
        setField(term2424619, term2424619.getClass(), "first", term2424689);
        setField(term2424549, term2424549.getClass(), "first", term2424619);
        setField(term2424479, term2424479.getClass(), "first", term2424549);
        setField(term2424409, term2424409.getClass(), "first", term2424479);
        setField(term2424339, term2424339.getClass(), "first", term2424409);
        setField(term2424269, term2424269.getClass(), "first", term2424339);
        setField(term2424199, term2424199.getClass(), "first", term2424269);
        setField(term2424129, term2424129.getClass(), "first", term2424199);
        setField(term2424059, term2424059.getClass(), "first", term2424129);
        setField(term2423989, term2423989.getClass(), "first", term2424059);
        setField(term2423919, term2423919.getClass(), "first", term2423989);
        setField(term2423849, term2423849.getClass(), "first", term2423919);
        setField(term2423779, term2423779.getClass(), "first", term2423849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2423779;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term2423709, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


