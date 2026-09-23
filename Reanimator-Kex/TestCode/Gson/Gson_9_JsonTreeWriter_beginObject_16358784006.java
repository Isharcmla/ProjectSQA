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

public class JsonTreeWriter_beginObject_16358784006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731;

    public JsonTreeWriter_beginObject_16358784006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term732 = new ArrayList();
        term731 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term748 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term749 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term750 = (int[]) newIntArray(32);
        setField(term731, term731.getClass(), "stack", term732);
        setField(term731, term731.getClass(), "pendingName", "aJlieCFVtF");
        setField(term731, term731.getClass(), "product", term748);
        setField(term749, term749.getClass(), "writeBuffer", null);
        setField(term749, term749.getClass(), "lock", term749);
        setField(term731, term731.getClass(), "out", term749);
        setIntElement(term750, 0, 6);
        setField(term731, term731.getClass(), "stack", term750);
        setIntField(term731, term731.getClass(), "stackSize", 1);
        setField(term731, term731.getClass(), "indent", "ZiaGIbnzTs");
        setField(term731, term731.getClass(), "separator", ":");
        setBooleanField(term731, term731.getClass(), "lenient", false);
        setBooleanField(term731, term731.getClass(), "htmlSafe", true);
        setField(term731, term731.getClass(), "deferredName", "tbcdzjIfER");
        setBooleanField(term731, term731.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term731, args);
    }

};


