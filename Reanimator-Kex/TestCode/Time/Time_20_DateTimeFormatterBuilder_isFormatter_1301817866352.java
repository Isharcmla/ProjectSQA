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

public class DateTimeFormatterBuilder_isFormatter_1301817866352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54335;
     Object term54451;
     Object term54768;
     Object term54769;

    public DateTimeFormatterBuilder_isFormatter_1301817866352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54335 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term54451 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        term54768 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term54768, term54768.getClass(), "iElementPairs", null);
        setField(term54768, term54768.getClass(), "iFormatter", null);
        term54769 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term54769, term54769.getClass(), "iPrinters", null);
        setField(term54769, term54769.getClass(), "iParsers", null);
        setIntField(term54769, term54769.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term54769, term54769.getClass(), "iParsedLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term54451;
        Object retValue = callMethod(klass, "isFormatter", argTypes, term54335, args);
        assertTrue(recursiveEquals(term54335, term54768));
        assertTrue(recursiveEquals(term54451, term54769));
        assertTrue(recursiveEquals(retValue, false));
    }

};


