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
import java.lang.IndexOutOfBoundsException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class PeriodFormatterBuilder_appendSeparatorIfFieldsBefore_1707430468252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201065;

    public PeriodFormatterBuilder_appendSeparatorIfFieldsBefore_1707430468252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term201209 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term201301 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term201393 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList term201117 = new ArrayList();
        ((ArrayList) term201117).add(term201209);
        ((ArrayList) term201117).add(term201209);
        ((ArrayList) term201117).add(term201301);
        ((ArrayList) term201117).add(term201301);
        ((ArrayList) term201117).add(term201393);
        ((ArrayList) term201117).add(term201393);
        ((ArrayList) term201117).add((Object)null);
        term201065 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setField(term201065, term201065.getClass(), "iPrefix", null);
        setField(term201065, term201065.getClass(), "iElementPairs", term201117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "appendSeparatorIfFieldsBefore", argTypes, term201065, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


