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

public class ExtendedMessageFormat_init_161526708120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term1986;
     Object term2006;

    public ExtendedMessageFormat_init_161526708120() {
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
        term1986 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term1989 = newInstance(Class.forName("java.util.Locale"));
        Object term1990 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2001 = (Object[]) newArray("java.text.Format", 10);
        int[] term2002 = (int[]) newIntArray(10);
        int[] term2003 = (int[]) newIntArray(10);
        setField(term1986, term1986.getClass(), "toPattern", "sjlJAEtRrb");
        setField(term1986, term1986.getClass(), "registry", null);
        setField(term1990, term1990.getClass(), "language", "pt");
        setField(term1990, term1990.getClass(), "script", "");
        setField(term1990, term1990.getClass(), "region", "MO");
        setField(term1990, term1990.getClass(), "variant", "");
        setIntField(term1990, term1990.getClass(), "hash", 106966554);
        setField(term1989, term1989.getClass(), "baseLocale", term1990);
        setField(term1989, term1989.getClass(), "localeExtensions", null);
        setIntField(term1989, term1989.getClass(), "hashCodeValue", 106966554);
        setField(term1989, term1989.getClass(), "languageTag", null);
        setField(term1986, term1986.getClass(), "locale", term1989);
        setField(term1986, term1986.getClass(), "pattern", "sjlJAEtRrb");
        setField(term1986, term1986.getClass(), "formats", term2001);
        setField(term1986, term1986.getClass(), "offsets", term2002);
        setField(term1986, term1986.getClass(), "argumentNumbers", term2003);
        setIntField(term1986, term1986.getClass(), "maxOffset", -1);
        term2006 = newInstance(Class.forName("java.util.Locale"));
        Object term2007 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2007, term2007.getClass(), "language", "pt");
        setField(term2007, term2007.getClass(), "script", "");
        setField(term2007, term2007.getClass(), "region", "MO");
        setField(term2007, term2007.getClass(), "variant", "");
        setIntField(term2007, term2007.getClass(), "hash", 106966554);
        setField(term2006, term2006.getClass(), "baseLocale", term2007);
        setField(term2006, term2006.getClass(), "localeExtensions", null);
        setIntField(term2006, term2006.getClass(), "hashCodeValue", 106966554);
        setField(term2006, term2006.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = "sjlJAEtRrb";
        args[1] = term35;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1986));
        assertTrue(recursiveEquals(term35, term2006));
    }

};


