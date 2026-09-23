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

public class JsonTreeReader_nextNull_119034834413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3127;

    public JsonTreeReader_nextNull_119034834413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3127 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term3128 = (Object[]) newArray("java.lang.Object", 6);
        Object term3129 = newInstance(Class.forName("java.lang.Object"));
        Object term3130 = newInstance(Class.forName("java.lang.Object"));
        Object term3131 = newInstance(Class.forName("java.lang.Object"));
        Object term3132 = newInstance(Class.forName("java.lang.Object"));
        Object term3133 = newInstance(Class.forName("java.lang.Object"));
        Object term3134 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3260 = (Object[]) newArray("java.lang.String", 8);
        int[] term3357 = (int[]) newIntArray(6);
        char[] term3223 = (char[]) newCharArray(9);
        int[] term3252 = (int[]) newIntArray(6);
        setElement(term3128, 0, term3129);
        setElement(term3128, 1, term3130);
        setElement(term3128, 2, term3131);
        setElement(term3128, 3, term3132);
        setElement(term3128, 4, term3133);
        setElement(term3128, 5, term3134);
        setField(term3127, term3127.getClass(), "stack", term3128);
        setIntField(term3127, term3127.getClass(), "stackSize", -919416536);
        setElement(term3260, 0, "xJgPlLxpgC");
        setElement(term3260, 1, "EYtfuJaxiM");
        setElement(term3260, 2, "gCWtLVKVVe");
        setElement(term3260, 3, "fWKJoSoCwE");
        setElement(term3260, 4, "wfaXBpWAUH");
        setElement(term3260, 5, "VMeAzAHwZj");
        setElement(term3260, 6, "PznxWXsZME");
        setElement(term3260, 7, "ZzIujlwVsw");
        setField(term3127, term3127.getClass(), "pathNames", term3260);
        setIntElement(term3357, 0, -43417861);
        setIntElement(term3357, 1, -1533843432);
        setIntElement(term3357, 2, -123338791);
        setIntElement(term3357, 3, -1467089634);
        setIntElement(term3357, 4, 413548937);
        setIntElement(term3357, 5, 1901317214);
        setField(term3127, term3127.getClass(), "pathIndices", term3357);
        setField(term3127, term3127.getClass(), "in", null);
        setBooleanField(term3127, term3127.getClass(), "lenient", false);
        setCharElement(term3223, 0, 'Z');
        setCharElement(term3223, 1, 'p');
        setCharElement(term3223, 2, 'V');
        setCharElement(term3223, 3, 'm');
        setCharElement(term3223, 4, 'a');
        setCharElement(term3223, 5, 'n');
        setCharElement(term3223, 6, 'W');
        setCharElement(term3223, 7, 'E');
        setCharElement(term3223, 8, 'G');
        setField(term3127, term3127.getClass(), "buffer", term3223);
        setIntField(term3127, term3127.getClass(), "pos", 1745276158);
        setIntField(term3127, term3127.getClass(), "limit", 2009020256);
        setIntField(term3127, term3127.getClass(), "lineNumber", 2049577015);
        setIntField(term3127, term3127.getClass(), "lineStart", 1236004505);
        setIntField(term3127, term3127.getClass(), "peeked", 1050765721);
        setLongField(term3127, term3127.getClass(), "peekedLong", -4325723315152823407L);
        setIntField(term3127, term3127.getClass(), "peekedNumberLength", 474518942);
        setField(term3127, term3127.getClass(), "peekedString", "AKNapTAfmD");
        setIntElement(term3252, 0, -1656687479);
        setIntElement(term3252, 1, -249614216);
        setIntElement(term3252, 2, 1870727665);
        setIntElement(term3252, 3, -519881101);
        setIntElement(term3252, 4, -680920524);
        setIntElement(term3252, 5, -916335264);
        setField(term3127, term3127.getClass(), "stack", term3252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextNull", argTypes, term3127, args);
    }

};


