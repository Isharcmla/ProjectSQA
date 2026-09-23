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
import java.util.ArrayList;
import java.lang.Object;

public class JsonTreeWriter_flush_2171046215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2095;

    public JsonTreeWriter_flush_2171046215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2096 = new ArrayList();
        term2095 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term2112 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term2113 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term2114 = (int[]) newIntArray(32);
        setField(term2095, term2095.getClass(), "stack", term2096);
        setField(term2095, term2095.getClass(), "pendingName", "BndsHwAFMv");
        setField(term2095, term2095.getClass(), "product", term2112);
        setField(term2113, term2113.getClass(), "writeBuffer", null);
        setField(term2113, term2113.getClass(), "lock", term2113);
        setField(term2095, term2095.getClass(), "out", term2113);
        setIntElement(term2114, 0, 6);
        setField(term2095, term2095.getClass(), "stack", term2114);
        setIntField(term2095, term2095.getClass(), "stackSize", 1);
        setField(term2095, term2095.getClass(), "indent", "GzFkzHGYFt");
        setField(term2095, term2095.getClass(), "separator", ":");
        setBooleanField(term2095, term2095.getClass(), "lenient", true);
        setBooleanField(term2095, term2095.getClass(), "htmlSafe", true);
        setField(term2095, term2095.getClass(), "deferredName", "tShwQLRGNe");
        setBooleanField(term2095, term2095.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term2095, args);
    }

};


