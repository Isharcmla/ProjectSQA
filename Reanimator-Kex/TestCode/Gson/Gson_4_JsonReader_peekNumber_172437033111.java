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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_peekNumber_172437033111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1587;

    public JsonReader_peekNumber_172437033111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1587 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1589 = (char[]) newCharArray(4);
        int[] term1613 = (int[]) newIntArray(8);
        Object[] term1623 = (Object[]) newArray("java.lang.String", 6);
        int[] term1696 = (int[]) newIntArray(2);
        setField(term1587, term1587.getClass(), "in", null);
        setBooleanField(term1587, term1587.getClass(), "lenient", true);
        setCharElement(term1589, 0, 's');
        setCharElement(term1589, 1, 'j');
        setCharElement(term1589, 2, 'J');
        setCharElement(term1589, 3, 'C');
        setField(term1587, term1587.getClass(), "buffer", term1589);
        setIntField(term1587, term1587.getClass(), "pos", 628918458);
        setIntField(term1587, term1587.getClass(), "limit", -1274456137);
        setIntField(term1587, term1587.getClass(), "lineNumber", 1041916673);
        setIntField(term1587, term1587.getClass(), "lineStart", -601863069);
        setIntField(term1587, term1587.getClass(), "peeked", 663292551);
        setLongField(term1587, term1587.getClass(), "peekedLong", -2813493605142626659L);
        setIntField(term1587, term1587.getClass(), "peekedNumberLength", -1885090354);
        setField(term1587, term1587.getClass(), "peekedString", "YRHGsAkhxb");
        setIntElement(term1613, 0, -2066804303);
        setIntElement(term1613, 1, -1731761810);
        setIntElement(term1613, 2, 197109649);
        setIntElement(term1613, 3, -1239406390);
        setIntElement(term1613, 4, 1557431527);
        setIntElement(term1613, 5, -1504890659);
        setIntElement(term1613, 6, 1358829571);
        setIntElement(term1613, 7, 991356662);
        setField(term1587, term1587.getClass(), "stack", term1613);
        setIntField(term1587, term1587.getClass(), "stackSize", -506958186);
        setElement(term1623, 0, "ffYhPOzlUs");
        setElement(term1623, 1, "MLqYREekMl");
        setElement(term1623, 2, "ytSBIKXogI");
        setElement(term1623, 3, "nHXjMycHlU");
        setElement(term1623, 4, "ieCtQFdkii");
        setElement(term1623, 5, "dEnhdmILtU");
        setField(term1587, term1587.getClass(), "pathNames", term1623);
        setIntElement(term1696, 0, -507387516);
        setIntElement(term1696, 1, -1970452551);
        setField(term1587, term1587.getClass(), "pathIndices", term1696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peekNumber", argTypes, term1587, args);
    }

};


