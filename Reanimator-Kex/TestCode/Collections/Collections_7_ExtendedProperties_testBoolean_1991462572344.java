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

public class ExtendedProperties_testBoolean_1991462572344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97734;
     Object term98019;

    public ExtendedProperties_testBoolean_1991462572344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97734 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term98019 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term98019, term98019.getClass(), "defaults", null);
        setField(term98019, term98019.getClass(), "file", null);
        setField(term98019, term98019.getClass(), "basePath", null);
        setField(term98019, term98019.getClass(), "fileSeparator", null);
        setBooleanField(term98019, term98019.getClass(), "isInitialized", false);
        setField(term98019, term98019.getClass(), "includePropertyName", null);
        setField(term98019, term98019.getClass(), "keysAsListed", null);
        setField(term98019, term98019.getClass(), "table", null);
        setIntField(term98019, term98019.getClass(), "count", 0);
        setIntField(term98019, term98019.getClass(), "threshold", 0);
        setFloatField(term98019, term98019.getClass(), "loadFactor", 0.0F);
        setIntField(term98019, term98019.getClass(), "modCount", 0);
        setField(term98019, term98019.getClass(), "keySet", null);
        setField(term98019, term98019.getClass(), "entrySet", null);
        setField(term98019, term98019.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term97734, args);
        assertTrue(recursiveEquals(term97734, term98019));
        assertTrue(recursiveEquals(retValue, null));
    }

};


