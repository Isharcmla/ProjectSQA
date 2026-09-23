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
import java.util.LinkedHashMap;
import java.lang.Object;

public class ExtendedMessageFormat_init_179793485521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;
     Object term2256;
     Object term2279;

    public ExtendedMessageFormat_init_179793485521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = new LinkedHashMap();
        LinkedHashMap term2259 = new LinkedHashMap();
        term2256 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term2260 = newInstance(Class.forName("java.util.Locale"));
        Object term2261 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2274 = (Object[]) newArray("java.text.Format", 10);
        int[] term2275 = (int[]) newIntArray(10);
        int[] term2276 = (int[]) newIntArray(10);
        setField(term2256, term2256.getClass(), "toPattern", "MuLcgQHgqz");
        setField(term2256, term2256.getClass(), "registry", term2259);
        setField(term2261, term2261.getClass(), "language", "en");
        setField(term2261, term2261.getClass(), "script", "");
        setField(term2261, term2261.getClass(), "region", "US");
        setField(term2261, term2261.getClass(), "variant", "");
        setIntField(term2261, term2261.getClass(), "hash", 96636889);
        setField(term2260, term2260.getClass(), "baseLocale", term2261);
        setField(term2260, term2260.getClass(), "localeExtensions", null);
        setIntField(term2260, term2260.getClass(), "hashCodeValue", 96636889);
        setField(term2260, term2260.getClass(), "languageTag", "en-US");
        setField(term2256, term2256.getClass(), "locale", term2260);
        setField(term2256, term2256.getClass(), "pattern", "MuLcgQHgqz");
        setField(term2256, term2256.getClass(), "formats", term2274);
        setField(term2256, term2256.getClass(), "offsets", term2275);
        setField(term2256, term2256.getClass(), "argumentNumbers", term2276);
        setIntField(term2256, term2256.getClass(), "maxOffset", -1);
        term2279 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = term77;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2256));
        assertTrue(recursiveEquals(term77, term2279));
    }

};


