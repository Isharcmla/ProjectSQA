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
import java.lang.Double;

public class JsonTreeWriter_value_138840938212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1653;
     Object term1736;

    public JsonTreeWriter_value_138840938212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1654 = new ArrayList();
        term1653 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term1670 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term1671 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term1672 = (int[]) newIntArray(32);
        setField(term1653, term1653.getClass(), "stack", term1654);
        setField(term1653, term1653.getClass(), "pendingName", "Ghbwtircqb");
        setField(term1653, term1653.getClass(), "product", term1670);
        setField(term1671, term1671.getClass(), "writeBuffer", null);
        setField(term1671, term1671.getClass(), "lock", term1671);
        setField(term1653, term1653.getClass(), "out", term1671);
        setIntElement(term1672, 0, 6);
        setField(term1653, term1653.getClass(), "stack", term1672);
        setIntField(term1653, term1653.getClass(), "stackSize", 1);
        setField(term1653, term1653.getClass(), "indent", "xrwlQZdwCp");
        setField(term1653, term1653.getClass(), "separator", ":");
        setBooleanField(term1653, term1653.getClass(), "lenient", true);
        setBooleanField(term1653, term1653.getClass(), "htmlSafe", true);
        setField(term1653, term1653.getClass(), "deferredName", "IDCWpPLRkE");
        setBooleanField(term1653, term1653.getClass(), "serializeNulls", true);
        term1736 = new Double(0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1736;
        callMethod(klass, "value", argTypes, term1653, args);
    }

};


