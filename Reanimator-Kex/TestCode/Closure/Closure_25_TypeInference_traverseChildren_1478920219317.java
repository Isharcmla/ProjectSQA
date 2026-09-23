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

public class TypeInference_traverseChildren_1478920219317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730109;
     Object term730179;

    public TypeInference_traverseChildren_1478920219317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term730109 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term730179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term730249, term730249.getClass(), "type", 18);
        setIntField(term730319, term730319.getClass(), "type", 18);
        setIntField(term730389, term730389.getClass(), "type", 18);
        setIntField(term730459, term730459.getClass(), "type", 18);
        setIntField(term730529, term730529.getClass(), "type", 18);
        setIntField(term730599, term730599.getClass(), "type", 18);
        setIntField(term730669, term730669.getClass(), "type", 18);
        setIntField(term730739, term730739.getClass(), "type", 18);
        setIntField(term730809, term730809.getClass(), "type", 18);
        setIntField(term730879, term730879.getClass(), "type", 18);
        setIntField(term730949, term730949.getClass(), "type", 18);
        setIntField(term731019, term731019.getClass(), "type", 18);
        setIntField(term731089, term731089.getClass(), "type", 18);
        setIntField(term731159, term731159.getClass(), "type", 18);
        setIntField(term731229, term731229.getClass(), "type", 18);
        setIntField(term731299, term731299.getClass(), "type", 18);
        setIntField(term731369, term731369.getClass(), "type", 18);
        setIntField(term731439, term731439.getClass(), "type", 18);
        setIntField(term731509, term731509.getClass(), "type", 18);
        setIntField(term731579, term731579.getClass(), "type", 18);
        setIntField(term731649, term731649.getClass(), "type", 18);
        setIntField(term731719, term731719.getClass(), "type", 18);
        setIntField(term731789, term731789.getClass(), "type", 18);
        setIntField(term731859, term731859.getClass(), "type", 18);
        setIntField(term731929, term731929.getClass(), "type", 18);
        setIntField(term731999, term731999.getClass(), "type", 18);
        setIntField(term732069, term732069.getClass(), "type", 18);
        setIntField(term732139, term732139.getClass(), "type", 18);
        setIntField(term732209, term732209.getClass(), "type", 18);
        setIntField(term732279, term732279.getClass(), "type", 18);
        setIntField(term732349, term732349.getClass(), "type", 18);
        setIntField(term732419, term732419.getClass(), "type", 18);
        setIntField(term732489, term732489.getClass(), "type", 18);
        setIntField(term732559, term732559.getClass(), "type", 18);
        setIntField(term732629, term732629.getClass(), "type", 18);
        setIntField(term732699, term732699.getClass(), "type", 18);
        setIntField(term732769, term732769.getClass(), "type", 18);
        setIntField(term732839, term732839.getClass(), "type", 18);
        setIntField(term732909, term732909.getClass(), "type", 18);
        setIntField(term732979, term732979.getClass(), "type", 18);
        setIntField(term733049, term733049.getClass(), "type", 18);
        setIntField(term733119, term733119.getClass(), "type", 18);
        setIntField(term733189, term733189.getClass(), "type", 18);
        setIntField(term733259, term733259.getClass(), "type", 18);
        setIntField(term733329, term733329.getClass(), "type", 18);
        setIntField(term733399, term733399.getClass(), "type", 18);
        setIntField(term733469, term733469.getClass(), "type", 18);
        setIntField(term733539, term733539.getClass(), "type", 18);
        setIntField(term733609, term733609.getClass(), "type", 18);
        setIntField(term733679, term733679.getClass(), "type", 18);
        setIntField(term733749, term733749.getClass(), "type", 18);
        setIntField(term733819, term733819.getClass(), "type", 18);
        setIntField(term733889, term733889.getClass(), "type", 18);
        setIntField(term733959, term733959.getClass(), "type", 18);
        setIntField(term734029, term734029.getClass(), "type", 18);
        setIntField(term734099, term734099.getClass(), "type", 18);
        setIntField(term734169, term734169.getClass(), "type", 18);
        setIntField(term734239, term734239.getClass(), "type", 18);
        setIntField(term734309, term734309.getClass(), "type", 18);
        setIntField(term734379, term734379.getClass(), "type", 68);
        setField(term734309, term734309.getClass(), "first", term734379);
        setField(term734239, term734239.getClass(), "first", term734309);
        setField(term734169, term734169.getClass(), "first", term734239);
        setField(term734099, term734099.getClass(), "first", term734169);
        setField(term734029, term734029.getClass(), "first", term734099);
        setField(term733959, term733959.getClass(), "first", term734029);
        setField(term733889, term733889.getClass(), "first", term733959);
        setField(term733819, term733819.getClass(), "first", term733889);
        setField(term733749, term733749.getClass(), "first", term733819);
        setField(term733679, term733679.getClass(), "first", term733749);
        setField(term733609, term733609.getClass(), "first", term733679);
        setField(term733539, term733539.getClass(), "first", term733609);
        setField(term733469, term733469.getClass(), "first", term733539);
        setField(term733399, term733399.getClass(), "first", term733469);
        setField(term733329, term733329.getClass(), "first", term733399);
        setField(term733259, term733259.getClass(), "first", term733329);
        setField(term733189, term733189.getClass(), "first", term733259);
        setField(term733119, term733119.getClass(), "first", term733189);
        setField(term733049, term733049.getClass(), "first", term733119);
        setField(term732979, term732979.getClass(), "first", term733049);
        setField(term732909, term732909.getClass(), "first", term732979);
        setField(term732839, term732839.getClass(), "first", term732909);
        setField(term732769, term732769.getClass(), "first", term732839);
        setField(term732699, term732699.getClass(), "first", term732769);
        setField(term732629, term732629.getClass(), "first", term732699);
        setField(term732559, term732559.getClass(), "first", term732629);
        setField(term732489, term732489.getClass(), "first", term732559);
        setField(term732419, term732419.getClass(), "first", term732489);
        setField(term732349, term732349.getClass(), "first", term732419);
        setField(term732279, term732279.getClass(), "first", term732349);
        setField(term732209, term732209.getClass(), "first", term732279);
        setField(term732139, term732139.getClass(), "first", term732209);
        setField(term732069, term732069.getClass(), "first", term732139);
        setField(term731999, term731999.getClass(), "first", term732069);
        setField(term731929, term731929.getClass(), "first", term731999);
        setField(term731859, term731859.getClass(), "first", term731929);
        setField(term731789, term731789.getClass(), "first", term731859);
        setField(term731719, term731719.getClass(), "first", term731789);
        setField(term731649, term731649.getClass(), "first", term731719);
        setField(term731579, term731579.getClass(), "first", term731649);
        setField(term731509, term731509.getClass(), "first", term731579);
        setField(term731439, term731439.getClass(), "first", term731509);
        setField(term731369, term731369.getClass(), "first", term731439);
        setField(term731299, term731299.getClass(), "first", term731369);
        setField(term731229, term731229.getClass(), "first", term731299);
        setField(term731159, term731159.getClass(), "first", term731229);
        setField(term731089, term731089.getClass(), "first", term731159);
        setField(term731019, term731019.getClass(), "first", term731089);
        setField(term730949, term730949.getClass(), "first", term731019);
        setField(term730879, term730879.getClass(), "first", term730949);
        setField(term730809, term730809.getClass(), "first", term730879);
        setField(term730739, term730739.getClass(), "first", term730809);
        setField(term730669, term730669.getClass(), "first", term730739);
        setField(term730599, term730599.getClass(), "first", term730669);
        setField(term730529, term730529.getClass(), "first", term730599);
        setField(term730459, term730459.getClass(), "first", term730529);
        setField(term730389, term730389.getClass(), "first", term730459);
        setField(term730319, term730319.getClass(), "first", term730389);
        setField(term730249, term730249.getClass(), "first", term730319);
        setField(term730179, term730179.getClass(), "first", term730249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term730179;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term730109, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


