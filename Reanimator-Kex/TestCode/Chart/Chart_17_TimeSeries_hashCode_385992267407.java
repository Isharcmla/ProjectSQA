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

public class TimeSeries_hashCode_385992267407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178907;

    public TimeSeries_hashCode_385992267407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179073 = new ArrayList();
        ((ArrayList) term179073).add("java.nio.ByteBufferAsDoubleBufferRL");
        term178907 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term178983 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term178907, term178907.getClass(), "key", term178983);
        setField(term178907, term178907.getClass(), "description", null);
        setField(term178907, term178907.getClass(), "domain", "");
        setField(term178907, term178907.getClass(), "range", null);
        setField(term178907, term178907.getClass(), "timePeriodClass", null);
        setField(term178907, term178907.getClass(), "data", term179073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term178907, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


