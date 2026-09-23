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

public class TimeSeries_hashCode_385992267333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117307;
     Object term117502;

    public TimeSeries_hashCode_385992267333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term117473 = new ArrayList();
        term117307 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term117383 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term117307, term117307.getClass(), "key", term117383);
        setField(term117307, term117307.getClass(), "description", null);
        setField(term117307, term117307.getClass(), "domain", "");
        setField(term117307, term117307.getClass(), "range", null);
        setField(term117307, term117307.getClass(), "timePeriodClass", null);
        setField(term117307, term117307.getClass(), "data", term117473);
        ArrayList term117505 = new ArrayList();
        term117502 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term117507 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term117502, term117502.getClass(), "domain", "");
        setField(term117502, term117502.getClass(), "range", null);
        setField(term117502, term117502.getClass(), "timePeriodClass", null);
        setField(term117502, term117502.getClass(), "data", term117505);
        setIntField(term117502, term117502.getClass(), "maximumItemCount", 0);
        setLongField(term117502, term117502.getClass(), "maximumItemAge", 0L);
        setField(term117507, term117507.getClass(), "bb", null);
        setField(term117507, term117507.getClass(), "hb", null);
        setIntField(term117507, term117507.getClass(), "offset", 0);
        setBooleanField(term117507, term117507.getClass(), "isReadOnly", false);
        setIntField(term117507, term117507.getClass(), "mark", 0);
        setIntField(term117507, term117507.getClass(), "position", 0);
        setIntField(term117507, term117507.getClass(), "limit", 0);
        setIntField(term117507, term117507.getClass(), "capacity", 0);
        setLongField(term117507, term117507.getClass(), "address", 0L);
        setField(term117502, term117502.getClass(), "key", term117507);
        setField(term117502, term117502.getClass(), "description", null);
        setField(term117502, term117502.getClass(), "listeners", null);
        setField(term117502, term117502.getClass(), "propertyChangeSupport", null);
        setBooleanField(term117502, term117502.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term117307, args);
        assertTrue(recursiveEquals(term117307, term117502));
        assertTrue(recursiveEquals(retValue, 594823321));
    }

};


