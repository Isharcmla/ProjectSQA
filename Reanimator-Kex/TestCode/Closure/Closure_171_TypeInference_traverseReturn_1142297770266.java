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

public class TypeInference_traverseReturn_1142297770266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397128;
     Object term397198;

    public TypeInference_traverseReturn_1142297770266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397128 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term397198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term397268, term397268.getClass(), "type", 29);
        setIntField(term397338, term397338.getClass(), "type", 29);
        setIntField(term397408, term397408.getClass(), "type", 29);
        setIntField(term397478, term397478.getClass(), "type", 29);
        setIntField(term397548, term397548.getClass(), "type", 29);
        setIntField(term397618, term397618.getClass(), "type", 29);
        setIntField(term397688, term397688.getClass(), "type", 29);
        setIntField(term397758, term397758.getClass(), "type", 29);
        setIntField(term397828, term397828.getClass(), "type", 29);
        setIntField(term397898, term397898.getClass(), "type", 29);
        setIntField(term397968, term397968.getClass(), "type", 29);
        setIntField(term398038, term398038.getClass(), "type", 29);
        setIntField(term398108, term398108.getClass(), "type", 29);
        setIntField(term398178, term398178.getClass(), "type", 29);
        setIntField(term398248, term398248.getClass(), "type", 29);
        setIntField(term398318, term398318.getClass(), "type", 29);
        setIntField(term398388, term398388.getClass(), "type", 29);
        setIntField(term398458, term398458.getClass(), "type", 29);
        setIntField(term398528, term398528.getClass(), "type", 29);
        setIntField(term398598, term398598.getClass(), "type", 29);
        setIntField(term398668, term398668.getClass(), "type", 29);
        setIntField(term398738, term398738.getClass(), "type", 29);
        setIntField(term398808, term398808.getClass(), "type", 29);
        setIntField(term398878, term398878.getClass(), "type", 29);
        setIntField(term398948, term398948.getClass(), "type", 29);
        setIntField(term399018, term399018.getClass(), "type", 29);
        setIntField(term399088, term399088.getClass(), "type", 29);
        setIntField(term399158, term399158.getClass(), "type", 29);
        setIntField(term399228, term399228.getClass(), "type", 29);
        setIntField(term399298, term399298.getClass(), "type", 29);
        setIntField(term399368, term399368.getClass(), "type", 29);
        setIntField(term399438, term399438.getClass(), "type", 29);
        setIntField(term399508, term399508.getClass(), "type", 29);
        setIntField(term399578, term399578.getClass(), "type", 29);
        setIntField(term399648, term399648.getClass(), "type", 29);
        setIntField(term399718, term399718.getClass(), "type", 29);
        setIntField(term399788, term399788.getClass(), "type", 29);
        setIntField(term399858, term399858.getClass(), "type", 29);
        setIntField(term399928, term399928.getClass(), "type", 145);
        setField(term399858, term399858.getClass(), "first", term399928);
        setField(term399788, term399788.getClass(), "first", term399858);
        setField(term399718, term399718.getClass(), "first", term399788);
        setField(term399648, term399648.getClass(), "first", term399718);
        setField(term399578, term399578.getClass(), "first", term399648);
        setField(term399508, term399508.getClass(), "first", term399578);
        setField(term399438, term399438.getClass(), "first", term399508);
        setField(term399368, term399368.getClass(), "first", term399438);
        setField(term399298, term399298.getClass(), "first", term399368);
        setField(term399228, term399228.getClass(), "first", term399298);
        setField(term399158, term399158.getClass(), "first", term399228);
        setField(term399088, term399088.getClass(), "first", term399158);
        setField(term399018, term399018.getClass(), "first", term399088);
        setField(term398948, term398948.getClass(), "first", term399018);
        setField(term398878, term398878.getClass(), "first", term398948);
        setField(term398808, term398808.getClass(), "first", term398878);
        setField(term398738, term398738.getClass(), "first", term398808);
        setField(term398668, term398668.getClass(), "first", term398738);
        setField(term398598, term398598.getClass(), "first", term398668);
        setField(term398528, term398528.getClass(), "first", term398598);
        setField(term398458, term398458.getClass(), "first", term398528);
        setField(term398388, term398388.getClass(), "first", term398458);
        setField(term398318, term398318.getClass(), "first", term398388);
        setField(term398248, term398248.getClass(), "first", term398318);
        setField(term398178, term398178.getClass(), "first", term398248);
        setField(term398108, term398108.getClass(), "first", term398178);
        setField(term398038, term398038.getClass(), "first", term398108);
        setField(term397968, term397968.getClass(), "first", term398038);
        setField(term397898, term397898.getClass(), "first", term397968);
        setField(term397828, term397828.getClass(), "first", term397898);
        setField(term397758, term397758.getClass(), "first", term397828);
        setField(term397688, term397688.getClass(), "first", term397758);
        setField(term397618, term397618.getClass(), "first", term397688);
        setField(term397548, term397548.getClass(), "first", term397618);
        setField(term397478, term397478.getClass(), "first", term397548);
        setField(term397408, term397408.getClass(), "first", term397478);
        setField(term397338, term397338.getClass(), "first", term397408);
        setField(term397268, term397268.getClass(), "first", term397338);
        setField(term397198, term397198.getClass(), "first", term397268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term397198;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term397128, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


