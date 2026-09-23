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

public class JsonReader_hasNext_199157150246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1023;
     Object term7965;

    public JsonReader_hasNext_199157150246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1023 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1025 = (char[]) newCharArray(5);
        int[] term1050 = (int[]) newIntArray(6);
        Object[] term1058 = (Object[]) newArray("java.lang.String", 5);
        int[] term1119 = (int[]) newIntArray(3);
        setField(term1023, term1023.getClass(), "in", null);
        setBooleanField(term1023, term1023.getClass(), "lenient", true);
        setCharElement(term1025, 0, 'M');
        setCharElement(term1025, 1, 'u');
        setCharElement(term1025, 2, 'L');
        setCharElement(term1025, 3, 'c');
        setCharElement(term1025, 4, 'g');
        setField(term1023, term1023.getClass(), "buffer", term1025);
        setIntField(term1023, term1023.getClass(), "pos", -1263114719);
        setIntField(term1023, term1023.getClass(), "limit", -894662986);
        setIntField(term1023, term1023.getClass(), "lineNumber", 304775596);
        setIntField(term1023, term1023.getClass(), "lineStart", -1347665717);
        setIntField(term1023, term1023.getClass(), "peeked", -1888585309);
        setLongField(term1023, term1023.getClass(), "peekedLong", 4872422362414183754L);
        setIntField(term1023, term1023.getClass(), "peekedNumberLength", 683666002);
        setField(term1023, term1023.getClass(), "peekedString", "IDCWpPLRkE");
        setIntElement(term1050, 0, 1596213415);
        setIntElement(term1050, 1, -268815336);
        setIntElement(term1050, 2, -1210583429);
        setIntElement(term1050, 3, -663691365);
        setIntElement(term1050, 4, 339854490);
        setIntElement(term1050, 5, -615654495);
        setField(term1023, term1023.getClass(), "stack", term1050);
        setIntField(term1023, term1023.getClass(), "stackSize", -1476117762);
        setElement(term1058, 0, "nyiiPDVjAc");
        setElement(term1058, 1, "aKnKipADSo");
        setElement(term1058, 2, "wSQxaModmm");
        setElement(term1058, 3, "UlajhuVLaP");
        setElement(term1058, 4, "gGSMzuGICf");
        setField(term1023, term1023.getClass(), "pathNames", term1058);
        setIntElement(term1119, 0, -341962980);
        setIntElement(term1119, 1, 1532716628);
        setIntElement(term1119, 2, -1801760683);
        setField(term1023, term1023.getClass(), "pathIndices", term1119);
        term7965 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term7966 = (char[]) newCharArray(5);
        int[] term7969 = (int[]) newIntArray(6);
        Object[] term7970 = (Object[]) newArray("java.lang.String", 5);
        int[] term7981 = (int[]) newIntArray(3);
        setField(term7965, term7965.getClass(), "in", null);
        setBooleanField(term7965, term7965.getClass(), "lenient", true);
        setCharElement(term7966, 0, 'M');
        setCharElement(term7966, 1, 'u');
        setCharElement(term7966, 2, 'L');
        setCharElement(term7966, 3, 'c');
        setCharElement(term7966, 4, 'g');
        setField(term7965, term7965.getClass(), "buffer", term7966);
        setIntField(term7965, term7965.getClass(), "pos", -1263114719);
        setIntField(term7965, term7965.getClass(), "limit", -894662986);
        setIntField(term7965, term7965.getClass(), "lineNumber", 304775596);
        setIntField(term7965, term7965.getClass(), "lineStart", -1347665717);
        setIntField(term7965, term7965.getClass(), "peeked", -1888585309);
        setLongField(term7965, term7965.getClass(), "peekedLong", 4872422362414183754L);
        setIntField(term7965, term7965.getClass(), "peekedNumberLength", 683666002);
        setField(term7965, term7965.getClass(), "peekedString", "IDCWpPLRkE");
        setIntElement(term7969, 0, 1596213415);
        setIntElement(term7969, 1, -268815336);
        setIntElement(term7969, 2, -1210583429);
        setIntElement(term7969, 3, -663691365);
        setIntElement(term7969, 4, 339854490);
        setIntElement(term7969, 5, -615654495);
        setField(term7965, term7965.getClass(), "stack", term7969);
        setIntField(term7965, term7965.getClass(), "stackSize", -1476117762);
        setElement(term7970, 0, "nyiiPDVjAc");
        setElement(term7970, 1, "aKnKipADSo");
        setElement(term7970, 2, "wSQxaModmm");
        setElement(term7970, 3, "UlajhuVLaP");
        setElement(term7970, 4, "gGSMzuGICf");
        setField(term7965, term7965.getClass(), "pathNames", term7970);
        setIntElement(term7981, 0, -341962980);
        setIntElement(term7981, 1, 1532716628);
        setIntElement(term7981, 2, -1801760683);
        setField(term7965, term7965.getClass(), "pathIndices", term7981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasNext", argTypes, term1023, args);
        assertTrue(recursiveEquals(term1023, term7965));
        assertTrue(recursiveEquals(retValue, true));
    }

};


