package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;

public class ExtendedProperties_testBoolean_1991462572230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264152;
     Object term264217;

    public ExtendedProperties_testBoolean_1991462572230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264152 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term264217 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term264217, term264217.getClass(), "defaults", null);
        setField(term264217, term264217.getClass(), "file", null);
        setField(term264217, term264217.getClass(), "basePath", null);
        setField(term264217, term264217.getClass(), "fileSeparator", null);
        setBooleanField(term264217, term264217.getClass(), "isInitialized", false);
        setField(term264217, term264217.getClass(), "includePropertyName", null);
        setField(term264217, term264217.getClass(), "keysAsListed", null);
        setField(term264217, term264217.getClass(), "table", null);
        setIntField(term264217, term264217.getClass(), "count", 0);
        setIntField(term264217, term264217.getClass(), "threshold", 0);
        setFloatField(term264217, term264217.getClass(), "loadFactor", 0.0F);
        setIntField(term264217, term264217.getClass(), "modCount", 0);
        setField(term264217, term264217.getClass(), "keySet", null);
        setField(term264217, term264217.getClass(), "entrySet", null);
        setField(term264217, term264217.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "off";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term264152, args);
        assertTrue(recursiveEquals(term264152, term264217));
        assertTrue(recursiveEquals(retValue, "false"));
    }

};


