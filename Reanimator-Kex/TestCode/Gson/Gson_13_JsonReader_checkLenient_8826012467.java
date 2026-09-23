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
import static com.google.gson.stream.EqualityUtils.*;
import java.lang.Object;

public class JsonReader_checkLenient_8826012467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4231;
     Object term15054;

    public JsonReader_checkLenient_8826012467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4231 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4233 = (char[]) newCharArray(4);
        int[] term4257 = (int[]) newIntArray(8);
        Object[] term4267 = (Object[]) newArray("java.lang.String", 0);
        int[] term4268 = (int[]) newIntArray(5);
        setField(term4231, term4231.getClass(), "in", null);
        setBooleanField(term4231, term4231.getClass(), "lenient", true);
        setCharElement(term4233, 0, 'L');
        setCharElement(term4233, 1, 'Q');
        setCharElement(term4233, 2, 'F');
        setCharElement(term4233, 3, 'p');
        setField(term4231, term4231.getClass(), "buffer", term4233);
        setIntField(term4231, term4231.getClass(), "pos", 319853052);
        setIntField(term4231, term4231.getClass(), "limit", -1097563716);
        setIntField(term4231, term4231.getClass(), "lineNumber", 1572907769);
        setIntField(term4231, term4231.getClass(), "lineStart", 1608016787);
        setIntField(term4231, term4231.getClass(), "peeked", -516303035);
        setLongField(term4231, term4231.getClass(), "peekedLong", 1967728129628047933L);
        setIntField(term4231, term4231.getClass(), "peekedNumberLength", -2143043890);
        setField(term4231, term4231.getClass(), "peekedString", "LWyEaeIyAo");
        setIntElement(term4257, 0, -2138825831);
        setIntElement(term4257, 1, 1454781562);
        setIntElement(term4257, 2, -27944011);
        setIntElement(term4257, 3, -20614472);
        setIntElement(term4257, 4, 1126618861);
        setIntElement(term4257, 5, 947449400);
        setIntElement(term4257, 6, -763799087);
        setIntElement(term4257, 7, 1207142014);
        setField(term4231, term4231.getClass(), "stack", term4257);
        setIntField(term4231, term4231.getClass(), "stackSize", -876426634);
        setField(term4231, term4231.getClass(), "pathNames", term4267);
        setIntElement(term4268, 0, 213831054);
        setIntElement(term4268, 1, 330043745);
        setIntElement(term4268, 2, -509349195);
        setIntElement(term4268, 3, -1639041228);
        setIntElement(term4268, 4, 2027686272);
        setField(term4231, term4231.getClass(), "pathIndices", term4268);
        term15054 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term15055 = (char[]) newCharArray(4);
        int[] term15058 = (int[]) newIntArray(8);
        Object[] term15059 = (Object[]) newArray("java.lang.String", 0);
        int[] term15060 = (int[]) newIntArray(5);
        setField(term15054, term15054.getClass(), "in", null);
        setBooleanField(term15054, term15054.getClass(), "lenient", true);
        setCharElement(term15055, 0, 'L');
        setCharElement(term15055, 1, 'Q');
        setCharElement(term15055, 2, 'F');
        setCharElement(term15055, 3, 'p');
        setField(term15054, term15054.getClass(), "buffer", term15055);
        setIntField(term15054, term15054.getClass(), "pos", 319853052);
        setIntField(term15054, term15054.getClass(), "limit", -1097563716);
        setIntField(term15054, term15054.getClass(), "lineNumber", 1572907769);
        setIntField(term15054, term15054.getClass(), "lineStart", 1608016787);
        setIntField(term15054, term15054.getClass(), "peeked", -516303035);
        setLongField(term15054, term15054.getClass(), "peekedLong", 1967728129628047933L);
        setIntField(term15054, term15054.getClass(), "peekedNumberLength", -2143043890);
        setField(term15054, term15054.getClass(), "peekedString", "LWyEaeIyAo");
        setIntElement(term15058, 0, -2138825831);
        setIntElement(term15058, 1, 1454781562);
        setIntElement(term15058, 2, -27944011);
        setIntElement(term15058, 3, -20614472);
        setIntElement(term15058, 4, 1126618861);
        setIntElement(term15058, 5, 947449400);
        setIntElement(term15058, 6, -763799087);
        setIntElement(term15058, 7, 1207142014);
        setField(term15054, term15054.getClass(), "stack", term15058);
        setIntField(term15054, term15054.getClass(), "stackSize", -876426634);
        setField(term15054, term15054.getClass(), "pathNames", term15059);
        setIntElement(term15060, 0, 213831054);
        setIntElement(term15060, 1, 330043745);
        setIntElement(term15060, 2, -509349195);
        setIntElement(term15060, 3, -1639041228);
        setIntElement(term15060, 4, 2027686272);
        setField(term15054, term15054.getClass(), "pathIndices", term15060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkLenient", argTypes, term4231, args);
        assertTrue(recursiveEquals(term4231, term15054));
    }

};


