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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang3.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class ExtendedMessageFormat_seekNonWs_19667592833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1305;
     Object term1371;

    public ExtendedMessageFormat_seekNonWs_19667592833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1318 = new HashMap();
        term1305 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term1323 = newInstance(Class.forName("java.util.Locale"));
        Object term1324 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1351 = (Object[]) newArray("java.text.Format", 7);
        int[] term1352 = (int[]) newIntArray(2);
        int[] term1355 = (int[]) newIntArray(2);
        setField(term1305, term1305.getClass(), "toPattern", "wSQxaModmm");
        setField(term1305, term1305.getClass(), "registry", term1318);
        setField(term1324, term1324.getClass(), "language", "en");
        setField(term1324, term1324.getClass(), "script", "");
        setField(term1324, term1324.getClass(), "region", "ZW");
        setField(term1324, term1324.getClass(), "variant", "");
        setIntField(term1324, term1324.getClass(), "hash", 96641818);
        setField(term1323, term1323.getClass(), "baseLocale", term1324);
        setField(term1323, term1323.getClass(), "localeExtensions", null);
        setIntField(term1323, term1323.getClass(), "hashCodeValue", 96641818);
        setField(term1323, term1323.getClass(), "languageTag", null);
        setField(term1305, term1305.getClass(), "locale", term1323);
        setField(term1305, term1305.getClass(), "pattern", "UlajhuVLaP");
        setField(term1305, term1305.getClass(), "formats", term1351);
        setIntElement(term1352, 0, 1202361360);
        setIntElement(term1352, 1, -2015048153);
        setField(term1305, term1305.getClass(), "offsets", term1352);
        setIntElement(term1355, 0, -2063457669);
        setIntElement(term1355, 1, -1222006000);
        setField(term1305, term1305.getClass(), "argumentNumbers", term1355);
        setIntField(term1305, term1305.getClass(), "maxOffset", 2095798786);
        term1371 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1371, term1371.getClass(), "index", -25637976);
        setIntField(term1371, term1371.getClass(), "errorIndex", 1555897383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[2];
        args[0] = "gGSMzuGICf";
        args[1] = term1371;
        try {
            callMethod(klass, "seekNonWs", argTypes, term1305, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


