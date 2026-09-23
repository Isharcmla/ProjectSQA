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
import java.lang.Object;
import java.util.ArrayList;

public class JsonTreeWriter_init_11859624053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7138;

    public JsonTreeWriter_init_11859624053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7086 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term7086, term7086.getClass(), "stack", null);
        setIntField(term7086, term7086.getClass(), "stackSize", 0);
        setField(term7086, term7086.getClass(), "separator", null);
        setBooleanField(term7086, term7086.getClass(), "serializeNulls", false);
        ArrayList term7139 = new ArrayList();
        term7138 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term7141 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term7142 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term7143 = (int[]) newIntArray(32);
        setField(term7138, term7138.getClass(), "stack", term7139);
        setField(term7138, term7138.getClass(), "pendingName", null);
        setField(term7138, term7138.getClass(), "product", term7141);
        setField(term7142, term7142.getClass(), "writeBuffer", null);
        setField(term7142, term7142.getClass(), "lock", term7142);
        setField(term7138, term7138.getClass(), "out", term7142);
        setIntElement(term7143, 0, 6);
        setField(term7138, term7138.getClass(), "stack", term7143);
        setIntField(term7138, term7138.getClass(), "stackSize", 1);
        setField(term7138, term7138.getClass(), "indent", null);
        setField(term7138, term7138.getClass(), "separator", ":");
        setBooleanField(term7138, term7138.getClass(), "lenient", false);
        setBooleanField(term7138, term7138.getClass(), "htmlSafe", false);
        setField(term7138, term7138.getClass(), "deferredName", null);
        setBooleanField(term7138, term7138.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7138));
    }

};


