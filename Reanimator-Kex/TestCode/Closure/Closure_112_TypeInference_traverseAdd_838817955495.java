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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseAdd_838817955495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2762417;
     Object term2762487;

    public TypeInference_traverseAdd_838817955495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2762417 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2762487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2762557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2762627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2762697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2762767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2762837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2762907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2762977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2762557, term2762557.getClass(), "next", null);
        setIntField(term2762557, term2762557.getClass(), "type", 14);
        setIntField(term2762627, term2762627.getClass(), "type", 14);
        setIntField(term2762697, term2762697.getClass(), "type", 14);
        setIntField(term2762767, term2762767.getClass(), "type", 14);
        setIntField(term2762837, term2762837.getClass(), "type", 14);
        setIntField(term2762907, term2762907.getClass(), "type", 14);
        setIntField(term2762977, term2762977.getClass(), "type", 14);
        setIntField(term2763047, term2763047.getClass(), "type", 14);
        setIntField(term2763117, term2763117.getClass(), "type", 14);
        setIntField(term2763187, term2763187.getClass(), "type", 14);
        setIntField(term2763257, term2763257.getClass(), "type", 14);
        setIntField(term2763327, term2763327.getClass(), "type", 14);
        setIntField(term2763397, term2763397.getClass(), "type", 14);
        setIntField(term2763467, term2763467.getClass(), "type", 14);
        setIntField(term2763537, term2763537.getClass(), "type", 14);
        setIntField(term2763607, term2763607.getClass(), "type", 14);
        setIntField(term2763677, term2763677.getClass(), "type", 14);
        setIntField(term2763747, term2763747.getClass(), "type", 14);
        setIntField(term2763817, term2763817.getClass(), "type", 14);
        setIntField(term2763887, term2763887.getClass(), "type", 14);
        setIntField(term2763957, term2763957.getClass(), "type", 14);
        setIntField(term2764027, term2764027.getClass(), "type", 14);
        setIntField(term2764097, term2764097.getClass(), "type", 14);
        setIntField(term2764167, term2764167.getClass(), "type", 14);
        setIntField(term2764237, term2764237.getClass(), "type", 14);
        setIntField(term2764307, term2764307.getClass(), "type", 14);
        setIntField(term2764377, term2764377.getClass(), "type", 14);
        setIntField(term2764447, term2764447.getClass(), "type", 14);
        setIntField(term2764517, term2764517.getClass(), "type", 14);
        setIntField(term2764587, term2764587.getClass(), "type", 14);
        setIntField(term2764657, term2764657.getClass(), "type", 14);
        setIntField(term2764727, term2764727.getClass(), "type", 14);
        setIntField(term2764797, term2764797.getClass(), "type", 14);
        setIntField(term2764867, term2764867.getClass(), "type", 14);
        setIntField(term2764937, term2764937.getClass(), "type", 14);
        setIntField(term2765007, term2765007.getClass(), "type", 14);
        setIntField(term2765077, term2765077.getClass(), "type", 14);
        setIntField(term2765147, term2765147.getClass(), "type", 14);
        setIntField(term2765217, term2765217.getClass(), "type", 14);
        setIntField(term2765287, term2765287.getClass(), "type", 14);
        setIntField(term2765357, term2765357.getClass(), "type", 14);
        setIntField(term2765427, term2765427.getClass(), "type", 14);
        setIntField(term2765497, term2765497.getClass(), "type", 14);
        setIntField(term2765567, term2765567.getClass(), "type", 14);
        setIntField(term2765637, term2765637.getClass(), "type", 14);
        setIntField(term2765707, term2765707.getClass(), "type", 14);
        setIntField(term2765777, term2765777.getClass(), "type", 105);
        setField(term2765707, term2765707.getClass(), "first", term2765777);
        setField(term2765637, term2765637.getClass(), "first", term2765707);
        setField(term2765567, term2765567.getClass(), "first", term2765637);
        setField(term2765497, term2765497.getClass(), "first", term2765567);
        setField(term2765427, term2765427.getClass(), "first", term2765497);
        setField(term2765357, term2765357.getClass(), "first", term2765427);
        setField(term2765287, term2765287.getClass(), "first", term2765357);
        setField(term2765217, term2765217.getClass(), "first", term2765287);
        setField(term2765147, term2765147.getClass(), "first", term2765217);
        setField(term2765077, term2765077.getClass(), "first", term2765147);
        setField(term2765007, term2765007.getClass(), "first", term2765077);
        setField(term2764937, term2764937.getClass(), "first", term2765007);
        setField(term2764867, term2764867.getClass(), "first", term2764937);
        setField(term2764797, term2764797.getClass(), "first", term2764867);
        setField(term2764727, term2764727.getClass(), "first", term2764797);
        setField(term2764657, term2764657.getClass(), "first", term2764727);
        setField(term2764587, term2764587.getClass(), "first", term2764657);
        setField(term2764517, term2764517.getClass(), "first", term2764587);
        setField(term2764447, term2764447.getClass(), "first", term2764517);
        setField(term2764377, term2764377.getClass(), "first", term2764447);
        setField(term2764307, term2764307.getClass(), "first", term2764377);
        setField(term2764237, term2764237.getClass(), "first", term2764307);
        setField(term2764167, term2764167.getClass(), "first", term2764237);
        setField(term2764097, term2764097.getClass(), "first", term2764167);
        setField(term2764027, term2764027.getClass(), "first", term2764097);
        setField(term2763957, term2763957.getClass(), "first", term2764027);
        setField(term2763887, term2763887.getClass(), "first", term2763957);
        setField(term2763817, term2763817.getClass(), "first", term2763887);
        setField(term2763747, term2763747.getClass(), "first", term2763817);
        setField(term2763677, term2763677.getClass(), "first", term2763747);
        setField(term2763607, term2763607.getClass(), "first", term2763677);
        setField(term2763537, term2763537.getClass(), "first", term2763607);
        setField(term2763467, term2763467.getClass(), "first", term2763537);
        setField(term2763397, term2763397.getClass(), "first", term2763467);
        setField(term2763327, term2763327.getClass(), "first", term2763397);
        setField(term2763257, term2763257.getClass(), "first", term2763327);
        setField(term2763187, term2763187.getClass(), "first", term2763257);
        setField(term2763117, term2763117.getClass(), "first", term2763187);
        setField(term2763047, term2763047.getClass(), "first", term2763117);
        setField(term2762977, term2762977.getClass(), "first", term2763047);
        setField(term2762907, term2762907.getClass(), "first", term2762977);
        setField(term2762837, term2762837.getClass(), "first", term2762907);
        setField(term2762767, term2762767.getClass(), "first", term2762837);
        setField(term2762697, term2762697.getClass(), "first", term2762767);
        setField(term2762627, term2762627.getClass(), "first", term2762697);
        setField(term2762557, term2762557.getClass(), "first", term2762627);
        setField(term2762487, term2762487.getClass(), "first", term2762557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2762487;
        args[1] = null;
        callMethod(klass, "traverseAdd", argTypes, term2762417, args);
    }

};


