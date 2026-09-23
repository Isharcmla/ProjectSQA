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

public class JsonReader_getColumnNumber_63738922668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4229;
     Object term15279;

    public JsonReader_getColumnNumber_63738922668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4229 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4231 = (char[]) newCharArray(4);
        int[] term4255 = (int[]) newIntArray(8);
        Object[] term4265 = (Object[]) newArray("java.lang.String", 0);
        int[] term4266 = (int[]) newIntArray(5);
        setField(term4229, term4229.getClass(), "in", null);
        setBooleanField(term4229, term4229.getClass(), "lenient", true);
        setCharElement(term4231, 0, 'L');
        setCharElement(term4231, 1, 'Q');
        setCharElement(term4231, 2, 'F');
        setCharElement(term4231, 3, 'p');
        setField(term4229, term4229.getClass(), "buffer", term4231);
        setIntField(term4229, term4229.getClass(), "pos", 319853052);
        setIntField(term4229, term4229.getClass(), "limit", -1097563716);
        setIntField(term4229, term4229.getClass(), "lineNumber", 1572907769);
        setIntField(term4229, term4229.getClass(), "lineStart", 1608016787);
        setIntField(term4229, term4229.getClass(), "peeked", -516303035);
        setLongField(term4229, term4229.getClass(), "peekedLong", 1967728129628047933L);
        setIntField(term4229, term4229.getClass(), "peekedNumberLength", -2143043890);
        setField(term4229, term4229.getClass(), "peekedString", "LWyEaeIyAo");
        setIntElement(term4255, 0, -2138825831);
        setIntElement(term4255, 1, 1454781562);
        setIntElement(term4255, 2, -27944011);
        setIntElement(term4255, 3, -20614472);
        setIntElement(term4255, 4, 1126618861);
        setIntElement(term4255, 5, 947449400);
        setIntElement(term4255, 6, -763799087);
        setIntElement(term4255, 7, 1207142014);
        setField(term4229, term4229.getClass(), "stack", term4255);
        setIntField(term4229, term4229.getClass(), "stackSize", -876426634);
        setField(term4229, term4229.getClass(), "pathNames", term4265);
        setIntElement(term4266, 0, 213831054);
        setIntElement(term4266, 1, 330043745);
        setIntElement(term4266, 2, -509349195);
        setIntElement(term4266, 3, -1639041228);
        setIntElement(term4266, 4, 2027686272);
        setField(term4229, term4229.getClass(), "pathIndices", term4266);
        term15279 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term15280 = (char[]) newCharArray(4);
        int[] term15283 = (int[]) newIntArray(8);
        Object[] term15284 = (Object[]) newArray("java.lang.String", 0);
        int[] term15285 = (int[]) newIntArray(5);
        setField(term15279, term15279.getClass(), "in", null);
        setBooleanField(term15279, term15279.getClass(), "lenient", true);
        setCharElement(term15280, 0, 'L');
        setCharElement(term15280, 1, 'Q');
        setCharElement(term15280, 2, 'F');
        setCharElement(term15280, 3, 'p');
        setField(term15279, term15279.getClass(), "buffer", term15280);
        setIntField(term15279, term15279.getClass(), "pos", 319853052);
        setIntField(term15279, term15279.getClass(), "limit", -1097563716);
        setIntField(term15279, term15279.getClass(), "lineNumber", 1572907769);
        setIntField(term15279, term15279.getClass(), "lineStart", 1608016787);
        setIntField(term15279, term15279.getClass(), "peeked", -516303035);
        setLongField(term15279, term15279.getClass(), "peekedLong", 1967728129628047933L);
        setIntField(term15279, term15279.getClass(), "peekedNumberLength", -2143043890);
        setField(term15279, term15279.getClass(), "peekedString", "LWyEaeIyAo");
        setIntElement(term15283, 0, -2138825831);
        setIntElement(term15283, 1, 1454781562);
        setIntElement(term15283, 2, -27944011);
        setIntElement(term15283, 3, -20614472);
        setIntElement(term15283, 4, 1126618861);
        setIntElement(term15283, 5, 947449400);
        setIntElement(term15283, 6, -763799087);
        setIntElement(term15283, 7, 1207142014);
        setField(term15279, term15279.getClass(), "stack", term15283);
        setIntField(term15279, term15279.getClass(), "stackSize", -876426634);
        setField(term15279, term15279.getClass(), "pathNames", term15284);
        setIntElement(term15285, 0, 213831054);
        setIntElement(term15285, 1, 330043745);
        setIntElement(term15285, 2, -509349195);
        setIntElement(term15285, 3, -1639041228);
        setIntElement(term15285, 4, 2027686272);
        setField(term15279, term15279.getClass(), "pathIndices", term15285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnNumber", argTypes, term4229, args);
        assertTrue(recursiveEquals(term4229, term15279));
        assertTrue(recursiveEquals(retValue, -1288163734));
    }

};


