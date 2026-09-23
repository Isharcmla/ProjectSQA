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
import java.lang.AssertionError;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_beginArray_88159322141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;

    public JsonReader_beginArray_88159322141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term239 = (char[]) newCharArray(7);
        int[] term266 = (int[]) newIntArray(1);
        Object[] term269 = (Object[]) newArray("java.lang.String", 6);
        int[] term342 = (int[]) newIntArray(5);
        setField(term237, term237.getClass(), "in", null);
        setBooleanField(term237, term237.getClass(), "lenient", false);
        setCharElement(term239, 0, 'Z');
        setCharElement(term239, 1, 't');
        setCharElement(term239, 2, 'T');
        setCharElement(term239, 3, 'D');
        setCharElement(term239, 4, 's');
        setCharElement(term239, 5, 'j');
        setCharElement(term239, 6, 'l');
        setField(term237, term237.getClass(), "buffer", term239);
        setIntField(term237, term237.getClass(), "pos", 1962444399);
        setIntField(term237, term237.getClass(), "limit", 767834723);
        setIntField(term237, term237.getClass(), "lineNumber", -602026508);
        setIntField(term237, term237.getClass(), "lineStart", -157887805);
        setIntField(term237, term237.getClass(), "peeked", 1876565163);
        setLongField(term237, term237.getClass(), "peekedLong", -8257434502486459194L);
        setIntField(term237, term237.getClass(), "peekedNumberLength", -817164822);
        setField(term237, term237.getClass(), "peekedString", "MjGYSRKTNF");
        setIntElement(term266, 0, -1016503459);
        setField(term237, term237.getClass(), "stack", term266);
        setIntField(term237, term237.getClass(), "stackSize", -1968847291);
        setElement(term269, 0, "hRNSzYYIrc");
        setElement(term269, 1, "RMFIsYGgne");
        setElement(term269, 2, "NRdvgJlhkX");
        setElement(term269, 3, "uuaPigETmJ");
        setElement(term269, 4, "MxlszYVzRf");
        setElement(term269, 5, "LQFpaHEwXR");
        setField(term237, term237.getClass(), "pathNames", term269);
        setIntElement(term342, 0, 579005622);
        setIntElement(term342, 1, -14890619);
        setIntElement(term342, 2, 1632125673);
        setIntElement(term342, 3, 454281060);
        setIntElement(term342, 4, -1786399638);
        setField(term237, term237.getClass(), "pathIndices", term342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginArray", argTypes, term237, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


