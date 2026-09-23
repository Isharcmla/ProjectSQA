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

public class TypeInference_traverseAdd_838817955417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1275201;
     Object term1275271;

    public TypeInference_traverseAdd_838817955417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1275201 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1275271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1278001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1275341, term1275341.getClass(), "next", null);
        setIntField(term1275341, term1275341.getClass(), "type", 14);
        setIntField(term1275411, term1275411.getClass(), "type", 14);
        setIntField(term1275481, term1275481.getClass(), "type", 14);
        setIntField(term1275551, term1275551.getClass(), "type", 14);
        setIntField(term1275621, term1275621.getClass(), "type", 14);
        setIntField(term1275691, term1275691.getClass(), "type", 14);
        setIntField(term1275761, term1275761.getClass(), "type", 14);
        setIntField(term1275831, term1275831.getClass(), "type", 14);
        setIntField(term1275901, term1275901.getClass(), "type", 14);
        setIntField(term1275971, term1275971.getClass(), "type", 14);
        setIntField(term1276041, term1276041.getClass(), "type", 14);
        setIntField(term1276111, term1276111.getClass(), "type", 14);
        setIntField(term1276181, term1276181.getClass(), "type", 14);
        setIntField(term1276251, term1276251.getClass(), "type", 14);
        setIntField(term1276321, term1276321.getClass(), "type", 14);
        setIntField(term1276391, term1276391.getClass(), "type", 14);
        setIntField(term1276461, term1276461.getClass(), "type", 14);
        setIntField(term1276531, term1276531.getClass(), "type", 14);
        setIntField(term1276601, term1276601.getClass(), "type", 14);
        setIntField(term1276671, term1276671.getClass(), "type", 14);
        setIntField(term1276741, term1276741.getClass(), "type", 14);
        setIntField(term1276811, term1276811.getClass(), "type", 14);
        setIntField(term1276881, term1276881.getClass(), "type", 14);
        setIntField(term1276951, term1276951.getClass(), "type", 14);
        setIntField(term1277021, term1277021.getClass(), "type", 14);
        setIntField(term1277091, term1277091.getClass(), "type", 14);
        setIntField(term1277161, term1277161.getClass(), "type", 14);
        setIntField(term1277231, term1277231.getClass(), "type", 14);
        setIntField(term1277301, term1277301.getClass(), "type", 14);
        setIntField(term1277371, term1277371.getClass(), "type", 14);
        setIntField(term1277441, term1277441.getClass(), "type", 14);
        setIntField(term1277511, term1277511.getClass(), "type", 14);
        setIntField(term1277581, term1277581.getClass(), "type", 14);
        setIntField(term1277651, term1277651.getClass(), "type", 14);
        setIntField(term1277721, term1277721.getClass(), "type", 14);
        setIntField(term1277791, term1277791.getClass(), "type", 14);
        setIntField(term1277861, term1277861.getClass(), "type", 14);
        setIntField(term1277931, term1277931.getClass(), "type", 14);
        setIntField(term1278001, term1278001.getClass(), "type", 44);
        setField(term1277931, term1277931.getClass(), "first", term1278001);
        setField(term1277861, term1277861.getClass(), "first", term1277931);
        setField(term1277791, term1277791.getClass(), "first", term1277861);
        setField(term1277721, term1277721.getClass(), "first", term1277791);
        setField(term1277651, term1277651.getClass(), "first", term1277721);
        setField(term1277581, term1277581.getClass(), "first", term1277651);
        setField(term1277511, term1277511.getClass(), "first", term1277581);
        setField(term1277441, term1277441.getClass(), "first", term1277511);
        setField(term1277371, term1277371.getClass(), "first", term1277441);
        setField(term1277301, term1277301.getClass(), "first", term1277371);
        setField(term1277231, term1277231.getClass(), "first", term1277301);
        setField(term1277161, term1277161.getClass(), "first", term1277231);
        setField(term1277091, term1277091.getClass(), "first", term1277161);
        setField(term1277021, term1277021.getClass(), "first", term1277091);
        setField(term1276951, term1276951.getClass(), "first", term1277021);
        setField(term1276881, term1276881.getClass(), "first", term1276951);
        setField(term1276811, term1276811.getClass(), "first", term1276881);
        setField(term1276741, term1276741.getClass(), "first", term1276811);
        setField(term1276671, term1276671.getClass(), "first", term1276741);
        setField(term1276601, term1276601.getClass(), "first", term1276671);
        setField(term1276531, term1276531.getClass(), "first", term1276601);
        setField(term1276461, term1276461.getClass(), "first", term1276531);
        setField(term1276391, term1276391.getClass(), "first", term1276461);
        setField(term1276321, term1276321.getClass(), "first", term1276391);
        setField(term1276251, term1276251.getClass(), "first", term1276321);
        setField(term1276181, term1276181.getClass(), "first", term1276251);
        setField(term1276111, term1276111.getClass(), "first", term1276181);
        setField(term1276041, term1276041.getClass(), "first", term1276111);
        setField(term1275971, term1275971.getClass(), "first", term1276041);
        setField(term1275901, term1275901.getClass(), "first", term1275971);
        setField(term1275831, term1275831.getClass(), "first", term1275901);
        setField(term1275761, term1275761.getClass(), "first", term1275831);
        setField(term1275691, term1275691.getClass(), "first", term1275761);
        setField(term1275621, term1275621.getClass(), "first", term1275691);
        setField(term1275551, term1275551.getClass(), "first", term1275621);
        setField(term1275481, term1275481.getClass(), "first", term1275551);
        setField(term1275411, term1275411.getClass(), "first", term1275481);
        setField(term1275341, term1275341.getClass(), "first", term1275411);
        setField(term1275271, term1275271.getClass(), "first", term1275341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1275271;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1275201, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


