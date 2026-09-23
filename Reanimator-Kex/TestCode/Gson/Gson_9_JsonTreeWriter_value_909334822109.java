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

public class JsonTreeWriter_value_909334822109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19144;
     Object term19554;
     Object term19542;

    public JsonTreeWriter_value_909334822109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19196 = new ArrayList();
        term19144 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term19144, term19144.getClass(), "pendingName", null);
        setField(term19144, term19144.getClass(), "stack", term19196);
        ArrayList term19555 = new ArrayList();
        term19554 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term19557 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term19554, term19554.getClass(), "stack", term19555);
        setField(term19554, term19554.getClass(), "pendingName", null);
        setField(term19557, term19557.getClass(), "value", "");
        setField(term19554, term19554.getClass(), "product", term19557);
        setField(term19554, term19554.getClass(), "out", null);
        setField(term19554, term19554.getClass(), "stack", null);
        setIntField(term19554, term19554.getClass(), "stackSize", 0);
        setField(term19554, term19554.getClass(), "indent", null);
        setField(term19554, term19554.getClass(), "separator", null);
        setBooleanField(term19554, term19554.getClass(), "lenient", false);
        setBooleanField(term19554, term19554.getClass(), "htmlSafe", false);
        setField(term19554, term19554.getClass(), "deferredName", null);
        setBooleanField(term19554, term19554.getClass(), "serializeNulls", false);
        ArrayList term19543 = new ArrayList();
        term19542 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term19547 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term19542, term19542.getClass(), "stack", term19543);
        setField(term19542, term19542.getClass(), "pendingName", null);
        setField(term19547, term19547.getClass(), "value", "");
        setField(term19542, term19542.getClass(), "product", term19547);
        setField(term19542, term19542.getClass(), "out", null);
        setField(term19542, term19542.getClass(), "stack", null);
        setIntField(term19542, term19542.getClass(), "stackSize", 0);
        setField(term19542, term19542.getClass(), "indent", null);
        setField(term19542, term19542.getClass(), "separator", null);
        setBooleanField(term19542, term19542.getClass(), "lenient", false);
        setBooleanField(term19542, term19542.getClass(), "htmlSafe", false);
        setField(term19542, term19542.getClass(), "deferredName", null);
        setBooleanField(term19542, term19542.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "value", argTypes, term19144, args);
        assertTrue(recursiveEquals(term19144, term19554));
        assertTrue(recursiveEquals(retValue, term19542));
    }

};


