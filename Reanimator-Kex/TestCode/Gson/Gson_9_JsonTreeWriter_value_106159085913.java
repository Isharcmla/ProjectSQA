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
import java.lang.Long;

public class JsonTreeWriter_value_106159085913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1801;
     Object term1884;

    public JsonTreeWriter_value_106159085913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1802 = new ArrayList();
        term1801 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term1818 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term1819 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term1820 = (int[]) newIntArray(32);
        setField(term1801, term1801.getClass(), "stack", term1802);
        setField(term1801, term1801.getClass(), "pendingName", "nyiiPDVjAc");
        setField(term1801, term1801.getClass(), "product", term1818);
        setField(term1819, term1819.getClass(), "writeBuffer", null);
        setField(term1819, term1819.getClass(), "lock", term1819);
        setField(term1801, term1801.getClass(), "out", term1819);
        setIntElement(term1820, 0, 6);
        setField(term1801, term1801.getClass(), "stack", term1820);
        setIntField(term1801, term1801.getClass(), "stackSize", 1);
        setField(term1801, term1801.getClass(), "indent", "aKnKipADSo");
        setField(term1801, term1801.getClass(), "separator", ":");
        setBooleanField(term1801, term1801.getClass(), "lenient", false);
        setBooleanField(term1801, term1801.getClass(), "htmlSafe", false);
        setField(term1801, term1801.getClass(), "deferredName", "wSQxaModmm");
        setBooleanField(term1801, term1801.getClass(), "serializeNulls", true);
        term1884 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1884;
        callMethod(klass, "value", argTypes, term1801, args);
    }

};


