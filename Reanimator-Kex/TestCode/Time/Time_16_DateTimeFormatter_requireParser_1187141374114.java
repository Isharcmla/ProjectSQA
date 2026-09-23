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

public class DateTimeFormatter_requireParser_1187141374114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17716;
     Object term18266;
     Object term18262;

    public DateTimeFormatter_requireParser_1187141374114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17716 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term17840 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term17716, term17716.getClass(), "iParser", term17840);
        term18266 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term18267 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term18266, term18266.getClass(), "iPrinter", null);
        setField(term18267, term18267.getClass(), "iValue", null);
        setField(term18266, term18266.getClass(), "iParser", term18267);
        setField(term18266, term18266.getClass(), "iLocale", null);
        setBooleanField(term18266, term18266.getClass(), "iOffsetParsed", false);
        setField(term18266, term18266.getClass(), "iChrono", null);
        setField(term18266, term18266.getClass(), "iZone", null);
        setField(term18266, term18266.getClass(), "iPivotYear", null);
        setIntField(term18266, term18266.getClass(), "iDefaultYear", 0);
        term18262 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term18262, term18262.getClass(), "iValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "requireParser", argTypes, term17716, args);
        assertTrue(recursiveEquals(term17716, term18266));
        assertTrue(recursiveEquals(retValue, term18262));
    }

};


