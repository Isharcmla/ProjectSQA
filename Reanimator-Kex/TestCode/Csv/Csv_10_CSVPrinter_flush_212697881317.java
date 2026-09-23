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
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_flush_212697881317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696;
     Object term6083;

    public CSVPrinter_flush_212697881317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term699 = new Character('D');
        Class<? extends Object> term6103 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term6102 = ((Class) term6103).getDeclaredField((String) "MINIMAL");
        ((Field) term6102).setAccessible(true);
        Object enum18 = ((Field) term6102).get((Object) null);
        Character term712 = new Character('s');
        Character term714 = new Character('j');
        term696 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term697 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term742 = (Object[]) newArray("java.lang.String", 3);
        setField(term696, term696.getClass(), "out", null);
        setCharField(term697, term697.getClass(), "delimiter", 'T');
        setField(term697, term697.getClass(), "quoteChar", term699);
        setField(term697, term697.getClass(), "quotePolicy", enum18);
        setField(term697, term697.getClass(), "commentStart", term712);
        setField(term697, term697.getClass(), "escape", term714);
        setBooleanField(term697, term697.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term697, term697.getClass(), "ignoreEmptyLines", false);
        setField(term697, term697.getClass(), "recordSeparator", "LQFpaHEwXR");
        setField(term697, term697.getClass(), "nullString", "oVcInYnLWB");
        setElement(term742, 0, "aJlieCFVtF");
        setElement(term742, 1, "ZiaGIbnzTs");
        setElement(term742, 2, "tbcdzjIfER");
        setField(term697, term697.getClass(), "header", term742);
        setBooleanField(term697, term697.getClass(), "skipHeaderRecord", true);
        setField(term696, term696.getClass(), "format", term697);
        setBooleanField(term696, term696.getClass(), "newRecord", false);
        Character term6085 = new Character('D');
        Class<? extends Object> term6321 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term6320 = ((Class) term6321).getDeclaredField((String) "MINIMAL");
        ((Field) term6320).setAccessible(true);
        Object enum19 = ((Field) term6320).get((Object) null);
        Character term6089 = new Character('s');
        Character term6090 = new Character('j');
        term6083 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term6084 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6095 = (Object[]) newArray("java.lang.String", 3);
        setField(term6083, term6083.getClass(), "out", null);
        setCharField(term6084, term6084.getClass(), "delimiter", 'T');
        setField(term6084, term6084.getClass(), "quoteChar", term6085);
        setField(term6084, term6084.getClass(), "quotePolicy", enum19);
        setField(term6084, term6084.getClass(), "commentStart", term6089);
        setField(term6084, term6084.getClass(), "escape", term6090);
        setBooleanField(term6084, term6084.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term6084, term6084.getClass(), "ignoreEmptyLines", false);
        setField(term6084, term6084.getClass(), "recordSeparator", "LQFpaHEwXR");
        setField(term6084, term6084.getClass(), "nullString", "oVcInYnLWB");
        setElement(term6095, 0, "aJlieCFVtF");
        setElement(term6095, 1, "ZiaGIbnzTs");
        setElement(term6095, 2, "tbcdzjIfER");
        setField(term6084, term6084.getClass(), "header", term6095);
        setBooleanField(term6084, term6084.getClass(), "skipHeaderRecord", true);
        setField(term6083, term6083.getClass(), "format", term6084);
        setBooleanField(term6083, term6083.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term696, args);
        assertTrue(recursiveEquals(term696, term6083));
    }

};


