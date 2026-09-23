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

public class JsonReader_hasNext_199157150245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1023;
     Object term7849;

    public JsonReader_hasNext_199157150245() {
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
        term7849 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term7850 = (char[]) newCharArray(5);
        int[] term7853 = (int[]) newIntArray(6);
        Object[] term7854 = (Object[]) newArray("java.lang.String", 5);
        int[] term7865 = (int[]) newIntArray(3);
        setField(term7849, term7849.getClass(), "in", null);
        setBooleanField(term7849, term7849.getClass(), "lenient", true);
        setCharElement(term7850, 0, 'M');
        setCharElement(term7850, 1, 'u');
        setCharElement(term7850, 2, 'L');
        setCharElement(term7850, 3, 'c');
        setCharElement(term7850, 4, 'g');
        setField(term7849, term7849.getClass(), "buffer", term7850);
        setIntField(term7849, term7849.getClass(), "pos", -1263114719);
        setIntField(term7849, term7849.getClass(), "limit", -894662986);
        setIntField(term7849, term7849.getClass(), "lineNumber", 304775596);
        setIntField(term7849, term7849.getClass(), "lineStart", -1347665717);
        setIntField(term7849, term7849.getClass(), "peeked", -1888585309);
        setLongField(term7849, term7849.getClass(), "peekedLong", 4872422362414183754L);
        setIntField(term7849, term7849.getClass(), "peekedNumberLength", 683666002);
        setField(term7849, term7849.getClass(), "peekedString", "IDCWpPLRkE");
        setIntElement(term7853, 0, 1596213415);
        setIntElement(term7853, 1, -268815336);
        setIntElement(term7853, 2, -1210583429);
        setIntElement(term7853, 3, -663691365);
        setIntElement(term7853, 4, 339854490);
        setIntElement(term7853, 5, -615654495);
        setField(term7849, term7849.getClass(), "stack", term7853);
        setIntField(term7849, term7849.getClass(), "stackSize", -1476117762);
        setElement(term7854, 0, "nyiiPDVjAc");
        setElement(term7854, 1, "aKnKipADSo");
        setElement(term7854, 2, "wSQxaModmm");
        setElement(term7854, 3, "UlajhuVLaP");
        setElement(term7854, 4, "gGSMzuGICf");
        setField(term7849, term7849.getClass(), "pathNames", term7854);
        setIntElement(term7865, 0, -341962980);
        setIntElement(term7865, 1, 1532716628);
        setIntElement(term7865, 2, -1801760683);
        setField(term7849, term7849.getClass(), "pathIndices", term7865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasNext", argTypes, term1023, args);
        assertTrue(recursiveEquals(term1023, term7849));
        assertTrue(recursiveEquals(retValue, true));
    }

};


