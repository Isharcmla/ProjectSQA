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

public class ExtendedProperties_interpolateHelper_838657399341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96954;
     Object term97507;

    public ExtendedProperties_interpolateHelper_838657399341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96954 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term97507 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term97507, term97507.getClass(), "defaults", null);
        setField(term97507, term97507.getClass(), "file", null);
        setField(term97507, term97507.getClass(), "basePath", null);
        setField(term97507, term97507.getClass(), "fileSeparator", null);
        setBooleanField(term97507, term97507.getClass(), "isInitialized", false);
        setField(term97507, term97507.getClass(), "keysAsListed", null);
        setField(term97507, term97507.getClass(), "table", null);
        setIntField(term97507, term97507.getClass(), "count", 0);
        setIntField(term97507, term97507.getClass(), "threshold", 0);
        setFloatField(term97507, term97507.getClass(), "loadFactor", 0.0F);
        setIntField(term97507, term97507.getClass(), "modCount", 0);
        setField(term97507, term97507.getClass(), "keySet", null);
        setField(term97507, term97507.getClass(), "entrySet", null);
        setField(term97507, term97507.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        Object retValue = callMethod(klass, "interpolateHelper", argTypes, term96954, args);
        assertTrue(recursiveEquals(term96954, term97507));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


