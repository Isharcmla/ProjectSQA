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

public class CSVFormat_withAllowMissingColumnNames_75501339096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16490;
     Object term74664;
     Object term74541;

    public CSVFormat_withAllowMissingColumnNames_75501339096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term16492 = new Character('i');
        Class<? extends Object> term74692 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term74691 = ((Class) term74692).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term74691).setAccessible(true);
        Object enum132 = ((Field) term74691).get((Object) null);
        Character term16509 = new Character('e');
        Character term16511 = new Character('C');
        term16490 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term16540 = (Object[]) newArray("java.lang.String", 1);
        Object[] term16553 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term16490, term16490.getClass(), "delimiter", 'l');
        setField(term16490, term16490.getClass(), "quoteCharacter", term16492);
        setField(term16490, term16490.getClass(), "quoteMode", enum132);
        setField(term16490, term16490.getClass(), "commentMarker", term16509);
        setField(term16490, term16490.getClass(), "escapeCharacter", term16511);
        setBooleanField(term16490, term16490.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term16490, term16490.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term16490, term16490.getClass(), "ignoreEmptyLines", false);
        setField(term16490, term16490.getClass(), "recordSeparator", "oKwCDqywym");
        setField(term16490, term16490.getClass(), "nullString", "zjZYTddemL");
        setElement(term16540, 0, "QtrylgCLiF");
        setField(term16490, term16490.getClass(), "header", term16540);
        setElement(term16553, 0, "orEuhCStGM");
        setElement(term16553, 1, "HhEaSXWvrY");
        setElement(term16553, 2, "CVRGEomOth");
        setElement(term16553, 3, "vSeruUyNWX");
        setElement(term16553, 4, "UkKvaeJfEC");
        setElement(term16553, 5, "WPxXsahPRq");
        setField(term16490, term16490.getClass(), "headerComments", term16553);
        setBooleanField(term16490, term16490.getClass(), "skipHeaderRecord", false);
        setBooleanField(term16490, term16490.getClass(), "ignoreHeaderCase", true);
        Character term74665 = new Character('i');
        Class<? extends Object> term74982 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term74981 = ((Class) term74982).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term74981).setAccessible(true);
        Object enum133 = ((Field) term74981).get((Object) null);
        Character term74669 = new Character('e');
        Character term74670 = new Character('C');
        term74664 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term74675 = (Object[]) newArray("java.lang.String", 1);
        Object[] term74678 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term74664, term74664.getClass(), "delimiter", 'l');
        setField(term74664, term74664.getClass(), "quoteCharacter", term74665);
        setField(term74664, term74664.getClass(), "quoteMode", enum133);
        setField(term74664, term74664.getClass(), "commentMarker", term74669);
        setField(term74664, term74664.getClass(), "escapeCharacter", term74670);
        setBooleanField(term74664, term74664.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term74664, term74664.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term74664, term74664.getClass(), "ignoreEmptyLines", false);
        setField(term74664, term74664.getClass(), "recordSeparator", "oKwCDqywym");
        setField(term74664, term74664.getClass(), "nullString", "zjZYTddemL");
        setElement(term74675, 0, "QtrylgCLiF");
        setField(term74664, term74664.getClass(), "header", term74675);
        setElement(term74678, 0, "orEuhCStGM");
        setElement(term74678, 1, "HhEaSXWvrY");
        setElement(term74678, 2, "CVRGEomOth");
        setElement(term74678, 3, "vSeruUyNWX");
        setElement(term74678, 4, "UkKvaeJfEC");
        setElement(term74678, 5, "WPxXsahPRq");
        setField(term74664, term74664.getClass(), "headerComments", term74678);
        setBooleanField(term74664, term74664.getClass(), "skipHeaderRecord", false);
        setBooleanField(term74664, term74664.getClass(), "ignoreHeaderCase", true);
        Character term74543 = new Character('i');
        Class<? extends Object> term75272 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term75271 = ((Class) term75272).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term75271).setAccessible(true);
        Object enum134 = ((Field) term75271).get((Object) null);
        Character term74545 = new Character('e');
        Character term74547 = new Character('C');
        term74541 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term74576 = (Object[]) newArray("java.lang.String", 1);
        Object[] term74589 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term74541, term74541.getClass(), "delimiter", 'l');
        setField(term74541, term74541.getClass(), "quoteCharacter", term74543);
        setField(term74541, term74541.getClass(), "quoteMode", enum134);
        setField(term74541, term74541.getClass(), "commentMarker", term74545);
        setField(term74541, term74541.getClass(), "escapeCharacter", term74547);
        setBooleanField(term74541, term74541.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term74541, term74541.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term74541, term74541.getClass(), "ignoreEmptyLines", false);
        setField(term74541, term74541.getClass(), "recordSeparator", "oKwCDqywym");
        setField(term74541, term74541.getClass(), "nullString", "zjZYTddemL");
        setElement(term74576, 0, "QtrylgCLiF");
        setField(term74541, term74541.getClass(), "header", term74576);
        setElement(term74589, 0, "orEuhCStGM");
        setElement(term74589, 1, "HhEaSXWvrY");
        setElement(term74589, 2, "CVRGEomOth");
        setElement(term74589, 3, "vSeruUyNWX");
        setElement(term74589, 4, "UkKvaeJfEC");
        setElement(term74589, 5, "WPxXsahPRq");
        setField(term74541, term74541.getClass(), "headerComments", term74589);
        setBooleanField(term74541, term74541.getClass(), "skipHeaderRecord", false);
        setBooleanField(term74541, term74541.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withAllowMissingColumnNames", argTypes, term16490, args);
        assertTrue(recursiveEquals(term16490, term74664));
        assertTrue(recursiveEquals(retValue, term74541));
    }

};


