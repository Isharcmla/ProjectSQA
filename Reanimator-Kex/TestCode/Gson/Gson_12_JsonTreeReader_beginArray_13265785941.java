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

public class JsonTreeReader_beginArray_13265785941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public JsonTreeReader_beginArray_13265785941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term2 = (Object[]) newArray("java.lang.Object", 5);
        Object term3 = newInstance(Class.forName("java.lang.Object"));
        Object term4 = newInstance(Class.forName("java.lang.Object"));
        Object term5 = newInstance(Class.forName("java.lang.Object"));
        Object term6 = newInstance(Class.forName("java.lang.Object"));
        Object term7 = newInstance(Class.forName("java.lang.Object"));
        Object[] term90 = (Object[]) newArray("java.lang.String", 6);
        int[] term163 = (int[]) newIntArray(2);
        char[] term63 = (char[]) newCharArray(4);
        int[] term87 = (int[]) newIntArray(1);
        setElement(term2, 0, term3);
        setElement(term2, 1, term4);
        setElement(term2, 2, term5);
        setElement(term2, 3, term6);
        setElement(term2, 4, term7);
        setField(term1, term1.getClass(), "stack", term2);
        setIntField(term1, term1.getClass(), "stackSize", -883034806);
        setElement(term90, 0, "EGtDIRbSSb");
        setElement(term90, 1, "SzjVpOQTyS");
        setElement(term90, 2, "MjGYSRKTNF");
        setElement(term90, 3, "hRNSzYYIrc");
        setElement(term90, 4, "RMFIsYGgne");
        setElement(term90, 5, "NRdvgJlhkX");
        setField(term1, term1.getClass(), "pathNames", term90);
        setIntElement(term163, 0, 1585847225);
        setIntElement(term163, 1, 597278769);
        setField(term1, term1.getClass(), "pathIndices", term163);
        setField(term1, term1.getClass(), "in", null);
        setBooleanField(term1, term1.getClass(), "lenient", false);
        setCharElement(term63, 0, 'P');
        setCharElement(term63, 1, 'A');
        setCharElement(term63, 2, 'E');
        setCharElement(term63, 3, 'B');
        setField(term1, term1.getClass(), "buffer", term63);
        setIntField(term1, term1.getClass(), "pos", -1955890973);
        setIntField(term1, term1.getClass(), "limit", -2038273078);
        setIntField(term1, term1.getClass(), "lineNumber", 1227103734);
        setIntField(term1, term1.getClass(), "lineStart", -1339778481);
        setIntField(term1, term1.getClass(), "peeked", 1725571209);
        setLongField(term1, term1.getClass(), "peekedLong", 2442117782898005296L);
        setIntField(term1, term1.getClass(), "peekedNumberLength", -522618178);
        setField(term1, term1.getClass(), "peekedString", "jJCZpVmanW");
        setIntElement(term87, 0, 1134449235);
        setField(term1, term1.getClass(), "stack", term87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginArray", argTypes, term1, args);
    }

};


