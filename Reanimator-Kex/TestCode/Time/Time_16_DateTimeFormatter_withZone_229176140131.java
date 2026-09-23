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

public class DateTimeFormatter_withZone_229176140131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23226;
     Object term23340;
     Object term23625;
     Object term23626;
     Object term23619;

    public DateTimeFormatter_withZone_229176140131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23226 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term23226, term23226.getClass(), "iZone", null);
        term23340 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        term23625 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term23625, term23625.getClass(), "iPrinter", null);
        setField(term23625, term23625.getClass(), "iParser", null);
        setField(term23625, term23625.getClass(), "iLocale", null);
        setBooleanField(term23625, term23625.getClass(), "iOffsetParsed", false);
        setField(term23625, term23625.getClass(), "iChrono", null);
        setField(term23625, term23625.getClass(), "iZone", null);
        setField(term23625, term23625.getClass(), "iPivotYear", null);
        setIntField(term23625, term23625.getClass(), "iDefaultYear", 0);
        term23626 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term23626, term23626.getClass(), "iTransitions", null);
        setField(term23626, term23626.getClass(), "iWallOffsets", null);
        setField(term23626, term23626.getClass(), "iStandardOffsets", null);
        setField(term23626, term23626.getClass(), "iNameKeys", null);
        setField(term23626, term23626.getClass(), "iTailZone", null);
        setField(term23626, term23626.getClass(), "iID", null);
        term23619 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term23617 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term23619, term23619.getClass(), "iPrinter", null);
        setField(term23619, term23619.getClass(), "iParser", null);
        setField(term23619, term23619.getClass(), "iLocale", null);
        setBooleanField(term23619, term23619.getClass(), "iOffsetParsed", false);
        setField(term23619, term23619.getClass(), "iChrono", null);
        setField(term23617, term23617.getClass(), "iTransitions", null);
        setField(term23617, term23617.getClass(), "iWallOffsets", null);
        setField(term23617, term23617.getClass(), "iStandardOffsets", null);
        setField(term23617, term23617.getClass(), "iNameKeys", null);
        setField(term23617, term23617.getClass(), "iTailZone", null);
        setField(term23617, term23617.getClass(), "iID", null);
        setField(term23619, term23619.getClass(), "iZone", term23617);
        setField(term23619, term23619.getClass(), "iPivotYear", null);
        setIntField(term23619, term23619.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[1];
        args[0] = term23340;
        Object retValue = callMethod(klass, "withZone", argTypes, term23226, args);
        assertTrue(recursiveEquals(term23226, term23625));
        assertTrue(recursiveEquals(term23340, term23626));
        assertTrue(recursiveEquals(retValue, term23619));
    }

};


