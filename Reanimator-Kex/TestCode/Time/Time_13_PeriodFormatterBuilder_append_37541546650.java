package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class PeriodFormatterBuilder_append_37541546650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term61;
     Object term1216;
     Object term1220;
     Object term1168;

    public PeriodFormatterBuilder_append_37541546650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term54 = new ArrayList();
        term49 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term60 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term49, term49.getClass(), "iMinPrintedDigits", 1);
        setIntField(term49, term49.getClass(), "iPrintZeroSetting", 2);
        setIntField(term49, term49.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term49, term49.getClass(), "iRejectSignedValues", false);
        setField(term49, term49.getClass(), "iPrefix", null);
        setField(term49, term49.getClass(), "iElementPairs", term54);
        setBooleanField(term49, term49.getClass(), "iNotPrinter", true);
        setBooleanField(term49, term49.getClass(), "iNotParser", false);
        setField(term49, term49.getClass(), "iFieldFormatters", term60);
        term61 = newInstance(Class.forName("org.joda.time.format.PeriodFormatter"));
        Object term62 = newInstance(Class.forName("java.util.Locale"));
        Object term63 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term78 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term91 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term92 = (int[]) newIntArray(2);
        setField(term61, term61.getClass(), "iPrinter", null);
        setField(term61, term61.getClass(), "iParser", null);
        setField(term63, term63.getClass(), "language", "pt");
        setField(term63, term63.getClass(), "script", "");
        setField(term63, term63.getClass(), "region", "MO");
        setField(term63, term63.getClass(), "variant", "");
        setIntField(term63, term63.getClass(), "hash", 106966554);
        setField(term62, term62.getClass(), "baseLocale", term63);
        setField(term62, term62.getClass(), "localeExtensions", null);
        setIntField(term62, term62.getClass(), "hashCodeValue", 106966554);
        setField(term62, term62.getClass(), "languageTag", null);
        setField(term61, term61.getClass(), "iLocale", term62);
        setField(term78, term78.getClass(), "iName", "SzjVpOQTyS");
        setField(term78, term78.getClass(), "iTypes", term91);
        setIntElement(term92, 0, -73683645);
        setIntElement(term92, 1, -226514366);
        setField(term78, term78.getClass(), "iIndices", term92);
        setField(term61, term61.getClass(), "iParseType", term78);
        ArrayList term1217 = new ArrayList();
        ((ArrayList) term1217).add((Object)null);
        ((ArrayList) term1217).add((Object)null);
        term1216 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1219 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1216, term1216.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1216, term1216.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1216, term1216.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1216, term1216.getClass(), "iRejectSignedValues", false);
        setField(term1216, term1216.getClass(), "iPrefix", null);
        setField(term1216, term1216.getClass(), "iElementPairs", term1217);
        setBooleanField(term1216, term1216.getClass(), "iNotPrinter", true);
        setBooleanField(term1216, term1216.getClass(), "iNotParser", true);
        setField(term1216, term1216.getClass(), "iFieldFormatters", term1219);
        term1220 = newInstance(Class.forName("org.joda.time.format.PeriodFormatter"));
        Object term1221 = newInstance(Class.forName("java.util.Locale"));
        Object term1222 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1231 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1234 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term1235 = (int[]) newIntArray(2);
        setField(term1220, term1220.getClass(), "iPrinter", null);
        setField(term1220, term1220.getClass(), "iParser", null);
        setField(term1222, term1222.getClass(), "language", "pt");
        setField(term1222, term1222.getClass(), "script", "");
        setField(term1222, term1222.getClass(), "region", "MO");
        setField(term1222, term1222.getClass(), "variant", "");
        setIntField(term1222, term1222.getClass(), "hash", 106966554);
        setField(term1221, term1221.getClass(), "baseLocale", term1222);
        setField(term1221, term1221.getClass(), "localeExtensions", null);
        setIntField(term1221, term1221.getClass(), "hashCodeValue", 106966554);
        setField(term1221, term1221.getClass(), "languageTag", null);
        setField(term1220, term1220.getClass(), "iLocale", term1221);
        setField(term1231, term1231.getClass(), "iName", "SzjVpOQTyS");
        setField(term1231, term1231.getClass(), "iTypes", term1234);
        setIntElement(term1235, 0, -73683645);
        setIntElement(term1235, 1, -226514366);
        setField(term1231, term1231.getClass(), "iIndices", term1235);
        setField(term1220, term1220.getClass(), "iParseType", term1231);
        ArrayList term1173 = new ArrayList();
        ((ArrayList) term1173).add((Object)null);
        ((ArrayList) term1173).add((Object)null);
        term1168 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1179 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1168, term1168.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1168, term1168.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1168, term1168.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1168, term1168.getClass(), "iRejectSignedValues", false);
        setField(term1168, term1168.getClass(), "iPrefix", null);
        setField(term1168, term1168.getClass(), "iElementPairs", term1173);
        setBooleanField(term1168, term1168.getClass(), "iNotPrinter", true);
        setBooleanField(term1168, term1168.getClass(), "iNotParser", true);
        setField(term1168, term1168.getClass(), "iFieldFormatters", term1179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.PeriodFormatter");
        Object[] args = new Object[1];
        args[0] = term61;
        Object retValue = callMethod(klass, "append", argTypes, term49, args);
        assertTrue(recursiveEquals(term49, term1216));
        assertTrue(recursiveEquals(term61, term1220));
        assertTrue(recursiveEquals(retValue, term1168));
    }

};


