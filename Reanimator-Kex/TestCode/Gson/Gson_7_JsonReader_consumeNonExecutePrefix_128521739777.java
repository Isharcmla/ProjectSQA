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

public class JsonReader_consumeNonExecutePrefix_128521739777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5681;

    public JsonReader_consumeNonExecutePrefix_128521739777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5681 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term5683 = (char[]) newCharArray(7);
        int[] term5710 = (int[]) newIntArray(5);
        Object[] term5717 = (Object[]) newArray("java.lang.String", 2);
        int[] term5742 = (int[]) newIntArray(6);
        setField(term5681, term5681.getClass(), "in", null);
        setBooleanField(term5681, term5681.getClass(), "lenient", false);
        setCharElement(term5683, 0, 'b');
        setCharElement(term5683, 1, 'c');
        setCharElement(term5683, 2, 'd');
        setCharElement(term5683, 3, 'z');
        setCharElement(term5683, 4, 'j');
        setCharElement(term5683, 5, 'I');
        setCharElement(term5683, 6, 'f');
        setField(term5681, term5681.getClass(), "buffer", term5683);
        setIntField(term5681, term5681.getClass(), "pos", -558146961);
        setIntField(term5681, term5681.getClass(), "limit", 1505480070);
        setIntField(term5681, term5681.getClass(), "lineNumber", -829088844);
        setIntField(term5681, term5681.getClass(), "lineStart", -31751777);
        setIntField(term5681, term5681.getClass(), "peeked", -246967963);
        setLongField(term5681, term5681.getClass(), "peekedLong", 1439298019805881866L);
        setIntField(term5681, term5681.getClass(), "peekedNumberLength", -1777140369);
        setField(term5681, term5681.getClass(), "peekedString", "lFRJFUMVbx");
        setIntElement(term5710, 0, 993627098);
        setIntElement(term5710, 1, 872295704);
        setIntElement(term5710, 2, 86041387);
        setIntElement(term5710, 3, 1010721666);
        setIntElement(term5710, 4, 27043781);
        setField(term5681, term5681.getClass(), "stack", term5710);
        setIntField(term5681, term5681.getClass(), "stackSize", -1367122405);
        setElement(term5717, 0, "sZdUNdggUW");
        setElement(term5717, 1, "OqbwYQfvAe");
        setField(term5681, term5681.getClass(), "pathNames", term5717);
        setIntElement(term5742, 0, -1703625118);
        setIntElement(term5742, 1, 1104108112);
        setIntElement(term5742, 2, 1648665618);
        setIntElement(term5742, 3, 633765954);
        setIntElement(term5742, 4, 269110087);
        setIntElement(term5742, 5, 1545119095);
        setField(term5681, term5681.getClass(), "pathIndices", term5742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeNonExecutePrefix", argTypes, term5681, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


