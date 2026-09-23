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

public class TypeInference_traverseReturn_1142297770344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811113;
     Object term811183;

    public TypeInference_traverseReturn_1142297770344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term811113 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term811183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term811253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term811323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term811393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term811463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term811533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term811603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term811673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term811743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term811813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term811883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term811953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term811253, term811253.getClass(), "type", 92);
        setIntField(term811323, term811323.getClass(), "type", 92);
        setIntField(term811393, term811393.getClass(), "type", 92);
        setIntField(term811463, term811463.getClass(), "type", 92);
        setIntField(term811533, term811533.getClass(), "type", 92);
        setIntField(term811603, term811603.getClass(), "type", 92);
        setIntField(term811673, term811673.getClass(), "type", 92);
        setIntField(term811743, term811743.getClass(), "type", 92);
        setIntField(term811813, term811813.getClass(), "type", 92);
        setIntField(term811883, term811883.getClass(), "type", 92);
        setIntField(term811953, term811953.getClass(), "type", 92);
        setIntField(term812023, term812023.getClass(), "type", 92);
        setIntField(term812093, term812093.getClass(), "type", 92);
        setIntField(term812163, term812163.getClass(), "type", 92);
        setIntField(term812233, term812233.getClass(), "type", 92);
        setIntField(term812303, term812303.getClass(), "type", 92);
        setIntField(term812373, term812373.getClass(), "type", 92);
        setIntField(term812443, term812443.getClass(), "type", 92);
        setIntField(term812513, term812513.getClass(), "type", 92);
        setIntField(term812583, term812583.getClass(), "type", 92);
        setIntField(term812653, term812653.getClass(), "type", 92);
        setIntField(term812723, term812723.getClass(), "type", 92);
        setIntField(term812793, term812793.getClass(), "type", 92);
        setIntField(term812863, term812863.getClass(), "type", 92);
        setIntField(term812933, term812933.getClass(), "type", 92);
        setIntField(term813003, term813003.getClass(), "type", 92);
        setIntField(term813073, term813073.getClass(), "type", 92);
        setIntField(term813143, term813143.getClass(), "type", 92);
        setIntField(term813213, term813213.getClass(), "type", 92);
        setIntField(term813283, term813283.getClass(), "type", 92);
        setIntField(term813353, term813353.getClass(), "type", 92);
        setIntField(term813423, term813423.getClass(), "type", 92);
        setIntField(term813493, term813493.getClass(), "type", 92);
        setIntField(term813563, term813563.getClass(), "type", 92);
        setIntField(term813633, term813633.getClass(), "type", 92);
        setIntField(term813703, term813703.getClass(), "type", 92);
        setIntField(term813773, term813773.getClass(), "type", 92);
        setIntField(term813843, term813843.getClass(), "type", 92);
        setIntField(term813913, term813913.getClass(), "type", 92);
        setIntField(term813983, term813983.getClass(), "type", 92);
        setIntField(term814053, term814053.getClass(), "type", 92);
        setIntField(term814123, term814123.getClass(), "type", 92);
        setIntField(term814193, term814193.getClass(), "type", 92);
        setIntField(term814263, term814263.getClass(), "type", 92);
        setIntField(term814333, term814333.getClass(), "type", 92);
        setIntField(term814403, term814403.getClass(), "type", 92);
        setIntField(term814473, term814473.getClass(), "type", 92);
        setIntField(term814543, term814543.getClass(), "type", 92);
        setIntField(term814613, term814613.getClass(), "type", 92);
        setIntField(term814683, term814683.getClass(), "type", 92);
        setIntField(term814753, term814753.getClass(), "type", 92);
        setIntField(term814823, term814823.getClass(), "type", 92);
        setIntField(term814893, term814893.getClass(), "type", 92);
        setIntField(term814963, term814963.getClass(), "type", 92);
        setIntField(term815033, term815033.getClass(), "type", 92);
        setIntField(term815103, term815103.getClass(), "type", 92);
        setIntField(term815173, term815173.getClass(), "type", 92);
        setIntField(term815243, term815243.getClass(), "type", 92);
        setIntField(term815313, term815313.getClass(), "type", 92);
        setIntField(term815383, term815383.getClass(), "type", 92);
        setIntField(term815453, term815453.getClass(), "type", 92);
        setIntField(term815523, term815523.getClass(), "type", 92);
        setIntField(term815593, term815593.getClass(), "type", 92);
        setIntField(term815663, term815663.getClass(), "type", 92);
        setIntField(term815733, term815733.getClass(), "type", 92);
        setIntField(term815803, term815803.getClass(), "type", 71);
        setField(term815733, term815733.getClass(), "first", term815803);
        setField(term815663, term815663.getClass(), "first", term815733);
        setField(term815593, term815593.getClass(), "first", term815663);
        setField(term815523, term815523.getClass(), "first", term815593);
        setField(term815453, term815453.getClass(), "first", term815523);
        setField(term815383, term815383.getClass(), "first", term815453);
        setField(term815313, term815313.getClass(), "first", term815383);
        setField(term815243, term815243.getClass(), "first", term815313);
        setField(term815173, term815173.getClass(), "first", term815243);
        setField(term815103, term815103.getClass(), "first", term815173);
        setField(term815033, term815033.getClass(), "first", term815103);
        setField(term814963, term814963.getClass(), "first", term815033);
        setField(term814893, term814893.getClass(), "first", term814963);
        setField(term814823, term814823.getClass(), "first", term814893);
        setField(term814753, term814753.getClass(), "first", term814823);
        setField(term814683, term814683.getClass(), "first", term814753);
        setField(term814613, term814613.getClass(), "first", term814683);
        setField(term814543, term814543.getClass(), "first", term814613);
        setField(term814473, term814473.getClass(), "first", term814543);
        setField(term814403, term814403.getClass(), "first", term814473);
        setField(term814333, term814333.getClass(), "first", term814403);
        setField(term814263, term814263.getClass(), "first", term814333);
        setField(term814193, term814193.getClass(), "first", term814263);
        setField(term814123, term814123.getClass(), "first", term814193);
        setField(term814053, term814053.getClass(), "first", term814123);
        setField(term813983, term813983.getClass(), "first", term814053);
        setField(term813913, term813913.getClass(), "first", term813983);
        setField(term813843, term813843.getClass(), "first", term813913);
        setField(term813773, term813773.getClass(), "first", term813843);
        setField(term813703, term813703.getClass(), "first", term813773);
        setField(term813633, term813633.getClass(), "first", term813703);
        setField(term813563, term813563.getClass(), "first", term813633);
        setField(term813493, term813493.getClass(), "first", term813563);
        setField(term813423, term813423.getClass(), "first", term813493);
        setField(term813353, term813353.getClass(), "first", term813423);
        setField(term813283, term813283.getClass(), "first", term813353);
        setField(term813213, term813213.getClass(), "first", term813283);
        setField(term813143, term813143.getClass(), "first", term813213);
        setField(term813073, term813073.getClass(), "first", term813143);
        setField(term813003, term813003.getClass(), "first", term813073);
        setField(term812933, term812933.getClass(), "first", term813003);
        setField(term812863, term812863.getClass(), "first", term812933);
        setField(term812793, term812793.getClass(), "first", term812863);
        setField(term812723, term812723.getClass(), "first", term812793);
        setField(term812653, term812653.getClass(), "first", term812723);
        setField(term812583, term812583.getClass(), "first", term812653);
        setField(term812513, term812513.getClass(), "first", term812583);
        setField(term812443, term812443.getClass(), "first", term812513);
        setField(term812373, term812373.getClass(), "first", term812443);
        setField(term812303, term812303.getClass(), "first", term812373);
        setField(term812233, term812233.getClass(), "first", term812303);
        setField(term812163, term812163.getClass(), "first", term812233);
        setField(term812093, term812093.getClass(), "first", term812163);
        setField(term812023, term812023.getClass(), "first", term812093);
        setField(term811953, term811953.getClass(), "first", term812023);
        setField(term811883, term811883.getClass(), "first", term811953);
        setField(term811813, term811813.getClass(), "first", term811883);
        setField(term811743, term811743.getClass(), "first", term811813);
        setField(term811673, term811673.getClass(), "first", term811743);
        setField(term811603, term811603.getClass(), "first", term811673);
        setField(term811533, term811533.getClass(), "first", term811603);
        setField(term811463, term811463.getClass(), "first", term811533);
        setField(term811393, term811393.getClass(), "first", term811463);
        setField(term811323, term811323.getClass(), "first", term811393);
        setField(term811253, term811253.getClass(), "first", term811323);
        setField(term811183, term811183.getClass(), "first", term811253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term811183;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term811113, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


