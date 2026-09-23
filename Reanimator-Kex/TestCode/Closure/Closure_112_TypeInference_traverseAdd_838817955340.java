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

public class TypeInference_traverseAdd_838817955340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606969;
     Object term607039;

    public TypeInference_traverseAdd_838817955340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term606969 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term607039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term611029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term611099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term611169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term611239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term611309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term611379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term611449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term607109, term607109.getClass(), "next", null);
        setIntField(term607109, term607109.getClass(), "type", 14);
        setIntField(term607179, term607179.getClass(), "type", 14);
        setIntField(term607249, term607249.getClass(), "type", 14);
        setIntField(term607319, term607319.getClass(), "type", 14);
        setIntField(term607389, term607389.getClass(), "type", 14);
        setIntField(term607459, term607459.getClass(), "type", 14);
        setIntField(term607529, term607529.getClass(), "type", 14);
        setIntField(term607599, term607599.getClass(), "type", 14);
        setIntField(term607669, term607669.getClass(), "type", 14);
        setIntField(term607739, term607739.getClass(), "type", 14);
        setIntField(term607809, term607809.getClass(), "type", 14);
        setIntField(term607879, term607879.getClass(), "type", 14);
        setIntField(term607949, term607949.getClass(), "type", 14);
        setIntField(term608019, term608019.getClass(), "type", 14);
        setIntField(term608089, term608089.getClass(), "type", 14);
        setIntField(term608159, term608159.getClass(), "type", 14);
        setIntField(term608229, term608229.getClass(), "type", 14);
        setIntField(term608299, term608299.getClass(), "type", 14);
        setIntField(term608369, term608369.getClass(), "type", 14);
        setIntField(term608439, term608439.getClass(), "type", 14);
        setIntField(term608509, term608509.getClass(), "type", 14);
        setIntField(term608579, term608579.getClass(), "type", 14);
        setIntField(term608649, term608649.getClass(), "type", 14);
        setIntField(term608719, term608719.getClass(), "type", 14);
        setIntField(term608789, term608789.getClass(), "type", 14);
        setIntField(term608859, term608859.getClass(), "type", 14);
        setIntField(term608929, term608929.getClass(), "type", 14);
        setIntField(term608999, term608999.getClass(), "type", 14);
        setIntField(term609069, term609069.getClass(), "type", 14);
        setIntField(term609139, term609139.getClass(), "type", 14);
        setIntField(term609209, term609209.getClass(), "type", 14);
        setIntField(term609279, term609279.getClass(), "type", 14);
        setIntField(term609349, term609349.getClass(), "type", 14);
        setIntField(term609419, term609419.getClass(), "type", 14);
        setIntField(term609489, term609489.getClass(), "type", 14);
        setIntField(term609559, term609559.getClass(), "type", 14);
        setIntField(term609629, term609629.getClass(), "type", 14);
        setIntField(term609699, term609699.getClass(), "type", 14);
        setIntField(term609769, term609769.getClass(), "type", 14);
        setIntField(term609839, term609839.getClass(), "type", 14);
        setIntField(term609909, term609909.getClass(), "type", 14);
        setIntField(term609979, term609979.getClass(), "type", 14);
        setIntField(term610049, term610049.getClass(), "type", 14);
        setIntField(term610119, term610119.getClass(), "type", 14);
        setIntField(term610189, term610189.getClass(), "type", 14);
        setIntField(term610259, term610259.getClass(), "type", 14);
        setIntField(term610329, term610329.getClass(), "type", 14);
        setIntField(term610399, term610399.getClass(), "type", 14);
        setIntField(term610469, term610469.getClass(), "type", 14);
        setIntField(term610539, term610539.getClass(), "type", 14);
        setIntField(term610609, term610609.getClass(), "type", 14);
        setIntField(term610679, term610679.getClass(), "type", 14);
        setIntField(term610749, term610749.getClass(), "type", 14);
        setIntField(term610819, term610819.getClass(), "type", 14);
        setIntField(term610889, term610889.getClass(), "type", 14);
        setIntField(term610959, term610959.getClass(), "type", 14);
        setIntField(term611029, term611029.getClass(), "type", 14);
        setIntField(term611099, term611099.getClass(), "type", 14);
        setIntField(term611169, term611169.getClass(), "type", 14);
        setIntField(term611239, term611239.getClass(), "type", 14);
        setIntField(term611309, term611309.getClass(), "type", 14);
        setIntField(term611379, term611379.getClass(), "type", 14);
        setIntField(term611449, term611449.getClass(), "type", 99);
        setField(term611379, term611379.getClass(), "first", term611449);
        setField(term611309, term611309.getClass(), "first", term611379);
        setField(term611239, term611239.getClass(), "first", term611309);
        setField(term611169, term611169.getClass(), "first", term611239);
        setField(term611099, term611099.getClass(), "first", term611169);
        setField(term611029, term611029.getClass(), "first", term611099);
        setField(term610959, term610959.getClass(), "first", term611029);
        setField(term610889, term610889.getClass(), "first", term610959);
        setField(term610819, term610819.getClass(), "first", term610889);
        setField(term610749, term610749.getClass(), "first", term610819);
        setField(term610679, term610679.getClass(), "first", term610749);
        setField(term610609, term610609.getClass(), "first", term610679);
        setField(term610539, term610539.getClass(), "first", term610609);
        setField(term610469, term610469.getClass(), "first", term610539);
        setField(term610399, term610399.getClass(), "first", term610469);
        setField(term610329, term610329.getClass(), "first", term610399);
        setField(term610259, term610259.getClass(), "first", term610329);
        setField(term610189, term610189.getClass(), "first", term610259);
        setField(term610119, term610119.getClass(), "first", term610189);
        setField(term610049, term610049.getClass(), "first", term610119);
        setField(term609979, term609979.getClass(), "first", term610049);
        setField(term609909, term609909.getClass(), "first", term609979);
        setField(term609839, term609839.getClass(), "first", term609909);
        setField(term609769, term609769.getClass(), "first", term609839);
        setField(term609699, term609699.getClass(), "first", term609769);
        setField(term609629, term609629.getClass(), "first", term609699);
        setField(term609559, term609559.getClass(), "first", term609629);
        setField(term609489, term609489.getClass(), "first", term609559);
        setField(term609419, term609419.getClass(), "first", term609489);
        setField(term609349, term609349.getClass(), "first", term609419);
        setField(term609279, term609279.getClass(), "first", term609349);
        setField(term609209, term609209.getClass(), "first", term609279);
        setField(term609139, term609139.getClass(), "first", term609209);
        setField(term609069, term609069.getClass(), "first", term609139);
        setField(term608999, term608999.getClass(), "first", term609069);
        setField(term608929, term608929.getClass(), "first", term608999);
        setField(term608859, term608859.getClass(), "first", term608929);
        setField(term608789, term608789.getClass(), "first", term608859);
        setField(term608719, term608719.getClass(), "first", term608789);
        setField(term608649, term608649.getClass(), "first", term608719);
        setField(term608579, term608579.getClass(), "first", term608649);
        setField(term608509, term608509.getClass(), "first", term608579);
        setField(term608439, term608439.getClass(), "first", term608509);
        setField(term608369, term608369.getClass(), "first", term608439);
        setField(term608299, term608299.getClass(), "first", term608369);
        setField(term608229, term608229.getClass(), "first", term608299);
        setField(term608159, term608159.getClass(), "first", term608229);
        setField(term608089, term608089.getClass(), "first", term608159);
        setField(term608019, term608019.getClass(), "first", term608089);
        setField(term607949, term607949.getClass(), "first", term608019);
        setField(term607879, term607879.getClass(), "first", term607949);
        setField(term607809, term607809.getClass(), "first", term607879);
        setField(term607739, term607739.getClass(), "first", term607809);
        setField(term607669, term607669.getClass(), "first", term607739);
        setField(term607599, term607599.getClass(), "first", term607669);
        setField(term607529, term607529.getClass(), "first", term607599);
        setField(term607459, term607459.getClass(), "first", term607529);
        setField(term607389, term607389.getClass(), "first", term607459);
        setField(term607319, term607319.getClass(), "first", term607389);
        setField(term607249, term607249.getClass(), "first", term607319);
        setField(term607179, term607179.getClass(), "first", term607249);
        setField(term607109, term607109.getClass(), "first", term607179);
        setField(term607039, term607039.getClass(), "first", term607109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term607039;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term606969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


