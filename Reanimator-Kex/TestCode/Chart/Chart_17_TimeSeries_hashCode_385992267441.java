package org.jfree.data.time;

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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.time.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class TimeSeries_hashCode_385992267441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208227;
     Object term208530;

    public TimeSeries_hashCode_385992267441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term208431 = new ArrayList();
        term208227 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term208303 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term208227, term208227.getClass(), "key", term208303);
        setField(term208227, term208227.getClass(), "description", null);
        setField(term208227, term208227.getClass(), "domain", "");
        setField(term208227, term208227.getClass(), "range", "java.util.List");
        setField(term208227, term208227.getClass(), "timePeriodClass", null);
        setField(term208227, term208227.getClass(), "data", term208431);
        ArrayList term208535 = new ArrayList();
        term208530 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term208537 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term208530, term208530.getClass(), "domain", "");
        setField(term208530, term208530.getClass(), "range", "java.util.List");
        setField(term208530, term208530.getClass(), "timePeriodClass", null);
        setField(term208530, term208530.getClass(), "data", term208535);
        setIntField(term208530, term208530.getClass(), "maximumItemCount", 0);
        setLongField(term208530, term208530.getClass(), "maximumItemAge", 0L);
        setField(term208537, term208537.getClass(), "bb", null);
        setField(term208537, term208537.getClass(), "hb", null);
        setIntField(term208537, term208537.getClass(), "offset", 0);
        setBooleanField(term208537, term208537.getClass(), "isReadOnly", false);
        setIntField(term208537, term208537.getClass(), "mark", 0);
        setIntField(term208537, term208537.getClass(), "position", 0);
        setIntField(term208537, term208537.getClass(), "limit", 0);
        setIntField(term208537, term208537.getClass(), "capacity", 0);
        setLongField(term208537, term208537.getClass(), "address", 0L);
        setField(term208530, term208530.getClass(), "key", term208537);
        setField(term208530, term208530.getClass(), "description", null);
        setField(term208530, term208530.getClass(), "listeners", null);
        setField(term208530, term208530.getClass(), "propertyChangeSupport", null);
        setBooleanField(term208530, term208530.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term208227, args);
        assertTrue(recursiveEquals(term208227, term208530));
        assertTrue(recursiveEquals(retValue, -407796241));
    }

};


