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
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatter_printTo_176392743221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522;
     Object term543;

    public DateTimeFormatter_printTo_176392743221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term540 = new Integer(-6029667);
        term522 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term523 = newInstance(Class.forName("java.util.Locale"));
        Object term524 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term522, term522.getClass(), "iPrinter", null);
        setField(term522, term522.getClass(), "iParser", null);
        setField(term524, term524.getClass(), "language", "de");
        setField(term524, term524.getClass(), "script", "");
        setField(term524, term524.getClass(), "region", "AT");
        setField(term524, term524.getClass(), "variant", "");
        setIntField(term524, term524.getClass(), "hash", 95426060);
        setField(term523, term523.getClass(), "baseLocale", term524);
        setField(term523, term523.getClass(), "localeExtensions", null);
        setIntField(term523, term523.getClass(), "hashCodeValue", 95426060);
        setField(term523, term523.getClass(), "languageTag", null);
        setField(term522, term522.getClass(), "iLocale", term523);
        setBooleanField(term522, term522.getClass(), "iOffsetParsed", true);
        setField(term522, term522.getClass(), "iChrono", null);
        setField(term522, term522.getClass(), "iZone", null);
        setField(term522, term522.getClass(), "iPivotYear", term540);
        setIntField(term522, term522.getClass(), "iDefaultYear", -2068769794);
        term543 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term556 = (byte[]) newByteArray(16);
        setField(term543, term543.getClass(), "toStringCache", "PAEBtnZtTD");
        setField(term543, term543.getClass(), "value", term556);
        setByteField(term543, term543.getClass(), "coder", (byte) 47);
        setIntField(term543, term543.getClass(), "count", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[2];
        args[0] = term543;
        args[1] = null;
        callMethod(klass, "printTo", argTypes, term522, args);
    }

};


