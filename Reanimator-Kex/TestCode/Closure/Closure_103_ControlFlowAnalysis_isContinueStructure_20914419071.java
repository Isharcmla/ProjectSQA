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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ControlFlowAnalysis_isContinueStructure_20914419071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3162;
     Object term21820;

    public ControlFlowAnalysis_isContinueStructure_20914419071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3175 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3185 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3162, term3162.getClass(), "type", 2011764585);
        setIntField(term3164, term3164.getClass(), "type", 1485731037);
        setIntField(term3166, term3166.getClass(), "type", 0);
        setField(term3166, term3166.getClass(), "next", null);
        setField(term3166, term3166.getClass(), "first", null);
        setField(term3166, term3166.getClass(), "last", null);
        setField(term3166, term3166.getClass(), "propListHead", null);
        setIntField(term3166, term3166.getClass(), "sourcePosition", 0);
        setField(term3166, term3166.getClass(), "jsType", null);
        setField(term3166, term3166.getClass(), "parent", null);
        setField(term3164, term3164.getClass(), "next", term3166);
        setIntField(term3169, term3169.getClass(), "type", 0);
        setField(term3169, term3169.getClass(), "next", null);
        setField(term3169, term3169.getClass(), "first", null);
        setField(term3169, term3169.getClass(), "last", null);
        setField(term3169, term3169.getClass(), "propListHead", null);
        setIntField(term3169, term3169.getClass(), "sourcePosition", 0);
        setField(term3169, term3169.getClass(), "jsType", null);
        setField(term3169, term3169.getClass(), "parent", null);
        setField(term3164, term3164.getClass(), "first", term3169);
        setIntField(term3172, term3172.getClass(), "type", 0);
        setField(term3172, term3172.getClass(), "next", null);
        setField(term3172, term3172.getClass(), "first", null);
        setField(term3172, term3172.getClass(), "last", null);
        setField(term3172, term3172.getClass(), "propListHead", null);
        setIntField(term3172, term3172.getClass(), "sourcePosition", 0);
        setField(term3172, term3172.getClass(), "jsType", null);
        setField(term3172, term3172.getClass(), "parent", null);
        setField(term3164, term3164.getClass(), "last", term3172);
        setField(term3175, term3175.getClass(), "next", null);
        setIntField(term3175, term3175.getClass(), "type", 0);
        setIntField(term3175, term3175.getClass(), "intValue", 0);
        setField(term3175, term3175.getClass(), "objectValue", null);
        setField(term3164, term3164.getClass(), "propListHead", term3175);
        setIntField(term3164, term3164.getClass(), "sourcePosition", -185892708);
        setField(term3164, term3164.getClass(), "jsType", null);
        setField(term3164, term3164.getClass(), "parent", null);
        setField(term3162, term3162.getClass(), "next", term3164);
        setIntField(term3179, term3179.getClass(), "type", 0);
        setField(term3179, term3179.getClass(), "next", null);
        setField(term3179, term3179.getClass(), "first", null);
        setField(term3179, term3179.getClass(), "last", null);
        setField(term3179, term3179.getClass(), "propListHead", null);
        setIntField(term3179, term3179.getClass(), "sourcePosition", 0);
        setField(term3179, term3179.getClass(), "jsType", null);
        setField(term3179, term3179.getClass(), "parent", null);
        setField(term3162, term3162.getClass(), "first", term3179);
        setIntField(term3182, term3182.getClass(), "type", 0);
        setField(term3182, term3182.getClass(), "next", null);
        setField(term3182, term3182.getClass(), "first", null);
        setField(term3182, term3182.getClass(), "last", null);
        setField(term3182, term3182.getClass(), "propListHead", null);
        setIntField(term3182, term3182.getClass(), "sourcePosition", 0);
        setField(term3182, term3182.getClass(), "jsType", null);
        setField(term3182, term3182.getClass(), "parent", null);
        setField(term3162, term3162.getClass(), "last", term3182);
        setField(term3185, term3185.getClass(), "next", null);
        setIntField(term3185, term3185.getClass(), "type", 0);
        setIntField(term3185, term3185.getClass(), "intValue", 0);
        setField(term3185, term3185.getClass(), "objectValue", null);
        setField(term3162, term3162.getClass(), "propListHead", term3185);
        setIntField(term3162, term3162.getClass(), "sourcePosition", -203163250);
        setField(term3162, term3162.getClass(), "jsType", null);
        setField(term3162, term3162.getClass(), "parent", null);
        term21820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21825 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21828 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term21820, term21820.getClass(), "type", 2011764585);
        setIntField(term21821, term21821.getClass(), "type", 1485731037);
        setIntField(term21822, term21822.getClass(), "type", 0);
        setField(term21822, term21822.getClass(), "next", null);
        setField(term21822, term21822.getClass(), "first", null);
        setField(term21822, term21822.getClass(), "last", null);
        setField(term21822, term21822.getClass(), "propListHead", null);
        setIntField(term21822, term21822.getClass(), "sourcePosition", 0);
        setField(term21822, term21822.getClass(), "jsType", null);
        setField(term21822, term21822.getClass(), "parent", null);
        setField(term21821, term21821.getClass(), "next", term21822);
        setIntField(term21823, term21823.getClass(), "type", 0);
        setField(term21823, term21823.getClass(), "next", null);
        setField(term21823, term21823.getClass(), "first", null);
        setField(term21823, term21823.getClass(), "last", null);
        setField(term21823, term21823.getClass(), "propListHead", null);
        setIntField(term21823, term21823.getClass(), "sourcePosition", 0);
        setField(term21823, term21823.getClass(), "jsType", null);
        setField(term21823, term21823.getClass(), "parent", null);
        setField(term21821, term21821.getClass(), "first", term21823);
        setIntField(term21824, term21824.getClass(), "type", 0);
        setField(term21824, term21824.getClass(), "next", null);
        setField(term21824, term21824.getClass(), "first", null);
        setField(term21824, term21824.getClass(), "last", null);
        setField(term21824, term21824.getClass(), "propListHead", null);
        setIntField(term21824, term21824.getClass(), "sourcePosition", 0);
        setField(term21824, term21824.getClass(), "jsType", null);
        setField(term21824, term21824.getClass(), "parent", null);
        setField(term21821, term21821.getClass(), "last", term21824);
        setField(term21825, term21825.getClass(), "next", null);
        setIntField(term21825, term21825.getClass(), "type", 0);
        setIntField(term21825, term21825.getClass(), "intValue", 0);
        setField(term21825, term21825.getClass(), "objectValue", null);
        setField(term21821, term21821.getClass(), "propListHead", term21825);
        setIntField(term21821, term21821.getClass(), "sourcePosition", -185892708);
        setField(term21821, term21821.getClass(), "jsType", null);
        setField(term21821, term21821.getClass(), "parent", null);
        setField(term21820, term21820.getClass(), "next", term21821);
        setIntField(term21826, term21826.getClass(), "type", 0);
        setField(term21826, term21826.getClass(), "next", null);
        setField(term21826, term21826.getClass(), "first", null);
        setField(term21826, term21826.getClass(), "last", null);
        setField(term21826, term21826.getClass(), "propListHead", null);
        setIntField(term21826, term21826.getClass(), "sourcePosition", 0);
        setField(term21826, term21826.getClass(), "jsType", null);
        setField(term21826, term21826.getClass(), "parent", null);
        setField(term21820, term21820.getClass(), "first", term21826);
        setIntField(term21827, term21827.getClass(), "type", 0);
        setField(term21827, term21827.getClass(), "next", null);
        setField(term21827, term21827.getClass(), "first", null);
        setField(term21827, term21827.getClass(), "last", null);
        setField(term21827, term21827.getClass(), "propListHead", null);
        setIntField(term21827, term21827.getClass(), "sourcePosition", 0);
        setField(term21827, term21827.getClass(), "jsType", null);
        setField(term21827, term21827.getClass(), "parent", null);
        setField(term21820, term21820.getClass(), "last", term21827);
        setField(term21828, term21828.getClass(), "next", null);
        setIntField(term21828, term21828.getClass(), "type", 0);
        setIntField(term21828, term21828.getClass(), "intValue", 0);
        setField(term21828, term21828.getClass(), "objectValue", null);
        setField(term21820, term21820.getClass(), "propListHead", term21828);
        setIntField(term21820, term21820.getClass(), "sourcePosition", -203163250);
        setField(term21820, term21820.getClass(), "jsType", null);
        setField(term21820, term21820.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3162;
        Object retValue = callMethod(klass, "isContinueStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term3162, term21820));
        assertTrue(recursiveEquals(retValue, false));
    }

};


