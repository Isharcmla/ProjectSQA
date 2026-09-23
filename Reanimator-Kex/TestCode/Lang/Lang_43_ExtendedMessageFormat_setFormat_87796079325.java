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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;

public class ExtendedMessageFormat_setFormat_87796079325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;
     Object term436;

    public ExtendedMessageFormat_setFormat_87796079325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term390 = new HashMap();
        term377 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term395 = newInstance(Class.forName("java.util.Locale"));
        Object term396 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term424 = (Object[]) newArray("java.text.Format", 6);
        int[] term425 = (int[]) newIntArray(7);
        int[] term433 = (int[]) newIntArray(1);
        setField(term377, term377.getClass(), "toPattern", "RMFIsYGgne");
        setField(term377, term377.getClass(), "registry", term390);
        setField(term396, term396.getClass(), "language", "chr");
        setField(term396, term396.getClass(), "script", "");
        setField(term396, term396.getClass(), "region", "US");
        setField(term396, term396.getClass(), "variant", "");
        setIntField(term396, term396.getClass(), "hash", -1361154731);
        setField(term395, term395.getClass(), "baseLocale", term396);
        setField(term395, term395.getClass(), "localeExtensions", null);
        setIntField(term395, term395.getClass(), "hashCodeValue", -1361154731);
        setField(term395, term395.getClass(), "languageTag", null);
        setField(term377, term377.getClass(), "locale", term395);
        setField(term377, term377.getClass(), "pattern", "NRdvgJlhkX");
        setField(term377, term377.getClass(), "formats", term424);
        setIntElement(term425, 0, -117576464);
        setIntElement(term425, 1, -1007160944);
        setIntElement(term425, 2, 1135664017);
        setIntElement(term425, 3, 590364439);
        setIntElement(term425, 4, 865208305);
        setIntElement(term425, 5, -1275173084);
        setIntElement(term425, 6, -244121226);
        setField(term377, term377.getClass(), "offsets", term425);
        setIntElement(term433, 0, -203030934);
        setField(term377, term377.getClass(), "argumentNumbers", term433);
        setIntField(term377, term377.getClass(), "maxOffset", -1179120542);
        term436 = new Integer(-1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.text.Format");
        Object[] args = new Object[2];
        args[0] = term436;
        args[1] = null;
        try {
            callMethod(klass, "setFormat", argTypes, term377, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


