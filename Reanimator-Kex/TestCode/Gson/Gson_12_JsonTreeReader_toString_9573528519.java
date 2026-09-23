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

public class JsonTreeReader_toString_9573528519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4514;

    public JsonTreeReader_toString_9573528519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4514 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term4515 = (Object[]) newArray("java.lang.Object", 6);
        Object term4516 = newInstance(Class.forName("java.lang.Object"));
        Object term4517 = newInstance(Class.forName("java.lang.Object"));
        Object term4518 = newInstance(Class.forName("java.lang.Object"));
        Object term4519 = newInstance(Class.forName("java.lang.Object"));
        Object term4520 = newInstance(Class.forName("java.lang.Object"));
        Object term4521 = newInstance(Class.forName("java.lang.Object"));
        Object[] term4595 = (Object[]) newArray("java.lang.String", 0);
        int[] term4596 = (int[]) newIntArray(3);
        char[] term4562 = (char[]) newCharArray(5);
        int[] term4587 = (int[]) newIntArray(6);
        setElement(term4515, 0, term4516);
        setElement(term4515, 1, term4517);
        setElement(term4515, 2, term4518);
        setElement(term4515, 3, term4519);
        setElement(term4515, 4, term4520);
        setElement(term4515, 5, term4521);
        setField(term4514, term4514.getClass(), "stack", term4515);
        setIntField(term4514, term4514.getClass(), "stackSize", 765766290);
        setField(term4514, term4514.getClass(), "pathNames", term4595);
        setIntElement(term4596, 0, -1284825282);
        setIntElement(term4596, 1, -1941343035);
        setIntElement(term4596, 2, 947897214);
        setField(term4514, term4514.getClass(), "pathIndices", term4596);
        setField(term4514, term4514.getClass(), "in", null);
        setBooleanField(term4514, term4514.getClass(), "lenient", false);
        setCharElement(term4562, 0, 'K');
        setCharElement(term4562, 1, 'T');
        setCharElement(term4562, 2, 'N');
        setCharElement(term4562, 3, 'F');
        setCharElement(term4562, 4, 'h');
        setField(term4514, term4514.getClass(), "buffer", term4562);
        setIntField(term4514, term4514.getClass(), "pos", 1334483645);
        setIntField(term4514, term4514.getClass(), "limit", 917513193);
        setIntField(term4514, term4514.getClass(), "lineNumber", 787278105);
        setIntField(term4514, term4514.getClass(), "lineStart", -2063843486);
        setIntField(term4514, term4514.getClass(), "peeked", 833762980);
        setLongField(term4514, term4514.getClass(), "peekedLong", -6573104506744284592L);
        setIntField(term4514, term4514.getClass(), "peekedNumberLength", 320711637);
        setField(term4514, term4514.getClass(), "peekedString", "JppkknKVOw");
        setIntElement(term4587, 0, 1241164745);
        setIntElement(term4587, 1, 1723148410);
        setIntElement(term4587, 2, -920797484);
        setIntElement(term4587, 3, -1631697577);
        setIntElement(term4587, 4, 765731371);
        setIntElement(term4587, 5, -1703035419);
        setField(term4514, term4514.getClass(), "stack", term4587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4514, args);
    }

};


