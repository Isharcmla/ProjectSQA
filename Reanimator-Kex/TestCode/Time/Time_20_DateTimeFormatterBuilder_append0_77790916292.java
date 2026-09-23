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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class DateTimeFormatterBuilder_append0_77790916292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;
     Object term3703;
     Object term3698;

    public DateTimeFormatterBuilder_append0_77790916292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term125 = new ArrayList();
        term124 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term129 = newInstance(Class.forName("java.lang.Object"));
        setField(term124, term124.getClass(), "iElementPairs", term125);
        setField(term124, term124.getClass(), "iFormatter", term129);
        ArrayList term3704 = new ArrayList();
        ((ArrayList) term3704).add((Object)null);
        ((ArrayList) term3704).add((Object)null);
        term3703 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term3703, term3703.getClass(), "iElementPairs", term3704);
        setField(term3703, term3703.getClass(), "iFormatter", null);
        ArrayList term3699 = new ArrayList();
        ((ArrayList) term3699).add((Object)null);
        ((ArrayList) term3699).add((Object)null);
        term3698 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term3698, term3698.getClass(), "iElementPairs", term3699);
        setField(term3698, term3698.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Class.forName("org.joda.time.format.DateTimeParser");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "append0", argTypes, term124, args);
        assertTrue(recursiveEquals(term124, term3703));
        assertTrue(recursiveEquals(retValue, term3698));
    }

};


