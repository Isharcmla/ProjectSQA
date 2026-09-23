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

public class CSVFormat_withHeader_26975908770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8714;
     Object term8841;
     Object term33967;
     Object term33993;
     Object term33715;

    public CSVFormat_withHeader_26975908770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8716 = new Character('T');
        Class<? extends Object> term33999 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term33998 = ((Class) term33999).getDeclaredField((String) "ALL");
        ((Field) term33998).setAccessible(true);
        Object enum98 = ((Field) term33998).get((Object) null);
        Character term8725 = new Character('m');
        Character term8727 = new Character('J');
        term8714 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8755 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term8714, term8714.getClass(), "delimiter", 'E');
        setField(term8714, term8714.getClass(), "quoteChar", term8716);
        setField(term8714, term8714.getClass(), "quotePolicy", enum98);
        setField(term8714, term8714.getClass(), "commentStart", term8725);
        setField(term8714, term8714.getClass(), "escape", term8727);
        setBooleanField(term8714, term8714.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term8714, term8714.getClass(), "ignoreEmptyLines", true);
        setField(term8714, term8714.getClass(), "recordSeparator", "aWYOWZFyaX");
        setField(term8714, term8714.getClass(), "nullString", "BRIVNtfUWU");
        setElement(term8755, 0, "DbiCVtPPCT");
        setElement(term8755, 1, "WzFopsaDuG");
        setElement(term8755, 2, "PapWxkhEWe");
        setElement(term8755, 3, "smnHEqRFRx");
        setElement(term8755, 4, "XYtryyobou");
        setElement(term8755, 5, "OYbzXylRWW");
        setElement(term8755, 6, "DSNsTGYXDF");
        setField(term8714, term8714.getClass(), "header", term8755);
        setBooleanField(term8714, term8714.getClass(), "skipHeaderRecord", false);
        term8841 = (Object[]) newArray("java.lang.String", 2);
        setElement(term8841, 0, "sQvGcVjdEx");
        setElement(term8841, 1, "rLHAoqXgPh");
        Character term33968 = new Character('T');
        Class<? extends Object> term34265 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term34264 = ((Class) term34265).getDeclaredField((String) "ALL");
        ((Field) term34264).setAccessible(true);
        Object enum99 = ((Field) term34264).get((Object) null);
        Character term33972 = new Character('m');
        Character term33973 = new Character('J');
        term33967 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term33978 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term33967, term33967.getClass(), "delimiter", 'E');
        setField(term33967, term33967.getClass(), "quoteChar", term33968);
        setField(term33967, term33967.getClass(), "quotePolicy", enum99);
        setField(term33967, term33967.getClass(), "commentStart", term33972);
        setField(term33967, term33967.getClass(), "escape", term33973);
        setBooleanField(term33967, term33967.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term33967, term33967.getClass(), "ignoreEmptyLines", true);
        setField(term33967, term33967.getClass(), "recordSeparator", "aWYOWZFyaX");
        setField(term33967, term33967.getClass(), "nullString", "BRIVNtfUWU");
        setElement(term33978, 0, "DbiCVtPPCT");
        setElement(term33978, 1, "WzFopsaDuG");
        setElement(term33978, 2, "PapWxkhEWe");
        setElement(term33978, 3, "smnHEqRFRx");
        setElement(term33978, 4, "XYtryyobou");
        setElement(term33978, 5, "OYbzXylRWW");
        setElement(term33978, 6, "DSNsTGYXDF");
        setField(term33967, term33967.getClass(), "header", term33978);
        setBooleanField(term33967, term33967.getClass(), "skipHeaderRecord", false);
        term33993 = (Object[]) newArray("java.lang.String", 2);
        setElement(term33993, 0, "sQvGcVjdEx");
        setElement(term33993, 1, "rLHAoqXgPh");
        Character term33717 = new Character('T');
        Class<? extends Object> term35693 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term35692 = ((Class) term35693).getDeclaredField((String) "ALL");
        ((Field) term35692).setAccessible(true);
        Object enum103 = ((Field) term35692).get((Object) null);
        Character term33726 = new Character('m');
        Character term33728 = new Character('J');
        term33715 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term33756 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term33715, term33715.getClass(), "delimiter", 'E');
        setField(term33715, term33715.getClass(), "quoteChar", term33717);
        setField(term33715, term33715.getClass(), "quotePolicy", enum103);
        setField(term33715, term33715.getClass(), "commentStart", term33726);
        setField(term33715, term33715.getClass(), "escape", term33728);
        setBooleanField(term33715, term33715.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term33715, term33715.getClass(), "ignoreEmptyLines", true);
        setField(term33715, term33715.getClass(), "recordSeparator", "aWYOWZFyaX");
        setField(term33715, term33715.getClass(), "nullString", "BRIVNtfUWU");
        setElement(term33756, 0, "sQvGcVjdEx");
        setElement(term33756, 1, "rLHAoqXgPh");
        setField(term33715, term33715.getClass(), "header", term33756);
        setBooleanField(term33715, term33715.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8841;
        Object retValue = callMethod(klass, "withHeader", argTypes, term8714, args);
        assertTrue(recursiveEquals(term8714, term33967));
        assertTrue(recursiveEquals(term8841, term33993));
        assertTrue(recursiveEquals(retValue, term33715));
    }

};


