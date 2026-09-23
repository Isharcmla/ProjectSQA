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

public class JsonTreeWriter_endArray_3230447265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585;

    public JsonTreeWriter_endArray_3230447265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term586 = new ArrayList();
        term585 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term602 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term603 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term604 = (int[]) newIntArray(32);
        setField(term585, term585.getClass(), "stack", term586);
        setField(term585, term585.getClass(), "pendingName", "MxlszYVzRf");
        setField(term585, term585.getClass(), "product", term602);
        setField(term603, term603.getClass(), "writeBuffer", null);
        setField(term603, term603.getClass(), "lock", term603);
        setField(term585, term585.getClass(), "out", term603);
        setIntElement(term604, 0, 6);
        setField(term585, term585.getClass(), "stack", term604);
        setIntField(term585, term585.getClass(), "stackSize", 1);
        setField(term585, term585.getClass(), "indent", "LQFpaHEwXR");
        setField(term585, term585.getClass(), "separator", ":");
        setBooleanField(term585, term585.getClass(), "lenient", false);
        setBooleanField(term585, term585.getClass(), "htmlSafe", true);
        setField(term585, term585.getClass(), "deferredName", "oVcInYnLWB");
        setBooleanField(term585, term585.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endArray", argTypes, term585, args);
    }

};


