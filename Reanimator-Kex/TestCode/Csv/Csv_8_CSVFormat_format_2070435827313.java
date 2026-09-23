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
import java.lang.StringBuffer;

public class CSVFormat_format_2070435827313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191529;
     Object term190466;
     Object term192356;
     Object term192364;

    public CSVFormat_format_2070435827313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term191581 = new Character((char) 8192);
        Character term191633 = new Character((char) 16384);
        Character term191685 = new Character((char) 0);
        Class<? extends Object> term192370 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term192369 = ((Class) term192370).getDeclaredField((String) "MINIMAL");
        ((Field) term192369).setAccessible(true);
        Object enum331 = ((Field) term192369).get((Object) null);
        term191529 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term190572 = (Object[]) newArray("java.lang.String", 0);
        setField(term191529, term191529.getClass(), "quoteChar", term191581);
        setCharField(term191529, term191529.getClass(), "delimiter", 'c');
        setField(term191529, term191529.getClass(), "escape", term191633);
        setField(term191529, term191529.getClass(), "commentStart", term191685);
        setField(term191529, term191529.getClass(), "header", term190572);
        setField(term191529, term191529.getClass(), "quotePolicy", enum331);
        StringBuffer term191843 = new StringBuffer();
        term190466 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term190466, 0, term191843);
        Character term192357 = new Character((char) 8192);
        Class<? extends Object> term192538 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term192537 = ((Class) term192538).getDeclaredField((String) "MINIMAL");
        ((Field) term192537).setAccessible(true);
        Object enum332 = ((Field) term192537).get((Object) null);
        Character term192361 = new Character((char) 0);
        Character term192362 = new Character((char) 16384);
        term192356 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term192363 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term192356, term192356.getClass(), "delimiter", 'c');
        setField(term192356, term192356.getClass(), "quoteChar", term192357);
        setField(term192356, term192356.getClass(), "quotePolicy", enum332);
        setField(term192356, term192356.getClass(), "commentStart", term192361);
        setField(term192356, term192356.getClass(), "escape", term192362);
        setBooleanField(term192356, term192356.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term192356, term192356.getClass(), "ignoreEmptyLines", false);
        setField(term192356, term192356.getClass(), "recordSeparator", null);
        setField(term192356, term192356.getClass(), "nullString", null);
        setField(term192356, term192356.getClass(), "header", term192363);
        setBooleanField(term192356, term192356.getClass(), "skipHeaderRecord", false);
        term192364 = (Object[]) newArray("java.lang.Object", 1);
        Object term192365 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term192368 = (byte[]) newByteArray(16);
        setField(term192365, term192365.getClass(), "toStringCache", "");
        setField(term192365, term192365.getClass(), "value", term192368);
        setByteField(term192365, term192365.getClass(), "coder", (byte) 0);
        setIntField(term192365, term192365.getClass(), "count", 0);
        setElement(term192364, 0, term192365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term190466;
        Object retValue = callMethod(klass, "format", argTypes, term191529, args);
        assertTrue(recursiveEquals(term191529, term192356));
        assertTrue(recursiveEquals(term190466, term192364));
        assertTrue(recursiveEquals(retValue, "    "));
    }

};


