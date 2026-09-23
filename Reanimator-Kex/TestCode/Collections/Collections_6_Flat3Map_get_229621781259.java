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

public class Flat3Map_get_229621781259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42479;
     Object term42573;
     Object term42626;
     Object term42627;

    public Flat3Map_get_229621781259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42479 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term42479, term42479.getClass(), "delegateMap", null);
        setIntField(term42479, term42479.getClass(), "size", 1);
        term42573 = newInstance(Class.forName("java.nio.file.ClosedDirectoryStreamException"));
        term42626 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term42626, term42626.getClass(), "size", 1);
        setIntField(term42626, term42626.getClass(), "hash1", 0);
        setIntField(term42626, term42626.getClass(), "hash2", 0);
        setIntField(term42626, term42626.getClass(), "hash3", 0);
        setField(term42626, term42626.getClass(), "key1", null);
        setField(term42626, term42626.getClass(), "key2", null);
        setField(term42626, term42626.getClass(), "key3", null);
        setField(term42626, term42626.getClass(), "value1", null);
        setField(term42626, term42626.getClass(), "value2", null);
        setField(term42626, term42626.getClass(), "value3", null);
        setField(term42626, term42626.getClass(), "delegateMap", null);
        term42627 = newInstance(Class.forName("java.nio.file.ClosedDirectoryStreamException"));
        setField(term42627, term42627.getClass(), "backtrace", null);
        setField(term42627, term42627.getClass(), "detailMessage", null);
        setField(term42627, term42627.getClass(), "cause", null);
        setField(term42627, term42627.getClass(), "stackTrace", null);
        setIntField(term42627, term42627.getClass(), "depth", 0);
        setField(term42627, term42627.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42573;
        Object retValue = callMethod(klass, "get", argTypes, term42479, args);
        assertTrue(recursiveEquals(term42479, term42626));
        assertTrue(recursiveEquals(term42573, term42627));
        assertTrue(recursiveEquals(retValue, null));
    }

};


