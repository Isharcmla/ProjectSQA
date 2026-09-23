package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class LocaleUtils_localeLookupList_155864259112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term57;
     Object term492;
     Object term494;
     Object term479;

    public LocaleUtils_localeLookupList_155864259112() {
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
        term492 = newInstance(Class.forName("java.util.Locale"));
        Object term493 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term493, term493.getClass(), "language", null);
        setField(term493, term493.getClass(), "script", null);
        setField(term493, term493.getClass(), "region", null);
        setField(term493, term493.getClass(), "variant", null);
        setIntField(term493, term493.getClass(), "hash", 106860317);
        setField(term492, term492.getClass(), "baseLocale", term493);
        setField(term492, term492.getClass(), "localeExtensions", null);
        setIntField(term492, term492.getClass(), "hashCodeValue", 106860317);
        setField(term492, term492.getClass(), "languageTag", null);
        term494 = newInstance(Class.forName("java.util.Locale"));
        Object term495 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term495, term495.getClass(), "language", null);
        setField(term495, term495.getClass(), "script", null);
        setField(term495, term495.getClass(), "region", null);
        setField(term495, term495.getClass(), "variant", null);
        setIntField(term495, term495.getClass(), "hash", -1139147084);
        setField(term494, term494.getClass(), "baseLocale", term495);
        setField(term494, term494.getClass(), "localeExtensions", null);
        setIntField(term494, term494.getClass(), "hashCodeValue", -1139147084);
        setField(term494, term494.getClass(), "languageTag", null);
        Object term482 = newInstance(Class.forName("java.util.Locale"));
        Object term483 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term483, term483.getClass(), "language", null);
        setField(term483, term483.getClass(), "script", null);
        setField(term483, term483.getClass(), "region", null);
        setField(term483, term483.getClass(), "variant", null);
        setIntField(term483, term483.getClass(), "hash", 106860317);
        setField(term482, term482.getClass(), "baseLocale", term483);
        setField(term482, term482.getClass(), "localeExtensions", null);
        setIntField(term482, term482.getClass(), "hashCodeValue", 106860317);
        setField(term482, term482.getClass(), "languageTag", null);
        Object term486 = newInstance(Class.forName("java.util.Locale"));
        Object term487 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term487, term487.getClass(), "language", null);
        setField(term487, term487.getClass(), "script", null);
        setField(term487, term487.getClass(), "region", null);
        setField(term487, term487.getClass(), "variant", null);
        setIntField(term487, term487.getClass(), "hash", -1139147084);
        setField(term486, term486.getClass(), "baseLocale", term487);
        setField(term486, term486.getClass(), "localeExtensions", null);
        setIntField(term486, term486.getClass(), "hashCodeValue", -1139147084);
        setField(term486, term486.getClass(), "languageTag", null);
        ArrayList term480 = new ArrayList();
        ((ArrayList) term480).add(term482);
        ((ArrayList) term480).add(term486);
        term479 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term479, term479.getClass(), "list", term480);
        setField(term479, term479.getClass(), "c", term480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.LocaleUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Locale");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term43;
        args[1] = term57;
        Object retValue = callMethod(klass, "localeLookupList", argTypes, null, args);
        assertTrue(recursiveEquals(term43, term492));
        assertTrue(recursiveEquals(term57, term494));
        assertTrue(recursiveEquals(retValue, term479));
    }

};


