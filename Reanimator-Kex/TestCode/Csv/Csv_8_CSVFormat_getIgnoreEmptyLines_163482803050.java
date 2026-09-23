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

public class CSVFormat_getIgnoreEmptyLines_163482803050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2284;
     Object term19525;

    public CSVFormat_getIgnoreEmptyLines_163482803050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2286 = new Character('t');
        Class<? extends Object> term19553 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term19552 = ((Class) term19553).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term19552).setAccessible(true);
        Object enum53 = ((Field) term19552).get((Object) null);
        Character term2303 = new Character('l');
        Character term2305 = new Character('P');
        term2284 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2333 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term2284, term2284.getClass(), "delimiter", 'x');
        setField(term2284, term2284.getClass(), "quoteChar", term2286);
        setField(term2284, term2284.getClass(), "quotePolicy", enum53);
        setField(term2284, term2284.getClass(), "commentStart", term2303);
        setField(term2284, term2284.getClass(), "escape", term2305);
        setBooleanField(term2284, term2284.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term2284, term2284.getClass(), "ignoreEmptyLines", true);
        setField(term2284, term2284.getClass(), "recordSeparator", "UlajhuVLaP");
        setField(term2284, term2284.getClass(), "nullString", "gGSMzuGICf");
        setElement(term2333, 0, "hxCBltsObl");
        setElement(term2333, 1, "BndsHwAFMv");
        setElement(term2333, 2, "GzFkzHGYFt");
        setElement(term2333, 3, "tShwQLRGNe");
        setElement(term2333, 4, "LvtrsXUliU");
        setElement(term2333, 5, "xLbjWUgOIL");
        setElement(term2333, 6, "jDtqGUpnZN");
        setField(term2284, term2284.getClass(), "header", term2333);
        setBooleanField(term2284, term2284.getClass(), "skipHeaderRecord", true);
        Character term19526 = new Character('t');
        Class<? extends Object> term19881 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term19880 = ((Class) term19881).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term19880).setAccessible(true);
        Object enum54 = ((Field) term19880).get((Object) null);
        Character term19530 = new Character('l');
        Character term19531 = new Character('P');
        term19525 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term19536 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term19525, term19525.getClass(), "delimiter", 'x');
        setField(term19525, term19525.getClass(), "quoteChar", term19526);
        setField(term19525, term19525.getClass(), "quotePolicy", enum54);
        setField(term19525, term19525.getClass(), "commentStart", term19530);
        setField(term19525, term19525.getClass(), "escape", term19531);
        setBooleanField(term19525, term19525.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term19525, term19525.getClass(), "ignoreEmptyLines", true);
        setField(term19525, term19525.getClass(), "recordSeparator", "UlajhuVLaP");
        setField(term19525, term19525.getClass(), "nullString", "gGSMzuGICf");
        setElement(term19536, 0, "hxCBltsObl");
        setElement(term19536, 1, "BndsHwAFMv");
        setElement(term19536, 2, "GzFkzHGYFt");
        setElement(term19536, 3, "tShwQLRGNe");
        setElement(term19536, 4, "LvtrsXUliU");
        setElement(term19536, 5, "xLbjWUgOIL");
        setElement(term19536, 6, "jDtqGUpnZN");
        setField(term19525, term19525.getClass(), "header", term19536);
        setBooleanField(term19525, term19525.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreEmptyLines", argTypes, term2284, args);
        assertTrue(recursiveEquals(term2284, term19525));
    }

};


