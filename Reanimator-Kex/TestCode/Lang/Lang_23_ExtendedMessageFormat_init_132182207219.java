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

public class ExtendedMessageFormat_init_132182207219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1863;

    public ExtendedMessageFormat_init_132182207219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1863 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term1866 = newInstance(Class.forName("java.util.Locale"));
        Object term1867 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1880 = (Object[]) newArray("java.text.Format", 10);
        int[] term1881 = (int[]) newIntArray(10);
        int[] term1882 = (int[]) newIntArray(10);
        setField(term1863, term1863.getClass(), "toPattern", "PAEBtnZtTD");
        setField(term1863, term1863.getClass(), "registry", null);
        setField(term1867, term1867.getClass(), "language", "en");
        setField(term1867, term1867.getClass(), "script", "");
        setField(term1867, term1867.getClass(), "region", "US");
        setField(term1867, term1867.getClass(), "variant", "");
        setIntField(term1867, term1867.getClass(), "hash", 96636889);
        setField(term1866, term1866.getClass(), "baseLocale", term1867);
        setField(term1866, term1866.getClass(), "localeExtensions", null);
        setIntField(term1866, term1866.getClass(), "hashCodeValue", 96636889);
        setField(term1866, term1866.getClass(), "languageTag", "en-US");
        setField(term1863, term1863.getClass(), "locale", term1866);
        setField(term1863, term1863.getClass(), "pattern", "PAEBtnZtTD");
        setField(term1863, term1863.getClass(), "formats", term1880);
        setField(term1863, term1863.getClass(), "offsets", term1881);
        setField(term1863, term1863.getClass(), "argumentNumbers", term1882);
        setIntField(term1863, term1863.getClass(), "maxOffset", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1863));
    }

};


