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
import java.util.LinkedHashMap;
import java.lang.Object;

public class ExtendedMessageFormat_init_91944979621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;
     Object term2302;
     Object term2325;

    public ExtendedMessageFormat_init_91944979621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = new LinkedHashMap();
        LinkedHashMap term2305 = new LinkedHashMap();
        term2302 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term2306 = newInstance(Class.forName("java.util.Locale"));
        Object term2307 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2320 = (Object[]) newArray("java.text.Format", 10);
        int[] term2321 = (int[]) newIntArray(10);
        int[] term2322 = (int[]) newIntArray(10);
        setField(term2302, term2302.getClass(), "toPattern", "MuLcgQHgqz");
        setField(term2302, term2302.getClass(), "registry", term2305);
        setField(term2307, term2307.getClass(), "language", "en");
        setField(term2307, term2307.getClass(), "script", "");
        setField(term2307, term2307.getClass(), "region", "US");
        setField(term2307, term2307.getClass(), "variant", "");
        setIntField(term2307, term2307.getClass(), "hash", 96636889);
        setField(term2306, term2306.getClass(), "baseLocale", term2307);
        setField(term2306, term2306.getClass(), "localeExtensions", null);
        setIntField(term2306, term2306.getClass(), "hashCodeValue", 96636889);
        setField(term2306, term2306.getClass(), "languageTag", "en-US");
        setField(term2302, term2302.getClass(), "locale", term2306);
        setField(term2302, term2302.getClass(), "pattern", "MuLcgQHgqz");
        setField(term2302, term2302.getClass(), "formats", term2320);
        setField(term2302, term2302.getClass(), "offsets", term2321);
        setField(term2302, term2302.getClass(), "argumentNumbers", term2322);
        setIntField(term2302, term2302.getClass(), "maxOffset", -1);
        term2325 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = term77;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2302));
        assertTrue(recursiveEquals(term77, term2325));
    }

};


