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

public class TypeInference_traverseGetElem_947565415370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1102032;
     Object term1102102;

    public TypeInference_traverseGetElem_947565415370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1102032 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1102102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1105042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1105112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1105182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1105252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1102172, term1102172.getClass(), "type", 21);
        setField(term1102242, term1102242.getClass(), "next", null);
        setIntField(term1102242, term1102242.getClass(), "type", 21);
        setField(term1102312, term1102312.getClass(), "next", null);
        setIntField(term1102312, term1102312.getClass(), "type", 21);
        setField(term1102382, term1102382.getClass(), "next", null);
        setIntField(term1102382, term1102382.getClass(), "type", 21);
        setField(term1102452, term1102452.getClass(), "next", null);
        setIntField(term1102452, term1102452.getClass(), "type", 21);
        setField(term1102522, term1102522.getClass(), "next", null);
        setIntField(term1102522, term1102522.getClass(), "type", 21);
        setField(term1102592, term1102592.getClass(), "next", null);
        setIntField(term1102592, term1102592.getClass(), "type", 21);
        setField(term1102662, term1102662.getClass(), "next", null);
        setIntField(term1102662, term1102662.getClass(), "type", 21);
        setField(term1102732, term1102732.getClass(), "next", null);
        setIntField(term1102732, term1102732.getClass(), "type", 21);
        setField(term1102802, term1102802.getClass(), "next", null);
        setIntField(term1102802, term1102802.getClass(), "type", 21);
        setField(term1102872, term1102872.getClass(), "next", null);
        setIntField(term1102872, term1102872.getClass(), "type", 21);
        setField(term1102942, term1102942.getClass(), "next", null);
        setIntField(term1102942, term1102942.getClass(), "type", 21);
        setField(term1103012, term1103012.getClass(), "next", null);
        setIntField(term1103012, term1103012.getClass(), "type", 21);
        setField(term1103082, term1103082.getClass(), "next", null);
        setIntField(term1103082, term1103082.getClass(), "type", 21);
        setField(term1103152, term1103152.getClass(), "next", null);
        setIntField(term1103152, term1103152.getClass(), "type", 21);
        setField(term1103222, term1103222.getClass(), "next", null);
        setIntField(term1103222, term1103222.getClass(), "type", 21);
        setField(term1103292, term1103292.getClass(), "next", null);
        setIntField(term1103292, term1103292.getClass(), "type", 21);
        setField(term1103362, term1103362.getClass(), "next", null);
        setIntField(term1103362, term1103362.getClass(), "type", 21);
        setField(term1103432, term1103432.getClass(), "next", null);
        setIntField(term1103432, term1103432.getClass(), "type", 21);
        setField(term1103502, term1103502.getClass(), "next", null);
        setIntField(term1103502, term1103502.getClass(), "type", 21);
        setField(term1103572, term1103572.getClass(), "next", null);
        setIntField(term1103572, term1103572.getClass(), "type", 21);
        setField(term1103642, term1103642.getClass(), "next", null);
        setIntField(term1103642, term1103642.getClass(), "type", 21);
        setField(term1103712, term1103712.getClass(), "next", null);
        setIntField(term1103712, term1103712.getClass(), "type", 21);
        setField(term1103782, term1103782.getClass(), "next", null);
        setIntField(term1103782, term1103782.getClass(), "type", 21);
        setField(term1103852, term1103852.getClass(), "next", null);
        setIntField(term1103852, term1103852.getClass(), "type", 21);
        setField(term1103922, term1103922.getClass(), "next", null);
        setIntField(term1103922, term1103922.getClass(), "type", 21);
        setField(term1103992, term1103992.getClass(), "next", term1102242);
        setIntField(term1103992, term1103992.getClass(), "type", 21);
        setField(term1104132, term1104132.getClass(), "next", null);
        setIntField(term1104132, term1104132.getClass(), "type", 21);
        setField(term1104202, term1104202.getClass(), "next", term1102172);
        setIntField(term1104202, term1104202.getClass(), "type", 21);
        setField(term1104272, term1104272.getClass(), "next", null);
        setIntField(term1104272, term1104272.getClass(), "type", 21);
        setField(term1104342, term1104342.getClass(), "next", null);
        setIntField(term1104342, term1104342.getClass(), "type", 21);
        setField(term1104412, term1104412.getClass(), "next", null);
        setIntField(term1104412, term1104412.getClass(), "type", 21);
        setField(term1104482, term1104482.getClass(), "next", null);
        setIntField(term1104482, term1104482.getClass(), "type", 21);
        setField(term1104552, term1104552.getClass(), "next", null);
        setIntField(term1104552, term1104552.getClass(), "type", 21);
        setField(term1104622, term1104622.getClass(), "next", null);
        setIntField(term1104622, term1104622.getClass(), "type", 119);
        setField(term1104552, term1104552.getClass(), "first", term1104622);
        setField(term1104482, term1104482.getClass(), "first", term1104552);
        setField(term1104412, term1104412.getClass(), "first", term1104482);
        setField(term1104342, term1104342.getClass(), "first", term1104412);
        setField(term1104272, term1104272.getClass(), "first", term1104342);
        setField(term1104202, term1104202.getClass(), "first", term1104272);
        setField(term1104132, term1104132.getClass(), "first", term1104202);
        setField(term1104062, term1104062.getClass(), "next", term1104132);
        setIntField(term1104062, term1104062.getClass(), "type", 21);
        setField(term1104692, term1104692.getClass(), "next", term1102732);
        setIntField(term1104692, term1104692.getClass(), "type", 21);
        setField(term1104762, term1104762.getClass(), "next", term1104832);
        setIntField(term1104762, term1104762.getClass(), "type", 21);
        setField(term1104902, term1104902.getClass(), "next", term1104972);
        setIntField(term1104902, term1104902.getClass(), "type", 21);
        setField(term1105042, term1105042.getClass(), "next", term1105112);
        setIntField(term1105042, term1105042.getClass(), "type", 21);
        setField(term1105182, term1105182.getClass(), "next", null);
        setIntField(term1105182, term1105182.getClass(), "type", 21);
        setField(term1105252, term1105252.getClass(), "next", null);
        setIntField(term1105252, term1105252.getClass(), "type", 21);
        setField(term1105252, term1105252.getClass(), "first", term1104132);
        setField(term1105182, term1105182.getClass(), "first", term1105252);
        setField(term1105042, term1105042.getClass(), "first", term1105182);
        setField(term1104902, term1104902.getClass(), "first", term1105042);
        setField(term1104762, term1104762.getClass(), "first", term1104902);
        setField(term1104692, term1104692.getClass(), "first", term1104762);
        setField(term1104062, term1104062.getClass(), "first", term1104692);
        setField(term1103992, term1103992.getClass(), "first", term1104062);
        setField(term1103922, term1103922.getClass(), "first", term1103992);
        setField(term1103852, term1103852.getClass(), "first", term1103922);
        setField(term1103782, term1103782.getClass(), "first", term1103852);
        setField(term1103712, term1103712.getClass(), "first", term1103782);
        setField(term1103642, term1103642.getClass(), "first", term1103712);
        setField(term1103572, term1103572.getClass(), "first", term1103642);
        setField(term1103502, term1103502.getClass(), "first", term1103572);
        setField(term1103432, term1103432.getClass(), "first", term1103502);
        setField(term1103362, term1103362.getClass(), "first", term1103432);
        setField(term1103292, term1103292.getClass(), "first", term1103362);
        setField(term1103222, term1103222.getClass(), "first", term1103292);
        setField(term1103152, term1103152.getClass(), "first", term1103222);
        setField(term1103082, term1103082.getClass(), "first", term1103152);
        setField(term1103012, term1103012.getClass(), "first", term1103082);
        setField(term1102942, term1102942.getClass(), "first", term1103012);
        setField(term1102872, term1102872.getClass(), "first", term1102942);
        setField(term1102802, term1102802.getClass(), "first", term1102872);
        setField(term1102732, term1102732.getClass(), "first", term1102802);
        setField(term1102662, term1102662.getClass(), "first", term1102732);
        setField(term1102592, term1102592.getClass(), "first", term1102662);
        setField(term1102522, term1102522.getClass(), "first", term1102592);
        setField(term1102452, term1102452.getClass(), "first", term1102522);
        setField(term1102382, term1102382.getClass(), "first", term1102452);
        setField(term1102312, term1102312.getClass(), "first", term1102382);
        setField(term1102242, term1102242.getClass(), "first", term1102312);
        setField(term1102172, term1102172.getClass(), "first", term1102242);
        setField(term1102102, term1102102.getClass(), "first", term1102172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1102102;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term1102032, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


