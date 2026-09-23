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

public class JsonTreeWriter_endObject_6168073747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;

    public JsonTreeWriter_endObject_6168073747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term878 = new ArrayList();
        term877 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term894 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term895 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term896 = (int[]) newIntArray(32);
        setField(term877, term877.getClass(), "stack", term878);
        setField(term877, term877.getClass(), "pendingName", "HyxfbSQYBe");
        setField(term877, term877.getClass(), "product", term894);
        setField(term895, term895.getClass(), "writeBuffer", null);
        setField(term895, term895.getClass(), "lock", term895);
        setField(term877, term877.getClass(), "out", term895);
        setIntElement(term896, 0, 6);
        setField(term877, term877.getClass(), "stack", term896);
        setIntField(term877, term877.getClass(), "stackSize", 1);
        setField(term877, term877.getClass(), "indent", "pCTimMblYc");
        setField(term877, term877.getClass(), "separator", ":");
        setBooleanField(term877, term877.getClass(), "lenient", false);
        setBooleanField(term877, term877.getClass(), "htmlSafe", true);
        setField(term877, term877.getClass(), "deferredName", "hNxWaHcfhY");
        setBooleanField(term877, term877.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term877, args);
    }

};


