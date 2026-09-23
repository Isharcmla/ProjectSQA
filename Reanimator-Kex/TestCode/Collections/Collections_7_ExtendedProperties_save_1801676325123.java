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

public class ExtendedProperties_save_1801676325123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26859;
     Object term26917;
     Object term26932;
     Object term26933;

    public ExtendedProperties_save_1801676325123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26859 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term26917 = newInstance(Class.forName("java.io.ObjectOutputStream"));
        term26932 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term26932, term26932.getClass(), "defaults", null);
        setField(term26932, term26932.getClass(), "file", null);
        setField(term26932, term26932.getClass(), "basePath", null);
        setField(term26932, term26932.getClass(), "fileSeparator", null);
        setBooleanField(term26932, term26932.getClass(), "isInitialized", false);
        setField(term26932, term26932.getClass(), "includePropertyName", null);
        setField(term26932, term26932.getClass(), "keysAsListed", null);
        setField(term26932, term26932.getClass(), "table", null);
        setIntField(term26932, term26932.getClass(), "count", 0);
        setIntField(term26932, term26932.getClass(), "threshold", 0);
        setFloatField(term26932, term26932.getClass(), "loadFactor", 0.0F);
        setIntField(term26932, term26932.getClass(), "modCount", 0);
        setField(term26932, term26932.getClass(), "keySet", null);
        setField(term26932, term26932.getClass(), "entrySet", null);
        setField(term26932, term26932.getClass(), "values", null);
        term26933 = newInstance(Class.forName("java.io.ObjectOutputStream"));
        setField(term26933, term26933.getClass(), "bout", null);
        setField(term26933, term26933.getClass(), "handles", null);
        setField(term26933, term26933.getClass(), "subs", null);
        setIntField(term26933, term26933.getClass(), "protocol", 0);
        setIntField(term26933, term26933.getClass(), "depth", 0);
        setField(term26933, term26933.getClass(), "primVals", null);
        setBooleanField(term26933, term26933.getClass(), "enableOverride", false);
        setBooleanField(term26933, term26933.getClass(), "enableReplace", false);
        setField(term26933, term26933.getClass(), "curContext", null);
        setField(term26933, term26933.getClass(), "curPut", null);
        setField(term26933, term26933.getClass(), "debugInfoStack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term26917;
        args[1] = null;
        callMethod(klass, "save", argTypes, term26859, args);
        assertTrue(recursiveEquals(term26859, term26932));
        assertTrue(recursiveEquals(term26917, term26933));
    }

};


