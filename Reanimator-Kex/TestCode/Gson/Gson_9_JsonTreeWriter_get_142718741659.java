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
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.util.ArrayList;

public class JsonTreeWriter_get_142718741659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8129;
     Object term8192;

    public JsonTreeWriter_get_142718741659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8181 = new ArrayList();
        term8129 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term8129, term8129.getClass(), "stack", term8181);
        ArrayList term8193 = new ArrayList();
        term8192 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term8192, term8192.getClass(), "stack", term8193);
        setField(term8192, term8192.getClass(), "pendingName", null);
        setField(term8192, term8192.getClass(), "product", null);
        setField(term8192, term8192.getClass(), "out", null);
        setField(term8192, term8192.getClass(), "stack", null);
        setIntField(term8192, term8192.getClass(), "stackSize", 0);
        setField(term8192, term8192.getClass(), "indent", null);
        setField(term8192, term8192.getClass(), "separator", null);
        setBooleanField(term8192, term8192.getClass(), "lenient", false);
        setBooleanField(term8192, term8192.getClass(), "htmlSafe", false);
        setField(term8192, term8192.getClass(), "deferredName", null);
        setBooleanField(term8192, term8192.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "get", argTypes, term8129, args);
        assertTrue(recursiveEquals(term8129, term8192));
        assertTrue(recursiveEquals(retValue, null));
    }

};


