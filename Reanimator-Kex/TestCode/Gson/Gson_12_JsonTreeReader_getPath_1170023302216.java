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

public class JsonTreeReader_getPath_1170023302216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57849;
     Object term58076;

    public JsonTreeReader_getPath_1170023302216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57849 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term57596 = (Object[]) newArray("java.lang.Object", 491);
        Object term57905 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term57961 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term57999 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term57849, term57849.getClass(), "stackSize", 4);
        setElement(term57596, 0, term57905);
        setElement(term57596, 2, term57961);
        setElement(term57596, 64, term57999);
        setField(term57849, term57849.getClass(), "stack", term57596);
        term58076 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term58077 = (Object[]) newArray("java.lang.Object", 491);
        Object term58078 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term58079 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term58080 = newInstance(Class.forName("java.lang.Object"));
        setField(term58078, term58078.getClass(), "elements", null);
        setElement(term58077, 0, term58078);
        setField(term58079, term58079.getClass(), "elements", null);
        setElement(term58077, 2, term58079);
        setElement(term58077, 64, term58080);
        setField(term58076, term58076.getClass(), "stack", term58077);
        setIntField(term58076, term58076.getClass(), "stackSize", 0);
        setField(term58076, term58076.getClass(), "pathNames", null);
        setField(term58076, term58076.getClass(), "pathIndices", null);
        setField(term58076, term58076.getClass(), "in", null);
        setBooleanField(term58076, term58076.getClass(), "lenient", false);
        setField(term58076, term58076.getClass(), "buffer", null);
        setIntField(term58076, term58076.getClass(), "pos", 0);
        setIntField(term58076, term58076.getClass(), "limit", 0);
        setIntField(term58076, term58076.getClass(), "lineNumber", 0);
        setIntField(term58076, term58076.getClass(), "lineStart", 0);
        setIntField(term58076, term58076.getClass(), "peeked", 0);
        setLongField(term58076, term58076.getClass(), "peekedLong", 0L);
        setIntField(term58076, term58076.getClass(), "peekedNumberLength", 0);
        setField(term58076, term58076.getClass(), "peekedString", null);
        setField(term58076, term58076.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term57849, args);
        assertTrue(recursiveEquals(term57849, term58076));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


