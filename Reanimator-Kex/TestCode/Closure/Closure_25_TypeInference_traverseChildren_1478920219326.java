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

public class TypeInference_traverseChildren_1478920219326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term823778;
     Object term823848;

    public TypeInference_traverseChildren_1478920219326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term823778 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term823848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term823918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term823988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term823918, term823918.getClass(), "type", 18);
        setIntField(term823988, term823988.getClass(), "type", 18);
        setIntField(term824058, term824058.getClass(), "type", 18);
        setIntField(term824128, term824128.getClass(), "type", 18);
        setIntField(term824198, term824198.getClass(), "type", 18);
        setIntField(term824268, term824268.getClass(), "type", 18);
        setIntField(term824338, term824338.getClass(), "type", 18);
        setIntField(term824408, term824408.getClass(), "type", 18);
        setIntField(term824478, term824478.getClass(), "type", 18);
        setIntField(term824548, term824548.getClass(), "type", 18);
        setIntField(term824618, term824618.getClass(), "type", 18);
        setIntField(term824688, term824688.getClass(), "type", 18);
        setIntField(term824758, term824758.getClass(), "type", 18);
        setIntField(term824828, term824828.getClass(), "type", 18);
        setIntField(term824898, term824898.getClass(), "type", 18);
        setIntField(term824968, term824968.getClass(), "type", 18);
        setIntField(term825038, term825038.getClass(), "type", 18);
        setIntField(term825108, term825108.getClass(), "type", 18);
        setIntField(term825178, term825178.getClass(), "type", 18);
        setIntField(term825248, term825248.getClass(), "type", 18);
        setIntField(term825318, term825318.getClass(), "type", 18);
        setIntField(term825388, term825388.getClass(), "type", 18);
        setIntField(term825458, term825458.getClass(), "type", 18);
        setIntField(term825528, term825528.getClass(), "type", 18);
        setIntField(term825598, term825598.getClass(), "type", 18);
        setIntField(term825668, term825668.getClass(), "type", 18);
        setIntField(term825738, term825738.getClass(), "type", 18);
        setIntField(term825808, term825808.getClass(), "type", 18);
        setIntField(term825878, term825878.getClass(), "type", 18);
        setIntField(term825948, term825948.getClass(), "type", 18);
        setIntField(term826018, term826018.getClass(), "type", 18);
        setIntField(term826088, term826088.getClass(), "type", 18);
        setIntField(term826158, term826158.getClass(), "type", 18);
        setIntField(term826228, term826228.getClass(), "type", 18);
        setIntField(term826298, term826298.getClass(), "type", 18);
        setIntField(term826368, term826368.getClass(), "type", 18);
        setIntField(term826438, term826438.getClass(), "type", 18);
        setIntField(term826508, term826508.getClass(), "type", 18);
        setIntField(term826578, term826578.getClass(), "type", 18);
        setIntField(term826648, term826648.getClass(), "type", 18);
        setIntField(term826718, term826718.getClass(), "type", 18);
        setIntField(term826788, term826788.getClass(), "type", 18);
        setIntField(term826858, term826858.getClass(), "type", 18);
        setIntField(term826928, term826928.getClass(), "type", 18);
        setIntField(term826998, term826998.getClass(), "type", 18);
        setIntField(term827068, term827068.getClass(), "type", 18);
        setIntField(term827138, term827138.getClass(), "type", 18);
        setIntField(term827208, term827208.getClass(), "type", 18);
        setIntField(term827278, term827278.getClass(), "type", 18);
        setIntField(term827348, term827348.getClass(), "type", 18);
        setIntField(term827418, term827418.getClass(), "type", 18);
        setIntField(term827488, term827488.getClass(), "type", 18);
        setIntField(term827558, term827558.getClass(), "type", 18);
        setIntField(term827628, term827628.getClass(), "type", 18);
        setIntField(term827698, term827698.getClass(), "type", 18);
        setIntField(term827768, term827768.getClass(), "type", 125);
        setField(term827698, term827698.getClass(), "first", term827768);
        setField(term827628, term827628.getClass(), "first", term827698);
        setField(term827558, term827558.getClass(), "first", term827628);
        setField(term827488, term827488.getClass(), "first", term827558);
        setField(term827418, term827418.getClass(), "first", term827488);
        setField(term827348, term827348.getClass(), "first", term827418);
        setField(term827278, term827278.getClass(), "first", term827348);
        setField(term827208, term827208.getClass(), "first", term827278);
        setField(term827138, term827138.getClass(), "first", term827208);
        setField(term827068, term827068.getClass(), "first", term827138);
        setField(term826998, term826998.getClass(), "first", term827068);
        setField(term826928, term826928.getClass(), "first", term826998);
        setField(term826858, term826858.getClass(), "first", term826928);
        setField(term826788, term826788.getClass(), "first", term826858);
        setField(term826718, term826718.getClass(), "first", term826788);
        setField(term826648, term826648.getClass(), "first", term826718);
        setField(term826578, term826578.getClass(), "first", term826648);
        setField(term826508, term826508.getClass(), "first", term826578);
        setField(term826438, term826438.getClass(), "first", term826508);
        setField(term826368, term826368.getClass(), "first", term826438);
        setField(term826298, term826298.getClass(), "first", term826368);
        setField(term826228, term826228.getClass(), "first", term826298);
        setField(term826158, term826158.getClass(), "first", term826228);
        setField(term826088, term826088.getClass(), "first", term826158);
        setField(term826018, term826018.getClass(), "first", term826088);
        setField(term825948, term825948.getClass(), "first", term826018);
        setField(term825878, term825878.getClass(), "first", term825948);
        setField(term825808, term825808.getClass(), "first", term825878);
        setField(term825738, term825738.getClass(), "first", term825808);
        setField(term825668, term825668.getClass(), "first", term825738);
        setField(term825598, term825598.getClass(), "first", term825668);
        setField(term825528, term825528.getClass(), "first", term825598);
        setField(term825458, term825458.getClass(), "first", term825528);
        setField(term825388, term825388.getClass(), "first", term825458);
        setField(term825318, term825318.getClass(), "first", term825388);
        setField(term825248, term825248.getClass(), "first", term825318);
        setField(term825178, term825178.getClass(), "first", term825248);
        setField(term825108, term825108.getClass(), "first", term825178);
        setField(term825038, term825038.getClass(), "first", term825108);
        setField(term824968, term824968.getClass(), "first", term825038);
        setField(term824898, term824898.getClass(), "first", term824968);
        setField(term824828, term824828.getClass(), "first", term824898);
        setField(term824758, term824758.getClass(), "first", term824828);
        setField(term824688, term824688.getClass(), "first", term824758);
        setField(term824618, term824618.getClass(), "first", term824688);
        setField(term824548, term824548.getClass(), "first", term824618);
        setField(term824478, term824478.getClass(), "first", term824548);
        setField(term824408, term824408.getClass(), "first", term824478);
        setField(term824338, term824338.getClass(), "first", term824408);
        setField(term824268, term824268.getClass(), "first", term824338);
        setField(term824198, term824198.getClass(), "first", term824268);
        setField(term824128, term824128.getClass(), "first", term824198);
        setField(term824058, term824058.getClass(), "first", term824128);
        setField(term823988, term823988.getClass(), "first", term824058);
        setField(term823918, term823918.getClass(), "first", term823988);
        setField(term823848, term823848.getClass(), "first", term823918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term823848;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term823778, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


