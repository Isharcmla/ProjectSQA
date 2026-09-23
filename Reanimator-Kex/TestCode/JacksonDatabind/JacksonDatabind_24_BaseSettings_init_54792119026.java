package com.fasterxml.jackson.databind.cfg;

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
import static com.fasterxml.jackson.databind.cfg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.cfg.EqualityUtils.*;
import java.lang.Object;

public class BaseSettings_init_54792119026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term17;
     Object term206;
     Object term220;
     Object term230;

    public BaseSettings_init_54792119026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.util.Locale"));
        Object term2 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2, term2.getClass(), "language", "pt");
        setField(term2, term2.getClass(), "script", "");
        setField(term2, term2.getClass(), "region", "MO");
        setField(term2, term2.getClass(), "variant", "");
        setIntField(term2, term2.getClass(), "hash", 106966554);
        setField(term1, term1.getClass(), "baseLocale", term2);
        setField(term1, term1.getClass(), "localeExtensions", null);
        setIntField(term1, term1.getClass(), "hashCodeValue", 106966554);
        setField(term1, term1.getClass(), "languageTag", null);
        term17 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term17, term17.getClass(), "rawOffset", 18000000);
        setIntField(term17, term17.getClass(), "rawOffsetDiff", 0);
        setIntField(term17, term17.getClass(), "checksum", 0);
        setIntField(term17, term17.getClass(), "dstSavings", 0);
        setField(term17, term17.getClass(), "transitions", null);
        setField(term17, term17.getClass(), "offsets", null);
        setField(term17, term17.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term17, term17.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term17, term17.getClass(), "dirty", false);
        setField(term17, term17.getClass(), "lastRule", null);
        setField(term17, term17.getClass(), "ID", "Etc/GMT-5");
        setField(term17, term17.getClass(), "zoneId", null);
        term206 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term207 = newInstance(Class.forName("java.util.Locale"));
        Object term208 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term217 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setField(term206, term206.getClass(), "_classIntrospector", null);
        setField(term206, term206.getClass(), "_annotationIntrospector", null);
        setField(term206, term206.getClass(), "_visibilityChecker", null);
        setField(term206, term206.getClass(), "_propertyNamingStrategy", null);
        setField(term206, term206.getClass(), "_typeFactory", null);
        setField(term206, term206.getClass(), "_typeResolverBuilder", null);
        setField(term206, term206.getClass(), "_dateFormat", null);
        setField(term206, term206.getClass(), "_handlerInstantiator", null);
        setField(term208, term208.getClass(), "language", "pt");
        setField(term208, term208.getClass(), "script", "");
        setField(term208, term208.getClass(), "region", "MO");
        setField(term208, term208.getClass(), "variant", "");
        setIntField(term208, term208.getClass(), "hash", 106966554);
        setField(term207, term207.getClass(), "baseLocale", term208);
        setField(term207, term207.getClass(), "localeExtensions", null);
        setIntField(term207, term207.getClass(), "hashCodeValue", 106966554);
        setField(term207, term207.getClass(), "languageTag", null);
        setField(term206, term206.getClass(), "_locale", term207);
        setIntField(term217, term217.getClass(), "rawOffset", 18000000);
        setIntField(term217, term217.getClass(), "rawOffsetDiff", 0);
        setIntField(term217, term217.getClass(), "checksum", 0);
        setIntField(term217, term217.getClass(), "dstSavings", 0);
        setField(term217, term217.getClass(), "transitions", null);
        setField(term217, term217.getClass(), "offsets", null);
        setField(term217, term217.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term217, term217.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term217, term217.getClass(), "dirty", false);
        setField(term217, term217.getClass(), "lastRule", null);
        setField(term217, term217.getClass(), "ID", "Etc/GMT-5");
        setField(term217, term217.getClass(), "zoneId", null);
        setField(term206, term206.getClass(), "_timeZone", term217);
        setField(term206, term206.getClass(), "_defaultBase64", null);
        term220 = newInstance(Class.forName("java.util.Locale"));
        Object term221 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term221, term221.getClass(), "language", "pt");
        setField(term221, term221.getClass(), "script", "");
        setField(term221, term221.getClass(), "region", "MO");
        setField(term221, term221.getClass(), "variant", "");
        setIntField(term221, term221.getClass(), "hash", 106966554);
        setField(term220, term220.getClass(), "baseLocale", term221);
        setField(term220, term220.getClass(), "localeExtensions", null);
        setIntField(term220, term220.getClass(), "hashCodeValue", 106966554);
        setField(term220, term220.getClass(), "languageTag", null);
        term230 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term230, term230.getClass(), "rawOffset", 18000000);
        setIntField(term230, term230.getClass(), "rawOffsetDiff", 0);
        setIntField(term230, term230.getClass(), "checksum", 0);
        setIntField(term230, term230.getClass(), "dstSavings", 0);
        setField(term230, term230.getClass(), "transitions", null);
        setField(term230, term230.getClass(), "offsets", null);
        setField(term230, term230.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term230, term230.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term230, term230.getClass(), "dirty", false);
        setField(term230, term230.getClass(), "lastRule", null);
        setField(term230, term230.getClass(), "ID", "Etc/GMT-5");
        setField(term230, term230.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.ClassIntrospector");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.VisibilityChecker");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.PropertyNamingStrategy");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder");
        argTypes[6] = Class.forName("java.text.DateFormat");
        argTypes[7] = Class.forName("com.fasterxml.jackson.databind.cfg.HandlerInstantiator");
        argTypes[8] = Class.forName("java.util.Locale");
        argTypes[9] = Class.forName("java.util.TimeZone");
        argTypes[10] = Class.forName("com.fasterxml.jackson.core.Base64Variant");
        Object[] args = new Object[11];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = term1;
        args[9] = term17;
        args[10] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term206));
        assertTrue(recursiveEquals(term1, term220));
        assertTrue(recursiveEquals(term17, term230));
    }

};


