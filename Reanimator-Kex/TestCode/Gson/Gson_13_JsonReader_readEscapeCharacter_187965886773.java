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

public class JsonReader_readEscapeCharacter_187965886773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5181;

    public JsonReader_readEscapeCharacter_187965886773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5181 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term5183 = (char[]) newCharArray(3);
        int[] term5206 = (int[]) newIntArray(2);
        Object[] term5210 = (Object[]) newArray("java.lang.String", 5);
        int[] term5271 = (int[]) newIntArray(1);
        setField(term5181, term5181.getClass(), "in", null);
        setBooleanField(term5181, term5181.getClass(), "lenient", true);
        setCharElement(term5183, 0, 'l');
        setCharElement(term5183, 1, 'i');
        setCharElement(term5183, 2, 'e');
        setField(term5181, term5181.getClass(), "buffer", term5183);
        setIntField(term5181, term5181.getClass(), "pos", 732174235);
        setIntField(term5181, term5181.getClass(), "limit", 470895808);
        setIntField(term5181, term5181.getClass(), "lineNumber", 1787325291);
        setIntField(term5181, term5181.getClass(), "lineStart", 1470349147);
        setIntField(term5181, term5181.getClass(), "peeked", -255317272);
        setLongField(term5181, term5181.getClass(), "peekedLong", -484994522244390100L);
        setIntField(term5181, term5181.getClass(), "peekedNumberLength", -706253892);
        setField(term5181, term5181.getClass(), "peekedString", "vwbEQQNQrx");
        setIntElement(term5206, 0, -1341439819);
        setIntElement(term5206, 1, -728760750);
        setField(term5181, term5181.getClass(), "stack", term5206);
        setIntField(term5181, term5181.getClass(), "stackSize", -1617383807);
        setElement(term5210, 0, "xtftXXMbem");
        setElement(term5210, 1, "cudZvLMQon");
        setElement(term5210, 2, "lihXWlGDxk");
        setElement(term5210, 3, "JmcmxoGhIK");
        setElement(term5210, 4, "jXzmYyrnnT");
        setField(term5181, term5181.getClass(), "pathNames", term5210);
        setIntElement(term5271, 0, -1244386281);
        setField(term5181, term5181.getClass(), "pathIndices", term5271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readEscapeCharacter", argTypes, term5181, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


