package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_peekStack_3703253827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1448;

    public JsonTreeReader_peekStack_3703253827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1448 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term1449 = (Object[]) newArray("java.lang.Object", 6);
        Object term1450 = newInstance(Class.forName("java.lang.Object"));
        Object term1451 = newInstance(Class.forName("java.lang.Object"));
        Object term1452 = newInstance(Class.forName("java.lang.Object"));
        Object term1453 = newInstance(Class.forName("java.lang.Object"));
        Object term1454 = newInstance(Class.forName("java.lang.Object"));
        Object term1455 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1523 = (Object[]) newArray("java.lang.String", 8);
        int[] term1620 = (int[]) newIntArray(9);
        char[] term1492 = (char[]) newCharArray(3);
        int[] term1515 = (int[]) newIntArray(6);
        setElement(term1449, 0, term1450);
        setElement(term1449, 1, term1451);
        setElement(term1449, 2, term1452);
        setElement(term1449, 3, term1453);
        setElement(term1449, 4, term1454);
        setElement(term1449, 5, term1455);
        setField(term1448, term1448.getClass(), "stack", term1449);
        setIntField(term1448, term1448.getClass(), "stackSize", 158873461);
        setElement(term1523, 0, "tPlsykYBqO");
        setElement(term1523, 1, "bLPjGVBhlX");
        setElement(term1523, 2, "whBvTVIIlC");
        setElement(term1523, 3, "IgRJUzaCwW");
        setElement(term1523, 4, "JUmudUmaaV");
        setElement(term1523, 5, "KoyGrUJeJW");
        setElement(term1523, 6, "HqBOwkVqjD");
        setElement(term1523, 7, "MAcUBcBckh");
        setField(term1448, term1448.getClass(), "pathNames", term1523);
        setIntElement(term1620, 0, -430151637);
        setIntElement(term1620, 1, -1697741339);
        setIntElement(term1620, 2, 98922530);
        setIntElement(term1620, 3, -1388471422);
        setIntElement(term1620, 4, -1498296052);
        setIntElement(term1620, 5, 2098647989);
        setIntElement(term1620, 6, 1598895173);
        setIntElement(term1620, 7, 1830648570);
        setIntElement(term1620, 8, -227365013);
        setField(term1448, term1448.getClass(), "pathIndices", term1620);
        setField(term1448, term1448.getClass(), "in", null);
        setBooleanField(term1448, term1448.getClass(), "lenient", true);
        setCharElement(term1492, 0, 'c');
        setCharElement(term1492, 1, 'g');
        setCharElement(term1492, 2, 'Q');
        setField(term1448, term1448.getClass(), "buffer", term1492);
        setIntField(term1448, term1448.getClass(), "pos", 71190297);
        setIntField(term1448, term1448.getClass(), "limit", 1202361360);
        setIntField(term1448, term1448.getClass(), "lineNumber", -2015048153);
        setIntField(term1448, term1448.getClass(), "lineStart", -2063457669);
        setIntField(term1448, term1448.getClass(), "peeked", -1222006000);
        setLongField(term1448, term1448.getClass(), "peekedLong", 4872422362414183754L);
        setIntField(term1448, term1448.getClass(), "peekedNumberLength", 2095798786);
        setField(term1448, term1448.getClass(), "peekedString", "TJmVBGfTML");
        setIntElement(term1515, 0, -1565502840);
        setIntElement(term1515, 1, 344323424);
        setIntElement(term1515, 2, 9726679);
        setIntElement(term1515, 3, -25637976);
        setIntElement(term1515, 4, 1555897383);
        setIntElement(term1515, 5, 202001407);
        setField(term1448, term1448.getClass(), "stack", term1515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peekStack", argTypes, term1448, args);
    }

};


