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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;

public class JsonReader_skipQuotedValue_213289487959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3203;
     Object term3313;

    public JsonReader_skipQuotedValue_213289487959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3203 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term3205 = (char[]) newCharArray(7);
        int[] term3232 = (int[]) newIntArray(1);
        Object[] term3235 = (Object[]) newArray("java.lang.String", 6);
        int[] term3308 = (int[]) newIntArray(4);
        setField(term3203, term3203.getClass(), "in", null);
        setBooleanField(term3203, term3203.getClass(), "lenient", true);
        setCharElement(term3205, 0, 's');
        setCharElement(term3205, 1, 'Y');
        setCharElement(term3205, 2, 'G');
        setCharElement(term3205, 3, 'g');
        setCharElement(term3205, 4, 'n');
        setCharElement(term3205, 5, 'e');
        setCharElement(term3205, 6, 'N');
        setField(term3203, term3203.getClass(), "buffer", term3205);
        setIntField(term3203, term3203.getClass(), "pos", 877649659);
        setIntField(term3203, term3203.getClass(), "limit", -1332748804);
        setIntField(term3203, term3203.getClass(), "lineNumber", 1774507971);
        setIntField(term3203, term3203.getClass(), "lineStart", -1420269858);
        setIntField(term3203, term3203.getClass(), "peeked", -2119545015);
        setLongField(term3203, term3203.getClass(), "peekedLong", 8428634514691209827L);
        setIntField(term3203, term3203.getClass(), "peekedNumberLength", 1272542218);
        setField(term3203, term3203.getClass(), "peekedString", "fztQhjqwdP");
        setIntElement(term3232, 0, 1209799204);
        setField(term3203, term3203.getClass(), "stack", term3232);
        setIntField(term3203, term3203.getClass(), "stackSize", 1094107751);
        setElement(term3235, 0, "eVpkWxjuki");
        setElement(term3235, 1, "SJiQaLvSKv");
        setElement(term3235, 2, "OEXDRUKcFl");
        setElement(term3235, 3, "RYdKCNNMBR");
        setElement(term3235, 4, "yGtHPyvYiQ");
        setElement(term3235, 5, "MvRIxilFMJ");
        setField(term3203, term3203.getClass(), "pathNames", term3235);
        setIntElement(term3308, 0, 844222656);
        setIntElement(term3308, 1, -18216811);
        setIntElement(term3308, 2, -1813280137);
        setIntElement(term3308, 3, 719656595);
        setField(term3203, term3203.getClass(), "pathIndices", term3308);
        term3313 = new Character('R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term3313;
        try {
            callMethod(klass, "skipQuotedValue", argTypes, term3203, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


