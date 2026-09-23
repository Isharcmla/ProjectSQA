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

public class JsonReader_isLenient_75341454640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term6309;

    public JsonReader_isLenient_75341454640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term133 = (char[]) newCharArray(1);
        int[] term154 = (int[]) newIntArray(6);
        Object[] term162 = (Object[]) newArray("java.lang.String", 2);
        int[] term187 = (int[]) newIntArray(6);
        setField(term131, term131.getClass(), "in", null);
        setBooleanField(term131, term131.getClass(), "lenient", false);
        setCharElement(term133, 0, 'n');
        setField(term131, term131.getClass(), "buffer", term133);
        setIntField(term131, term131.getClass(), "pos", 1048535127);
        setIntField(term131, term131.getClass(), "limit", -655067527);
        setIntField(term131, term131.getClass(), "lineNumber", -6029667);
        setIntField(term131, term131.getClass(), "lineStart", -2068769794);
        setIntField(term131, term131.getClass(), "peeked", -117576464);
        setLongField(term131, term131.getClass(), "peekedLong", 6375119433582206027L);
        setIntField(term131, term131.getClass(), "peekedNumberLength", -1007160944);
        setField(term131, term131.getClass(), "peekedString", "jJCZpVmanW");
        setIntElement(term154, 0, 1135664017);
        setIntElement(term154, 1, 590364439);
        setIntElement(term154, 2, 865208305);
        setIntElement(term154, 3, -1275173084);
        setIntElement(term154, 4, -244121226);
        setIntElement(term154, 5, -203030934);
        setField(term131, term131.getClass(), "stack", term154);
        setIntField(term131, term131.getClass(), "stackSize", -1179120542);
        setElement(term162, 0, "EGtDIRbSSb");
        setElement(term162, 1, "SzjVpOQTyS");
        setField(term131, term131.getClass(), "pathNames", term162);
        setIntElement(term187, 0, -73683645);
        setIntElement(term187, 1, -226514366);
        setIntElement(term187, 2, 1193880199);
        setIntElement(term187, 3, -1087774327);
        setIntElement(term187, 4, -1530420153);
        setIntElement(term187, 5, -469968304);
        setField(term131, term131.getClass(), "pathIndices", term187);
        term6309 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term6310 = (char[]) newCharArray(1);
        int[] term6313 = (int[]) newIntArray(6);
        Object[] term6314 = (Object[]) newArray("java.lang.String", 2);
        int[] term6319 = (int[]) newIntArray(6);
        setField(term6309, term6309.getClass(), "in", null);
        setBooleanField(term6309, term6309.getClass(), "lenient", false);
        setCharElement(term6310, 0, 'n');
        setField(term6309, term6309.getClass(), "buffer", term6310);
        setIntField(term6309, term6309.getClass(), "pos", 1048535127);
        setIntField(term6309, term6309.getClass(), "limit", -655067527);
        setIntField(term6309, term6309.getClass(), "lineNumber", -6029667);
        setIntField(term6309, term6309.getClass(), "lineStart", -2068769794);
        setIntField(term6309, term6309.getClass(), "peeked", -117576464);
        setLongField(term6309, term6309.getClass(), "peekedLong", 6375119433582206027L);
        setIntField(term6309, term6309.getClass(), "peekedNumberLength", -1007160944);
        setField(term6309, term6309.getClass(), "peekedString", "jJCZpVmanW");
        setIntElement(term6313, 0, 1135664017);
        setIntElement(term6313, 1, 590364439);
        setIntElement(term6313, 2, 865208305);
        setIntElement(term6313, 3, -1275173084);
        setIntElement(term6313, 4, -244121226);
        setIntElement(term6313, 5, -203030934);
        setField(term6309, term6309.getClass(), "stack", term6313);
        setIntField(term6309, term6309.getClass(), "stackSize", -1179120542);
        setElement(term6314, 0, "EGtDIRbSSb");
        setElement(term6314, 1, "SzjVpOQTyS");
        setField(term6309, term6309.getClass(), "pathNames", term6314);
        setIntElement(term6319, 0, -73683645);
        setIntElement(term6319, 1, -226514366);
        setIntElement(term6319, 2, 1193880199);
        setIntElement(term6319, 3, -1087774327);
        setIntElement(term6319, 4, -1530420153);
        setIntElement(term6319, 5, -469968304);
        setField(term6309, term6309.getClass(), "pathIndices", term6319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLenient", argTypes, term131, args);
        assertTrue(recursiveEquals(term131, term6309));
    }

};


