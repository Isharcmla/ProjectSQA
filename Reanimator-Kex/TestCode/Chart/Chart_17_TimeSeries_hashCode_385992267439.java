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

public class TimeSeries_hashCode_385992267439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206883;

    public TimeSeries_hashCode_385992267439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207071 = Class.forName((String) "java.lang.ThreadGroup");
        term206883 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term206959 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term206883, term206883.getClass(), "key", term206959);
        setField(term206883, term206883.getClass(), "description", null);
        setField(term206883, term206883.getClass(), "domain", "");
        setField(term206883, term206883.getClass(), "range", "java.lang.Class");
        setField(term206883, term206883.getClass(), "timePeriodClass", term207071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term206883, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


