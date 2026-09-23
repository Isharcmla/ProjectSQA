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

public class CSVFormat_validate_725288942114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16988;
     Object term70205;

    public CSVFormat_validate_725288942114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term16990 = new Character('J');
        Character term16993 = new Character('i');
        Character term17168 = new Character('e');
        Class<? extends Object> term70385 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term70384 = ((Class) term70385).getDeclaredField((String) "NONE");
        ((Field) term70384).setAccessible(true);
        Object enum143 = ((Field) term70384).get((Object) null);
        term16988 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term16995 = (Object[]) newArray("java.lang.String", 6);
        Object[] term17068 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term16988, term16988.getClass(), "allowMissingColumnNames", false);
        setField(term16988, term16988.getClass(), "commentMarker", term16990);
        setCharField(term16988, term16988.getClass(), "delimiter", 'l');
        setField(term16988, term16988.getClass(), "escapeCharacter", term16993);
        setElement(term16995, 0, "oKwCDqywym");
        setElement(term16995, 1, "zjZYTddemL");
        setElement(term16995, 2, "QtrylgCLiF");
        setElement(term16995, 3, "orEuhCStGM");
        setElement(term16995, 4, "HhEaSXWvrY");
        setElement(term16995, 5, "CVRGEomOth");
        setField(term16988, term16988.getClass(), "header", term16995);
        setElement(term17068, 0, "vSeruUyNWX");
        setElement(term17068, 1, "UkKvaeJfEC");
        setElement(term17068, 2, "WPxXsahPRq");
        setElement(term17068, 3, "IENRuqmwUU");
        setElement(term17068, 4, "GsWxOwXvSu");
        setElement(term17068, 5, "bKBSncrMEZ");
        setElement(term17068, 6, "yeSXGqQExb");
        setField(term16988, term16988.getClass(), "headerComments", term17068);
        setBooleanField(term16988, term16988.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term16988, term16988.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term16988, term16988.getClass(), "ignoreSurroundingSpaces", true);
        setField(term16988, term16988.getClass(), "nullString", "uXYcXVYJZM");
        setField(term16988, term16988.getClass(), "quoteCharacter", term17168);
        setField(term16988, term16988.getClass(), "quoteMode", enum143);
        setField(term16988, term16988.getClass(), "recordSeparator", "BJhjdJUhkz");
        setBooleanField(term16988, term16988.getClass(), "skipHeaderRecord", false);
        setBooleanField(term16988, term16988.getClass(), "trailingDelimiter", false);
        setBooleanField(term16988, term16988.getClass(), "trim", true);
        Character term70206 = new Character('J');
        Character term70207 = new Character('i');
        Character term70238 = new Character('e');
        Class<? extends Object> term70714 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term70713 = ((Class) term70714).getDeclaredField((String) "NONE");
        ((Field) term70713).setAccessible(true);
        Object enum144 = ((Field) term70713).get((Object) null);
        term70205 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term70208 = (Object[]) newArray("java.lang.String", 6);
        Object[] term70221 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term70205, term70205.getClass(), "allowMissingColumnNames", false);
        setField(term70205, term70205.getClass(), "commentMarker", term70206);
        setCharField(term70205, term70205.getClass(), "delimiter", 'l');
        setField(term70205, term70205.getClass(), "escapeCharacter", term70207);
        setElement(term70208, 0, "oKwCDqywym");
        setElement(term70208, 1, "zjZYTddemL");
        setElement(term70208, 2, "QtrylgCLiF");
        setElement(term70208, 3, "orEuhCStGM");
        setElement(term70208, 4, "HhEaSXWvrY");
        setElement(term70208, 5, "CVRGEomOth");
        setField(term70205, term70205.getClass(), "header", term70208);
        setElement(term70221, 0, "vSeruUyNWX");
        setElement(term70221, 1, "UkKvaeJfEC");
        setElement(term70221, 2, "WPxXsahPRq");
        setElement(term70221, 3, "IENRuqmwUU");
        setElement(term70221, 4, "GsWxOwXvSu");
        setElement(term70221, 5, "bKBSncrMEZ");
        setElement(term70221, 6, "yeSXGqQExb");
        setField(term70205, term70205.getClass(), "headerComments", term70221);
        setBooleanField(term70205, term70205.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term70205, term70205.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term70205, term70205.getClass(), "ignoreSurroundingSpaces", true);
        setField(term70205, term70205.getClass(), "nullString", "uXYcXVYJZM");
        setField(term70205, term70205.getClass(), "quoteCharacter", term70238);
        setField(term70205, term70205.getClass(), "quoteMode", enum144);
        setField(term70205, term70205.getClass(), "recordSeparator", "BJhjdJUhkz");
        setBooleanField(term70205, term70205.getClass(), "skipHeaderRecord", false);
        setBooleanField(term70205, term70205.getClass(), "trailingDelimiter", false);
        setBooleanField(term70205, term70205.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term16988, args);
        assertTrue(recursiveEquals(term16988, term70205));
    }

};


