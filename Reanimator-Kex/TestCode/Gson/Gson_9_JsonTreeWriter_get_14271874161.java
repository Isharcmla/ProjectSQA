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

public class JsonTreeWriter_get_14271874161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public JsonTreeWriter_get_14271874161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2 = new ArrayList();
        term1 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term18 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term19 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term20 = (int[]) newIntArray(32);
        setField(term1, term1.getClass(), "stack", term2);
        setField(term1, term1.getClass(), "pendingName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "product", term18);
        setField(term19, term19.getClass(), "writeBuffer", null);
        setField(term19, term19.getClass(), "lock", term19);
        setField(term1, term1.getClass(), "out", term19);
        setIntElement(term20, 0, 6);
        setField(term1, term1.getClass(), "stack", term20);
        setIntField(term1, term1.getClass(), "stackSize", 1);
        setField(term1, term1.getClass(), "indent", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "separator", ":");
        setBooleanField(term1, term1.getClass(), "lenient", false);
        setBooleanField(term1, term1.getClass(), "htmlSafe", false);
        setField(term1, term1.getClass(), "deferredName", "MuLcgQHgqz");
        setBooleanField(term1, term1.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "get", argTypes, term1, args);
    }

};


