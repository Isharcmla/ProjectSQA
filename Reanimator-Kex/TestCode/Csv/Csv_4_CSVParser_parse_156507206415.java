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
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVParser_parse_156507206415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583;

    public CSVParser_parse_156507206415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term585 = new Character('n');
        Class<? extends Object> term11283 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term11282 = ((Class) term11283).getDeclaredField((String) "MINIMAL");
        ((Field) term11282).setAccessible(true);
        Object enum29 = ((Field) term11282).get((Object) null);
        Character term598 = new Character('Z');
        Character term600 = new Character('t');
        term583 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term628 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term583, term583.getClass(), "delimiter", 't');
        setField(term583, term583.getClass(), "quoteChar", term585);
        setField(term583, term583.getClass(), "quotePolicy", enum29);
        setField(term583, term583.getClass(), "commentStart", term598);
        setField(term583, term583.getClass(), "escape", term600);
        setBooleanField(term583, term583.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term583, term583.getClass(), "ignoreEmptyLines", true);
        setField(term583, term583.getClass(), "recordSeparator", "RMFIsYGgne");
        setField(term583, term583.getClass(), "nullString", "NRdvgJlhkX");
        setElement(term628, 0, "uuaPigETmJ");
        setElement(term628, 1, "MxlszYVzRf");
        setElement(term628, 2, "LQFpaHEwXR");
        setElement(term628, 3, "oVcInYnLWB");
        setField(term583, term583.getClass(), "header", term628);
        setBooleanField(term583, term583.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "hRNSzYYIrc";
        args[1] = term583;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


