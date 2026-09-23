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

public class JsonReader_consumeNonExecutePrefix_128521739775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5475;

    public JsonReader_consumeNonExecutePrefix_128521739775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5475 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term5477 = (char[]) newCharArray(8);
        int[] term5505 = (int[]) newIntArray(5);
        Object[] term5512 = (Object[]) newArray("java.lang.String", 6);
        int[] term5585 = (int[]) newIntArray(6);
        setField(term5475, term5475.getClass(), "in", null);
        setBooleanField(term5475, term5475.getClass(), "lenient", true);
        setCharElement(term5477, 0, 'G');
        setCharElement(term5477, 1, 'I');
        setCharElement(term5477, 2, 'b');
        setCharElement(term5477, 3, 'n');
        setCharElement(term5477, 4, 'z');
        setCharElement(term5477, 5, 'T');
        setCharElement(term5477, 6, 's');
        setCharElement(term5477, 7, 't');
        setField(term5475, term5475.getClass(), "buffer", term5477);
        setIntField(term5475, term5475.getClass(), "pos", 1163761623);
        setIntField(term5475, term5475.getClass(), "limit", 718742281);
        setIntField(term5475, term5475.getClass(), "lineNumber", 1532723756);
        setIntField(term5475, term5475.getClass(), "lineStart", -124088550);
        setIntField(term5475, term5475.getClass(), "peeked", 777492093);
        setLongField(term5475, term5475.getClass(), "peekedLong", 6617340557564669657L);
        setIntField(term5475, term5475.getClass(), "peekedNumberLength", 1414025609);
        setField(term5475, term5475.getClass(), "peekedString", "ekxGuOYIwi");
        setIntElement(term5505, 0, 255145822);
        setIntElement(term5505, 1, -573608449);
        setIntElement(term5505, 2, -1660057757);
        setIntElement(term5505, 3, 1816273440);
        setIntElement(term5505, 4, -96541009);
        setField(term5475, term5475.getClass(), "stack", term5505);
        setIntField(term5475, term5475.getClass(), "stackSize", -43719302);
        setElement(term5512, 0, "RbVQXSpxXy");
        setElement(term5512, 1, "YpJbIgJWWv");
        setElement(term5512, 2, "JppkknKVOw");
        setElement(term5512, 3, "iljANwuEjk");
        setElement(term5512, 4, "kNqaJKIATy");
        setElement(term5512, 5, "vKQukfbJUd");
        setField(term5475, term5475.getClass(), "pathNames", term5512);
        setIntElement(term5585, 0, 1024134939);
        setIntElement(term5585, 1, 109078154);
        setIntElement(term5585, 2, -314165467);
        setIntElement(term5585, 3, 963694071);
        setIntElement(term5585, 4, -995785731);
        setIntElement(term5585, 5, 1349815364);
        setField(term5475, term5475.getClass(), "pathIndices", term5585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeNonExecutePrefix", argTypes, term5475, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


