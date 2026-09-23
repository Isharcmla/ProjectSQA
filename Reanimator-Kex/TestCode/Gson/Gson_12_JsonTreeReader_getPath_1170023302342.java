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

public class JsonTreeReader_getPath_1170023302342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132116;
     Object term133510;

    public JsonTreeReader_getPath_1170023302342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132116 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term131296 = (Object[]) newArray("java.lang.Object", 495);
        Object term132174 = newInstance(Class.forName("com.google.gson.JsonObject"));
        char[] term130773 = (char[]) newCharArray(521);
        Object term132232 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term132326 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term132382 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term132420 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term132116, term132116.getClass(), "stackSize", 7);
        setElement(term131296, 0, term132174);
        setElement(term131296, 1, term130773);
        setElement(term131296, 2, term132232);
        setElement(term131296, 4, term132326);
        setElement(term131296, 6, term132382);
        setElement(term131296, 64, term132420);
        setField(term132116, term132116.getClass(), "stack", term131296);
        term133510 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term133511 = (Object[]) newArray("java.lang.Object", 495);
        Object term133512 = newInstance(Class.forName("com.google.gson.JsonObject"));
        char[] term133513 = (char[]) newCharArray(521);
        Object term133514 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term133515 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term133516 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term133517 = newInstance(Class.forName("java.lang.Object"));
        setField(term133512, term133512.getClass(), "members", null);
        setElement(term133511, 0, term133512);
        setElement(term133511, 1, term133513);
        setField(term133514, term133514.getClass(), "members", null);
        setElement(term133511, 2, term133514);
        setField(term133515, term133515.getClass(), "stack", null);
        setIntField(term133515, term133515.getClass(), "stackSize", 0);
        setField(term133515, term133515.getClass(), "pathNames", null);
        setField(term133515, term133515.getClass(), "pathIndices", null);
        setField(term133515, term133515.getClass(), "in", null);
        setBooleanField(term133515, term133515.getClass(), "lenient", false);
        setField(term133515, term133515.getClass(), "buffer", null);
        setIntField(term133515, term133515.getClass(), "pos", 0);
        setIntField(term133515, term133515.getClass(), "limit", 0);
        setIntField(term133515, term133515.getClass(), "lineNumber", 0);
        setIntField(term133515, term133515.getClass(), "lineStart", 0);
        setIntField(term133515, term133515.getClass(), "peeked", 0);
        setLongField(term133515, term133515.getClass(), "peekedLong", 0L);
        setIntField(term133515, term133515.getClass(), "peekedNumberLength", 0);
        setField(term133515, term133515.getClass(), "peekedString", null);
        setField(term133515, term133515.getClass(), "stack", null);
        setElement(term133511, 4, term133515);
        setField(term133516, term133516.getClass(), "elements", null);
        setElement(term133511, 6, term133516);
        setElement(term133511, 64, term133517);
        setField(term133510, term133510.getClass(), "stack", term133511);
        setIntField(term133510, term133510.getClass(), "stackSize", 0);
        setField(term133510, term133510.getClass(), "pathNames", null);
        setField(term133510, term133510.getClass(), "pathIndices", null);
        setField(term133510, term133510.getClass(), "in", null);
        setBooleanField(term133510, term133510.getClass(), "lenient", false);
        setField(term133510, term133510.getClass(), "buffer", null);
        setIntField(term133510, term133510.getClass(), "pos", 0);
        setIntField(term133510, term133510.getClass(), "limit", 0);
        setIntField(term133510, term133510.getClass(), "lineNumber", 0);
        setIntField(term133510, term133510.getClass(), "lineStart", 0);
        setIntField(term133510, term133510.getClass(), "peeked", 0);
        setLongField(term133510, term133510.getClass(), "peekedLong", 0L);
        setIntField(term133510, term133510.getClass(), "peekedNumberLength", 0);
        setField(term133510, term133510.getClass(), "peekedString", null);
        setField(term133510, term133510.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term132116, args);
        assertTrue(recursiveEquals(term132116, term133510));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


