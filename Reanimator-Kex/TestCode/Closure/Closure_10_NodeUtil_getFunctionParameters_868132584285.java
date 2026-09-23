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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getFunctionParameters_868132584285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3738;

    public NodeUtil_getFunctionParameters_868132584285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3738, term3738.getClass(), "type", -824369460);
        setIntField(term3740, term3740.getClass(), "type", -1573760035);
        setIntField(term3742, term3742.getClass(), "type", -1147965121);
        setIntField(term3744, term3744.getClass(), "type", -867099093);
        setIntField(term3746, term3746.getClass(), "type", -1091199008);
        setField(term3746, term3746.getClass(), "next", null);
        setField(term3746, term3746.getClass(), "first", null);
        setField(term3746, term3746.getClass(), "last", null);
        setField(term3746, term3746.getClass(), "propListHead", null);
        setIntField(term3746, term3746.getClass(), "sourcePosition", 0);
        setField(term3746, term3746.getClass(), "jsType", null);
        setField(term3746, term3746.getClass(), "parent", null);
        setField(term3744, term3744.getClass(), "next", term3746);
        setIntField(term3749, term3749.getClass(), "type", 1837886253);
        setField(term3749, term3749.getClass(), "next", null);
        setField(term3749, term3749.getClass(), "first", null);
        setField(term3749, term3749.getClass(), "last", term3746);
        setField(term3749, term3749.getClass(), "propListHead", null);
        setIntField(term3749, term3749.getClass(), "sourcePosition", 0);
        setField(term3749, term3749.getClass(), "jsType", null);
        setField(term3749, term3749.getClass(), "parent", null);
        setField(term3744, term3744.getClass(), "first", term3749);
        setField(term3744, term3744.getClass(), "last", term3742);
        setField(term3744, term3744.getClass(), "propListHead", null);
        setIntField(term3744, term3744.getClass(), "sourcePosition", 0);
        setField(term3744, term3744.getClass(), "jsType", null);
        setField(term3744, term3744.getClass(), "parent", null);
        setField(term3742, term3742.getClass(), "next", term3744);
        setField(term3742, term3742.getClass(), "first", term3746);
        setIntField(term3753, term3753.getClass(), "type", 2108571355);
        setIntField(term3755, term3755.getClass(), "type", 1909966089);
        setField(term3755, term3755.getClass(), "next", null);
        setField(term3755, term3755.getClass(), "first", term3749);
        setField(term3755, term3755.getClass(), "last", term3744);
        setField(term3755, term3755.getClass(), "propListHead", null);
        setIntField(term3755, term3755.getClass(), "sourcePosition", 0);
        setField(term3755, term3755.getClass(), "jsType", null);
        setField(term3755, term3755.getClass(), "parent", null);
        setField(term3753, term3753.getClass(), "next", term3755);
        setField(term3753, term3753.getClass(), "first", term3740);
        setField(term3753, term3753.getClass(), "last", term3740);
        setField(term3753, term3753.getClass(), "propListHead", null);
        setIntField(term3753, term3753.getClass(), "sourcePosition", 0);
        setField(term3753, term3753.getClass(), "jsType", null);
        setField(term3753, term3753.getClass(), "parent", null);
        setField(term3742, term3742.getClass(), "last", term3753);
        setField(term3742, term3742.getClass(), "propListHead", null);
        setIntField(term3742, term3742.getClass(), "sourcePosition", 0);
        setField(term3742, term3742.getClass(), "jsType", null);
        setField(term3742, term3742.getClass(), "parent", null);
        setField(term3740, term3740.getClass(), "next", term3742);
        setIntField(term3760, term3760.getClass(), "type", 1827255916);
        setField(term3760, term3760.getClass(), "next", term3753);
        setField(term3760, term3760.getClass(), "first", term3755);
        setField(term3760, term3760.getClass(), "last", term3738);
        setField(term3760, term3760.getClass(), "propListHead", null);
        setIntField(term3760, term3760.getClass(), "sourcePosition", 0);
        setField(term3760, term3760.getClass(), "jsType", null);
        setField(term3760, term3760.getClass(), "parent", null);
        setField(term3740, term3740.getClass(), "first", term3760);
        setField(term3740, term3740.getClass(), "last", term3760);
        setField(term3740, term3740.getClass(), "propListHead", null);
        setIntField(term3740, term3740.getClass(), "sourcePosition", 0);
        setField(term3740, term3740.getClass(), "jsType", null);
        setField(term3740, term3740.getClass(), "parent", null);
        setField(term3738, term3738.getClass(), "next", term3740);
        setField(term3738, term3738.getClass(), "first", term3744);
        setField(term3738, term3738.getClass(), "last", term3746);
        setField(term3738, term3738.getClass(), "propListHead", null);
        setIntField(term3738, term3738.getClass(), "sourcePosition", 0);
        setField(term3738, term3738.getClass(), "jsType", null);
        setField(term3738, term3738.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3738;
        try {
            callMethod(klass, "getFunctionParameters", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


