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

public class TypeInference_traverseReturn_1142297770371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930653;
     Object term930723;

    public TypeInference_traverseReturn_1142297770371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term930653 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term930723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term930793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term930863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term930933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term933033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term933103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term933173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term933243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term933313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term933383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term933453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term930793, term930793.getClass(), "type", 92);
        setIntField(term930863, term930863.getClass(), "type", 92);
        setIntField(term930933, term930933.getClass(), "type", 92);
        setIntField(term931003, term931003.getClass(), "type", 92);
        setIntField(term931073, term931073.getClass(), "type", 92);
        setIntField(term931143, term931143.getClass(), "type", 92);
        setIntField(term931213, term931213.getClass(), "type", 92);
        setIntField(term931283, term931283.getClass(), "type", 92);
        setIntField(term931353, term931353.getClass(), "type", 92);
        setIntField(term931423, term931423.getClass(), "type", 92);
        setIntField(term931493, term931493.getClass(), "type", 92);
        setIntField(term931563, term931563.getClass(), "type", 92);
        setIntField(term931633, term931633.getClass(), "type", 92);
        setIntField(term931703, term931703.getClass(), "type", 92);
        setIntField(term931773, term931773.getClass(), "type", 92);
        setIntField(term931843, term931843.getClass(), "type", 92);
        setIntField(term931913, term931913.getClass(), "type", 92);
        setIntField(term931983, term931983.getClass(), "type", 92);
        setIntField(term932053, term932053.getClass(), "type", 92);
        setIntField(term932123, term932123.getClass(), "type", 92);
        setIntField(term932193, term932193.getClass(), "type", 92);
        setIntField(term932263, term932263.getClass(), "type", 92);
        setIntField(term932333, term932333.getClass(), "type", 92);
        setIntField(term932403, term932403.getClass(), "type", 92);
        setIntField(term932473, term932473.getClass(), "type", 92);
        setIntField(term932543, term932543.getClass(), "type", 92);
        setIntField(term932613, term932613.getClass(), "type", 92);
        setIntField(term932683, term932683.getClass(), "type", 92);
        setIntField(term932753, term932753.getClass(), "type", 92);
        setIntField(term932823, term932823.getClass(), "type", 92);
        setIntField(term932893, term932893.getClass(), "type", 92);
        setIntField(term932963, term932963.getClass(), "type", 92);
        setIntField(term933033, term933033.getClass(), "type", 92);
        setIntField(term933103, term933103.getClass(), "type", 92);
        setIntField(term933173, term933173.getClass(), "type", 92);
        setIntField(term933243, term933243.getClass(), "type", 92);
        setIntField(term933313, term933313.getClass(), "type", 92);
        setIntField(term933383, term933383.getClass(), "type", 92);
        setIntField(term933453, term933453.getClass(), "type", 111);
        setField(term933383, term933383.getClass(), "first", term933453);
        setField(term933313, term933313.getClass(), "first", term933383);
        setField(term933243, term933243.getClass(), "first", term933313);
        setField(term933173, term933173.getClass(), "first", term933243);
        setField(term933103, term933103.getClass(), "first", term933173);
        setField(term933033, term933033.getClass(), "first", term933103);
        setField(term932963, term932963.getClass(), "first", term933033);
        setField(term932893, term932893.getClass(), "first", term932963);
        setField(term932823, term932823.getClass(), "first", term932893);
        setField(term932753, term932753.getClass(), "first", term932823);
        setField(term932683, term932683.getClass(), "first", term932753);
        setField(term932613, term932613.getClass(), "first", term932683);
        setField(term932543, term932543.getClass(), "first", term932613);
        setField(term932473, term932473.getClass(), "first", term932543);
        setField(term932403, term932403.getClass(), "first", term932473);
        setField(term932333, term932333.getClass(), "first", term932403);
        setField(term932263, term932263.getClass(), "first", term932333);
        setField(term932193, term932193.getClass(), "first", term932263);
        setField(term932123, term932123.getClass(), "first", term932193);
        setField(term932053, term932053.getClass(), "first", term932123);
        setField(term931983, term931983.getClass(), "first", term932053);
        setField(term931913, term931913.getClass(), "first", term931983);
        setField(term931843, term931843.getClass(), "first", term931913);
        setField(term931773, term931773.getClass(), "first", term931843);
        setField(term931703, term931703.getClass(), "first", term931773);
        setField(term931633, term931633.getClass(), "first", term931703);
        setField(term931563, term931563.getClass(), "first", term931633);
        setField(term931493, term931493.getClass(), "first", term931563);
        setField(term931423, term931423.getClass(), "first", term931493);
        setField(term931353, term931353.getClass(), "first", term931423);
        setField(term931283, term931283.getClass(), "first", term931353);
        setField(term931213, term931213.getClass(), "first", term931283);
        setField(term931143, term931143.getClass(), "first", term931213);
        setField(term931073, term931073.getClass(), "first", term931143);
        setField(term931003, term931003.getClass(), "first", term931073);
        setField(term930933, term930933.getClass(), "first", term931003);
        setField(term930863, term930863.getClass(), "first", term930933);
        setField(term930793, term930793.getClass(), "first", term930863);
        setField(term930723, term930723.getClass(), "first", term930793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term930723;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term930653, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


