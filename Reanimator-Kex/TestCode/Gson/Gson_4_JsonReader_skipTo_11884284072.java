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

public class JsonReader_skipTo_11884284072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4735;

    public JsonReader_skipTo_11884284072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4735 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4737 = (char[]) newCharArray(0);
        int[] term4757 = (int[]) newIntArray(5);
        Object[] term4764 = (Object[]) newArray("java.lang.String", 6);
        int[] term4837 = (int[]) newIntArray(0);
        setField(term4735, term4735.getClass(), "in", null);
        setBooleanField(term4735, term4735.getClass(), "lenient", false);
        setField(term4735, term4735.getClass(), "buffer", term4737);
        setIntField(term4735, term4735.getClass(), "pos", 612177768);
        setIntField(term4735, term4735.getClass(), "limit", -1626451656);
        setIntField(term4735, term4735.getClass(), "lineNumber", 173952451);
        setIntField(term4735, term4735.getClass(), "lineStart", -1972033388);
        setIntField(term4735, term4735.getClass(), "peeked", -1005024758);
        setLongField(term4735, term4735.getClass(), "peekedLong", 5262507301787091109L);
        setIntField(term4735, term4735.getClass(), "peekedNumberLength", 2634669);
        setField(term4735, term4735.getClass(), "peekedString", "aNWLJdrZMq");
        setIntElement(term4757, 0, -1912429941);
        setIntElement(term4757, 1, 1801052257);
        setIntElement(term4757, 2, -2110556060);
        setIntElement(term4757, 3, 313459791);
        setIntElement(term4757, 4, 752615112);
        setField(term4735, term4735.getClass(), "stack", term4757);
        setIntField(term4735, term4735.getClass(), "stackSize", -1674430871);
        setElement(term4764, 0, "HHmNoYxIGj");
        setElement(term4764, 1, "PtirvZmsGt");
        setElement(term4764, 2, "HWkpTmtlrc");
        setElement(term4764, 3, "hMmaoREuCK");
        setElement(term4764, 4, "VeDtgDzGAN");
        setElement(term4764, 5, "aWYOWZFyaX");
        setField(term4735, term4735.getClass(), "pathNames", term4764);
        setField(term4735, term4735.getClass(), "pathIndices", term4837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BRIVNtfUWU";
        try {
            callMethod(klass, "skipTo", argTypes, term4735, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


