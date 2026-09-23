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

public class CSVFormat_getQuotePolicy_23294452254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3674;
     Object term21764;
     Object enum63;

    public CSVFormat_getQuotePolicy_23294452254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3676 = new Character('n');
        Class<? extends Object> term21891 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term21890 = ((Class) term21891).getDeclaredField((String) "NONE");
        ((Field) term21890).setAccessible(true);
        Object enum61 = ((Field) term21890).get((Object) null);
        Character term3686 = new Character('W');
        Character term3688 = new Character('E');
        term3674 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3716 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term3674, term3674.getClass(), "delimiter", 'a');
        setField(term3674, term3674.getClass(), "quoteChar", term3676);
        setField(term3674, term3674.getClass(), "quotePolicy", enum61);
        setField(term3674, term3674.getClass(), "commentStart", term3686);
        setField(term3674, term3674.getClass(), "escape", term3688);
        setBooleanField(term3674, term3674.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term3674, term3674.getClass(), "ignoreEmptyLines", false);
        setField(term3674, term3674.getClass(), "recordSeparator", "tPlsykYBqO");
        setField(term3674, term3674.getClass(), "nullString", "bLPjGVBhlX");
        setElement(term3716, 0, "whBvTVIIlC");
        setElement(term3716, 1, "IgRJUzaCwW");
        setElement(term3716, 2, "JUmudUmaaV");
        setElement(term3716, 3, "KoyGrUJeJW");
        setElement(term3716, 4, "HqBOwkVqjD");
        setField(term3674, term3674.getClass(), "header", term3716);
        setBooleanField(term3674, term3674.getClass(), "skipHeaderRecord", true);
        Character term21765 = new Character('n');
        Class<? extends Object> term22208 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term22207 = ((Class) term22208).getDeclaredField((String) "NONE");
        ((Field) term22207).setAccessible(true);
        Object enum62 = ((Field) term22207).get((Object) null);
        Character term21796 = new Character('W');
        Character term21798 = new Character('E');
        term21764 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term21826 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term21764, term21764.getClass(), "delimiter", 'a');
        setField(term21764, term21764.getClass(), "quoteChar", term21765);
        setField(term21764, term21764.getClass(), "quotePolicy", enum62);
        setField(term21764, term21764.getClass(), "commentStart", term21796);
        setField(term21764, term21764.getClass(), "escape", term21798);
        setBooleanField(term21764, term21764.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term21764, term21764.getClass(), "ignoreEmptyLines", false);
        setField(term21764, term21764.getClass(), "recordSeparator", "tPlsykYBqO");
        setField(term21764, term21764.getClass(), "nullString", "bLPjGVBhlX");
        setElement(term21826, 0, "whBvTVIIlC");
        setElement(term21826, 1, "IgRJUzaCwW");
        setElement(term21826, 2, "JUmudUmaaV");
        setElement(term21826, 3, "KoyGrUJeJW");
        setElement(term21826, 4, "HqBOwkVqjD");
        setField(term21764, term21764.getClass(), "header", term21826);
        setBooleanField(term21764, term21764.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term22437 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term22436 = ((Class) term22437).getDeclaredField((String) "NONE");
        ((Field) term22436).setAccessible(true);
        enum63 = ((Field) term22436).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQuotePolicy", argTypes, term3674, args);
        assertTrue(recursiveEquals(term3674, term21764));
        assertTrue(recursiveEquals(retValue, enum63));
    }

};


