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
import java.lang.Boolean;

public class CSVFormat_withIgnoreSurroundingSpaces_2091065286133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25549;
     Object term25609;
     Object term98270;
     Object term98077;

    public CSVFormat_withIgnoreSurroundingSpaces_2091065286133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term25551 = new Character('F');
        Character term25554 = new Character('v');
        Character term25585 = new Character('l');
        Class<? extends Object> term98306 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term98305 = ((Class) term98306).getDeclaredField((String) "ALL");
        ((Field) term98305).setAccessible(true);
        Object enum199 = ((Field) term98305).get((Object) null);
        term25549 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term25556 = (Object[]) newArray("java.lang.String", 1);
        Object[] term25569 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term25549, term25549.getClass(), "allowMissingColumnNames", false);
        setField(term25549, term25549.getClass(), "commentMarker", term25551);
        setCharField(term25549, term25549.getClass(), "delimiter", 'U');
        setField(term25549, term25549.getClass(), "escapeCharacter", term25554);
        setElement(term25556, 0, "hgFbWAUtsu");
        setField(term25549, term25549.getClass(), "header", term25556);
        setField(term25549, term25549.getClass(), "headerComments", term25569);
        setBooleanField(term25549, term25549.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term25549, term25549.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term25549, term25549.getClass(), "ignoreSurroundingSpaces", true);
        setField(term25549, term25549.getClass(), "nullString", "HqoTWlkbwF");
        setField(term25549, term25549.getClass(), "quoteCharacter", term25585);
        setField(term25549, term25549.getClass(), "quoteMode", enum199);
        setField(term25549, term25549.getClass(), "recordSeparator", "CwNELDTAPP");
        setBooleanField(term25549, term25549.getClass(), "skipHeaderRecord", true);
        setBooleanField(term25549, term25549.getClass(), "trailingDelimiter", true);
        setBooleanField(term25549, term25549.getClass(), "trim", false);
        term25609 = new Boolean(false);
        Character term98271 = new Character('F');
        Character term98272 = new Character('v');
        Character term98279 = new Character('l');
        Class<? extends Object> term98512 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term98511 = ((Class) term98512).getDeclaredField((String) "ALL");
        ((Field) term98511).setAccessible(true);
        Object enum200 = ((Field) term98511).get((Object) null);
        term98270 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term98273 = (Object[]) newArray("java.lang.String", 1);
        Object[] term98276 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term98270, term98270.getClass(), "allowMissingColumnNames", false);
        setField(term98270, term98270.getClass(), "commentMarker", term98271);
        setCharField(term98270, term98270.getClass(), "delimiter", 'U');
        setField(term98270, term98270.getClass(), "escapeCharacter", term98272);
        setElement(term98273, 0, "hgFbWAUtsu");
        setField(term98270, term98270.getClass(), "header", term98273);
        setField(term98270, term98270.getClass(), "headerComments", term98276);
        setBooleanField(term98270, term98270.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term98270, term98270.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term98270, term98270.getClass(), "ignoreSurroundingSpaces", true);
        setField(term98270, term98270.getClass(), "nullString", "HqoTWlkbwF");
        setField(term98270, term98270.getClass(), "quoteCharacter", term98279);
        setField(term98270, term98270.getClass(), "quoteMode", enum200);
        setField(term98270, term98270.getClass(), "recordSeparator", "CwNELDTAPP");
        setBooleanField(term98270, term98270.getClass(), "skipHeaderRecord", true);
        setBooleanField(term98270, term98270.getClass(), "trailingDelimiter", true);
        setBooleanField(term98270, term98270.getClass(), "trim", false);
        Character term98079 = new Character('F');
        Character term98082 = new Character('v');
        Character term98113 = new Character('l');
        Class<? extends Object> term98718 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term98717 = ((Class) term98718).getDeclaredField((String) "ALL");
        ((Field) term98717).setAccessible(true);
        Object enum201 = ((Field) term98717).get((Object) null);
        term98077 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term98084 = (Object[]) newArray("java.lang.String", 1);
        Object[] term98097 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term98077, term98077.getClass(), "allowMissingColumnNames", false);
        setField(term98077, term98077.getClass(), "commentMarker", term98079);
        setCharField(term98077, term98077.getClass(), "delimiter", 'U');
        setField(term98077, term98077.getClass(), "escapeCharacter", term98082);
        setElement(term98084, 0, "hgFbWAUtsu");
        setField(term98077, term98077.getClass(), "header", term98084);
        setField(term98077, term98077.getClass(), "headerComments", term98097);
        setBooleanField(term98077, term98077.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term98077, term98077.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term98077, term98077.getClass(), "ignoreSurroundingSpaces", false);
        setField(term98077, term98077.getClass(), "nullString", "HqoTWlkbwF");
        setField(term98077, term98077.getClass(), "quoteCharacter", term98113);
        setField(term98077, term98077.getClass(), "quoteMode", enum201);
        setField(term98077, term98077.getClass(), "recordSeparator", "CwNELDTAPP");
        setBooleanField(term98077, term98077.getClass(), "skipHeaderRecord", true);
        setBooleanField(term98077, term98077.getClass(), "trailingDelimiter", true);
        setBooleanField(term98077, term98077.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term25609;
        Object retValue = callMethod(klass, "withIgnoreSurroundingSpaces", argTypes, term25549, args);
        assertTrue(recursiveEquals(term25549, term98270));
        assertTrue(recursiveEquals(term25609, false));
        assertTrue(recursiveEquals(retValue, term98077));
    }

};


