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

public class DateTimeFormatterBuilder_isPrinter_616256218355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54980;
     Object term55096;
     Object term55109;
     Object term55110;

    public DateTimeFormatterBuilder_isPrinter_616256218355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54980 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term55096 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        term55109 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term55109, term55109.getClass(), "iElementPairs", null);
        setField(term55109, term55109.getClass(), "iFormatter", null);
        term55110 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term55110, term55110.getClass(), "iPrinters", null);
        setField(term55110, term55110.getClass(), "iParsers", null);
        setIntField(term55110, term55110.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term55110, term55110.getClass(), "iParsedLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term55096;
        callMethod(klass, "isPrinter", argTypes, term54980, args);
        assertTrue(recursiveEquals(term54980, term55109));
        assertTrue(recursiveEquals(term55096, term55110));
    }

};


