package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class Partial_getFormatter_343811671103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29980;
     Object term30776;

    public Partial_getFormatter_343811671103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29980 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term29920 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term29980, term29980.getClass(), "iFormatter", null);
        setField(term29980, term29980.getClass(), "iTypes", term29920);
        term30776 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term30777 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term30776, term30776.getClass(), "iChronology", null);
        setField(term30776, term30776.getClass(), "iTypes", term30777);
        setField(term30776, term30776.getClass(), "iValues", null);
        setField(term30776, term30776.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFormatter", argTypes, term29980, args);
        assertTrue(recursiveEquals(term29980, term30776));
        assertTrue(recursiveEquals(retValue, null));
    }

};


