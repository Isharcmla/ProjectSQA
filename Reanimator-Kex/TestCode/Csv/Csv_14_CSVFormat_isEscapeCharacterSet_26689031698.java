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

public class CSVFormat_isEscapeCharacterSet_26689031698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9336;
     Object term55862;

    public CSVFormat_isEscapeCharacterSet_26689031698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9338 = new Character('I');
        Character term9341 = new Character('c');
        Character term9480 = new Character('R');
        Class<? extends Object> term56009 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term56008 = ((Class) term56009).getDeclaredField((String) "NONE");
        ((Field) term56008).setAccessible(true);
        Object enum115 = ((Field) term56008).get((Object) null);
        term9336 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9343 = (Object[]) newArray("java.lang.String", 2);
        Object[] term9368 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term9336, term9336.getClass(), "allowMissingColumnNames", false);
        setField(term9336, term9336.getClass(), "commentMarker", term9338);
        setCharField(term9336, term9336.getClass(), "delimiter", 'r');
        setField(term9336, term9336.getClass(), "escapeCharacter", term9341);
        setElement(term9343, 0, "zcorEihhLK");
        setElement(term9343, 1, "GrqozDKFOk");
        setField(term9336, term9336.getClass(), "header", term9343);
        setElement(term9368, 0, "CFyoseFGLF");
        setElement(term9368, 1, "SFqCrhEWLm");
        setElement(term9368, 2, "GZdcJyZntS");
        setElement(term9368, 3, "OIHoJeysUi");
        setElement(term9368, 4, "WXMWFDGcLB");
        setElement(term9368, 5, "wKWbJssZuG");
        setElement(term9368, 6, "NzBMMhkhpT");
        setElement(term9368, 7, "qCpEbQDHdF");
        setField(term9336, term9336.getClass(), "headerComments", term9368);
        setBooleanField(term9336, term9336.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term9336, term9336.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term9336, term9336.getClass(), "ignoreSurroundingSpaces", true);
        setField(term9336, term9336.getClass(), "nullString", "AHbZyFOmlo");
        setField(term9336, term9336.getClass(), "quoteCharacter", term9480);
        setField(term9336, term9336.getClass(), "quoteMode", enum115);
        setField(term9336, term9336.getClass(), "recordSeparator", "TwfWVQGiIj");
        setBooleanField(term9336, term9336.getClass(), "skipHeaderRecord", false);
        setBooleanField(term9336, term9336.getClass(), "trailingDelimiter", true);
        setBooleanField(term9336, term9336.getClass(), "trim", true);
        Character term55863 = new Character('I');
        Character term55864 = new Character('c');
        Character term55889 = new Character('R');
        Class<? extends Object> term56308 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term56307 = ((Class) term56308).getDeclaredField((String) "NONE");
        ((Field) term56307).setAccessible(true);
        Object enum116 = ((Field) term56307).get((Object) null);
        term55862 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term55865 = (Object[]) newArray("java.lang.String", 2);
        Object[] term55870 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term55862, term55862.getClass(), "allowMissingColumnNames", false);
        setField(term55862, term55862.getClass(), "commentMarker", term55863);
        setCharField(term55862, term55862.getClass(), "delimiter", 'r');
        setField(term55862, term55862.getClass(), "escapeCharacter", term55864);
        setElement(term55865, 0, "zcorEihhLK");
        setElement(term55865, 1, "GrqozDKFOk");
        setField(term55862, term55862.getClass(), "header", term55865);
        setElement(term55870, 0, "CFyoseFGLF");
        setElement(term55870, 1, "SFqCrhEWLm");
        setElement(term55870, 2, "GZdcJyZntS");
        setElement(term55870, 3, "OIHoJeysUi");
        setElement(term55870, 4, "WXMWFDGcLB");
        setElement(term55870, 5, "wKWbJssZuG");
        setElement(term55870, 6, "NzBMMhkhpT");
        setElement(term55870, 7, "qCpEbQDHdF");
        setField(term55862, term55862.getClass(), "headerComments", term55870);
        setBooleanField(term55862, term55862.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term55862, term55862.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term55862, term55862.getClass(), "ignoreSurroundingSpaces", true);
        setField(term55862, term55862.getClass(), "nullString", "AHbZyFOmlo");
        setField(term55862, term55862.getClass(), "quoteCharacter", term55889);
        setField(term55862, term55862.getClass(), "quoteMode", enum116);
        setField(term55862, term55862.getClass(), "recordSeparator", "TwfWVQGiIj");
        setBooleanField(term55862, term55862.getClass(), "skipHeaderRecord", false);
        setBooleanField(term55862, term55862.getClass(), "trailingDelimiter", true);
        setBooleanField(term55862, term55862.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEscapeCharacterSet", argTypes, term9336, args);
        assertTrue(recursiveEquals(term9336, term55862));
        assertTrue(recursiveEquals(retValue, true));
    }

};


