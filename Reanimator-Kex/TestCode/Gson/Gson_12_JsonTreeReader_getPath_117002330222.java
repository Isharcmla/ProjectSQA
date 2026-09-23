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

public class JsonTreeReader_getPath_117002330222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5174;

    public JsonTreeReader_getPath_117002330222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5174 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term5175 = (Object[]) newArray("java.lang.Object", 6);
        Object term5176 = newInstance(Class.forName("java.lang.Object"));
        Object term5177 = newInstance(Class.forName("java.lang.Object"));
        Object term5178 = newInstance(Class.forName("java.lang.Object"));
        Object term5179 = newInstance(Class.forName("java.lang.Object"));
        Object term5180 = newInstance(Class.forName("java.lang.Object"));
        Object term5181 = newInstance(Class.forName("java.lang.Object"));
        Object[] term5305 = (Object[]) newArray("java.lang.String", 1);
        int[] term5318 = (int[]) newIntArray(6);
        char[] term5275 = (char[]) newCharArray(2);
        int[] term5297 = (int[]) newIntArray(6);
        setElement(term5175, 0, term5176);
        setElement(term5175, 1, term5177);
        setElement(term5175, 2, term5178);
        setElement(term5175, 3, term5179);
        setElement(term5175, 4, term5180);
        setElement(term5175, 5, term5181);
        setField(term5174, term5174.getClass(), "stack", term5175);
        setIntField(term5174, term5174.getClass(), "stackSize", -222941705);
        setElement(term5305, 0, "wKWbJssZuG");
        setField(term5174, term5174.getClass(), "pathNames", term5305);
        setIntElement(term5318, 0, 291864719);
        setIntElement(term5318, 1, -1549607466);
        setIntElement(term5318, 2, 853609788);
        setIntElement(term5318, 3, -197820800);
        setIntElement(term5318, 4, 723812297);
        setIntElement(term5318, 5, 1639448749);
        setField(term5174, term5174.getClass(), "pathIndices", term5318);
        setField(term5174, term5174.getClass(), "in", null);
        setBooleanField(term5174, term5174.getClass(), "lenient", true);
        setCharElement(term5275, 0, 'Y');
        setCharElement(term5275, 1, 'I');
        setField(term5174, term5174.getClass(), "buffer", term5275);
        setIntField(term5174, term5174.getClass(), "pos", 812570053);
        setIntField(term5174, term5174.getClass(), "limit", -1488938905);
        setIntField(term5174, term5174.getClass(), "lineNumber", 1916544127);
        setIntField(term5174, term5174.getClass(), "lineStart", -1133405894);
        setIntField(term5174, term5174.getClass(), "peeked", 1289741214);
        setLongField(term5174, term5174.getClass(), "peekedLong", -2585684163342970173L);
        setIntField(term5174, term5174.getClass(), "peekedNumberLength", 243280944);
        setField(term5174, term5174.getClass(), "peekedString", "WXMWFDGcLB");
        setIntElement(term5297, 0, -726681073);
        setIntElement(term5297, 1, -1724487863);
        setIntElement(term5297, 2, -128490829);
        setIntElement(term5297, 3, 202214133);
        setIntElement(term5297, 4, 1543091617);
        setIntElement(term5297, 5, -763166094);
        setField(term5174, term5174.getClass(), "stack", term5297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term5174, args);
    }

};


