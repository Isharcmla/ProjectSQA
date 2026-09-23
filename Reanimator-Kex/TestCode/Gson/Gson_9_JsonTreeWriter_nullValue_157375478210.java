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

public class JsonTreeWriter_nullValue_157375478210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1359;

    public JsonTreeWriter_nullValue_157375478210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1360 = new ArrayList();
        term1359 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term1376 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term1377 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term1378 = (int[]) newIntArray(32);
        setField(term1359, term1359.getClass(), "stack", term1360);
        setField(term1359, term1359.getClass(), "pendingName", "TEParAifyi");
        setField(term1359, term1359.getClass(), "product", term1376);
        setField(term1377, term1377.getClass(), "writeBuffer", null);
        setField(term1377, term1377.getClass(), "lock", term1377);
        setField(term1359, term1359.getClass(), "out", term1377);
        setIntElement(term1378, 0, 6);
        setField(term1359, term1359.getClass(), "stack", term1378);
        setIntField(term1359, term1359.getClass(), "stackSize", 1);
        setField(term1359, term1359.getClass(), "indent", "OWDIEULEFu");
        setField(term1359, term1359.getClass(), "separator", ":");
        setBooleanField(term1359, term1359.getClass(), "lenient", false);
        setBooleanField(term1359, term1359.getClass(), "htmlSafe", false);
        setField(term1359, term1359.getClass(), "deferredName", "dWRymuLBtr");
        setBooleanField(term1359, term1359.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nullValue", argTypes, term1359, args);
    }

};


