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

public class ExtendedProperties_testBoolean_1991462572637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470080;
     Object term494372;

    public ExtendedProperties_testBoolean_1991462572637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470080 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term494372 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term494372, term494372.getClass(), "defaults", null);
        setField(term494372, term494372.getClass(), "file", null);
        setField(term494372, term494372.getClass(), "basePath", null);
        setField(term494372, term494372.getClass(), "fileSeparator", null);
        setBooleanField(term494372, term494372.getClass(), "isInitialized", false);
        setField(term494372, term494372.getClass(), "includePropertyName", null);
        setField(term494372, term494372.getClass(), "keysAsListed", null);
        setField(term494372, term494372.getClass(), "table", null);
        setIntField(term494372, term494372.getClass(), "count", 0);
        setIntField(term494372, term494372.getClass(), "threshold", 0);
        setFloatField(term494372, term494372.getClass(), "loadFactor", 0.0F);
        setIntField(term494372, term494372.getClass(), "modCount", 0);
        setField(term494372, term494372.getClass(), "keySet", null);
        setField(term494372, term494372.getClass(), "entrySet", null);
        setField(term494372, term494372.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term470080, args);
        assertTrue(recursiveEquals(term470080, term494372));
        assertTrue(recursiveEquals(retValue, null));
    }

};


