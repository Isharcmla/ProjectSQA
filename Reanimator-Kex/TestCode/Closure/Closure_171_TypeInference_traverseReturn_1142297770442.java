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

public class TypeInference_traverseReturn_1142297770442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1207629;
     Object term1207699;

    public TypeInference_traverseReturn_1142297770442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1207629 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1207699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1207769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1207839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1207909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1207979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1209939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1211059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1211129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1211199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1211269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1211339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1211409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1207769, term1207769.getClass(), "type", 92);
        setIntField(term1207839, term1207839.getClass(), "type", 92);
        setIntField(term1207909, term1207909.getClass(), "type", 92);
        setIntField(term1207979, term1207979.getClass(), "type", 92);
        setIntField(term1208049, term1208049.getClass(), "type", 92);
        setIntField(term1208119, term1208119.getClass(), "type", 92);
        setIntField(term1208189, term1208189.getClass(), "type", 92);
        setIntField(term1208259, term1208259.getClass(), "type", 92);
        setIntField(term1208329, term1208329.getClass(), "type", 92);
        setIntField(term1208399, term1208399.getClass(), "type", 92);
        setIntField(term1208469, term1208469.getClass(), "type", 92);
        setIntField(term1208539, term1208539.getClass(), "type", 92);
        setIntField(term1208609, term1208609.getClass(), "type", 92);
        setIntField(term1208679, term1208679.getClass(), "type", 92);
        setIntField(term1208749, term1208749.getClass(), "type", 92);
        setIntField(term1208819, term1208819.getClass(), "type", 92);
        setIntField(term1208889, term1208889.getClass(), "type", 92);
        setIntField(term1208959, term1208959.getClass(), "type", 92);
        setIntField(term1209029, term1209029.getClass(), "type", 92);
        setIntField(term1209099, term1209099.getClass(), "type", 92);
        setIntField(term1209169, term1209169.getClass(), "type", 92);
        setIntField(term1209239, term1209239.getClass(), "type", 92);
        setIntField(term1209309, term1209309.getClass(), "type", 92);
        setIntField(term1209379, term1209379.getClass(), "type", 92);
        setIntField(term1209449, term1209449.getClass(), "type", 92);
        setIntField(term1209519, term1209519.getClass(), "type", 92);
        setIntField(term1209589, term1209589.getClass(), "type", 92);
        setIntField(term1209659, term1209659.getClass(), "type", 92);
        setIntField(term1209729, term1209729.getClass(), "type", 92);
        setIntField(term1209799, term1209799.getClass(), "type", 92);
        setIntField(term1209869, term1209869.getClass(), "type", 92);
        setIntField(term1209939, term1209939.getClass(), "type", 92);
        setIntField(term1210009, term1210009.getClass(), "type", 92);
        setIntField(term1210079, term1210079.getClass(), "type", 92);
        setIntField(term1210149, term1210149.getClass(), "type", 92);
        setIntField(term1210219, term1210219.getClass(), "type", 92);
        setIntField(term1210289, term1210289.getClass(), "type", 92);
        setIntField(term1210359, term1210359.getClass(), "type", 92);
        setIntField(term1210429, term1210429.getClass(), "type", 92);
        setIntField(term1210499, term1210499.getClass(), "type", 92);
        setIntField(term1210569, term1210569.getClass(), "type", 92);
        setIntField(term1210639, term1210639.getClass(), "type", 92);
        setIntField(term1210709, term1210709.getClass(), "type", 92);
        setIntField(term1210779, term1210779.getClass(), "type", 92);
        setIntField(term1210849, term1210849.getClass(), "type", 92);
        setIntField(term1210919, term1210919.getClass(), "type", 92);
        setIntField(term1210989, term1210989.getClass(), "type", 92);
        setIntField(term1211059, term1211059.getClass(), "type", 92);
        setIntField(term1211129, term1211129.getClass(), "type", 92);
        setIntField(term1211199, term1211199.getClass(), "type", 92);
        setIntField(term1211269, term1211269.getClass(), "type", 92);
        setIntField(term1211339, term1211339.getClass(), "type", 92);
        setIntField(term1211409, term1211409.getClass(), "type", 72);
        setField(term1211339, term1211339.getClass(), "first", term1211409);
        setField(term1211269, term1211269.getClass(), "first", term1211339);
        setField(term1211199, term1211199.getClass(), "first", term1211269);
        setField(term1211129, term1211129.getClass(), "first", term1211199);
        setField(term1211059, term1211059.getClass(), "first", term1211129);
        setField(term1210989, term1210989.getClass(), "first", term1211059);
        setField(term1210919, term1210919.getClass(), "first", term1210989);
        setField(term1210849, term1210849.getClass(), "first", term1210919);
        setField(term1210779, term1210779.getClass(), "first", term1210849);
        setField(term1210709, term1210709.getClass(), "first", term1210779);
        setField(term1210639, term1210639.getClass(), "first", term1210709);
        setField(term1210569, term1210569.getClass(), "first", term1210639);
        setField(term1210499, term1210499.getClass(), "first", term1210569);
        setField(term1210429, term1210429.getClass(), "first", term1210499);
        setField(term1210359, term1210359.getClass(), "first", term1210429);
        setField(term1210289, term1210289.getClass(), "first", term1210359);
        setField(term1210219, term1210219.getClass(), "first", term1210289);
        setField(term1210149, term1210149.getClass(), "first", term1210219);
        setField(term1210079, term1210079.getClass(), "first", term1210149);
        setField(term1210009, term1210009.getClass(), "first", term1210079);
        setField(term1209939, term1209939.getClass(), "first", term1210009);
        setField(term1209869, term1209869.getClass(), "first", term1209939);
        setField(term1209799, term1209799.getClass(), "first", term1209869);
        setField(term1209729, term1209729.getClass(), "first", term1209799);
        setField(term1209659, term1209659.getClass(), "first", term1209729);
        setField(term1209589, term1209589.getClass(), "first", term1209659);
        setField(term1209519, term1209519.getClass(), "first", term1209589);
        setField(term1209449, term1209449.getClass(), "first", term1209519);
        setField(term1209379, term1209379.getClass(), "first", term1209449);
        setField(term1209309, term1209309.getClass(), "first", term1209379);
        setField(term1209239, term1209239.getClass(), "first", term1209309);
        setField(term1209169, term1209169.getClass(), "first", term1209239);
        setField(term1209099, term1209099.getClass(), "first", term1209169);
        setField(term1209029, term1209029.getClass(), "first", term1209099);
        setField(term1208959, term1208959.getClass(), "first", term1209029);
        setField(term1208889, term1208889.getClass(), "first", term1208959);
        setField(term1208819, term1208819.getClass(), "first", term1208889);
        setField(term1208749, term1208749.getClass(), "first", term1208819);
        setField(term1208679, term1208679.getClass(), "first", term1208749);
        setField(term1208609, term1208609.getClass(), "first", term1208679);
        setField(term1208539, term1208539.getClass(), "first", term1208609);
        setField(term1208469, term1208469.getClass(), "first", term1208539);
        setField(term1208399, term1208399.getClass(), "first", term1208469);
        setField(term1208329, term1208329.getClass(), "first", term1208399);
        setField(term1208259, term1208259.getClass(), "first", term1208329);
        setField(term1208189, term1208189.getClass(), "first", term1208259);
        setField(term1208119, term1208119.getClass(), "first", term1208189);
        setField(term1208049, term1208049.getClass(), "first", term1208119);
        setField(term1207979, term1207979.getClass(), "first", term1208049);
        setField(term1207909, term1207909.getClass(), "first", term1207979);
        setField(term1207839, term1207839.getClass(), "first", term1207909);
        setField(term1207769, term1207769.getClass(), "first", term1207839);
        setField(term1207699, term1207699.getClass(), "first", term1207769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1207699;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1207629, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


