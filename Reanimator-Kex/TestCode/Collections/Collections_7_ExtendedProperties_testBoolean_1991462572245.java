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

public class ExtendedProperties_testBoolean_1991462572245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54142;
     Object term54696;

    public ExtendedProperties_testBoolean_1991462572245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54142 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term54696 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term54696, term54696.getClass(), "defaults", null);
        setField(term54696, term54696.getClass(), "file", null);
        setField(term54696, term54696.getClass(), "basePath", null);
        setField(term54696, term54696.getClass(), "fileSeparator", null);
        setBooleanField(term54696, term54696.getClass(), "isInitialized", false);
        setField(term54696, term54696.getClass(), "includePropertyName", null);
        setField(term54696, term54696.getClass(), "keysAsListed", null);
        setField(term54696, term54696.getClass(), "table", null);
        setIntField(term54696, term54696.getClass(), "count", 0);
        setIntField(term54696, term54696.getClass(), "threshold", 0);
        setFloatField(term54696, term54696.getClass(), "loadFactor", 0.0F);
        setIntField(term54696, term54696.getClass(), "modCount", 0);
        setField(term54696, term54696.getClass(), "keySet", null);
        setField(term54696, term54696.getClass(), "entrySet", null);
        setField(term54696, term54696.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term54142, args);
        assertTrue(recursiveEquals(term54142, term54696));
        assertTrue(recursiveEquals(retValue, null));
    }

};


