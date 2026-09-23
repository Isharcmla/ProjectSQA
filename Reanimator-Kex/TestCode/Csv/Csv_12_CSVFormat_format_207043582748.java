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

public class CSVFormat_format_207043582748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;
     Object term831;
     Object term20385;
     Object term20403;

    public CSVFormat_format_207043582748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term749 = new Character('l');
        Class<? extends Object> term20409 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term20408 = ((Class) term20409).getDeclaredField((String) "MINIMAL");
        ((Field) term20408).setAccessible(true);
        Object enum46 = ((Field) term20408).get((Object) null);
        Character term762 = new Character('J');
        Character term764 = new Character('A');
        term747 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term793 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term747, term747.getClass(), "delimiter", 'j');
        setField(term747, term747.getClass(), "quoteCharacter", term749);
        setField(term747, term747.getClass(), "quoteMode", enum46);
        setField(term747, term747.getClass(), "commentMarker", term762);
        setField(term747, term747.getClass(), "escapeCharacter", term764);
        setBooleanField(term747, term747.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term747, term747.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term747, term747.getClass(), "ignoreEmptyLines", false);
        setField(term747, term747.getClass(), "recordSeparator", "LQFpaHEwXR");
        setField(term747, term747.getClass(), "nullString", "oVcInYnLWB");
        setElement(term793, 0, "aJlieCFVtF");
        setElement(term793, 1, "ZiaGIbnzTs");
        setElement(term793, 2, "tbcdzjIfER");
        setField(term747, term747.getClass(), "header", term793);
        setBooleanField(term747, term747.getClass(), "skipHeaderRecord", true);
        term831 = (Object[]) newArray("java.lang.Object", 4);
        Object term832 = newInstance(Class.forName("java.lang.Object"));
        Object term833 = newInstance(Class.forName("java.lang.Object"));
        Object term834 = newInstance(Class.forName("java.lang.Object"));
        Object term835 = newInstance(Class.forName("java.lang.Object"));
        setElement(term831, 0, term832);
        setElement(term831, 1, term833);
        setElement(term831, 2, term834);
        setElement(term831, 3, term835);
        Character term20386 = new Character('l');
        Class<? extends Object> term20647 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term20646 = ((Class) term20647).getDeclaredField((String) "MINIMAL");
        ((Field) term20646).setAccessible(true);
        Object enum47 = ((Field) term20646).get((Object) null);
        Character term20390 = new Character('J');
        Character term20391 = new Character('A');
        term20385 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term20396 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term20385, term20385.getClass(), "delimiter", 'j');
        setField(term20385, term20385.getClass(), "quoteCharacter", term20386);
        setField(term20385, term20385.getClass(), "quoteMode", enum47);
        setField(term20385, term20385.getClass(), "commentMarker", term20390);
        setField(term20385, term20385.getClass(), "escapeCharacter", term20391);
        setBooleanField(term20385, term20385.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term20385, term20385.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term20385, term20385.getClass(), "ignoreEmptyLines", false);
        setField(term20385, term20385.getClass(), "recordSeparator", "LQFpaHEwXR");
        setField(term20385, term20385.getClass(), "nullString", "oVcInYnLWB");
        setElement(term20396, 0, "aJlieCFVtF");
        setElement(term20396, 1, "ZiaGIbnzTs");
        setElement(term20396, 2, "tbcdzjIfER");
        setField(term20385, term20385.getClass(), "header", term20396);
        setBooleanField(term20385, term20385.getClass(), "skipHeaderRecord", true);
        term20403 = (Object[]) newArray("java.lang.Object", 4);
        Object term20404 = newInstance(Class.forName("java.lang.Object"));
        Object term20405 = newInstance(Class.forName("java.lang.Object"));
        Object term20406 = newInstance(Class.forName("java.lang.Object"));
        Object term20407 = newInstance(Class.forName("java.lang.Object"));
        setElement(term20403, 0, term20404);
        setElement(term20403, 1, term20405);
        setElement(term20403, 2, term20406);
        setElement(term20403, 3, term20407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term831;
        Object retValue = callMethod(klass, "format", argTypes, term747, args);
        assertTrue(recursiveEquals(term747, term20385));
        assertTrue(recursiveEquals(term831, term20403));
        assertTrue(recursiveEquals(retValue, "laJllieCFVtFljZiaGIbnzTsjltbcdzjIfERlLQFpaHEwXRljava.llang.Object@78569746ljljava.llang.Object@432b7172ljljava.llang.Object@36859e59ljljava.llang.Object@27afc048lLQFpaHEwXR"));
    }

};


