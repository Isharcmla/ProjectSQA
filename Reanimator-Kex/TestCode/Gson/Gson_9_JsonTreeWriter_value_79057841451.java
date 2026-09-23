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
import java.lang.Object;

public class JsonTreeWriter_value_79057841451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6789;
     Object term6856;
     Object term6845;

    public JsonTreeWriter_value_79057841451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6841 = new ArrayList();
        term6789 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term6789, term6789.getClass(), "pendingName", null);
        setField(term6789, term6789.getClass(), "stack", term6841);
        ArrayList term6857 = new ArrayList();
        term6856 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term6859 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term6856, term6856.getClass(), "stack", term6857);
        setField(term6856, term6856.getClass(), "pendingName", null);
        setField(term6856, term6856.getClass(), "product", term6859);
        setField(term6856, term6856.getClass(), "out", null);
        setField(term6856, term6856.getClass(), "stack", null);
        setIntField(term6856, term6856.getClass(), "stackSize", 0);
        setField(term6856, term6856.getClass(), "indent", null);
        setField(term6856, term6856.getClass(), "separator", null);
        setBooleanField(term6856, term6856.getClass(), "lenient", false);
        setBooleanField(term6856, term6856.getClass(), "htmlSafe", false);
        setField(term6856, term6856.getClass(), "deferredName", null);
        setBooleanField(term6856, term6856.getClass(), "serializeNulls", false);
        ArrayList term6846 = new ArrayList();
        term6845 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term6850 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term6845, term6845.getClass(), "stack", term6846);
        setField(term6845, term6845.getClass(), "pendingName", null);
        setField(term6845, term6845.getClass(), "product", term6850);
        setField(term6845, term6845.getClass(), "out", null);
        setField(term6845, term6845.getClass(), "stack", null);
        setIntField(term6845, term6845.getClass(), "stackSize", 0);
        setField(term6845, term6845.getClass(), "indent", null);
        setField(term6845, term6845.getClass(), "separator", null);
        setBooleanField(term6845, term6845.getClass(), "lenient", false);
        setBooleanField(term6845, term6845.getClass(), "htmlSafe", false);
        setField(term6845, term6845.getClass(), "deferredName", null);
        setBooleanField(term6845, term6845.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "value", argTypes, term6789, args);
        assertTrue(recursiveEquals(term6789, term6856));
        assertTrue(recursiveEquals(retValue, term6845));
    }

};


