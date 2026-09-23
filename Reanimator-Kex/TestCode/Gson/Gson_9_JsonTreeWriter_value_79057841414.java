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

public class JsonTreeWriter_value_79057841414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1949;

    public JsonTreeWriter_value_79057841414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1950 = new ArrayList();
        term1949 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term1966 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term1967 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term1968 = (int[]) newIntArray(32);
        setField(term1949, term1949.getClass(), "stack", term1950);
        setField(term1949, term1949.getClass(), "pendingName", "UlajhuVLaP");
        setField(term1949, term1949.getClass(), "product", term1966);
        setField(term1967, term1967.getClass(), "writeBuffer", null);
        setField(term1967, term1967.getClass(), "lock", term1967);
        setField(term1949, term1949.getClass(), "out", term1967);
        setIntElement(term1968, 0, 6);
        setField(term1949, term1949.getClass(), "stack", term1968);
        setIntField(term1949, term1949.getClass(), "stackSize", 1);
        setField(term1949, term1949.getClass(), "indent", "gGSMzuGICf");
        setField(term1949, term1949.getClass(), "separator", ":");
        setBooleanField(term1949, term1949.getClass(), "lenient", false);
        setBooleanField(term1949, term1949.getClass(), "htmlSafe", true);
        setField(term1949, term1949.getClass(), "deferredName", "hxCBltsObl");
        setBooleanField(term1949, term1949.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "value", argTypes, term1949, args);
    }

};


