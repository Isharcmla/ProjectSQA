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
import java.lang.Object;

public class DateTimeFormatterBuilder_canBuildFormatter_730919527316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46816;
     Object term47191;

    public DateTimeFormatterBuilder_canBuildFormatter_730919527316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46816 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term46932 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term46816, term46816.getClass(), "iFormatter", term46932);
        term47191 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term47192 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term47191, term47191.getClass(), "iElementPairs", null);
        setField(term47192, term47192.getClass(), "iPrinters", null);
        setField(term47192, term47192.getClass(), "iParsers", null);
        setIntField(term47192, term47192.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term47192, term47192.getClass(), "iParsedLengthEstimate", 0);
        setField(term47191, term47191.getClass(), "iFormatter", term47192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildFormatter", argTypes, term46816, args);
        assertTrue(recursiveEquals(term46816, term47191));
    }

};


