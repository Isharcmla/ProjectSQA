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

public class TimeSeries_hashCode_385992267263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73038;

    public TimeSeries_hashCode_385992267263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73038 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term73114 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term73038, term73038.getClass(), "key", term73114);
        setField(term73038, term73038.getClass(), "description", null);
        setField(term73038, term73038.getClass(), "domain", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term73038, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


