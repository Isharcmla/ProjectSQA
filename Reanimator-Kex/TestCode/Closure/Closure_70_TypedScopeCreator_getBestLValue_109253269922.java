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

public class TypedScopeCreator_getBestLValue_109253269922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2740;

    public TypedScopeCreator_getBestLValue_109253269922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2753 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2740, term2740.getClass(), "type", 444029505);
        setIntField(term2742, term2742.getClass(), "type", 304775596);
        setIntField(term2744, term2744.getClass(), "type", 0);
        setField(term2744, term2744.getClass(), "next", null);
        setField(term2744, term2744.getClass(), "first", null);
        setField(term2744, term2744.getClass(), "last", null);
        setField(term2744, term2744.getClass(), "propListHead", null);
        setIntField(term2744, term2744.getClass(), "sourcePosition", 0);
        setField(term2744, term2744.getClass(), "jsType", null);
        setField(term2744, term2744.getClass(), "parent", null);
        setField(term2742, term2742.getClass(), "next", term2744);
        setIntField(term2747, term2747.getClass(), "type", 0);
        setField(term2747, term2747.getClass(), "next", null);
        setField(term2747, term2747.getClass(), "first", null);
        setField(term2747, term2747.getClass(), "last", null);
        setField(term2747, term2747.getClass(), "propListHead", null);
        setIntField(term2747, term2747.getClass(), "sourcePosition", 0);
        setField(term2747, term2747.getClass(), "jsType", null);
        setField(term2747, term2747.getClass(), "parent", null);
        setField(term2742, term2742.getClass(), "first", term2747);
        setIntField(term2750, term2750.getClass(), "type", 0);
        setField(term2750, term2750.getClass(), "next", null);
        setField(term2750, term2750.getClass(), "first", null);
        setField(term2750, term2750.getClass(), "last", null);
        setField(term2750, term2750.getClass(), "propListHead", null);
        setIntField(term2750, term2750.getClass(), "sourcePosition", 0);
        setField(term2750, term2750.getClass(), "jsType", null);
        setField(term2750, term2750.getClass(), "parent", null);
        setField(term2742, term2742.getClass(), "last", term2750);
        setField(term2753, term2753.getClass(), "next", null);
        setIntField(term2753, term2753.getClass(), "type", 0);
        setIntField(term2753, term2753.getClass(), "intValue", 0);
        setField(term2753, term2753.getClass(), "objectValue", null);
        setField(term2742, term2742.getClass(), "propListHead", term2753);
        setIntField(term2742, term2742.getClass(), "sourcePosition", 683666002);
        setField(term2742, term2742.getClass(), "jsType", null);
        setField(term2742, term2742.getClass(), "parent", null);
        setField(term2740, term2740.getClass(), "next", term2742);
        setIntField(term2757, term2757.getClass(), "type", 0);
        setField(term2757, term2757.getClass(), "next", null);
        setField(term2757, term2757.getClass(), "first", null);
        setField(term2757, term2757.getClass(), "last", null);
        setField(term2757, term2757.getClass(), "propListHead", null);
        setIntField(term2757, term2757.getClass(), "sourcePosition", 0);
        setField(term2757, term2757.getClass(), "jsType", null);
        setField(term2757, term2757.getClass(), "parent", null);
        setField(term2740, term2740.getClass(), "first", term2757);
        setIntField(term2760, term2760.getClass(), "type", 0);
        setField(term2760, term2760.getClass(), "next", null);
        setField(term2760, term2760.getClass(), "first", null);
        setField(term2760, term2760.getClass(), "last", null);
        setField(term2760, term2760.getClass(), "propListHead", null);
        setIntField(term2760, term2760.getClass(), "sourcePosition", 0);
        setField(term2760, term2760.getClass(), "jsType", null);
        setField(term2760, term2760.getClass(), "parent", null);
        setField(term2740, term2740.getClass(), "last", term2760);
        setField(term2763, term2763.getClass(), "next", null);
        setIntField(term2763, term2763.getClass(), "type", 0);
        setIntField(term2763, term2763.getClass(), "intValue", 0);
        setField(term2763, term2763.getClass(), "objectValue", null);
        setField(term2740, term2740.getClass(), "propListHead", term2763);
        setIntField(term2740, term2740.getClass(), "sourcePosition", 1596213415);
        setField(term2740, term2740.getClass(), "jsType", null);
        setField(term2740, term2740.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2740;
        try {
            callMethod(klass, "getBestLValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


