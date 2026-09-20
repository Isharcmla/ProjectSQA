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

public class Flat3Map_remove_840690279892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179911;
     Object term180009;
     Object term180214;
     Object term180215;

    public Flat3Map_remove_840690279892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179911 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term179911, term179911.getClass(), "delegateMap", null);
        setIntField(term179911, term179911.getClass(), "size", 3);
        term180009 = newInstance(Class.forName("java.lang.reflect.MalformedParametersException"));
        term180214 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term180214, term180214.getClass(), "size", 3);
        setIntField(term180214, term180214.getClass(), "hash1", 0);
        setIntField(term180214, term180214.getClass(), "hash2", 0);
        setIntField(term180214, term180214.getClass(), "hash3", 0);
        setField(term180214, term180214.getClass(), "key1", null);
        setField(term180214, term180214.getClass(), "key2", null);
        setField(term180214, term180214.getClass(), "key3", null);
        setField(term180214, term180214.getClass(), "value1", null);
        setField(term180214, term180214.getClass(), "value2", null);
        setField(term180214, term180214.getClass(), "value3", null);
        setField(term180214, term180214.getClass(), "delegateMap", null);
        term180215 = newInstance(Class.forName("java.lang.reflect.MalformedParametersException"));
        setField(term180215, term180215.getClass(), "backtrace", null);
        setField(term180215, term180215.getClass(), "detailMessage", null);
        setField(term180215, term180215.getClass(), "cause", null);
        setField(term180215, term180215.getClass(), "stackTrace", null);
        setIntField(term180215, term180215.getClass(), "depth", 0);
        setField(term180215, term180215.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term180009;
        Object retValue = callMethod(klass, "remove", argTypes, term179911, args);
        assertTrue(recursiveEquals(term179911, term180214));
        assertTrue(recursiveEquals(term180009, term180215));
        assertTrue(recursiveEquals(retValue, null));
    }

};
