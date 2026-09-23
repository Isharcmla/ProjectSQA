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

public class MustBeReachingVariableDef_computeMustDef_1796935056199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76607;
     Object term76677;

    public MustBeReachingVariableDef_computeMustDef_1796935056199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76607 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term76677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76677, term76677.getClass(), "type", 1265463001);
        setIntField(term76747, term76747.getClass(), "type", 123);
        setIntField(term76817, term76817.getClass(), "type", 123);
        setIntField(term76887, term76887.getClass(), "type", 123);
        setIntField(term76957, term76957.getClass(), "type", 123);
        setIntField(term77027, term77027.getClass(), "type", 123);
        setIntField(term77097, term77097.getClass(), "type", 123);
        setIntField(term77167, term77167.getClass(), "type", 123);
        setIntField(term77237, term77237.getClass(), "type", 123);
        setIntField(term77307, term77307.getClass(), "type", 123);
        setIntField(term77377, term77377.getClass(), "type", 123);
        setIntField(term77447, term77447.getClass(), "type", 123);
        setIntField(term77517, term77517.getClass(), "type", 123);
        setIntField(term77587, term77587.getClass(), "type", 123);
        setIntField(term77657, term77657.getClass(), "type", 123);
        setIntField(term77727, term77727.getClass(), "type", 123);
        setIntField(term77797, term77797.getClass(), "type", 123);
        setIntField(term77867, term77867.getClass(), "type", 123);
        setIntField(term77937, term77937.getClass(), "type", 123);
        setIntField(term78007, term78007.getClass(), "type", 123);
        setIntField(term78077, term78077.getClass(), "type", 123);
        setIntField(term78147, term78147.getClass(), "type", 123);
        setIntField(term78217, term78217.getClass(), "type", 123);
        setIntField(term78287, term78287.getClass(), "type", 123);
        setIntField(term78357, term78357.getClass(), "type", 123);
        setIntField(term78427, term78427.getClass(), "type", 123);
        setIntField(term78497, term78497.getClass(), "type", 123);
        setIntField(term78567, term78567.getClass(), "type", 123);
        setIntField(term78637, term78637.getClass(), "type", 123);
        setIntField(term78707, term78707.getClass(), "type", 123);
        setIntField(term78777, term78777.getClass(), "type", 123);
        setIntField(term78847, term78847.getClass(), "type", 123);
        setIntField(term78917, term78917.getClass(), "type", 123);
        setIntField(term78987, term78987.getClass(), "type", 123);
        setIntField(term79057, term79057.getClass(), "type", 123);
        setIntField(term79127, term79127.getClass(), "type", 123);
        setIntField(term79197, term79197.getClass(), "type", 123);
        setIntField(term79267, term79267.getClass(), "type", 123);
        setIntField(term79337, term79337.getClass(), "type", 123);
        setIntField(term79407, term79407.getClass(), "type", 123);
        setIntField(term79477, term79477.getClass(), "type", 123);
        setIntField(term79547, term79547.getClass(), "type", 123);
        setIntField(term79617, term79617.getClass(), "type", 123);
        setIntField(term79687, term79687.getClass(), "type", 123);
        setIntField(term79757, term79757.getClass(), "type", 123);
        setIntField(term79827, term79827.getClass(), "type", 123);
        setIntField(term79897, term79897.getClass(), "type", 123);
        setIntField(term79967, term79967.getClass(), "type", 123);
        setIntField(term80037, term80037.getClass(), "type", 123);
        setIntField(term80107, term80107.getClass(), "type", 123);
        setIntField(term80177, term80177.getClass(), "type", 123);
        setIntField(term80247, term80247.getClass(), "type", 123);
        setIntField(term80317, term80317.getClass(), "type", 123);
        setIntField(term80387, term80387.getClass(), "type", 108);
        setField(term80317, term80317.getClass(), "first", term80387);
        setField(term80247, term80247.getClass(), "first", term80317);
        setField(term80177, term80177.getClass(), "first", term80247);
        setField(term80107, term80107.getClass(), "first", term80177);
        setField(term80037, term80037.getClass(), "first", term80107);
        setField(term79967, term79967.getClass(), "first", term80037);
        setField(term79897, term79897.getClass(), "first", term79967);
        setField(term79827, term79827.getClass(), "first", term79897);
        setField(term79757, term79757.getClass(), "first", term79827);
        setField(term79687, term79687.getClass(), "first", term79757);
        setField(term79617, term79617.getClass(), "first", term79687);
        setField(term79547, term79547.getClass(), "first", term79617);
        setField(term79477, term79477.getClass(), "first", term79547);
        setField(term79407, term79407.getClass(), "first", term79477);
        setField(term79337, term79337.getClass(), "first", term79407);
        setField(term79267, term79267.getClass(), "first", term79337);
        setField(term79197, term79197.getClass(), "first", term79267);
        setField(term79127, term79127.getClass(), "first", term79197);
        setField(term79057, term79057.getClass(), "first", term79127);
        setField(term78987, term78987.getClass(), "first", term79057);
        setField(term78917, term78917.getClass(), "first", term78987);
        setField(term78847, term78847.getClass(), "first", term78917);
        setField(term78777, term78777.getClass(), "first", term78847);
        setField(term78707, term78707.getClass(), "first", term78777);
        setField(term78637, term78637.getClass(), "first", term78707);
        setField(term78567, term78567.getClass(), "first", term78637);
        setField(term78497, term78497.getClass(), "first", term78567);
        setField(term78427, term78427.getClass(), "first", term78497);
        setField(term78357, term78357.getClass(), "first", term78427);
        setField(term78287, term78287.getClass(), "first", term78357);
        setField(term78217, term78217.getClass(), "first", term78287);
        setField(term78147, term78147.getClass(), "first", term78217);
        setField(term78077, term78077.getClass(), "first", term78147);
        setField(term78007, term78007.getClass(), "first", term78077);
        setField(term77937, term77937.getClass(), "first", term78007);
        setField(term77867, term77867.getClass(), "first", term77937);
        setField(term77797, term77797.getClass(), "first", term77867);
        setField(term77727, term77727.getClass(), "first", term77797);
        setField(term77657, term77657.getClass(), "first", term77727);
        setField(term77587, term77587.getClass(), "first", term77657);
        setField(term77517, term77517.getClass(), "first", term77587);
        setField(term77447, term77447.getClass(), "first", term77517);
        setField(term77377, term77377.getClass(), "first", term77447);
        setField(term77307, term77307.getClass(), "first", term77377);
        setField(term77237, term77237.getClass(), "first", term77307);
        setField(term77167, term77167.getClass(), "first", term77237);
        setField(term77097, term77097.getClass(), "first", term77167);
        setField(term77027, term77027.getClass(), "first", term77097);
        setField(term76957, term76957.getClass(), "first", term77027);
        setField(term76887, term76887.getClass(), "first", term76957);
        setField(term76817, term76817.getClass(), "first", term76887);
        setField(term76747, term76747.getClass(), "first", term76817);
        setField(term76677, term76677.getClass(), "first", term76747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term76677;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMustDef", argTypes, term76607, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


