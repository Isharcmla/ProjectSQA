package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class LocaleUtils_localeLookupList_19136607612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term57;
     Object term494;
     Object term496;
     Object term481;

    public LocaleUtils_localeLookupList_19136607612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = newInstance(Class.forName("java.util.Locale"));
        Object term44 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term44, term44.getClass(), "language", "ps");
        setField(term44, term44.getClass(), "script", "");
        setField(term44, term44.getClass(), "region", "");
        setField(term44, term44.getClass(), "variant", "");
        setIntField(term44, term44.getClass(), "hash", 106860317);
        setField(term43, term43.getClass(), "baseLocale", term44);
        setField(term43, term43.getClass(), "localeExtensions", null);
        setIntField(term43, term43.getClass(), "hashCodeValue", 106860317);
        setField(term43, term43.getClass(), "languageTag", null);
        term57 = newInstance(Class.forName("java.util.Locale"));
        Object term58 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term58, term58.getClass(), "language", "kab");
        setField(term58, term58.getClass(), "script", "");
        setField(term58, term58.getClass(), "region", "");
        setField(term58, term58.getClass(), "variant", "");
        setIntField(term58, term58.getClass(), "hash", -1139147084);
        setField(term57, term57.getClass(), "baseLocale", term58);
        setField(term57, term57.getClass(), "localeExtensions", null);
        setIntField(term57, term57.getClass(), "hashCodeValue", -1139147084);
        setField(term57, term57.getClass(), "languageTag", null);
        term494 = newInstance(Class.forName("java.util.Locale"));
        Object term495 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term495, term495.getClass(), "language", null);
        setField(term495, term495.getClass(), "script", null);
        setField(term495, term495.getClass(), "region", null);
        setField(term495, term495.getClass(), "variant", null);
        setIntField(term495, term495.getClass(), "hash", 106860317);
        setField(term494, term494.getClass(), "baseLocale", term495);
        setField(term494, term494.getClass(), "localeExtensions", null);
        setIntField(term494, term494.getClass(), "hashCodeValue", 106860317);
        setField(term494, term494.getClass(), "languageTag", null);
        term496 = newInstance(Class.forName("java.util.Locale"));
        Object term497 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term497, term497.getClass(), "language", null);
        setField(term497, term497.getClass(), "script", null);
        setField(term497, term497.getClass(), "region", null);
        setField(term497, term497.getClass(), "variant", null);
        setIntField(term497, term497.getClass(), "hash", -1139147084);
        setField(term496, term496.getClass(), "baseLocale", term497);
        setField(term496, term496.getClass(), "localeExtensions", null);
        setIntField(term496, term496.getClass(), "hashCodeValue", -1139147084);
        setField(term496, term496.getClass(), "languageTag", null);
        Object term484 = newInstance(Class.forName("java.util.Locale"));
        Object term485 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term485, term485.getClass(), "language", null);
        setField(term485, term485.getClass(), "script", null);
        setField(term485, term485.getClass(), "region", null);
        setField(term485, term485.getClass(), "variant", null);
        setIntField(term485, term485.getClass(), "hash", 106860317);
        setField(term484, term484.getClass(), "baseLocale", term485);
        setField(term484, term484.getClass(), "localeExtensions", null);
        setIntField(term484, term484.getClass(), "hashCodeValue", 106860317);
        setField(term484, term484.getClass(), "languageTag", null);
        Object term488 = newInstance(Class.forName("java.util.Locale"));
        Object term489 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term489, term489.getClass(), "language", null);
        setField(term489, term489.getClass(), "script", null);
        setField(term489, term489.getClass(), "region", null);
        setField(term489, term489.getClass(), "variant", null);
        setIntField(term489, term489.getClass(), "hash", -1139147084);
        setField(term488, term488.getClass(), "baseLocale", term489);
        setField(term488, term488.getClass(), "localeExtensions", null);
        setIntField(term488, term488.getClass(), "hashCodeValue", -1139147084);
        setField(term488, term488.getClass(), "languageTag", null);
        ArrayList term482 = new ArrayList();
        ((ArrayList) term482).add(term484);
        ((ArrayList) term482).add(term488);
        term481 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term481, term481.getClass(), "list", term482);
        setField(term481, term481.getClass(), "c", term482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.LocaleUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Locale");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term43;
        args[1] = term57;
        Object retValue = callMethod(klass, "localeLookupList", argTypes, null, args);
        assertTrue(recursiveEquals(term43, term494));
        assertTrue(recursiveEquals(term57, term496));
        assertTrue(recursiveEquals(retValue, term481));
    }

};


