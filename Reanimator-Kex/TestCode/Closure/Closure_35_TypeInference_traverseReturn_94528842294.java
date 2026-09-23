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

public class TypeInference_traverseReturn_94528842294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term678028;
     Object term678098;

    public TypeInference_traverseReturn_94528842294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term678028 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term678098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term682018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term682088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term682158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term682228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term678168, term678168.getClass(), "type", 9);
        setIntField(term678238, term678238.getClass(), "type", 9);
        setIntField(term678308, term678308.getClass(), "type", 9);
        setIntField(term678378, term678378.getClass(), "type", 9);
        setIntField(term678448, term678448.getClass(), "type", 9);
        setIntField(term678518, term678518.getClass(), "type", 9);
        setIntField(term678588, term678588.getClass(), "type", 9);
        setIntField(term678658, term678658.getClass(), "type", 9);
        setIntField(term678728, term678728.getClass(), "type", 9);
        setIntField(term678798, term678798.getClass(), "type", 9);
        setIntField(term678868, term678868.getClass(), "type", 9);
        setIntField(term678938, term678938.getClass(), "type", 9);
        setIntField(term679008, term679008.getClass(), "type", 9);
        setIntField(term679078, term679078.getClass(), "type", 9);
        setIntField(term679148, term679148.getClass(), "type", 9);
        setIntField(term679218, term679218.getClass(), "type", 9);
        setIntField(term679288, term679288.getClass(), "type", 9);
        setIntField(term679358, term679358.getClass(), "type", 9);
        setIntField(term679428, term679428.getClass(), "type", 9);
        setIntField(term679498, term679498.getClass(), "type", 9);
        setIntField(term679568, term679568.getClass(), "type", 9);
        setIntField(term679638, term679638.getClass(), "type", 9);
        setIntField(term679708, term679708.getClass(), "type", 9);
        setIntField(term679778, term679778.getClass(), "type", 9);
        setIntField(term679848, term679848.getClass(), "type", 9);
        setIntField(term679918, term679918.getClass(), "type", 9);
        setIntField(term679988, term679988.getClass(), "type", 9);
        setIntField(term680058, term680058.getClass(), "type", 9);
        setIntField(term680128, term680128.getClass(), "type", 9);
        setIntField(term680198, term680198.getClass(), "type", 9);
        setIntField(term680268, term680268.getClass(), "type", 9);
        setIntField(term680338, term680338.getClass(), "type", 9);
        setIntField(term680408, term680408.getClass(), "type", 9);
        setIntField(term680478, term680478.getClass(), "type", 9);
        setIntField(term680548, term680548.getClass(), "type", 9);
        setIntField(term680618, term680618.getClass(), "type", 9);
        setIntField(term680688, term680688.getClass(), "type", 9);
        setIntField(term680758, term680758.getClass(), "type", 9);
        setIntField(term680828, term680828.getClass(), "type", 9);
        setIntField(term680898, term680898.getClass(), "type", 9);
        setIntField(term680968, term680968.getClass(), "type", 9);
        setIntField(term681038, term681038.getClass(), "type", 9);
        setIntField(term681108, term681108.getClass(), "type", 9);
        setIntField(term681178, term681178.getClass(), "type", 9);
        setIntField(term681248, term681248.getClass(), "type", 9);
        setIntField(term681318, term681318.getClass(), "type", 9);
        setIntField(term681388, term681388.getClass(), "type", 9);
        setIntField(term681458, term681458.getClass(), "type", 9);
        setIntField(term681528, term681528.getClass(), "type", 9);
        setIntField(term681598, term681598.getClass(), "type", 9);
        setIntField(term681668, term681668.getClass(), "type", 9);
        setIntField(term681738, term681738.getClass(), "type", 9);
        setIntField(term681808, term681808.getClass(), "type", 9);
        setIntField(term681878, term681878.getClass(), "type", 9);
        setIntField(term681948, term681948.getClass(), "type", 9);
        setIntField(term682018, term682018.getClass(), "type", 9);
        setIntField(term682088, term682088.getClass(), "type", 9);
        setIntField(term682158, term682158.getClass(), "type", 9);
        setIntField(term682228, term682228.getClass(), "type", 75);
        setField(term682158, term682158.getClass(), "first", term682228);
        setField(term682088, term682088.getClass(), "first", term682158);
        setField(term682018, term682018.getClass(), "first", term682088);
        setField(term681948, term681948.getClass(), "first", term682018);
        setField(term681878, term681878.getClass(), "first", term681948);
        setField(term681808, term681808.getClass(), "first", term681878);
        setField(term681738, term681738.getClass(), "first", term681808);
        setField(term681668, term681668.getClass(), "first", term681738);
        setField(term681598, term681598.getClass(), "first", term681668);
        setField(term681528, term681528.getClass(), "first", term681598);
        setField(term681458, term681458.getClass(), "first", term681528);
        setField(term681388, term681388.getClass(), "first", term681458);
        setField(term681318, term681318.getClass(), "first", term681388);
        setField(term681248, term681248.getClass(), "first", term681318);
        setField(term681178, term681178.getClass(), "first", term681248);
        setField(term681108, term681108.getClass(), "first", term681178);
        setField(term681038, term681038.getClass(), "first", term681108);
        setField(term680968, term680968.getClass(), "first", term681038);
        setField(term680898, term680898.getClass(), "first", term680968);
        setField(term680828, term680828.getClass(), "first", term680898);
        setField(term680758, term680758.getClass(), "first", term680828);
        setField(term680688, term680688.getClass(), "first", term680758);
        setField(term680618, term680618.getClass(), "first", term680688);
        setField(term680548, term680548.getClass(), "first", term680618);
        setField(term680478, term680478.getClass(), "first", term680548);
        setField(term680408, term680408.getClass(), "first", term680478);
        setField(term680338, term680338.getClass(), "first", term680408);
        setField(term680268, term680268.getClass(), "first", term680338);
        setField(term680198, term680198.getClass(), "first", term680268);
        setField(term680128, term680128.getClass(), "first", term680198);
        setField(term680058, term680058.getClass(), "first", term680128);
        setField(term679988, term679988.getClass(), "first", term680058);
        setField(term679918, term679918.getClass(), "first", term679988);
        setField(term679848, term679848.getClass(), "first", term679918);
        setField(term679778, term679778.getClass(), "first", term679848);
        setField(term679708, term679708.getClass(), "first", term679778);
        setField(term679638, term679638.getClass(), "first", term679708);
        setField(term679568, term679568.getClass(), "first", term679638);
        setField(term679498, term679498.getClass(), "first", term679568);
        setField(term679428, term679428.getClass(), "first", term679498);
        setField(term679358, term679358.getClass(), "first", term679428);
        setField(term679288, term679288.getClass(), "first", term679358);
        setField(term679218, term679218.getClass(), "first", term679288);
        setField(term679148, term679148.getClass(), "first", term679218);
        setField(term679078, term679078.getClass(), "first", term679148);
        setField(term679008, term679008.getClass(), "first", term679078);
        setField(term678938, term678938.getClass(), "first", term679008);
        setField(term678868, term678868.getClass(), "first", term678938);
        setField(term678798, term678798.getClass(), "first", term678868);
        setField(term678728, term678728.getClass(), "first", term678798);
        setField(term678658, term678658.getClass(), "first", term678728);
        setField(term678588, term678588.getClass(), "first", term678658);
        setField(term678518, term678518.getClass(), "first", term678588);
        setField(term678448, term678448.getClass(), "first", term678518);
        setField(term678378, term678378.getClass(), "first", term678448);
        setField(term678308, term678308.getClass(), "first", term678378);
        setField(term678238, term678238.getClass(), "first", term678308);
        setField(term678168, term678168.getClass(), "first", term678238);
        setField(term678098, term678098.getClass(), "first", term678168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term678098;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term678028, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


