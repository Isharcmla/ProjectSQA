package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.stream.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class JsonWriter_jsonValue_1831286341455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243514;
     Object term249784;
     Object term249773;

    public JsonWriter_jsonValue_1831286341455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term243566 = new ArrayList();
        term243514 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term243514, term243514.getClass(), "pendingName", null);
        setField(term243514, term243514.getClass(), "stack", term243566);
        ArrayList term249785 = new ArrayList();
        term249784 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term249787 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term249784, term249784.getClass(), "stack", term249785);
        setField(term249784, term249784.getClass(), "pendingName", null);
        setField(term249784, term249784.getClass(), "product", term249787);
        setField(term249784, term249784.getClass(), "out", null);
        setField(term249784, term249784.getClass(), "stack", null);
        setIntField(term249784, term249784.getClass(), "stackSize", 0);
        setField(term249784, term249784.getClass(), "indent", null);
        setField(term249784, term249784.getClass(), "separator", null);
        setBooleanField(term249784, term249784.getClass(), "lenient", false);
        setBooleanField(term249784, term249784.getClass(), "htmlSafe", false);
        setField(term249784, term249784.getClass(), "deferredName", null);
        setBooleanField(term249784, term249784.getClass(), "serializeNulls", false);
        ArrayList term249774 = new ArrayList();
        term249773 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term249778 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term249773, term249773.getClass(), "stack", term249774);
        setField(term249773, term249773.getClass(), "pendingName", null);
        setField(term249773, term249773.getClass(), "product", term249778);
        setField(term249773, term249773.getClass(), "out", null);
        setField(term249773, term249773.getClass(), "stack", null);
        setIntField(term249773, term249773.getClass(), "stackSize", 0);
        setField(term249773, term249773.getClass(), "indent", null);
        setField(term249773, term249773.getClass(), "separator", null);
        setBooleanField(term249773, term249773.getClass(), "lenient", false);
        setBooleanField(term249773, term249773.getClass(), "htmlSafe", false);
        setField(term249773, term249773.getClass(), "deferredName", null);
        setBooleanField(term249773, term249773.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "jsonValue", argTypes, term243514, args);
        assertTrue(recursiveEquals(term243514, term249784));
        assertTrue(recursiveEquals(retValue, term249773));
    }

};


