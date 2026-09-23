package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DisambiguateProperties_recordInvalidationError_132072408115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250;
     Object term262;

    public DisambiguateProperties_recordInvalidationError_132072408115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term251 = new HashMap();
        term250 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term250, term250.getClass(), "compiler", null);
        setField(term250, term250.getClass(), "typeSystem", null);
        setField(term250, term250.getClass(), "invalidationMap", null);
        setField(term250, term250.getClass(), "propertiesToErrorFor", term251);
        setField(term250, term250.getClass(), "properties", null);
        Class<? extends Object> term2878 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term2877 = ((Class) term2878).getDeclaredField((String) "OFF");
        ((Field) term2877).setAccessible(true);
        Object enum5 = ((Field) term2877).get((Object) null);
        Class<? extends Object> term3089 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term3088 = ((Class) term3089).getDeclaredField((String) "WARNING");
        ((Field) term3088).setAccessible(true);
        Object enum6 = ((Field) term3088).get((Object) null);
        Class<? extends Object> term3332 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term3331 = ((Class) term3332).getDeclaredField((String) "ERROR");
        ((Field) term3331).setAccessible(true);
        Object enum7 = ((Field) term3331).get((Object) null);
        term262 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        Object term263 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        Object term276 = newInstance(Class.forName("java.text.MessageFormat"));
        Object term277 = newInstance(Class.forName("java.util.Locale"));
        Object term278 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term293 = (Object[]) newArray("java.text.Format", 0);
        int[] term294 = (int[]) newIntArray(4);
        int[] term299 = (int[]) newIntArray(5);
        Object term348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term263, term263.getClass(), "key", "ZiaGIbnzTs");
        setField(term278, term278.getClass(), "language", null);
        setField(term278, term278.getClass(), "script", null);
        setField(term278, term278.getClass(), "region", null);
        setField(term278, term278.getClass(), "variant", null);
        setIntField(term278, term278.getClass(), "hash", 106966554);
        setField(term277, term277.getClass(), "baseLocale", term278);
        setField(term277, term277.getClass(), "localeExtensions", null);
        setIntField(term277, term277.getClass(), "hashCodeValue", 106966554);
        setField(term277, term277.getClass(), "languageTag", null);
        setField(term276, term276.getClass(), "locale", term277);
        setField(term276, term276.getClass(), "pattern", "tbcdzjIfER");
        setField(term276, term276.getClass(), "formats", term293);
        setIntElement(term294, 0, -1275173084);
        setIntElement(term294, 1, -244121226);
        setIntElement(term294, 2, -203030934);
        setIntElement(term294, 3, -1179120542);
        setField(term276, term276.getClass(), "offsets", term294);
        setIntElement(term299, 0, -73683645);
        setIntElement(term299, 1, -226514366);
        setIntElement(term299, 2, 1193880199);
        setIntElement(term299, 3, -1087774327);
        setIntElement(term299, 4, -1530420153);
        setField(term276, term276.getClass(), "argumentNumbers", term299);
        setIntField(term276, term276.getClass(), "maxOffset", -469968304);
        setField(term263, term263.getClass(), "format", term276);
        setField(term263, term263.getClass(), "defaultLevel", enum5);
        setField(term263, term263.getClass(), "level", enum6);
        setField(term262, term262.getClass(), "type", term263);
        setField(term262, term262.getClass(), "description", "HyxfbSQYBe");
        setField(term262, term262.getClass(), "sourceName", "pCTimMblYc");
        setIntField(term348, term348.getClass(), "type", 767834723);
        setIntField(term350, term350.getClass(), "type", -602026508);
        setIntField(term352, term352.getClass(), "type", -157887805);
        setIntField(term354, term354.getClass(), "type", 1876565163);
        setField(term354, term354.getClass(), "next", null);
        setField(term354, term354.getClass(), "first", null);
        setField(term354, term354.getClass(), "last", term348);
        setField(term354, term354.getClass(), "propListHead", null);
        setIntField(term354, term354.getClass(), "sourcePosition", 0);
        setField(term354, term354.getClass(), "jsType", null);
        setField(term354, term354.getClass(), "parent", null);
        setField(term352, term352.getClass(), "next", term354);
        setIntField(term357, term357.getClass(), "type", -1016503459);
        setField(term357, term357.getClass(), "next", null);
        setField(term357, term357.getClass(), "first", null);
        setField(term357, term357.getClass(), "last", null);
        setField(term357, term357.getClass(), "propListHead", null);
        setIntField(term357, term357.getClass(), "sourcePosition", 0);
        setField(term357, term357.getClass(), "jsType", null);
        setField(term357, term357.getClass(), "parent", null);
        setField(term352, term352.getClass(), "first", term357);
        setField(term352, term352.getClass(), "last", term354);
        setField(term352, term352.getClass(), "propListHead", null);
        setIntField(term352, term352.getClass(), "sourcePosition", 0);
        setField(term352, term352.getClass(), "jsType", null);
        setField(term352, term352.getClass(), "parent", null);
        setField(term350, term350.getClass(), "next", term352);
        setField(term350, term350.getClass(), "first", term350);
        setField(term350, term350.getClass(), "last", term350);
        setField(term350, term350.getClass(), "propListHead", null);
        setIntField(term350, term350.getClass(), "sourcePosition", 0);
        setField(term350, term350.getClass(), "jsType", null);
        setField(term350, term350.getClass(), "parent", null);
        setField(term348, term348.getClass(), "next", term350);
        setIntField(term362, term362.getClass(), "type", 0);
        setField(term362, term362.getClass(), "next", null);
        setField(term362, term362.getClass(), "first", null);
        setField(term362, term362.getClass(), "last", null);
        setField(term362, term362.getClass(), "propListHead", null);
        setIntField(term362, term362.getClass(), "sourcePosition", 0);
        setField(term362, term362.getClass(), "jsType", null);
        setField(term362, term362.getClass(), "parent", null);
        setField(term348, term348.getClass(), "first", term362);
        setIntField(term365, term365.getClass(), "type", 0);
        setField(term365, term365.getClass(), "next", null);
        setField(term365, term365.getClass(), "first", null);
        setField(term365, term365.getClass(), "last", null);
        setField(term365, term365.getClass(), "propListHead", null);
        setIntField(term365, term365.getClass(), "sourcePosition", 0);
        setField(term365, term365.getClass(), "jsType", null);
        setField(term365, term365.getClass(), "parent", null);
        setField(term348, term348.getClass(), "last", term365);
        setField(term348, term348.getClass(), "propListHead", null);
        setIntField(term348, term348.getClass(), "sourcePosition", 0);
        setField(term348, term348.getClass(), "jsType", null);
        setField(term348, term348.getClass(), "parent", null);
        setField(term262, term262.getClass(), "node", term348);
        setIntField(term262, term262.getClass(), "lineNumber", -1968847291);
        setField(term262, term262.getClass(), "level", enum6);
        setField(term262, term262.getClass(), "defaultLevel", enum7);
        setIntField(term262, term262.getClass(), "charno", 579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term262;
        try {
            callMethod(klass, "recordInvalidationError", argTypes, term250, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


