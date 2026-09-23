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

public class CSVFormat_getNullString_56180501989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5194;
     Object term48362;

    public CSVFormat_getNullString_56180501989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5196 = new Character('G');
        Character term5199 = new Character('D');
        Character term5350 = new Character('I');
        Class<? extends Object> term48518 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term48517 = ((Class) term48518).getDeclaredField((String) "MINIMAL");
        ((Field) term48517).setAccessible(true);
        Object enum96 = ((Field) term48517).get((Object) null);
        term5194 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5201 = (Object[]) newArray("java.lang.String", 6);
        Object[] term5274 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term5194, term5194.getClass(), "allowMissingColumnNames", true);
        setField(term5194, term5194.getClass(), "commentMarker", term5196);
        setCharField(term5194, term5194.getClass(), "delimiter", 't');
        setField(term5194, term5194.getClass(), "escapeCharacter", term5199);
        setElement(term5201, 0, "MvRIxilFMJ");
        setElement(term5201, 1, "iNwOJRBEjp");
        setElement(term5201, 2, "XylxrMBraH");
        setElement(term5201, 3, "pORebkoRdD");
        setElement(term5201, 4, "mXGCWJDOqA");
        setElement(term5201, 5, "dpNsDgfPso");
        setField(term5194, term5194.getClass(), "header", term5201);
        setElement(term5274, 0, "hCWPJQKpdc");
        setElement(term5274, 1, "WzMEhMXkKx");
        setElement(term5274, 2, "XOiDvlDhdc");
        setElement(term5274, 3, "AdxvLJhNLe");
        setElement(term5274, 4, "lHfTrWKMPk");
        setField(term5194, term5194.getClass(), "headerComments", term5274);
        setBooleanField(term5194, term5194.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term5194, term5194.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term5194, term5194.getClass(), "ignoreSurroundingSpaces", false);
        setField(term5194, term5194.getClass(), "nullString", "JDaAnsVTGV");
        setField(term5194, term5194.getClass(), "quoteCharacter", term5350);
        setField(term5194, term5194.getClass(), "quoteMode", enum96);
        setField(term5194, term5194.getClass(), "recordSeparator", "mLUZFTfjle");
        setBooleanField(term5194, term5194.getClass(), "skipHeaderRecord", false);
        setBooleanField(term5194, term5194.getClass(), "trailingDelimiter", true);
        setBooleanField(term5194, term5194.getClass(), "trim", true);
        Character term48363 = new Character('G');
        Character term48364 = new Character('D');
        Character term48391 = new Character('I');
        Class<? extends Object> term48836 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term48835 = ((Class) term48836).getDeclaredField((String) "MINIMAL");
        ((Field) term48835).setAccessible(true);
        Object enum97 = ((Field) term48835).get((Object) null);
        term48362 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term48365 = (Object[]) newArray("java.lang.String", 6);
        Object[] term48378 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term48362, term48362.getClass(), "allowMissingColumnNames", true);
        setField(term48362, term48362.getClass(), "commentMarker", term48363);
        setCharField(term48362, term48362.getClass(), "delimiter", 't');
        setField(term48362, term48362.getClass(), "escapeCharacter", term48364);
        setElement(term48365, 0, "MvRIxilFMJ");
        setElement(term48365, 1, "iNwOJRBEjp");
        setElement(term48365, 2, "XylxrMBraH");
        setElement(term48365, 3, "pORebkoRdD");
        setElement(term48365, 4, "mXGCWJDOqA");
        setElement(term48365, 5, "dpNsDgfPso");
        setField(term48362, term48362.getClass(), "header", term48365);
        setElement(term48378, 0, "hCWPJQKpdc");
        setElement(term48378, 1, "WzMEhMXkKx");
        setElement(term48378, 2, "XOiDvlDhdc");
        setElement(term48378, 3, "AdxvLJhNLe");
        setElement(term48378, 4, "lHfTrWKMPk");
        setField(term48362, term48362.getClass(), "headerComments", term48378);
        setBooleanField(term48362, term48362.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term48362, term48362.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term48362, term48362.getClass(), "ignoreSurroundingSpaces", false);
        setField(term48362, term48362.getClass(), "nullString", "JDaAnsVTGV");
        setField(term48362, term48362.getClass(), "quoteCharacter", term48391);
        setField(term48362, term48362.getClass(), "quoteMode", enum97);
        setField(term48362, term48362.getClass(), "recordSeparator", "mLUZFTfjle");
        setBooleanField(term48362, term48362.getClass(), "skipHeaderRecord", false);
        setBooleanField(term48362, term48362.getClass(), "trailingDelimiter", true);
        setBooleanField(term48362, term48362.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNullString", argTypes, term5194, args);
        assertTrue(recursiveEquals(term5194, term48362));
        assertTrue(recursiveEquals(retValue, "JDaAnsVTGV"));
    }

};


