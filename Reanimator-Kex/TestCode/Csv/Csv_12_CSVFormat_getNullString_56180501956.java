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

public class CSVFormat_getNullString_56180501956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3540;
     Object term25698;

    public CSVFormat_getNullString_56180501956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3542 = new Character('p');
        Class<? extends Object> term25721 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term25720 = ((Class) term25721).getDeclaredField((String) "MINIMAL");
        ((Field) term25720).setAccessible(true);
        Object enum62 = ((Field) term25720).get((Object) null);
        Character term3555 = new Character('V');
        Character term3557 = new Character('m');
        term3540 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3586 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term3540, term3540.getClass(), "delimiter", 'Z');
        setField(term3540, term3540.getClass(), "quoteCharacter", term3542);
        setField(term3540, term3540.getClass(), "quoteMode", enum62);
        setField(term3540, term3540.getClass(), "commentMarker", term3555);
        setField(term3540, term3540.getClass(), "escapeCharacter", term3557);
        setBooleanField(term3540, term3540.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term3540, term3540.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term3540, term3540.getClass(), "ignoreEmptyLines", true);
        setField(term3540, term3540.getClass(), "recordSeparator", "dEnhdmILtU");
        setField(term3540, term3540.getClass(), "nullString", "hoicvmsovO");
        setElement(term3586, 0, "eqJfYWRaEL");
        setElement(term3586, 1, "fhkbdRViHi");
        setElement(term3586, 2, "uWHnvSvaPl");
        setElement(term3586, 3, "kBdSllIBVz");
        setElement(term3586, 4, "TJmVBGfTML");
        setField(term3540, term3540.getClass(), "header", term3586);
        setBooleanField(term3540, term3540.getClass(), "skipHeaderRecord", true);
        Character term25699 = new Character('p');
        Class<? extends Object> term25981 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term25980 = ((Class) term25981).getDeclaredField((String) "MINIMAL");
        ((Field) term25980).setAccessible(true);
        Object enum63 = ((Field) term25980).get((Object) null);
        Character term25703 = new Character('V');
        Character term25704 = new Character('m');
        term25698 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term25709 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term25698, term25698.getClass(), "delimiter", 'Z');
        setField(term25698, term25698.getClass(), "quoteCharacter", term25699);
        setField(term25698, term25698.getClass(), "quoteMode", enum63);
        setField(term25698, term25698.getClass(), "commentMarker", term25703);
        setField(term25698, term25698.getClass(), "escapeCharacter", term25704);
        setBooleanField(term25698, term25698.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term25698, term25698.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term25698, term25698.getClass(), "ignoreEmptyLines", true);
        setField(term25698, term25698.getClass(), "recordSeparator", "dEnhdmILtU");
        setField(term25698, term25698.getClass(), "nullString", "hoicvmsovO");
        setElement(term25709, 0, "eqJfYWRaEL");
        setElement(term25709, 1, "fhkbdRViHi");
        setElement(term25709, 2, "uWHnvSvaPl");
        setElement(term25709, 3, "kBdSllIBVz");
        setElement(term25709, 4, "TJmVBGfTML");
        setField(term25698, term25698.getClass(), "header", term25709);
        setBooleanField(term25698, term25698.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNullString", argTypes, term3540, args);
        assertTrue(recursiveEquals(term3540, term25698));
        assertTrue(recursiveEquals(retValue, "hoicvmsovO"));
    }

};


