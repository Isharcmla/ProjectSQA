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

public class CSVFormat_getNullString_56180501992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5219;
     Object term49303;

    public CSVFormat_getNullString_56180501992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5221 = new Character('G');
        Character term5224 = new Character('D');
        Character term5375 = new Character('I');
        Class<? extends Object> term49734 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term49733 = ((Class) term49734).getDeclaredField((String) "MINIMAL");
        ((Field) term49733).setAccessible(true);
        Object enum99 = ((Field) term49733).get((Object) null);
        term5219 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5226 = (Object[]) newArray("java.lang.String", 6);
        Object[] term5299 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term5219, term5219.getClass(), "allowMissingColumnNames", true);
        setField(term5219, term5219.getClass(), "commentMarker", term5221);
        setCharField(term5219, term5219.getClass(), "delimiter", 't');
        setField(term5219, term5219.getClass(), "escapeCharacter", term5224);
        setElement(term5226, 0, "MvRIxilFMJ");
        setElement(term5226, 1, "iNwOJRBEjp");
        setElement(term5226, 2, "XylxrMBraH");
        setElement(term5226, 3, "pORebkoRdD");
        setElement(term5226, 4, "mXGCWJDOqA");
        setElement(term5226, 5, "dpNsDgfPso");
        setField(term5219, term5219.getClass(), "header", term5226);
        setElement(term5299, 0, "hCWPJQKpdc");
        setElement(term5299, 1, "WzMEhMXkKx");
        setElement(term5299, 2, "XOiDvlDhdc");
        setElement(term5299, 3, "AdxvLJhNLe");
        setElement(term5299, 4, "lHfTrWKMPk");
        setField(term5219, term5219.getClass(), "headerComments", term5299);
        setBooleanField(term5219, term5219.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term5219, term5219.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term5219, term5219.getClass(), "ignoreSurroundingSpaces", false);
        setField(term5219, term5219.getClass(), "nullString", "JDaAnsVTGV");
        setField(term5219, term5219.getClass(), "quoteCharacter", term5375);
        setField(term5219, term5219.getClass(), "quoteMode", enum99);
        setField(term5219, term5219.getClass(), "recordSeparator", "mLUZFTfjle");
        setBooleanField(term5219, term5219.getClass(), "skipHeaderRecord", true);
        setBooleanField(term5219, term5219.getClass(), "trailingDelimiter", true);
        setBooleanField(term5219, term5219.getClass(), "trim", false);
        setBooleanField(term5219, term5219.getClass(), "autoFlush", false);
        Character term49304 = new Character('G');
        Character term49305 = new Character('D');
        Character term49402 = new Character('I');
        Class<? extends Object> term50052 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50051 = ((Class) term50052).getDeclaredField((String) "MINIMAL");
        ((Field) term50051).setAccessible(true);
        Object enum100 = ((Field) term50051).get((Object) null);
        term49303 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term49308 = (Object[]) newArray("java.lang.String", 6);
        Object[] term49349 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term49303, term49303.getClass(), "allowMissingColumnNames", true);
        setField(term49303, term49303.getClass(), "commentMarker", term49304);
        setCharField(term49303, term49303.getClass(), "delimiter", 't');
        setField(term49303, term49303.getClass(), "escapeCharacter", term49305);
        setElement(term49308, 0, "MvRIxilFMJ");
        setElement(term49308, 1, "iNwOJRBEjp");
        setElement(term49308, 2, "XylxrMBraH");
        setElement(term49308, 3, "pORebkoRdD");
        setElement(term49308, 4, "mXGCWJDOqA");
        setElement(term49308, 5, "dpNsDgfPso");
        setField(term49303, term49303.getClass(), "header", term49308);
        setElement(term49349, 0, "hCWPJQKpdc");
        setElement(term49349, 1, "WzMEhMXkKx");
        setElement(term49349, 2, "XOiDvlDhdc");
        setElement(term49349, 3, "AdxvLJhNLe");
        setElement(term49349, 4, "lHfTrWKMPk");
        setField(term49303, term49303.getClass(), "headerComments", term49349);
        setBooleanField(term49303, term49303.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term49303, term49303.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term49303, term49303.getClass(), "ignoreSurroundingSpaces", false);
        setField(term49303, term49303.getClass(), "nullString", "JDaAnsVTGV");
        setField(term49303, term49303.getClass(), "quoteCharacter", term49402);
        setField(term49303, term49303.getClass(), "quoteMode", enum100);
        setField(term49303, term49303.getClass(), "recordSeparator", "mLUZFTfjle");
        setBooleanField(term49303, term49303.getClass(), "skipHeaderRecord", true);
        setBooleanField(term49303, term49303.getClass(), "trailingDelimiter", true);
        setBooleanField(term49303, term49303.getClass(), "trim", false);
        setBooleanField(term49303, term49303.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNullString", argTypes, term5219, args);
        assertTrue(recursiveEquals(term5219, term49303));
        assertTrue(recursiveEquals(retValue, "JDaAnsVTGV"));
    }

};


