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

public class DateTimeFormatterBuilder_canBuildParser_228301192439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72814;
     Object term72915;

    public DateTimeFormatterBuilder_canBuildParser_228301192439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72866 = new ArrayList();
        ((ArrayList) term72866).add((Object)null);
        ((ArrayList) term72866).add((Object)null);
        term72814 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term72814, term72814.getClass(), "iFormatter", null);
        setField(term72814, term72814.getClass(), "iElementPairs", term72866);
        ArrayList term72916 = new ArrayList();
        ((ArrayList) term72916).add((Object)null);
        ((ArrayList) term72916).add((Object)null);
        term72915 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term72918 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term72915, term72915.getClass(), "iElementPairs", term72916);
        setField(term72918, term72918.getClass(), "iPrinters", null);
        setField(term72918, term72918.getClass(), "iParsers", null);
        setIntField(term72918, term72918.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term72918, term72918.getClass(), "iParsedLengthEstimate", 0);
        setField(term72915, term72915.getClass(), "iFormatter", term72918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildParser", argTypes, term72814, args);
        assertTrue(recursiveEquals(term72814, term72915));
    }

};


