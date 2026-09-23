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

public class JsonReader_peek_161933219846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1197;

    public JsonReader_peek_161933219846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1197 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1199 = (char[]) newCharArray(7);
        int[] term1226 = (int[]) newIntArray(2);
        Object[] term1230 = (Object[]) newArray("java.lang.String", 6);
        int[] term1303 = (int[]) newIntArray(6);
        setField(term1197, term1197.getClass(), "in", null);
        setBooleanField(term1197, term1197.getClass(), "lenient", false);
        setCharElement(term1199, 0, 'Q');
        setCharElement(term1199, 1, 'H');
        setCharElement(term1199, 2, 'g');
        setCharElement(term1199, 3, 'q');
        setCharElement(term1199, 4, 'z');
        setCharElement(term1199, 5, 'x');
        setCharElement(term1199, 6, 'x');
        setField(term1197, term1197.getClass(), "buffer", term1199);
        setIntField(term1197, term1197.getClass(), "pos", 691577392);
        setIntField(term1197, term1197.getClass(), "limit", -893623680);
        setIntField(term1197, term1197.getClass(), "lineNumber", -1963434938);
        setIntField(term1197, term1197.getClass(), "lineStart", 906181092);
        setIntField(term1197, term1197.getClass(), "peeked", 1045657203);
        setLongField(term1197, term1197.getClass(), "peekedLong", 6811161968424632369L);
        setIntField(term1197, term1197.getClass(), "peekedNumberLength", 1386130016);
        setField(term1197, term1197.getClass(), "peekedString", "hxCBltsObl");
        setIntElement(term1226, 0, 1072005683);
        setIntElement(term1226, 1, 1861318859);
        setField(term1197, term1197.getClass(), "stack", term1226);
        setIntField(term1197, term1197.getClass(), "stackSize", 1474524152);
        setElement(term1230, 0, "BndsHwAFMv");
        setElement(term1230, 1, "GzFkzHGYFt");
        setElement(term1230, 2, "tShwQLRGNe");
        setElement(term1230, 3, "LvtrsXUliU");
        setElement(term1230, 4, "xLbjWUgOIL");
        setElement(term1230, 5, "jDtqGUpnZN");
        setField(term1197, term1197.getClass(), "pathNames", term1230);
        setIntElement(term1303, 0, 568954359);
        setIntElement(term1303, 1, 53410913);
        setIntElement(term1303, 2, -375014958);
        setIntElement(term1303, 3, 1107176718);
        setIntElement(term1303, 4, 480137250);
        setIntElement(term1303, 5, -341152642);
        setField(term1197, term1197.getClass(), "pathIndices", term1303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "peek", argTypes, term1197, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


