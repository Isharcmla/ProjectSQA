package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.lang.Object;
import java.util.LinkedHashMap;

public class ExtendedMessageFormat_init_84156248922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;
     Object term138;
     Object term2485;
     Object term2506;
     Object term2516;

    public ExtendedMessageFormat_init_84156248922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124 = newInstance(Class.forName("java.util.Locale"));
        Object term125 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term125, term125.getClass(), "language", "ps");
        setField(term125, term125.getClass(), "script", "");
        setField(term125, term125.getClass(), "region", "");
        setField(term125, term125.getClass(), "variant", "");
        setIntField(term125, term125.getClass(), "hash", 106860317);
        setField(term124, term124.getClass(), "baseLocale", term125);
        setField(term124, term124.getClass(), "localeExtensions", null);
        setIntField(term124, term124.getClass(), "hashCodeValue", 106860317);
        setField(term124, term124.getClass(), "languageTag", null);
        term138 = new LinkedHashMap();
        LinkedHashMap term2488 = new LinkedHashMap();
        term2485 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term2489 = newInstance(Class.forName("java.util.Locale"));
        Object term2490 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2501 = (Object[]) newArray("java.text.Format", 10);
        int[] term2502 = (int[]) newIntArray(10);
        int[] term2503 = (int[]) newIntArray(10);
        setField(term2485, term2485.getClass(), "toPattern", "xxtlPwDYFs");
        setField(term2485, term2485.getClass(), "registry", term2488);
        setField(term2490, term2490.getClass(), "language", "ps");
        setField(term2490, term2490.getClass(), "script", "");
        setField(term2490, term2490.getClass(), "region", "");
        setField(term2490, term2490.getClass(), "variant", "");
        setIntField(term2490, term2490.getClass(), "hash", 106860317);
        setField(term2489, term2489.getClass(), "baseLocale", term2490);
        setField(term2489, term2489.getClass(), "localeExtensions", null);
        setIntField(term2489, term2489.getClass(), "hashCodeValue", 106860317);
        setField(term2489, term2489.getClass(), "languageTag", null);
        setField(term2485, term2485.getClass(), "locale", term2489);
        setField(term2485, term2485.getClass(), "pattern", "xxtlPwDYFs");
        setField(term2485, term2485.getClass(), "formats", term2501);
        setField(term2485, term2485.getClass(), "offsets", term2502);
        setField(term2485, term2485.getClass(), "argumentNumbers", term2503);
        setIntField(term2485, term2485.getClass(), "maxOffset", -1);
        term2506 = newInstance(Class.forName("java.util.Locale"));
        Object term2507 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2507, term2507.getClass(), "language", "ps");
        setField(term2507, term2507.getClass(), "script", "");
        setField(term2507, term2507.getClass(), "region", "");
        setField(term2507, term2507.getClass(), "variant", "");
        setIntField(term2507, term2507.getClass(), "hash", 106860317);
        setField(term2506, term2506.getClass(), "baseLocale", term2507);
        setField(term2506, term2506.getClass(), "localeExtensions", null);
        setIntField(term2506, term2506.getClass(), "hashCodeValue", 106860317);
        setField(term2506, term2506.getClass(), "languageTag", null);
        term2516 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = "xxtlPwDYFs";
        args[1] = term124;
        args[2] = term138;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2485));
        assertTrue(recursiveEquals(term124, term2506));
        assertTrue(recursiveEquals(term138, term2516));
    }

};


