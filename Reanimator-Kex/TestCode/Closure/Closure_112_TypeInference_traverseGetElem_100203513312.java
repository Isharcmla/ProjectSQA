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

public class TypeInference_traverseGetElem_100203513312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450192;
     Object term450262;

    public TypeInference_traverseGetElem_100203513312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term450192 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term450262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term450332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term450402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term450472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term450542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term450612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term450682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term450752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term450822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term450892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term450962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term450332, term450332.getClass(), "type", 98);
        setField(term450402, term450402.getClass(), "next", null);
        setIntField(term450402, term450402.getClass(), "type", 98);
        setField(term450472, term450472.getClass(), "next", null);
        setIntField(term450472, term450472.getClass(), "type", 98);
        setField(term450542, term450542.getClass(), "next", null);
        setIntField(term450542, term450542.getClass(), "type", 98);
        setField(term450612, term450612.getClass(), "next", null);
        setIntField(term450612, term450612.getClass(), "type", 98);
        setField(term450682, term450682.getClass(), "next", null);
        setIntField(term450682, term450682.getClass(), "type", 98);
        setField(term450752, term450752.getClass(), "next", null);
        setIntField(term450752, term450752.getClass(), "type", 98);
        setField(term450822, term450822.getClass(), "next", null);
        setIntField(term450822, term450822.getClass(), "type", 98);
        setField(term450892, term450892.getClass(), "next", null);
        setIntField(term450892, term450892.getClass(), "type", 98);
        setField(term450962, term450962.getClass(), "next", null);
        setIntField(term450962, term450962.getClass(), "type", 98);
        setField(term451032, term451032.getClass(), "next", null);
        setIntField(term451032, term451032.getClass(), "type", 98);
        setField(term451102, term451102.getClass(), "next", null);
        setIntField(term451102, term451102.getClass(), "type", 98);
        setField(term451172, term451172.getClass(), "next", null);
        setIntField(term451172, term451172.getClass(), "type", 98);
        setField(term451242, term451242.getClass(), "next", null);
        setIntField(term451242, term451242.getClass(), "type", 98);
        setField(term451312, term451312.getClass(), "next", null);
        setIntField(term451312, term451312.getClass(), "type", 98);
        setField(term451382, term451382.getClass(), "next", null);
        setIntField(term451382, term451382.getClass(), "type", 98);
        setField(term451452, term451452.getClass(), "next", null);
        setIntField(term451452, term451452.getClass(), "type", 98);
        setField(term451522, term451522.getClass(), "next", null);
        setIntField(term451522, term451522.getClass(), "type", 98);
        setField(term451592, term451592.getClass(), "next", null);
        setIntField(term451592, term451592.getClass(), "type", 98);
        setField(term451662, term451662.getClass(), "next", null);
        setIntField(term451662, term451662.getClass(), "type", 110);
        setField(term451592, term451592.getClass(), "first", term451662);
        setField(term451592, term451592.getClass(), "last", null);
        setField(term451522, term451522.getClass(), "first", term451592);
        setField(term451522, term451522.getClass(), "last", null);
        setField(term451452, term451452.getClass(), "first", term451522);
        setField(term451452, term451452.getClass(), "last", null);
        setField(term451382, term451382.getClass(), "first", term451452);
        setField(term451382, term451382.getClass(), "last", null);
        setField(term451312, term451312.getClass(), "first", term451382);
        setField(term451312, term451312.getClass(), "last", null);
        setField(term451242, term451242.getClass(), "first", term451312);
        setField(term451242, term451242.getClass(), "last", null);
        setField(term451172, term451172.getClass(), "first", term451242);
        setField(term451172, term451172.getClass(), "last", null);
        setField(term451102, term451102.getClass(), "first", term451172);
        setField(term451102, term451102.getClass(), "last", null);
        setField(term451032, term451032.getClass(), "first", term451102);
        setField(term451032, term451032.getClass(), "last", null);
        setField(term450962, term450962.getClass(), "first", term451032);
        setField(term450962, term450962.getClass(), "last", null);
        setField(term450892, term450892.getClass(), "first", term450962);
        setField(term450892, term450892.getClass(), "last", null);
        setField(term450822, term450822.getClass(), "first", term450892);
        setField(term450822, term450822.getClass(), "last", null);
        setField(term450752, term450752.getClass(), "first", term450822);
        setField(term450752, term450752.getClass(), "last", null);
        setField(term450682, term450682.getClass(), "first", term450752);
        setField(term450682, term450682.getClass(), "last", null);
        setField(term450612, term450612.getClass(), "first", term450682);
        setField(term450612, term450612.getClass(), "last", null);
        setField(term450542, term450542.getClass(), "first", term450612);
        setField(term450542, term450542.getClass(), "last", null);
        setField(term450472, term450472.getClass(), "first", term450542);
        setField(term450472, term450472.getClass(), "last", null);
        setField(term450402, term450402.getClass(), "first", term450472);
        setField(term450402, term450402.getClass(), "last", null);
        setField(term450332, term450332.getClass(), "first", term450402);
        setField(term450332, term450332.getClass(), "last", null);
        setField(term450262, term450262.getClass(), "first", term450332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term450262;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term450192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


