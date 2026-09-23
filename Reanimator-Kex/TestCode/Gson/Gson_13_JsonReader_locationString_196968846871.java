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

public class JsonReader_locationString_196968846871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4757;
     Object term16430;

    public JsonReader_locationString_196968846871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4757 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4759 = (char[]) newCharArray(0);
        int[] term4779 = (int[]) newIntArray(5);
        Object[] term4786 = (Object[]) newArray("java.lang.String", 6);
        int[] term4859 = (int[]) newIntArray(0);
        setField(term4757, term4757.getClass(), "in", null);
        setBooleanField(term4757, term4757.getClass(), "lenient", false);
        setField(term4757, term4757.getClass(), "buffer", term4759);
        setIntField(term4757, term4757.getClass(), "pos", 612177768);
        setIntField(term4757, term4757.getClass(), "limit", -1626451656);
        setIntField(term4757, term4757.getClass(), "lineNumber", 173952451);
        setIntField(term4757, term4757.getClass(), "lineStart", -1972033388);
        setIntField(term4757, term4757.getClass(), "peeked", -1005024758);
        setLongField(term4757, term4757.getClass(), "peekedLong", 5262507301787091109L);
        setIntField(term4757, term4757.getClass(), "peekedNumberLength", 2634669);
        setField(term4757, term4757.getClass(), "peekedString", "HHmNoYxIGj");
        setIntElement(term4779, 0, -1912429941);
        setIntElement(term4779, 1, 1801052257);
        setIntElement(term4779, 2, -2110556060);
        setIntElement(term4779, 3, 313459791);
        setIntElement(term4779, 4, 752615112);
        setField(term4757, term4757.getClass(), "stack", term4779);
        setIntField(term4757, term4757.getClass(), "stackSize", -1674430871);
        setElement(term4786, 0, "PtirvZmsGt");
        setElement(term4786, 1, "HWkpTmtlrc");
        setElement(term4786, 2, "hMmaoREuCK");
        setElement(term4786, 3, "VeDtgDzGAN");
        setElement(term4786, 4, "aWYOWZFyaX");
        setElement(term4786, 5, "BRIVNtfUWU");
        setField(term4757, term4757.getClass(), "pathNames", term4786);
        setField(term4757, term4757.getClass(), "pathIndices", term4859);
        term16430 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term16431 = (char[]) newCharArray(0);
        int[] term16434 = (int[]) newIntArray(5);
        Object[] term16435 = (Object[]) newArray("java.lang.String", 6);
        int[] term16448 = (int[]) newIntArray(0);
        setField(term16430, term16430.getClass(), "in", null);
        setBooleanField(term16430, term16430.getClass(), "lenient", false);
        setField(term16430, term16430.getClass(), "buffer", term16431);
        setIntField(term16430, term16430.getClass(), "pos", 612177768);
        setIntField(term16430, term16430.getClass(), "limit", -1626451656);
        setIntField(term16430, term16430.getClass(), "lineNumber", 173952451);
        setIntField(term16430, term16430.getClass(), "lineStart", -1972033388);
        setIntField(term16430, term16430.getClass(), "peeked", -1005024758);
        setLongField(term16430, term16430.getClass(), "peekedLong", 5262507301787091109L);
        setIntField(term16430, term16430.getClass(), "peekedNumberLength", 2634669);
        setField(term16430, term16430.getClass(), "peekedString", "HHmNoYxIGj");
        setIntElement(term16434, 0, -1912429941);
        setIntElement(term16434, 1, 1801052257);
        setIntElement(term16434, 2, -2110556060);
        setIntElement(term16434, 3, 313459791);
        setIntElement(term16434, 4, 752615112);
        setField(term16430, term16430.getClass(), "stack", term16434);
        setIntField(term16430, term16430.getClass(), "stackSize", -1674430871);
        setElement(term16435, 0, "PtirvZmsGt");
        setElement(term16435, 1, "HWkpTmtlrc");
        setElement(term16435, 2, "hMmaoREuCK");
        setElement(term16435, 3, "VeDtgDzGAN");
        setElement(term16435, 4, "aWYOWZFyaX");
        setElement(term16435, 5, "BRIVNtfUWU");
        setField(term16430, term16430.getClass(), "pathNames", term16435);
        setField(term16430, term16430.getClass(), "pathIndices", term16448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term4757, args);
        assertTrue(recursiveEquals(term4757, term16430));
        assertTrue(recursiveEquals(retValue, " at line 173952452 column -1710756139 path $"));
    }

};


