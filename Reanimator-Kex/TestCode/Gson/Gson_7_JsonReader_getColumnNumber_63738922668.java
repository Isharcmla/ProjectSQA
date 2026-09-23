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
     Object term14983;

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
        term14983 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term14984 = (char[]) newCharArray(4);
        int[] term14987 = (int[]) newIntArray(8);
        Object[] term14988 = (Object[]) newArray("java.lang.String", 0);
        int[] term14989 = (int[]) newIntArray(5);
        setField(term14983, term14983.getClass(), "in", null);
        setBooleanField(term14983, term14983.getClass(), "lenient", true);
        setCharElement(term14984, 0, 'L');
        setCharElement(term14984, 1, 'Q');
        setCharElement(term14984, 2, 'F');
        setCharElement(term14984, 3, 'p');
        setField(term14983, term14983.getClass(), "buffer", term14984);
        setIntField(term14983, term14983.getClass(), "pos", 319853052);
        setIntField(term14983, term14983.getClass(), "limit", -1097563716);
        setIntField(term14983, term14983.getClass(), "lineNumber", 1572907769);
        setIntField(term14983, term14983.getClass(), "lineStart", 1608016787);
        setIntField(term14983, term14983.getClass(), "peeked", -516303035);
        setLongField(term14983, term14983.getClass(), "peekedLong", 1967728129628047933L);
        setIntField(term14983, term14983.getClass(), "peekedNumberLength", -2143043890);
        setField(term14983, term14983.getClass(), "peekedString", "LWyEaeIyAo");
        setIntElement(term14987, 0, -2138825831);
        setIntElement(term14987, 1, 1454781562);
        setIntElement(term14987, 2, -27944011);
        setIntElement(term14987, 3, -20614472);
        setIntElement(term14987, 4, 1126618861);
        setIntElement(term14987, 5, 947449400);
        setIntElement(term14987, 6, -763799087);
        setIntElement(term14987, 7, 1207142014);
        setField(term14983, term14983.getClass(), "stack", term14987);
        setIntField(term14983, term14983.getClass(), "stackSize", -876426634);
        setField(term14983, term14983.getClass(), "pathNames", term14988);
        setIntElement(term14989, 0, 213831054);
        setIntElement(term14989, 1, 330043745);
        setIntElement(term14989, 2, -509349195);
        setIntElement(term14989, 3, -1639041228);
        setIntElement(term14989, 4, 2027686272);
        setField(term14983, term14983.getClass(), "pathIndices", term14989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnNumber", argTypes, term4229, args);
        assertTrue(recursiveEquals(term4229, term14983));
        assertTrue(recursiveEquals(retValue, -1288163734));
    }

};


