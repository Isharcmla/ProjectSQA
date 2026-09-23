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

public class CSVFormat_getIgnoreEmptyLines_163482803070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4291;
     Object term46578;

    public CSVFormat_getIgnoreEmptyLines_163482803070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4293 = new Character('p');
        Class<? extends Object> term46616 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46615 = ((Class) term46616).getDeclaredField((String) "MINIMAL");
        ((Field) term46615).setAccessible(true);
        Object enum74 = ((Field) term46615).get((Object) null);
        Character term4306 = new Character('V');
        Character term4308 = new Character('m');
        term4291 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4337 = (Object[]) newArray("java.lang.String", 9);
        Object[] term4446 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term4291, term4291.getClass(), "delimiter", 'Z');
        setField(term4291, term4291.getClass(), "quoteCharacter", term4293);
        setField(term4291, term4291.getClass(), "quoteMode", enum74);
        setField(term4291, term4291.getClass(), "commentMarker", term4306);
        setField(term4291, term4291.getClass(), "escapeCharacter", term4308);
        setBooleanField(term4291, term4291.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term4291, term4291.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term4291, term4291.getClass(), "ignoreEmptyLines", true);
        setField(term4291, term4291.getClass(), "recordSeparator", "jiKYgYHqIS");
        setField(term4291, term4291.getClass(), "nullString", "DfISiziTgG");
        setElement(term4337, 0, "XqgfKFvPSD");
        setElement(term4337, 1, "JiVRgTZvKc");
        setElement(term4337, 2, "XPKmummaqg");
        setElement(term4337, 3, "BKLfkLiZTH");
        setElement(term4337, 4, "SPpkrGcPRr");
        setElement(term4337, 5, "sEccwbJKYE");
        setElement(term4337, 6, "AWRooQKkdW");
        setElement(term4337, 7, "vjxIhXHxGR");
        setElement(term4337, 8, "QXzGXbEXMu");
        setField(term4291, term4291.getClass(), "header", term4337);
        setElement(term4446, 0, "qxSDVejjiY");
        setElement(term4446, 1, "xBsXSDjXYK");
        setElement(term4446, 2, "sEnIVFtZuQ");
        setField(term4291, term4291.getClass(), "headerComments", term4446);
        setBooleanField(term4291, term4291.getClass(), "skipHeaderRecord", false);
        setBooleanField(term4291, term4291.getClass(), "ignoreHeaderCase", true);
        Character term46579 = new Character('p');
        Class<? extends Object> term46944 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46943 = ((Class) term46944).getDeclaredField((String) "MINIMAL");
        ((Field) term46943).setAccessible(true);
        Object enum75 = ((Field) term46943).get((Object) null);
        Character term46583 = new Character('V');
        Character term46584 = new Character('m');
        term46578 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term46589 = (Object[]) newArray("java.lang.String", 9);
        Object[] term46608 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term46578, term46578.getClass(), "delimiter", 'Z');
        setField(term46578, term46578.getClass(), "quoteCharacter", term46579);
        setField(term46578, term46578.getClass(), "quoteMode", enum75);
        setField(term46578, term46578.getClass(), "commentMarker", term46583);
        setField(term46578, term46578.getClass(), "escapeCharacter", term46584);
        setBooleanField(term46578, term46578.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term46578, term46578.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term46578, term46578.getClass(), "ignoreEmptyLines", true);
        setField(term46578, term46578.getClass(), "recordSeparator", "jiKYgYHqIS");
        setField(term46578, term46578.getClass(), "nullString", "DfISiziTgG");
        setElement(term46589, 0, "XqgfKFvPSD");
        setElement(term46589, 1, "JiVRgTZvKc");
        setElement(term46589, 2, "XPKmummaqg");
        setElement(term46589, 3, "BKLfkLiZTH");
        setElement(term46589, 4, "SPpkrGcPRr");
        setElement(term46589, 5, "sEccwbJKYE");
        setElement(term46589, 6, "AWRooQKkdW");
        setElement(term46589, 7, "vjxIhXHxGR");
        setElement(term46589, 8, "QXzGXbEXMu");
        setField(term46578, term46578.getClass(), "header", term46589);
        setElement(term46608, 0, "qxSDVejjiY");
        setElement(term46608, 1, "xBsXSDjXYK");
        setElement(term46608, 2, "sEnIVFtZuQ");
        setField(term46578, term46578.getClass(), "headerComments", term46608);
        setBooleanField(term46578, term46578.getClass(), "skipHeaderRecord", false);
        setBooleanField(term46578, term46578.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreEmptyLines", argTypes, term4291, args);
        assertTrue(recursiveEquals(term4291, term46578));
    }

};


