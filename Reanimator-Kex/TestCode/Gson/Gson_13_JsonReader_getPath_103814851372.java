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

public class JsonReader_getPath_103814851372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4935;
     Object term16787;

    public JsonReader_getPath_103814851372() {
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
        term16787 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term16788 = (char[]) newCharArray(3);
        int[] term16791 = (int[]) newIntArray(1);
        Object[] term16792 = (Object[]) newArray("java.lang.String", 9);
        int[] term16811 = (int[]) newIntArray(2);
        setField(term16787, term16787.getClass(), "in", null);
        setBooleanField(term16787, term16787.getClass(), "lenient", true);
        setCharElement(term16788, 0, 'B');
        setCharElement(term16788, 1, 'a');
        setCharElement(term16788, 2, 'J');
        setField(term16787, term16787.getClass(), "buffer", term16788);
        setIntField(term16787, term16787.getClass(), "pos", 299791142);
        setIntField(term16787, term16787.getClass(), "limit", 1862191391);
        setIntField(term16787, term16787.getClass(), "lineNumber", 1131398807);
        setIntField(term16787, term16787.getClass(), "lineStart", -344907703);
        setIntField(term16787, term16787.getClass(), "peeked", 824341437);
        setLongField(term16787, term16787.getClass(), "peekedLong", -6823727938421990489L);
        setIntField(term16787, term16787.getClass(), "peekedNumberLength", -1794965320);
        setField(term16787, term16787.getClass(), "peekedString", "DbiCVtPPCT");
        setIntElement(term16791, 0, 520504102);
        setField(term16787, term16787.getClass(), "stack", term16791);
        setIntField(term16787, term16787.getClass(), "stackSize", -457396133);
        setElement(term16792, 0, "WzFopsaDuG");
        setElement(term16792, 1, "PapWxkhEWe");
        setElement(term16792, 2, "smnHEqRFRx");
        setElement(term16792, 3, "XYtryyobou");
        setElement(term16792, 4, "OYbzXylRWW");
        setElement(term16792, 5, "DSNsTGYXDF");
        setElement(term16792, 6, "sQvGcVjdEx");
        setElement(term16792, 7, "rLHAoqXgPh");
        setElement(term16792, 8, "zUlRdimJtU");
        setField(term16787, term16787.getClass(), "pathNames", term16792);
        setIntElement(term16811, 0, -1793950607);
        setIntElement(term16811, 1, 1091954101);
        setField(term16787, term16787.getClass(), "pathIndices", term16811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term4935, args);
        assertTrue(recursiveEquals(term4935, term16787));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


