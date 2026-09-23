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

public class JsonTreeReader_locationString_117107013320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119553;
     Object term119853;

    public JsonTreeReader_locationString_117107013320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119553 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term119270 = (Object[]) newArray("java.lang.Object", 236);
        Object term119611 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term119669 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term119725 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term119781 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term119553, term119553.getClass(), "stackSize", 16);
        setElement(term119270, 0, term119611);
        setElement(term119270, 1, term119669);
        setElement(term119270, 2, term119725);
        setElement(term119270, 4, term119781);
        setField(term119553, term119553.getClass(), "stack", term119270);
        term119853 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term119854 = (Object[]) newArray("java.lang.Object", 236);
        Object term119855 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term119856 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term119857 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term119858 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term119855, term119855.getClass(), "members", null);
        setElement(term119854, 0, term119855);
        setField(term119856, term119856.getClass(), "members", null);
        setElement(term119854, 1, term119856);
        setField(term119857, term119857.getClass(), "elements", null);
        setElement(term119854, 2, term119857);
        setField(term119858, term119858.getClass(), "elements", null);
        setElement(term119854, 4, term119858);
        setField(term119853, term119853.getClass(), "stack", term119854);
        setIntField(term119853, term119853.getClass(), "stackSize", 0);
        setField(term119853, term119853.getClass(), "pathNames", null);
        setField(term119853, term119853.getClass(), "pathIndices", null);
        setField(term119853, term119853.getClass(), "in", null);
        setBooleanField(term119853, term119853.getClass(), "lenient", false);
        setField(term119853, term119853.getClass(), "buffer", null);
        setIntField(term119853, term119853.getClass(), "pos", 0);
        setIntField(term119853, term119853.getClass(), "limit", 0);
        setIntField(term119853, term119853.getClass(), "lineNumber", 0);
        setIntField(term119853, term119853.getClass(), "lineStart", 0);
        setIntField(term119853, term119853.getClass(), "peeked", 0);
        setLongField(term119853, term119853.getClass(), "peekedLong", 0L);
        setIntField(term119853, term119853.getClass(), "peekedNumberLength", 0);
        setField(term119853, term119853.getClass(), "peekedString", null);
        setField(term119853, term119853.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term119553, args);
        assertTrue(recursiveEquals(term119553, term119853));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


