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

public class TypeInference_traverseArrayLiteral_67090236358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1230653;
     Object term1230723;

    public TypeInference_traverseArrayLiteral_67090236358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1230653 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1230723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1230793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1230863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1230933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1230793, term1230793.getClass(), "type", 83);
        setIntField(term1230863, term1230863.getClass(), "type", 83);
        setIntField(term1230933, term1230933.getClass(), "type", 83);
        setIntField(term1231003, term1231003.getClass(), "type", 83);
        setIntField(term1231073, term1231073.getClass(), "type", 83);
        setIntField(term1231143, term1231143.getClass(), "type", 83);
        setIntField(term1231213, term1231213.getClass(), "type", 83);
        setIntField(term1231283, term1231283.getClass(), "type", 83);
        setIntField(term1231353, term1231353.getClass(), "type", 83);
        setIntField(term1231423, term1231423.getClass(), "type", 83);
        setIntField(term1231493, term1231493.getClass(), "type", 83);
        setIntField(term1231563, term1231563.getClass(), "type", 83);
        setIntField(term1231633, term1231633.getClass(), "type", 83);
        setIntField(term1231703, term1231703.getClass(), "type", 83);
        setIntField(term1231773, term1231773.getClass(), "type", 83);
        setIntField(term1231843, term1231843.getClass(), "type", 83);
        setIntField(term1231913, term1231913.getClass(), "type", 83);
        setIntField(term1231983, term1231983.getClass(), "type", 83);
        setIntField(term1232053, term1232053.getClass(), "type", 83);
        setIntField(term1232123, term1232123.getClass(), "type", 83);
        setIntField(term1232193, term1232193.getClass(), "type", 83);
        setIntField(term1232263, term1232263.getClass(), "type", 83);
        setIntField(term1232333, term1232333.getClass(), "type", 83);
        setIntField(term1232403, term1232403.getClass(), "type", 83);
        setIntField(term1232473, term1232473.getClass(), "type", 83);
        setIntField(term1232543, term1232543.getClass(), "type", 83);
        setIntField(term1232613, term1232613.getClass(), "type", 83);
        setIntField(term1232683, term1232683.getClass(), "type", 83);
        setIntField(term1232753, term1232753.getClass(), "type", 83);
        setIntField(term1232823, term1232823.getClass(), "type", 83);
        setIntField(term1232893, term1232893.getClass(), "type", 83);
        setIntField(term1232963, term1232963.getClass(), "type", 83);
        setIntField(term1233033, term1233033.getClass(), "type", 83);
        setIntField(term1233103, term1233103.getClass(), "type", 83);
        setIntField(term1233173, term1233173.getClass(), "type", 83);
        setIntField(term1233243, term1233243.getClass(), "type", 83);
        setIntField(term1233313, term1233313.getClass(), "type", 83);
        setIntField(term1233383, term1233383.getClass(), "type", 83);
        setIntField(term1233453, term1233453.getClass(), "type", 83);
        setIntField(term1233523, term1233523.getClass(), "type", 83);
        setIntField(term1233593, term1233593.getClass(), "type", 83);
        setIntField(term1233663, term1233663.getClass(), "type", 83);
        setIntField(term1233733, term1233733.getClass(), "type", 83);
        setIntField(term1233803, term1233803.getClass(), "type", 83);
        setIntField(term1233873, term1233873.getClass(), "type", 83);
        setIntField(term1233943, term1233943.getClass(), "type", 83);
        setIntField(term1234013, term1234013.getClass(), "type", 29);
        setField(term1233943, term1233943.getClass(), "first", term1234013);
        setField(term1233873, term1233873.getClass(), "first", term1233943);
        setField(term1233803, term1233803.getClass(), "first", term1233873);
        setField(term1233733, term1233733.getClass(), "first", term1233803);
        setField(term1233663, term1233663.getClass(), "first", term1233733);
        setField(term1233593, term1233593.getClass(), "first", term1233663);
        setField(term1233523, term1233523.getClass(), "first", term1233593);
        setField(term1233453, term1233453.getClass(), "first", term1233523);
        setField(term1233383, term1233383.getClass(), "first", term1233453);
        setField(term1233313, term1233313.getClass(), "first", term1233383);
        setField(term1233243, term1233243.getClass(), "first", term1233313);
        setField(term1233173, term1233173.getClass(), "first", term1233243);
        setField(term1233103, term1233103.getClass(), "first", term1233173);
        setField(term1233033, term1233033.getClass(), "first", term1233103);
        setField(term1232963, term1232963.getClass(), "first", term1233033);
        setField(term1232893, term1232893.getClass(), "first", term1232963);
        setField(term1232823, term1232823.getClass(), "first", term1232893);
        setField(term1232753, term1232753.getClass(), "first", term1232823);
        setField(term1232683, term1232683.getClass(), "first", term1232753);
        setField(term1232613, term1232613.getClass(), "first", term1232683);
        setField(term1232543, term1232543.getClass(), "first", term1232613);
        setField(term1232473, term1232473.getClass(), "first", term1232543);
        setField(term1232403, term1232403.getClass(), "first", term1232473);
        setField(term1232333, term1232333.getClass(), "first", term1232403);
        setField(term1232263, term1232263.getClass(), "first", term1232333);
        setField(term1232193, term1232193.getClass(), "first", term1232263);
        setField(term1232123, term1232123.getClass(), "first", term1232193);
        setField(term1232053, term1232053.getClass(), "first", term1232123);
        setField(term1231983, term1231983.getClass(), "first", term1232053);
        setField(term1231913, term1231913.getClass(), "first", term1231983);
        setField(term1231843, term1231843.getClass(), "first", term1231913);
        setField(term1231773, term1231773.getClass(), "first", term1231843);
        setField(term1231703, term1231703.getClass(), "first", term1231773);
        setField(term1231633, term1231633.getClass(), "first", term1231703);
        setField(term1231563, term1231563.getClass(), "first", term1231633);
        setField(term1231493, term1231493.getClass(), "first", term1231563);
        setField(term1231423, term1231423.getClass(), "first", term1231493);
        setField(term1231353, term1231353.getClass(), "first", term1231423);
        setField(term1231283, term1231283.getClass(), "first", term1231353);
        setField(term1231213, term1231213.getClass(), "first", term1231283);
        setField(term1231143, term1231143.getClass(), "first", term1231213);
        setField(term1231073, term1231073.getClass(), "first", term1231143);
        setField(term1231003, term1231003.getClass(), "first", term1231073);
        setField(term1230933, term1230933.getClass(), "first", term1231003);
        setField(term1230863, term1230863.getClass(), "first", term1230933);
        setField(term1230793, term1230793.getClass(), "first", term1230863);
        setField(term1230723, term1230723.getClass(), "first", term1230793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1230723;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1230653, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


