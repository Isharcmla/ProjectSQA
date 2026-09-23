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

public class JsonTreeReader_nextName_99942482910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2441;

    public JsonTreeReader_nextName_99942482910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2441 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term2442 = (Object[]) newArray("java.lang.Object", 7);
        Object term2443 = newInstance(Class.forName("java.lang.Object"));
        Object term2444 = newInstance(Class.forName("java.lang.Object"));
        Object term2445 = newInstance(Class.forName("java.lang.Object"));
        Object term2446 = newInstance(Class.forName("java.lang.Object"));
        Object term2447 = newInstance(Class.forName("java.lang.Object"));
        Object term2448 = newInstance(Class.forName("java.lang.Object"));
        Object term2449 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2560 = (Object[]) newArray("java.lang.String", 5);
        int[] term2621 = (int[]) newIntArray(1);
        char[] term2532 = (char[]) newCharArray(0);
        int[] term2552 = (int[]) newIntArray(6);
        setElement(term2442, 0, term2443);
        setElement(term2442, 1, term2444);
        setElement(term2442, 2, term2445);
        setElement(term2442, 3, term2446);
        setElement(term2442, 4, term2447);
        setElement(term2442, 5, term2448);
        setElement(term2442, 6, term2449);
        setField(term2441, term2441.getClass(), "stack", term2442);
        setIntField(term2441, term2441.getClass(), "stackSize", -1122880881);
        setElement(term2560, 0, "JiVRgTZvKc");
        setElement(term2560, 1, "XPKmummaqg");
        setElement(term2560, 2, "BKLfkLiZTH");
        setElement(term2560, 3, "SPpkrGcPRr");
        setElement(term2560, 4, "sEccwbJKYE");
        setField(term2441, term2441.getClass(), "pathNames", term2560);
        setIntElement(term2621, 0, -542712742);
        setField(term2441, term2441.getClass(), "pathIndices", term2621);
        setField(term2441, term2441.getClass(), "in", null);
        setBooleanField(term2441, term2441.getClass(), "lenient", true);
        setField(term2441, term2441.getClass(), "buffer", term2532);
        setIntField(term2441, term2441.getClass(), "pos", -159494544);
        setIntField(term2441, term2441.getClass(), "limit", -75206835);
        setIntField(term2441, term2441.getClass(), "lineNumber", -1618206977);
        setIntField(term2441, term2441.getClass(), "lineStart", -1747406163);
        setIntField(term2441, term2441.getClass(), "peeked", 388157121);
        setLongField(term2441, term2441.getClass(), "peekedLong", 6967924379644551255L);
        setIntField(term2441, term2441.getClass(), "peekedNumberLength", 1684998508);
        setField(term2441, term2441.getClass(), "peekedString", "XqgfKFvPSD");
        setIntElement(term2552, 0, -1476644457);
        setIntElement(term2552, 1, 1270666529);
        setIntElement(term2552, 2, -1146679443);
        setIntElement(term2552, 3, -860131894);
        setIntElement(term2552, 4, -1022990421);
        setIntElement(term2552, 5, 1045547089);
        setField(term2441, term2441.getClass(), "stack", term2552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextName", argTypes, term2441, args);
    }

};


