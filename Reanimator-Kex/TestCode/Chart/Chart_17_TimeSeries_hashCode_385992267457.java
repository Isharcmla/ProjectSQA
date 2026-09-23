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

public class TimeSeries_hashCode_385992267457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224654;
     Object term224978;

    public TimeSeries_hashCode_385992267457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term224902 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        ArrayList term224820 = new ArrayList();
        ((ArrayList) term224820).add(term224902);
        term224654 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term224730 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term224654, term224654.getClass(), "key", term224730);
        setField(term224654, term224654.getClass(), "description", null);
        setField(term224654, term224654.getClass(), "domain", null);
        setField(term224654, term224654.getClass(), "range", "");
        setField(term224654, term224654.getClass(), "timePeriodClass", null);
        setField(term224654, term224654.getClass(), "data", term224820);
        Object term224983 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term224983, term224983.getClass(), "period", null);
        setField(term224983, term224983.getClass(), "value", null);
        ArrayList term224981 = new ArrayList();
        ((ArrayList) term224981).add(term224983);
        term224978 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term224984 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term224978, term224978.getClass(), "domain", null);
        setField(term224978, term224978.getClass(), "range", "");
        setField(term224978, term224978.getClass(), "timePeriodClass", null);
        setField(term224978, term224978.getClass(), "data", term224981);
        setIntField(term224978, term224978.getClass(), "maximumItemCount", 0);
        setLongField(term224978, term224978.getClass(), "maximumItemAge", 0L);
        setField(term224984, term224984.getClass(), "bb", null);
        setField(term224984, term224984.getClass(), "hb", null);
        setIntField(term224984, term224984.getClass(), "offset", 0);
        setBooleanField(term224984, term224984.getClass(), "isReadOnly", false);
        setIntField(term224984, term224984.getClass(), "mark", 0);
        setIntField(term224984, term224984.getClass(), "position", 0);
        setIntField(term224984, term224984.getClass(), "limit", 0);
        setIntField(term224984, term224984.getClass(), "capacity", 0);
        setLongField(term224984, term224984.getClass(), "address", 0L);
        setField(term224978, term224978.getClass(), "key", term224984);
        setField(term224978, term224978.getClass(), "description", null);
        setField(term224978, term224978.getClass(), "listeners", null);
        setField(term224978, term224978.getClass(), "propertyChangeSupport", null);
        setBooleanField(term224978, term224978.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term224654, args);
        assertTrue(recursiveEquals(term224654, term224978));
        assertTrue(recursiveEquals(retValue, 70007125));
    }

};


