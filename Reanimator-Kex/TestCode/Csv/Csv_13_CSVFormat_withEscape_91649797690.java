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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withEscape_91649797690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13707;
     Object term13946;
     Object term66785;
     Object term66553;

    public CSVFormat_withEscape_91649797690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term13709 = new Character('z');
        Class<? extends Object> term66831 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term66830 = ((Class) term66831).getDeclaredField((String) "NONE");
        ((Field) term66830).setAccessible(true);
        Object enum116 = ((Field) term66830).get((Object) null);
        Character term13719 = new Character('R');
        Character term13721 = new Character('f');
        term13707 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13750 = (Object[]) newArray("java.lang.String", 9);
        Object[] term13859 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term13707, term13707.getClass(), "delimiter", 'V');
        setField(term13707, term13707.getClass(), "quoteCharacter", term13709);
        setField(term13707, term13707.getClass(), "quoteMode", enum116);
        setField(term13707, term13707.getClass(), "commentMarker", term13719);
        setField(term13707, term13707.getClass(), "escapeCharacter", term13721);
        setBooleanField(term13707, term13707.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term13707, term13707.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term13707, term13707.getClass(), "ignoreEmptyLines", true);
        setField(term13707, term13707.getClass(), "recordSeparator", "jnwVnmKAFv");
        setField(term13707, term13707.getClass(), "nullString", "TXyHhqeCjR");
        setElement(term13750, 0, "lZIgPZPgTu");
        setElement(term13750, 1, "iuCxnHGMoW");
        setElement(term13750, 2, "GPSEWEDSTo");
        setElement(term13750, 3, "RCOqfVsRHt");
        setElement(term13750, 4, "TSyCeEZPaT");
        setElement(term13750, 5, "JeZFtaqkzW");
        setElement(term13750, 6, "vOVuNSCCLe");
        setElement(term13750, 7, "fzeqPnzpnt");
        setElement(term13750, 8, "RxbhrFBjkO");
        setField(term13707, term13707.getClass(), "header", term13750);
        setElement(term13859, 0, "aanyiAOJCl");
        setElement(term13859, 1, "VDokbsCuqq");
        setElement(term13859, 2, "xClUIcPECX");
        setElement(term13859, 3, "avhRaGZaBF");
        setElement(term13859, 4, "JkgoRtImdE");
        setElement(term13859, 5, "qFGKIJjlmV");
        setElement(term13859, 6, "IHqvyhMtuM");
        setField(term13707, term13707.getClass(), "headerComments", term13859);
        setBooleanField(term13707, term13707.getClass(), "skipHeaderRecord", true);
        setBooleanField(term13707, term13707.getClass(), "ignoreHeaderCase", false);
        term13946 = new Character('L');
        Character term66786 = new Character('z');
        Class<? extends Object> term67190 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term67189 = ((Class) term67190).getDeclaredField((String) "NONE");
        ((Field) term67189).setAccessible(true);
        Object enum117 = ((Field) term67189).get((Object) null);
        Character term66790 = new Character('R');
        Character term66791 = new Character('f');
        term66785 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term66796 = (Object[]) newArray("java.lang.String", 9);
        Object[] term66815 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term66785, term66785.getClass(), "delimiter", 'V');
        setField(term66785, term66785.getClass(), "quoteCharacter", term66786);
        setField(term66785, term66785.getClass(), "quoteMode", enum117);
        setField(term66785, term66785.getClass(), "commentMarker", term66790);
        setField(term66785, term66785.getClass(), "escapeCharacter", term66791);
        setBooleanField(term66785, term66785.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term66785, term66785.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term66785, term66785.getClass(), "ignoreEmptyLines", true);
        setField(term66785, term66785.getClass(), "recordSeparator", "jnwVnmKAFv");
        setField(term66785, term66785.getClass(), "nullString", "TXyHhqeCjR");
        setElement(term66796, 0, "lZIgPZPgTu");
        setElement(term66796, 1, "iuCxnHGMoW");
        setElement(term66796, 2, "GPSEWEDSTo");
        setElement(term66796, 3, "RCOqfVsRHt");
        setElement(term66796, 4, "TSyCeEZPaT");
        setElement(term66796, 5, "JeZFtaqkzW");
        setElement(term66796, 6, "vOVuNSCCLe");
        setElement(term66796, 7, "fzeqPnzpnt");
        setElement(term66796, 8, "RxbhrFBjkO");
        setField(term66785, term66785.getClass(), "header", term66796);
        setElement(term66815, 0, "aanyiAOJCl");
        setElement(term66815, 1, "VDokbsCuqq");
        setElement(term66815, 2, "xClUIcPECX");
        setElement(term66815, 3, "avhRaGZaBF");
        setElement(term66815, 4, "JkgoRtImdE");
        setElement(term66815, 5, "qFGKIJjlmV");
        setElement(term66815, 6, "IHqvyhMtuM");
        setField(term66785, term66785.getClass(), "headerComments", term66815);
        setBooleanField(term66785, term66785.getClass(), "skipHeaderRecord", true);
        setBooleanField(term66785, term66785.getClass(), "ignoreHeaderCase", false);
        Character term66555 = new Character('z');
        Class<? extends Object> term67549 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term67548 = ((Class) term67549).getDeclaredField((String) "NONE");
        ((Field) term67548).setAccessible(true);
        Object enum118 = ((Field) term67548).get((Object) null);
        Character term66557 = new Character('R');
        Character term66559 = new Character('L');
        term66553 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term66588 = (Object[]) newArray("java.lang.String", 9);
        Object[] term66697 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term66553, term66553.getClass(), "delimiter", 'V');
        setField(term66553, term66553.getClass(), "quoteCharacter", term66555);
        setField(term66553, term66553.getClass(), "quoteMode", enum118);
        setField(term66553, term66553.getClass(), "commentMarker", term66557);
        setField(term66553, term66553.getClass(), "escapeCharacter", term66559);
        setBooleanField(term66553, term66553.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term66553, term66553.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term66553, term66553.getClass(), "ignoreEmptyLines", true);
        setField(term66553, term66553.getClass(), "recordSeparator", "jnwVnmKAFv");
        setField(term66553, term66553.getClass(), "nullString", "TXyHhqeCjR");
        setElement(term66588, 0, "lZIgPZPgTu");
        setElement(term66588, 1, "iuCxnHGMoW");
        setElement(term66588, 2, "GPSEWEDSTo");
        setElement(term66588, 3, "RCOqfVsRHt");
        setElement(term66588, 4, "TSyCeEZPaT");
        setElement(term66588, 5, "JeZFtaqkzW");
        setElement(term66588, 6, "vOVuNSCCLe");
        setElement(term66588, 7, "fzeqPnzpnt");
        setElement(term66588, 8, "RxbhrFBjkO");
        setField(term66553, term66553.getClass(), "header", term66588);
        setElement(term66697, 0, "aanyiAOJCl");
        setElement(term66697, 1, "VDokbsCuqq");
        setElement(term66697, 2, "xClUIcPECX");
        setElement(term66697, 3, "avhRaGZaBF");
        setElement(term66697, 4, "JkgoRtImdE");
        setElement(term66697, 5, "qFGKIJjlmV");
        setElement(term66697, 6, "IHqvyhMtuM");
        setField(term66553, term66553.getClass(), "headerComments", term66697);
        setBooleanField(term66553, term66553.getClass(), "skipHeaderRecord", true);
        setBooleanField(term66553, term66553.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term13946;
        Object retValue = callMethod(klass, "withEscape", argTypes, term13707, args);
        assertTrue(recursiveEquals(term13707, term66785));
        assertTrue(recursiveEquals(term13946, 'L'));
        assertTrue(recursiveEquals(retValue, term66553));
    }

};


