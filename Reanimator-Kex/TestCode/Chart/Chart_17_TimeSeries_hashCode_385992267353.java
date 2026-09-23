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

public class TimeSeries_hashCode_385992267353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130297;

    public TimeSeries_hashCode_385992267353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term130447 = Class.forName((String) "org.jfree.chart.renderer.category.LineAndShapeRenderer");
        term130297 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term130373 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term130297, term130297.getClass(), "key", term130373);
        setField(term130297, term130297.getClass(), "description", null);
        setField(term130297, term130297.getClass(), "domain", null);
        setField(term130297, term130297.getClass(), "range", "byte[]");
        setField(term130297, term130297.getClass(), "timePeriodClass", term130447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term130297, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


