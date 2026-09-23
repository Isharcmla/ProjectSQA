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

public class TypeInference_traverseAdd_838817955527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2334797;
     Object term2334867;

    public TypeInference_traverseAdd_838817955527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2334797 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2334867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2334937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2334937, term2334937.getClass(), "next", null);
        setIntField(term2334937, term2334937.getClass(), "type", 14);
        setIntField(term2335007, term2335007.getClass(), "type", 14);
        setIntField(term2335077, term2335077.getClass(), "type", 14);
        setIntField(term2335147, term2335147.getClass(), "type", 14);
        setIntField(term2335217, term2335217.getClass(), "type", 14);
        setIntField(term2335287, term2335287.getClass(), "type", 14);
        setIntField(term2335357, term2335357.getClass(), "type", 14);
        setIntField(term2335427, term2335427.getClass(), "type", 14);
        setIntField(term2335497, term2335497.getClass(), "type", 14);
        setIntField(term2335567, term2335567.getClass(), "type", 14);
        setIntField(term2335637, term2335637.getClass(), "type", 14);
        setIntField(term2335707, term2335707.getClass(), "type", 14);
        setIntField(term2335777, term2335777.getClass(), "type", 14);
        setIntField(term2335847, term2335847.getClass(), "type", 14);
        setIntField(term2335917, term2335917.getClass(), "type", 14);
        setIntField(term2335987, term2335987.getClass(), "type", 14);
        setIntField(term2336057, term2336057.getClass(), "type", 14);
        setIntField(term2336127, term2336127.getClass(), "type", 14);
        setIntField(term2336197, term2336197.getClass(), "type", 14);
        setIntField(term2336267, term2336267.getClass(), "type", 14);
        setIntField(term2336337, term2336337.getClass(), "type", 14);
        setIntField(term2336407, term2336407.getClass(), "type", 14);
        setIntField(term2336477, term2336477.getClass(), "type", 14);
        setIntField(term2336547, term2336547.getClass(), "type", 14);
        setIntField(term2336617, term2336617.getClass(), "type", 14);
        setIntField(term2336687, term2336687.getClass(), "type", 14);
        setIntField(term2336757, term2336757.getClass(), "type", 14);
        setIntField(term2336827, term2336827.getClass(), "type", 14);
        setIntField(term2336897, term2336897.getClass(), "type", 14);
        setIntField(term2336967, term2336967.getClass(), "type", 14);
        setIntField(term2337037, term2337037.getClass(), "type", 14);
        setIntField(term2337107, term2337107.getClass(), "type", 14);
        setIntField(term2337177, term2337177.getClass(), "type", 14);
        setIntField(term2337247, term2337247.getClass(), "type", 14);
        setIntField(term2337317, term2337317.getClass(), "type", 14);
        setIntField(term2337387, term2337387.getClass(), "type", 14);
        setIntField(term2337457, term2337457.getClass(), "type", 14);
        setIntField(term2337527, term2337527.getClass(), "type", 14);
        setIntField(term2337597, term2337597.getClass(), "type", 14);
        setIntField(term2337667, term2337667.getClass(), "type", 14);
        setIntField(term2337737, term2337737.getClass(), "type", 14);
        setIntField(term2337807, term2337807.getClass(), "type", 146);
        setField(term2337737, term2337737.getClass(), "first", term2337807);
        setField(term2337667, term2337667.getClass(), "first", term2337737);
        setField(term2337597, term2337597.getClass(), "first", term2337667);
        setField(term2337527, term2337527.getClass(), "first", term2337597);
        setField(term2337457, term2337457.getClass(), "first", term2337527);
        setField(term2337387, term2337387.getClass(), "first", term2337457);
        setField(term2337317, term2337317.getClass(), "first", term2337387);
        setField(term2337247, term2337247.getClass(), "first", term2337317);
        setField(term2337177, term2337177.getClass(), "first", term2337247);
        setField(term2337107, term2337107.getClass(), "first", term2337177);
        setField(term2337037, term2337037.getClass(), "first", term2337107);
        setField(term2336967, term2336967.getClass(), "first", term2337037);
        setField(term2336897, term2336897.getClass(), "first", term2336967);
        setField(term2336827, term2336827.getClass(), "first", term2336897);
        setField(term2336757, term2336757.getClass(), "first", term2336827);
        setField(term2336687, term2336687.getClass(), "first", term2336757);
        setField(term2336617, term2336617.getClass(), "first", term2336687);
        setField(term2336547, term2336547.getClass(), "first", term2336617);
        setField(term2336477, term2336477.getClass(), "first", term2336547);
        setField(term2336407, term2336407.getClass(), "first", term2336477);
        setField(term2336337, term2336337.getClass(), "first", term2336407);
        setField(term2336267, term2336267.getClass(), "first", term2336337);
        setField(term2336197, term2336197.getClass(), "first", term2336267);
        setField(term2336127, term2336127.getClass(), "first", term2336197);
        setField(term2336057, term2336057.getClass(), "first", term2336127);
        setField(term2335987, term2335987.getClass(), "first", term2336057);
        setField(term2335917, term2335917.getClass(), "first", term2335987);
        setField(term2335847, term2335847.getClass(), "first", term2335917);
        setField(term2335777, term2335777.getClass(), "first", term2335847);
        setField(term2335707, term2335707.getClass(), "first", term2335777);
        setField(term2335637, term2335637.getClass(), "first", term2335707);
        setField(term2335567, term2335567.getClass(), "first", term2335637);
        setField(term2335497, term2335497.getClass(), "first", term2335567);
        setField(term2335427, term2335427.getClass(), "first", term2335497);
        setField(term2335357, term2335357.getClass(), "first", term2335427);
        setField(term2335287, term2335287.getClass(), "first", term2335357);
        setField(term2335217, term2335217.getClass(), "first", term2335287);
        setField(term2335147, term2335147.getClass(), "first", term2335217);
        setField(term2335077, term2335077.getClass(), "first", term2335147);
        setField(term2335007, term2335007.getClass(), "first", term2335077);
        setField(term2334937, term2334937.getClass(), "first", term2335007);
        setField(term2334867, term2334867.getClass(), "first", term2334937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2334867;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term2334797, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


