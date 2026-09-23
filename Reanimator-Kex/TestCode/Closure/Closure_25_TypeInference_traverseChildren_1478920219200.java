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

public class TypeInference_traverseChildren_1478920219200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145392;
     Object term145462;

    public TypeInference_traverseChildren_1478920219200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145392 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term145462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145532, term145532.getClass(), "type", 18);
        setIntField(term145602, term145602.getClass(), "type", 18);
        setIntField(term145672, term145672.getClass(), "type", 18);
        setIntField(term145742, term145742.getClass(), "type", 18);
        setIntField(term145812, term145812.getClass(), "type", 18);
        setIntField(term145882, term145882.getClass(), "type", 18);
        setIntField(term145952, term145952.getClass(), "type", 18);
        setIntField(term146022, term146022.getClass(), "type", 18);
        setIntField(term146092, term146092.getClass(), "type", 18);
        setIntField(term146162, term146162.getClass(), "type", 18);
        setIntField(term146232, term146232.getClass(), "type", 18);
        setIntField(term146302, term146302.getClass(), "type", 18);
        setIntField(term146372, term146372.getClass(), "type", 18);
        setIntField(term146442, term146442.getClass(), "type", 18);
        setIntField(term146512, term146512.getClass(), "type", 18);
        setIntField(term146582, term146582.getClass(), "type", 18);
        setIntField(term146652, term146652.getClass(), "type", 18);
        setIntField(term146722, term146722.getClass(), "type", 18);
        setIntField(term146792, term146792.getClass(), "type", 18);
        setIntField(term146862, term146862.getClass(), "type", 18);
        setIntField(term146932, term146932.getClass(), "type", 18);
        setIntField(term147002, term147002.getClass(), "type", 18);
        setIntField(term147072, term147072.getClass(), "type", 18);
        setIntField(term147142, term147142.getClass(), "type", 18);
        setIntField(term147212, term147212.getClass(), "type", 18);
        setIntField(term147282, term147282.getClass(), "type", 18);
        setIntField(term147352, term147352.getClass(), "type", 18);
        setIntField(term147422, term147422.getClass(), "type", 18);
        setIntField(term147492, term147492.getClass(), "type", 18);
        setIntField(term147562, term147562.getClass(), "type", 18);
        setIntField(term147632, term147632.getClass(), "type", 18);
        setIntField(term147702, term147702.getClass(), "type", 18);
        setIntField(term147772, term147772.getClass(), "type", 18);
        setIntField(term147842, term147842.getClass(), "type", 18);
        setIntField(term147912, term147912.getClass(), "type", 18);
        setIntField(term147982, term147982.getClass(), "type", 18);
        setIntField(term148052, term148052.getClass(), "type", 18);
        setIntField(term148122, term148122.getClass(), "type", 18);
        setIntField(term148192, term148192.getClass(), "type", 18);
        setIntField(term148262, term148262.getClass(), "type", 18);
        setIntField(term148332, term148332.getClass(), "type", 18);
        setIntField(term148402, term148402.getClass(), "type", 72);
        setField(term148332, term148332.getClass(), "first", term148402);
        setField(term148262, term148262.getClass(), "first", term148332);
        setField(term148192, term148192.getClass(), "first", term148262);
        setField(term148122, term148122.getClass(), "first", term148192);
        setField(term148052, term148052.getClass(), "first", term148122);
        setField(term147982, term147982.getClass(), "first", term148052);
        setField(term147912, term147912.getClass(), "first", term147982);
        setField(term147842, term147842.getClass(), "first", term147912);
        setField(term147772, term147772.getClass(), "first", term147842);
        setField(term147702, term147702.getClass(), "first", term147772);
        setField(term147632, term147632.getClass(), "first", term147702);
        setField(term147562, term147562.getClass(), "first", term147632);
        setField(term147492, term147492.getClass(), "first", term147562);
        setField(term147422, term147422.getClass(), "first", term147492);
        setField(term147352, term147352.getClass(), "first", term147422);
        setField(term147282, term147282.getClass(), "first", term147352);
        setField(term147212, term147212.getClass(), "first", term147282);
        setField(term147142, term147142.getClass(), "first", term147212);
        setField(term147072, term147072.getClass(), "first", term147142);
        setField(term147002, term147002.getClass(), "first", term147072);
        setField(term146932, term146932.getClass(), "first", term147002);
        setField(term146862, term146862.getClass(), "first", term146932);
        setField(term146792, term146792.getClass(), "first", term146862);
        setField(term146722, term146722.getClass(), "first", term146792);
        setField(term146652, term146652.getClass(), "first", term146722);
        setField(term146582, term146582.getClass(), "first", term146652);
        setField(term146512, term146512.getClass(), "first", term146582);
        setField(term146442, term146442.getClass(), "first", term146512);
        setField(term146372, term146372.getClass(), "first", term146442);
        setField(term146302, term146302.getClass(), "first", term146372);
        setField(term146232, term146232.getClass(), "first", term146302);
        setField(term146162, term146162.getClass(), "first", term146232);
        setField(term146092, term146092.getClass(), "first", term146162);
        setField(term146022, term146022.getClass(), "first", term146092);
        setField(term145952, term145952.getClass(), "first", term146022);
        setField(term145882, term145882.getClass(), "first", term145952);
        setField(term145812, term145812.getClass(), "first", term145882);
        setField(term145742, term145742.getClass(), "first", term145812);
        setField(term145672, term145672.getClass(), "first", term145742);
        setField(term145602, term145602.getClass(), "first", term145672);
        setField(term145532, term145532.getClass(), "first", term145602);
        setField(term145462, term145462.getClass(), "first", term145532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term145462;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term145392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


