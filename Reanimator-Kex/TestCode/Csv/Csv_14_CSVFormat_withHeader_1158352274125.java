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

public class CSVFormat_withHeader_1158352274125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22242;
     Object term87833;
     Object term87745;

    public CSVFormat_withHeader_1158352274125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term22244 = new Character('h');
        Character term22247 = new Character('x');
        Character term22350 = new Character('W');
        Class<? extends Object> term87941 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term87940 = ((Class) term87941).getDeclaredField((String) "ALL");
        ((Field) term87940).setAccessible(true);
        Object enum175 = ((Field) term87940).get((Object) null);
        term22242 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term22249 = (Object[]) newArray("java.lang.String", 3);
        Object[] term22286 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term22242, term22242.getClass(), "allowMissingColumnNames", false);
        setField(term22242, term22242.getClass(), "commentMarker", term22244);
        setCharField(term22242, term22242.getClass(), "delimiter", 'N');
        setField(term22242, term22242.getClass(), "escapeCharacter", term22247);
        setElement(term22249, 0, "BsuVlGUUjV");
        setElement(term22249, 1, "bHHjfDCntT");
        setElement(term22249, 2, "sEphiduvkv");
        setField(term22242, term22242.getClass(), "header", term22249);
        setElement(term22286, 0, "PbLgCSAHce");
        setElement(term22286, 1, "NWldOLAbqk");
        setElement(term22286, 2, "qnYaYSpDwO");
        setElement(term22286, 3, "dgbFDCdHtj");
        setField(term22242, term22242.getClass(), "headerComments", term22286);
        setBooleanField(term22242, term22242.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term22242, term22242.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term22242, term22242.getClass(), "ignoreSurroundingSpaces", true);
        setField(term22242, term22242.getClass(), "nullString", "EKpdCBubDE");
        setField(term22242, term22242.getClass(), "quoteCharacter", term22350);
        setField(term22242, term22242.getClass(), "quoteMode", enum175);
        setField(term22242, term22242.getClass(), "recordSeparator", "zMsSLTfGhl");
        setBooleanField(term22242, term22242.getClass(), "skipHeaderRecord", true);
        setBooleanField(term22242, term22242.getClass(), "trailingDelimiter", false);
        setBooleanField(term22242, term22242.getClass(), "trim", true);
        Character term87834 = new Character('h');
        Character term87835 = new Character('x');
        Character term87854 = new Character('W');
        Class<? extends Object> term88207 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term88206 = ((Class) term88207).getDeclaredField((String) "ALL");
        ((Field) term88206).setAccessible(true);
        Object enum176 = ((Field) term88206).get((Object) null);
        term87833 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term87836 = (Object[]) newArray("java.lang.String", 3);
        Object[] term87843 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term87833, term87833.getClass(), "allowMissingColumnNames", false);
        setField(term87833, term87833.getClass(), "commentMarker", term87834);
        setCharField(term87833, term87833.getClass(), "delimiter", 'N');
        setField(term87833, term87833.getClass(), "escapeCharacter", term87835);
        setElement(term87836, 0, "BsuVlGUUjV");
        setElement(term87836, 1, "bHHjfDCntT");
        setElement(term87836, 2, "sEphiduvkv");
        setField(term87833, term87833.getClass(), "header", term87836);
        setElement(term87843, 0, "PbLgCSAHce");
        setElement(term87843, 1, "NWldOLAbqk");
        setElement(term87843, 2, "qnYaYSpDwO");
        setElement(term87843, 3, "dgbFDCdHtj");
        setField(term87833, term87833.getClass(), "headerComments", term87843);
        setBooleanField(term87833, term87833.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term87833, term87833.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term87833, term87833.getClass(), "ignoreSurroundingSpaces", true);
        setField(term87833, term87833.getClass(), "nullString", "EKpdCBubDE");
        setField(term87833, term87833.getClass(), "quoteCharacter", term87854);
        setField(term87833, term87833.getClass(), "quoteMode", enum176);
        setField(term87833, term87833.getClass(), "recordSeparator", "zMsSLTfGhl");
        setBooleanField(term87833, term87833.getClass(), "skipHeaderRecord", true);
        setBooleanField(term87833, term87833.getClass(), "trailingDelimiter", false);
        setBooleanField(term87833, term87833.getClass(), "trim", true);
        Character term87747 = new Character('h');
        Character term87750 = new Character('x');
        Character term87816 = new Character('W');
        Class<? extends Object> term88443 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term88442 = ((Class) term88443).getDeclaredField((String) "ALL");
        ((Field) term88442).setAccessible(true);
        Object enum177 = ((Field) term88442).get((Object) null);
        term87745 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term87752 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term87745, term87745.getClass(), "allowMissingColumnNames", false);
        setField(term87745, term87745.getClass(), "commentMarker", term87747);
        setCharField(term87745, term87745.getClass(), "delimiter", 'N');
        setField(term87745, term87745.getClass(), "escapeCharacter", term87750);
        setField(term87745, term87745.getClass(), "header", null);
        setElement(term87752, 0, "PbLgCSAHce");
        setElement(term87752, 1, "NWldOLAbqk");
        setElement(term87752, 2, "qnYaYSpDwO");
        setElement(term87752, 3, "dgbFDCdHtj");
        setField(term87745, term87745.getClass(), "headerComments", term87752);
        setBooleanField(term87745, term87745.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term87745, term87745.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term87745, term87745.getClass(), "ignoreSurroundingSpaces", true);
        setField(term87745, term87745.getClass(), "nullString", "EKpdCBubDE");
        setField(term87745, term87745.getClass(), "quoteCharacter", term87816);
        setField(term87745, term87745.getClass(), "quoteMode", enum177);
        setField(term87745, term87745.getClass(), "recordSeparator", "zMsSLTfGhl");
        setBooleanField(term87745, term87745.getClass(), "skipHeaderRecord", true);
        setBooleanField(term87745, term87745.getClass(), "trailingDelimiter", false);
        setBooleanField(term87745, term87745.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.ResultSetMetaData");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withHeader", argTypes, term22242, args);
        assertTrue(recursiveEquals(term22242, term87833));
        assertTrue(recursiveEquals(retValue, term87745));
    }

};


