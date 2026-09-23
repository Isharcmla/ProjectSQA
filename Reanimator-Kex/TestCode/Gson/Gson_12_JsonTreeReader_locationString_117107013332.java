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
import java.lang.StringBuffer;
import java.lang.StringBuilder;

public class JsonTreeReader_locationString_117107013332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126106;
     Object term126602;

    public JsonTreeReader_locationString_117107013332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term126300 = new StringBuffer();
        StringBuilder term126406 = new StringBuilder();
        term126106 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term125781 = (Object[]) newArray("java.lang.Object", 46);
        Object term126186 = newInstance(Class.forName("java.util.IdentityHashMap$KeyIterator"));
        Object term126242 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term126346 = newInstance(Class.forName("java.nio.file.Path$1"));
        Object term126462 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term126106, term126106.getClass(), "stackSize", 23);
        setElement(term125781, 0, term126186);
        setElement(term125781, 1, term126242);
        setElement(term125781, 3, term126300);
        setElement(term125781, 4, term126346);
        setElement(term125781, 5, term126406);
        setElement(term125781, 6, term126106);
        setElement(term125781, 7, term126462);
        setField(term126106, term126106.getClass(), "stack", term125781);
        term126602 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term126603 = (Object[]) newArray("java.lang.Object", 46);
        Object term126604 = newInstance(Class.forName("java.util.IdentityHashMap$KeyIterator"));
        Object term126605 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term126606 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term126607 = (byte[]) newByteArray(16);
        Object term126608 = newInstance(Class.forName("java.nio.file.Path$1"));
        Object term126609 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term126610 = (byte[]) newByteArray(16);
        Object term126611 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term126604, term126604.getClass(), "this$0", null);
        setIntField(term126604, term126604.getClass(), "index", 0);
        setIntField(term126604, term126604.getClass(), "expectedModCount", 0);
        setIntField(term126604, term126604.getClass(), "lastReturnedIndex", 0);
        setBooleanField(term126604, term126604.getClass(), "indexValid", false);
        setField(term126604, term126604.getClass(), "traversalTable", null);
        setElement(term126603, 0, term126604);
        setField(term126605, term126605.getClass(), "elements", null);
        setElement(term126603, 1, term126605);
        setField(term126606, term126606.getClass(), "toStringCache", null);
        setField(term126606, term126606.getClass(), "value", term126607);
        setByteField(term126606, term126606.getClass(), "coder", (byte) 0);
        setIntField(term126606, term126606.getClass(), "count", 0);
        setElement(term126603, 3, term126606);
        setIntField(term126608, term126608.getClass(), "i", 0);
        setField(term126608, term126608.getClass(), "this$0", null);
        setElement(term126603, 4, term126608);
        setField(term126609, term126609.getClass(), "value", term126610);
        setByteField(term126609, term126609.getClass(), "coder", (byte) 0);
        setIntField(term126609, term126609.getClass(), "count", 0);
        setElement(term126603, 5, term126609);
        setElement(term126603, 6, term126602);
        setField(term126611, term126611.getClass(), "elements", null);
        setElement(term126603, 7, term126611);
        setField(term126602, term126602.getClass(), "stack", term126603);
        setIntField(term126602, term126602.getClass(), "stackSize", 0);
        setField(term126602, term126602.getClass(), "pathNames", null);
        setField(term126602, term126602.getClass(), "pathIndices", null);
        setField(term126602, term126602.getClass(), "in", null);
        setBooleanField(term126602, term126602.getClass(), "lenient", false);
        setField(term126602, term126602.getClass(), "buffer", null);
        setIntField(term126602, term126602.getClass(), "pos", 0);
        setIntField(term126602, term126602.getClass(), "limit", 0);
        setIntField(term126602, term126602.getClass(), "lineNumber", 0);
        setIntField(term126602, term126602.getClass(), "lineStart", 0);
        setIntField(term126602, term126602.getClass(), "peeked", 0);
        setLongField(term126602, term126602.getClass(), "peekedLong", 0L);
        setIntField(term126602, term126602.getClass(), "peekedNumberLength", 0);
        setField(term126602, term126602.getClass(), "peekedString", null);
        setField(term126602, term126602.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term126106, args);
        assertTrue(recursiveEquals(term126106, term126602));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


