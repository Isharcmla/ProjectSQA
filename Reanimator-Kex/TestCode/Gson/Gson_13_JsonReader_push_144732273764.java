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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class JsonReader_push_144732273764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3987;
     Object term4029;

    public JsonReader_push_144732273764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3987 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term3989 = (char[]) newCharArray(4);
        int[] term4013 = (int[]) newIntArray(8);
        Object[] term4023 = (Object[]) newArray("java.lang.String", 0);
        int[] term4024 = (int[]) newIntArray(4);
        setField(term3987, term3987.getClass(), "in", null);
        setBooleanField(term3987, term3987.getClass(), "lenient", false);
        setCharElement(term3989, 0, 'l');
        setCharElement(term3989, 1, 's');
        setCharElement(term3989, 2, 'z');
        setCharElement(term3989, 3, 'Y');
        setField(term3987, term3987.getClass(), "buffer", term3989);
        setIntField(term3987, term3987.getClass(), "pos", -370828664);
        setIntField(term3987, term3987.getClass(), "limit", 1168633950);
        setIntField(term3987, term3987.getClass(), "lineNumber", 1607082164);
        setIntField(term3987, term3987.getClass(), "lineStart", 1890399366);
        setIntField(term3987, term3987.getClass(), "peeked", -1867239125);
        setLongField(term3987, term3987.getClass(), "peekedLong", 7009926388951271268L);
        setIntField(term3987, term3987.getClass(), "peekedNumberLength", 952869601);
        setField(term3987, term3987.getClass(), "peekedString", "gCWtLVKVVe");
        setIntElement(term4013, 0, 91958879);
        setIntElement(term4013, 1, -645429025);
        setIntElement(term4013, 2, -688213483);
        setIntElement(term4013, 3, 644154104);
        setIntElement(term4013, 4, 76650923);
        setIntElement(term4013, 5, 1003743923);
        setIntElement(term4013, 6, 1887772522);
        setIntElement(term4013, 7, 354196060);
        setField(term3987, term3987.getClass(), "stack", term4013);
        setIntField(term3987, term3987.getClass(), "stackSize", -1840305774);
        setField(term3987, term3987.getClass(), "pathNames", term4023);
        setIntElement(term4024, 0, 1365087144);
        setIntElement(term4024, 1, -1537255112);
        setIntElement(term4024, 2, 934477462);
        setIntElement(term4024, 3, 4900410);
        setField(term3987, term3987.getClass(), "pathIndices", term4024);
        term4029 = new Integer(-1252345779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4029;
        try {
            callMethod(klass, "push", argTypes, term3987, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


