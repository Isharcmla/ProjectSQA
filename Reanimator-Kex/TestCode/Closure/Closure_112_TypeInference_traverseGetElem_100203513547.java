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

public class TypeInference_traverseGetElem_100203513547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2402112;
     Object term2402182;

    public TypeInference_traverseGetElem_100203513547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2402112 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2402182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2402252, term2402252.getClass(), "type", 98);
        setField(term2402322, term2402322.getClass(), "next", null);
        setIntField(term2402322, term2402322.getClass(), "type", 98);
        setField(term2402392, term2402392.getClass(), "next", null);
        setIntField(term2402392, term2402392.getClass(), "type", 98);
        setField(term2402462, term2402462.getClass(), "next", null);
        setIntField(term2402462, term2402462.getClass(), "type", 98);
        setField(term2402532, term2402532.getClass(), "next", null);
        setIntField(term2402532, term2402532.getClass(), "type", 98);
        setField(term2402602, term2402602.getClass(), "next", null);
        setIntField(term2402602, term2402602.getClass(), "type", 98);
        setField(term2402672, term2402672.getClass(), "next", null);
        setIntField(term2402672, term2402672.getClass(), "type", 98);
        setField(term2402742, term2402742.getClass(), "next", null);
        setIntField(term2402742, term2402742.getClass(), "type", 98);
        setField(term2402812, term2402812.getClass(), "next", null);
        setIntField(term2402812, term2402812.getClass(), "type", 98);
        setField(term2402882, term2402882.getClass(), "next", null);
        setIntField(term2402882, term2402882.getClass(), "type", 98);
        setField(term2402952, term2402952.getClass(), "next", null);
        setIntField(term2402952, term2402952.getClass(), "type", 98);
        setField(term2403022, term2403022.getClass(), "next", null);
        setIntField(term2403022, term2403022.getClass(), "type", 98);
        setField(term2403092, term2403092.getClass(), "next", null);
        setIntField(term2403092, term2403092.getClass(), "type", 98);
        setField(term2403162, term2403162.getClass(), "next", null);
        setIntField(term2403162, term2403162.getClass(), "type", 98);
        setField(term2403232, term2403232.getClass(), "next", null);
        setIntField(term2403232, term2403232.getClass(), "type", 98);
        setField(term2403302, term2403302.getClass(), "next", null);
        setIntField(term2403302, term2403302.getClass(), "type", 98);
        setField(term2403372, term2403372.getClass(), "next", null);
        setIntField(term2403372, term2403372.getClass(), "type", 98);
        setField(term2403442, term2403442.getClass(), "next", null);
        setIntField(term2403442, term2403442.getClass(), "type", 98);
        setField(term2403512, term2403512.getClass(), "next", null);
        setIntField(term2403512, term2403512.getClass(), "type", 98);
        setField(term2403582, term2403582.getClass(), "next", null);
        setIntField(term2403582, term2403582.getClass(), "type", 98);
        setField(term2403652, term2403652.getClass(), "next", null);
        setIntField(term2403652, term2403652.getClass(), "type", 98);
        setField(term2403722, term2403722.getClass(), "next", null);
        setIntField(term2403722, term2403722.getClass(), "type", 98);
        setField(term2403792, term2403792.getClass(), "next", null);
        setIntField(term2403792, term2403792.getClass(), "type", 98);
        setField(term2403862, term2403862.getClass(), "next", null);
        setIntField(term2403862, term2403862.getClass(), "type", 98);
        setField(term2403932, term2403932.getClass(), "next", null);
        setIntField(term2403932, term2403932.getClass(), "type", 98);
        setField(term2404002, term2404002.getClass(), "next", null);
        setIntField(term2404002, term2404002.getClass(), "type", 98);
        setField(term2404072, term2404072.getClass(), "next", null);
        setIntField(term2404072, term2404072.getClass(), "type", 98);
        setField(term2404142, term2404142.getClass(), "next", null);
        setIntField(term2404142, term2404142.getClass(), "type", 98);
        setField(term2404212, term2404212.getClass(), "next", null);
        setIntField(term2404212, term2404212.getClass(), "type", 98);
        setField(term2404282, term2404282.getClass(), "next", null);
        setIntField(term2404282, term2404282.getClass(), "type", 98);
        setField(term2404352, term2404352.getClass(), "next", null);
        setIntField(term2404352, term2404352.getClass(), "type", 98);
        setField(term2404422, term2404422.getClass(), "next", term2404492);
        setIntField(term2404422, term2404422.getClass(), "type", 98);
        setField(term2404562, term2404562.getClass(), "next", null);
        setIntField(term2404562, term2404562.getClass(), "type", 98);
        setField(term2404632, term2404632.getClass(), "next", null);
        setIntField(term2404632, term2404632.getClass(), "type", 93);
        setField(term2404562, term2404562.getClass(), "first", term2404632);
        setField(term2404562, term2404562.getClass(), "last", null);
        setField(term2404422, term2404422.getClass(), "first", term2404562);
        setField(term2404422, term2404422.getClass(), "last", null);
        setField(term2404352, term2404352.getClass(), "first", term2404422);
        setField(term2404352, term2404352.getClass(), "last", null);
        setField(term2404282, term2404282.getClass(), "first", term2404352);
        setField(term2404282, term2404282.getClass(), "last", null);
        setField(term2404212, term2404212.getClass(), "first", term2404282);
        setField(term2404212, term2404212.getClass(), "last", null);
        setField(term2404142, term2404142.getClass(), "first", term2404212);
        setField(term2404142, term2404142.getClass(), "last", null);
        setField(term2404072, term2404072.getClass(), "first", term2404142);
        setField(term2404072, term2404072.getClass(), "last", null);
        setField(term2404002, term2404002.getClass(), "first", term2404072);
        setField(term2404002, term2404002.getClass(), "last", null);
        setField(term2403932, term2403932.getClass(), "first", term2404002);
        setField(term2403932, term2403932.getClass(), "last", null);
        setField(term2403862, term2403862.getClass(), "first", term2403932);
        setField(term2403862, term2403862.getClass(), "last", null);
        setField(term2403792, term2403792.getClass(), "first", term2403862);
        setField(term2403792, term2403792.getClass(), "last", null);
        setField(term2403722, term2403722.getClass(), "first", term2403792);
        setField(term2403722, term2403722.getClass(), "last", null);
        setField(term2403652, term2403652.getClass(), "first", term2403722);
        setField(term2403652, term2403652.getClass(), "last", null);
        setField(term2403582, term2403582.getClass(), "first", term2403652);
        setField(term2403582, term2403582.getClass(), "last", null);
        setField(term2403512, term2403512.getClass(), "first", term2403582);
        setField(term2403512, term2403512.getClass(), "last", null);
        setField(term2403442, term2403442.getClass(), "first", term2403512);
        setField(term2403442, term2403442.getClass(), "last", null);
        setField(term2403372, term2403372.getClass(), "first", term2403442);
        setField(term2403372, term2403372.getClass(), "last", null);
        setField(term2403302, term2403302.getClass(), "first", term2403372);
        setField(term2403302, term2403302.getClass(), "last", null);
        setField(term2403232, term2403232.getClass(), "first", term2403302);
        setField(term2403232, term2403232.getClass(), "last", null);
        setField(term2403162, term2403162.getClass(), "first", term2403232);
        setField(term2403162, term2403162.getClass(), "last", null);
        setField(term2403092, term2403092.getClass(), "first", term2403162);
        setField(term2403092, term2403092.getClass(), "last", null);
        setField(term2403022, term2403022.getClass(), "first", term2403092);
        setField(term2403022, term2403022.getClass(), "last", null);
        setField(term2402952, term2402952.getClass(), "first", term2403022);
        setField(term2402952, term2402952.getClass(), "last", null);
        setField(term2402882, term2402882.getClass(), "first", term2402952);
        setField(term2402882, term2402882.getClass(), "last", null);
        setField(term2402812, term2402812.getClass(), "first", term2402882);
        setField(term2402812, term2402812.getClass(), "last", null);
        setField(term2402742, term2402742.getClass(), "first", term2402812);
        setField(term2402742, term2402742.getClass(), "last", null);
        setField(term2402672, term2402672.getClass(), "first", term2402742);
        setField(term2402672, term2402672.getClass(), "last", null);
        setField(term2402602, term2402602.getClass(), "first", term2402672);
        setField(term2402602, term2402602.getClass(), "last", null);
        setField(term2402532, term2402532.getClass(), "first", term2402602);
        setField(term2402532, term2402532.getClass(), "last", null);
        setField(term2402462, term2402462.getClass(), "first", term2402532);
        setField(term2402462, term2402462.getClass(), "last", null);
        setField(term2402392, term2402392.getClass(), "first", term2402462);
        setField(term2402392, term2402392.getClass(), "last", null);
        setField(term2402322, term2402322.getClass(), "first", term2402392);
        setField(term2402322, term2402322.getClass(), "last", null);
        setField(term2402252, term2402252.getClass(), "first", term2402322);
        setField(term2402252, term2402252.getClass(), "last", null);
        setField(term2402182, term2402182.getClass(), "first", term2402252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2402182;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term2402112, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


