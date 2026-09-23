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

public class TypeInference_traverseChildren_1478920219267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501501;
     Object term501571;

    public TypeInference_traverseChildren_1478920219267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501501 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term501571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term501641, term501641.getClass(), "type", 18);
        setIntField(term501711, term501711.getClass(), "type", 18);
        setIntField(term501781, term501781.getClass(), "type", 18);
        setIntField(term501851, term501851.getClass(), "type", 18);
        setIntField(term501921, term501921.getClass(), "type", 18);
        setIntField(term501991, term501991.getClass(), "type", 18);
        setIntField(term502061, term502061.getClass(), "type", 18);
        setIntField(term502131, term502131.getClass(), "type", 18);
        setIntField(term502201, term502201.getClass(), "type", 18);
        setIntField(term502271, term502271.getClass(), "type", 18);
        setIntField(term502341, term502341.getClass(), "type", 18);
        setIntField(term502411, term502411.getClass(), "type", 18);
        setIntField(term502481, term502481.getClass(), "type", 18);
        setIntField(term502551, term502551.getClass(), "type", 18);
        setIntField(term502621, term502621.getClass(), "type", 18);
        setIntField(term502691, term502691.getClass(), "type", 18);
        setIntField(term502761, term502761.getClass(), "type", 18);
        setIntField(term502831, term502831.getClass(), "type", 18);
        setIntField(term502901, term502901.getClass(), "type", 18);
        setIntField(term502971, term502971.getClass(), "type", 18);
        setIntField(term503041, term503041.getClass(), "type", 18);
        setIntField(term503111, term503111.getClass(), "type", 18);
        setIntField(term503181, term503181.getClass(), "type", 18);
        setIntField(term503251, term503251.getClass(), "type", 18);
        setIntField(term503321, term503321.getClass(), "type", 18);
        setIntField(term503391, term503391.getClass(), "type", 18);
        setIntField(term503461, term503461.getClass(), "type", 18);
        setIntField(term503531, term503531.getClass(), "type", 18);
        setIntField(term503601, term503601.getClass(), "type", 18);
        setIntField(term503671, term503671.getClass(), "type", 18);
        setIntField(term503741, term503741.getClass(), "type", 68);
        setField(term503671, term503671.getClass(), "first", term503741);
        setField(term503601, term503601.getClass(), "first", term503671);
        setField(term503531, term503531.getClass(), "first", term503601);
        setField(term503461, term503461.getClass(), "first", term503531);
        setField(term503391, term503391.getClass(), "first", term503461);
        setField(term503321, term503321.getClass(), "first", term503391);
        setField(term503251, term503251.getClass(), "first", term503321);
        setField(term503181, term503181.getClass(), "first", term503251);
        setField(term503111, term503111.getClass(), "first", term503181);
        setField(term503041, term503041.getClass(), "first", term503111);
        setField(term502971, term502971.getClass(), "first", term503041);
        setField(term502901, term502901.getClass(), "first", term502971);
        setField(term502831, term502831.getClass(), "first", term502901);
        setField(term502761, term502761.getClass(), "first", term502831);
        setField(term502691, term502691.getClass(), "first", term502761);
        setField(term502621, term502621.getClass(), "first", term502691);
        setField(term502551, term502551.getClass(), "first", term502621);
        setField(term502481, term502481.getClass(), "first", term502551);
        setField(term502411, term502411.getClass(), "first", term502481);
        setField(term502341, term502341.getClass(), "first", term502411);
        setField(term502271, term502271.getClass(), "first", term502341);
        setField(term502201, term502201.getClass(), "first", term502271);
        setField(term502131, term502131.getClass(), "first", term502201);
        setField(term502061, term502061.getClass(), "first", term502131);
        setField(term501991, term501991.getClass(), "first", term502061);
        setField(term501921, term501921.getClass(), "first", term501991);
        setField(term501851, term501851.getClass(), "first", term501921);
        setField(term501781, term501781.getClass(), "first", term501851);
        setField(term501711, term501711.getClass(), "first", term501781);
        setField(term501641, term501641.getClass(), "first", term501711);
        setField(term501571, term501571.getClass(), "first", term501641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term501571;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term501501, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


