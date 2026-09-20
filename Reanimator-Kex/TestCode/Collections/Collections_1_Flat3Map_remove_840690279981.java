package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;

public class Flat3Map_remove_840690279981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196565;
     Object term196663;
     Object term197143;
     Object term197144;

    public Flat3Map_remove_840690279981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196565 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term196565, term196565.getClass(), "delegateMap", null);
        setIntField(term196565, term196565.getClass(), "size", 2);
        term196663 = newInstance(Class.forName("java.lang.reflect.MalformedParametersException"));
        term197143 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term197143, term197143.getClass(), "size", 2);
        setIntField(term197143, term197143.getClass(), "hash1", 0);
        setIntField(term197143, term197143.getClass(), "hash2", 0);
        setIntField(term197143, term197143.getClass(), "hash3", 0);
        setField(term197143, term197143.getClass(), "key1", null);
        setField(term197143, term197143.getClass(), "key2", null);
        setField(term197143, term197143.getClass(), "key3", null);
        setField(term197143, term197143.getClass(), "value1", null);
        setField(term197143, term197143.getClass(), "value2", null);
        setField(term197143, term197143.getClass(), "value3", null);
        setField(term197143, term197143.getClass(), "delegateMap", null);
        term197144 = newInstance(Class.forName("java.lang.reflect.MalformedParametersException"));
        setField(term197144, term197144.getClass(), "backtrace", null);
        setField(term197144, term197144.getClass(), "detailMessage", null);
        setField(term197144, term197144.getClass(), "cause", null);
        setField(term197144, term197144.getClass(), "stackTrace", null);
        setIntField(term197144, term197144.getClass(), "depth", 0);
        setField(term197144, term197144.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term196663;
        Object retValue = callMethod(klass, "remove", argTypes, term196565, args);
        assertTrue(recursiveEquals(term196565, term197143));
        assertTrue(recursiveEquals(term196663, term197144));
        assertTrue(recursiveEquals(retValue, null));
    }

};
