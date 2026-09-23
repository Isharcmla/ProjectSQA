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
import java.lang.Long;

public class JsonTreeWriter_value_1061590859121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25431;
     Object term25508;
     Object term25495;

    public JsonTreeWriter_value_1061590859121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term25483 = new ArrayList();
        term25431 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term25431, term25431.getClass(), "pendingName", null);
        setField(term25431, term25431.getClass(), "stack", term25483);
        ArrayList term25509 = new ArrayList();
        Long term25512 = new Long(0L);
        term25508 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term25511 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term25508, term25508.getClass(), "stack", term25509);
        setField(term25508, term25508.getClass(), "pendingName", null);
        setField(term25511, term25511.getClass(), "value", term25512);
        setField(term25508, term25508.getClass(), "product", term25511);
        setField(term25508, term25508.getClass(), "out", null);
        setField(term25508, term25508.getClass(), "stack", null);
        setIntField(term25508, term25508.getClass(), "stackSize", 0);
        setField(term25508, term25508.getClass(), "indent", null);
        setField(term25508, term25508.getClass(), "separator", null);
        setBooleanField(term25508, term25508.getClass(), "lenient", false);
        setBooleanField(term25508, term25508.getClass(), "htmlSafe", false);
        setField(term25508, term25508.getClass(), "deferredName", null);
        setBooleanField(term25508, term25508.getClass(), "serializeNulls", false);
        ArrayList term25496 = new ArrayList();
        Long term25501 = new Long(0L);
        term25495 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term25500 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term25495, term25495.getClass(), "stack", term25496);
        setField(term25495, term25495.getClass(), "pendingName", null);
        setField(term25500, term25500.getClass(), "value", term25501);
        setField(term25495, term25495.getClass(), "product", term25500);
        setField(term25495, term25495.getClass(), "out", null);
        setField(term25495, term25495.getClass(), "stack", null);
        setIntField(term25495, term25495.getClass(), "stackSize", 0);
        setField(term25495, term25495.getClass(), "indent", null);
        setField(term25495, term25495.getClass(), "separator", null);
        setBooleanField(term25495, term25495.getClass(), "lenient", false);
        setBooleanField(term25495, term25495.getClass(), "htmlSafe", false);
        setField(term25495, term25495.getClass(), "deferredName", null);
        setBooleanField(term25495, term25495.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        Object retValue = callMethod(klass, "value", argTypes, term25431, args);
        assertTrue(recursiveEquals(term25431, term25508));
        assertTrue(recursiveEquals(retValue, term25495));
    }

};


