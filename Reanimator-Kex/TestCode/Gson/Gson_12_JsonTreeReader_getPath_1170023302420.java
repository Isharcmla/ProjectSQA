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

public class JsonTreeReader_getPath_1170023302420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176534;
     Object term176962;

    public JsonTreeReader_getPath_1170023302420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176534 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term176236 = (Object[]) newArray("java.lang.Object", 7);
        Object term176592 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term176686 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term176788 = newInstance(Class.forName("java.util.ImmutableCollections$MapN$MapNIterator"));
        Object term176846 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term176534, term176534.getClass(), "stackSize", 6);
        setElement(term176236, 0, term176592);
        setElement(term176236, 1, term176686);
        setElement(term176236, 2, term176788);
        setElement(term176236, 3, term176846);
        setField(term176534, term176534.getClass(), "stack", term176236);
        term176962 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term176963 = (Object[]) newArray("java.lang.Object", 7);
        Object term176964 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term176965 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term176966 = newInstance(Class.forName("java.util.ImmutableCollections$MapN$MapNIterator"));
        Object term176967 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term176964, term176964.getClass(), "members", null);
        setElement(term176963, 0, term176964);
        setField(term176965, term176965.getClass(), "stack", null);
        setIntField(term176965, term176965.getClass(), "stackSize", 0);
        setField(term176965, term176965.getClass(), "pathNames", null);
        setField(term176965, term176965.getClass(), "pathIndices", null);
        setField(term176965, term176965.getClass(), "in", null);
        setBooleanField(term176965, term176965.getClass(), "lenient", false);
        setField(term176965, term176965.getClass(), "buffer", null);
        setIntField(term176965, term176965.getClass(), "pos", 0);
        setIntField(term176965, term176965.getClass(), "limit", 0);
        setIntField(term176965, term176965.getClass(), "lineNumber", 0);
        setIntField(term176965, term176965.getClass(), "lineStart", 0);
        setIntField(term176965, term176965.getClass(), "peeked", 0);
        setLongField(term176965, term176965.getClass(), "peekedLong", 0L);
        setIntField(term176965, term176965.getClass(), "peekedNumberLength", 0);
        setField(term176965, term176965.getClass(), "peekedString", null);
        setField(term176965, term176965.getClass(), "stack", null);
        setElement(term176963, 1, term176965);
        setIntField(term176966, term176966.getClass(), "remaining", 0);
        setIntField(term176966, term176966.getClass(), "idx", 0);
        setField(term176966, term176966.getClass(), "this$0", null);
        setElement(term176963, 2, term176966);
        setField(term176967, term176967.getClass(), "members", null);
        setElement(term176963, 3, term176967);
        setField(term176962, term176962.getClass(), "stack", term176963);
        setIntField(term176962, term176962.getClass(), "stackSize", 0);
        setField(term176962, term176962.getClass(), "pathNames", null);
        setField(term176962, term176962.getClass(), "pathIndices", null);
        setField(term176962, term176962.getClass(), "in", null);
        setBooleanField(term176962, term176962.getClass(), "lenient", false);
        setField(term176962, term176962.getClass(), "buffer", null);
        setIntField(term176962, term176962.getClass(), "pos", 0);
        setIntField(term176962, term176962.getClass(), "limit", 0);
        setIntField(term176962, term176962.getClass(), "lineNumber", 0);
        setIntField(term176962, term176962.getClass(), "lineStart", 0);
        setIntField(term176962, term176962.getClass(), "peeked", 0);
        setLongField(term176962, term176962.getClass(), "peekedLong", 0L);
        setIntField(term176962, term176962.getClass(), "peekedNumberLength", 0);
        setField(term176962, term176962.getClass(), "peekedString", null);
        setField(term176962, term176962.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term176534, args);
        assertTrue(recursiveEquals(term176534, term176962));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


