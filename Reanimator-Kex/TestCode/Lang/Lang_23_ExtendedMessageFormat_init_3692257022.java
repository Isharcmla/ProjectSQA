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
import java.util.LinkedHashMap;

public class ExtendedMessageFormat_init_3692257022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;
     Object term167;
     Object term2531;
     Object term2552;
     Object term2562;

    public ExtendedMessageFormat_init_3692257022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = newInstance(Class.forName("java.util.Locale"));
        Object term154 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term154, term154.getClass(), "language", "ps");
        setField(term154, term154.getClass(), "script", "");
        setField(term154, term154.getClass(), "region", "");
        setField(term154, term154.getClass(), "variant", "");
        setIntField(term154, term154.getClass(), "hash", 106860317);
        setField(term153, term153.getClass(), "baseLocale", term154);
        setField(term153, term153.getClass(), "localeExtensions", null);
        setIntField(term153, term153.getClass(), "hashCodeValue", 106860317);
        setField(term153, term153.getClass(), "languageTag", null);
        term167 = new LinkedHashMap();
        LinkedHashMap term2534 = new LinkedHashMap();
        term2531 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term2535 = newInstance(Class.forName("java.util.Locale"));
        Object term2536 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2547 = (Object[]) newArray("java.text.Format", 10);
        int[] term2548 = (int[]) newIntArray(10);
        int[] term2549 = (int[]) newIntArray(10);
        setField(term2531, term2531.getClass(), "toPattern", "hRNSzYYIrc");
        setField(term2531, term2531.getClass(), "registry", term2534);
        setField(term2536, term2536.getClass(), "language", "ps");
        setField(term2536, term2536.getClass(), "script", "");
        setField(term2536, term2536.getClass(), "region", "");
        setField(term2536, term2536.getClass(), "variant", "");
        setIntField(term2536, term2536.getClass(), "hash", 106860317);
        setField(term2535, term2535.getClass(), "baseLocale", term2536);
        setField(term2535, term2535.getClass(), "localeExtensions", null);
        setIntField(term2535, term2535.getClass(), "hashCodeValue", 106860317);
        setField(term2535, term2535.getClass(), "languageTag", null);
        setField(term2531, term2531.getClass(), "locale", term2535);
        setField(term2531, term2531.getClass(), "pattern", "hRNSzYYIrc");
        setField(term2531, term2531.getClass(), "formats", term2547);
        setField(term2531, term2531.getClass(), "offsets", term2548);
        setField(term2531, term2531.getClass(), "argumentNumbers", term2549);
        setIntField(term2531, term2531.getClass(), "maxOffset", -1);
        term2552 = newInstance(Class.forName("java.util.Locale"));
        Object term2553 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2553, term2553.getClass(), "language", "ps");
        setField(term2553, term2553.getClass(), "script", "");
        setField(term2553, term2553.getClass(), "region", "");
        setField(term2553, term2553.getClass(), "variant", "");
        setIntField(term2553, term2553.getClass(), "hash", 106860317);
        setField(term2552, term2552.getClass(), "baseLocale", term2553);
        setField(term2552, term2552.getClass(), "localeExtensions", null);
        setIntField(term2552, term2552.getClass(), "hashCodeValue", 106860317);
        setField(term2552, term2552.getClass(), "languageTag", null);
        term2562 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = "hRNSzYYIrc";
        args[1] = term153;
        args[2] = term167;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2531));
        assertTrue(recursiveEquals(term153, term2552));
        assertTrue(recursiveEquals(term167, term2562));
    }

};


