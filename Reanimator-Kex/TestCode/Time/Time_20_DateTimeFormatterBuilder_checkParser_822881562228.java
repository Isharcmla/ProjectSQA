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

public class DateTimeFormatterBuilder_checkParser_822881562228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28883;
     Object term28999;
     Object term29136;
     Object term29137;

    public DateTimeFormatterBuilder_checkParser_822881562228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28883 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term28999 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        term29136 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term29136, term29136.getClass(), "iElementPairs", null);
        setField(term29136, term29136.getClass(), "iFormatter", null);
        term29137 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term29137, term29137.getClass(), "iPrinters", null);
        setField(term29137, term29137.getClass(), "iParsers", null);
        setIntField(term29137, term29137.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term29137, term29137.getClass(), "iParsedLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimeParser");
        Object[] args = new Object[1];
        args[0] = term28999;
        callMethod(klass, "checkParser", argTypes, term28883, args);
        assertTrue(recursiveEquals(term28883, term29136));
        assertTrue(recursiveEquals(term28999, term29137));
    }

};


