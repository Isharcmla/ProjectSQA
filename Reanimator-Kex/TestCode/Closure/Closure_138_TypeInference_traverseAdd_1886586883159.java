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

public class TypeInference_traverseAdd_1886586883159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122139;
     Object term122209;

    public TypeInference_traverseAdd_1886586883159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122139 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term122209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term122279, term122279.getClass(), "next", null);
        setIntField(term122279, term122279.getClass(), "type", 4);
        setIntField(term122349, term122349.getClass(), "type", 4);
        setIntField(term122419, term122419.getClass(), "type", 4);
        setIntField(term122489, term122489.getClass(), "type", 4);
        setIntField(term122559, term122559.getClass(), "type", 4);
        setIntField(term122629, term122629.getClass(), "type", 4);
        setIntField(term122699, term122699.getClass(), "type", 4);
        setIntField(term122769, term122769.getClass(), "type", 4);
        setIntField(term122839, term122839.getClass(), "type", 4);
        setIntField(term122909, term122909.getClass(), "type", 4);
        setIntField(term122979, term122979.getClass(), "type", 4);
        setIntField(term123049, term123049.getClass(), "type", 4);
        setIntField(term123119, term123119.getClass(), "type", 4);
        setIntField(term123189, term123189.getClass(), "type", 4);
        setIntField(term123259, term123259.getClass(), "type", 4);
        setIntField(term123329, term123329.getClass(), "type", 4);
        setIntField(term123399, term123399.getClass(), "type", 4);
        setIntField(term123469, term123469.getClass(), "type", 4);
        setIntField(term123539, term123539.getClass(), "type", 4);
        setIntField(term123609, term123609.getClass(), "type", 4);
        setIntField(term123679, term123679.getClass(), "type", 4);
        setIntField(term123749, term123749.getClass(), "type", 4);
        setIntField(term123819, term123819.getClass(), "type", 4);
        setIntField(term123889, term123889.getClass(), "type", 4);
        setIntField(term123959, term123959.getClass(), "type", 4);
        setIntField(term124029, term124029.getClass(), "type", 4);
        setIntField(term124099, term124099.getClass(), "type", 4);
        setIntField(term124169, term124169.getClass(), "type", 4);
        setIntField(term124239, term124239.getClass(), "type", 4);
        setIntField(term124309, term124309.getClass(), "type", 4);
        setIntField(term124379, term124379.getClass(), "type", 4);
        setIntField(term124449, term124449.getClass(), "type", 4);
        setIntField(term124519, term124519.getClass(), "type", 4);
        setIntField(term124589, term124589.getClass(), "type", 4);
        setIntField(term124659, term124659.getClass(), "type", 4);
        setIntField(term124729, term124729.getClass(), "type", 4);
        setIntField(term124799, term124799.getClass(), "type", 4);
        setIntField(term124869, term124869.getClass(), "type", 4);
        setIntField(term124939, term124939.getClass(), "type", 4);
        setIntField(term125009, term125009.getClass(), "type", 4);
        setIntField(term125079, term125079.getClass(), "type", 4);
        setIntField(term125149, term125149.getClass(), "type", 101);
        setField(term125079, term125079.getClass(), "first", term125149);
        setField(term125009, term125009.getClass(), "first", term125079);
        setField(term124939, term124939.getClass(), "first", term125009);
        setField(term124869, term124869.getClass(), "first", term124939);
        setField(term124799, term124799.getClass(), "first", term124869);
        setField(term124729, term124729.getClass(), "first", term124799);
        setField(term124659, term124659.getClass(), "first", term124729);
        setField(term124589, term124589.getClass(), "first", term124659);
        setField(term124519, term124519.getClass(), "first", term124589);
        setField(term124449, term124449.getClass(), "first", term124519);
        setField(term124379, term124379.getClass(), "first", term124449);
        setField(term124309, term124309.getClass(), "first", term124379);
        setField(term124239, term124239.getClass(), "first", term124309);
        setField(term124169, term124169.getClass(), "first", term124239);
        setField(term124099, term124099.getClass(), "first", term124169);
        setField(term124029, term124029.getClass(), "first", term124099);
        setField(term123959, term123959.getClass(), "first", term124029);
        setField(term123889, term123889.getClass(), "first", term123959);
        setField(term123819, term123819.getClass(), "first", term123889);
        setField(term123749, term123749.getClass(), "first", term123819);
        setField(term123679, term123679.getClass(), "first", term123749);
        setField(term123609, term123609.getClass(), "first", term123679);
        setField(term123539, term123539.getClass(), "first", term123609);
        setField(term123469, term123469.getClass(), "first", term123539);
        setField(term123399, term123399.getClass(), "first", term123469);
        setField(term123329, term123329.getClass(), "first", term123399);
        setField(term123259, term123259.getClass(), "first", term123329);
        setField(term123189, term123189.getClass(), "first", term123259);
        setField(term123119, term123119.getClass(), "first", term123189);
        setField(term123049, term123049.getClass(), "first", term123119);
        setField(term122979, term122979.getClass(), "first", term123049);
        setField(term122909, term122909.getClass(), "first", term122979);
        setField(term122839, term122839.getClass(), "first", term122909);
        setField(term122769, term122769.getClass(), "first", term122839);
        setField(term122699, term122699.getClass(), "first", term122769);
        setField(term122629, term122629.getClass(), "first", term122699);
        setField(term122559, term122559.getClass(), "first", term122629);
        setField(term122489, term122489.getClass(), "first", term122559);
        setField(term122419, term122419.getClass(), "first", term122489);
        setField(term122349, term122349.getClass(), "first", term122419);
        setField(term122279, term122279.getClass(), "first", term122349);
        setField(term122209, term122209.getClass(), "first", term122279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term122209;
        args[1] = null;
        callMethod(klass, "traverseAdd", argTypes, term122139, args);
    }

};


