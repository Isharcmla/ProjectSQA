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

public class CSVFormat_getIgnoreEmptyLines_163482803086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3838;
     Object term45982;

    public CSVFormat_getIgnoreEmptyLines_163482803086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3840 = new Character('s');
        Character term3843 = new Character('J');
        Character term3958 = new Character('C');
        Class<? extends Object> term46102 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46101 = ((Class) term46102).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term46101).setAccessible(true);
        Object enum90 = ((Field) term46101).get((Object) null);
        term3838 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3845 = (Object[]) newArray("java.lang.String", 6);
        Object[] term3918 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term3838, term3838.getClass(), "allowMissingColumnNames", true);
        setField(term3838, term3838.getClass(), "commentMarker", term3840);
        setCharField(term3838, term3838.getClass(), "delimiter", 'j');
        setField(term3838, term3838.getClass(), "escapeCharacter", term3843);
        setElement(term3845, 0, "bWWfajKbEX");
        setElement(term3845, 1, "cAPeiZHKGJ");
        setElement(term3845, 2, "LvJFtLBaxj");
        setElement(term3845, 3, "PHvxnGHptP");
        setElement(term3845, 4, "TimdotUuNC");
        setElement(term3845, 5, "PkWMRdJcBb");
        setField(term3838, term3838.getClass(), "header", term3845);
        setElement(term3918, 0, "jSpAteRute");
        setElement(term3918, 1, "swZVeJAxjt");
        setField(term3838, term3838.getClass(), "headerComments", term3918);
        setBooleanField(term3838, term3838.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term3838, term3838.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term3838, term3838.getClass(), "ignoreSurroundingSpaces", true);
        setField(term3838, term3838.getClass(), "nullString", "xOcJIiQQDu");
        setField(term3838, term3838.getClass(), "quoteCharacter", term3958);
        setField(term3838, term3838.getClass(), "quoteMode", enum90);
        setField(term3838, term3838.getClass(), "recordSeparator", "GVizqqzXpy");
        setBooleanField(term3838, term3838.getClass(), "skipHeaderRecord", true);
        setBooleanField(term3838, term3838.getClass(), "trailingDelimiter", true);
        setBooleanField(term3838, term3838.getClass(), "trim", false);
        Character term45983 = new Character('s');
        Character term45984 = new Character('J');
        Character term46005 = new Character('C');
        Class<? extends Object> term46402 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46401 = ((Class) term46402).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term46401).setAccessible(true);
        Object enum91 = ((Field) term46401).get((Object) null);
        term45982 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term45985 = (Object[]) newArray("java.lang.String", 6);
        Object[] term45998 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term45982, term45982.getClass(), "allowMissingColumnNames", true);
        setField(term45982, term45982.getClass(), "commentMarker", term45983);
        setCharField(term45982, term45982.getClass(), "delimiter", 'j');
        setField(term45982, term45982.getClass(), "escapeCharacter", term45984);
        setElement(term45985, 0, "bWWfajKbEX");
        setElement(term45985, 1, "cAPeiZHKGJ");
        setElement(term45985, 2, "LvJFtLBaxj");
        setElement(term45985, 3, "PHvxnGHptP");
        setElement(term45985, 4, "TimdotUuNC");
        setElement(term45985, 5, "PkWMRdJcBb");
        setField(term45982, term45982.getClass(), "header", term45985);
        setElement(term45998, 0, "jSpAteRute");
        setElement(term45998, 1, "swZVeJAxjt");
        setField(term45982, term45982.getClass(), "headerComments", term45998);
        setBooleanField(term45982, term45982.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term45982, term45982.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term45982, term45982.getClass(), "ignoreSurroundingSpaces", true);
        setField(term45982, term45982.getClass(), "nullString", "xOcJIiQQDu");
        setField(term45982, term45982.getClass(), "quoteCharacter", term46005);
        setField(term45982, term45982.getClass(), "quoteMode", enum91);
        setField(term45982, term45982.getClass(), "recordSeparator", "GVizqqzXpy");
        setBooleanField(term45982, term45982.getClass(), "skipHeaderRecord", true);
        setBooleanField(term45982, term45982.getClass(), "trailingDelimiter", true);
        setBooleanField(term45982, term45982.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreEmptyLines", argTypes, term3838, args);
        assertTrue(recursiveEquals(term3838, term45982));
    }

};


