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

public class JsonTreeReader_nextInt_140918392616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3915;

    public JsonTreeReader_nextInt_140918392616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3915 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term3916 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term3965 = (Object[]) newArray("java.lang.String", 2);
        int[] term3990 = (int[]) newIntArray(5);
        char[] term3938 = (char[]) newCharArray(3);
        int[] term3961 = (int[]) newIntArray(2);
        setField(term3915, term3915.getClass(), "stack", term3916);
        setIntField(term3915, term3915.getClass(), "stackSize", 1272542218);
        setElement(term3965, 0, "hMmaoREuCK");
        setElement(term3965, 1, "VeDtgDzGAN");
        setField(term3915, term3915.getClass(), "pathNames", term3965);
        setIntElement(term3990, 0, 1209799204);
        setIntElement(term3990, 1, 1094107751);
        setIntElement(term3990, 2, 844222656);
        setIntElement(term3990, 3, -18216811);
        setIntElement(term3990, 4, -1813280137);
        setField(term3915, term3915.getClass(), "pathIndices", term3990);
        setField(term3915, term3915.getClass(), "in", null);
        setBooleanField(term3915, term3915.getClass(), "lenient", false);
        setCharElement(term3938, 0, 'V');
        setCharElement(term3938, 1, 'p');
        setCharElement(term3938, 2, 'O');
        setField(term3915, term3915.getClass(), "buffer", term3938);
        setIntField(term3915, term3915.getClass(), "pos", -2005784375);
        setIntField(term3915, term3915.getClass(), "limit", -288604325);
        setIntField(term3915, term3915.getClass(), "lineNumber", -1268314569);
        setIntField(term3915, term3915.getClass(), "lineStart", 877649659);
        setIntField(term3915, term3915.getClass(), "peeked", -1332748804);
        setLongField(term3915, term3915.getClass(), "peekedLong", -872011222785455006L);
        setIntField(term3915, term3915.getClass(), "peekedNumberLength", 1774507971);
        setField(term3915, term3915.getClass(), "peekedString", "HWkpTmtlrc");
        setIntElement(term3961, 0, -1420269858);
        setIntElement(term3961, 1, -2119545015);
        setField(term3915, term3915.getClass(), "stack", term3961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextInt", argTypes, term3915, args);
    }

};


