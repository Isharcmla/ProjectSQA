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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withIgnoreEmptyLines_47944052157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24407;

    public CSVFormat_withIgnoreEmptyLines_47944052157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term24409 = new Character('x');
        Character term24412 = new Character('E');
        Character term24539 = new Character('q');
        Class<? extends Object> term24673 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term24672 = ((Class) term24673).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term24672).setAccessible(true);
        Object enum54 = ((Field) term24672).get((Object) null);
        term24407 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term24414 = (Object[]) newArray("java.lang.String", 5);
        Object[] term24475 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term24407, term24407.getClass(), "allowMissingColumnNames", false);
        setField(term24407, term24407.getClass(), "commentMarker", term24409);
        setCharField(term24407, term24407.getClass(), "delimiter", 'O');
        setField(term24407, term24407.getClass(), "escapeCharacter", term24412);
        setElement(term24414, 0, "mvfDtZNEHr");
        setElement(term24414, 1, "bvSgmFUDOU");
        setElement(term24414, 2, "XMHwbfiHRl");
        setElement(term24414, 3, "bucTnYicnp");
        setElement(term24414, 4, "EkgprvqZlM");
        setField(term24407, term24407.getClass(), "header", term24414);
        setElement(term24475, 0, "fbnKvthhOz");
        setElement(term24475, 1, "PGfCDJTBek");
        setElement(term24475, 2, "ZwjARhAtHC");
        setElement(term24475, 3, "XXvscsYBWv");
        setField(term24407, term24407.getClass(), "headerComments", term24475);
        setBooleanField(term24407, term24407.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term24407, term24407.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term24407, term24407.getClass(), "ignoreSurroundingSpaces", true);
        setField(term24407, term24407.getClass(), "nullString", "uePedtiAfL");
        setField(term24407, term24407.getClass(), "quoteCharacter", term24539);
        setField(term24407, term24407.getClass(), "quoteMode", enum54);
        setField(term24407, term24407.getClass(), "recordSeparator", "AdSHvysxQB");
        setBooleanField(term24407, term24407.getClass(), "skipHeaderRecord", false);
        setBooleanField(term24407, term24407.getClass(), "trailingDelimiter", true);
        setBooleanField(term24407, term24407.getClass(), "trim", true);
        setBooleanField(term24407, term24407.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withIgnoreEmptyLines", argTypes, term24407, args);
    }

};


