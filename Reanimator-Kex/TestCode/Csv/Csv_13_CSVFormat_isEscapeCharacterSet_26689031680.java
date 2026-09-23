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

public class CSVFormat_isEscapeCharacterSet_26689031680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8915;
     Object term55000;

    public CSVFormat_isEscapeCharacterSet_26689031680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8917 = new Character('z');
        Class<? extends Object> term55907 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term55906 = ((Class) term55907).getDeclaredField((String) "NONE");
        ((Field) term55906).setAccessible(true);
        Object enum97 = ((Field) term55906).get((Object) null);
        Character term8927 = new Character('Y');
        Character term8929 = new Character('Y');
        term8915 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8958 = (Object[]) newArray("java.lang.String", 6);
        Object[] term9031 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term8915, term8915.getClass(), "delimiter", 'S');
        setField(term8915, term8915.getClass(), "quoteCharacter", term8917);
        setField(term8915, term8915.getClass(), "quoteMode", enum97);
        setField(term8915, term8915.getClass(), "commentMarker", term8927);
        setField(term8915, term8915.getClass(), "escapeCharacter", term8929);
        setBooleanField(term8915, term8915.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term8915, term8915.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term8915, term8915.getClass(), "ignoreEmptyLines", false);
        setField(term8915, term8915.getClass(), "recordSeparator", "RMsXuyzKJV");
        setField(term8915, term8915.getClass(), "nullString", "FwPbDZcHmB");
        setElement(term8958, 0, "hOncybyCAH");
        setElement(term8958, 1, "QduALnDSVo");
        setElement(term8958, 2, "izPpKDErnQ");
        setElement(term8958, 3, "NnpwZBUTvx");
        setElement(term8958, 4, "tlQSNgTkQX");
        setElement(term8958, 5, "PCipZnmBOF");
        setField(term8915, term8915.getClass(), "header", term8958);
        setElement(term9031, 0, "zcorEihhLK");
        setElement(term9031, 1, "GrqozDKFOk");
        setField(term8915, term8915.getClass(), "headerComments", term9031);
        setBooleanField(term8915, term8915.getClass(), "skipHeaderRecord", false);
        setBooleanField(term8915, term8915.getClass(), "ignoreHeaderCase", true);
        Character term55001 = new Character('z');
        Class<? extends Object> term56186 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term56185 = ((Class) term56186).getDeclaredField((String) "NONE");
        ((Field) term56185).setAccessible(true);
        Object enum98 = ((Field) term56185).get((Object) null);
        Character term55005 = new Character('Y');
        Character term55006 = new Character('Y');
        term55000 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term55011 = (Object[]) newArray("java.lang.String", 6);
        Object[] term55024 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term55000, term55000.getClass(), "delimiter", 'S');
        setField(term55000, term55000.getClass(), "quoteCharacter", term55001);
        setField(term55000, term55000.getClass(), "quoteMode", enum98);
        setField(term55000, term55000.getClass(), "commentMarker", term55005);
        setField(term55000, term55000.getClass(), "escapeCharacter", term55006);
        setBooleanField(term55000, term55000.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term55000, term55000.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term55000, term55000.getClass(), "ignoreEmptyLines", false);
        setField(term55000, term55000.getClass(), "recordSeparator", "RMsXuyzKJV");
        setField(term55000, term55000.getClass(), "nullString", "FwPbDZcHmB");
        setElement(term55011, 0, "hOncybyCAH");
        setElement(term55011, 1, "QduALnDSVo");
        setElement(term55011, 2, "izPpKDErnQ");
        setElement(term55011, 3, "NnpwZBUTvx");
        setElement(term55011, 4, "tlQSNgTkQX");
        setElement(term55011, 5, "PCipZnmBOF");
        setField(term55000, term55000.getClass(), "header", term55011);
        setElement(term55024, 0, "zcorEihhLK");
        setElement(term55024, 1, "GrqozDKFOk");
        setField(term55000, term55000.getClass(), "headerComments", term55024);
        setBooleanField(term55000, term55000.getClass(), "skipHeaderRecord", false);
        setBooleanField(term55000, term55000.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEscapeCharacterSet", argTypes, term8915, args);
        assertTrue(recursiveEquals(term8915, term55000));
        assertTrue(recursiveEquals(retValue, true));
    }

};


