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

public class CSVFormat_withHeader_26975908792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14847;
     Object term14966;
     Object term70253;
     Object term70278;
     Object term69756;

    public CSVFormat_withHeader_26975908792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term14849 = new Character('w');
        Class<? extends Object> term70290 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term70289 = ((Class) term70290).getDeclaredField((String) "NONE");
        ((Field) term70289).setAccessible(true);
        Object enum122 = ((Field) term70289).get((Object) null);
        Character term14859 = new Character('X');
        Character term14861 = new Character('R');
        term14847 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term14890 = (Object[]) newArray("java.lang.String", 0);
        Object[] term14891 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term14847, term14847.getClass(), "delimiter", 'E');
        setField(term14847, term14847.getClass(), "quoteCharacter", term14849);
        setField(term14847, term14847.getClass(), "quoteMode", enum122);
        setField(term14847, term14847.getClass(), "commentMarker", term14859);
        setField(term14847, term14847.getClass(), "escapeCharacter", term14861);
        setBooleanField(term14847, term14847.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term14847, term14847.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term14847, term14847.getClass(), "ignoreEmptyLines", false);
        setField(term14847, term14847.getClass(), "recordSeparator", "sUEeHQTWkA");
        setField(term14847, term14847.getClass(), "nullString", "BDIRCxAWLA");
        setField(term14847, term14847.getClass(), "header", term14890);
        setElement(term14891, 0, "eOJfbiZLnb");
        setElement(term14891, 1, "nKZKnxWYCK");
        setElement(term14891, 2, "JOqQxuzRuZ");
        setElement(term14891, 3, "RSaoipUlsg");
        setElement(term14891, 4, "cSHGbqKqlN");
        setElement(term14891, 5, "pFAfANnxup");
        setField(term14847, term14847.getClass(), "headerComments", term14891);
        setBooleanField(term14847, term14847.getClass(), "skipHeaderRecord", false);
        setBooleanField(term14847, term14847.getClass(), "ignoreHeaderCase", true);
        term14966 = (Object[]) newArray("java.lang.String", 5);
        setElement(term14966, 0, "FbSIUZyBXZ");
        setElement(term14966, 1, "mhQDwIyrRi");
        setElement(term14966, 2, "HpZXWDPhlg");
        setElement(term14966, 3, "lBOokzEPfe");
        setElement(term14966, 4, "dtGZCsKXbW");
        Character term70254 = new Character('w');
        Class<? extends Object> term70599 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term70598 = ((Class) term70599).getDeclaredField((String) "NONE");
        ((Field) term70598).setAccessible(true);
        Object enum123 = ((Field) term70598).get((Object) null);
        Character term70258 = new Character('X');
        Character term70259 = new Character('R');
        term70253 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term70264 = (Object[]) newArray("java.lang.String", 0);
        Object[] term70265 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term70253, term70253.getClass(), "delimiter", 'E');
        setField(term70253, term70253.getClass(), "quoteCharacter", term70254);
        setField(term70253, term70253.getClass(), "quoteMode", enum123);
        setField(term70253, term70253.getClass(), "commentMarker", term70258);
        setField(term70253, term70253.getClass(), "escapeCharacter", term70259);
        setBooleanField(term70253, term70253.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term70253, term70253.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term70253, term70253.getClass(), "ignoreEmptyLines", false);
        setField(term70253, term70253.getClass(), "recordSeparator", "sUEeHQTWkA");
        setField(term70253, term70253.getClass(), "nullString", "BDIRCxAWLA");
        setField(term70253, term70253.getClass(), "header", term70264);
        setElement(term70265, 0, "eOJfbiZLnb");
        setElement(term70265, 1, "nKZKnxWYCK");
        setElement(term70265, 2, "JOqQxuzRuZ");
        setElement(term70265, 3, "RSaoipUlsg");
        setElement(term70265, 4, "cSHGbqKqlN");
        setElement(term70265, 5, "pFAfANnxup");
        setField(term70253, term70253.getClass(), "headerComments", term70265);
        setBooleanField(term70253, term70253.getClass(), "skipHeaderRecord", false);
        setBooleanField(term70253, term70253.getClass(), "ignoreHeaderCase", true);
        term70278 = (Object[]) newArray("java.lang.String", 5);
        setElement(term70278, 0, "FbSIUZyBXZ");
        setElement(term70278, 1, "mhQDwIyrRi");
        setElement(term70278, 2, "HpZXWDPhlg");
        setElement(term70278, 3, "lBOokzEPfe");
        setElement(term70278, 4, "dtGZCsKXbW");
        Character term69758 = new Character('w');
        Class<? extends Object> term70908 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term70907 = ((Class) term70908).getDeclaredField((String) "NONE");
        ((Field) term70907).setAccessible(true);
        Object enum124 = ((Field) term70907).get((Object) null);
        Character term69768 = new Character('X');
        Character term69770 = new Character('R');
        term69756 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term69799 = (Object[]) newArray("java.lang.String", 5);
        Object[] term69860 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term69756, term69756.getClass(), "delimiter", 'E');
        setField(term69756, term69756.getClass(), "quoteCharacter", term69758);
        setField(term69756, term69756.getClass(), "quoteMode", enum124);
        setField(term69756, term69756.getClass(), "commentMarker", term69768);
        setField(term69756, term69756.getClass(), "escapeCharacter", term69770);
        setBooleanField(term69756, term69756.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term69756, term69756.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term69756, term69756.getClass(), "ignoreEmptyLines", false);
        setField(term69756, term69756.getClass(), "recordSeparator", "sUEeHQTWkA");
        setField(term69756, term69756.getClass(), "nullString", "BDIRCxAWLA");
        setElement(term69799, 0, "FbSIUZyBXZ");
        setElement(term69799, 1, "mhQDwIyrRi");
        setElement(term69799, 2, "HpZXWDPhlg");
        setElement(term69799, 3, "lBOokzEPfe");
        setElement(term69799, 4, "dtGZCsKXbW");
        setField(term69756, term69756.getClass(), "header", term69799);
        setElement(term69860, 0, "eOJfbiZLnb");
        setElement(term69860, 1, "nKZKnxWYCK");
        setElement(term69860, 2, "JOqQxuzRuZ");
        setElement(term69860, 3, "RSaoipUlsg");
        setElement(term69860, 4, "cSHGbqKqlN");
        setElement(term69860, 5, "pFAfANnxup");
        setField(term69756, term69756.getClass(), "headerComments", term69860);
        setBooleanField(term69756, term69756.getClass(), "skipHeaderRecord", false);
        setBooleanField(term69756, term69756.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term14966;
        Object retValue = callMethod(klass, "withHeader", argTypes, term14847, args);
        assertTrue(recursiveEquals(term14847, term70253));
        assertTrue(recursiveEquals(term14966, term70278));
        assertTrue(recursiveEquals(retValue, term69756));
    }

};


