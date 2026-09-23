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
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class ExtendedMessageFormat_insertFormats_190767761832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1123;
     Object term1192;
     Object term5117;
     Object term5136;

    public ExtendedMessageFormat_insertFormats_190767761832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1136 = new HashMap();
        term1123 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term1141 = newInstance(Class.forName("java.util.Locale"));
        Object term1142 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1168 = (Object[]) newArray("java.text.Format", 6);
        int[] term1169 = (int[]) newIntArray(6);
        int[] term1176 = (int[]) newIntArray(2);
        setField(term1123, term1123.getClass(), "toPattern", "flxyYxBRtu");
        setField(term1123, term1123.getClass(), "registry", term1136);
        setField(term1142, term1142.getClass(), "language", "mzn");
        setField(term1142, term1142.getClass(), "script", "");
        setField(term1142, term1142.getClass(), "region", "");
        setField(term1142, term1142.getClass(), "variant", "");
        setIntField(term1142, term1142.getClass(), "hash", -1058443265);
        setField(term1141, term1141.getClass(), "baseLocale", term1142);
        setField(term1141, term1141.getClass(), "localeExtensions", null);
        setIntField(term1141, term1141.getClass(), "hashCodeValue", -1058443265);
        setField(term1141, term1141.getClass(), "languageTag", null);
        setField(term1123, term1123.getClass(), "locale", term1141);
        setField(term1123, term1123.getClass(), "pattern", "OclPbYPkcH");
        setField(term1123, term1123.getClass(), "formats", term1168);
        setIntElement(term1169, 0, 53410913);
        setIntElement(term1169, 1, -375014958);
        setIntElement(term1169, 2, 1107176718);
        setIntElement(term1169, 3, 480137250);
        setIntElement(term1169, 4, -341152642);
        setIntElement(term1169, 5, -2015854073);
        setField(term1123, term1123.getClass(), "offsets", term1169);
        setIntElement(term1176, 0, 538259104);
        setIntElement(term1176, 1, 96566506);
        setField(term1123, term1123.getClass(), "argumentNumbers", term1176);
        setIntField(term1123, term1123.getClass(), "maxOffset", -343325701);
        term1192 = new ArrayList();
        HashMap term5120 = new HashMap();
        term5117 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term5121 = newInstance(Class.forName("java.util.Locale"));
        Object term5122 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term5133 = (Object[]) newArray("java.text.Format", 6);
        int[] term5134 = (int[]) newIntArray(6);
        int[] term5135 = (int[]) newIntArray(2);
        setField(term5117, term5117.getClass(), "toPattern", "flxyYxBRtu");
        setField(term5117, term5117.getClass(), "registry", term5120);
        setField(term5122, term5122.getClass(), "language", "mzn");
        setField(term5122, term5122.getClass(), "script", "");
        setField(term5122, term5122.getClass(), "region", "");
        setField(term5122, term5122.getClass(), "variant", "");
        setIntField(term5122, term5122.getClass(), "hash", -1058443265);
        setField(term5121, term5121.getClass(), "baseLocale", term5122);
        setField(term5121, term5121.getClass(), "localeExtensions", null);
        setIntField(term5121, term5121.getClass(), "hashCodeValue", -1058443265);
        setField(term5121, term5121.getClass(), "languageTag", null);
        setField(term5117, term5117.getClass(), "locale", term5121);
        setField(term5117, term5117.getClass(), "pattern", "OclPbYPkcH");
        setField(term5117, term5117.getClass(), "formats", term5133);
        setIntElement(term5134, 0, 53410913);
        setIntElement(term5134, 1, -375014958);
        setIntElement(term5134, 2, 1107176718);
        setIntElement(term5134, 3, 480137250);
        setIntElement(term5134, 4, -341152642);
        setIntElement(term5134, 5, -2015854073);
        setField(term5117, term5117.getClass(), "offsets", term5134);
        setIntElement(term5135, 0, 538259104);
        setIntElement(term5135, 1, 96566506);
        setField(term5117, term5117.getClass(), "argumentNumbers", term5135);
        setIntField(term5117, term5117.getClass(), "maxOffset", -343325701);
        term5136 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[2];
        args[0] = "IoAlmYsBwc";
        args[1] = term1192;
        Object retValue = callMethod(klass, "insertFormats", argTypes, term1123, args);
        assertTrue(recursiveEquals(term1123, term5117));
        assertTrue(recursiveEquals(term1192, "IoAlmYsBwc"));
        assertTrue(recursiveEquals(retValue, "IoAlmYsBwc"));
    }

};


