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

public class DateTimeFormatterBuilder_appendClockhourOfDay_1099239694113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320;
     Object term326;

    public DateTimeFormatterBuilder_appendClockhourOfDay_1099239694113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term321 = new ArrayList();
        term320 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term325 = newInstance(Class.forName("java.lang.Object"));
        setField(term320, term320.getClass(), "iElementPairs", term321);
        setField(term320, term320.getClass(), "iFormatter", term325);
        term326 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term326;
        try {
            callMethod(klass, "appendClockhourOfDay", argTypes, term320, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


