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

public class TimeSeries_hashCode_385992267337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118401;
     Object term118596;

    public TimeSeries_hashCode_385992267337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term118567 = new ArrayList();
        term118401 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term118477 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term118401, term118401.getClass(), "key", term118477);
        setField(term118401, term118401.getClass(), "description", null);
        setField(term118401, term118401.getClass(), "domain", null);
        setField(term118401, term118401.getClass(), "range", "");
        setField(term118401, term118401.getClass(), "timePeriodClass", null);
        setField(term118401, term118401.getClass(), "data", term118567);
        ArrayList term118599 = new ArrayList();
        term118596 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term118601 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term118596, term118596.getClass(), "domain", null);
        setField(term118596, term118596.getClass(), "range", "");
        setField(term118596, term118596.getClass(), "timePeriodClass", null);
        setField(term118596, term118596.getClass(), "data", term118599);
        setIntField(term118596, term118596.getClass(), "maximumItemCount", 0);
        setLongField(term118596, term118596.getClass(), "maximumItemAge", 0L);
        setField(term118601, term118601.getClass(), "bb", null);
        setField(term118601, term118601.getClass(), "hb", null);
        setIntField(term118601, term118601.getClass(), "offset", 0);
        setBooleanField(term118601, term118601.getClass(), "isReadOnly", false);
        setIntField(term118601, term118601.getClass(), "mark", 0);
        setIntField(term118601, term118601.getClass(), "position", 0);
        setIntField(term118601, term118601.getClass(), "limit", 0);
        setIntField(term118601, term118601.getClass(), "capacity", 0);
        setLongField(term118601, term118601.getClass(), "address", 0L);
        setField(term118596, term118596.getClass(), "key", term118601);
        setField(term118596, term118596.getClass(), "description", null);
        setField(term118596, term118596.getClass(), "listeners", null);
        setField(term118596, term118596.getClass(), "propertyChangeSupport", null);
        setBooleanField(term118596, term118596.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term118401, args);
        assertTrue(recursiveEquals(term118401, term118596));
        assertTrue(recursiveEquals(retValue, 594823321));
    }

};


