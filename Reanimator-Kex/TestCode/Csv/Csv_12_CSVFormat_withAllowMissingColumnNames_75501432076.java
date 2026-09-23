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
import java.lang.Boolean;

public class CSVFormat_withAllowMissingColumnNames_75501432076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10501;
     Object term10570;
     Object term40732;
     Object term40535;

    public CSVFormat_withAllowMissingColumnNames_75501432076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term10503 = new Character('f');
        Class<? extends Object> term40749 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term40748 = ((Class) term40749).getDeclaredField((String) "NONE");
        ((Field) term40748).setAccessible(true);
        Object enum103 = ((Field) term40748).get((Object) null);
        Character term10513 = new Character('L');
        Character term10515 = new Character('Q');
        term10501 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10544 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term10501, term10501.getClass(), "delimiter", 'R');
        setField(term10501, term10501.getClass(), "quoteCharacter", term10503);
        setField(term10501, term10501.getClass(), "quoteMode", enum103);
        setField(term10501, term10501.getClass(), "commentMarker", term10513);
        setField(term10501, term10501.getClass(), "escapeCharacter", term10515);
        setBooleanField(term10501, term10501.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term10501, term10501.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term10501, term10501.getClass(), "ignoreEmptyLines", false);
        setField(term10501, term10501.getClass(), "recordSeparator", "kNqaJKIATy");
        setField(term10501, term10501.getClass(), "nullString", "vKQukfbJUd");
        setElement(term10544, 0, "lFRJFUMVbx");
        setElement(term10544, 1, "sZdUNdggUW");
        setField(term10501, term10501.getClass(), "header", term10544);
        setBooleanField(term10501, term10501.getClass(), "skipHeaderRecord", false);
        term10570 = new Boolean(false);
        Character term40733 = new Character('f');
        Class<? extends Object> term40968 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term40967 = ((Class) term40968).getDeclaredField((String) "NONE");
        ((Field) term40967).setAccessible(true);
        Object enum104 = ((Field) term40967).get((Object) null);
        Character term40737 = new Character('L');
        Character term40738 = new Character('Q');
        term40732 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term40743 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term40732, term40732.getClass(), "delimiter", 'R');
        setField(term40732, term40732.getClass(), "quoteCharacter", term40733);
        setField(term40732, term40732.getClass(), "quoteMode", enum104);
        setField(term40732, term40732.getClass(), "commentMarker", term40737);
        setField(term40732, term40732.getClass(), "escapeCharacter", term40738);
        setBooleanField(term40732, term40732.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term40732, term40732.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term40732, term40732.getClass(), "ignoreEmptyLines", false);
        setField(term40732, term40732.getClass(), "recordSeparator", "kNqaJKIATy");
        setField(term40732, term40732.getClass(), "nullString", "vKQukfbJUd");
        setElement(term40743, 0, "lFRJFUMVbx");
        setElement(term40743, 1, "sZdUNdggUW");
        setField(term40732, term40732.getClass(), "header", term40743);
        setBooleanField(term40732, term40732.getClass(), "skipHeaderRecord", false);
        Character term40537 = new Character('f');
        Class<? extends Object> term41187 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term41186 = ((Class) term41187).getDeclaredField((String) "NONE");
        ((Field) term41186).setAccessible(true);
        Object enum105 = ((Field) term41186).get((Object) null);
        Character term40547 = new Character('L');
        Character term40549 = new Character('Q');
        term40535 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term40578 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term40535, term40535.getClass(), "delimiter", 'R');
        setField(term40535, term40535.getClass(), "quoteCharacter", term40537);
        setField(term40535, term40535.getClass(), "quoteMode", enum105);
        setField(term40535, term40535.getClass(), "commentMarker", term40547);
        setField(term40535, term40535.getClass(), "escapeCharacter", term40549);
        setBooleanField(term40535, term40535.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term40535, term40535.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term40535, term40535.getClass(), "ignoreEmptyLines", false);
        setField(term40535, term40535.getClass(), "recordSeparator", "kNqaJKIATy");
        setField(term40535, term40535.getClass(), "nullString", "vKQukfbJUd");
        setElement(term40578, 0, "lFRJFUMVbx");
        setElement(term40578, 1, "sZdUNdggUW");
        setField(term40535, term40535.getClass(), "header", term40578);
        setBooleanField(term40535, term40535.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10570;
        Object retValue = callMethod(klass, "withAllowMissingColumnNames", argTypes, term10501, args);
        assertTrue(recursiveEquals(term10501, term40732));
        assertTrue(recursiveEquals(term10570, false));
        assertTrue(recursiveEquals(retValue, term40535));
    }

};


