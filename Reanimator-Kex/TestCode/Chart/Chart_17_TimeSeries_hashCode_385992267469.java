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

public class TimeSeries_hashCode_385992267469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238169;
     Object term238707;

    public TimeSeries_hashCode_385992267469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term238379 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term238379, term238379.getClass(), "period", null);
        setField(term238379, term238379.getClass(), "value", null);
        Object term238499 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term238581 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term238581, term238581.getClass(), "period", null);
        setField(term238581, term238581.getClass(), "value", null);
        ArrayList term238297 = new ArrayList();
        ((ArrayList) term238297).add(term238379);
        ((ArrayList) term238297).add("org.jfree.data.time.TimeSeriesDataItem");
        ((ArrayList) term238297).add(term238499);
        ((ArrayList) term238297).add(term238581);
        term238169 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term238245 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term238169, term238169.getClass(), "key", term238245);
        setField(term238169, term238169.getClass(), "description", null);
        setField(term238169, term238169.getClass(), "domain", null);
        setField(term238169, term238169.getClass(), "range", null);
        setField(term238169, term238169.getClass(), "timePeriodClass", null);
        setField(term238169, term238169.getClass(), "data", term238297);
        Object term238710 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term238710, term238710.getClass(), "period", null);
        setField(term238710, term238710.getClass(), "value", null);
        Object term238713 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term238713, term238713.getClass(), "period", null);
        setField(term238713, term238713.getClass(), "value", null);
        Object term238714 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term238714, term238714.getClass(), "period", null);
        setField(term238714, term238714.getClass(), "value", null);
        ArrayList term238708 = new ArrayList();
        ((ArrayList) term238708).add(term238710);
        ((ArrayList) term238708).add("org.jfree.data.time.TimeSeriesDataItem");
        ((ArrayList) term238708).add(term238713);
        ((ArrayList) term238708).add(term238714);
        term238707 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term238715 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term238707, term238707.getClass(), "domain", null);
        setField(term238707, term238707.getClass(), "range", null);
        setField(term238707, term238707.getClass(), "timePeriodClass", null);
        setField(term238707, term238707.getClass(), "data", term238708);
        setIntField(term238707, term238707.getClass(), "maximumItemCount", 0);
        setLongField(term238707, term238707.getClass(), "maximumItemAge", 0L);
        setField(term238715, term238715.getClass(), "bb", null);
        setField(term238715, term238715.getClass(), "hb", null);
        setIntField(term238715, term238715.getClass(), "offset", 0);
        setBooleanField(term238715, term238715.getClass(), "isReadOnly", false);
        setIntField(term238715, term238715.getClass(), "mark", 0);
        setIntField(term238715, term238715.getClass(), "position", 0);
        setIntField(term238715, term238715.getClass(), "limit", 0);
        setIntField(term238715, term238715.getClass(), "capacity", 0);
        setLongField(term238715, term238715.getClass(), "address", 0L);
        setField(term238707, term238707.getClass(), "key", term238715);
        setField(term238707, term238707.getClass(), "description", null);
        setField(term238707, term238707.getClass(), "listeners", null);
        setField(term238707, term238707.getClass(), "propertyChangeSupport", null);
        setBooleanField(term238707, term238707.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term238169, args);
        assertTrue(recursiveEquals(term238169, term238707));
        assertTrue(recursiveEquals(retValue, -1253550019));
    }

};


