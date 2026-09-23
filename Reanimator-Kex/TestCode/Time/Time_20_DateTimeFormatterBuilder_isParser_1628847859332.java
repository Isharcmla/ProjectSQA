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

public class DateTimeFormatterBuilder_isParser_1628847859332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50160;
     Object term50276;
     Object term50517;
     Object term50518;

    public DateTimeFormatterBuilder_isParser_1628847859332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50160 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term50276 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        term50517 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term50517, term50517.getClass(), "iElementPairs", null);
        setField(term50517, term50517.getClass(), "iFormatter", null);
        term50518 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term50518, term50518.getClass(), "iPrinters", null);
        setField(term50518, term50518.getClass(), "iParsers", null);
        setIntField(term50518, term50518.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term50518, term50518.getClass(), "iParsedLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term50276;
        callMethod(klass, "isParser", argTypes, term50160, args);
        assertTrue(recursiveEquals(term50160, term50517));
        assertTrue(recursiveEquals(term50276, term50518));
    }

};


