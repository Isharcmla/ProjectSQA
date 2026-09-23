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

public class ExtendedMessageFormat_parseFormatDescription_18337467831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1078;
     Object term1147;

    public ExtendedMessageFormat_parseFormatDescription_18337467831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1091 = new HashMap();
        term1078 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term1096 = newInstance(Class.forName("java.util.Locale"));
        Object term1097 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1122 = (Object[]) newArray("java.text.Format", 3);
        int[] term1123 = (int[]) newIntArray(7);
        int[] term1131 = (int[]) newIntArray(2);
        setField(term1078, term1078.getClass(), "toPattern", "kuTXqwMtDB");
        setField(term1078, term1078.getClass(), "registry", term1091);
        setField(term1097, term1097.getClass(), "language", "pl");
        setField(term1097, term1097.getClass(), "script", "");
        setField(term1097, term1097.getClass(), "region", "");
        setField(term1097, term1097.getClass(), "variant", "");
        setIntField(term1097, term1097.getClass(), "hash", 106651780);
        setField(term1096, term1096.getClass(), "baseLocale", term1097);
        setField(term1096, term1096.getClass(), "localeExtensions", null);
        setIntField(term1096, term1096.getClass(), "hashCodeValue", 106651780);
        setField(term1096, term1096.getClass(), "languageTag", null);
        setField(term1078, term1078.getClass(), "locale", term1096);
        setField(term1078, term1078.getClass(), "pattern", "Ghbwtircqb");
        setField(term1078, term1078.getClass(), "formats", term1122);
        setIntElement(term1123, 0, -341962980);
        setIntElement(term1123, 1, 1532716628);
        setIntElement(term1123, 2, -1801760683);
        setIntElement(term1123, 3, 1141317871);
        setIntElement(term1123, 4, 890669485);
        setIntElement(term1123, 5, 691577392);
        setIntElement(term1123, 6, -893623680);
        setField(term1078, term1078.getClass(), "offsets", term1123);
        setIntElement(term1131, 0, -1963434938);
        setIntElement(term1131, 1, 906181092);
        setField(term1078, term1078.getClass(), "argumentNumbers", term1131);
        setIntField(term1078, term1078.getClass(), "maxOffset", 1045657203);
        term1147 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1147, term1147.getClass(), "index", 1474524152);
        setIntField(term1147, term1147.getClass(), "errorIndex", 568954359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[2];
        args[0] = "xrwlQZdwCp";
        args[1] = term1147;
        try {
            callMethod(klass, "parseFormatDescription", argTypes, term1078, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


