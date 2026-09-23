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

public class DateTimeFormatterBuilder_toPrinter_2074353183475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84784;

    public DateTimeFormatterBuilder_toPrinter_2074353183475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term84932 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList term84836 = new ArrayList();
        ((ArrayList) term84836).add(term84932);
        ((ArrayList) term84836).add(term84932);
        term84784 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term84784, term84784.getClass(), "iFormatter", null);
        setField(term84784, term84784.getClass(), "iElementPairs", term84836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toPrinter", argTypes, term84784, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


