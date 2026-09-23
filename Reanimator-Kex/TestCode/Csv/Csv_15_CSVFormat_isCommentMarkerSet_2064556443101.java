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

public class CSVFormat_isCommentMarkerSet_2064556443101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9346;
     Object term57111;

    public CSVFormat_isCommentMarkerSet_2064556443101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9348 = new Character('I');
        Character term9351 = new Character('c');
        Character term9490 = new Character('R');
        Class<? extends Object> term57549 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term57548 = ((Class) term57549).getDeclaredField((String) "NONE");
        ((Field) term57548).setAccessible(true);
        Object enum118 = ((Field) term57548).get((Object) null);
        term9346 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9353 = (Object[]) newArray("java.lang.String", 2);
        Object[] term9378 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term9346, term9346.getClass(), "allowMissingColumnNames", true);
        setField(term9346, term9346.getClass(), "commentMarker", term9348);
        setCharField(term9346, term9346.getClass(), "delimiter", 'r');
        setField(term9346, term9346.getClass(), "escapeCharacter", term9351);
        setElement(term9353, 0, "zcorEihhLK");
        setElement(term9353, 1, "GrqozDKFOk");
        setField(term9346, term9346.getClass(), "header", term9353);
        setElement(term9378, 0, "CFyoseFGLF");
        setElement(term9378, 1, "SFqCrhEWLm");
        setElement(term9378, 2, "GZdcJyZntS");
        setElement(term9378, 3, "OIHoJeysUi");
        setElement(term9378, 4, "WXMWFDGcLB");
        setElement(term9378, 5, "wKWbJssZuG");
        setElement(term9378, 6, "NzBMMhkhpT");
        setElement(term9378, 7, "qCpEbQDHdF");
        setField(term9346, term9346.getClass(), "headerComments", term9378);
        setBooleanField(term9346, term9346.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term9346, term9346.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term9346, term9346.getClass(), "ignoreSurroundingSpaces", true);
        setField(term9346, term9346.getClass(), "nullString", "AHbZyFOmlo");
        setField(term9346, term9346.getClass(), "quoteCharacter", term9490);
        setField(term9346, term9346.getClass(), "quoteMode", enum118);
        setField(term9346, term9346.getClass(), "recordSeparator", "TwfWVQGiIj");
        setBooleanField(term9346, term9346.getClass(), "skipHeaderRecord", false);
        setBooleanField(term9346, term9346.getClass(), "trailingDelimiter", true);
        setBooleanField(term9346, term9346.getClass(), "trim", false);
        setBooleanField(term9346, term9346.getClass(), "autoFlush", true);
        Character term57127 = new Character('I');
        Character term57134 = new Character('c');
        Character term57167 = new Character('R');
        Class<? extends Object> term57925 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term57924 = ((Class) term57925).getDeclaredField((String) "NONE");
        ((Field) term57924).setAccessible(true);
        Object enum119 = ((Field) term57924).get((Object) null);
        term57111 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term57135 = (Object[]) newArray("java.lang.String", 2);
        Object[] term57144 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term57111, term57111.getClass(), "allowMissingColumnNames", true);
        setField(term57111, term57111.getClass(), "commentMarker", term57127);
        setCharField(term57111, term57111.getClass(), "delimiter", 'r');
        setField(term57111, term57111.getClass(), "escapeCharacter", term57134);
        setElement(term57135, 0, "zcorEihhLK");
        setElement(term57135, 1, "GrqozDKFOk");
        setField(term57111, term57111.getClass(), "header", term57135);
        setElement(term57144, 0, "CFyoseFGLF");
        setElement(term57144, 1, "SFqCrhEWLm");
        setElement(term57144, 2, "GZdcJyZntS");
        setElement(term57144, 3, "OIHoJeysUi");
        setElement(term57144, 4, "WXMWFDGcLB");
        setElement(term57144, 5, "wKWbJssZuG");
        setElement(term57144, 6, "NzBMMhkhpT");
        setElement(term57144, 7, "qCpEbQDHdF");
        setField(term57111, term57111.getClass(), "headerComments", term57144);
        setBooleanField(term57111, term57111.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term57111, term57111.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term57111, term57111.getClass(), "ignoreSurroundingSpaces", true);
        setField(term57111, term57111.getClass(), "nullString", "AHbZyFOmlo");
        setField(term57111, term57111.getClass(), "quoteCharacter", term57167);
        setField(term57111, term57111.getClass(), "quoteMode", enum119);
        setField(term57111, term57111.getClass(), "recordSeparator", "TwfWVQGiIj");
        setBooleanField(term57111, term57111.getClass(), "skipHeaderRecord", false);
        setBooleanField(term57111, term57111.getClass(), "trailingDelimiter", true);
        setBooleanField(term57111, term57111.getClass(), "trim", false);
        setBooleanField(term57111, term57111.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCommentMarkerSet", argTypes, term9346, args);
        assertTrue(recursiveEquals(term9346, term57111));
        assertTrue(recursiveEquals(retValue, true));
    }

};


