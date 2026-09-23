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

public class JsonTreeWriter_value_9093348229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1191;

    public JsonTreeWriter_value_9093348229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1192 = new ArrayList();
        term1191 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term1208 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term1209 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term1210 = (int[]) newIntArray(32);
        setField(term1191, term1191.getClass(), "stack", term1192);
        setField(term1191, term1191.getClass(), "pendingName", "vrQLuWIDJX");
        setField(term1191, term1191.getClass(), "product", term1208);
        setField(term1209, term1209.getClass(), "writeBuffer", null);
        setField(term1209, term1209.getClass(), "lock", term1209);
        setField(term1191, term1191.getClass(), "out", term1209);
        setIntElement(term1210, 0, 6);
        setField(term1191, term1191.getClass(), "stack", term1210);
        setIntField(term1191, term1191.getClass(), "stackSize", 1);
        setField(term1191, term1191.getClass(), "indent", "flxyYxBRtu");
        setField(term1191, term1191.getClass(), "separator", ":");
        setBooleanField(term1191, term1191.getClass(), "lenient", true);
        setBooleanField(term1191, term1191.getClass(), "htmlSafe", true);
        setField(term1191, term1191.getClass(), "deferredName", "OclPbYPkcH");
        setBooleanField(term1191, term1191.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        callMethod(klass, "value", argTypes, term1191, args);
    }

};


