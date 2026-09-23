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

public class ExtendedProperties_getInclude_1778893229522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431684;
     Object term431701;

    public ExtendedProperties_getInclude_1778893229522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431684 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term431684, term431684.getClass(), "includePropertyName", null);
        term431701 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term431701, term431701.getClass(), "defaults", null);
        setField(term431701, term431701.getClass(), "file", null);
        setField(term431701, term431701.getClass(), "basePath", null);
        setField(term431701, term431701.getClass(), "fileSeparator", null);
        setBooleanField(term431701, term431701.getClass(), "isInitialized", false);
        setField(term431701, term431701.getClass(), "includePropertyName", null);
        setField(term431701, term431701.getClass(), "keysAsListed", null);
        setField(term431701, term431701.getClass(), "table", null);
        setIntField(term431701, term431701.getClass(), "count", 0);
        setIntField(term431701, term431701.getClass(), "threshold", 0);
        setFloatField(term431701, term431701.getClass(), "loadFactor", 0.0F);
        setIntField(term431701, term431701.getClass(), "modCount", 0);
        setField(term431701, term431701.getClass(), "keySet", null);
        setField(term431701, term431701.getClass(), "entrySet", null);
        setField(term431701, term431701.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInclude", argTypes, term431684, args);
        assertTrue(recursiveEquals(term431684, term431701));
        assertTrue(recursiveEquals(retValue, "include"));
    }

};


