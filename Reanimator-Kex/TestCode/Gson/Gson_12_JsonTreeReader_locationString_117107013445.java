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
import java.lang.StringBuilder;

public class JsonTreeReader_locationString_117107013445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203360;
     Object term207032;

    public JsonTreeReader_locationString_117107013445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term203552 = new StringBuilder();
        term203360 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term203064 = (Object[]) newArray("java.lang.Object", 498);
        Object term203436 = newInstance(Class.forName("java.util.WeakHashMap$ValueIterator"));
        Object term203492 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term203608 = newInstance(Class.forName("java.util.ServiceLoader$3"));
        Object term203706 = newInstance(Class.forName("java.util.concurrent.PriorityBlockingQueue$Itr"));
        Object term203744 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term203360, term203360.getClass(), "stackSize", 5);
        setElement(term203064, 0, term203436);
        setElement(term203064, 1, term203492);
        setElement(term203064, 2, term203552);
        setElement(term203064, 3, term203608);
        setElement(term203064, 4, term203706);
        setElement(term203064, 6, term203744);
        setField(term203360, term203360.getClass(), "stack", term203064);
        term207032 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term207033 = (Object[]) newArray("java.lang.Object", 498);
        Object term207034 = newInstance(Class.forName("java.util.WeakHashMap$ValueIterator"));
        Object term207035 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term207036 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term207037 = (byte[]) newByteArray(16);
        Object term207038 = newInstance(Class.forName("java.util.ServiceLoader$3"));
        Object term207039 = newInstance(Class.forName("java.util.concurrent.PriorityBlockingQueue$Itr"));
        Object term207040 = newInstance(Class.forName("java.lang.Object"));
        setField(term207034, term207034.getClass(), "this$0", null);
        setIntField(term207034, term207034.getClass(), "index", 0);
        setField(term207034, term207034.getClass(), "entry", null);
        setField(term207034, term207034.getClass(), "lastReturned", null);
        setIntField(term207034, term207034.getClass(), "expectedModCount", 0);
        setField(term207034, term207034.getClass(), "nextKey", null);
        setField(term207034, term207034.getClass(), "currentKey", null);
        setElement(term207033, 0, term207034);
        setField(term207035, term207035.getClass(), "elements", null);
        setElement(term207033, 1, term207035);
        setField(term207036, term207036.getClass(), "value", term207037);
        setByteField(term207036, term207036.getClass(), "coder", (byte) 0);
        setIntField(term207036, term207036.getClass(), "count", 0);
        setElement(term207033, 2, term207036);
        setIntField(term207038, term207038.getClass(), "expectedReloadCount", 0);
        setIntField(term207038, term207038.getClass(), "index", 0);
        setField(term207038, term207038.getClass(), "this$0", null);
        setElement(term207033, 3, term207038);
        setField(term207039, term207039.getClass(), "array", null);
        setIntField(term207039, term207039.getClass(), "cursor", 0);
        setIntField(term207039, term207039.getClass(), "lastRet", 0);
        setField(term207039, term207039.getClass(), "this$0", null);
        setElement(term207033, 4, term207039);
        setElement(term207033, 6, term207040);
        setField(term207032, term207032.getClass(), "stack", term207033);
        setIntField(term207032, term207032.getClass(), "stackSize", 0);
        setField(term207032, term207032.getClass(), "pathNames", null);
        setField(term207032, term207032.getClass(), "pathIndices", null);
        setField(term207032, term207032.getClass(), "in", null);
        setBooleanField(term207032, term207032.getClass(), "lenient", false);
        setField(term207032, term207032.getClass(), "buffer", null);
        setIntField(term207032, term207032.getClass(), "pos", 0);
        setIntField(term207032, term207032.getClass(), "limit", 0);
        setIntField(term207032, term207032.getClass(), "lineNumber", 0);
        setIntField(term207032, term207032.getClass(), "lineStart", 0);
        setIntField(term207032, term207032.getClass(), "peeked", 0);
        setLongField(term207032, term207032.getClass(), "peekedLong", 0L);
        setIntField(term207032, term207032.getClass(), "peekedNumberLength", 0);
        setField(term207032, term207032.getClass(), "peekedString", null);
        setField(term207032, term207032.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term203360, args);
        assertTrue(recursiveEquals(term203360, term207032));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


