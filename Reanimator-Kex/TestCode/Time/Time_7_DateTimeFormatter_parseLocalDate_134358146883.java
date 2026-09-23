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
import java.lang.UnsupportedOperationException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatter_parseLocalDate_134358146883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1219;

    public DateTimeFormatter_parseLocalDate_134358146883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1238 = new Integer(-1145578966);
        term1219 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1220 = newInstance(Class.forName("java.util.Locale"));
        Object term1221 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1219, term1219.getClass(), "iPrinter", null);
        setField(term1219, term1219.getClass(), "iParser", null);
        setField(term1221, term1221.getClass(), "language", "nds");
        setField(term1221, term1221.getClass(), "script", "");
        setField(term1221, term1221.getClass(), "region", "DE");
        setField(term1221, term1221.getClass(), "variant", "");
        setIntField(term1221, term1221.getClass(), "hash", -1049915134);
        setField(term1220, term1220.getClass(), "baseLocale", term1221);
        setField(term1220, term1220.getClass(), "localeExtensions", null);
        setIntField(term1220, term1220.getClass(), "hashCodeValue", -1049915134);
        setField(term1220, term1220.getClass(), "languageTag", null);
        setField(term1219, term1219.getClass(), "iLocale", term1220);
        setBooleanField(term1219, term1219.getClass(), "iOffsetParsed", true);
        setField(term1219, term1219.getClass(), "iChrono", null);
        setField(term1219, term1219.getClass(), "iZone", null);
        setField(term1219, term1219.getClass(), "iPivotYear", term1238);
        setIntField(term1219, term1219.getClass(), "iDefaultYear", 1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        try {
            callMethod(klass, "parseLocalDate", argTypes, term1219, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


