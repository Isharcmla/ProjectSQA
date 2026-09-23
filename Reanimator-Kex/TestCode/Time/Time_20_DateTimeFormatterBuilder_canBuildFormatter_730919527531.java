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

public class DateTimeFormatterBuilder_canBuildFormatter_730919527531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110151;
     Object term110321;

    public DateTimeFormatterBuilder_canBuildFormatter_730919527531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term110299 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList term110203 = new ArrayList();
        ((ArrayList) term110203).add(term110299);
        ((ArrayList) term110203).add(term110299);
        term110151 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term110151, term110151.getClass(), "iFormatter", null);
        setField(term110151, term110151.getClass(), "iElementPairs", term110203);
        Object term110324 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term110324, term110324.getClass(), "iElementPairs", null);
        setField(term110324, term110324.getClass(), "iFormatter", null);
        ArrayList term110322 = new ArrayList();
        ((ArrayList) term110322).add(term110324);
        ((ArrayList) term110322).add(term110324);
        term110321 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term110321, term110321.getClass(), "iElementPairs", term110322);
        setField(term110321, term110321.getClass(), "iFormatter", term110324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildFormatter", argTypes, term110151, args);
        assertTrue(recursiveEquals(term110151, term110321));
    }

};


