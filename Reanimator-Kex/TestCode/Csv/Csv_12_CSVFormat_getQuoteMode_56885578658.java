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

public class CSVFormat_getQuoteMode_56885578658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4260;
     Object term26943;
     Object enum68;

    public CSVFormat_getQuoteMode_56885578658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4262 = new Character('t');
        Class<? extends Object> term26972 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term26971 = ((Class) term26972).getDeclaredField((String) "MINIMAL");
        ((Field) term26971).setAccessible(true);
        Object enum66 = ((Field) term26971).get((Object) null);
        Character term4275 = new Character('D');
        Character term4277 = new Character('I');
        term4260 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4306 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term4260, term4260.getClass(), "delimiter", 'G');
        setField(term4260, term4260.getClass(), "quoteCharacter", term4262);
        setField(term4260, term4260.getClass(), "quoteMode", enum66);
        setField(term4260, term4260.getClass(), "commentMarker", term4275);
        setField(term4260, term4260.getClass(), "escapeCharacter", term4277);
        setBooleanField(term4260, term4260.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term4260, term4260.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term4260, term4260.getClass(), "ignoreEmptyLines", false);
        setField(term4260, term4260.getClass(), "recordSeparator", "MAcUBcBckh");
        setField(term4260, term4260.getClass(), "nullString", "oVgzLbrsFr");
        setElement(term4306, 0, "vQVyKLdtaz");
        setElement(term4306, 1, "OWKQODBLzb");
        setField(term4260, term4260.getClass(), "header", term4306);
        setBooleanField(term4260, term4260.getClass(), "skipHeaderRecord", false);
        Character term26944 = new Character('t');
        Class<? extends Object> term27281 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term27280 = ((Class) term27281).getDeclaredField((String) "MINIMAL");
        ((Field) term27280).setAccessible(true);
        Object enum67 = ((Field) term27280).get((Object) null);
        Character term26948 = new Character('D');
        Character term26949 = new Character('I');
        term26943 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term26954 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term26943, term26943.getClass(), "delimiter", 'G');
        setField(term26943, term26943.getClass(), "quoteCharacter", term26944);
        setField(term26943, term26943.getClass(), "quoteMode", enum67);
        setField(term26943, term26943.getClass(), "commentMarker", term26948);
        setField(term26943, term26943.getClass(), "escapeCharacter", term26949);
        setBooleanField(term26943, term26943.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term26943, term26943.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term26943, term26943.getClass(), "ignoreEmptyLines", false);
        setField(term26943, term26943.getClass(), "recordSeparator", "MAcUBcBckh");
        setField(term26943, term26943.getClass(), "nullString", "oVgzLbrsFr");
        setElement(term26954, 0, "vQVyKLdtaz");
        setElement(term26954, 1, "OWKQODBLzb");
        setField(term26943, term26943.getClass(), "header", term26954);
        setBooleanField(term26943, term26943.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term27509 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term27508 = ((Class) term27509).getDeclaredField((String) "MINIMAL");
        ((Field) term27508).setAccessible(true);
        enum68 = ((Field) term27508).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQuoteMode", argTypes, term4260, args);
        assertTrue(recursiveEquals(term4260, term26943));
        assertTrue(recursiveEquals(retValue, enum68));
    }

};


