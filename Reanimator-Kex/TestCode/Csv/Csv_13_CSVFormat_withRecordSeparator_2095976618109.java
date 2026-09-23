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

public class CSVFormat_withRecordSeparator_2095976618109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22801;
     Object term95107;
     Object term94806;

    public CSVFormat_withRecordSeparator_2095976618109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term22803 = new Character('h');
        Class<? extends Object> term95131 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term95130 = ((Class) term95131).getDeclaredField((String) "MINIMAL");
        ((Field) term95130).setAccessible(true);
        Object enum171 = ((Field) term95130).get((Object) null);
        Character term22816 = new Character('Y');
        Character term22818 = new Character('R');
        term22801 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term22847 = (Object[]) newArray("java.lang.String", 0);
        Object[] term22848 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term22801, term22801.getClass(), "delimiter", 'f');
        setField(term22801, term22801.getClass(), "quoteCharacter", term22803);
        setField(term22801, term22801.getClass(), "quoteMode", enum171);
        setField(term22801, term22801.getClass(), "commentMarker", term22816);
        setField(term22801, term22801.getClass(), "escapeCharacter", term22818);
        setBooleanField(term22801, term22801.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term22801, term22801.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term22801, term22801.getClass(), "ignoreEmptyLines", false);
        setField(term22801, term22801.getClass(), "recordSeparator", "MlzTkzKMCX");
        setField(term22801, term22801.getClass(), "nullString", "UqKUbMyPMJ");
        setField(term22801, term22801.getClass(), "header", term22847);
        setElement(term22848, 0, "QpYltHAdyY");
        setElement(term22848, 1, "lbmSGBwIiV");
        setElement(term22848, 2, "DAxyHoTLzZ");
        setElement(term22848, 3, "fhZgTouhCC");
        setField(term22801, term22801.getClass(), "headerComments", term22848);
        setBooleanField(term22801, term22801.getClass(), "skipHeaderRecord", false);
        setBooleanField(term22801, term22801.getClass(), "ignoreHeaderCase", false);
        Character term95108 = new Character('h');
        Class<? extends Object> term95389 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term95388 = ((Class) term95389).getDeclaredField((String) "MINIMAL");
        ((Field) term95388).setAccessible(true);
        Object enum172 = ((Field) term95388).get((Object) null);
        Character term95112 = new Character('Y');
        Character term95113 = new Character('R');
        term95107 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term95118 = (Object[]) newArray("java.lang.String", 0);
        Object[] term95119 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term95107, term95107.getClass(), "delimiter", 'f');
        setField(term95107, term95107.getClass(), "quoteCharacter", term95108);
        setField(term95107, term95107.getClass(), "quoteMode", enum172);
        setField(term95107, term95107.getClass(), "commentMarker", term95112);
        setField(term95107, term95107.getClass(), "escapeCharacter", term95113);
        setBooleanField(term95107, term95107.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term95107, term95107.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term95107, term95107.getClass(), "ignoreEmptyLines", false);
        setField(term95107, term95107.getClass(), "recordSeparator", "MlzTkzKMCX");
        setField(term95107, term95107.getClass(), "nullString", "UqKUbMyPMJ");
        setField(term95107, term95107.getClass(), "header", term95118);
        setElement(term95119, 0, "QpYltHAdyY");
        setElement(term95119, 1, "lbmSGBwIiV");
        setElement(term95119, 2, "DAxyHoTLzZ");
        setElement(term95119, 3, "fhZgTouhCC");
        setField(term95107, term95107.getClass(), "headerComments", term95119);
        setBooleanField(term95107, term95107.getClass(), "skipHeaderRecord", false);
        setBooleanField(term95107, term95107.getClass(), "ignoreHeaderCase", false);
        Character term94808 = new Character('h');
        Class<? extends Object> term95647 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term95646 = ((Class) term95647).getDeclaredField((String) "MINIMAL");
        ((Field) term95646).setAccessible(true);
        Object enum173 = ((Field) term95646).get((Object) null);
        Character term94821 = new Character('Y');
        Character term94823 = new Character('R');
        term94806 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term94852 = (Object[]) newArray("java.lang.String", 0);
        Object[] term94853 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term94806, term94806.getClass(), "delimiter", 'f');
        setField(term94806, term94806.getClass(), "quoteCharacter", term94808);
        setField(term94806, term94806.getClass(), "quoteMode", enum173);
        setField(term94806, term94806.getClass(), "commentMarker", term94821);
        setField(term94806, term94806.getClass(), "escapeCharacter", term94823);
        setBooleanField(term94806, term94806.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term94806, term94806.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term94806, term94806.getClass(), "ignoreEmptyLines", false);
        setField(term94806, term94806.getClass(), "recordSeparator", "wrikqJwXvL");
        setField(term94806, term94806.getClass(), "nullString", "UqKUbMyPMJ");
        setField(term94806, term94806.getClass(), "header", term94852);
        setElement(term94853, 0, "QpYltHAdyY");
        setElement(term94853, 1, "lbmSGBwIiV");
        setElement(term94853, 2, "DAxyHoTLzZ");
        setElement(term94853, 3, "fhZgTouhCC");
        setField(term94806, term94806.getClass(), "headerComments", term94853);
        setBooleanField(term94806, term94806.getClass(), "skipHeaderRecord", false);
        setBooleanField(term94806, term94806.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wrikqJwXvL";
        Object retValue = callMethod(klass, "withRecordSeparator", argTypes, term22801, args);
        assertTrue(recursiveEquals(term22801, term95107));
        assertTrue(recursiveEquals(retValue, term94806));
    }

};


