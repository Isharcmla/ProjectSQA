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

public class JsonTreeReader_nextLong_125671829515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3724;

    public JsonTreeReader_nextLong_125671829515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3724 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term3725 = (Object[]) newArray("java.lang.Object", 5);
        Object term3726 = newInstance(Class.forName("java.lang.Object"));
        Object term3727 = newInstance(Class.forName("java.lang.Object"));
        Object term3728 = newInstance(Class.forName("java.lang.Object"));
        Object term3729 = newInstance(Class.forName("java.lang.Object"));
        Object term3730 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3805 = (Object[]) newArray("java.lang.String", 4);
        int[] term3854 = (int[]) newIntArray(1);
        char[] term3775 = (char[]) newCharArray(8);
        int[] term3803 = (int[]) newIntArray(0);
        setElement(term3725, 0, term3726);
        setElement(term3725, 1, term3727);
        setElement(term3725, 2, term3728);
        setElement(term3725, 3, term3729);
        setElement(term3725, 4, term3730);
        setField(term3724, term3724.getClass(), "stack", term3725);
        setIntField(term3724, term3724.getClass(), "stackSize", -2070466617);
        setElement(term3805, 0, "VYkqXKVlAJ");
        setElement(term3805, 1, "XkIoWJRNwN");
        setElement(term3805, 2, "aNWLJdrZMq");
        setElement(term3805, 3, "HHmNoYxIGj");
        setField(term3724, term3724.getClass(), "pathNames", term3805);
        setIntElement(term3854, 0, -1127721881);
        setField(term3724, term3724.getClass(), "pathIndices", term3854);
        setField(term3724, term3724.getClass(), "in", null);
        setBooleanField(term3724, term3724.getClass(), "lenient", false);
        setCharElement(term3775, 0, 'R');
        setCharElement(term3775, 1, 'b');
        setCharElement(term3775, 2, 'S');
        setCharElement(term3775, 3, 'S');
        setCharElement(term3775, 4, 'b');
        setCharElement(term3775, 5, 'S');
        setCharElement(term3775, 6, 'z');
        setCharElement(term3775, 7, 'j');
        setField(term3724, term3724.getClass(), "buffer", term3775);
        setIntField(term3724, term3724.getClass(), "pos", 1215150180);
        setIntField(term3724, term3724.getClass(), "limit", -1422859977);
        setIntField(term3724, term3724.getClass(), "lineNumber", -1972436591);
        setIntField(term3724, term3724.getClass(), "lineStart", 68922753);
        setIntField(term3724, term3724.getClass(), "peeked", -220791533);
        setLongField(term3724, term3724.getClass(), "peekedLong", -5476826692763582090L);
        setIntField(term3724, term3724.getClass(), "peekedNumberLength", 1741500243);
        setField(term3724, term3724.getClass(), "peekedString", "MwwjNtdOFT");
        setField(term3724, term3724.getClass(), "stack", term3803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextLong", argTypes, term3724, args);
    }

};


