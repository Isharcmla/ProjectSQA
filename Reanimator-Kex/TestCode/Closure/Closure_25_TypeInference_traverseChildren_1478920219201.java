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

public class TypeInference_traverseChildren_1478920219201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148711;
     Object term148781;

    public TypeInference_traverseChildren_1478920219201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148711 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term148781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term148851, term148851.getClass(), "type", 18);
        setIntField(term148921, term148921.getClass(), "type", 18);
        setIntField(term148991, term148991.getClass(), "type", 18);
        setIntField(term149061, term149061.getClass(), "type", 18);
        setIntField(term149131, term149131.getClass(), "type", 18);
        setIntField(term149201, term149201.getClass(), "type", 18);
        setIntField(term149271, term149271.getClass(), "type", 18);
        setIntField(term149341, term149341.getClass(), "type", 18);
        setIntField(term149411, term149411.getClass(), "type", 18);
        setIntField(term149481, term149481.getClass(), "type", 18);
        setIntField(term149551, term149551.getClass(), "type", 18);
        setIntField(term149621, term149621.getClass(), "type", 18);
        setIntField(term149691, term149691.getClass(), "type", 18);
        setIntField(term149761, term149761.getClass(), "type", 18);
        setIntField(term149831, term149831.getClass(), "type", 18);
        setIntField(term149901, term149901.getClass(), "type", 18);
        setIntField(term149971, term149971.getClass(), "type", 18);
        setIntField(term150041, term150041.getClass(), "type", 18);
        setIntField(term150111, term150111.getClass(), "type", 18);
        setIntField(term150181, term150181.getClass(), "type", 18);
        setIntField(term150251, term150251.getClass(), "type", 18);
        setIntField(term150321, term150321.getClass(), "type", 18);
        setIntField(term150391, term150391.getClass(), "type", 18);
        setIntField(term150461, term150461.getClass(), "type", 18);
        setIntField(term150531, term150531.getClass(), "type", 18);
        setIntField(term150601, term150601.getClass(), "type", 18);
        setIntField(term150671, term150671.getClass(), "type", 18);
        setIntField(term150741, term150741.getClass(), "type", 18);
        setIntField(term150811, term150811.getClass(), "type", 18);
        setIntField(term150881, term150881.getClass(), "type", 18);
        setIntField(term150951, term150951.getClass(), "type", 18);
        setIntField(term151021, term151021.getClass(), "type", 18);
        setIntField(term151091, term151091.getClass(), "type", 18);
        setIntField(term151161, term151161.getClass(), "type", 18);
        setIntField(term151231, term151231.getClass(), "type", 118);
        setField(term151161, term151161.getClass(), "first", term151231);
        setField(term151091, term151091.getClass(), "first", term151161);
        setField(term151021, term151021.getClass(), "first", term151091);
        setField(term150951, term150951.getClass(), "first", term151021);
        setField(term150881, term150881.getClass(), "first", term150951);
        setField(term150811, term150811.getClass(), "first", term150881);
        setField(term150741, term150741.getClass(), "first", term150811);
        setField(term150671, term150671.getClass(), "first", term150741);
        setField(term150601, term150601.getClass(), "first", term150671);
        setField(term150531, term150531.getClass(), "first", term150601);
        setField(term150461, term150461.getClass(), "first", term150531);
        setField(term150391, term150391.getClass(), "first", term150461);
        setField(term150321, term150321.getClass(), "first", term150391);
        setField(term150251, term150251.getClass(), "first", term150321);
        setField(term150181, term150181.getClass(), "first", term150251);
        setField(term150111, term150111.getClass(), "first", term150181);
        setField(term150041, term150041.getClass(), "first", term150111);
        setField(term149971, term149971.getClass(), "first", term150041);
        setField(term149901, term149901.getClass(), "first", term149971);
        setField(term149831, term149831.getClass(), "first", term149901);
        setField(term149761, term149761.getClass(), "first", term149831);
        setField(term149691, term149691.getClass(), "first", term149761);
        setField(term149621, term149621.getClass(), "first", term149691);
        setField(term149551, term149551.getClass(), "first", term149621);
        setField(term149481, term149481.getClass(), "first", term149551);
        setField(term149411, term149411.getClass(), "first", term149481);
        setField(term149341, term149341.getClass(), "first", term149411);
        setField(term149271, term149271.getClass(), "first", term149341);
        setField(term149201, term149201.getClass(), "first", term149271);
        setField(term149131, term149131.getClass(), "first", term149201);
        setField(term149061, term149061.getClass(), "first", term149131);
        setField(term148991, term148991.getClass(), "first", term149061);
        setField(term148921, term148921.getClass(), "first", term148991);
        setField(term148851, term148851.getClass(), "first", term148921);
        setField(term148781, term148781.getClass(), "first", term148851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term148781;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term148711, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


