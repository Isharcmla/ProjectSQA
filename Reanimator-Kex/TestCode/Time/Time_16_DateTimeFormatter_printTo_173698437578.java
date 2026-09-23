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
import java.lang.Long;

public class DateTimeFormatter_printTo_173698437578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996;
     Object term1015;
     Object term1047;

    public DateTimeFormatter_printTo_173698437578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1012 = new Integer(-226514366);
        term996 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term997 = newInstance(Class.forName("java.util.Locale"));
        Object term998 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term996, term996.getClass(), "iPrinter", null);
        setField(term996, term996.getClass(), "iParser", null);
        setField(term998, term998.getClass(), "language", "ji");
        setField(term998, term998.getClass(), "script", "");
        setField(term998, term998.getClass(), "region", "");
        setField(term998, term998.getClass(), "variant", "");
        setIntField(term998, term998.getClass(), "hash", 101021281);
        setField(term997, term997.getClass(), "baseLocale", term998);
        setField(term997, term997.getClass(), "localeExtensions", null);
        setIntField(term997, term997.getClass(), "hashCodeValue", 101021281);
        setField(term997, term997.getClass(), "languageTag", null);
        setField(term996, term996.getClass(), "iLocale", term997);
        setBooleanField(term996, term996.getClass(), "iOffsetParsed", true);
        setField(term996, term996.getClass(), "iChrono", null);
        setField(term996, term996.getClass(), "iZone", null);
        setField(term996, term996.getClass(), "iPivotYear", term1012);
        setIntField(term996, term996.getClass(), "iDefaultYear", -469968304);
        term1015 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1028 = (byte[]) newByteArray(16);
        setField(term1015, term1015.getClass(), "toStringCache", "xxtlPwDYFs");
        setField(term1015, term1015.getClass(), "value", term1028);
        setByteField(term1015, term1015.getClass(), "coder", (byte) 75);
        setIntField(term1015, term1015.getClass(), "count", -1145578966);
        term1047 = new Long(5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[3];
        args[0] = term1015;
        args[1] = term1047;
        args[2] = null;
        try {
            callMethod(klass, "printTo", argTypes, term996, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


