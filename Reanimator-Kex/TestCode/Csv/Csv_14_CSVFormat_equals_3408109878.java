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

public class CSVFormat_equals_3408109878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414;
     Object term550;
     Object term33498;
     Object term33525;

    public CSVFormat_equals_3408109878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term416 = new Character('t');
        Character term419 = new Character('D');
        Character term522 = new Character('s');
        Class<? extends Object> term33608 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term33607 = ((Class) term33608).getDeclaredField((String) "MINIMAL");
        ((Field) term33607).setAccessible(true);
        Object enum74 = ((Field) term33607).get((Object) null);
        term414 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term421 = (Object[]) newArray("java.lang.String", 3);
        Object[] term458 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term414, term414.getClass(), "allowMissingColumnNames", true);
        setField(term414, term414.getClass(), "commentMarker", term416);
        setCharField(term414, term414.getClass(), "delimiter", 'T');
        setField(term414, term414.getClass(), "escapeCharacter", term419);
        setElement(term421, 0, "MjGYSRKTNF");
        setElement(term421, 1, "hRNSzYYIrc");
        setElement(term421, 2, "RMFIsYGgne");
        setField(term414, term414.getClass(), "header", term421);
        setElement(term458, 0, "NRdvgJlhkX");
        setElement(term458, 1, "uuaPigETmJ");
        setElement(term458, 2, "MxlszYVzRf");
        setElement(term458, 3, "LQFpaHEwXR");
        setField(term414, term414.getClass(), "headerComments", term458);
        setBooleanField(term414, term414.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term414, term414.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term414, term414.getClass(), "ignoreSurroundingSpaces", false);
        setField(term414, term414.getClass(), "nullString", "oVcInYnLWB");
        setField(term414, term414.getClass(), "quoteCharacter", term522);
        setField(term414, term414.getClass(), "quoteMode", enum74);
        setField(term414, term414.getClass(), "recordSeparator", "aJlieCFVtF");
        setBooleanField(term414, term414.getClass(), "skipHeaderRecord", true);
        setBooleanField(term414, term414.getClass(), "trailingDelimiter", false);
        setBooleanField(term414, term414.getClass(), "trim", true);
        term550 = newInstance(Class.forName("java.lang.Object"));
        Character term33499 = new Character('t');
        Character term33500 = new Character('D');
        Character term33519 = new Character('s');
        Class<? extends Object> term33886 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term33885 = ((Class) term33886).getDeclaredField((String) "MINIMAL");
        ((Field) term33885).setAccessible(true);
        Object enum75 = ((Field) term33885).get((Object) null);
        term33498 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term33501 = (Object[]) newArray("java.lang.String", 3);
        Object[] term33508 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term33498, term33498.getClass(), "allowMissingColumnNames", true);
        setField(term33498, term33498.getClass(), "commentMarker", term33499);
        setCharField(term33498, term33498.getClass(), "delimiter", 'T');
        setField(term33498, term33498.getClass(), "escapeCharacter", term33500);
        setElement(term33501, 0, "MjGYSRKTNF");
        setElement(term33501, 1, "hRNSzYYIrc");
        setElement(term33501, 2, "RMFIsYGgne");
        setField(term33498, term33498.getClass(), "header", term33501);
        setElement(term33508, 0, "NRdvgJlhkX");
        setElement(term33508, 1, "uuaPigETmJ");
        setElement(term33508, 2, "MxlszYVzRf");
        setElement(term33508, 3, "LQFpaHEwXR");
        setField(term33498, term33498.getClass(), "headerComments", term33508);
        setBooleanField(term33498, term33498.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term33498, term33498.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term33498, term33498.getClass(), "ignoreSurroundingSpaces", false);
        setField(term33498, term33498.getClass(), "nullString", "oVcInYnLWB");
        setField(term33498, term33498.getClass(), "quoteCharacter", term33519);
        setField(term33498, term33498.getClass(), "quoteMode", enum75);
        setField(term33498, term33498.getClass(), "recordSeparator", "aJlieCFVtF");
        setBooleanField(term33498, term33498.getClass(), "skipHeaderRecord", true);
        setBooleanField(term33498, term33498.getClass(), "trailingDelimiter", false);
        setBooleanField(term33498, term33498.getClass(), "trim", true);
        term33525 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term550;
        Object retValue = callMethod(klass, "equals", argTypes, term414, args);
        assertTrue(recursiveEquals(term414, term33498));
        assertTrue(recursiveEquals(term550, term33525));
        assertTrue(recursiveEquals(retValue, false));
    }

};


