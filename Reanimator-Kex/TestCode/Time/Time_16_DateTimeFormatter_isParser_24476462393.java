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

public class DateTimeFormatter_isParser_24476462393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10825;
     Object term10965;

    public DateTimeFormatter_isParser_24476462393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10825 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term10949 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term10825, term10825.getClass(), "iParser", term10949);
        term10965 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term10966 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term10965, term10965.getClass(), "iPrinter", null);
        setField(term10966, term10966.getClass(), "iValue", null);
        setField(term10965, term10965.getClass(), "iParser", term10966);
        setField(term10965, term10965.getClass(), "iLocale", null);
        setBooleanField(term10965, term10965.getClass(), "iOffsetParsed", false);
        setField(term10965, term10965.getClass(), "iChrono", null);
        setField(term10965, term10965.getClass(), "iZone", null);
        setField(term10965, term10965.getClass(), "iPivotYear", null);
        setIntField(term10965, term10965.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isParser", argTypes, term10825, args);
        assertTrue(recursiveEquals(term10825, term10965));
        assertTrue(recursiveEquals(retValue, true));
    }

};


