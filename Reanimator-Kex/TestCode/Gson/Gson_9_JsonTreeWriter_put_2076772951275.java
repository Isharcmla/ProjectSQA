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

public class JsonTreeWriter_put_2076772951275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69996;
     Object term70088;
     Object term70100;
     Object term70101;

    public JsonTreeWriter_put_2076772951275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69996 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term69996, term69996.getClass(), "pendingName", "");
        term70088 = newInstance(Class.forName("com.google.gson.JsonNull"));
        term70100 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term70100, term70100.getClass(), "stack", null);
        setField(term70100, term70100.getClass(), "pendingName", null);
        setField(term70100, term70100.getClass(), "product", null);
        setField(term70100, term70100.getClass(), "out", null);
        setField(term70100, term70100.getClass(), "stack", null);
        setIntField(term70100, term70100.getClass(), "stackSize", 0);
        setField(term70100, term70100.getClass(), "indent", null);
        setField(term70100, term70100.getClass(), "separator", null);
        setBooleanField(term70100, term70100.getClass(), "lenient", false);
        setBooleanField(term70100, term70100.getClass(), "htmlSafe", false);
        setField(term70100, term70100.getClass(), "deferredName", null);
        setBooleanField(term70100, term70100.getClass(), "serializeNulls", false);
        term70101 = newInstance(Class.forName("com.google.gson.JsonNull"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.JsonElement");
        Object[] args = new Object[1];
        args[0] = term70088;
        callMethod(klass, "put", argTypes, term69996, args);
        assertTrue(recursiveEquals(term69996, term70100));
        assertTrue(recursiveEquals(term70088, term70101));
    }

};


