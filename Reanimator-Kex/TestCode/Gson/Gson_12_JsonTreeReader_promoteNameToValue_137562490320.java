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
import java.lang.Object;

public class JsonTreeReader_promoteNameToValue_137562490320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4624;

    public JsonTreeReader_promoteNameToValue_137562490320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4624 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term4625 = (Object[]) newArray("java.lang.Object", 1);
        Object term4626 = newInstance(Class.forName("java.lang.Object"));
        Object[] term4768 = (Object[]) newArray("java.lang.String", 5);
        int[] term4829 = (int[]) newIntArray(1);
        char[] term4741 = (char[]) newCharArray(3);
        int[] term4764 = (int[]) newIntArray(2);
        setElement(term4625, 0, term4626);
        setField(term4624, term4624.getClass(), "stack", term4625);
        setIntField(term4624, term4624.getClass(), "stackSize", -1577069773);
        setElement(term4768, 0, "kGMQdqJYyB");
        setElement(term4768, 1, "XJJNClzHRf");
        setElement(term4768, 2, "HDaezxQfQR");
        setElement(term4768, 3, "iikZEapDlu");
        setElement(term4768, 4, "nhoHrZfnIN");
        setField(term4624, term4624.getClass(), "pathNames", term4768);
        setIntElement(term4829, 0, -266625190);
        setField(term4624, term4624.getClass(), "pathIndices", term4829);
        setField(term4624, term4624.getClass(), "in", null);
        setBooleanField(term4624, term4624.getClass(), "lenient", false);
        setCharElement(term4741, 0, 'R');
        setCharElement(term4741, 1, 'N');
        setCharElement(term4741, 2, 'S');
        setField(term4624, term4624.getClass(), "buffer", term4741);
        setIntField(term4624, term4624.getClass(), "pos", 1824538861);
        setIntField(term4624, term4624.getClass(), "limit", 499519708);
        setIntField(term4624, term4624.getClass(), "lineNumber", 1501165033);
        setIntField(term4624, term4624.getClass(), "lineStart", 510162332);
        setIntField(term4624, term4624.getClass(), "peeked", 888506903);
        setLongField(term4624, term4624.getClass(), "peekedLong", -4920224193275732920L);
        setIntField(term4624, term4624.getClass(), "peekedNumberLength", 200252898);
        setField(term4624, term4624.getClass(), "peekedString", "wzsPSPcRdj");
        setIntElement(term4764, 0, -1831826725);
        setIntElement(term4764, 1, 752152965);
        setField(term4624, term4624.getClass(), "stack", term4764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "promoteNameToValue", argTypes, term4624, args);
    }

};


