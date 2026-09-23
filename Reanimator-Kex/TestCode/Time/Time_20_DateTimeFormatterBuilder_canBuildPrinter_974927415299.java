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

public class DateTimeFormatterBuilder_canBuildPrinter_974927415299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43123;
     Object term44162;

    public DateTimeFormatterBuilder_canBuildPrinter_974927415299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term43175 = new ArrayList();
        term43123 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term43123, term43123.getClass(), "iFormatter", null);
        setField(term43123, term43123.getClass(), "iElementPairs", term43175);
        ArrayList term44163 = new ArrayList();
        term44162 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term44165 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term44162, term44162.getClass(), "iElementPairs", term44163);
        setField(term44165, term44165.getClass(), "iPrinters", null);
        setField(term44165, term44165.getClass(), "iParsers", null);
        setIntField(term44165, term44165.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term44165, term44165.getClass(), "iParsedLengthEstimate", 0);
        setField(term44162, term44162.getClass(), "iFormatter", term44165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildPrinter", argTypes, term43123, args);
        assertTrue(recursiveEquals(term43123, term44162));
    }

};


