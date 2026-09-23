package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class FastDateFormat_getDateTimeInstance_105874964514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1218;
     Object term1220;
     Object term1222;

    public FastDateFormat_getDateTimeInstance_105874964514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1218 = new Integer(1725571209);
        term1220 = new Integer(-522618178);
        term1222 = newInstance(Class.forName("java.util.Locale"));
        Object term1223 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1223, term1223.getClass(), "language", "se");
        setField(term1223, term1223.getClass(), "script", "");
        setField(term1223, term1223.getClass(), "region", "SE");
        setField(term1223, term1223.getClass(), "variant", "");
        setIntField(term1223, term1223.getClass(), "hash", 109295708);
        setField(term1222, term1222.getClass(), "baseLocale", term1223);
        setField(term1222, term1222.getClass(), "localeExtensions", null);
        setIntField(term1222, term1222.getClass(), "hashCodeValue", 109295708);
        setField(term1222, term1222.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = term1218;
        args[1] = term1220;
        args[2] = term1222;
        callMethod(klass, "getDateTimeInstance", argTypes, null, args);
    }

};


