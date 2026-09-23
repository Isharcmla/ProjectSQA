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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addCaseBody_128228188052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2605;
     Object term2616;

    public CodeGenerator_addCaseBody_128228188052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2606 = new HashMap();
        term2605 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2605, term2605.getClass(), "ESCAPED_JS_STRINGS", term2606);
        setField(term2605, term2605.getClass(), "cc", null);
        setField(term2605, term2605.getClass(), "outputCharsetEncoder", null);
        term2616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2616, term2616.getClass(), "type", 890669485);
        setIntField(term2618, term2618.getClass(), "type", 691577392);
        setIntField(term2620, term2620.getClass(), "type", -893623680);
        setIntField(term2622, term2622.getClass(), "type", -1963434938);
        setIntField(term2624, term2624.getClass(), "type", 906181092);
        setField(term2624, term2624.getClass(), "next", null);
        setField(term2624, term2624.getClass(), "first", null);
        setField(term2624, term2624.getClass(), "last", null);
        setField(term2624, term2624.getClass(), "propListHead", null);
        setIntField(term2624, term2624.getClass(), "sourcePosition", 0);
        setField(term2624, term2624.getClass(), "jsType", null);
        setField(term2624, term2624.getClass(), "parent", null);
        setField(term2622, term2622.getClass(), "next", term2624);
        setIntField(term2627, term2627.getClass(), "type", 1045657203);
        setField(term2627, term2627.getClass(), "next", null);
        setField(term2627, term2627.getClass(), "first", null);
        setField(term2627, term2627.getClass(), "last", term2624);
        setField(term2627, term2627.getClass(), "propListHead", null);
        setIntField(term2627, term2627.getClass(), "sourcePosition", 0);
        setField(term2627, term2627.getClass(), "jsType", null);
        setField(term2627, term2627.getClass(), "parent", null);
        setField(term2622, term2622.getClass(), "first", term2627);
        setField(term2622, term2622.getClass(), "last", term2620);
        setField(term2622, term2622.getClass(), "propListHead", null);
        setIntField(term2622, term2622.getClass(), "sourcePosition", 0);
        setField(term2622, term2622.getClass(), "jsType", null);
        setField(term2622, term2622.getClass(), "parent", null);
        setField(term2620, term2620.getClass(), "next", term2622);
        setField(term2620, term2620.getClass(), "first", term2624);
        setIntField(term2631, term2631.getClass(), "type", 1072005683);
        setIntField(term2633, term2633.getClass(), "type", 1861318859);
        setField(term2633, term2633.getClass(), "next", null);
        setField(term2633, term2633.getClass(), "first", term2627);
        setField(term2633, term2633.getClass(), "last", term2622);
        setField(term2633, term2633.getClass(), "propListHead", null);
        setIntField(term2633, term2633.getClass(), "sourcePosition", 0);
        setField(term2633, term2633.getClass(), "jsType", null);
        setField(term2633, term2633.getClass(), "parent", null);
        setField(term2631, term2631.getClass(), "next", term2633);
        setField(term2631, term2631.getClass(), "first", term2618);
        setField(term2631, term2631.getClass(), "last", term2618);
        setField(term2631, term2631.getClass(), "propListHead", null);
        setIntField(term2631, term2631.getClass(), "sourcePosition", 0);
        setField(term2631, term2631.getClass(), "jsType", null);
        setField(term2631, term2631.getClass(), "parent", null);
        setField(term2620, term2620.getClass(), "last", term2631);
        setField(term2620, term2620.getClass(), "propListHead", null);
        setIntField(term2620, term2620.getClass(), "sourcePosition", 0);
        setField(term2620, term2620.getClass(), "jsType", null);
        setField(term2620, term2620.getClass(), "parent", null);
        setField(term2618, term2618.getClass(), "next", term2620);
        setIntField(term2638, term2638.getClass(), "type", 1474524152);
        setField(term2638, term2638.getClass(), "next", term2631);
        setField(term2638, term2638.getClass(), "first", term2633);
        setField(term2638, term2638.getClass(), "last", term2616);
        setField(term2638, term2638.getClass(), "propListHead", null);
        setIntField(term2638, term2638.getClass(), "sourcePosition", 0);
        setField(term2638, term2638.getClass(), "jsType", null);
        setField(term2638, term2638.getClass(), "parent", null);
        setField(term2618, term2618.getClass(), "first", term2638);
        setField(term2618, term2618.getClass(), "last", term2638);
        setField(term2618, term2618.getClass(), "propListHead", null);
        setIntField(term2618, term2618.getClass(), "sourcePosition", 0);
        setField(term2618, term2618.getClass(), "jsType", null);
        setField(term2618, term2618.getClass(), "parent", null);
        setField(term2616, term2616.getClass(), "next", term2618);
        setField(term2616, term2616.getClass(), "first", term2622);
        setField(term2616, term2616.getClass(), "last", term2624);
        setField(term2616, term2616.getClass(), "propListHead", null);
        setIntField(term2616, term2616.getClass(), "sourcePosition", 0);
        setField(term2616, term2616.getClass(), "jsType", null);
        setField(term2616, term2616.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2616;
        try {
            callMethod(klass, "addCaseBody", argTypes, term2605, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


