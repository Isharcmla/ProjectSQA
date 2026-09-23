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

public class CSVFormat_isNullStringSet_101520930499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9804;
     Object term57039;

    public CSVFormat_isNullStringSet_101520930499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9806 = new Character('M');
        Character term9809 = new Character('I');
        Character term9936 = new Character('s');
        Class<? extends Object> term57240 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term57239 = ((Class) term57240).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term57239).setAccessible(true);
        Object enum117 = ((Field) term57239).get((Object) null);
        term9804 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9811 = (Object[]) newArray("java.lang.String", 3);
        Object[] term9848 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term9804, term9804.getClass(), "allowMissingColumnNames", false);
        setField(term9804, term9804.getClass(), "commentMarker", term9806);
        setCharField(term9804, term9804.getClass(), "delimiter", 'F');
        setField(term9804, term9804.getClass(), "escapeCharacter", term9809);
        setElement(term9811, 0, "gUvcueTURF");
        setElement(term9811, 1, "EwQBhZjCIT");
        setElement(term9811, 2, "aSkmSwTnEw");
        setField(term9804, term9804.getClass(), "header", term9811);
        setElement(term9848, 0, "xvkbvaEGYd");
        setElement(term9848, 1, "HBGNxdNURv");
        setElement(term9848, 2, "mfCpTPPQQm");
        setElement(term9848, 3, "OcJCIDNIXA");
        setElement(term9848, 4, "XfRABIFVEp");
        setElement(term9848, 5, "MHGKyEnwKc");
        setField(term9804, term9804.getClass(), "headerComments", term9848);
        setBooleanField(term9804, term9804.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term9804, term9804.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term9804, term9804.getClass(), "ignoreSurroundingSpaces", true);
        setField(term9804, term9804.getClass(), "nullString", "ShIELyuULw");
        setField(term9804, term9804.getClass(), "quoteCharacter", term9936);
        setField(term9804, term9804.getClass(), "quoteMode", enum117);
        setField(term9804, term9804.getClass(), "recordSeparator", "IpQuOGMgmj");
        setBooleanField(term9804, term9804.getClass(), "skipHeaderRecord", false);
        setBooleanField(term9804, term9804.getClass(), "trailingDelimiter", false);
        setBooleanField(term9804, term9804.getClass(), "trim", false);
        Character term57040 = new Character('M');
        Character term57041 = new Character('I');
        Character term57064 = new Character('s');
        Class<? extends Object> term58336 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term58335 = ((Class) term58336).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term58335).setAccessible(true);
        Object enum120 = ((Field) term58335).get((Object) null);
        term57039 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term57042 = (Object[]) newArray("java.lang.String", 3);
        Object[] term57049 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term57039, term57039.getClass(), "allowMissingColumnNames", false);
        setField(term57039, term57039.getClass(), "commentMarker", term57040);
        setCharField(term57039, term57039.getClass(), "delimiter", 'F');
        setField(term57039, term57039.getClass(), "escapeCharacter", term57041);
        setElement(term57042, 0, "gUvcueTURF");
        setElement(term57042, 1, "EwQBhZjCIT");
        setElement(term57042, 2, "aSkmSwTnEw");
        setField(term57039, term57039.getClass(), "header", term57042);
        setElement(term57049, 0, "xvkbvaEGYd");
        setElement(term57049, 1, "HBGNxdNURv");
        setElement(term57049, 2, "mfCpTPPQQm");
        setElement(term57049, 3, "OcJCIDNIXA");
        setElement(term57049, 4, "XfRABIFVEp");
        setElement(term57049, 5, "MHGKyEnwKc");
        setField(term57039, term57039.getClass(), "headerComments", term57049);
        setBooleanField(term57039, term57039.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term57039, term57039.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term57039, term57039.getClass(), "ignoreSurroundingSpaces", true);
        setField(term57039, term57039.getClass(), "nullString", "ShIELyuULw");
        setField(term57039, term57039.getClass(), "quoteCharacter", term57064);
        setField(term57039, term57039.getClass(), "quoteMode", enum120);
        setField(term57039, term57039.getClass(), "recordSeparator", "IpQuOGMgmj");
        setBooleanField(term57039, term57039.getClass(), "skipHeaderRecord", false);
        setBooleanField(term57039, term57039.getClass(), "trailingDelimiter", false);
        setBooleanField(term57039, term57039.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNullStringSet", argTypes, term9804, args);
        assertTrue(recursiveEquals(term9804, term57039));
        assertTrue(recursiveEquals(retValue, true));
    }

};


