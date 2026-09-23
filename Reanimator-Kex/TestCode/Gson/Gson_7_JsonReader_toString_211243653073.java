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

public class JsonReader_toString_211243653073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4935;
     Object term16601;

    public JsonReader_toString_211243653073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4935 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4937 = (char[]) newCharArray(3);
        int[] term4960 = (int[]) newIntArray(1);
        Object[] term4963 = (Object[]) newArray("java.lang.String", 9);
        int[] term5072 = (int[]) newIntArray(2);
        setField(term4935, term4935.getClass(), "in", null);
        setBooleanField(term4935, term4935.getClass(), "lenient", true);
        setCharElement(term4937, 0, 'B');
        setCharElement(term4937, 1, 'a');
        setCharElement(term4937, 2, 'J');
        setField(term4935, term4935.getClass(), "buffer", term4937);
        setIntField(term4935, term4935.getClass(), "pos", 299791142);
        setIntField(term4935, term4935.getClass(), "limit", 1862191391);
        setIntField(term4935, term4935.getClass(), "lineNumber", 1131398807);
        setIntField(term4935, term4935.getClass(), "lineStart", -344907703);
        setIntField(term4935, term4935.getClass(), "peeked", 824341437);
        setLongField(term4935, term4935.getClass(), "peekedLong", -6823727938421990489L);
        setIntField(term4935, term4935.getClass(), "peekedNumberLength", -1794965320);
        setField(term4935, term4935.getClass(), "peekedString", "DbiCVtPPCT");
        setIntElement(term4960, 0, 520504102);
        setField(term4935, term4935.getClass(), "stack", term4960);
        setIntField(term4935, term4935.getClass(), "stackSize", -457396133);
        setElement(term4963, 0, "WzFopsaDuG");
        setElement(term4963, 1, "PapWxkhEWe");
        setElement(term4963, 2, "smnHEqRFRx");
        setElement(term4963, 3, "XYtryyobou");
        setElement(term4963, 4, "OYbzXylRWW");
        setElement(term4963, 5, "DSNsTGYXDF");
        setElement(term4963, 6, "sQvGcVjdEx");
        setElement(term4963, 7, "rLHAoqXgPh");
        setElement(term4963, 8, "zUlRdimJtU");
        setField(term4935, term4935.getClass(), "pathNames", term4963);
        setIntElement(term5072, 0, -1793950607);
        setIntElement(term5072, 1, 1091954101);
        setField(term4935, term4935.getClass(), "pathIndices", term5072);
        term16601 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term16602 = (char[]) newCharArray(3);
        int[] term16605 = (int[]) newIntArray(1);
        Object[] term16606 = (Object[]) newArray("java.lang.String", 9);
        int[] term16625 = (int[]) newIntArray(2);
        setField(term16601, term16601.getClass(), "in", null);
        setBooleanField(term16601, term16601.getClass(), "lenient", true);
        setCharElement(term16602, 0, 'B');
        setCharElement(term16602, 1, 'a');
        setCharElement(term16602, 2, 'J');
        setField(term16601, term16601.getClass(), "buffer", term16602);
        setIntField(term16601, term16601.getClass(), "pos", 299791142);
        setIntField(term16601, term16601.getClass(), "limit", 1862191391);
        setIntField(term16601, term16601.getClass(), "lineNumber", 1131398807);
        setIntField(term16601, term16601.getClass(), "lineStart", -344907703);
        setIntField(term16601, term16601.getClass(), "peeked", 824341437);
        setLongField(term16601, term16601.getClass(), "peekedLong", -6823727938421990489L);
        setIntField(term16601, term16601.getClass(), "peekedNumberLength", -1794965320);
        setField(term16601, term16601.getClass(), "peekedString", "DbiCVtPPCT");
        setIntElement(term16605, 0, 520504102);
        setField(term16601, term16601.getClass(), "stack", term16605);
        setIntField(term16601, term16601.getClass(), "stackSize", -457396133);
        setElement(term16606, 0, "WzFopsaDuG");
        setElement(term16606, 1, "PapWxkhEWe");
        setElement(term16606, 2, "smnHEqRFRx");
        setElement(term16606, 3, "XYtryyobou");
        setElement(term16606, 4, "OYbzXylRWW");
        setElement(term16606, 5, "DSNsTGYXDF");
        setElement(term16606, 6, "sQvGcVjdEx");
        setElement(term16606, 7, "rLHAoqXgPh");
        setElement(term16606, 8, "zUlRdimJtU");
        setField(term16601, term16601.getClass(), "pathNames", term16606);
        setIntElement(term16625, 0, -1793950607);
        setIntElement(term16625, 1, 1091954101);
        setField(term16601, term16601.getClass(), "pathIndices", term16625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term4935, args);
        assertTrue(recursiveEquals(term4935, term16601));
        assertTrue(recursiveEquals(retValue, "JsonReader at line 1131398808 column 644698846"));
    }

};


