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

public class JsonTreeReader_nextBoolean_1120155112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2841;

    public JsonTreeReader_nextBoolean_1120155112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2841 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term2842 = (Object[]) newArray("java.lang.Object", 6);
        Object term2843 = newInstance(Class.forName("java.lang.Object"));
        Object term2844 = newInstance(Class.forName("java.lang.Object"));
        Object term2845 = newInstance(Class.forName("java.lang.Object"));
        Object term2846 = newInstance(Class.forName("java.lang.Object"));
        Object term2847 = newInstance(Class.forName("java.lang.Object"));
        Object term2848 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2967 = (Object[]) newArray("java.lang.String", 6);
        int[] term3040 = (int[]) newIntArray(4);
        char[] term2937 = (char[]) newCharArray(7);
        int[] term2964 = (int[]) newIntArray(1);
        setElement(term2842, 0, term2843);
        setElement(term2842, 1, term2844);
        setElement(term2842, 2, term2845);
        setElement(term2842, 3, term2846);
        setElement(term2842, 4, term2847);
        setElement(term2842, 5, term2848);
        setField(term2841, term2841.getClass(), "stack", term2842);
        setIntField(term2841, term2841.getClass(), "stackSize", 1593461795);
        setElement(term2967, 0, "pORebkoRdD");
        setElement(term2967, 1, "mXGCWJDOqA");
        setElement(term2967, 2, "dpNsDgfPso");
        setElement(term2967, 3, "hCWPJQKpdc");
        setElement(term2967, 4, "WzMEhMXkKx");
        setElement(term2967, 5, "XOiDvlDhdc");
        setField(term2841, term2841.getClass(), "pathNames", term2967);
        setIntElement(term3040, 0, 515182546);
        setIntElement(term3040, 1, -936895502);
        setIntElement(term3040, 2, -129547140);
        setIntElement(term3040, 3, 199287428);
        setField(term2841, term2841.getClass(), "pathIndices", term3040);
        setField(term2841, term2841.getClass(), "in", null);
        setBooleanField(term2841, term2841.getClass(), "lenient", true);
        setCharElement(term2937, 0, 'D');
        setCharElement(term2937, 1, 'Y');
        setCharElement(term2937, 2, 'F');
        setCharElement(term2937, 3, 's');
        setCharElement(term2937, 4, 'j');
        setCharElement(term2937, 5, 'J');
        setCharElement(term2937, 6, 'C');
        setField(term2841, term2841.getClass(), "buffer", term2937);
        setIntField(term2841, term2841.getClass(), "pos", 49950830);
        setIntField(term2841, term2841.getClass(), "limit", -525257914);
        setIntField(term2841, term2841.getClass(), "lineNumber", 147209682);
        setIntField(term2841, term2841.getClass(), "lineStart", 34470066);
        setIntField(term2841, term2841.getClass(), "peeked", 2058711405);
        setLongField(term2841, term2841.getClass(), "peekedLong", -8885298608300233488L);
        setIntField(term2841, term2841.getClass(), "peekedNumberLength", 1743683601);
        setField(term2841, term2841.getClass(), "peekedString", "XylxrMBraH");
        setIntElement(term2964, 0, -945116798);
        setField(term2841, term2841.getClass(), "stack", term2964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextBoolean", argTypes, term2841, args);
    }

};


