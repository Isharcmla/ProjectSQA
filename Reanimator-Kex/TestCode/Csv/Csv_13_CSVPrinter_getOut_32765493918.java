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
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_getOut_32765493918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1310;
     Object term8996;

    public CSVPrinter_getOut_32765493918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1313 = new Character('J');
        Class<? extends Object> term9027 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term9026 = ((Class) term9027).getDeclaredField((String) "ALL");
        ((Field) term9026).setAccessible(true);
        Object enum20 = ((Field) term9026).get((Object) null);
        Character term1322 = new Character('A');
        Character term1324 = new Character('E');
        term1310 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1311 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1353 = (Object[]) newArray("java.lang.String", 2);
        Object[] term1378 = (Object[]) newArray("java.lang.String", 6);
        setField(term1310, term1310.getClass(), "out", null);
        setCharField(term1311, term1311.getClass(), "delimiter", 'l');
        setField(term1311, term1311.getClass(), "quoteCharacter", term1313);
        setField(term1311, term1311.getClass(), "quoteMode", enum20);
        setField(term1311, term1311.getClass(), "commentMarker", term1322);
        setField(term1311, term1311.getClass(), "escapeCharacter", term1324);
        setBooleanField(term1311, term1311.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term1311, term1311.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term1311, term1311.getClass(), "ignoreEmptyLines", false);
        setField(term1311, term1311.getClass(), "recordSeparator", "TEParAifyi");
        setField(term1311, term1311.getClass(), "nullString", "OWDIEULEFu");
        setElement(term1353, 0, "dWRymuLBtr");
        setElement(term1353, 1, "AijpHYOFuy");
        setField(term1311, term1311.getClass(), "header", term1353);
        setElement(term1378, 0, "SbAoxhfrkn");
        setElement(term1378, 1, "kuTXqwMtDB");
        setElement(term1378, 2, "Ghbwtircqb");
        setElement(term1378, 3, "xrwlQZdwCp");
        setElement(term1378, 4, "IDCWpPLRkE");
        setElement(term1378, 5, "nyiiPDVjAc");
        setField(term1311, term1311.getClass(), "headerComments", term1378);
        setBooleanField(term1311, term1311.getClass(), "skipHeaderRecord", true);
        setBooleanField(term1311, term1311.getClass(), "ignoreHeaderCase", true);
        setField(term1310, term1310.getClass(), "format", term1311);
        setBooleanField(term1310, term1310.getClass(), "newRecord", true);
        Character term8998 = new Character('J');
        Class<? extends Object> term9303 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term9302 = ((Class) term9303).getDeclaredField((String) "ALL");
        ((Field) term9302).setAccessible(true);
        Object enum21 = ((Field) term9302).get((Object) null);
        Character term9002 = new Character('A');
        Character term9003 = new Character('E');
        term8996 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term8997 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9008 = (Object[]) newArray("java.lang.String", 2);
        Object[] term9013 = (Object[]) newArray("java.lang.String", 6);
        setField(term8996, term8996.getClass(), "out", null);
        setCharField(term8997, term8997.getClass(), "delimiter", 'l');
        setField(term8997, term8997.getClass(), "quoteCharacter", term8998);
        setField(term8997, term8997.getClass(), "quoteMode", enum21);
        setField(term8997, term8997.getClass(), "commentMarker", term9002);
        setField(term8997, term8997.getClass(), "escapeCharacter", term9003);
        setBooleanField(term8997, term8997.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term8997, term8997.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term8997, term8997.getClass(), "ignoreEmptyLines", false);
        setField(term8997, term8997.getClass(), "recordSeparator", "TEParAifyi");
        setField(term8997, term8997.getClass(), "nullString", "OWDIEULEFu");
        setElement(term9008, 0, "dWRymuLBtr");
        setElement(term9008, 1, "AijpHYOFuy");
        setField(term8997, term8997.getClass(), "header", term9008);
        setElement(term9013, 0, "SbAoxhfrkn");
        setElement(term9013, 1, "kuTXqwMtDB");
        setElement(term9013, 2, "Ghbwtircqb");
        setElement(term9013, 3, "xrwlQZdwCp");
        setElement(term9013, 4, "IDCWpPLRkE");
        setElement(term9013, 5, "nyiiPDVjAc");
        setField(term8997, term8997.getClass(), "headerComments", term9013);
        setBooleanField(term8997, term8997.getClass(), "skipHeaderRecord", true);
        setBooleanField(term8997, term8997.getClass(), "ignoreHeaderCase", true);
        setField(term8996, term8996.getClass(), "format", term8997);
        setBooleanField(term8996, term8996.getClass(), "newRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOut", argTypes, term1310, args);
        assertTrue(recursiveEquals(term1310, term8996));
        assertTrue(recursiveEquals(retValue, null));
    }

};


