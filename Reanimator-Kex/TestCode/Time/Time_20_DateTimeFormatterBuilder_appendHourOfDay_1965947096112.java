package org.joda.time.format;

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
import java.lang.IllegalArgumentException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatterBuilder_appendHourOfDay_1965947096112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;
     Object term318;

    public DateTimeFormatterBuilder_appendHourOfDay_1965947096112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term313 = new ArrayList();
        term312 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term317 = newInstance(Class.forName("java.lang.Object"));
        setField(term312, term312.getClass(), "iElementPairs", term313);
        setField(term312, term312.getClass(), "iFormatter", term317);
        term318 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term318;
        try {
            callMethod(klass, "appendHourOfDay", argTypes, term312, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


