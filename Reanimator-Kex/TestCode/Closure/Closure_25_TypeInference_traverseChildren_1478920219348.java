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

public class TypeInference_traverseChildren_1478920219348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1002201;
     Object term1002271;

    public TypeInference_traverseChildren_1478920219348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1002201 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1002271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1003951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1002341, term1002341.getClass(), "type", 18);
        setIntField(term1002411, term1002411.getClass(), "type", 18);
        setIntField(term1002481, term1002481.getClass(), "type", 18);
        setIntField(term1002551, term1002551.getClass(), "type", 18);
        setIntField(term1002621, term1002621.getClass(), "type", 18);
        setIntField(term1002691, term1002691.getClass(), "type", 18);
        setIntField(term1002761, term1002761.getClass(), "type", 18);
        setIntField(term1002831, term1002831.getClass(), "type", 18);
        setIntField(term1002901, term1002901.getClass(), "type", 18);
        setIntField(term1002971, term1002971.getClass(), "type", 18);
        setIntField(term1003041, term1003041.getClass(), "type", 18);
        setIntField(term1003111, term1003111.getClass(), "type", 18);
        setIntField(term1003181, term1003181.getClass(), "type", 18);
        setIntField(term1003251, term1003251.getClass(), "type", 18);
        setIntField(term1003321, term1003321.getClass(), "type", 18);
        setIntField(term1003391, term1003391.getClass(), "type", 18);
        setIntField(term1003461, term1003461.getClass(), "type", 18);
        setIntField(term1003531, term1003531.getClass(), "type", 18);
        setIntField(term1003601, term1003601.getClass(), "type", 18);
        setIntField(term1003671, term1003671.getClass(), "type", 18);
        setIntField(term1003741, term1003741.getClass(), "type", 18);
        setIntField(term1003811, term1003811.getClass(), "type", 18);
        setIntField(term1003881, term1003881.getClass(), "type", 18);
        setIntField(term1003951, term1003951.getClass(), "type", 18);
        setIntField(term1004021, term1004021.getClass(), "type", 18);
        setIntField(term1004091, term1004091.getClass(), "type", 18);
        setIntField(term1004161, term1004161.getClass(), "type", 18);
        setIntField(term1004231, term1004231.getClass(), "type", 18);
        setIntField(term1004301, term1004301.getClass(), "type", 18);
        setIntField(term1004371, term1004371.getClass(), "type", 18);
        setIntField(term1004441, term1004441.getClass(), "type", 18);
        setIntField(term1004511, term1004511.getClass(), "type", 18);
        setIntField(term1004581, term1004581.getClass(), "type", 18);
        setIntField(term1004651, term1004651.getClass(), "type", 18);
        setIntField(term1004721, term1004721.getClass(), "type", 18);
        setIntField(term1004791, term1004791.getClass(), "type", 18);
        setIntField(term1004861, term1004861.getClass(), "type", 18);
        setIntField(term1004931, term1004931.getClass(), "type", 127);
        setField(term1004861, term1004861.getClass(), "first", term1004931);
        setField(term1004791, term1004791.getClass(), "first", term1004861);
        setField(term1004721, term1004721.getClass(), "first", term1004791);
        setField(term1004651, term1004651.getClass(), "first", term1004721);
        setField(term1004581, term1004581.getClass(), "first", term1004651);
        setField(term1004511, term1004511.getClass(), "first", term1004581);
        setField(term1004441, term1004441.getClass(), "first", term1004511);
        setField(term1004371, term1004371.getClass(), "first", term1004441);
        setField(term1004301, term1004301.getClass(), "first", term1004371);
        setField(term1004231, term1004231.getClass(), "first", term1004301);
        setField(term1004161, term1004161.getClass(), "first", term1004231);
        setField(term1004091, term1004091.getClass(), "first", term1004161);
        setField(term1004021, term1004021.getClass(), "first", term1004091);
        setField(term1003951, term1003951.getClass(), "first", term1004021);
        setField(term1003881, term1003881.getClass(), "first", term1003951);
        setField(term1003811, term1003811.getClass(), "first", term1003881);
        setField(term1003741, term1003741.getClass(), "first", term1003811);
        setField(term1003671, term1003671.getClass(), "first", term1003741);
        setField(term1003601, term1003601.getClass(), "first", term1003671);
        setField(term1003531, term1003531.getClass(), "first", term1003601);
        setField(term1003461, term1003461.getClass(), "first", term1003531);
        setField(term1003391, term1003391.getClass(), "first", term1003461);
        setField(term1003321, term1003321.getClass(), "first", term1003391);
        setField(term1003251, term1003251.getClass(), "first", term1003321);
        setField(term1003181, term1003181.getClass(), "first", term1003251);
        setField(term1003111, term1003111.getClass(), "first", term1003181);
        setField(term1003041, term1003041.getClass(), "first", term1003111);
        setField(term1002971, term1002971.getClass(), "first", term1003041);
        setField(term1002901, term1002901.getClass(), "first", term1002971);
        setField(term1002831, term1002831.getClass(), "first", term1002901);
        setField(term1002761, term1002761.getClass(), "first", term1002831);
        setField(term1002691, term1002691.getClass(), "first", term1002761);
        setField(term1002621, term1002621.getClass(), "first", term1002691);
        setField(term1002551, term1002551.getClass(), "first", term1002621);
        setField(term1002481, term1002481.getClass(), "first", term1002551);
        setField(term1002411, term1002411.getClass(), "first", term1002481);
        setField(term1002341, term1002341.getClass(), "first", term1002411);
        setField(term1002271, term1002271.getClass(), "first", term1002341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1002271;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term1002201, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


