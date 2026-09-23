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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class ExtendedMessageFormat_seekNonWs_107516098733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1237;
     Object term1303;

    public ExtendedMessageFormat_seekNonWs_107516098733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1250 = new HashMap();
        term1237 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term1255 = newInstance(Class.forName("java.util.Locale"));
        Object term1256 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1283 = (Object[]) newArray("java.text.Format", 7);
        int[] term1284 = (int[]) newIntArray(2);
        int[] term1287 = (int[]) newIntArray(2);
        setField(term1237, term1237.getClass(), "toPattern", "TEParAifyi");
        setField(term1237, term1237.getClass(), "registry", term1250);
        setField(term1256, term1256.getClass(), "language", "en");
        setField(term1256, term1256.getClass(), "script", "");
        setField(term1256, term1256.getClass(), "region", "ZW");
        setField(term1256, term1256.getClass(), "variant", "");
        setIntField(term1256, term1256.getClass(), "hash", 96641818);
        setField(term1255, term1255.getClass(), "baseLocale", term1256);
        setField(term1255, term1255.getClass(), "localeExtensions", null);
        setIntField(term1255, term1255.getClass(), "hashCodeValue", 96641818);
        setField(term1255, term1255.getClass(), "languageTag", null);
        setField(term1237, term1237.getClass(), "locale", term1255);
        setField(term1237, term1237.getClass(), "pattern", "OWDIEULEFu");
        setField(term1237, term1237.getClass(), "formats", term1283);
        setIntElement(term1284, 0, 1202361360);
        setIntElement(term1284, 1, -2015048153);
        setField(term1237, term1237.getClass(), "offsets", term1284);
        setIntElement(term1287, 0, -2063457669);
        setIntElement(term1287, 1, -1222006000);
        setField(term1237, term1237.getClass(), "argumentNumbers", term1287);
        setIntField(term1237, term1237.getClass(), "maxOffset", 2095798786);
        term1303 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1303, term1303.getClass(), "index", -25637976);
        setIntField(term1303, term1303.getClass(), "errorIndex", 1555897383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[2];
        args[0] = "dWRymuLBtr";
        args[1] = term1303;
        try {
            callMethod(klass, "seekNonWs", argTypes, term1237, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


