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
import java.lang.NullPointerException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TimeSeries_hashCode_385992267238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57877;

    public TimeSeries_hashCode_385992267238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57987 = Class.forName((String) "org.jfree.data.xml.CategorySeriesHandler");
        term57877 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term57951 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferL"));
        setField(term57877, term57877.getClass(), "key", term57951);
        setField(term57877, term57877.getClass(), "description", null);
        setField(term57877, term57877.getClass(), "domain", null);
        setField(term57877, term57877.getClass(), "range", null);
        setField(term57877, term57877.getClass(), "timePeriodClass", term57987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term57877, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


