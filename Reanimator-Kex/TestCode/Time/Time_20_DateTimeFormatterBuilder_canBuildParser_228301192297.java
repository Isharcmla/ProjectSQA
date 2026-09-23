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

public class DateTimeFormatterBuilder_canBuildParser_228301192297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42306;
     Object term43220;

    public DateTimeFormatterBuilder_canBuildParser_228301192297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term42358 = new ArrayList();
        term42306 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term42306, term42306.getClass(), "iFormatter", null);
        setField(term42306, term42306.getClass(), "iElementPairs", term42358);
        ArrayList term43221 = new ArrayList();
        term43220 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term43223 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term43220, term43220.getClass(), "iElementPairs", term43221);
        setField(term43223, term43223.getClass(), "iPrinters", null);
        setField(term43223, term43223.getClass(), "iParsers", null);
        setIntField(term43223, term43223.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term43223, term43223.getClass(), "iParsedLengthEstimate", 0);
        setField(term43220, term43220.getClass(), "iFormatter", term43223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildParser", argTypes, term42306, args);
        assertTrue(recursiveEquals(term42306, term43220));
    }

};


