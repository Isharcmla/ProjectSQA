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

public class CSVFormat_format_207043582763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1259;
     Object term1461;
     Object term41017;
     Object term41056;

    public CSVFormat_format_207043582763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1261 = new Character('t');
        Class<? extends Object> term41059 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term41058 = ((Class) term41059).getDeclaredField((String) "ALL");
        ((Field) term41058).setAccessible(true);
        Object enum60 = ((Field) term41058).get((Object) null);
        Character term1270 = new Character('R');
        Character term1272 = new Character('r');
        term1259 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1301 = (Object[]) newArray("java.lang.String", 6);
        Object[] term1374 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term1259, term1259.getClass(), "delimiter", 'E');
        setField(term1259, term1259.getClass(), "quoteCharacter", term1261);
        setField(term1259, term1259.getClass(), "quoteMode", enum60);
        setField(term1259, term1259.getClass(), "commentMarker", term1270);
        setField(term1259, term1259.getClass(), "escapeCharacter", term1272);
        setBooleanField(term1259, term1259.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term1259, term1259.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term1259, term1259.getClass(), "ignoreEmptyLines", true);
        setField(term1259, term1259.getClass(), "recordSeparator", "flxyYxBRtu");
        setField(term1259, term1259.getClass(), "nullString", "OclPbYPkcH");
        setElement(term1301, 0, "IoAlmYsBwc");
        setElement(term1301, 1, "TEParAifyi");
        setElement(term1301, 2, "OWDIEULEFu");
        setElement(term1301, 3, "dWRymuLBtr");
        setElement(term1301, 4, "AijpHYOFuy");
        setElement(term1301, 5, "SbAoxhfrkn");
        setField(term1259, term1259.getClass(), "header", term1301);
        setElement(term1374, 0, "kuTXqwMtDB");
        setElement(term1374, 1, "Ghbwtircqb");
        setElement(term1374, 2, "xrwlQZdwCp");
        setElement(term1374, 3, "IDCWpPLRkE");
        setElement(term1374, 4, "nyiiPDVjAc");
        setElement(term1374, 5, "aKnKipADSo");
        setElement(term1374, 6, "wSQxaModmm");
        setField(term1259, term1259.getClass(), "headerComments", term1374);
        setBooleanField(term1259, term1259.getClass(), "skipHeaderRecord", false);
        setBooleanField(term1259, term1259.getClass(), "ignoreHeaderCase", false);
        term1461 = (Object[]) newArray("java.lang.Object", 1);
        Object term1462 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1461, 0, term1462);
        Character term41018 = new Character('t');
        Class<? extends Object> term41385 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term41384 = ((Class) term41385).getDeclaredField((String) "ALL");
        ((Field) term41384).setAccessible(true);
        Object enum61 = ((Field) term41384).get((Object) null);
        Character term41022 = new Character('R');
        Character term41023 = new Character('r');
        term41017 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term41028 = (Object[]) newArray("java.lang.String", 6);
        Object[] term41041 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term41017, term41017.getClass(), "delimiter", 'E');
        setField(term41017, term41017.getClass(), "quoteCharacter", term41018);
        setField(term41017, term41017.getClass(), "quoteMode", enum61);
        setField(term41017, term41017.getClass(), "commentMarker", term41022);
        setField(term41017, term41017.getClass(), "escapeCharacter", term41023);
        setBooleanField(term41017, term41017.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term41017, term41017.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term41017, term41017.getClass(), "ignoreEmptyLines", true);
        setField(term41017, term41017.getClass(), "recordSeparator", "flxyYxBRtu");
        setField(term41017, term41017.getClass(), "nullString", "OclPbYPkcH");
        setElement(term41028, 0, "IoAlmYsBwc");
        setElement(term41028, 1, "TEParAifyi");
        setElement(term41028, 2, "OWDIEULEFu");
        setElement(term41028, 3, "dWRymuLBtr");
        setElement(term41028, 4, "AijpHYOFuy");
        setElement(term41028, 5, "SbAoxhfrkn");
        setField(term41017, term41017.getClass(), "header", term41028);
        setElement(term41041, 0, "kuTXqwMtDB");
        setElement(term41041, 1, "Ghbwtircqb");
        setElement(term41041, 2, "xrwlQZdwCp");
        setElement(term41041, 3, "IDCWpPLRkE");
        setElement(term41041, 4, "nyiiPDVjAc");
        setElement(term41041, 5, "aKnKipADSo");
        setElement(term41041, 6, "wSQxaModmm");
        setField(term41017, term41017.getClass(), "headerComments", term41041);
        setBooleanField(term41017, term41017.getClass(), "skipHeaderRecord", false);
        setBooleanField(term41017, term41017.getClass(), "ignoreHeaderCase", false);
        term41056 = (Object[]) newArray("java.lang.Object", 1);
        Object term41057 = newInstance(Class.forName("java.lang.Object"));
        setElement(term41056, 0, term41057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1461;
        Object retValue = callMethod(klass, "format", argTypes, term1259, args);
        assertTrue(recursiveEquals(term1259, term41017));
        assertTrue(recursiveEquals(term1461, term41056));
        assertTrue(recursiveEquals(retValue, "R kuTXqwMtDBflxyYxBRtuR GhbwtircqbflxyYxBRtuR xrwlQZdwCpflxyYxBRtuR IDCWpPLRkEflxyYxBRtuR nyiiPDVjAcflxyYxBRtuR aKnKipADSoflxyYxBRtuR wSQxaModmmflxyYxBRtutIoAlmYsBwctEtTEParAifyitEtOWDIEULEFutEtdWRymuLBttrtEtAijpHYOFuytEtSbAoxhfrkntflxyYxBRtutjava.lang.Objectt@6114b1c6tflxyYxBRtu"));
    }

};


