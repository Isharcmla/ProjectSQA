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

public class CSVFormat_isCommentMarkerSet_206455644379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8409;
     Object term54004;

    public CSVFormat_isCommentMarkerSet_206455644379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8411 = new Character('h');
        Class<? extends Object> term54043 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term54042 = ((Class) term54043).getDeclaredField((String) "ALL");
        ((Field) term54042).setAccessible(true);
        Object enum93 = ((Field) term54042).get((Object) null);
        Character term8420 = new Character('R');
        Character term8422 = new Character('N');
        term8409 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8451 = (Object[]) newArray("java.lang.String", 4);
        Object[] term8500 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term8409, term8409.getClass(), "delimiter", 'F');
        setField(term8409, term8409.getClass(), "quoteCharacter", term8411);
        setField(term8409, term8409.getClass(), "quoteMode", enum93);
        setField(term8409, term8409.getClass(), "commentMarker", term8420);
        setField(term8409, term8409.getClass(), "escapeCharacter", term8422);
        setBooleanField(term8409, term8409.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term8409, term8409.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term8409, term8409.getClass(), "ignoreEmptyLines", true);
        setField(term8409, term8409.getClass(), "recordSeparator", "DhjNLmRMCu");
        setField(term8409, term8409.getClass(), "nullString", "PgPzMSEjjX");
        setElement(term8451, 0, "wzsPSPcRdj");
        setElement(term8451, 1, "kGMQdqJYyB");
        setElement(term8451, 2, "XJJNClzHRf");
        setElement(term8451, 3, "HDaezxQfQR");
        setField(term8409, term8409.getClass(), "header", term8451);
        setElement(term8500, 0, "iikZEapDlu");
        setElement(term8500, 1, "nhoHrZfnIN");
        setElement(term8500, 2, "ZkMALXpEAZ");
        setElement(term8500, 3, "tXfQjSqDzN");
        setElement(term8500, 4, "BjugTaMcxJ");
        setElement(term8500, 5, "vGiuZVPJNH");
        setElement(term8500, 6, "tlzpzIjMib");
        setElement(term8500, 7, "AZdLeSugwv");
        setField(term8409, term8409.getClass(), "headerComments", term8500);
        setBooleanField(term8409, term8409.getClass(), "skipHeaderRecord", true);
        setBooleanField(term8409, term8409.getClass(), "ignoreHeaderCase", false);
        Character term54005 = new Character('h');
        Class<? extends Object> term54359 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term54358 = ((Class) term54359).getDeclaredField((String) "ALL");
        ((Field) term54358).setAccessible(true);
        Object enum94 = ((Field) term54358).get((Object) null);
        Character term54009 = new Character('R');
        Character term54010 = new Character('N');
        term54004 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term54015 = (Object[]) newArray("java.lang.String", 4);
        Object[] term54024 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term54004, term54004.getClass(), "delimiter", 'F');
        setField(term54004, term54004.getClass(), "quoteCharacter", term54005);
        setField(term54004, term54004.getClass(), "quoteMode", enum94);
        setField(term54004, term54004.getClass(), "commentMarker", term54009);
        setField(term54004, term54004.getClass(), "escapeCharacter", term54010);
        setBooleanField(term54004, term54004.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term54004, term54004.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term54004, term54004.getClass(), "ignoreEmptyLines", true);
        setField(term54004, term54004.getClass(), "recordSeparator", "DhjNLmRMCu");
        setField(term54004, term54004.getClass(), "nullString", "PgPzMSEjjX");
        setElement(term54015, 0, "wzsPSPcRdj");
        setElement(term54015, 1, "kGMQdqJYyB");
        setElement(term54015, 2, "XJJNClzHRf");
        setElement(term54015, 3, "HDaezxQfQR");
        setField(term54004, term54004.getClass(), "header", term54015);
        setElement(term54024, 0, "iikZEapDlu");
        setElement(term54024, 1, "nhoHrZfnIN");
        setElement(term54024, 2, "ZkMALXpEAZ");
        setElement(term54024, 3, "tXfQjSqDzN");
        setElement(term54024, 4, "BjugTaMcxJ");
        setElement(term54024, 5, "vGiuZVPJNH");
        setElement(term54024, 6, "tlzpzIjMib");
        setElement(term54024, 7, "AZdLeSugwv");
        setField(term54004, term54004.getClass(), "headerComments", term54024);
        setBooleanField(term54004, term54004.getClass(), "skipHeaderRecord", true);
        setBooleanField(term54004, term54004.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCommentMarkerSet", argTypes, term8409, args);
        assertTrue(recursiveEquals(term8409, term54004));
        assertTrue(recursiveEquals(retValue, true));
    }

};


