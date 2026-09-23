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

public class CSVFormat_withRecordSeparator_209597661884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13458;
     Object term49228;
     Object term48961;

    public CSVFormat_withRecordSeparator_209597661884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term13460 = new Character('I');
        Class<? extends Object> term49251 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term49250 = ((Class) term49251).getDeclaredField((String) "ALL");
        ((Field) term49250).setAccessible(true);
        Object enum127 = ((Field) term49250).get((Object) null);
        Character term13469 = new Character('b');
        Character term13471 = new Character('n');
        term13458 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13500 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term13458, term13458.getClass(), "delimiter", 'G');
        setField(term13458, term13458.getClass(), "quoteCharacter", term13460);
        setField(term13458, term13458.getClass(), "quoteMode", enum127);
        setField(term13458, term13458.getClass(), "commentMarker", term13469);
        setField(term13458, term13458.getClass(), "escapeCharacter", term13471);
        setBooleanField(term13458, term13458.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term13458, term13458.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term13458, term13458.getClass(), "ignoreEmptyLines", true);
        setField(term13458, term13458.getClass(), "recordSeparator", "XfRABIFVEp");
        setField(term13458, term13458.getClass(), "nullString", "MHGKyEnwKc");
        setElement(term13500, 0, "ShIELyuULw");
        setElement(term13500, 1, "IpQuOGMgmj");
        setElement(term13500, 2, "pJbnHTYrxn");
        setElement(term13500, 3, "iIRsCSYqXH");
        setField(term13458, term13458.getClass(), "header", term13500);
        setBooleanField(term13458, term13458.getClass(), "skipHeaderRecord", false);
        Character term49229 = new Character('I');
        Class<? extends Object> term49497 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term49496 = ((Class) term49497).getDeclaredField((String) "ALL");
        ((Field) term49496).setAccessible(true);
        Object enum128 = ((Field) term49496).get((Object) null);
        Character term49233 = new Character('b');
        Character term49234 = new Character('n');
        term49228 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term49239 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term49228, term49228.getClass(), "delimiter", 'G');
        setField(term49228, term49228.getClass(), "quoteCharacter", term49229);
        setField(term49228, term49228.getClass(), "quoteMode", enum128);
        setField(term49228, term49228.getClass(), "commentMarker", term49233);
        setField(term49228, term49228.getClass(), "escapeCharacter", term49234);
        setBooleanField(term49228, term49228.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term49228, term49228.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term49228, term49228.getClass(), "ignoreEmptyLines", true);
        setField(term49228, term49228.getClass(), "recordSeparator", "XfRABIFVEp");
        setField(term49228, term49228.getClass(), "nullString", "MHGKyEnwKc");
        setElement(term49239, 0, "ShIELyuULw");
        setElement(term49239, 1, "IpQuOGMgmj");
        setElement(term49239, 2, "pJbnHTYrxn");
        setElement(term49239, 3, "iIRsCSYqXH");
        setField(term49228, term49228.getClass(), "header", term49239);
        setBooleanField(term49228, term49228.getClass(), "skipHeaderRecord", false);
        Character term48963 = new Character('I');
        Class<? extends Object> term49743 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term49742 = ((Class) term49743).getDeclaredField((String) "ALL");
        ((Field) term49742).setAccessible(true);
        Object enum129 = ((Field) term49742).get((Object) null);
        Character term48972 = new Character('b');
        Character term48974 = new Character('n');
        term48961 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term49003 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term48961, term48961.getClass(), "delimiter", 'G');
        setField(term48961, term48961.getClass(), "quoteCharacter", term48963);
        setField(term48961, term48961.getClass(), "quoteMode", enum129);
        setField(term48961, term48961.getClass(), "commentMarker", term48972);
        setField(term48961, term48961.getClass(), "escapeCharacter", term48974);
        setBooleanField(term48961, term48961.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term48961, term48961.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term48961, term48961.getClass(), "ignoreEmptyLines", true);
        setField(term48961, term48961.getClass(), "recordSeparator", "nghfqDXyCG");
        setField(term48961, term48961.getClass(), "nullString", "MHGKyEnwKc");
        setElement(term49003, 0, "ShIELyuULw");
        setElement(term49003, 1, "IpQuOGMgmj");
        setElement(term49003, 2, "pJbnHTYrxn");
        setElement(term49003, 3, "iIRsCSYqXH");
        setField(term48961, term48961.getClass(), "header", term49003);
        setBooleanField(term48961, term48961.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nghfqDXyCG";
        Object retValue = callMethod(klass, "withRecordSeparator", argTypes, term13458, args);
        assertTrue(recursiveEquals(term13458, term49228));
        assertTrue(recursiveEquals(retValue, term48961));
    }

};


