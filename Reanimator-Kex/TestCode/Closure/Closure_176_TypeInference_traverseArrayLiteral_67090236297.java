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

public class TypeInference_traverseArrayLiteral_67090236297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725969;
     Object term726039;

    public TypeInference_traverseArrayLiteral_67090236297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term725969 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term726039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term726109, term726109.getClass(), "type", 83);
        setIntField(term726179, term726179.getClass(), "type", 83);
        setIntField(term726249, term726249.getClass(), "type", 83);
        setIntField(term726319, term726319.getClass(), "type", 83);
        setIntField(term726389, term726389.getClass(), "type", 83);
        setIntField(term726459, term726459.getClass(), "type", 83);
        setIntField(term726529, term726529.getClass(), "type", 83);
        setIntField(term726599, term726599.getClass(), "type", 83);
        setIntField(term726669, term726669.getClass(), "type", 83);
        setIntField(term726739, term726739.getClass(), "type", 83);
        setIntField(term726809, term726809.getClass(), "type", 83);
        setIntField(term726879, term726879.getClass(), "type", 83);
        setIntField(term726949, term726949.getClass(), "type", 83);
        setIntField(term727019, term727019.getClass(), "type", 83);
        setIntField(term727089, term727089.getClass(), "type", 83);
        setIntField(term727159, term727159.getClass(), "type", 83);
        setIntField(term727229, term727229.getClass(), "type", 83);
        setIntField(term727299, term727299.getClass(), "type", 83);
        setIntField(term727369, term727369.getClass(), "type", 83);
        setIntField(term727439, term727439.getClass(), "type", 83);
        setIntField(term727509, term727509.getClass(), "type", 83);
        setIntField(term727579, term727579.getClass(), "type", 83);
        setIntField(term727649, term727649.getClass(), "type", 83);
        setIntField(term727719, term727719.getClass(), "type", 83);
        setIntField(term727789, term727789.getClass(), "type", 83);
        setIntField(term727859, term727859.getClass(), "type", 83);
        setIntField(term727929, term727929.getClass(), "type", 83);
        setIntField(term727999, term727999.getClass(), "type", 83);
        setIntField(term728069, term728069.getClass(), "type", 83);
        setIntField(term728139, term728139.getClass(), "type", 83);
        setIntField(term728209, term728209.getClass(), "type", 83);
        setIntField(term728279, term728279.getClass(), "type", 83);
        setIntField(term728349, term728349.getClass(), "type", 83);
        setIntField(term728419, term728419.getClass(), "type", 83);
        setIntField(term728489, term728489.getClass(), "type", 83);
        setIntField(term728559, term728559.getClass(), "type", 83);
        setIntField(term728629, term728629.getClass(), "type", 83);
        setIntField(term728699, term728699.getClass(), "type", 83);
        setIntField(term728769, term728769.getClass(), "type", 83);
        setIntField(term728839, term728839.getClass(), "type", 83);
        setIntField(term728909, term728909.getClass(), "type", 83);
        setIntField(term728979, term728979.getClass(), "type", 83);
        setIntField(term729049, term729049.getClass(), "type", 83);
        setIntField(term729119, term729119.getClass(), "type", 83);
        setIntField(term729189, term729189.getClass(), "type", 83);
        setIntField(term729259, term729259.getClass(), "type", 83);
        setIntField(term729329, term729329.getClass(), "type", 83);
        setIntField(term729399, term729399.getClass(), "type", 83);
        setIntField(term729469, term729469.getClass(), "type", 83);
        setIntField(term729539, term729539.getClass(), "type", 83);
        setIntField(term729609, term729609.getClass(), "type", 83);
        setIntField(term729679, term729679.getClass(), "type", 83);
        setIntField(term729749, term729749.getClass(), "type", 83);
        setIntField(term729819, term729819.getClass(), "type", 83);
        setIntField(term729889, term729889.getClass(), "type", 83);
        setIntField(term729959, term729959.getClass(), "type", 41);
        setField(term729889, term729889.getClass(), "first", term729959);
        setField(term729819, term729819.getClass(), "first", term729889);
        setField(term729749, term729749.getClass(), "first", term729819);
        setField(term729679, term729679.getClass(), "first", term729749);
        setField(term729609, term729609.getClass(), "first", term729679);
        setField(term729539, term729539.getClass(), "first", term729609);
        setField(term729469, term729469.getClass(), "first", term729539);
        setField(term729399, term729399.getClass(), "first", term729469);
        setField(term729329, term729329.getClass(), "first", term729399);
        setField(term729259, term729259.getClass(), "first", term729329);
        setField(term729189, term729189.getClass(), "first", term729259);
        setField(term729119, term729119.getClass(), "first", term729189);
        setField(term729049, term729049.getClass(), "first", term729119);
        setField(term728979, term728979.getClass(), "first", term729049);
        setField(term728909, term728909.getClass(), "first", term728979);
        setField(term728839, term728839.getClass(), "first", term728909);
        setField(term728769, term728769.getClass(), "first", term728839);
        setField(term728699, term728699.getClass(), "first", term728769);
        setField(term728629, term728629.getClass(), "first", term728699);
        setField(term728559, term728559.getClass(), "first", term728629);
        setField(term728489, term728489.getClass(), "first", term728559);
        setField(term728419, term728419.getClass(), "first", term728489);
        setField(term728349, term728349.getClass(), "first", term728419);
        setField(term728279, term728279.getClass(), "first", term728349);
        setField(term728209, term728209.getClass(), "first", term728279);
        setField(term728139, term728139.getClass(), "first", term728209);
        setField(term728069, term728069.getClass(), "first", term728139);
        setField(term727999, term727999.getClass(), "first", term728069);
        setField(term727929, term727929.getClass(), "first", term727999);
        setField(term727859, term727859.getClass(), "first", term727929);
        setField(term727789, term727789.getClass(), "first", term727859);
        setField(term727719, term727719.getClass(), "first", term727789);
        setField(term727649, term727649.getClass(), "first", term727719);
        setField(term727579, term727579.getClass(), "first", term727649);
        setField(term727509, term727509.getClass(), "first", term727579);
        setField(term727439, term727439.getClass(), "first", term727509);
        setField(term727369, term727369.getClass(), "first", term727439);
        setField(term727299, term727299.getClass(), "first", term727369);
        setField(term727229, term727229.getClass(), "first", term727299);
        setField(term727159, term727159.getClass(), "first", term727229);
        setField(term727089, term727089.getClass(), "first", term727159);
        setField(term727019, term727019.getClass(), "first", term727089);
        setField(term726949, term726949.getClass(), "first", term727019);
        setField(term726879, term726879.getClass(), "first", term726949);
        setField(term726809, term726809.getClass(), "first", term726879);
        setField(term726739, term726739.getClass(), "first", term726809);
        setField(term726669, term726669.getClass(), "first", term726739);
        setField(term726599, term726599.getClass(), "first", term726669);
        setField(term726529, term726529.getClass(), "first", term726599);
        setField(term726459, term726459.getClass(), "first", term726529);
        setField(term726389, term726389.getClass(), "first", term726459);
        setField(term726319, term726319.getClass(), "first", term726389);
        setField(term726249, term726249.getClass(), "first", term726319);
        setField(term726179, term726179.getClass(), "first", term726249);
        setField(term726109, term726109.getClass(), "first", term726179);
        setField(term726039, term726039.getClass(), "first", term726109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term726039;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term725969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


