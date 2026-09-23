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

public class JsonTreeReader_endObject_12307193204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term721;

    public JsonTreeReader_endObject_12307193204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term721 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term722 = (Object[]) newArray("java.lang.Object", 1);
        Object term723 = newInstance(Class.forName("java.lang.Object"));
        Object[] term872 = (Object[]) newArray("java.lang.String", 5);
        int[] term933 = (int[]) newIntArray(3);
        char[] term839 = (char[]) newCharArray(5);
        int[] term864 = (int[]) newIntArray(6);
        setElement(term722, 0, term723);
        setField(term721, term721.getClass(), "stack", term722);
        setIntField(term721, term721.getClass(), "stackSize", 1540719661);
        setElement(term872, 0, "gGSMzuGICf");
        setElement(term872, 1, "hxCBltsObl");
        setElement(term872, 2, "BndsHwAFMv");
        setElement(term872, 3, "GzFkzHGYFt");
        setElement(term872, 4, "tShwQLRGNe");
        setField(term721, term721.getClass(), "pathNames", term872);
        setIntElement(term933, 0, 1265463001);
        setIntElement(term933, 1, 335112684);
        setIntElement(term933, 2, 1551099402);
        setField(term721, term721.getClass(), "pathIndices", term933);
        setField(term721, term721.getClass(), "in", null);
        setBooleanField(term721, term721.getClass(), "lenient", false);
        setCharElement(term839, 0, 'l');
        setCharElement(term839, 1, 'J');
        setCharElement(term839, 2, 'A');
        setCharElement(term839, 3, 'E');
        setCharElement(term839, 4, 't');
        setField(term721, term721.getClass(), "buffer", term839);
        setIntField(term721, term721.getClass(), "pos", 1596070772);
        setIntField(term721, term721.getClass(), "limit", 97029295);
        setIntField(term721, term721.getClass(), "lineNumber", -1371869594);
        setIntField(term721, term721.getClass(), "lineStart", -2095575670);
        setIntField(term721, term721.getClass(), "peeked", 1225272962);
        setLongField(term721, term721.getClass(), "peekedLong", -8400487765614892086L);
        setIntField(term721, term721.getClass(), "peekedNumberLength", 1324040357);
        setField(term721, term721.getClass(), "peekedString", "UlajhuVLaP");
        setIntElement(term864, 0, -1588772968);
        setIntElement(term864, 1, -93135961);
        setIntElement(term864, 2, -112921587);
        setIntElement(term864, 3, 933028652);
        setIntElement(term864, 4, 287287233);
        setIntElement(term864, 5, 962840079);
        setField(term721, term721.getClass(), "stack", term864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term721, args);
    }

};


