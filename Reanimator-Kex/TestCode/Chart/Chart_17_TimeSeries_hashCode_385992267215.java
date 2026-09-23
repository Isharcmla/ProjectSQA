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

public class TimeSeries_hashCode_385992267215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46493;
     Object term46646;

    public TimeSeries_hashCode_385992267215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term46619 = new ArrayList();
        term46493 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term46567 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferL"));
        setField(term46493, term46493.getClass(), "key", term46567);
        setField(term46493, term46493.getClass(), "description", null);
        setField(term46493, term46493.getClass(), "domain", null);
        setField(term46493, term46493.getClass(), "range", null);
        setField(term46493, term46493.getClass(), "timePeriodClass", null);
        setField(term46493, term46493.getClass(), "data", term46619);
        ArrayList term46647 = new ArrayList();
        term46646 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term46649 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferL"));
        setField(term46646, term46646.getClass(), "domain", null);
        setField(term46646, term46646.getClass(), "range", null);
        setField(term46646, term46646.getClass(), "timePeriodClass", null);
        setField(term46646, term46646.getClass(), "data", term46647);
        setIntField(term46646, term46646.getClass(), "maximumItemCount", 0);
        setLongField(term46646, term46646.getClass(), "maximumItemAge", 0L);
        setField(term46649, term46649.getClass(), "bb", null);
        setField(term46649, term46649.getClass(), "hb", null);
        setIntField(term46649, term46649.getClass(), "offset", 0);
        setBooleanField(term46649, term46649.getClass(), "isReadOnly", false);
        setIntField(term46649, term46649.getClass(), "mark", 0);
        setIntField(term46649, term46649.getClass(), "position", 0);
        setIntField(term46649, term46649.getClass(), "limit", 0);
        setIntField(term46649, term46649.getClass(), "capacity", 0);
        setLongField(term46649, term46649.getClass(), "address", 0L);
        setField(term46646, term46646.getClass(), "key", term46649);
        setField(term46646, term46646.getClass(), "description", null);
        setField(term46646, term46646.getClass(), "listeners", null);
        setField(term46646, term46646.getClass(), "propertyChangeSupport", null);
        setBooleanField(term46646, term46646.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term46493, args);
        assertTrue(recursiveEquals(term46493, term46646));
        assertTrue(recursiveEquals(retValue, 594823321));
    }

};


