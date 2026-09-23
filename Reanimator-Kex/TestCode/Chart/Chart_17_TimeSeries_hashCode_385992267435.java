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

public class TimeSeries_hashCode_385992267435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203777;
     Object term204110;

    public TimeSeries_hashCode_385992267435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term203987 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term203987, term203987.getClass(), "period", null);
        setField(term203987, term203987.getClass(), "value", null);
        Object term204069 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        ArrayList term203905 = new ArrayList();
        ((ArrayList) term203905).add(term203987);
        ((ArrayList) term203905).add(term204069);
        term203777 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term203853 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term203777, term203777.getClass(), "key", term203853);
        setField(term203777, term203777.getClass(), "description", null);
        setField(term203777, term203777.getClass(), "domain", null);
        setField(term203777, term203777.getClass(), "range", null);
        setField(term203777, term203777.getClass(), "timePeriodClass", null);
        setField(term203777, term203777.getClass(), "data", term203905);
        Object term204113 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term204113, term204113.getClass(), "period", null);
        setField(term204113, term204113.getClass(), "value", null);
        Object term204114 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term204114, term204114.getClass(), "period", null);
        setField(term204114, term204114.getClass(), "value", null);
        ArrayList term204111 = new ArrayList();
        ((ArrayList) term204111).add(term204113);
        ((ArrayList) term204111).add(term204114);
        term204110 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term204115 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term204110, term204110.getClass(), "domain", null);
        setField(term204110, term204110.getClass(), "range", null);
        setField(term204110, term204110.getClass(), "timePeriodClass", null);
        setField(term204110, term204110.getClass(), "data", term204111);
        setIntField(term204110, term204110.getClass(), "maximumItemCount", 0);
        setLongField(term204110, term204110.getClass(), "maximumItemAge", 0L);
        setField(term204115, term204115.getClass(), "bb", null);
        setField(term204115, term204115.getClass(), "hb", null);
        setIntField(term204115, term204115.getClass(), "offset", 0);
        setBooleanField(term204115, term204115.getClass(), "isReadOnly", false);
        setIntField(term204115, term204115.getClass(), "mark", 0);
        setIntField(term204115, term204115.getClass(), "position", 0);
        setIntField(term204115, term204115.getClass(), "limit", 0);
        setIntField(term204115, term204115.getClass(), "capacity", 0);
        setLongField(term204115, term204115.getClass(), "address", 0L);
        setField(term204110, term204110.getClass(), "key", term204115);
        setField(term204110, term204110.getClass(), "description", null);
        setField(term204110, term204110.getClass(), "listeners", null);
        setField(term204110, term204110.getClass(), "propertyChangeSupport", null);
        setBooleanField(term204110, term204110.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term203777, args);
        assertTrue(recursiveEquals(term203777, term204110));
        assertTrue(recursiveEquals(retValue, 2030206625));
    }

};


