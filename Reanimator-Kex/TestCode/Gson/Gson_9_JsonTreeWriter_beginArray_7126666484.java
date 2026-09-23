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

public class JsonTreeWriter_beginArray_7126666484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439;

    public JsonTreeWriter_beginArray_7126666484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term440 = new ArrayList();
        term439 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term456 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term457 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term458 = (int[]) newIntArray(32);
        setField(term439, term439.getClass(), "stack", term440);
        setField(term439, term439.getClass(), "pendingName", "RMFIsYGgne");
        setField(term439, term439.getClass(), "product", term456);
        setField(term457, term457.getClass(), "writeBuffer", null);
        setField(term457, term457.getClass(), "lock", term457);
        setField(term439, term439.getClass(), "out", term457);
        setIntElement(term458, 0, 6);
        setField(term439, term439.getClass(), "stack", term458);
        setIntField(term439, term439.getClass(), "stackSize", 1);
        setField(term439, term439.getClass(), "indent", "NRdvgJlhkX");
        setField(term439, term439.getClass(), "separator", ":");
        setBooleanField(term439, term439.getClass(), "lenient", true);
        setBooleanField(term439, term439.getClass(), "htmlSafe", true);
        setField(term439, term439.getClass(), "deferredName", "uuaPigETmJ");
        setBooleanField(term439, term439.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginArray", argTypes, term439, args);
    }

};


