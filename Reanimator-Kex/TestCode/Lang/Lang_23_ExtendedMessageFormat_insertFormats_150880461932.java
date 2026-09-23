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
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class ExtendedMessageFormat_insertFormats_150880461932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1191;
     Object term1260;
     Object term5160;
     Object term5179;

    public ExtendedMessageFormat_insertFormats_150880461932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1204 = new HashMap();
        term1191 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term1209 = newInstance(Class.forName("java.util.Locale"));
        Object term1210 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1236 = (Object[]) newArray("java.text.Format", 6);
        int[] term1237 = (int[]) newIntArray(6);
        int[] term1244 = (int[]) newIntArray(2);
        setField(term1191, term1191.getClass(), "toPattern", "IDCWpPLRkE");
        setField(term1191, term1191.getClass(), "registry", term1204);
        setField(term1210, term1210.getClass(), "language", "mzn");
        setField(term1210, term1210.getClass(), "script", "");
        setField(term1210, term1210.getClass(), "region", "");
        setField(term1210, term1210.getClass(), "variant", "");
        setIntField(term1210, term1210.getClass(), "hash", -1058443265);
        setField(term1209, term1209.getClass(), "baseLocale", term1210);
        setField(term1209, term1209.getClass(), "localeExtensions", null);
        setIntField(term1209, term1209.getClass(), "hashCodeValue", -1058443265);
        setField(term1209, term1209.getClass(), "languageTag", null);
        setField(term1191, term1191.getClass(), "locale", term1209);
        setField(term1191, term1191.getClass(), "pattern", "nyiiPDVjAc");
        setField(term1191, term1191.getClass(), "formats", term1236);
        setIntElement(term1237, 0, 53410913);
        setIntElement(term1237, 1, -375014958);
        setIntElement(term1237, 2, 1107176718);
        setIntElement(term1237, 3, 480137250);
        setIntElement(term1237, 4, -341152642);
        setIntElement(term1237, 5, -2015854073);
        setField(term1191, term1191.getClass(), "offsets", term1237);
        setIntElement(term1244, 0, 538259104);
        setIntElement(term1244, 1, 96566506);
        setField(term1191, term1191.getClass(), "argumentNumbers", term1244);
        setIntField(term1191, term1191.getClass(), "maxOffset", -343325701);
        term1260 = new ArrayList();
        HashMap term5163 = new HashMap();
        term5160 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term5164 = newInstance(Class.forName("java.util.Locale"));
        Object term5165 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term5176 = (Object[]) newArray("java.text.Format", 6);
        int[] term5177 = (int[]) newIntArray(6);
        int[] term5178 = (int[]) newIntArray(2);
        setField(term5160, term5160.getClass(), "toPattern", "IDCWpPLRkE");
        setField(term5160, term5160.getClass(), "registry", term5163);
        setField(term5165, term5165.getClass(), "language", "mzn");
        setField(term5165, term5165.getClass(), "script", "");
        setField(term5165, term5165.getClass(), "region", "");
        setField(term5165, term5165.getClass(), "variant", "");
        setIntField(term5165, term5165.getClass(), "hash", -1058443265);
        setField(term5164, term5164.getClass(), "baseLocale", term5165);
        setField(term5164, term5164.getClass(), "localeExtensions", null);
        setIntField(term5164, term5164.getClass(), "hashCodeValue", -1058443265);
        setField(term5164, term5164.getClass(), "languageTag", null);
        setField(term5160, term5160.getClass(), "locale", term5164);
        setField(term5160, term5160.getClass(), "pattern", "nyiiPDVjAc");
        setField(term5160, term5160.getClass(), "formats", term5176);
        setIntElement(term5177, 0, 53410913);
        setIntElement(term5177, 1, -375014958);
        setIntElement(term5177, 2, 1107176718);
        setIntElement(term5177, 3, 480137250);
        setIntElement(term5177, 4, -341152642);
        setIntElement(term5177, 5, -2015854073);
        setField(term5160, term5160.getClass(), "offsets", term5177);
        setIntElement(term5178, 0, 538259104);
        setIntElement(term5178, 1, 96566506);
        setField(term5160, term5160.getClass(), "argumentNumbers", term5178);
        setIntField(term5160, term5160.getClass(), "maxOffset", -343325701);
        term5179 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[2];
        args[0] = "aKnKipADSo";
        args[1] = term1260;
        Object retValue = callMethod(klass, "insertFormats", argTypes, term1191, args);
        assertTrue(recursiveEquals(term1191, term5160));
        assertTrue(recursiveEquals(term1260, "aKnKipADSo"));
        assertTrue(recursiveEquals(retValue, "aKnKipADSo"));
    }

};


