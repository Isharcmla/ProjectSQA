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

public class TimeSeries_hashCode_385992267427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195965;
     Object term196209;

    public TimeSeries_hashCode_385992267427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term196175 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term196175, term196175.getClass(), "period", null);
        setField(term196175, term196175.getClass(), "value", null);
        ArrayList term196093 = new ArrayList();
        ((ArrayList) term196093).add(term196175);
        term195965 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term196041 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term195965, term195965.getClass(), "key", term196041);
        setField(term195965, term195965.getClass(), "description", null);
        setField(term195965, term195965.getClass(), "domain", null);
        setField(term195965, term195965.getClass(), "range", null);
        setField(term195965, term195965.getClass(), "timePeriodClass", null);
        setField(term195965, term195965.getClass(), "data", term196093);
        Object term196212 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term196212, term196212.getClass(), "period", null);
        setField(term196212, term196212.getClass(), "value", null);
        ArrayList term196210 = new ArrayList();
        ((ArrayList) term196210).add(term196212);
        term196209 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term196213 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term196209, term196209.getClass(), "domain", null);
        setField(term196209, term196209.getClass(), "range", null);
        setField(term196209, term196209.getClass(), "timePeriodClass", null);
        setField(term196209, term196209.getClass(), "data", term196210);
        setIntField(term196209, term196209.getClass(), "maximumItemCount", 0);
        setLongField(term196209, term196209.getClass(), "maximumItemAge", 0L);
        setField(term196213, term196213.getClass(), "bb", null);
        setField(term196213, term196213.getClass(), "hb", null);
        setIntField(term196213, term196213.getClass(), "offset", 0);
        setBooleanField(term196213, term196213.getClass(), "isReadOnly", false);
        setIntField(term196213, term196213.getClass(), "mark", 0);
        setIntField(term196213, term196213.getClass(), "position", 0);
        setIntField(term196213, term196213.getClass(), "limit", 0);
        setIntField(term196213, term196213.getClass(), "capacity", 0);
        setLongField(term196213, term196213.getClass(), "address", 0L);
        setField(term196209, term196209.getClass(), "key", term196213);
        setField(term196209, term196209.getClass(), "description", null);
        setField(term196209, term196209.getClass(), "listeners", null);
        setField(term196209, term196209.getClass(), "propertyChangeSupport", null);
        setBooleanField(term196209, term196209.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term195965, args);
        assertTrue(recursiveEquals(term195965, term196209));
        assertTrue(recursiveEquals(retValue, 70007125));
    }

};


