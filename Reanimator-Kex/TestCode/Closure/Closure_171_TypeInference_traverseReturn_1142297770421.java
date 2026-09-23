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

public class TypeInference_traverseReturn_1142297770421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1116167;
     Object term1116237;

    public TypeInference_traverseReturn_1142297770421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1116167 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1116237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1116307, term1116307.getClass(), "type", 29);
        setIntField(term1116377, term1116377.getClass(), "type", 29);
        setIntField(term1116447, term1116447.getClass(), "type", 29);
        setIntField(term1116517, term1116517.getClass(), "type", 29);
        setIntField(term1116587, term1116587.getClass(), "type", 29);
        setIntField(term1116657, term1116657.getClass(), "type", 29);
        setIntField(term1116727, term1116727.getClass(), "type", 29);
        setIntField(term1116797, term1116797.getClass(), "type", 29);
        setIntField(term1116867, term1116867.getClass(), "type", 29);
        setIntField(term1116937, term1116937.getClass(), "type", 29);
        setIntField(term1117007, term1117007.getClass(), "type", 29);
        setIntField(term1117077, term1117077.getClass(), "type", 29);
        setIntField(term1117147, term1117147.getClass(), "type", 29);
        setIntField(term1117217, term1117217.getClass(), "type", 29);
        setIntField(term1117287, term1117287.getClass(), "type", 29);
        setIntField(term1117357, term1117357.getClass(), "type", 29);
        setIntField(term1117427, term1117427.getClass(), "type", 29);
        setIntField(term1117497, term1117497.getClass(), "type", 29);
        setIntField(term1117567, term1117567.getClass(), "type", 29);
        setIntField(term1117637, term1117637.getClass(), "type", 29);
        setIntField(term1117707, term1117707.getClass(), "type", 29);
        setIntField(term1117777, term1117777.getClass(), "type", 29);
        setIntField(term1117847, term1117847.getClass(), "type", 29);
        setIntField(term1117917, term1117917.getClass(), "type", 29);
        setIntField(term1117987, term1117987.getClass(), "type", 29);
        setIntField(term1118057, term1118057.getClass(), "type", 29);
        setIntField(term1118127, term1118127.getClass(), "type", 29);
        setIntField(term1118197, term1118197.getClass(), "type", 29);
        setIntField(term1118267, term1118267.getClass(), "type", 29);
        setIntField(term1118337, term1118337.getClass(), "type", 29);
        setIntField(term1118407, term1118407.getClass(), "type", 29);
        setIntField(term1118477, term1118477.getClass(), "type", 29);
        setIntField(term1118547, term1118547.getClass(), "type", 29);
        setIntField(term1118617, term1118617.getClass(), "type", 29);
        setIntField(term1118687, term1118687.getClass(), "type", 29);
        setIntField(term1118757, term1118757.getClass(), "type", 29);
        setIntField(term1118827, term1118827.getClass(), "type", 29);
        setIntField(term1118897, term1118897.getClass(), "type", 29);
        setIntField(term1118967, term1118967.getClass(), "type", 29);
        setIntField(term1119037, term1119037.getClass(), "type", 29);
        setIntField(term1119107, term1119107.getClass(), "type", 29);
        setIntField(term1119177, term1119177.getClass(), "type", 29);
        setIntField(term1119247, term1119247.getClass(), "type", 29);
        setIntField(term1119317, term1119317.getClass(), "type", 29);
        setIntField(term1119387, term1119387.getClass(), "type", 29);
        setIntField(term1119457, term1119457.getClass(), "type", 29);
        setIntField(term1119527, term1119527.getClass(), "type", 29);
        setIntField(term1119597, term1119597.getClass(), "type", 29);
        setIntField(term1119667, term1119667.getClass(), "type", 102);
        setField(term1119597, term1119597.getClass(), "first", term1119667);
        setField(term1119527, term1119527.getClass(), "first", term1119597);
        setField(term1119457, term1119457.getClass(), "first", term1119527);
        setField(term1119387, term1119387.getClass(), "first", term1119457);
        setField(term1119317, term1119317.getClass(), "first", term1119387);
        setField(term1119247, term1119247.getClass(), "first", term1119317);
        setField(term1119177, term1119177.getClass(), "first", term1119247);
        setField(term1119107, term1119107.getClass(), "first", term1119177);
        setField(term1119037, term1119037.getClass(), "first", term1119107);
        setField(term1118967, term1118967.getClass(), "first", term1119037);
        setField(term1118897, term1118897.getClass(), "first", term1118967);
        setField(term1118827, term1118827.getClass(), "first", term1118897);
        setField(term1118757, term1118757.getClass(), "first", term1118827);
        setField(term1118687, term1118687.getClass(), "first", term1118757);
        setField(term1118617, term1118617.getClass(), "first", term1118687);
        setField(term1118547, term1118547.getClass(), "first", term1118617);
        setField(term1118477, term1118477.getClass(), "first", term1118547);
        setField(term1118407, term1118407.getClass(), "first", term1118477);
        setField(term1118337, term1118337.getClass(), "first", term1118407);
        setField(term1118267, term1118267.getClass(), "first", term1118337);
        setField(term1118197, term1118197.getClass(), "first", term1118267);
        setField(term1118127, term1118127.getClass(), "first", term1118197);
        setField(term1118057, term1118057.getClass(), "first", term1118127);
        setField(term1117987, term1117987.getClass(), "first", term1118057);
        setField(term1117917, term1117917.getClass(), "first", term1117987);
        setField(term1117847, term1117847.getClass(), "first", term1117917);
        setField(term1117777, term1117777.getClass(), "first", term1117847);
        setField(term1117707, term1117707.getClass(), "first", term1117777);
        setField(term1117637, term1117637.getClass(), "first", term1117707);
        setField(term1117567, term1117567.getClass(), "first", term1117637);
        setField(term1117497, term1117497.getClass(), "first", term1117567);
        setField(term1117427, term1117427.getClass(), "first", term1117497);
        setField(term1117357, term1117357.getClass(), "first", term1117427);
        setField(term1117287, term1117287.getClass(), "first", term1117357);
        setField(term1117217, term1117217.getClass(), "first", term1117287);
        setField(term1117147, term1117147.getClass(), "first", term1117217);
        setField(term1117077, term1117077.getClass(), "first", term1117147);
        setField(term1117007, term1117007.getClass(), "first", term1117077);
        setField(term1116937, term1116937.getClass(), "first", term1117007);
        setField(term1116867, term1116867.getClass(), "first", term1116937);
        setField(term1116797, term1116797.getClass(), "first", term1116867);
        setField(term1116727, term1116727.getClass(), "first", term1116797);
        setField(term1116657, term1116657.getClass(), "first", term1116727);
        setField(term1116587, term1116587.getClass(), "first", term1116657);
        setField(term1116517, term1116517.getClass(), "first", term1116587);
        setField(term1116447, term1116447.getClass(), "first", term1116517);
        setField(term1116377, term1116377.getClass(), "first", term1116447);
        setField(term1116307, term1116307.getClass(), "first", term1116377);
        setField(term1116237, term1116237.getClass(), "first", term1116307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1116237;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1116167, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


