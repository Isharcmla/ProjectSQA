package org.apache.commons.lang3.text;

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
import static org.apache.commons.lang3.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.text.EqualityUtils.*;
import java.lang.Object;

public class ExtendedMessageFormat_init_73678202220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term2032;
     Object term2052;

    public ExtendedMessageFormat_init_73678202220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = newInstance(Class.forName("java.util.Locale"));
        Object term36 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term36, term36.getClass(), "language", "pt");
        setField(term36, term36.getClass(), "script", "");
        setField(term36, term36.getClass(), "region", "MO");
        setField(term36, term36.getClass(), "variant", "");
        setIntField(term36, term36.getClass(), "hash", 106966554);
        setField(term35, term35.getClass(), "baseLocale", term36);
        setField(term35, term35.getClass(), "localeExtensions", null);
        setIntField(term35, term35.getClass(), "hashCodeValue", 106966554);
        setField(term35, term35.getClass(), "languageTag", null);
        term2032 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term2035 = newInstance(Class.forName("java.util.Locale"));
        Object term2036 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2047 = (Object[]) newArray("java.text.Format", 10);
        int[] term2048 = (int[]) newIntArray(10);
        int[] term2049 = (int[]) newIntArray(10);
        setField(term2032, term2032.getClass(), "toPattern", "sjlJAEtRrb");
        setField(term2032, term2032.getClass(), "registry", null);
        setField(term2036, term2036.getClass(), "language", "pt");
        setField(term2036, term2036.getClass(), "script", "");
        setField(term2036, term2036.getClass(), "region", "MO");
        setField(term2036, term2036.getClass(), "variant", "");
        setIntField(term2036, term2036.getClass(), "hash", 106966554);
        setField(term2035, term2035.getClass(), "baseLocale", term2036);
        setField(term2035, term2035.getClass(), "localeExtensions", null);
        setIntField(term2035, term2035.getClass(), "hashCodeValue", 106966554);
        setField(term2035, term2035.getClass(), "languageTag", null);
        setField(term2032, term2032.getClass(), "locale", term2035);
        setField(term2032, term2032.getClass(), "pattern", "sjlJAEtRrb");
        setField(term2032, term2032.getClass(), "formats", term2047);
        setField(term2032, term2032.getClass(), "offsets", term2048);
        setField(term2032, term2032.getClass(), "argumentNumbers", term2049);
        setIntField(term2032, term2032.getClass(), "maxOffset", -1);
        term2052 = newInstance(Class.forName("java.util.Locale"));
        Object term2053 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2053, term2053.getClass(), "language", "pt");
        setField(term2053, term2053.getClass(), "script", "");
        setField(term2053, term2053.getClass(), "region", "MO");
        setField(term2053, term2053.getClass(), "variant", "");
        setIntField(term2053, term2053.getClass(), "hash", 106966554);
        setField(term2052, term2052.getClass(), "baseLocale", term2053);
        setField(term2052, term2052.getClass(), "localeExtensions", null);
        setIntField(term2052, term2052.getClass(), "hashCodeValue", 106966554);
        setField(term2052, term2052.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = "sjlJAEtRrb";
        args[1] = term35;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2032));
        assertTrue(recursiveEquals(term35, term2052));
    }

};


