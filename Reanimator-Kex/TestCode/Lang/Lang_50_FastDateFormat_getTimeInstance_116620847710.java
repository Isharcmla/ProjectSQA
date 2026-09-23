package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class FastDateFormat_getTimeInstance_116620847710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789;
     Object term791;

    public FastDateFormat_getTimeInstance_116620847710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term789 = new Integer(-616727354);
        term791 = newInstance(Class.forName("java.util.Locale"));
        Object term792 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term792, term792.getClass(), "language", "chr");
        setField(term792, term792.getClass(), "script", "");
        setField(term792, term792.getClass(), "region", "US");
        setField(term792, term792.getClass(), "variant", "");
        setIntField(term792, term792.getClass(), "hash", -1361154731);
        setField(term791, term791.getClass(), "baseLocale", term792);
        setField(term791, term791.getClass(), "localeExtensions", null);
        setIntField(term791, term791.getClass(), "hashCodeValue", -1361154731);
        setField(term791, term791.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term789;
        args[1] = term791;
        callMethod(klass, "getTimeInstance", argTypes, null, args);
    }

};


