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

public class JsonTreeReader_close_108260688617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4036;

    public JsonTreeReader_close_108260688617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4036 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term4037 = (Object[]) newArray("java.lang.Object", 4);
        Object term4038 = newInstance(Class.forName("java.lang.Object"));
        Object term4039 = newInstance(Class.forName("java.lang.Object"));
        Object term4040 = newInstance(Class.forName("java.lang.Object"));
        Object term4041 = newInstance(Class.forName("java.lang.Object"));
        Object[] term4173 = (Object[]) newArray("java.lang.String", 1);
        int[] term4186 = (int[]) newIntArray(0);
        char[] term4142 = (char[]) newCharArray(5);
        int[] term4167 = (int[]) newIntArray(4);
        setElement(term4037, 0, term4038);
        setElement(term4037, 1, term4039);
        setElement(term4037, 2, term4040);
        setElement(term4037, 3, term4041);
        setField(term4036, term4036.getClass(), "stack", term4037);
        setIntField(term4036, term4036.getClass(), "stackSize", -434468428);
        setElement(term4173, 0, "sQvGcVjdEx");
        setField(term4036, term4036.getClass(), "pathNames", term4173);
        setField(term4036, term4036.getClass(), "pathIndices", term4186);
        setField(term4036, term4036.getClass(), "in", null);
        setBooleanField(term4036, term4036.getClass(), "lenient", true);
        setCharElement(term4142, 0, 'Q');
        setCharElement(term4142, 1, 'T');
        setCharElement(term4142, 2, 'y');
        setCharElement(term4142, 3, 'S');
        setCharElement(term4142, 4, 'M');
        setField(term4036, term4036.getClass(), "buffer", term4142);
        setIntField(term4036, term4036.getClass(), "pos", -1667482829);
        setIntField(term4036, term4036.getClass(), "limit", 1116576792);
        setIntField(term4036, term4036.getClass(), "lineNumber", -942194446);
        setIntField(term4036, term4036.getClass(), "lineStart", -938508470);
        setIntField(term4036, term4036.getClass(), "peeked", 1242676024);
        setLongField(term4036, term4036.getClass(), "peekedLong", -316468845751588286L);
        setIntField(term4036, term4036.getClass(), "peekedNumberLength", -1865023308);
        setField(term4036, term4036.getClass(), "peekedString", "DSNsTGYXDF");
        setIntElement(term4167, 0, 1698510819);
        setIntElement(term4167, 1, -1553893255);
        setIntElement(term4167, 2, 1303442927);
        setIntElement(term4167, 3, 794568325);
        setField(term4036, term4036.getClass(), "stack", term4167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term4036, args);
    }

};


