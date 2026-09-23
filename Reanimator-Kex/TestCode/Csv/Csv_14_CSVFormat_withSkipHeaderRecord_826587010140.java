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

public class CSVFormat_withSkipHeaderRecord_826587010140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28912;
     Object term109216;
     Object term109139;

    public CSVFormat_withSkipHeaderRecord_826587010140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term28914 = new Character('y');
        Character term28917 = new Character('x');
        Character term28972 = new Character('B');
        Class<? extends Object> term109276 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term109275 = ((Class) term109276).getDeclaredField((String) "MINIMAL");
        ((Field) term109275).setAccessible(true);
        Object enum222 = ((Field) term109275).get((Object) null);
        term28912 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term28919 = (Object[]) newArray("java.lang.String", 0);
        Object[] term28920 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term28912, term28912.getClass(), "allowMissingColumnNames", true);
        setField(term28912, term28912.getClass(), "commentMarker", term28914);
        setCharField(term28912, term28912.getClass(), "delimiter", 'Y');
        setField(term28912, term28912.getClass(), "escapeCharacter", term28917);
        setField(term28912, term28912.getClass(), "header", term28919);
        setElement(term28920, 0, "blSffTnsOv");
        setElement(term28920, 1, "qbUMcIvEXH");
        setElement(term28920, 2, "TVxGTjeDcu");
        setField(term28912, term28912.getClass(), "headerComments", term28920);
        setBooleanField(term28912, term28912.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term28912, term28912.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term28912, term28912.getClass(), "ignoreSurroundingSpaces", false);
        setField(term28912, term28912.getClass(), "nullString", "ABPtcyCzkR");
        setField(term28912, term28912.getClass(), "quoteCharacter", term28972);
        setField(term28912, term28912.getClass(), "quoteMode", enum222);
        setField(term28912, term28912.getClass(), "recordSeparator", "QgHhxMyKvr");
        setBooleanField(term28912, term28912.getClass(), "skipHeaderRecord", true);
        setBooleanField(term28912, term28912.getClass(), "trailingDelimiter", false);
        setBooleanField(term28912, term28912.getClass(), "trim", false);
        Character term109217 = new Character('y');
        Character term109218 = new Character('x');
        Character term109229 = new Character('B');
        Class<? extends Object> term109514 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term109513 = ((Class) term109514).getDeclaredField((String) "MINIMAL");
        ((Field) term109513).setAccessible(true);
        Object enum223 = ((Field) term109513).get((Object) null);
        term109216 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term109219 = (Object[]) newArray("java.lang.String", 0);
        Object[] term109220 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term109216, term109216.getClass(), "allowMissingColumnNames", true);
        setField(term109216, term109216.getClass(), "commentMarker", term109217);
        setCharField(term109216, term109216.getClass(), "delimiter", 'Y');
        setField(term109216, term109216.getClass(), "escapeCharacter", term109218);
        setField(term109216, term109216.getClass(), "header", term109219);
        setElement(term109220, 0, "blSffTnsOv");
        setElement(term109220, 1, "qbUMcIvEXH");
        setElement(term109220, 2, "TVxGTjeDcu");
        setField(term109216, term109216.getClass(), "headerComments", term109220);
        setBooleanField(term109216, term109216.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term109216, term109216.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term109216, term109216.getClass(), "ignoreSurroundingSpaces", false);
        setField(term109216, term109216.getClass(), "nullString", "ABPtcyCzkR");
        setField(term109216, term109216.getClass(), "quoteCharacter", term109229);
        setField(term109216, term109216.getClass(), "quoteMode", enum223);
        setField(term109216, term109216.getClass(), "recordSeparator", "QgHhxMyKvr");
        setBooleanField(term109216, term109216.getClass(), "skipHeaderRecord", true);
        setBooleanField(term109216, term109216.getClass(), "trailingDelimiter", false);
        setBooleanField(term109216, term109216.getClass(), "trim", false);
        Character term109141 = new Character('y');
        Character term109144 = new Character('x');
        Character term109199 = new Character('B');
        Class<? extends Object> term109752 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term109751 = ((Class) term109752).getDeclaredField((String) "MINIMAL");
        ((Field) term109751).setAccessible(true);
        Object enum224 = ((Field) term109751).get((Object) null);
        term109139 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term109146 = (Object[]) newArray("java.lang.String", 0);
        Object[] term109147 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term109139, term109139.getClass(), "allowMissingColumnNames", true);
        setField(term109139, term109139.getClass(), "commentMarker", term109141);
        setCharField(term109139, term109139.getClass(), "delimiter", 'Y');
        setField(term109139, term109139.getClass(), "escapeCharacter", term109144);
        setField(term109139, term109139.getClass(), "header", term109146);
        setElement(term109147, 0, "blSffTnsOv");
        setElement(term109147, 1, "qbUMcIvEXH");
        setElement(term109147, 2, "TVxGTjeDcu");
        setField(term109139, term109139.getClass(), "headerComments", term109147);
        setBooleanField(term109139, term109139.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term109139, term109139.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term109139, term109139.getClass(), "ignoreSurroundingSpaces", false);
        setField(term109139, term109139.getClass(), "nullString", "ABPtcyCzkR");
        setField(term109139, term109139.getClass(), "quoteCharacter", term109199);
        setField(term109139, term109139.getClass(), "quoteMode", enum224);
        setField(term109139, term109139.getClass(), "recordSeparator", "QgHhxMyKvr");
        setBooleanField(term109139, term109139.getClass(), "skipHeaderRecord", true);
        setBooleanField(term109139, term109139.getClass(), "trailingDelimiter", false);
        setBooleanField(term109139, term109139.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withSkipHeaderRecord", argTypes, term28912, args);
        assertTrue(recursiveEquals(term28912, term109216));
        assertTrue(recursiveEquals(retValue, term109139));
    }

};


