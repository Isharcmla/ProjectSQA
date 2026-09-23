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
import java.lang.Boolean;

public class CSVFormat_withAllowMissingColumnNames_755014320116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17952;
     Object term18084;
     Object term73393;
     Object term72984;

    public CSVFormat_withAllowMissingColumnNames_755014320116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term17954 = new Character('F');
        Character term17957 = new Character('i');
        Character term18060 = new Character('a');
        Class<? extends Object> term73501 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term73500 = ((Class) term73501).getDeclaredField((String) "ALL");
        ((Field) term73500).setAccessible(true);
        Object enum148 = ((Field) term73500).get((Object) null);
        term17952 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term17959 = (Object[]) newArray("java.lang.String", 1);
        Object[] term17972 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term17952, term17952.getClass(), "allowMissingColumnNames", false);
        setField(term17952, term17952.getClass(), "commentMarker", term17954);
        setCharField(term17952, term17952.getClass(), "delimiter", 'Z');
        setField(term17952, term17952.getClass(), "escapeCharacter", term17957);
        setElement(term17959, 0, "qYtAeLzOhW");
        setField(term17952, term17952.getClass(), "header", term17959);
        setElement(term17972, 0, "tJzmOfcUnY");
        setElement(term17972, 1, "TKlccZUpjz");
        setElement(term17972, 2, "GGzwMoHZXC");
        setElement(term17972, 3, "IpmgwHTgnG");
        setElement(term17972, 4, "tIpkeYIezR");
        setElement(term17972, 5, "YkZtEtthvz");
        setField(term17952, term17952.getClass(), "headerComments", term17972);
        setBooleanField(term17952, term17952.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term17952, term17952.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term17952, term17952.getClass(), "ignoreSurroundingSpaces", false);
        setField(term17952, term17952.getClass(), "nullString", "dwlZSxlXOo");
        setField(term17952, term17952.getClass(), "quoteCharacter", term18060);
        setField(term17952, term17952.getClass(), "quoteMode", enum148);
        setField(term17952, term17952.getClass(), "recordSeparator", "lKrEAkypza");
        setBooleanField(term17952, term17952.getClass(), "skipHeaderRecord", true);
        setBooleanField(term17952, term17952.getClass(), "trailingDelimiter", true);
        setBooleanField(term17952, term17952.getClass(), "trim", false);
        term18084 = new Boolean(true);
        Character term73394 = new Character('F');
        Character term73395 = new Character('i');
        Character term73414 = new Character('a');
        Class<? extends Object> term73767 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term73766 = ((Class) term73767).getDeclaredField((String) "ALL");
        ((Field) term73766).setAccessible(true);
        Object enum149 = ((Field) term73766).get((Object) null);
        term73393 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term73396 = (Object[]) newArray("java.lang.String", 1);
        Object[] term73399 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term73393, term73393.getClass(), "allowMissingColumnNames", false);
        setField(term73393, term73393.getClass(), "commentMarker", term73394);
        setCharField(term73393, term73393.getClass(), "delimiter", 'Z');
        setField(term73393, term73393.getClass(), "escapeCharacter", term73395);
        setElement(term73396, 0, "qYtAeLzOhW");
        setField(term73393, term73393.getClass(), "header", term73396);
        setElement(term73399, 0, "tJzmOfcUnY");
        setElement(term73399, 1, "TKlccZUpjz");
        setElement(term73399, 2, "GGzwMoHZXC");
        setElement(term73399, 3, "IpmgwHTgnG");
        setElement(term73399, 4, "tIpkeYIezR");
        setElement(term73399, 5, "YkZtEtthvz");
        setField(term73393, term73393.getClass(), "headerComments", term73399);
        setBooleanField(term73393, term73393.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term73393, term73393.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term73393, term73393.getClass(), "ignoreSurroundingSpaces", false);
        setField(term73393, term73393.getClass(), "nullString", "dwlZSxlXOo");
        setField(term73393, term73393.getClass(), "quoteCharacter", term73414);
        setField(term73393, term73393.getClass(), "quoteMode", enum149);
        setField(term73393, term73393.getClass(), "recordSeparator", "lKrEAkypza");
        setBooleanField(term73393, term73393.getClass(), "skipHeaderRecord", true);
        setBooleanField(term73393, term73393.getClass(), "trailingDelimiter", true);
        setBooleanField(term73393, term73393.getClass(), "trim", false);
        Character term72986 = new Character('F');
        Character term72989 = new Character('i');
        Character term73092 = new Character('a');
        Class<? extends Object> term74033 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term74032 = ((Class) term74033).getDeclaredField((String) "ALL");
        ((Field) term74032).setAccessible(true);
        Object enum150 = ((Field) term74032).get((Object) null);
        term72984 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term72991 = (Object[]) newArray("java.lang.String", 1);
        Object[] term73004 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term72984, term72984.getClass(), "allowMissingColumnNames", true);
        setField(term72984, term72984.getClass(), "commentMarker", term72986);
        setCharField(term72984, term72984.getClass(), "delimiter", 'Z');
        setField(term72984, term72984.getClass(), "escapeCharacter", term72989);
        setElement(term72991, 0, "qYtAeLzOhW");
        setField(term72984, term72984.getClass(), "header", term72991);
        setElement(term73004, 0, "tJzmOfcUnY");
        setElement(term73004, 1, "TKlccZUpjz");
        setElement(term73004, 2, "GGzwMoHZXC");
        setElement(term73004, 3, "IpmgwHTgnG");
        setElement(term73004, 4, "tIpkeYIezR");
        setElement(term73004, 5, "YkZtEtthvz");
        setField(term72984, term72984.getClass(), "headerComments", term73004);
        setBooleanField(term72984, term72984.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term72984, term72984.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term72984, term72984.getClass(), "ignoreSurroundingSpaces", false);
        setField(term72984, term72984.getClass(), "nullString", "dwlZSxlXOo");
        setField(term72984, term72984.getClass(), "quoteCharacter", term73092);
        setField(term72984, term72984.getClass(), "quoteMode", enum150);
        setField(term72984, term72984.getClass(), "recordSeparator", "lKrEAkypza");
        setBooleanField(term72984, term72984.getClass(), "skipHeaderRecord", true);
        setBooleanField(term72984, term72984.getClass(), "trailingDelimiter", true);
        setBooleanField(term72984, term72984.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term18084;
        Object retValue = callMethod(klass, "withAllowMissingColumnNames", argTypes, term17952, args);
        assertTrue(recursiveEquals(term17952, term73393));
        assertTrue(recursiveEquals(term18084, true));
        assertTrue(recursiveEquals(retValue, term72984));
    }

};


