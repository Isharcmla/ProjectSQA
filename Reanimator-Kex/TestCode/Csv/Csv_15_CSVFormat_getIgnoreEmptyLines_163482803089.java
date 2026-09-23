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

public class CSVFormat_getIgnoreEmptyLines_163482803089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3888;
     Object term47244;

    public CSVFormat_getIgnoreEmptyLines_163482803089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3890 = new Character('s');
        Character term3893 = new Character('J');
        Character term4008 = new Character('C');
        Class<? extends Object> term47364 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term47363 = ((Class) term47364).getDeclaredField((String) "MINIMAL");
        ((Field) term47363).setAccessible(true);
        Object enum93 = ((Field) term47363).get((Object) null);
        term3888 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3895 = (Object[]) newArray("java.lang.String", 6);
        Object[] term3968 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term3888, term3888.getClass(), "allowMissingColumnNames", false);
        setField(term3888, term3888.getClass(), "commentMarker", term3890);
        setCharField(term3888, term3888.getClass(), "delimiter", 'j');
        setField(term3888, term3888.getClass(), "escapeCharacter", term3893);
        setElement(term3895, 0, "bWWfajKbEX");
        setElement(term3895, 1, "cAPeiZHKGJ");
        setElement(term3895, 2, "LvJFtLBaxj");
        setElement(term3895, 3, "PHvxnGHptP");
        setElement(term3895, 4, "TimdotUuNC");
        setElement(term3895, 5, "PkWMRdJcBb");
        setField(term3888, term3888.getClass(), "header", term3895);
        setElement(term3968, 0, "jSpAteRute");
        setElement(term3968, 1, "swZVeJAxjt");
        setField(term3888, term3888.getClass(), "headerComments", term3968);
        setBooleanField(term3888, term3888.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term3888, term3888.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term3888, term3888.getClass(), "ignoreSurroundingSpaces", false);
        setField(term3888, term3888.getClass(), "nullString", "xOcJIiQQDu");
        setField(term3888, term3888.getClass(), "quoteCharacter", term4008);
        setField(term3888, term3888.getClass(), "quoteMode", enum93);
        setField(term3888, term3888.getClass(), "recordSeparator", "GVizqqzXpy");
        setBooleanField(term3888, term3888.getClass(), "skipHeaderRecord", true);
        setBooleanField(term3888, term3888.getClass(), "trailingDelimiter", false);
        setBooleanField(term3888, term3888.getClass(), "trim", false);
        setBooleanField(term3888, term3888.getClass(), "autoFlush", true);
        Character term47245 = new Character('s');
        Character term47246 = new Character('J');
        Character term47267 = new Character('C');
        Class<? extends Object> term47652 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term47651 = ((Class) term47652).getDeclaredField((String) "MINIMAL");
        ((Field) term47651).setAccessible(true);
        Object enum94 = ((Field) term47651).get((Object) null);
        term47244 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term47247 = (Object[]) newArray("java.lang.String", 6);
        Object[] term47260 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term47244, term47244.getClass(), "allowMissingColumnNames", false);
        setField(term47244, term47244.getClass(), "commentMarker", term47245);
        setCharField(term47244, term47244.getClass(), "delimiter", 'j');
        setField(term47244, term47244.getClass(), "escapeCharacter", term47246);
        setElement(term47247, 0, "bWWfajKbEX");
        setElement(term47247, 1, "cAPeiZHKGJ");
        setElement(term47247, 2, "LvJFtLBaxj");
        setElement(term47247, 3, "PHvxnGHptP");
        setElement(term47247, 4, "TimdotUuNC");
        setElement(term47247, 5, "PkWMRdJcBb");
        setField(term47244, term47244.getClass(), "header", term47247);
        setElement(term47260, 0, "jSpAteRute");
        setElement(term47260, 1, "swZVeJAxjt");
        setField(term47244, term47244.getClass(), "headerComments", term47260);
        setBooleanField(term47244, term47244.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term47244, term47244.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term47244, term47244.getClass(), "ignoreSurroundingSpaces", false);
        setField(term47244, term47244.getClass(), "nullString", "xOcJIiQQDu");
        setField(term47244, term47244.getClass(), "quoteCharacter", term47267);
        setField(term47244, term47244.getClass(), "quoteMode", enum94);
        setField(term47244, term47244.getClass(), "recordSeparator", "GVizqqzXpy");
        setBooleanField(term47244, term47244.getClass(), "skipHeaderRecord", true);
        setBooleanField(term47244, term47244.getClass(), "trailingDelimiter", false);
        setBooleanField(term47244, term47244.getClass(), "trim", false);
        setBooleanField(term47244, term47244.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreEmptyLines", argTypes, term3888, args);
        assertTrue(recursiveEquals(term3888, term47244));
    }

};


