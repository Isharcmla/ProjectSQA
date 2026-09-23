package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_close_100418859562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3677;

    public JsonReader_close_100418859562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3677 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term3679 = (char[]) newCharArray(1);
        int[] term3700 = (int[]) newIntArray(5);
        Object[] term3707 = (Object[]) newArray("java.lang.String", 3);
        int[] term3744 = (int[]) newIntArray(9);
        setField(term3677, term3677.getClass(), "in", null);
        setBooleanField(term3677, term3677.getClass(), "lenient", true);
        setCharElement(term3679, 0, 'i');
        setField(term3677, term3677.getClass(), "buffer", term3679);
        setIntField(term3677, term3677.getClass(), "pos", -2063843486);
        setIntField(term3677, term3677.getClass(), "limit", 833762980);
        setIntField(term3677, term3677.getClass(), "lineNumber", 320711637);
        setIntField(term3677, term3677.getClass(), "lineStart", 1241164745);
        setIntField(term3677, term3677.getClass(), "peeked", 1723148410);
        setLongField(term3677, term3677.getClass(), "peekedLong", -4365849114644724155L);
        setIntField(term3677, term3677.getClass(), "peekedNumberLength", -920797484);
        setField(term3677, term3677.getClass(), "peekedString", "AdxvLJhNLe");
        setIntElement(term3700, 0, -1631697577);
        setIntElement(term3700, 1, 765731371);
        setIntElement(term3700, 2, -1703035419);
        setIntElement(term3700, 3, 765766290);
        setIntElement(term3700, 4, -1284825282);
        setField(term3677, term3677.getClass(), "stack", term3700);
        setIntField(term3677, term3677.getClass(), "stackSize", -1941343035);
        setElement(term3707, 0, "lHfTrWKMPk");
        setElement(term3707, 1, "JDaAnsVTGV");
        setElement(term3707, 2, "mLUZFTfjle");
        setField(term3677, term3677.getClass(), "pathNames", term3707);
        setIntElement(term3744, 0, 947897214);
        setIntElement(term3744, 1, 1496340209);
        setIntElement(term3744, 2, -1748391876);
        setIntElement(term3744, 3, 43258317);
        setIntElement(term3744, 4, 1707220033);
        setIntElement(term3744, 5, -1792504217);
        setIntElement(term3744, 6, 1824538861);
        setIntElement(term3744, 7, 499519708);
        setIntElement(term3744, 8, 1501165033);
        setField(term3677, term3677.getClass(), "pathIndices", term3744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term3677, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


