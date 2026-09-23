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

public class DisambiguateProperties_addInvalidatingType_104053854916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1098;
     Object term1110;

    public DisambiguateProperties_addInvalidatingType_104053854916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1099 = new HashMap();
        term1098 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term1098, term1098.getClass(), "compiler", null);
        setField(term1098, term1098.getClass(), "typeSystem", null);
        setField(term1098, term1098.getClass(), "invalidationMap", null);
        setField(term1098, term1098.getClass(), "propertiesToErrorFor", term1099);
        setField(term1098, term1098.getClass(), "properties", null);
        Class<? extends Object> term3825 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term3824 = ((Class) term3825).getDeclaredField((String) "WARNING");
        ((Field) term3824).setAccessible(true);
        Object enum8 = ((Field) term3824).get((Object) null);
        Class<? extends Object> term4068 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term4067 = ((Class) term4068).getDeclaredField((String) "ERROR");
        ((Field) term4067).setAccessible(true);
        Object enum9 = ((Field) term4067).get((Object) null);
        term1110 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        Object term1111 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        Object term1124 = newInstance(Class.forName("java.text.MessageFormat"));
        Object term1125 = newInstance(Class.forName("java.util.Locale"));
        Object term1126 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1141 = (Object[]) newArray("java.text.Format", 6);
        int[] term1142 = (int[]) newIntArray(2);
        int[] term1145 = (int[]) newIntArray(6);
        Object term1188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1111, term1111.getClass(), "key", "xOEqzGAmDU");
        setField(term1126, term1126.getClass(), "language", null);
        setField(term1126, term1126.getClass(), "script", null);
        setField(term1126, term1126.getClass(), "region", null);
        setField(term1126, term1126.getClass(), "variant", null);
        setIntField(term1126, term1126.getClass(), "hash", 106860317);
        setField(term1125, term1125.getClass(), "baseLocale", term1126);
        setField(term1125, term1125.getClass(), "localeExtensions", null);
        setIntField(term1125, term1125.getClass(), "hashCodeValue", 106860317);
        setField(term1125, term1125.getClass(), "languageTag", null);
        setField(term1124, term1124.getClass(), "locale", term1125);
        setField(term1124, term1124.getClass(), "pattern", "eZFUvlxvGV");
        setField(term1124, term1124.getClass(), "formats", term1141);
        setIntElement(term1142, 0, -14890619);
        setIntElement(term1142, 1, 1632125673);
        setField(term1124, term1124.getClass(), "offsets", term1142);
        setIntElement(term1145, 0, 454281060);
        setIntElement(term1145, 1, -1786399638);
        setIntElement(term1145, 2, 2055867847);
        setIntElement(term1145, 3, -1048298087);
        setIntElement(term1145, 4, 292681826);
        setIntElement(term1145, 5, 458147407);
        setField(term1124, term1124.getClass(), "argumentNumbers", term1145);
        setIntField(term1124, term1124.getClass(), "maxOffset", -184153539);
        setField(term1111, term1111.getClass(), "format", term1124);
        setField(term1111, term1111.getClass(), "defaultLevel", enum8);
        setField(term1111, term1111.getClass(), "level", enum8);
        setField(term1110, term1110.getClass(), "type", term1111);
        setField(term1110, term1110.getClass(), "description", "BYqFIqCKAV");
        setField(term1110, term1110.getClass(), "sourceName", "vrQLuWIDJX");
        setIntField(term1188, term1188.getClass(), "type", 97029295);
        setIntField(term1190, term1190.getClass(), "type", -1371869594);
        setIntField(term1192, term1192.getClass(), "type", -2095575670);
        setIntField(term1194, term1194.getClass(), "type", 1225272962);
        setField(term1194, term1194.getClass(), "next", null);
        setField(term1194, term1194.getClass(), "first", null);
        setField(term1194, term1194.getClass(), "last", term1188);
        setField(term1194, term1194.getClass(), "propListHead", null);
        setIntField(term1194, term1194.getClass(), "sourcePosition", 0);
        setField(term1194, term1194.getClass(), "jsType", null);
        setField(term1194, term1194.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "next", term1194);
        setIntField(term1197, term1197.getClass(), "type", -1588772968);
        setField(term1197, term1197.getClass(), "next", null);
        setField(term1197, term1197.getClass(), "first", null);
        setField(term1197, term1197.getClass(), "last", null);
        setField(term1197, term1197.getClass(), "propListHead", null);
        setIntField(term1197, term1197.getClass(), "sourcePosition", 0);
        setField(term1197, term1197.getClass(), "jsType", null);
        setField(term1197, term1197.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "first", term1197);
        setField(term1192, term1192.getClass(), "last", term1194);
        setField(term1192, term1192.getClass(), "propListHead", null);
        setIntField(term1192, term1192.getClass(), "sourcePosition", 0);
        setField(term1192, term1192.getClass(), "jsType", null);
        setField(term1192, term1192.getClass(), "parent", null);
        setField(term1190, term1190.getClass(), "next", term1192);
        setField(term1190, term1190.getClass(), "first", term1190);
        setField(term1190, term1190.getClass(), "last", term1190);
        setField(term1190, term1190.getClass(), "propListHead", null);
        setIntField(term1190, term1190.getClass(), "sourcePosition", 0);
        setField(term1190, term1190.getClass(), "jsType", null);
        setField(term1190, term1190.getClass(), "parent", null);
        setField(term1188, term1188.getClass(), "next", term1190);
        setIntField(term1202, term1202.getClass(), "type", 0);
        setField(term1202, term1202.getClass(), "next", null);
        setField(term1202, term1202.getClass(), "first", null);
        setField(term1202, term1202.getClass(), "last", null);
        setField(term1202, term1202.getClass(), "propListHead", null);
        setIntField(term1202, term1202.getClass(), "sourcePosition", 0);
        setField(term1202, term1202.getClass(), "jsType", null);
        setField(term1202, term1202.getClass(), "parent", null);
        setField(term1188, term1188.getClass(), "first", term1202);
        setIntField(term1205, term1205.getClass(), "type", 0);
        setField(term1205, term1205.getClass(), "next", null);
        setField(term1205, term1205.getClass(), "first", null);
        setField(term1205, term1205.getClass(), "last", null);
        setField(term1205, term1205.getClass(), "propListHead", null);
        setIntField(term1205, term1205.getClass(), "sourcePosition", 0);
        setField(term1205, term1205.getClass(), "jsType", null);
        setField(term1205, term1205.getClass(), "parent", null);
        setField(term1188, term1188.getClass(), "last", term1205);
        setField(term1188, term1188.getClass(), "propListHead", null);
        setIntField(term1188, term1188.getClass(), "sourcePosition", 0);
        setField(term1188, term1188.getClass(), "jsType", null);
        setField(term1188, term1188.getClass(), "parent", null);
        setField(term1110, term1110.getClass(), "node", term1188);
        setIntField(term1110, term1110.getClass(), "lineNumber", -93135961);
        setField(term1110, term1110.getClass(), "level", enum9);
        setField(term1110, term1110.getClass(), "defaultLevel", enum9);
        setIntField(term1110, term1110.getClass(), "charno", -112921587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1110;
        try {
            callMethod(klass, "addInvalidatingType", argTypes, term1098, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


