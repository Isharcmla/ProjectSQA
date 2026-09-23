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

public class TypeInference_traverseAdd_838817955465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1711504;
     Object term1711574;

    public TypeInference_traverseAdd_838817955465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1711504 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1711574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1714024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1711644, term1711644.getClass(), "next", null);
        setIntField(term1711644, term1711644.getClass(), "type", 14);
        setIntField(term1711714, term1711714.getClass(), "type", 14);
        setIntField(term1711784, term1711784.getClass(), "type", 14);
        setIntField(term1711854, term1711854.getClass(), "type", 14);
        setIntField(term1711924, term1711924.getClass(), "type", 14);
        setIntField(term1711994, term1711994.getClass(), "type", 14);
        setIntField(term1712064, term1712064.getClass(), "type", 14);
        setIntField(term1712134, term1712134.getClass(), "type", 14);
        setIntField(term1712204, term1712204.getClass(), "type", 14);
        setIntField(term1712274, term1712274.getClass(), "type", 14);
        setIntField(term1712344, term1712344.getClass(), "type", 14);
        setIntField(term1712414, term1712414.getClass(), "type", 14);
        setIntField(term1712484, term1712484.getClass(), "type", 14);
        setIntField(term1712554, term1712554.getClass(), "type", 14);
        setIntField(term1712624, term1712624.getClass(), "type", 14);
        setIntField(term1712694, term1712694.getClass(), "type", 14);
        setIntField(term1712764, term1712764.getClass(), "type", 14);
        setIntField(term1712834, term1712834.getClass(), "type", 14);
        setIntField(term1712904, term1712904.getClass(), "type", 14);
        setIntField(term1712974, term1712974.getClass(), "type", 14);
        setIntField(term1713044, term1713044.getClass(), "type", 14);
        setIntField(term1713114, term1713114.getClass(), "type", 14);
        setIntField(term1713184, term1713184.getClass(), "type", 14);
        setIntField(term1713254, term1713254.getClass(), "type", 14);
        setIntField(term1713324, term1713324.getClass(), "type", 14);
        setIntField(term1713394, term1713394.getClass(), "type", 14);
        setIntField(term1713464, term1713464.getClass(), "type", 14);
        setIntField(term1713534, term1713534.getClass(), "type", 14);
        setIntField(term1713604, term1713604.getClass(), "type", 14);
        setIntField(term1713674, term1713674.getClass(), "type", 14);
        setIntField(term1713744, term1713744.getClass(), "type", 14);
        setIntField(term1713814, term1713814.getClass(), "type", 14);
        setIntField(term1713884, term1713884.getClass(), "type", 14);
        setIntField(term1713954, term1713954.getClass(), "type", 14);
        setIntField(term1714024, term1714024.getClass(), "type", 67);
        setField(term1713954, term1713954.getClass(), "first", term1714024);
        setField(term1713884, term1713884.getClass(), "first", term1713954);
        setField(term1713814, term1713814.getClass(), "first", term1713884);
        setField(term1713744, term1713744.getClass(), "first", term1713814);
        setField(term1713674, term1713674.getClass(), "first", term1713744);
        setField(term1713604, term1713604.getClass(), "first", term1713674);
        setField(term1713534, term1713534.getClass(), "first", term1713604);
        setField(term1713464, term1713464.getClass(), "first", term1713534);
        setField(term1713394, term1713394.getClass(), "first", term1713464);
        setField(term1713324, term1713324.getClass(), "first", term1713394);
        setField(term1713254, term1713254.getClass(), "first", term1713324);
        setField(term1713184, term1713184.getClass(), "first", term1713254);
        setField(term1713114, term1713114.getClass(), "first", term1713184);
        setField(term1713044, term1713044.getClass(), "first", term1713114);
        setField(term1712974, term1712974.getClass(), "first", term1713044);
        setField(term1712904, term1712904.getClass(), "first", term1712974);
        setField(term1712834, term1712834.getClass(), "first", term1712904);
        setField(term1712764, term1712764.getClass(), "first", term1712834);
        setField(term1712694, term1712694.getClass(), "first", term1712764);
        setField(term1712624, term1712624.getClass(), "first", term1712694);
        setField(term1712554, term1712554.getClass(), "first", term1712624);
        setField(term1712484, term1712484.getClass(), "first", term1712554);
        setField(term1712414, term1712414.getClass(), "first", term1712484);
        setField(term1712344, term1712344.getClass(), "first", term1712414);
        setField(term1712274, term1712274.getClass(), "first", term1712344);
        setField(term1712204, term1712204.getClass(), "first", term1712274);
        setField(term1712134, term1712134.getClass(), "first", term1712204);
        setField(term1712064, term1712064.getClass(), "first", term1712134);
        setField(term1711994, term1711994.getClass(), "first", term1712064);
        setField(term1711924, term1711924.getClass(), "first", term1711994);
        setField(term1711854, term1711854.getClass(), "first", term1711924);
        setField(term1711784, term1711784.getClass(), "first", term1711854);
        setField(term1711714, term1711714.getClass(), "first", term1711784);
        setField(term1711644, term1711644.getClass(), "first", term1711714);
        setField(term1711574, term1711574.getClass(), "first", term1711644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1711574;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1711504, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


