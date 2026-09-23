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

public class CSVFormat_getDelimiter_155525069550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1336;
     Object term21665;

    public CSVFormat_getDelimiter_155525069550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1338 = new Character('M');
        Class<? extends Object> term21690 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term21689 = ((Class) term21690).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term21689).setAccessible(true);
        Object enum50 = ((Field) term21689).get((Object) null);
        Character term1355 = new Character('u');
        Character term1357 = new Character('L');
        term1336 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1386 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term1336, term1336.getClass(), "delimiter", 'b');
        setField(term1336, term1336.getClass(), "quoteCharacter", term1338);
        setField(term1336, term1336.getClass(), "quoteMode", enum50);
        setField(term1336, term1336.getClass(), "commentMarker", term1355);
        setField(term1336, term1336.getClass(), "escapeCharacter", term1357);
        setBooleanField(term1336, term1336.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term1336, term1336.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term1336, term1336.getClass(), "ignoreEmptyLines", false);
        setField(term1336, term1336.getClass(), "recordSeparator", "RkybSrpybU");
        setField(term1336, term1336.getClass(), "nullString", "xOEqzGAmDU");
        setElement(term1386, 0, "eZFUvlxvGV");
        setElement(term1386, 1, "BYqFIqCKAV");
        setElement(term1386, 2, "vrQLuWIDJX");
        setElement(term1386, 3, "flxyYxBRtu");
        setElement(term1386, 4, "OclPbYPkcH");
        setElement(term1386, 5, "IoAlmYsBwc");
        setField(term1336, term1336.getClass(), "header", term1386);
        setBooleanField(term1336, term1336.getClass(), "skipHeaderRecord", false);
        Character term21666 = new Character('M');
        Class<? extends Object> term22040 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term22039 = ((Class) term22040).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term22039).setAccessible(true);
        Object enum51 = ((Field) term22039).get((Object) null);
        Character term21670 = new Character('u');
        Character term21671 = new Character('L');
        term21665 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term21676 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term21665, term21665.getClass(), "delimiter", 'b');
        setField(term21665, term21665.getClass(), "quoteCharacter", term21666);
        setField(term21665, term21665.getClass(), "quoteMode", enum51);
        setField(term21665, term21665.getClass(), "commentMarker", term21670);
        setField(term21665, term21665.getClass(), "escapeCharacter", term21671);
        setBooleanField(term21665, term21665.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term21665, term21665.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term21665, term21665.getClass(), "ignoreEmptyLines", false);
        setField(term21665, term21665.getClass(), "recordSeparator", "RkybSrpybU");
        setField(term21665, term21665.getClass(), "nullString", "xOEqzGAmDU");
        setElement(term21676, 0, "eZFUvlxvGV");
        setElement(term21676, 1, "BYqFIqCKAV");
        setElement(term21676, 2, "vrQLuWIDJX");
        setElement(term21676, 3, "flxyYxBRtu");
        setElement(term21676, 4, "OclPbYPkcH");
        setElement(term21676, 5, "IoAlmYsBwc");
        setField(term21665, term21665.getClass(), "header", term21676);
        setBooleanField(term21665, term21665.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDelimiter", argTypes, term1336, args);
        assertTrue(recursiveEquals(term1336, term21665));
        assertTrue(recursiveEquals(retValue, 'b'));
    }

};


