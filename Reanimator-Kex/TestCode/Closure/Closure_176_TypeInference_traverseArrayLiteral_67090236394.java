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

public class TypeInference_traverseArrayLiteral_67090236394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1474353;
     Object term1474423;

    public TypeInference_traverseArrayLiteral_67090236394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1474353 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1474423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1474493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1474563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1474633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1474703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1474773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1474843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1474913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1474983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1478063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1478133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1478203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1478273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1478343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1474493, term1474493.getClass(), "type", 83);
        setIntField(term1474563, term1474563.getClass(), "type", 83);
        setIntField(term1474633, term1474633.getClass(), "type", 83);
        setIntField(term1474703, term1474703.getClass(), "type", 83);
        setIntField(term1474773, term1474773.getClass(), "type", 83);
        setIntField(term1474843, term1474843.getClass(), "type", 83);
        setIntField(term1474913, term1474913.getClass(), "type", 83);
        setIntField(term1474983, term1474983.getClass(), "type", 83);
        setIntField(term1475053, term1475053.getClass(), "type", 83);
        setIntField(term1475123, term1475123.getClass(), "type", 83);
        setIntField(term1475193, term1475193.getClass(), "type", 83);
        setIntField(term1475263, term1475263.getClass(), "type", 83);
        setIntField(term1475333, term1475333.getClass(), "type", 83);
        setIntField(term1475403, term1475403.getClass(), "type", 83);
        setIntField(term1475473, term1475473.getClass(), "type", 83);
        setIntField(term1475543, term1475543.getClass(), "type", 83);
        setIntField(term1475613, term1475613.getClass(), "type", 83);
        setIntField(term1475683, term1475683.getClass(), "type", 83);
        setIntField(term1475753, term1475753.getClass(), "type", 83);
        setIntField(term1475823, term1475823.getClass(), "type", 83);
        setIntField(term1475893, term1475893.getClass(), "type", 83);
        setIntField(term1475963, term1475963.getClass(), "type", 83);
        setIntField(term1476033, term1476033.getClass(), "type", 83);
        setIntField(term1476103, term1476103.getClass(), "type", 83);
        setIntField(term1476173, term1476173.getClass(), "type", 83);
        setIntField(term1476243, term1476243.getClass(), "type", 83);
        setIntField(term1476313, term1476313.getClass(), "type", 83);
        setIntField(term1476383, term1476383.getClass(), "type", 83);
        setIntField(term1476453, term1476453.getClass(), "type", 83);
        setIntField(term1476523, term1476523.getClass(), "type", 83);
        setIntField(term1476593, term1476593.getClass(), "type", 83);
        setIntField(term1476663, term1476663.getClass(), "type", 83);
        setIntField(term1476733, term1476733.getClass(), "type", 83);
        setIntField(term1476803, term1476803.getClass(), "type", 83);
        setIntField(term1476873, term1476873.getClass(), "type", 83);
        setIntField(term1476943, term1476943.getClass(), "type", 83);
        setIntField(term1477013, term1477013.getClass(), "type", 83);
        setIntField(term1477083, term1477083.getClass(), "type", 83);
        setIntField(term1477153, term1477153.getClass(), "type", 83);
        setIntField(term1477223, term1477223.getClass(), "type", 83);
        setIntField(term1477293, term1477293.getClass(), "type", 83);
        setIntField(term1477363, term1477363.getClass(), "type", 83);
        setIntField(term1477433, term1477433.getClass(), "type", 83);
        setIntField(term1477503, term1477503.getClass(), "type", 83);
        setIntField(term1477573, term1477573.getClass(), "type", 83);
        setIntField(term1477643, term1477643.getClass(), "type", 83);
        setIntField(term1477713, term1477713.getClass(), "type", 83);
        setIntField(term1477783, term1477783.getClass(), "type", 83);
        setIntField(term1477853, term1477853.getClass(), "type", 83);
        setIntField(term1477923, term1477923.getClass(), "type", 83);
        setIntField(term1477993, term1477993.getClass(), "type", 83);
        setIntField(term1478063, term1478063.getClass(), "type", 83);
        setIntField(term1478133, term1478133.getClass(), "type", 83);
        setIntField(term1478203, term1478203.getClass(), "type", 83);
        setIntField(term1478273, term1478273.getClass(), "type", 83);
        setIntField(term1478343, term1478343.getClass(), "type", 81);
        setField(term1478273, term1478273.getClass(), "first", term1478343);
        setField(term1478203, term1478203.getClass(), "first", term1478273);
        setField(term1478133, term1478133.getClass(), "first", term1478203);
        setField(term1478063, term1478063.getClass(), "first", term1478133);
        setField(term1477993, term1477993.getClass(), "first", term1478063);
        setField(term1477923, term1477923.getClass(), "first", term1477993);
        setField(term1477853, term1477853.getClass(), "first", term1477923);
        setField(term1477783, term1477783.getClass(), "first", term1477853);
        setField(term1477713, term1477713.getClass(), "first", term1477783);
        setField(term1477643, term1477643.getClass(), "first", term1477713);
        setField(term1477573, term1477573.getClass(), "first", term1477643);
        setField(term1477503, term1477503.getClass(), "first", term1477573);
        setField(term1477433, term1477433.getClass(), "first", term1477503);
        setField(term1477363, term1477363.getClass(), "first", term1477433);
        setField(term1477293, term1477293.getClass(), "first", term1477363);
        setField(term1477223, term1477223.getClass(), "first", term1477293);
        setField(term1477153, term1477153.getClass(), "first", term1477223);
        setField(term1477083, term1477083.getClass(), "first", term1477153);
        setField(term1477013, term1477013.getClass(), "first", term1477083);
        setField(term1476943, term1476943.getClass(), "first", term1477013);
        setField(term1476873, term1476873.getClass(), "first", term1476943);
        setField(term1476803, term1476803.getClass(), "first", term1476873);
        setField(term1476733, term1476733.getClass(), "first", term1476803);
        setField(term1476663, term1476663.getClass(), "first", term1476733);
        setField(term1476593, term1476593.getClass(), "first", term1476663);
        setField(term1476523, term1476523.getClass(), "first", term1476593);
        setField(term1476453, term1476453.getClass(), "first", term1476523);
        setField(term1476383, term1476383.getClass(), "first", term1476453);
        setField(term1476313, term1476313.getClass(), "first", term1476383);
        setField(term1476243, term1476243.getClass(), "first", term1476313);
        setField(term1476173, term1476173.getClass(), "first", term1476243);
        setField(term1476103, term1476103.getClass(), "first", term1476173);
        setField(term1476033, term1476033.getClass(), "first", term1476103);
        setField(term1475963, term1475963.getClass(), "first", term1476033);
        setField(term1475893, term1475893.getClass(), "first", term1475963);
        setField(term1475823, term1475823.getClass(), "first", term1475893);
        setField(term1475753, term1475753.getClass(), "first", term1475823);
        setField(term1475683, term1475683.getClass(), "first", term1475753);
        setField(term1475613, term1475613.getClass(), "first", term1475683);
        setField(term1475543, term1475543.getClass(), "first", term1475613);
        setField(term1475473, term1475473.getClass(), "first", term1475543);
        setField(term1475403, term1475403.getClass(), "first", term1475473);
        setField(term1475333, term1475333.getClass(), "first", term1475403);
        setField(term1475263, term1475263.getClass(), "first", term1475333);
        setField(term1475193, term1475193.getClass(), "first", term1475263);
        setField(term1475123, term1475123.getClass(), "first", term1475193);
        setField(term1475053, term1475053.getClass(), "first", term1475123);
        setField(term1474983, term1474983.getClass(), "first", term1475053);
        setField(term1474913, term1474913.getClass(), "first", term1474983);
        setField(term1474843, term1474843.getClass(), "first", term1474913);
        setField(term1474773, term1474773.getClass(), "first", term1474843);
        setField(term1474703, term1474703.getClass(), "first", term1474773);
        setField(term1474633, term1474633.getClass(), "first", term1474703);
        setField(term1474563, term1474563.getClass(), "first", term1474633);
        setField(term1474493, term1474493.getClass(), "first", term1474563);
        setField(term1474423, term1474423.getClass(), "first", term1474493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1474423;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1474353, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


