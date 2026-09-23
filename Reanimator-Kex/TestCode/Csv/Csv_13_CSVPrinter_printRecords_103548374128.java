package org.apache.commons.csv;

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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecords_103548374128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5737;
     Object term5906;

    public CSVPrinter_printRecords_103548374128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5740 = new Character('D');
        Class<? extends Object> term17757 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term17756 = ((Class) term17757).getDeclaredField((String) "NONE");
        ((Field) term17756).setAccessible(true);
        Object enum31 = ((Field) term17756).get((Object) null);
        Character term5750 = new Character('I');
        Character term5752 = new Character('R');
        term5737 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term5738 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5781 = (Object[]) newArray("java.lang.String", 3);
        Object[] term5818 = (Object[]) newArray("java.lang.String", 7);
        setField(term5737, term5737.getClass(), "out", null);
        setCharField(term5738, term5738.getClass(), "delimiter", 't');
        setField(term5738, term5738.getClass(), "quoteCharacter", term5740);
        setField(term5738, term5738.getClass(), "quoteMode", enum31);
        setField(term5738, term5738.getClass(), "commentMarker", term5750);
        setField(term5738, term5738.getClass(), "escapeCharacter", term5752);
        setBooleanField(term5738, term5738.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term5738, term5738.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term5738, term5738.getClass(), "ignoreEmptyLines", true);
        setField(term5738, term5738.getClass(), "recordSeparator", "OJJtVNPyKZ");
        setField(term5738, term5738.getClass(), "nullString", "AKNapTAfmD");
        setElement(term5781, 0, "xJgPlLxpgC");
        setElement(term5781, 1, "EYtfuJaxiM");
        setElement(term5781, 2, "gCWtLVKVVe");
        setField(term5738, term5738.getClass(), "header", term5781);
        setElement(term5818, 0, "fWKJoSoCwE");
        setElement(term5818, 1, "wfaXBpWAUH");
        setElement(term5818, 2, "VMeAzAHwZj");
        setElement(term5818, 3, "PznxWXsZME");
        setElement(term5818, 4, "ZzIujlwVsw");
        setElement(term5818, 5, "LWyEaeIyAo");
        setElement(term5818, 6, "yVMkkQhvmN");
        setField(term5738, term5738.getClass(), "headerComments", term5818);
        setBooleanField(term5738, term5738.getClass(), "skipHeaderRecord", false);
        setBooleanField(term5738, term5738.getClass(), "ignoreHeaderCase", false);
        setField(term5737, term5737.getClass(), "format", term5738);
        setBooleanField(term5737, term5737.getClass(), "newRecord", true);
        term5906 = (Object[]) newArray("java.lang.Object", 2);
        Object term5907 = newInstance(Class.forName("java.lang.Object"));
        Object term5908 = newInstance(Class.forName("java.lang.Object"));
        setElement(term5906, 0, term5907);
        setElement(term5906, 1, term5908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5906;
        try {
            callMethod(klass, "printRecords", argTypes, term5737, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


