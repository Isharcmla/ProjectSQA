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

public class ExtendedMessageFormat_init_209466016519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1817;

    public ExtendedMessageFormat_init_209466016519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1817 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term1820 = newInstance(Class.forName("java.util.Locale"));
        Object term1821 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1834 = (Object[]) newArray("java.text.Format", 10);
        int[] term1835 = (int[]) newIntArray(10);
        int[] term1836 = (int[]) newIntArray(10);
        setField(term1817, term1817.getClass(), "toPattern", "PAEBtnZtTD");
        setField(term1817, term1817.getClass(), "registry", null);
        setField(term1821, term1821.getClass(), "language", "en");
        setField(term1821, term1821.getClass(), "script", "");
        setField(term1821, term1821.getClass(), "region", "US");
        setField(term1821, term1821.getClass(), "variant", "");
        setIntField(term1821, term1821.getClass(), "hash", 96636889);
        setField(term1820, term1820.getClass(), "baseLocale", term1821);
        setField(term1820, term1820.getClass(), "localeExtensions", null);
        setIntField(term1820, term1820.getClass(), "hashCodeValue", 96636889);
        setField(term1820, term1820.getClass(), "languageTag", "en-US");
        setField(term1817, term1817.getClass(), "locale", term1820);
        setField(term1817, term1817.getClass(), "pattern", "PAEBtnZtTD");
        setField(term1817, term1817.getClass(), "formats", term1834);
        setField(term1817, term1817.getClass(), "offsets", term1835);
        setField(term1817, term1817.getClass(), "argumentNumbers", term1836);
        setIntField(term1817, term1817.getClass(), "maxOffset", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1817));
    }

};


