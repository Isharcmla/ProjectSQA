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

public class DateTimeFormatterBuilder_getFormatter_212779326481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86558;
     Object term86644;
     Object term86636;

    public DateTimeFormatterBuilder_getFormatter_212779326481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term86610 = new ArrayList();
        ((ArrayList) term86610).add((Object)null);
        ((ArrayList) term86610).add((Object)null);
        term86558 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term86558, term86558.getClass(), "iFormatter", null);
        setField(term86558, term86558.getClass(), "iElementPairs", term86610);
        ArrayList term86645 = new ArrayList();
        ((ArrayList) term86645).add((Object)null);
        ((ArrayList) term86645).add((Object)null);
        term86644 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term86647 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term86644, term86644.getClass(), "iElementPairs", term86645);
        setField(term86647, term86647.getClass(), "iPrinters", null);
        setField(term86647, term86647.getClass(), "iParsers", null);
        setIntField(term86647, term86647.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term86647, term86647.getClass(), "iParsedLengthEstimate", 0);
        setField(term86644, term86644.getClass(), "iFormatter", term86647);
        term86636 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term86636, term86636.getClass(), "iPrinters", null);
        setField(term86636, term86636.getClass(), "iParsers", null);
        setIntField(term86636, term86636.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term86636, term86636.getClass(), "iParsedLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFormatter", argTypes, term86558, args);
        assertTrue(recursiveEquals(term86558, term86644));
        assertTrue(recursiveEquals(retValue, term86636));
    }

};


