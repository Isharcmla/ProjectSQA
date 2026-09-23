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
import java.lang.UnsupportedOperationException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class DateTimeFormatterBuilder_toPrinter_2074353183437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72324;

    public DateTimeFormatterBuilder_toPrinter_2074353183437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72376 = new ArrayList();
        ((ArrayList) term72376).add((Object)null);
        ((ArrayList) term72376).add((Object)null);
        term72324 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term72324, term72324.getClass(), "iFormatter", null);
        setField(term72324, term72324.getClass(), "iElementPairs", term72376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toPrinter", argTypes, term72324, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


