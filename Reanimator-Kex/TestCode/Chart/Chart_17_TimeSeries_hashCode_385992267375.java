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
import java.lang.ClassCastException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class TimeSeries_hashCode_385992267375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149832;

    public TimeSeries_hashCode_385992267375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term150042 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term150080 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term149960 = new ArrayList();
        ((ArrayList) term149960).add(term150042);
        ((ArrayList) term149960).add(term150080);
        term149832 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term149908 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term149832, term149832.getClass(), "key", term149908);
        setField(term149832, term149832.getClass(), "description", null);
        setField(term149832, term149832.getClass(), "domain", null);
        setField(term149832, term149832.getClass(), "range", null);
        setField(term149832, term149832.getClass(), "timePeriodClass", null);
        setField(term149832, term149832.getClass(), "data", term149960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term149832, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


