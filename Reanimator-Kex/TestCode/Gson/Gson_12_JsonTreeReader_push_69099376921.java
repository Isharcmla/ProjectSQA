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

public class JsonTreeReader_push_69099376921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4897;
     Object term5097;

    public JsonTreeReader_push_69099376921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4897 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term4898 = (Object[]) newArray("java.lang.Object", 8);
        Object term4899 = newInstance(Class.forName("java.lang.Object"));
        Object term4900 = newInstance(Class.forName("java.lang.Object"));
        Object term4901 = newInstance(Class.forName("java.lang.Object"));
        Object term4902 = newInstance(Class.forName("java.lang.Object"));
        Object term4903 = newInstance(Class.forName("java.lang.Object"));
        Object term4904 = newInstance(Class.forName("java.lang.Object"));
        Object term4905 = newInstance(Class.forName("java.lang.Object"));
        Object term4906 = newInstance(Class.forName("java.lang.Object"));
        Object[] term5029 = (Object[]) newArray("java.lang.String", 5);
        int[] term5090 = (int[]) newIntArray(6);
        char[] term4997 = (char[]) newCharArray(2);
        int[] term5019 = (int[]) newIntArray(8);
        setElement(term4898, 0, term4899);
        setElement(term4898, 1, term4900);
        setElement(term4898, 2, term4901);
        setElement(term4898, 3, term4902);
        setElement(term4898, 4, term4903);
        setElement(term4898, 5, term4904);
        setElement(term4898, 6, term4905);
        setElement(term4898, 7, term4906);
        setField(term4897, term4897.getClass(), "stack", term4898);
        setIntField(term4897, term4897.getClass(), "stackSize", 91958879);
        setElement(term5029, 0, "hOncybyCAH");
        setElement(term5029, 1, "QduALnDSVo");
        setElement(term5029, 2, "izPpKDErnQ");
        setElement(term5029, 3, "NnpwZBUTvx");
        setElement(term5029, 4, "tlQSNgTkQX");
        setField(term4897, term4897.getClass(), "pathNames", term5029);
        setIntElement(term5090, 0, -645429025);
        setIntElement(term5090, 1, -688213483);
        setIntElement(term5090, 2, 644154104);
        setIntElement(term5090, 3, 76650923);
        setIntElement(term5090, 4, 1003743923);
        setIntElement(term5090, 5, 1887772522);
        setField(term4897, term4897.getClass(), "pathIndices", term5090);
        setField(term4897, term4897.getClass(), "in", null);
        setBooleanField(term4897, term4897.getClass(), "lenient", true);
        setCharElement(term4997, 0, 'z');
        setCharElement(term4997, 1, 'Y');
        setField(term4897, term4897.getClass(), "buffer", term4997);
        setIntField(term4897, term4897.getClass(), "pos", -97742366);
        setIntField(term4897, term4897.getClass(), "limit", 1638851942);
        setIntField(term4897, term4897.getClass(), "lineNumber", 1374790203);
        setIntField(term4897, term4897.getClass(), "lineStart", 1160010161);
        setIntField(term4897, term4897.getClass(), "peeked", -423900705);
        setLongField(term4897, term4897.getClass(), "peekedLong", 8428634514691209827L);
        setIntField(term4897, term4897.getClass(), "peekedNumberLength", -525570815);
        setField(term4897, term4897.getClass(), "peekedString", "FwPbDZcHmB");
        setIntElement(term5019, 0, 754055848);
        setIntElement(term5019, 1, -19246901);
        setIntElement(term5019, 2, -370828664);
        setIntElement(term5019, 3, 1168633950);
        setIntElement(term5019, 4, 1607082164);
        setIntElement(term5019, 5, 1890399366);
        setIntElement(term5019, 6, -1867239125);
        setIntElement(term5019, 7, 952869601);
        setField(term4897, term4897.getClass(), "stack", term5019);
        term5097 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5097;
        callMethod(klass, "push", argTypes, term4897, args);
    }

};


