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

public class DateTimeFormatterBuilder_getFormatter_212779326487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91341;
     Object term91423;
     Object term91415;

    public DateTimeFormatterBuilder_getFormatter_212779326487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term91393 = new ArrayList();
        term91341 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term91341, term91341.getClass(), "iFormatter", null);
        setField(term91341, term91341.getClass(), "iElementPairs", term91393);
        ArrayList term91424 = new ArrayList();
        term91423 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term91426 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term91423, term91423.getClass(), "iElementPairs", term91424);
        setField(term91426, term91426.getClass(), "iPrinters", null);
        setField(term91426, term91426.getClass(), "iParsers", null);
        setIntField(term91426, term91426.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term91426, term91426.getClass(), "iParsedLengthEstimate", 0);
        setField(term91423, term91423.getClass(), "iFormatter", term91426);
        term91415 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term91415, term91415.getClass(), "iPrinters", null);
        setField(term91415, term91415.getClass(), "iParsers", null);
        setIntField(term91415, term91415.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term91415, term91415.getClass(), "iParsedLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFormatter", argTypes, term91341, args);
        assertTrue(recursiveEquals(term91341, term91423));
        assertTrue(recursiveEquals(retValue, term91415));
    }

};


