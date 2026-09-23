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

public class TimeSeries_hashCode_385992267411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181036;
     Object term182374;

    public TimeSeries_hashCode_385992267411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term181164 = new ArrayList();
        term181036 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term181112 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term181036, term181036.getClass(), "key", term181112);
        setField(term181036, term181036.getClass(), "description", null);
        setField(term181036, term181036.getClass(), "domain", null);
        setField(term181036, term181036.getClass(), "range", null);
        setField(term181036, term181036.getClass(), "timePeriodClass", null);
        setField(term181036, term181036.getClass(), "data", term181164);
        ArrayList term182375 = new ArrayList();
        term182374 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term182377 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term182374, term182374.getClass(), "domain", null);
        setField(term182374, term182374.getClass(), "range", null);
        setField(term182374, term182374.getClass(), "timePeriodClass", null);
        setField(term182374, term182374.getClass(), "data", term182375);
        setIntField(term182374, term182374.getClass(), "maximumItemCount", 0);
        setLongField(term182374, term182374.getClass(), "maximumItemAge", 0L);
        setField(term182377, term182377.getClass(), "bb", null);
        setField(term182377, term182377.getClass(), "hb", null);
        setIntField(term182377, term182377.getClass(), "offset", 0);
        setBooleanField(term182377, term182377.getClass(), "isReadOnly", false);
        setIntField(term182377, term182377.getClass(), "mark", 0);
        setIntField(term182377, term182377.getClass(), "position", 0);
        setIntField(term182377, term182377.getClass(), "limit", 0);
        setIntField(term182377, term182377.getClass(), "capacity", 0);
        setLongField(term182377, term182377.getClass(), "address", 0L);
        setField(term182374, term182374.getClass(), "key", term182377);
        setField(term182374, term182374.getClass(), "description", null);
        setField(term182374, term182374.getClass(), "listeners", null);
        setField(term182374, term182374.getClass(), "propertyChangeSupport", null);
        setBooleanField(term182374, term182374.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term181036, args);
        assertTrue(recursiveEquals(term181036, term182374));
        assertTrue(recursiveEquals(retValue, 594823321));
    }

};


