package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_endArray_2908672202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243;

    public JsonTreeReader_endArray_2908672202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term244 = (Object[]) newArray("java.lang.Object", 6);
        Object term245 = newInstance(Class.forName("java.lang.Object"));
        Object term246 = newInstance(Class.forName("java.lang.Object"));
        Object term247 = newInstance(Class.forName("java.lang.Object"));
        Object term248 = newInstance(Class.forName("java.lang.Object"));
        Object term249 = newInstance(Class.forName("java.lang.Object"));
        Object term250 = newInstance(Class.forName("java.lang.Object"));
        Object[] term373 = (Object[]) newArray("java.lang.String", 5);
        int[] term434 = (int[]) newIntArray(2);
        char[] term340 = (char[]) newCharArray(6);
        int[] term366 = (int[]) newIntArray(5);
        setElement(term244, 0, term245);
        setElement(term244, 1, term246);
        setElement(term244, 2, term247);
        setElement(term244, 3, term248);
        setElement(term244, 4, term249);
        setElement(term244, 5, term250);
        setField(term243, term243.getClass(), "stack", term244);
        setIntField(term243, term243.getClass(), "stackSize", -1179120542);
        setElement(term373, 0, "pCTimMblYc");
        setElement(term373, 1, "hNxWaHcfhY");
        setElement(term373, 2, "RkybSrpybU");
        setElement(term373, 3, "xOEqzGAmDU");
        setElement(term373, 4, "eZFUvlxvGV");
        setField(term243, term243.getClass(), "pathNames", term373);
        setIntElement(term434, 0, -73683645);
        setIntElement(term434, 1, -226514366);
        setField(term243, term243.getClass(), "pathIndices", term434);
        setField(term243, term243.getClass(), "in", null);
        setBooleanField(term243, term243.getClass(), "lenient", false);
        setCharElement(term340, 0, 't');
        setCharElement(term340, 1, 'n');
        setCharElement(term340, 2, 'Z');
        setCharElement(term340, 3, 't');
        setCharElement(term340, 4, 'T');
        setCharElement(term340, 5, 'D');
        setField(term243, term243.getClass(), "buffer", term340);
        setIntField(term243, term243.getClass(), "pos", -655067527);
        setIntField(term243, term243.getClass(), "limit", -6029667);
        setIntField(term243, term243.getClass(), "lineNumber", -2068769794);
        setIntField(term243, term243.getClass(), "lineStart", -117576464);
        setIntField(term243, term243.getClass(), "peeked", -1007160944);
        setLongField(term243, term243.getClass(), "peekedLong", 6375119433582206027L);
        setIntField(term243, term243.getClass(), "peekedNumberLength", 1135664017);
        setField(term243, term243.getClass(), "peekedString", "HyxfbSQYBe");
        setIntElement(term366, 0, 590364439);
        setIntElement(term366, 1, 865208305);
        setIntElement(term366, 2, -1275173084);
        setIntElement(term366, 3, -244121226);
        setIntElement(term366, 4, -203030934);
        setField(term243, term243.getClass(), "stack", term366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endArray", argTypes, term243, args);
    }

};


