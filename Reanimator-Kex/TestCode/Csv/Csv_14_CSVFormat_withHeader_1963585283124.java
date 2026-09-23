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

public class CSVFormat_withHeader_1963585283124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21724;
     Object term86381;
     Object term86281;

    public CSVFormat_withHeader_1963585283124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term21726 = new Character('b');
        Character term21729 = new Character('Y');
        Character term21880 = new Character('c');
        Class<? extends Object> term86537 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term86536 = ((Class) term86537).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term86536).setAccessible(true);
        Object enum172 = ((Field) term86536).get((Object) null);
        term21724 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term21731 = (Object[]) newArray("java.lang.String", 6);
        Object[] term21804 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term21724, term21724.getClass(), "allowMissingColumnNames", false);
        setField(term21724, term21724.getClass(), "commentMarker", term21726);
        setCharField(term21724, term21724.getClass(), "delimiter", 'l');
        setField(term21724, term21724.getClass(), "escapeCharacter", term21729);
        setElement(term21731, 0, "BtvAvsJSei");
        setElement(term21731, 1, "vqnBkkxoIa");
        setElement(term21731, 2, "bycpZjxXFn");
        setElement(term21731, 3, "jQWttOAiwL");
        setElement(term21731, 4, "DzKFxEuEEC");
        setElement(term21731, 5, "CAMnvfDLJL");
        setField(term21724, term21724.getClass(), "header", term21731);
        setElement(term21804, 0, "mfHtgSbdjD");
        setElement(term21804, 1, "cmuaUiHMVL");
        setElement(term21804, 2, "xjoSGPWUgu");
        setElement(term21804, 3, "uzmqjnOUXu");
        setElement(term21804, 4, "xeyjTOCOJb");
        setField(term21724, term21724.getClass(), "headerComments", term21804);
        setBooleanField(term21724, term21724.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term21724, term21724.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term21724, term21724.getClass(), "ignoreSurroundingSpaces", true);
        setField(term21724, term21724.getClass(), "nullString", "DGRqjjdhzy");
        setField(term21724, term21724.getClass(), "quoteCharacter", term21880);
        setField(term21724, term21724.getClass(), "quoteMode", enum172);
        setField(term21724, term21724.getClass(), "recordSeparator", "lQFkjJUPAR");
        setBooleanField(term21724, term21724.getClass(), "skipHeaderRecord", true);
        setBooleanField(term21724, term21724.getClass(), "trailingDelimiter", false);
        setBooleanField(term21724, term21724.getClass(), "trim", true);
        Character term86382 = new Character('b');
        Character term86383 = new Character('Y');
        Character term86410 = new Character('c');
        Class<? extends Object> term86867 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term86866 = ((Class) term86867).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term86866).setAccessible(true);
        Object enum173 = ((Field) term86866).get((Object) null);
        term86381 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term86384 = (Object[]) newArray("java.lang.String", 6);
        Object[] term86397 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term86381, term86381.getClass(), "allowMissingColumnNames", false);
        setField(term86381, term86381.getClass(), "commentMarker", term86382);
        setCharField(term86381, term86381.getClass(), "delimiter", 'l');
        setField(term86381, term86381.getClass(), "escapeCharacter", term86383);
        setElement(term86384, 0, "BtvAvsJSei");
        setElement(term86384, 1, "vqnBkkxoIa");
        setElement(term86384, 2, "bycpZjxXFn");
        setElement(term86384, 3, "jQWttOAiwL");
        setElement(term86384, 4, "DzKFxEuEEC");
        setElement(term86384, 5, "CAMnvfDLJL");
        setField(term86381, term86381.getClass(), "header", term86384);
        setElement(term86397, 0, "mfHtgSbdjD");
        setElement(term86397, 1, "cmuaUiHMVL");
        setElement(term86397, 2, "xjoSGPWUgu");
        setElement(term86397, 3, "uzmqjnOUXu");
        setElement(term86397, 4, "xeyjTOCOJb");
        setField(term86381, term86381.getClass(), "headerComments", term86397);
        setBooleanField(term86381, term86381.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term86381, term86381.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term86381, term86381.getClass(), "ignoreSurroundingSpaces", true);
        setField(term86381, term86381.getClass(), "nullString", "DGRqjjdhzy");
        setField(term86381, term86381.getClass(), "quoteCharacter", term86410);
        setField(term86381, term86381.getClass(), "quoteMode", enum173);
        setField(term86381, term86381.getClass(), "recordSeparator", "lQFkjJUPAR");
        setBooleanField(term86381, term86381.getClass(), "skipHeaderRecord", true);
        setBooleanField(term86381, term86381.getClass(), "trailingDelimiter", false);
        setBooleanField(term86381, term86381.getClass(), "trim", true);
        Character term86283 = new Character('b');
        Character term86286 = new Character('Y');
        Character term86364 = new Character('c');
        Class<? extends Object> term87137 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term87136 = ((Class) term87137).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term87136).setAccessible(true);
        Object enum174 = ((Field) term87136).get((Object) null);
        term86281 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term86288 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term86281, term86281.getClass(), "allowMissingColumnNames", false);
        setField(term86281, term86281.getClass(), "commentMarker", term86283);
        setCharField(term86281, term86281.getClass(), "delimiter", 'l');
        setField(term86281, term86281.getClass(), "escapeCharacter", term86286);
        setField(term86281, term86281.getClass(), "header", null);
        setElement(term86288, 0, "mfHtgSbdjD");
        setElement(term86288, 1, "cmuaUiHMVL");
        setElement(term86288, 2, "xjoSGPWUgu");
        setElement(term86288, 3, "uzmqjnOUXu");
        setElement(term86288, 4, "xeyjTOCOJb");
        setField(term86281, term86281.getClass(), "headerComments", term86288);
        setBooleanField(term86281, term86281.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term86281, term86281.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term86281, term86281.getClass(), "ignoreSurroundingSpaces", true);
        setField(term86281, term86281.getClass(), "nullString", "DGRqjjdhzy");
        setField(term86281, term86281.getClass(), "quoteCharacter", term86364);
        setField(term86281, term86281.getClass(), "quoteMode", enum174);
        setField(term86281, term86281.getClass(), "recordSeparator", "lQFkjJUPAR");
        setBooleanField(term86281, term86281.getClass(), "skipHeaderRecord", true);
        setBooleanField(term86281, term86281.getClass(), "trailingDelimiter", false);
        setBooleanField(term86281, term86281.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.ResultSet");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withHeader", argTypes, term21724, args);
        assertTrue(recursiveEquals(term21724, term86381));
        assertTrue(recursiveEquals(retValue, term86281));
    }

};


