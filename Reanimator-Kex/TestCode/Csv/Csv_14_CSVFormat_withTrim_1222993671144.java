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

public class CSVFormat_withTrim_1222993671144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30510;
     Object term114984;
     Object term114835;

    public CSVFormat_withTrim_1222993671144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term30512 = new Character('H');
        Character term30515 = new Character('o');
        Character term30642 = new Character('A');
        Class<? extends Object> term115116 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term115115 = ((Class) term115116).getDeclaredField((String) "NONE");
        ((Field) term115115).setAccessible(true);
        Object enum234 = ((Field) term115115).get((Object) null);
        term30510 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term30517 = (Object[]) newArray("java.lang.String", 1);
        Object[] term30530 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term30510, term30510.getClass(), "allowMissingColumnNames", false);
        setField(term30510, term30510.getClass(), "commentMarker", term30512);
        setCharField(term30510, term30510.getClass(), "delimiter", 'I');
        setField(term30510, term30510.getClass(), "escapeCharacter", term30515);
        setElement(term30517, 0, "WkLpmqoQxy");
        setField(term30510, term30510.getClass(), "header", term30517);
        setElement(term30530, 0, "XiNoscmYhd");
        setElement(term30530, 1, "asMqnMNrZp");
        setElement(term30530, 2, "pqFUMTCKJd");
        setElement(term30530, 3, "PTEndmPMzk");
        setElement(term30530, 4, "aJQuCOCvZs");
        setElement(term30530, 5, "lHYNCJRiOv");
        setElement(term30530, 6, "QVLresHoaP");
        setElement(term30530, 7, "IbxeAMwLVt");
        setField(term30510, term30510.getClass(), "headerComments", term30530);
        setBooleanField(term30510, term30510.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term30510, term30510.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term30510, term30510.getClass(), "ignoreSurroundingSpaces", true);
        setField(term30510, term30510.getClass(), "nullString", "bShlAqoTmZ");
        setField(term30510, term30510.getClass(), "quoteCharacter", term30642);
        setField(term30510, term30510.getClass(), "quoteMode", enum234);
        setField(term30510, term30510.getClass(), "recordSeparator", "nOKlKlNhtU");
        setBooleanField(term30510, term30510.getClass(), "skipHeaderRecord", false);
        setBooleanField(term30510, term30510.getClass(), "trailingDelimiter", true);
        setBooleanField(term30510, term30510.getClass(), "trim", false);
        Character term114985 = new Character('H');
        Character term114986 = new Character('o');
        Character term115009 = new Character('A');
        Class<? extends Object> term115405 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term115404 = ((Class) term115405).getDeclaredField((String) "NONE");
        ((Field) term115404).setAccessible(true);
        Object enum235 = ((Field) term115404).get((Object) null);
        term114984 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term114987 = (Object[]) newArray("java.lang.String", 1);
        Object[] term114990 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term114984, term114984.getClass(), "allowMissingColumnNames", false);
        setField(term114984, term114984.getClass(), "commentMarker", term114985);
        setCharField(term114984, term114984.getClass(), "delimiter", 'I');
        setField(term114984, term114984.getClass(), "escapeCharacter", term114986);
        setElement(term114987, 0, "WkLpmqoQxy");
        setField(term114984, term114984.getClass(), "header", term114987);
        setElement(term114990, 0, "XiNoscmYhd");
        setElement(term114990, 1, "asMqnMNrZp");
        setElement(term114990, 2, "pqFUMTCKJd");
        setElement(term114990, 3, "PTEndmPMzk");
        setElement(term114990, 4, "aJQuCOCvZs");
        setElement(term114990, 5, "lHYNCJRiOv");
        setElement(term114990, 6, "QVLresHoaP");
        setElement(term114990, 7, "IbxeAMwLVt");
        setField(term114984, term114984.getClass(), "headerComments", term114990);
        setBooleanField(term114984, term114984.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term114984, term114984.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term114984, term114984.getClass(), "ignoreSurroundingSpaces", true);
        setField(term114984, term114984.getClass(), "nullString", "bShlAqoTmZ");
        setField(term114984, term114984.getClass(), "quoteCharacter", term115009);
        setField(term114984, term114984.getClass(), "quoteMode", enum235);
        setField(term114984, term114984.getClass(), "recordSeparator", "nOKlKlNhtU");
        setBooleanField(term114984, term114984.getClass(), "skipHeaderRecord", false);
        setBooleanField(term114984, term114984.getClass(), "trailingDelimiter", true);
        setBooleanField(term114984, term114984.getClass(), "trim", false);
        Character term114837 = new Character('H');
        Character term114840 = new Character('o');
        Character term114967 = new Character('A');
        Class<? extends Object> term115694 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term115693 = ((Class) term115694).getDeclaredField((String) "NONE");
        ((Field) term115693).setAccessible(true);
        Object enum236 = ((Field) term115693).get((Object) null);
        term114835 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term114842 = (Object[]) newArray("java.lang.String", 1);
        Object[] term114855 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term114835, term114835.getClass(), "allowMissingColumnNames", false);
        setField(term114835, term114835.getClass(), "commentMarker", term114837);
        setCharField(term114835, term114835.getClass(), "delimiter", 'I');
        setField(term114835, term114835.getClass(), "escapeCharacter", term114840);
        setElement(term114842, 0, "WkLpmqoQxy");
        setField(term114835, term114835.getClass(), "header", term114842);
        setElement(term114855, 0, "XiNoscmYhd");
        setElement(term114855, 1, "asMqnMNrZp");
        setElement(term114855, 2, "pqFUMTCKJd");
        setElement(term114855, 3, "PTEndmPMzk");
        setElement(term114855, 4, "aJQuCOCvZs");
        setElement(term114855, 5, "lHYNCJRiOv");
        setElement(term114855, 6, "QVLresHoaP");
        setElement(term114855, 7, "IbxeAMwLVt");
        setField(term114835, term114835.getClass(), "headerComments", term114855);
        setBooleanField(term114835, term114835.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term114835, term114835.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term114835, term114835.getClass(), "ignoreSurroundingSpaces", true);
        setField(term114835, term114835.getClass(), "nullString", "bShlAqoTmZ");
        setField(term114835, term114835.getClass(), "quoteCharacter", term114967);
        setField(term114835, term114835.getClass(), "quoteMode", enum236);
        setField(term114835, term114835.getClass(), "recordSeparator", "nOKlKlNhtU");
        setBooleanField(term114835, term114835.getClass(), "skipHeaderRecord", false);
        setBooleanField(term114835, term114835.getClass(), "trailingDelimiter", true);
        setBooleanField(term114835, term114835.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withTrim", argTypes, term30510, args);
        assertTrue(recursiveEquals(term30510, term114984));
        assertTrue(recursiveEquals(retValue, term114835));
    }

};


