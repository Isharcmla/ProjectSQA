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
import java.lang.Boolean;

public class JsonTreeWriter_value_106158887511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1505;
     Object term1588;

    public JsonTreeWriter_value_106158887511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1506 = new ArrayList();
        term1505 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term1522 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term1523 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term1524 = (int[]) newIntArray(32);
        setField(term1505, term1505.getClass(), "stack", term1506);
        setField(term1505, term1505.getClass(), "pendingName", "AijpHYOFuy");
        setField(term1505, term1505.getClass(), "product", term1522);
        setField(term1523, term1523.getClass(), "writeBuffer", null);
        setField(term1523, term1523.getClass(), "lock", term1523);
        setField(term1505, term1505.getClass(), "out", term1523);
        setIntElement(term1524, 0, 6);
        setField(term1505, term1505.getClass(), "stack", term1524);
        setIntField(term1505, term1505.getClass(), "stackSize", 1);
        setField(term1505, term1505.getClass(), "indent", "SbAoxhfrkn");
        setField(term1505, term1505.getClass(), "separator", ":");
        setBooleanField(term1505, term1505.getClass(), "lenient", true);
        setBooleanField(term1505, term1505.getClass(), "htmlSafe", true);
        setField(term1505, term1505.getClass(), "deferredName", "kuTXqwMtDB");
        setBooleanField(term1505, term1505.getClass(), "serializeNulls", true);
        term1588 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1588;
        callMethod(klass, "value", argTypes, term1505, args);
    }

};


