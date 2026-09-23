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

public class JsonTreeReader_locationString_117107013298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107336;
     Object term107588;

    public JsonTreeReader_locationString_117107013298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107336 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term107008 = (Object[]) newArray("java.lang.Object", 492);
        Object term107420 = newInstance(Class.forName("java.util.Collections$EmptyListIterator"));
        Object term107476 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term107336, term107336.getClass(), "stackSize", 15);
        setElement(term107008, 0, term107420);
        setElement(term107008, 1, term107476);
        setElement(term107008, 2, "");
        setField(term107336, term107336.getClass(), "stack", term107008);
        term107588 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term107589 = (Object[]) newArray("java.lang.Object", 492);
        Object term107590 = newInstance(Class.forName("java.util.Collections$EmptyListIterator"));
        Object term107591 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setElement(term107589, 0, term107590);
        setField(term107591, term107591.getClass(), "elements", null);
        setElement(term107589, 1, term107591);
        setElement(term107589, 2, "");
        setField(term107588, term107588.getClass(), "stack", term107589);
        setIntField(term107588, term107588.getClass(), "stackSize", 0);
        setField(term107588, term107588.getClass(), "pathNames", null);
        setField(term107588, term107588.getClass(), "pathIndices", null);
        setField(term107588, term107588.getClass(), "in", null);
        setBooleanField(term107588, term107588.getClass(), "lenient", false);
        setField(term107588, term107588.getClass(), "buffer", null);
        setIntField(term107588, term107588.getClass(), "pos", 0);
        setIntField(term107588, term107588.getClass(), "limit", 0);
        setIntField(term107588, term107588.getClass(), "lineNumber", 0);
        setIntField(term107588, term107588.getClass(), "lineStart", 0);
        setIntField(term107588, term107588.getClass(), "peeked", 0);
        setLongField(term107588, term107588.getClass(), "peekedLong", 0L);
        setIntField(term107588, term107588.getClass(), "peekedNumberLength", 0);
        setField(term107588, term107588.getClass(), "peekedString", null);
        setField(term107588, term107588.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term107336, args);
        assertTrue(recursiveEquals(term107336, term107588));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


