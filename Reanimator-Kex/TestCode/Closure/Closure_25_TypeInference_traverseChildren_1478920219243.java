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

public class TypeInference_traverseChildren_1478920219243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412398;
     Object term412468;

    public TypeInference_traverseChildren_1478920219243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412398 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term412468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term412538, term412538.getClass(), "type", 18);
        setIntField(term412608, term412608.getClass(), "type", 18);
        setIntField(term412678, term412678.getClass(), "type", 18);
        setIntField(term412748, term412748.getClass(), "type", 18);
        setIntField(term412818, term412818.getClass(), "type", 18);
        setIntField(term412888, term412888.getClass(), "type", 18);
        setIntField(term412958, term412958.getClass(), "type", 18);
        setIntField(term413028, term413028.getClass(), "type", 18);
        setIntField(term413098, term413098.getClass(), "type", 18);
        setIntField(term413168, term413168.getClass(), "type", 18);
        setIntField(term413238, term413238.getClass(), "type", 18);
        setIntField(term413308, term413308.getClass(), "type", 18);
        setIntField(term413378, term413378.getClass(), "type", 18);
        setIntField(term413448, term413448.getClass(), "type", 18);
        setIntField(term413518, term413518.getClass(), "type", 18);
        setIntField(term413588, term413588.getClass(), "type", 18);
        setIntField(term413658, term413658.getClass(), "type", 18);
        setIntField(term413728, term413728.getClass(), "type", 18);
        setIntField(term413798, term413798.getClass(), "type", 18);
        setIntField(term413868, term413868.getClass(), "type", 18);
        setIntField(term413938, term413938.getClass(), "type", 18);
        setIntField(term414008, term414008.getClass(), "type", 18);
        setIntField(term414078, term414078.getClass(), "type", 18);
        setIntField(term414148, term414148.getClass(), "type", 18);
        setIntField(term414218, term414218.getClass(), "type", 18);
        setIntField(term414288, term414288.getClass(), "type", 18);
        setIntField(term414358, term414358.getClass(), "type", 18);
        setIntField(term414428, term414428.getClass(), "type", 18);
        setIntField(term414498, term414498.getClass(), "type", 18);
        setIntField(term414568, term414568.getClass(), "type", 18);
        setIntField(term414638, term414638.getClass(), "type", 18);
        setIntField(term414708, term414708.getClass(), "type", 18);
        setIntField(term414778, term414778.getClass(), "type", 18);
        setIntField(term414848, term414848.getClass(), "type", 18);
        setIntField(term414918, term414918.getClass(), "type", 18);
        setIntField(term414988, term414988.getClass(), "type", 18);
        setIntField(term415058, term415058.getClass(), "type", 18);
        setIntField(term415128, term415128.getClass(), "type", 18);
        setIntField(term415198, term415198.getClass(), "type", 18);
        setIntField(term415268, term415268.getClass(), "type", 18);
        setIntField(term415338, term415338.getClass(), "type", 18);
        setIntField(term415408, term415408.getClass(), "type", 18);
        setIntField(term415478, term415478.getClass(), "type", 18);
        setIntField(term415548, term415548.getClass(), "type", 18);
        setIntField(term415618, term415618.getClass(), "type", 18);
        setIntField(term415688, term415688.getClass(), "type", 18);
        setIntField(term415758, term415758.getClass(), "type", 18);
        setIntField(term415828, term415828.getClass(), "type", 18);
        setIntField(term415898, term415898.getClass(), "type", 18);
        setIntField(term415968, term415968.getClass(), "type", 18);
        setIntField(term416038, term416038.getClass(), "type", 18);
        setIntField(term416108, term416108.getClass(), "type", 18);
        setIntField(term416178, term416178.getClass(), "type", 18);
        setIntField(term416248, term416248.getClass(), "type", 18);
        setIntField(term416318, term416318.getClass(), "type", 18);
        setIntField(term416388, term416388.getClass(), "type", 18);
        setIntField(term416458, term416458.getClass(), "type", 33);
        setField(term416388, term416388.getClass(), "first", term416458);
        setField(term416318, term416318.getClass(), "first", term416388);
        setField(term416248, term416248.getClass(), "first", term416318);
        setField(term416178, term416178.getClass(), "first", term416248);
        setField(term416108, term416108.getClass(), "first", term416178);
        setField(term416038, term416038.getClass(), "first", term416108);
        setField(term415968, term415968.getClass(), "first", term416038);
        setField(term415898, term415898.getClass(), "first", term415968);
        setField(term415828, term415828.getClass(), "first", term415898);
        setField(term415758, term415758.getClass(), "first", term415828);
        setField(term415688, term415688.getClass(), "first", term415758);
        setField(term415618, term415618.getClass(), "first", term415688);
        setField(term415548, term415548.getClass(), "first", term415618);
        setField(term415478, term415478.getClass(), "first", term415548);
        setField(term415408, term415408.getClass(), "first", term415478);
        setField(term415338, term415338.getClass(), "first", term415408);
        setField(term415268, term415268.getClass(), "first", term415338);
        setField(term415198, term415198.getClass(), "first", term415268);
        setField(term415128, term415128.getClass(), "first", term415198);
        setField(term415058, term415058.getClass(), "first", term415128);
        setField(term414988, term414988.getClass(), "first", term415058);
        setField(term414918, term414918.getClass(), "first", term414988);
        setField(term414848, term414848.getClass(), "first", term414918);
        setField(term414778, term414778.getClass(), "first", term414848);
        setField(term414708, term414708.getClass(), "first", term414778);
        setField(term414638, term414638.getClass(), "first", term414708);
        setField(term414568, term414568.getClass(), "first", term414638);
        setField(term414498, term414498.getClass(), "first", term414568);
        setField(term414428, term414428.getClass(), "first", term414498);
        setField(term414358, term414358.getClass(), "first", term414428);
        setField(term414288, term414288.getClass(), "first", term414358);
        setField(term414218, term414218.getClass(), "first", term414288);
        setField(term414148, term414148.getClass(), "first", term414218);
        setField(term414078, term414078.getClass(), "first", term414148);
        setField(term414008, term414008.getClass(), "first", term414078);
        setField(term413938, term413938.getClass(), "first", term414008);
        setField(term413868, term413868.getClass(), "first", term413938);
        setField(term413798, term413798.getClass(), "first", term413868);
        setField(term413728, term413728.getClass(), "first", term413798);
        setField(term413658, term413658.getClass(), "first", term413728);
        setField(term413588, term413588.getClass(), "first", term413658);
        setField(term413518, term413518.getClass(), "first", term413588);
        setField(term413448, term413448.getClass(), "first", term413518);
        setField(term413378, term413378.getClass(), "first", term413448);
        setField(term413308, term413308.getClass(), "first", term413378);
        setField(term413238, term413238.getClass(), "first", term413308);
        setField(term413168, term413168.getClass(), "first", term413238);
        setField(term413098, term413098.getClass(), "first", term413168);
        setField(term413028, term413028.getClass(), "first", term413098);
        setField(term412958, term412958.getClass(), "first", term413028);
        setField(term412888, term412888.getClass(), "first", term412958);
        setField(term412818, term412818.getClass(), "first", term412888);
        setField(term412748, term412748.getClass(), "first", term412818);
        setField(term412678, term412678.getClass(), "first", term412748);
        setField(term412608, term412608.getClass(), "first", term412678);
        setField(term412538, term412538.getClass(), "first", term412608);
        setField(term412468, term412468.getClass(), "first", term412538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term412468;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term412398, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


