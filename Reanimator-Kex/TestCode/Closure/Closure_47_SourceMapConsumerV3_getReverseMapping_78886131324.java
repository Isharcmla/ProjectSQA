package com.google.debugging.sourcemap;

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
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.debugging.sourcemap.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;

public class SourceMapConsumerV3_getReverseMapping_78886131324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1280;
     Object term1425;
     Object term1427;
     Object term7662;
     Object term7513;

    public SourceMapConsumerV3_getReverseMapping_78886131324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1404 = new ArrayList();
        HashMap term1408 = new HashMap();
        term1280 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term1281 = (Object[]) newArray("java.lang.String", 1);
        Object[] term1294 = (Object[]) newArray("java.lang.String", 9);
        setElement(term1281, 0, "JDswTTCZHV");
        setField(term1280, term1280.getClass(), "sources", term1281);
        setElement(term1294, 0, "onpbIeEKoi");
        setElement(term1294, 1, "YRHGsAkhxb");
        setElement(term1294, 2, "ffYhPOzlUs");
        setElement(term1294, 3, "MLqYREekMl");
        setElement(term1294, 4, "ytSBIKXogI");
        setElement(term1294, 5, "nHXjMycHlU");
        setElement(term1294, 6, "ieCtQFdkii");
        setElement(term1294, 7, "dEnhdmILtU");
        setElement(term1294, 8, "hoicvmsovO");
        setField(term1280, term1280.getClass(), "names", term1294);
        setIntField(term1280, term1280.getClass(), "lineCount", -1339778481);
        setField(term1280, term1280.getClass(), "lines", term1404);
        setField(term1280, term1280.getClass(), "reverseSourceMapping", term1408);
        term1425 = new Integer(1725571209);
        term1427 = new Integer(-522618178);
        ArrayList term7685 = new ArrayList();
        HashMap term7687 = new HashMap();
        term7662 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term7663 = (Object[]) newArray("java.lang.String", 1);
        Object[] term7666 = (Object[]) newArray("java.lang.String", 9);
        setElement(term7663, 0, "JDswTTCZHV");
        setField(term7662, term7662.getClass(), "sources", term7663);
        setElement(term7666, 0, "onpbIeEKoi");
        setElement(term7666, 1, "YRHGsAkhxb");
        setElement(term7666, 2, "ffYhPOzlUs");
        setElement(term7666, 3, "MLqYREekMl");
        setElement(term7666, 4, "ytSBIKXogI");
        setElement(term7666, 5, "nHXjMycHlU");
        setElement(term7666, 6, "ieCtQFdkii");
        setElement(term7666, 7, "dEnhdmILtU");
        setElement(term7666, 8, "hoicvmsovO");
        setField(term7662, term7662.getClass(), "names", term7666);
        setIntField(term7662, term7662.getClass(), "lineCount", -1339778481);
        setField(term7662, term7662.getClass(), "lines", term7685);
        setField(term7662, term7662.getClass(), "reverseSourceMapping", term7687);
        term7513 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setIntField(term7513, term7513.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "eqJfYWRaEL";
        args[1] = term1425;
        args[2] = term1427;
        Object retValue = callMethod(klass, "getReverseMapping", argTypes, term1280, args);
        assertTrue(recursiveEquals(term1280, term7662));
        assertTrue(recursiveEquals(term1425, 1725571209));
        assertTrue(recursiveEquals(term1427, -522618178));
        assertTrue(recursiveEquals(retValue, term7513));
    }

};


