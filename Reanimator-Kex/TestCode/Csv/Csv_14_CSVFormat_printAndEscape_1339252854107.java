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
import java.lang.Integer;

public class CSVFormat_printAndEscape_1339252854107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13818;
     Object term14059;
     Object term14061;
     Object term63203;

    public CSVFormat_printAndEscape_1339252854107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term13820 = new Character('s');
        Character term13823 = new Character('Y');
        Character term14034 = new Character('V');
        Class<? extends Object> term63419 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term63418 = ((Class) term63419).getDeclaredField((String) "NONE");
        ((Field) term63418).setAccessible(true);
        Object enum130 = ((Field) term63418).get((Object) null);
        term13818 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13825 = (Object[]) newArray("java.lang.String", 7);
        Object[] term13910 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term13818, term13818.getClass(), "allowMissingColumnNames", false);
        setField(term13818, term13818.getClass(), "commentMarker", term13820);
        setCharField(term13818, term13818.getClass(), "delimiter", 'z');
        setField(term13818, term13818.getClass(), "escapeCharacter", term13823);
        setElement(term13825, 0, "HwLHeGLyhe");
        setElement(term13825, 1, "RDnkgWkcbz");
        setElement(term13825, 2, "IBpaxltauX");
        setElement(term13825, 3, "hePqROaplw");
        setElement(term13825, 4, "PJcSNDruWd");
        setElement(term13825, 5, "VVNNlAePXF");
        setElement(term13825, 6, "jnwVnmKAFv");
        setField(term13818, term13818.getClass(), "header", term13825);
        setElement(term13910, 0, "TXyHhqeCjR");
        setElement(term13910, 1, "lZIgPZPgTu");
        setElement(term13910, 2, "iuCxnHGMoW");
        setElement(term13910, 3, "GPSEWEDSTo");
        setElement(term13910, 4, "RCOqfVsRHt");
        setElement(term13910, 5, "TSyCeEZPaT");
        setElement(term13910, 6, "JeZFtaqkzW");
        setElement(term13910, 7, "vOVuNSCCLe");
        setElement(term13910, 8, "fzeqPnzpnt");
        setField(term13818, term13818.getClass(), "headerComments", term13910);
        setBooleanField(term13818, term13818.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term13818, term13818.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term13818, term13818.getClass(), "ignoreSurroundingSpaces", false);
        setField(term13818, term13818.getClass(), "nullString", "RxbhrFBjkO");
        setField(term13818, term13818.getClass(), "quoteCharacter", term14034);
        setField(term13818, term13818.getClass(), "quoteMode", enum130);
        setField(term13818, term13818.getClass(), "recordSeparator", "aanyiAOJCl");
        setBooleanField(term13818, term13818.getClass(), "skipHeaderRecord", true);
        setBooleanField(term13818, term13818.getClass(), "trailingDelimiter", true);
        setBooleanField(term13818, term13818.getClass(), "trim", false);
        term14059 = new Integer(391863371);
        term14061 = new Integer(-1922583790);
        Character term63204 = new Character('s');
        Character term63205 = new Character('Y');
        Character term63242 = new Character('V');
        Class<? extends Object> term63778 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term63777 = ((Class) term63778).getDeclaredField((String) "NONE");
        ((Field) term63777).setAccessible(true);
        Object enum131 = ((Field) term63777).get((Object) null);
        term63203 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term63206 = (Object[]) newArray("java.lang.String", 7);
        Object[] term63221 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term63203, term63203.getClass(), "allowMissingColumnNames", false);
        setField(term63203, term63203.getClass(), "commentMarker", term63204);
        setCharField(term63203, term63203.getClass(), "delimiter", 'z');
        setField(term63203, term63203.getClass(), "escapeCharacter", term63205);
        setElement(term63206, 0, "HwLHeGLyhe");
        setElement(term63206, 1, "RDnkgWkcbz");
        setElement(term63206, 2, "IBpaxltauX");
        setElement(term63206, 3, "hePqROaplw");
        setElement(term63206, 4, "PJcSNDruWd");
        setElement(term63206, 5, "VVNNlAePXF");
        setElement(term63206, 6, "jnwVnmKAFv");
        setField(term63203, term63203.getClass(), "header", term63206);
        setElement(term63221, 0, "TXyHhqeCjR");
        setElement(term63221, 1, "lZIgPZPgTu");
        setElement(term63221, 2, "iuCxnHGMoW");
        setElement(term63221, 3, "GPSEWEDSTo");
        setElement(term63221, 4, "RCOqfVsRHt");
        setElement(term63221, 5, "TSyCeEZPaT");
        setElement(term63221, 6, "JeZFtaqkzW");
        setElement(term63221, 7, "vOVuNSCCLe");
        setElement(term63221, 8, "fzeqPnzpnt");
        setField(term63203, term63203.getClass(), "headerComments", term63221);
        setBooleanField(term63203, term63203.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term63203, term63203.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term63203, term63203.getClass(), "ignoreSurroundingSpaces", false);
        setField(term63203, term63203.getClass(), "nullString", "RxbhrFBjkO");
        setField(term63203, term63203.getClass(), "quoteCharacter", term63242);
        setField(term63203, term63203.getClass(), "quoteMode", enum131);
        setField(term63203, term63203.getClass(), "recordSeparator", "aanyiAOJCl");
        setBooleanField(term63203, term63203.getClass(), "skipHeaderRecord", true);
        setBooleanField(term63203, term63203.getClass(), "trailingDelimiter", true);
        setBooleanField(term63203, term63203.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term14059;
        args[2] = term14061;
        args[3] = null;
        callMethod(klass, "printAndEscape", argTypes, term13818, args);
        assertTrue(recursiveEquals(term13818, term63203));
        assertTrue(recursiveEquals(term14059, 391863371));
        assertTrue(recursiveEquals(term14061, -1922583790));
    }

};


