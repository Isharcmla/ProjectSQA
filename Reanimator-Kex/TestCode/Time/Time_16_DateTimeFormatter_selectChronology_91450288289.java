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

public class DateTimeFormatter_selectChronology_91450288289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9556;

    public DateTimeFormatter_selectChronology_91450288289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9556 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term9556, term9556.getClass(), "iPrinter", null);
        setField(term9556, term9556.getClass(), "iParser", null);
        setField(term9556, term9556.getClass(), "iLocale", null);
        setBooleanField(term9556, term9556.getClass(), "iOffsetParsed", false);
        setField(term9556, term9556.getClass(), "iChrono", null);
        setField(term9556, term9556.getClass(), "iZone", null);
        setField(term9556, term9556.getClass(), "iPivotYear", null);
        setIntField(term9556, term9556.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "selectChronology", argTypes, term9556, args);
    }

};


