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

public class DateTimeFormatter_printTo_113020650472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term790;
     Object term809;

    public DateTimeFormatter_printTo_113020650472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term806 = new Integer(865208305);
        term790 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term791 = newInstance(Class.forName("java.util.Locale"));
        Object term792 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term790, term790.getClass(), "iPrinter", null);
        setField(term790, term790.getClass(), "iParser", null);
        setField(term792, term792.getClass(), "language", "fo");
        setField(term792, term792.getClass(), "script", "");
        setField(term792, term792.getClass(), "region", "");
        setField(term792, term792.getClass(), "variant", "");
        setIntField(term792, term792.getClass(), "hash", 97505943);
        setField(term791, term791.getClass(), "baseLocale", term792);
        setField(term791, term791.getClass(), "localeExtensions", null);
        setIntField(term791, term791.getClass(), "hashCodeValue", 97505943);
        setField(term791, term791.getClass(), "languageTag", null);
        setField(term790, term790.getClass(), "iLocale", term791);
        setBooleanField(term790, term790.getClass(), "iOffsetParsed", false);
        setField(term790, term790.getClass(), "iChrono", null);
        setField(term790, term790.getClass(), "iZone", null);
        setField(term790, term790.getClass(), "iPivotYear", term806);
        setIntField(term790, term790.getClass(), "iDefaultYear", -203030934);
        term809 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term822 = (byte[]) newByteArray(16);
        setField(term809, term809.getClass(), "toStringCache", "MuLcgQHgqz");
        setField(term809, term809.getClass(), "value", term822);
        setByteField(term809, term809.getClass(), "coder", (byte) 89);
        setIntField(term809, term809.getClass(), "count", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[2];
        args[0] = term809;
        args[1] = null;
        try {
            callMethod(klass, "printTo", argTypes, term790, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


