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

public class CSVFormat_getIgnoreHeaderCase_18524469172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5301;
     Object term48247;

    public CSVFormat_getIgnoreHeaderCase_18524469172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5303 = new Character('t');
        Class<? extends Object> term48277 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term48276 = ((Class) term48277).getDeclaredField((String) "MINIMAL");
        ((Field) term48276).setAccessible(true);
        Object enum78 = ((Field) term48276).get((Object) null);
        Character term5316 = new Character('D');
        Character term5318 = new Character('I');
        term5301 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5347 = (Object[]) newArray("java.lang.String", 5);
        Object[] term5408 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term5301, term5301.getClass(), "delimiter", 'G');
        setField(term5301, term5301.getClass(), "quoteCharacter", term5303);
        setField(term5301, term5301.getClass(), "quoteMode", enum78);
        setField(term5301, term5301.getClass(), "commentMarker", term5316);
        setField(term5301, term5301.getClass(), "escapeCharacter", term5318);
        setBooleanField(term5301, term5301.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term5301, term5301.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term5301, term5301.getClass(), "ignoreEmptyLines", true);
        setField(term5301, term5301.getClass(), "recordSeparator", "hCWPJQKpdc");
        setField(term5301, term5301.getClass(), "nullString", "WzMEhMXkKx");
        setElement(term5347, 0, "XOiDvlDhdc");
        setElement(term5347, 1, "AdxvLJhNLe");
        setElement(term5347, 2, "lHfTrWKMPk");
        setElement(term5347, 3, "JDaAnsVTGV");
        setElement(term5347, 4, "mLUZFTfjle");
        setField(term5301, term5301.getClass(), "header", term5347);
        setElement(term5408, 0, "xIeFjkHkOe");
        setElement(term5408, 1, "SdCKLMIYnX");
        setElement(term5408, 2, "OJJtVNPyKZ");
        setField(term5301, term5301.getClass(), "headerComments", term5408);
        setBooleanField(term5301, term5301.getClass(), "skipHeaderRecord", true);
        setBooleanField(term5301, term5301.getClass(), "ignoreHeaderCase", false);
        Character term48248 = new Character('t');
        Class<? extends Object> term48577 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term48576 = ((Class) term48577).getDeclaredField((String) "MINIMAL");
        ((Field) term48576).setAccessible(true);
        Object enum79 = ((Field) term48576).get((Object) null);
        Character term48252 = new Character('D');
        Character term48253 = new Character('I');
        term48247 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term48258 = (Object[]) newArray("java.lang.String", 5);
        Object[] term48269 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term48247, term48247.getClass(), "delimiter", 'G');
        setField(term48247, term48247.getClass(), "quoteCharacter", term48248);
        setField(term48247, term48247.getClass(), "quoteMode", enum79);
        setField(term48247, term48247.getClass(), "commentMarker", term48252);
        setField(term48247, term48247.getClass(), "escapeCharacter", term48253);
        setBooleanField(term48247, term48247.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term48247, term48247.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term48247, term48247.getClass(), "ignoreEmptyLines", true);
        setField(term48247, term48247.getClass(), "recordSeparator", "hCWPJQKpdc");
        setField(term48247, term48247.getClass(), "nullString", "WzMEhMXkKx");
        setElement(term48258, 0, "XOiDvlDhdc");
        setElement(term48258, 1, "AdxvLJhNLe");
        setElement(term48258, 2, "lHfTrWKMPk");
        setElement(term48258, 3, "JDaAnsVTGV");
        setElement(term48258, 4, "mLUZFTfjle");
        setField(term48247, term48247.getClass(), "header", term48258);
        setElement(term48269, 0, "xIeFjkHkOe");
        setElement(term48269, 1, "SdCKLMIYnX");
        setElement(term48269, 2, "OJJtVNPyKZ");
        setField(term48247, term48247.getClass(), "headerComments", term48269);
        setBooleanField(term48247, term48247.getClass(), "skipHeaderRecord", true);
        setBooleanField(term48247, term48247.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreHeaderCase", argTypes, term5301, args);
        assertTrue(recursiveEquals(term5301, term48247));
    }

};


