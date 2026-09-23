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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714;
     Object term741;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term714, term714.getClass(), "type", -227365013);
        setIntField(term716, term716.getClass(), "type", 11724947);
        setIntField(term718, term718.getClass(), "type", 1953277050);
        setIntField(term720, term720.getClass(), "type", 1283079251);
        setIntField(term722, term722.getClass(), "type", -523949691);
        setField(term722, term722.getClass(), "next", null);
        setField(term722, term722.getClass(), "first", null);
        setField(term722, term722.getClass(), "last", null);
        setField(term722, term722.getClass(), "propListHead", null);
        setIntField(term722, term722.getClass(), "sourcePosition", 0);
        setField(term722, term722.getClass(), "jsType", null);
        setField(term722, term722.getClass(), "parent", null);
        setField(term720, term720.getClass(), "next", term722);
        setIntField(term725, term725.getClass(), "type", 1398204340);
        setField(term725, term725.getClass(), "next", null);
        setField(term725, term725.getClass(), "first", null);
        setField(term725, term725.getClass(), "last", term722);
        setField(term725, term725.getClass(), "propListHead", null);
        setIntField(term725, term725.getClass(), "sourcePosition", 0);
        setField(term725, term725.getClass(), "jsType", null);
        setField(term725, term725.getClass(), "parent", null);
        setField(term720, term720.getClass(), "first", term725);
        setField(term720, term720.getClass(), "last", term718);
        setField(term720, term720.getClass(), "propListHead", null);
        setIntField(term720, term720.getClass(), "sourcePosition", 0);
        setField(term720, term720.getClass(), "jsType", null);
        setField(term720, term720.getClass(), "parent", null);
        setField(term718, term718.getClass(), "next", term720);
        setField(term718, term718.getClass(), "first", term722);
        setIntField(term729, term729.getClass(), "type", -461771056);
        setIntField(term731, term731.getClass(), "type", -243422082);
        setField(term731, term731.getClass(), "next", null);
        setField(term731, term731.getClass(), "first", term725);
        setField(term731, term731.getClass(), "last", term720);
        setField(term731, term731.getClass(), "propListHead", null);
        setIntField(term731, term731.getClass(), "sourcePosition", 0);
        setField(term731, term731.getClass(), "jsType", null);
        setField(term731, term731.getClass(), "parent", null);
        setField(term729, term729.getClass(), "next", term731);
        setField(term729, term729.getClass(), "first", term716);
        setField(term729, term729.getClass(), "last", term716);
        setField(term729, term729.getClass(), "propListHead", null);
        setIntField(term729, term729.getClass(), "sourcePosition", 0);
        setField(term729, term729.getClass(), "jsType", null);
        setField(term729, term729.getClass(), "parent", null);
        setField(term718, term718.getClass(), "last", term729);
        setField(term718, term718.getClass(), "propListHead", null);
        setIntField(term718, term718.getClass(), "sourcePosition", 0);
        setField(term718, term718.getClass(), "jsType", null);
        setField(term718, term718.getClass(), "parent", null);
        setField(term716, term716.getClass(), "next", term718);
        setIntField(term736, term736.getClass(), "type", 1384592638);
        setField(term736, term736.getClass(), "next", term729);
        setField(term736, term736.getClass(), "first", term731);
        setField(term736, term736.getClass(), "last", term714);
        setField(term736, term736.getClass(), "propListHead", null);
        setIntField(term736, term736.getClass(), "sourcePosition", 0);
        setField(term736, term736.getClass(), "jsType", null);
        setField(term736, term736.getClass(), "parent", null);
        setField(term716, term716.getClass(), "first", term736);
        setField(term716, term716.getClass(), "last", term736);
        setField(term716, term716.getClass(), "propListHead", null);
        setIntField(term716, term716.getClass(), "sourcePosition", 0);
        setField(term716, term716.getClass(), "jsType", null);
        setField(term716, term716.getClass(), "parent", null);
        setField(term714, term714.getClass(), "next", term716);
        setField(term714, term714.getClass(), "first", term720);
        setField(term714, term714.getClass(), "last", term722);
        setField(term714, term714.getClass(), "propListHead", null);
        setIntField(term714, term714.getClass(), "sourcePosition", 0);
        setField(term714, term714.getClass(), "jsType", null);
        setField(term714, term714.getClass(), "parent", null);
        term741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term741, term741.getClass(), "type", -1002370457);
        setIntField(term743, term743.getClass(), "type", -2014576105);
        setIntField(term745, term745.getClass(), "type", 1296895584);
        setIntField(term747, term747.getClass(), "type", 628918458);
        setIntField(term749, term749.getClass(), "type", -1274456137);
        setField(term749, term749.getClass(), "next", null);
        setField(term749, term749.getClass(), "first", null);
        setField(term749, term749.getClass(), "last", null);
        setField(term749, term749.getClass(), "propListHead", null);
        setIntField(term749, term749.getClass(), "sourcePosition", 0);
        setField(term749, term749.getClass(), "jsType", null);
        setField(term749, term749.getClass(), "parent", null);
        setField(term747, term747.getClass(), "next", term749);
        setIntField(term752, term752.getClass(), "type", 1041916673);
        setField(term752, term752.getClass(), "next", null);
        setField(term752, term752.getClass(), "first", null);
        setField(term752, term752.getClass(), "last", term749);
        setField(term752, term752.getClass(), "propListHead", null);
        setIntField(term752, term752.getClass(), "sourcePosition", 0);
        setField(term752, term752.getClass(), "jsType", null);
        setField(term752, term752.getClass(), "parent", null);
        setField(term747, term747.getClass(), "first", term752);
        setField(term747, term747.getClass(), "last", term745);
        setField(term747, term747.getClass(), "propListHead", null);
        setIntField(term747, term747.getClass(), "sourcePosition", 0);
        setField(term747, term747.getClass(), "jsType", null);
        setField(term747, term747.getClass(), "parent", null);
        setField(term745, term745.getClass(), "next", term747);
        setField(term745, term745.getClass(), "first", term749);
        setIntField(term756, term756.getClass(), "type", 663292551);
        setIntField(term758, term758.getClass(), "type", -1885090354);
        setField(term758, term758.getClass(), "next", null);
        setField(term758, term758.getClass(), "first", term752);
        setField(term758, term758.getClass(), "last", term747);
        setField(term758, term758.getClass(), "propListHead", null);
        setIntField(term758, term758.getClass(), "sourcePosition", 0);
        setField(term758, term758.getClass(), "jsType", null);
        setField(term758, term758.getClass(), "parent", null);
        setField(term756, term756.getClass(), "next", term758);
        setField(term756, term756.getClass(), "first", term743);
        setField(term756, term756.getClass(), "last", term743);
        setField(term756, term756.getClass(), "propListHead", null);
        setIntField(term756, term756.getClass(), "sourcePosition", 0);
        setField(term756, term756.getClass(), "jsType", null);
        setField(term756, term756.getClass(), "parent", null);
        setField(term745, term745.getClass(), "last", term756);
        setField(term745, term745.getClass(), "propListHead", null);
        setIntField(term745, term745.getClass(), "sourcePosition", 0);
        setField(term745, term745.getClass(), "jsType", null);
        setField(term745, term745.getClass(), "parent", null);
        setField(term743, term743.getClass(), "next", term745);
        setIntField(term763, term763.getClass(), "type", -2066804303);
        setField(term763, term763.getClass(), "next", term756);
        setField(term763, term763.getClass(), "first", term758);
        setField(term763, term763.getClass(), "last", term741);
        setField(term763, term763.getClass(), "propListHead", null);
        setIntField(term763, term763.getClass(), "sourcePosition", 0);
        setField(term763, term763.getClass(), "jsType", null);
        setField(term763, term763.getClass(), "parent", null);
        setField(term743, term743.getClass(), "first", term763);
        setField(term743, term743.getClass(), "last", term763);
        setField(term743, term743.getClass(), "propListHead", null);
        setIntField(term743, term743.getClass(), "sourcePosition", 0);
        setField(term743, term743.getClass(), "jsType", null);
        setField(term743, term743.getClass(), "parent", null);
        setField(term741, term741.getClass(), "next", term743);
        setField(term741, term741.getClass(), "first", term747);
        setField(term741, term741.getClass(), "last", term749);
        setField(term741, term741.getClass(), "propListHead", null);
        setIntField(term741, term741.getClass(), "sourcePosition", 0);
        setField(term741, term741.getClass(), "jsType", null);
        setField(term741, term741.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term714;
        args[1] = term741;
        args[2] = null;
        try {
            callMethod(klass, "checkLeftOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


