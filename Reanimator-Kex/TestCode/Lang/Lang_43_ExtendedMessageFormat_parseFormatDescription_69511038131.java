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

public class ExtendedMessageFormat_parseFormatDescription_69511038131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1010;
     Object term1079;

    public ExtendedMessageFormat_parseFormatDescription_69511038131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1023 = new HashMap();
        term1010 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term1028 = newInstance(Class.forName("java.util.Locale"));
        Object term1029 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1054 = (Object[]) newArray("java.text.Format", 3);
        int[] term1055 = (int[]) newIntArray(7);
        int[] term1063 = (int[]) newIntArray(2);
        setField(term1010, term1010.getClass(), "toPattern", "eZFUvlxvGV");
        setField(term1010, term1010.getClass(), "registry", term1023);
        setField(term1029, term1029.getClass(), "language", "pl");
        setField(term1029, term1029.getClass(), "script", "");
        setField(term1029, term1029.getClass(), "region", "");
        setField(term1029, term1029.getClass(), "variant", "");
        setIntField(term1029, term1029.getClass(), "hash", 106651780);
        setField(term1028, term1028.getClass(), "baseLocale", term1029);
        setField(term1028, term1028.getClass(), "localeExtensions", null);
        setIntField(term1028, term1028.getClass(), "hashCodeValue", 106651780);
        setField(term1028, term1028.getClass(), "languageTag", null);
        setField(term1010, term1010.getClass(), "locale", term1028);
        setField(term1010, term1010.getClass(), "pattern", "BYqFIqCKAV");
        setField(term1010, term1010.getClass(), "formats", term1054);
        setIntElement(term1055, 0, -341962980);
        setIntElement(term1055, 1, 1532716628);
        setIntElement(term1055, 2, -1801760683);
        setIntElement(term1055, 3, 1141317871);
        setIntElement(term1055, 4, 890669485);
        setIntElement(term1055, 5, 691577392);
        setIntElement(term1055, 6, -893623680);
        setField(term1010, term1010.getClass(), "offsets", term1055);
        setIntElement(term1063, 0, -1963434938);
        setIntElement(term1063, 1, 906181092);
        setField(term1010, term1010.getClass(), "argumentNumbers", term1063);
        setIntField(term1010, term1010.getClass(), "maxOffset", 1045657203);
        term1079 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1079, term1079.getClass(), "index", 1474524152);
        setIntField(term1079, term1079.getClass(), "errorIndex", 568954359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[2];
        args[0] = "vrQLuWIDJX";
        args[1] = term1079;
        try {
            callMethod(klass, "parseFormatDescription", argTypes, term1010, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


