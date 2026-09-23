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

public class CSVFormat_getHeaderComments_58354156468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3385;
     Object term45096;
     Object term44805;

    public CSVFormat_getHeaderComments_58354156468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3387 = new Character('D');
        Class<? extends Object> term45138 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45137 = ((Class) term45138).getDeclaredField((String) "MINIMAL");
        ((Field) term45137).setAccessible(true);
        Object enum70 = ((Field) term45137).get((Object) null);
        Character term3400 = new Character('Y');
        Character term3402 = new Character('F');
        term3385 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3431 = (Object[]) newArray("java.lang.String", 8);
        Object[] term3528 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term3385, term3385.getClass(), "delimiter", 'w');
        setField(term3385, term3385.getClass(), "quoteCharacter", term3387);
        setField(term3385, term3385.getClass(), "quoteMode", enum70);
        setField(term3385, term3385.getClass(), "commentMarker", term3400);
        setField(term3385, term3385.getClass(), "escapeCharacter", term3402);
        setBooleanField(term3385, term3385.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term3385, term3385.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term3385, term3385.getClass(), "ignoreEmptyLines", true);
        setField(term3385, term3385.getClass(), "recordSeparator", "KoyGrUJeJW");
        setField(term3385, term3385.getClass(), "nullString", "HqBOwkVqjD");
        setElement(term3431, 0, "MAcUBcBckh");
        setElement(term3431, 1, "oVgzLbrsFr");
        setElement(term3431, 2, "vQVyKLdtaz");
        setElement(term3431, 3, "OWKQODBLzb");
        setElement(term3431, 4, "wGmYcqUkgE");
        setElement(term3431, 5, "idgaQsnJpQ");
        setElement(term3431, 6, "VgZnGoIFwQ");
        setElement(term3431, 7, "jUbSRrkrYZ");
        setField(term3385, term3385.getClass(), "header", term3431);
        setElement(term3528, 0, "bWWfajKbEX");
        setElement(term3528, 1, "cAPeiZHKGJ");
        setElement(term3528, 2, "LvJFtLBaxj");
        setElement(term3528, 3, "PHvxnGHptP");
        setElement(term3528, 4, "TimdotUuNC");
        setElement(term3528, 5, "PkWMRdJcBb");
        setField(term3385, term3385.getClass(), "headerComments", term3528);
        setBooleanField(term3385, term3385.getClass(), "skipHeaderRecord", true);
        setBooleanField(term3385, term3385.getClass(), "ignoreHeaderCase", false);
        Character term45097 = new Character('D');
        Class<? extends Object> term45577 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45576 = ((Class) term45577).getDeclaredField((String) "MINIMAL");
        ((Field) term45576).setAccessible(true);
        Object enum71 = ((Field) term45576).get((Object) null);
        Character term45101 = new Character('Y');
        Character term45102 = new Character('F');
        term45096 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term45107 = (Object[]) newArray("java.lang.String", 8);
        Object[] term45124 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term45096, term45096.getClass(), "delimiter", 'w');
        setField(term45096, term45096.getClass(), "quoteCharacter", term45097);
        setField(term45096, term45096.getClass(), "quoteMode", enum71);
        setField(term45096, term45096.getClass(), "commentMarker", term45101);
        setField(term45096, term45096.getClass(), "escapeCharacter", term45102);
        setBooleanField(term45096, term45096.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term45096, term45096.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term45096, term45096.getClass(), "ignoreEmptyLines", true);
        setField(term45096, term45096.getClass(), "recordSeparator", "KoyGrUJeJW");
        setField(term45096, term45096.getClass(), "nullString", "HqBOwkVqjD");
        setElement(term45107, 0, "MAcUBcBckh");
        setElement(term45107, 1, "oVgzLbrsFr");
        setElement(term45107, 2, "vQVyKLdtaz");
        setElement(term45107, 3, "OWKQODBLzb");
        setElement(term45107, 4, "wGmYcqUkgE");
        setElement(term45107, 5, "idgaQsnJpQ");
        setElement(term45107, 6, "VgZnGoIFwQ");
        setElement(term45107, 7, "jUbSRrkrYZ");
        setField(term45096, term45096.getClass(), "header", term45107);
        setElement(term45124, 0, "bWWfajKbEX");
        setElement(term45124, 1, "cAPeiZHKGJ");
        setElement(term45124, 2, "LvJFtLBaxj");
        setElement(term45124, 3, "PHvxnGHptP");
        setElement(term45124, 4, "TimdotUuNC");
        setElement(term45124, 5, "PkWMRdJcBb");
        setField(term45096, term45096.getClass(), "headerComments", term45124);
        setBooleanField(term45096, term45096.getClass(), "skipHeaderRecord", true);
        setBooleanField(term45096, term45096.getClass(), "ignoreHeaderCase", false);
        term44805 = (Object[]) newArray("java.lang.String", 6);
        setElement(term44805, 0, "bWWfajKbEX");
        setElement(term44805, 1, "cAPeiZHKGJ");
        setElement(term44805, 2, "LvJFtLBaxj");
        setElement(term44805, 3, "PHvxnGHptP");
        setElement(term44805, 4, "TimdotUuNC");
        setElement(term44805, 5, "PkWMRdJcBb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeaderComments", argTypes, term3385, args);
        assertTrue(recursiveEquals(term3385, term45096));
        assertTrue(recursiveEquals(retValue, term44805));
    }

};


