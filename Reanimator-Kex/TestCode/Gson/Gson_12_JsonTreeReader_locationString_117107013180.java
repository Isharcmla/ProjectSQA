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

public class JsonTreeReader_locationString_117107013180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43450;
     Object term43952;

    public JsonTreeReader_locationString_117107013180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43450 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term43307 = (Object[]) newArray("java.lang.Object", 4);
        Object term43508 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term43546 = newInstance(Class.forName("java.lang.Object"));
        Object term43584 = newInstance(Class.forName("java.lang.Object"));
        Object term43622 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term43450, term43450.getClass(), "stackSize", 1);
        setElement(term43307, 0, term43508);
        setElement(term43307, 1, term43546);
        setElement(term43307, 2, term43584);
        setElement(term43307, 3, term43622);
        setField(term43450, term43450.getClass(), "stack", term43307);
        term43952 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term43953 = (Object[]) newArray("java.lang.Object", 4);
        Object term43954 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term43955 = newInstance(Class.forName("java.lang.Object"));
        Object term43956 = newInstance(Class.forName("java.lang.Object"));
        Object term43957 = newInstance(Class.forName("java.lang.Object"));
        setField(term43954, term43954.getClass(), "members", null);
        setElement(term43953, 0, term43954);
        setElement(term43953, 1, term43955);
        setElement(term43953, 2, term43956);
        setElement(term43953, 3, term43957);
        setField(term43952, term43952.getClass(), "stack", term43953);
        setIntField(term43952, term43952.getClass(), "stackSize", 0);
        setField(term43952, term43952.getClass(), "pathNames", null);
        setField(term43952, term43952.getClass(), "pathIndices", null);
        setField(term43952, term43952.getClass(), "in", null);
        setBooleanField(term43952, term43952.getClass(), "lenient", false);
        setField(term43952, term43952.getClass(), "buffer", null);
        setIntField(term43952, term43952.getClass(), "pos", 0);
        setIntField(term43952, term43952.getClass(), "limit", 0);
        setIntField(term43952, term43952.getClass(), "lineNumber", 0);
        setIntField(term43952, term43952.getClass(), "lineStart", 0);
        setIntField(term43952, term43952.getClass(), "peeked", 0);
        setLongField(term43952, term43952.getClass(), "peekedLong", 0L);
        setIntField(term43952, term43952.getClass(), "peekedNumberLength", 0);
        setField(term43952, term43952.getClass(), "peekedString", null);
        setField(term43952, term43952.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term43450, args);
        assertTrue(recursiveEquals(term43450, term43952));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


