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

public class TypeInference_traverseGetElem_100203513296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400836;
     Object term400906;

    public TypeInference_traverseGetElem_100203513296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400836 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term400906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term400976, term400976.getClass(), "type", 98);
        setField(term401046, term401046.getClass(), "next", null);
        setIntField(term401046, term401046.getClass(), "type", 98);
        setField(term401116, term401116.getClass(), "next", null);
        setIntField(term401116, term401116.getClass(), "type", 98);
        setField(term401186, term401186.getClass(), "next", null);
        setIntField(term401186, term401186.getClass(), "type", 98);
        setField(term401256, term401256.getClass(), "next", null);
        setIntField(term401256, term401256.getClass(), "type", 98);
        setField(term401326, term401326.getClass(), "next", null);
        setIntField(term401326, term401326.getClass(), "type", 98);
        setField(term401396, term401396.getClass(), "next", null);
        setIntField(term401396, term401396.getClass(), "type", 98);
        setField(term401466, term401466.getClass(), "next", null);
        setIntField(term401466, term401466.getClass(), "type", 98);
        setField(term401536, term401536.getClass(), "next", null);
        setIntField(term401536, term401536.getClass(), "type", 98);
        setField(term401606, term401606.getClass(), "next", null);
        setIntField(term401606, term401606.getClass(), "type", 98);
        setField(term401676, term401676.getClass(), "next", null);
        setIntField(term401676, term401676.getClass(), "type", 98);
        setField(term401746, term401746.getClass(), "next", null);
        setIntField(term401746, term401746.getClass(), "type", 98);
        setField(term401816, term401816.getClass(), "next", null);
        setIntField(term401816, term401816.getClass(), "type", 98);
        setField(term401886, term401886.getClass(), "next", null);
        setIntField(term401886, term401886.getClass(), "type", 98);
        setField(term401956, term401956.getClass(), "next", null);
        setIntField(term401956, term401956.getClass(), "type", 98);
        setField(term402026, term402026.getClass(), "next", null);
        setIntField(term402026, term402026.getClass(), "type", 98);
        setField(term402096, term402096.getClass(), "next", null);
        setIntField(term402096, term402096.getClass(), "type", 98);
        setField(term402166, term402166.getClass(), "next", null);
        setIntField(term402166, term402166.getClass(), "type", 98);
        setField(term402236, term402236.getClass(), "next", null);
        setIntField(term402236, term402236.getClass(), "type", 98);
        setField(term402306, term402306.getClass(), "next", null);
        setIntField(term402306, term402306.getClass(), "type", 98);
        setField(term402376, term402376.getClass(), "next", null);
        setIntField(term402376, term402376.getClass(), "type", 98);
        setField(term402446, term402446.getClass(), "next", null);
        setIntField(term402446, term402446.getClass(), "type", 98);
        setField(term402516, term402516.getClass(), "next", null);
        setIntField(term402516, term402516.getClass(), "type", 98);
        setField(term402586, term402586.getClass(), "next", null);
        setIntField(term402586, term402586.getClass(), "type", 98);
        setField(term402656, term402656.getClass(), "next", null);
        setIntField(term402656, term402656.getClass(), "type", 98);
        setField(term402726, term402726.getClass(), "next", null);
        setIntField(term402726, term402726.getClass(), "type", 98);
        setField(term402796, term402796.getClass(), "next", null);
        setIntField(term402796, term402796.getClass(), "type", 98);
        setField(term402866, term402866.getClass(), "next", null);
        setIntField(term402866, term402866.getClass(), "type", 98);
        setField(term402936, term402936.getClass(), "next", null);
        setIntField(term402936, term402936.getClass(), "type", 98);
        setField(term403006, term403006.getClass(), "next", null);
        setIntField(term403006, term403006.getClass(), "type", 98);
        setField(term403076, term403076.getClass(), "next", null);
        setIntField(term403076, term403076.getClass(), "type", 98);
        setField(term403146, term403146.getClass(), "next", null);
        setIntField(term403146, term403146.getClass(), "type", 98);
        setField(term403216, term403216.getClass(), "next", null);
        setIntField(term403216, term403216.getClass(), "type", 98);
        setField(term403286, term403286.getClass(), "next", null);
        setIntField(term403286, term403286.getClass(), "type", 98);
        setField(term403356, term403356.getClass(), "next", null);
        setIntField(term403356, term403356.getClass(), "type", 98);
        setField(term403426, term403426.getClass(), "next", null);
        setIntField(term403426, term403426.getClass(), "type", 98);
        setField(term403496, term403496.getClass(), "next", null);
        setIntField(term403496, term403496.getClass(), "type", 98);
        setField(term403566, term403566.getClass(), "next", null);
        setIntField(term403566, term403566.getClass(), "type", 98);
        setField(term403636, term403636.getClass(), "next", null);
        setIntField(term403636, term403636.getClass(), "type", 63);
        setField(term403566, term403566.getClass(), "first", term403636);
        setField(term403566, term403566.getClass(), "last", null);
        setField(term403496, term403496.getClass(), "first", term403566);
        setField(term403496, term403496.getClass(), "last", null);
        setField(term403426, term403426.getClass(), "first", term403496);
        setField(term403426, term403426.getClass(), "last", null);
        setField(term403356, term403356.getClass(), "first", term403426);
        setField(term403356, term403356.getClass(), "last", null);
        setField(term403286, term403286.getClass(), "first", term403356);
        setField(term403286, term403286.getClass(), "last", null);
        setField(term403216, term403216.getClass(), "first", term403286);
        setField(term403216, term403216.getClass(), "last", null);
        setField(term403146, term403146.getClass(), "first", term403216);
        setField(term403146, term403146.getClass(), "last", null);
        setField(term403076, term403076.getClass(), "first", term403146);
        setField(term403076, term403076.getClass(), "last", null);
        setField(term403006, term403006.getClass(), "first", term403076);
        setField(term403006, term403006.getClass(), "last", null);
        setField(term402936, term402936.getClass(), "first", term403006);
        setField(term402936, term402936.getClass(), "last", null);
        setField(term402866, term402866.getClass(), "first", term402936);
        setField(term402866, term402866.getClass(), "last", null);
        setField(term402796, term402796.getClass(), "first", term402866);
        setField(term402796, term402796.getClass(), "last", null);
        setField(term402726, term402726.getClass(), "first", term402796);
        setField(term402726, term402726.getClass(), "last", null);
        setField(term402656, term402656.getClass(), "first", term402726);
        setField(term402656, term402656.getClass(), "last", null);
        setField(term402586, term402586.getClass(), "first", term402656);
        setField(term402586, term402586.getClass(), "last", null);
        setField(term402516, term402516.getClass(), "first", term402586);
        setField(term402516, term402516.getClass(), "last", null);
        setField(term402446, term402446.getClass(), "first", term402516);
        setField(term402446, term402446.getClass(), "last", null);
        setField(term402376, term402376.getClass(), "first", term402446);
        setField(term402376, term402376.getClass(), "last", null);
        setField(term402306, term402306.getClass(), "first", term402376);
        setField(term402306, term402306.getClass(), "last", null);
        setField(term402236, term402236.getClass(), "first", term402306);
        setField(term402236, term402236.getClass(), "last", null);
        setField(term402166, term402166.getClass(), "first", term402236);
        setField(term402166, term402166.getClass(), "last", null);
        setField(term402096, term402096.getClass(), "first", term402166);
        setField(term402096, term402096.getClass(), "last", null);
        setField(term402026, term402026.getClass(), "first", term402096);
        setField(term402026, term402026.getClass(), "last", null);
        setField(term401956, term401956.getClass(), "first", term402026);
        setField(term401956, term401956.getClass(), "last", null);
        setField(term401886, term401886.getClass(), "first", term401956);
        setField(term401886, term401886.getClass(), "last", null);
        setField(term401816, term401816.getClass(), "first", term401886);
        setField(term401816, term401816.getClass(), "last", null);
        setField(term401746, term401746.getClass(), "first", term401816);
        setField(term401746, term401746.getClass(), "last", null);
        setField(term401676, term401676.getClass(), "first", term401746);
        setField(term401676, term401676.getClass(), "last", null);
        setField(term401606, term401606.getClass(), "first", term401676);
        setField(term401606, term401606.getClass(), "last", null);
        setField(term401536, term401536.getClass(), "first", term401606);
        setField(term401536, term401536.getClass(), "last", null);
        setField(term401466, term401466.getClass(), "first", term401536);
        setField(term401466, term401466.getClass(), "last", null);
        setField(term401396, term401396.getClass(), "first", term401466);
        setField(term401396, term401396.getClass(), "last", null);
        setField(term401326, term401326.getClass(), "first", term401396);
        setField(term401326, term401326.getClass(), "last", null);
        setField(term401256, term401256.getClass(), "first", term401326);
        setField(term401256, term401256.getClass(), "last", null);
        setField(term401186, term401186.getClass(), "first", term401256);
        setField(term401186, term401186.getClass(), "last", null);
        setField(term401116, term401116.getClass(), "first", term401186);
        setField(term401116, term401116.getClass(), "last", null);
        setField(term401046, term401046.getClass(), "first", term401116);
        setField(term401046, term401046.getClass(), "last", null);
        setField(term400976, term400976.getClass(), "first", term401046);
        setField(term400976, term400976.getClass(), "last", null);
        setField(term400906, term400906.getClass(), "first", term400976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term400906;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term400836, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


