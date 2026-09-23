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

public class DevirtualizePrototypeMethods_fixFunctionType_126074308620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315;
     Object term316;
     Object term2638;
     Object term2639;

    public DevirtualizePrototypeMethods_fixFunctionType_126074308620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term315, term315.getClass(), "compiler", null);
        term316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term329 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term316, term316.getClass(), "type", 890669485);
        setIntField(term318, term318.getClass(), "type", 906181092);
        setIntField(term320, term320.getClass(), "type", 0);
        setField(term320, term320.getClass(), "next", null);
        setField(term320, term320.getClass(), "first", null);
        setField(term320, term320.getClass(), "last", null);
        setField(term320, term320.getClass(), "propListHead", null);
        setIntField(term320, term320.getClass(), "sourcePosition", 0);
        setField(term320, term320.getClass(), "jsType", null);
        setField(term320, term320.getClass(), "parent", null);
        setField(term318, term318.getClass(), "next", term320);
        setIntField(term323, term323.getClass(), "type", 0);
        setField(term323, term323.getClass(), "next", null);
        setField(term323, term323.getClass(), "first", null);
        setField(term323, term323.getClass(), "last", null);
        setField(term323, term323.getClass(), "propListHead", null);
        setIntField(term323, term323.getClass(), "sourcePosition", 0);
        setField(term323, term323.getClass(), "jsType", null);
        setField(term323, term323.getClass(), "parent", null);
        setField(term318, term318.getClass(), "first", term323);
        setIntField(term326, term326.getClass(), "type", 0);
        setField(term326, term326.getClass(), "next", null);
        setField(term326, term326.getClass(), "first", null);
        setField(term326, term326.getClass(), "last", null);
        setField(term326, term326.getClass(), "propListHead", null);
        setIntField(term326, term326.getClass(), "sourcePosition", 0);
        setField(term326, term326.getClass(), "jsType", null);
        setField(term326, term326.getClass(), "parent", null);
        setField(term318, term318.getClass(), "last", term326);
        setField(term329, term329.getClass(), "next", null);
        setIntField(term329, term329.getClass(), "type", 0);
        setIntField(term329, term329.getClass(), "intValue", 0);
        setField(term329, term329.getClass(), "objectValue", null);
        setField(term318, term318.getClass(), "propListHead", term329);
        setIntField(term318, term318.getClass(), "sourcePosition", 1072005683);
        setField(term318, term318.getClass(), "jsType", null);
        setField(term318, term318.getClass(), "parent", null);
        setField(term316, term316.getClass(), "next", term318);
        setIntField(term333, term333.getClass(), "type", 0);
        setField(term333, term333.getClass(), "next", null);
        setField(term333, term333.getClass(), "first", null);
        setField(term333, term333.getClass(), "last", null);
        setField(term333, term333.getClass(), "propListHead", null);
        setIntField(term333, term333.getClass(), "sourcePosition", 0);
        setField(term333, term333.getClass(), "jsType", null);
        setField(term333, term333.getClass(), "parent", null);
        setField(term316, term316.getClass(), "first", term333);
        setIntField(term336, term336.getClass(), "type", 0);
        setField(term336, term336.getClass(), "next", null);
        setField(term336, term336.getClass(), "first", null);
        setField(term336, term336.getClass(), "last", null);
        setField(term336, term336.getClass(), "propListHead", null);
        setIntField(term336, term336.getClass(), "sourcePosition", 0);
        setField(term336, term336.getClass(), "jsType", null);
        setField(term336, term336.getClass(), "parent", null);
        setField(term316, term316.getClass(), "last", term336);
        setField(term339, term339.getClass(), "next", null);
        setIntField(term339, term339.getClass(), "type", 0);
        setIntField(term339, term339.getClass(), "intValue", 0);
        setField(term339, term339.getClass(), "objectValue", null);
        setField(term316, term316.getClass(), "propListHead", term339);
        setIntField(term316, term316.getClass(), "sourcePosition", 1861318859);
        setField(term316, term316.getClass(), "jsType", null);
        setField(term316, term316.getClass(), "parent", null);
        term2638 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term2638, term2638.getClass(), "compiler", null);
        term2639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2644 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2647 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2639, term2639.getClass(), "type", 890669485);
        setIntField(term2640, term2640.getClass(), "type", 906181092);
        setIntField(term2641, term2641.getClass(), "type", 0);
        setField(term2641, term2641.getClass(), "next", null);
        setField(term2641, term2641.getClass(), "first", null);
        setField(term2641, term2641.getClass(), "last", null);
        setField(term2641, term2641.getClass(), "propListHead", null);
        setIntField(term2641, term2641.getClass(), "sourcePosition", 0);
        setField(term2641, term2641.getClass(), "jsType", null);
        setField(term2641, term2641.getClass(), "parent", null);
        setField(term2640, term2640.getClass(), "next", term2641);
        setIntField(term2642, term2642.getClass(), "type", 0);
        setField(term2642, term2642.getClass(), "next", null);
        setField(term2642, term2642.getClass(), "first", null);
        setField(term2642, term2642.getClass(), "last", null);
        setField(term2642, term2642.getClass(), "propListHead", null);
        setIntField(term2642, term2642.getClass(), "sourcePosition", 0);
        setField(term2642, term2642.getClass(), "jsType", null);
        setField(term2642, term2642.getClass(), "parent", null);
        setField(term2640, term2640.getClass(), "first", term2642);
        setIntField(term2643, term2643.getClass(), "type", 0);
        setField(term2643, term2643.getClass(), "next", null);
        setField(term2643, term2643.getClass(), "first", null);
        setField(term2643, term2643.getClass(), "last", null);
        setField(term2643, term2643.getClass(), "propListHead", null);
        setIntField(term2643, term2643.getClass(), "sourcePosition", 0);
        setField(term2643, term2643.getClass(), "jsType", null);
        setField(term2643, term2643.getClass(), "parent", null);
        setField(term2640, term2640.getClass(), "last", term2643);
        setField(term2644, term2644.getClass(), "next", null);
        setIntField(term2644, term2644.getClass(), "type", 0);
        setIntField(term2644, term2644.getClass(), "intValue", 0);
        setField(term2644, term2644.getClass(), "objectValue", null);
        setField(term2640, term2640.getClass(), "propListHead", term2644);
        setIntField(term2640, term2640.getClass(), "sourcePosition", 1072005683);
        setField(term2640, term2640.getClass(), "jsType", null);
        setField(term2640, term2640.getClass(), "parent", null);
        setField(term2639, term2639.getClass(), "next", term2640);
        setIntField(term2645, term2645.getClass(), "type", 0);
        setField(term2645, term2645.getClass(), "next", null);
        setField(term2645, term2645.getClass(), "first", null);
        setField(term2645, term2645.getClass(), "last", null);
        setField(term2645, term2645.getClass(), "propListHead", null);
        setIntField(term2645, term2645.getClass(), "sourcePosition", 0);
        setField(term2645, term2645.getClass(), "jsType", null);
        setField(term2645, term2645.getClass(), "parent", null);
        setField(term2639, term2639.getClass(), "first", term2645);
        setIntField(term2646, term2646.getClass(), "type", 0);
        setField(term2646, term2646.getClass(), "next", null);
        setField(term2646, term2646.getClass(), "first", null);
        setField(term2646, term2646.getClass(), "last", null);
        setField(term2646, term2646.getClass(), "propListHead", null);
        setIntField(term2646, term2646.getClass(), "sourcePosition", 0);
        setField(term2646, term2646.getClass(), "jsType", null);
        setField(term2646, term2646.getClass(), "parent", null);
        setField(term2639, term2639.getClass(), "last", term2646);
        setField(term2647, term2647.getClass(), "next", null);
        setIntField(term2647, term2647.getClass(), "type", 0);
        setIntField(term2647, term2647.getClass(), "intValue", 0);
        setField(term2647, term2647.getClass(), "objectValue", null);
        setField(term2639, term2639.getClass(), "propListHead", term2647);
        setIntField(term2639, term2639.getClass(), "sourcePosition", 1861318859);
        setField(term2639, term2639.getClass(), "jsType", null);
        setField(term2639, term2639.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term316;
        callMethod(klass, "fixFunctionType", argTypes, term315, args);
        assertTrue(recursiveEquals(term315, term2638));
        assertTrue(recursiveEquals(term316, term2639));
    }

};


