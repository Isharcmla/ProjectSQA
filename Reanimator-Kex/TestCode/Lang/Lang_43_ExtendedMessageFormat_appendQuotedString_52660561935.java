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
import java.lang.IllegalArgumentException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Boolean;

public class ExtendedMessageFormat_appendQuotedString_52660561935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1433;
     Object term1494;
     Object term1497;
     Object term1529;

    public ExtendedMessageFormat_appendQuotedString_52660561935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1446 = new HashMap();
        term1433 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term1451 = newInstance(Class.forName("java.util.Locale"));
        Object term1452 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1477 = (Object[]) newArray("java.text.Format", 0);
        int[] term1478 = (int[]) newIntArray(0);
        int[] term1479 = (int[]) newIntArray(1);
        setField(term1433, term1433.getClass(), "toPattern", "kuTXqwMtDB");
        setField(term1433, term1433.getClass(), "registry", term1446);
        setField(term1452, term1452.getClass(), "language", "be");
        setField(term1452, term1452.getClass(), "script", "");
        setField(term1452, term1452.getClass(), "region", "");
        setField(term1452, term1452.getClass(), "variant", "");
        setIntField(term1452, term1452.getClass(), "hash", 93513949);
        setField(term1451, term1451.getClass(), "baseLocale", term1452);
        setField(term1451, term1451.getClass(), "localeExtensions", null);
        setIntField(term1451, term1451.getClass(), "hashCodeValue", 93513949);
        setField(term1451, term1451.getClass(), "languageTag", null);
        setField(term1433, term1433.getClass(), "locale", term1451);
        setField(term1433, term1433.getClass(), "pattern", "Ghbwtircqb");
        setField(term1433, term1433.getClass(), "formats", term1477);
        setField(term1433, term1433.getClass(), "offsets", term1478);
        setIntElement(term1479, 0, -523949691);
        setField(term1433, term1433.getClass(), "argumentNumbers", term1479);
        setIntField(term1433, term1433.getClass(), "maxOffset", 1398204340);
        term1494 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1494, term1494.getClass(), "index", 1384592638);
        setIntField(term1494, term1494.getClass(), "errorIndex", -1002370457);
        term1497 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1510 = (byte[]) newByteArray(16);
        setField(term1497, term1497.getClass(), "toStringCache", "IDCWpPLRkE");
        setField(term1497, term1497.getClass(), "value", term1510);
        setByteField(term1497, term1497.getClass(), "coder", (byte) 47);
        setIntField(term1497, term1497.getClass(), "count", -2014576105);
        term1529 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        argTypes[2] = Class.forName("java.lang.StringBuffer");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "xrwlQZdwCp";
        args[1] = term1494;
        args[2] = term1497;
        args[3] = term1529;
        try {
            callMethod(klass, "appendQuotedString", argTypes, term1433, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


