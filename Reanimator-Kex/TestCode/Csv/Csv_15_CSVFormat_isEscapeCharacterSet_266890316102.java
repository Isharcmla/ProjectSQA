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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_isEscapeCharacterSet_266890316102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9815;
     Object term57999;

    public CSVFormat_isEscapeCharacterSet_266890316102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9817 = new Character('M');
        Character term9820 = new Character('I');
        Character term9947 = new Character('s');
        Class<? extends Object> term58132 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term58131 = ((Class) term58132).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term58131).setAccessible(true);
        Object enum120 = ((Field) term58131).get((Object) null);
        term9815 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9822 = (Object[]) newArray("java.lang.String", 3);
        Object[] term9859 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term9815, term9815.getClass(), "allowMissingColumnNames", true);
        setField(term9815, term9815.getClass(), "commentMarker", term9817);
        setCharField(term9815, term9815.getClass(), "delimiter", 'F');
        setField(term9815, term9815.getClass(), "escapeCharacter", term9820);
        setElement(term9822, 0, "gUvcueTURF");
        setElement(term9822, 1, "EwQBhZjCIT");
        setElement(term9822, 2, "aSkmSwTnEw");
        setField(term9815, term9815.getClass(), "header", term9822);
        setElement(term9859, 0, "xvkbvaEGYd");
        setElement(term9859, 1, "HBGNxdNURv");
        setElement(term9859, 2, "mfCpTPPQQm");
        setElement(term9859, 3, "OcJCIDNIXA");
        setElement(term9859, 4, "XfRABIFVEp");
        setElement(term9859, 5, "MHGKyEnwKc");
        setField(term9815, term9815.getClass(), "headerComments", term9859);
        setBooleanField(term9815, term9815.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term9815, term9815.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term9815, term9815.getClass(), "ignoreSurroundingSpaces", true);
        setField(term9815, term9815.getClass(), "nullString", "ShIELyuULw");
        setField(term9815, term9815.getClass(), "quoteCharacter", term9947);
        setField(term9815, term9815.getClass(), "quoteMode", enum120);
        setField(term9815, term9815.getClass(), "recordSeparator", "IpQuOGMgmj");
        setBooleanField(term9815, term9815.getClass(), "skipHeaderRecord", false);
        setBooleanField(term9815, term9815.getClass(), "trailingDelimiter", true);
        setBooleanField(term9815, term9815.getClass(), "trim", false);
        setBooleanField(term9815, term9815.getClass(), "autoFlush", false);
        Character term58000 = new Character('M');
        Character term58001 = new Character('I');
        Character term58024 = new Character('s');
        Class<? extends Object> term58445 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term58444 = ((Class) term58445).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term58444).setAccessible(true);
        Object enum121 = ((Field) term58444).get((Object) null);
        term57999 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term58002 = (Object[]) newArray("java.lang.String", 3);
        Object[] term58009 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term57999, term57999.getClass(), "allowMissingColumnNames", true);
        setField(term57999, term57999.getClass(), "commentMarker", term58000);
        setCharField(term57999, term57999.getClass(), "delimiter", 'F');
        setField(term57999, term57999.getClass(), "escapeCharacter", term58001);
        setElement(term58002, 0, "gUvcueTURF");
        setElement(term58002, 1, "EwQBhZjCIT");
        setElement(term58002, 2, "aSkmSwTnEw");
        setField(term57999, term57999.getClass(), "header", term58002);
        setElement(term58009, 0, "xvkbvaEGYd");
        setElement(term58009, 1, "HBGNxdNURv");
        setElement(term58009, 2, "mfCpTPPQQm");
        setElement(term58009, 3, "OcJCIDNIXA");
        setElement(term58009, 4, "XfRABIFVEp");
        setElement(term58009, 5, "MHGKyEnwKc");
        setField(term57999, term57999.getClass(), "headerComments", term58009);
        setBooleanField(term57999, term57999.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term57999, term57999.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term57999, term57999.getClass(), "ignoreSurroundingSpaces", true);
        setField(term57999, term57999.getClass(), "nullString", "ShIELyuULw");
        setField(term57999, term57999.getClass(), "quoteCharacter", term58024);
        setField(term57999, term57999.getClass(), "quoteMode", enum121);
        setField(term57999, term57999.getClass(), "recordSeparator", "IpQuOGMgmj");
        setBooleanField(term57999, term57999.getClass(), "skipHeaderRecord", false);
        setBooleanField(term57999, term57999.getClass(), "trailingDelimiter", true);
        setBooleanField(term57999, term57999.getClass(), "trim", false);
        setBooleanField(term57999, term57999.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEscapeCharacterSet", argTypes, term9815, args);
        assertTrue(recursiveEquals(term9815, term57999));
        assertTrue(recursiveEquals(retValue, true));
    }

};


