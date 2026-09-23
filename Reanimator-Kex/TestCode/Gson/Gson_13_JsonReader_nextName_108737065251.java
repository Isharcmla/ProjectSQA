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
import java.lang.AssertionError;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_nextName_108737065251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1991;

    public JsonReader_nextName_108737065251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1991 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1993 = (char[]) newCharArray(9);
        int[] term2022 = (int[]) newIntArray(7);
        Object[] term2031 = (Object[]) newArray("java.lang.String", 3);
        int[] term2068 = (int[]) newIntArray(4);
        setField(term1991, term1991.getClass(), "in", null);
        setBooleanField(term1991, term1991.getClass(), "lenient", true);
        setCharElement(term1993, 0, 't');
        setCharElement(term1993, 1, 'D');
        setCharElement(term1993, 2, 'I');
        setCharElement(term1993, 3, 'R');
        setCharElement(term1993, 4, 'b');
        setCharElement(term1993, 5, 'S');
        setCharElement(term1993, 6, 'S');
        setCharElement(term1993, 7, 'b');
        setCharElement(term1993, 8, 'S');
        setField(term1991, term1991.getClass(), "buffer", term1993);
        setIntField(term1991, term1991.getClass(), "pos", -165587447);
        setIntField(term1991, term1991.getClass(), "limit", -1347358701);
        setIntField(term1991, term1991.getClass(), "lineNumber", 806595993);
        setIntField(term1991, term1991.getClass(), "lineStart", 548228925);
        setIntField(term1991, term1991.getClass(), "peeked", -749861210);
        setLongField(term1991, term1991.getClass(), "peekedLong", -4325723315152823407L);
        setIntField(term1991, term1991.getClass(), "peekedNumberLength", 1694224101);
        setField(term1991, term1991.getClass(), "peekedString", "bLPjGVBhlX");
        setIntElement(term2022, 0, 937859191);
        setIntElement(term2022, 1, -916584829);
        setIntElement(term2022, 2, -2131181468);
        setIntElement(term2022, 3, 282916351);
        setIntElement(term2022, 4, 880977281);
        setIntElement(term2022, 5, 371943306);
        setIntElement(term2022, 6, 982388293);
        setField(term1991, term1991.getClass(), "stack", term2022);
        setIntField(term1991, term1991.getClass(), "stackSize", -159494544);
        setElement(term2031, 0, "whBvTVIIlC");
        setElement(term2031, 1, "IgRJUzaCwW");
        setElement(term2031, 2, "JUmudUmaaV");
        setField(term1991, term1991.getClass(), "pathNames", term2031);
        setIntElement(term2068, 0, -75206835);
        setIntElement(term2068, 1, -1618206977);
        setIntElement(term2068, 2, -1747406163);
        setIntElement(term2068, 3, 388157121);
        setField(term1991, term1991.getClass(), "pathIndices", term2068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextName", argTypes, term1991, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


