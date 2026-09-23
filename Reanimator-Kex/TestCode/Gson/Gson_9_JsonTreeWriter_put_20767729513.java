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

public class JsonTreeWriter_put_20767729513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;

    public JsonTreeWriter_put_20767729513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term294 = new ArrayList();
        term293 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term310 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term311 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term312 = (int[]) newIntArray(32);
        setField(term293, term293.getClass(), "stack", term294);
        setField(term293, term293.getClass(), "pendingName", "SzjVpOQTyS");
        setField(term293, term293.getClass(), "product", term310);
        setField(term311, term311.getClass(), "writeBuffer", null);
        setField(term311, term311.getClass(), "lock", term311);
        setField(term293, term293.getClass(), "out", term311);
        setIntElement(term312, 0, 6);
        setField(term293, term293.getClass(), "stack", term312);
        setIntField(term293, term293.getClass(), "stackSize", 1);
        setField(term293, term293.getClass(), "indent", "MjGYSRKTNF");
        setField(term293, term293.getClass(), "separator", ":");
        setBooleanField(term293, term293.getClass(), "lenient", true);
        setBooleanField(term293, term293.getClass(), "htmlSafe", true);
        setField(term293, term293.getClass(), "deferredName", "hRNSzYYIrc");
        setBooleanField(term293, term293.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.JsonElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "put", argTypes, term293, args);
    }

};


