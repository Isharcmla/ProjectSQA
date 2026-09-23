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
import java.lang.reflect.InaccessibleObjectException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TimeSeries_hashCode_385992267461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227904;

    public TimeSeries_hashCode_385992267461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term228016 = Class.forName((String) "org.jfree.chart.labels.StandardPieSectionLabelGenerator");
        term227904 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term227980 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term227904, term227904.getClass(), "key", term227980);
        setField(term227904, term227904.getClass(), "description", null);
        setField(term227904, term227904.getClass(), "domain", null);
        setField(term227904, term227904.getClass(), "range", null);
        setField(term227904, term227904.getClass(), "timePeriodClass", term228016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term227904, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


