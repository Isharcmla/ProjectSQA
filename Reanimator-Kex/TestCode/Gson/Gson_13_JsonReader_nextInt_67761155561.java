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

public class JsonReader_nextInt_67761155561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3477;

    public JsonReader_nextInt_67761155561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3477 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term3479 = (char[]) newCharArray(6);
        int[] term3505 = (int[]) newIntArray(8);
        Object[] term3515 = (Object[]) newArray("java.lang.String", 6);
        int[] term3588 = (int[]) newIntArray(2);
        setField(term3477, term3477.getClass(), "in", null);
        setBooleanField(term3477, term3477.getClass(), "lenient", true);
        setCharElement(term3479, 0, 'k');
        setCharElement(term3479, 1, 'X');
        setCharElement(term3479, 2, 'u');
        setCharElement(term3479, 3, 'u');
        setCharElement(term3479, 4, 'a');
        setCharElement(term3479, 5, 'P');
        setField(term3477, term3477.getClass(), "buffer", term3479);
        setIntField(term3477, term3477.getClass(), "pos", 1023209512);
        setIntField(term3477, term3477.getClass(), "limit", 1084849225);
        setIntField(term3477, term3477.getClass(), "lineNumber", -1702055571);
        setIntField(term3477, term3477.getClass(), "lineStart", -944542900);
        setIntField(term3477, term3477.getClass(), "peeked", 2063762142);
        setLongField(term3477, term3477.getClass(), "peekedLong", 8059786003080744426L);
        setIntField(term3477, term3477.getClass(), "peekedNumberLength", 1658391716);
        setField(term3477, term3477.getClass(), "peekedString", "XylxrMBraH");
        setIntElement(term3505, 0, 2143282300);
        setIntElement(term3505, 1, 1137624258);
        setIntElement(term3505, 2, 977862393);
        setIntElement(term3505, 3, 301401782);
        setIntElement(term3505, 4, 1988605357);
        setIntElement(term3505, 5, 808203320);
        setIntElement(term3505, 6, -544382127);
        setIntElement(term3505, 7, -1830198043);
        setField(term3477, term3477.getClass(), "stack", term3505);
        setIntField(term3477, term3477.getClass(), "stackSize", -439048495);
        setElement(term3515, 0, "pORebkoRdD");
        setElement(term3515, 1, "mXGCWJDOqA");
        setElement(term3515, 2, "dpNsDgfPso");
        setElement(term3515, 3, "hCWPJQKpdc");
        setElement(term3515, 4, "WzMEhMXkKx");
        setElement(term3515, 5, "XOiDvlDhdc");
        setField(term3477, term3477.getClass(), "pathNames", term3515);
        setIntElement(term3588, 0, -1849105286);
        setIntElement(term3588, 1, 1334483645);
        setField(term3477, term3477.getClass(), "pathIndices", term3588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term3477, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


