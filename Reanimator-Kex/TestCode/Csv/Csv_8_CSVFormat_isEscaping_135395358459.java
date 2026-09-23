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

public class CSVFormat_isEscaping_135395358459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5051;
     Object term24603;

    public CSVFormat_isEscaping_135395358459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5053 = new Character('y');
        Class<? extends Object> term24621 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term24620 = ((Class) term24621).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term24620).setAccessible(true);
        Object enum72 = ((Field) term24620).get((Object) null);
        Character term5070 = new Character('S');
        Character term5072 = new Character('M');
        term5051 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5100 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term5051, term5051.getClass(), "delimiter", 'T');
        setField(term5051, term5051.getClass(), "quoteChar", term5053);
        setField(term5051, term5051.getClass(), "quotePolicy", enum72);
        setField(term5051, term5051.getClass(), "commentStart", term5070);
        setField(term5051, term5051.getClass(), "escape", term5072);
        setBooleanField(term5051, term5051.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term5051, term5051.getClass(), "ignoreEmptyLines", true);
        setField(term5051, term5051.getClass(), "recordSeparator", "jSpAteRute");
        setField(term5051, term5051.getClass(), "nullString", "swZVeJAxjt");
        setElement(term5100, 0, "xOcJIiQQDu");
        setElement(term5100, 1, "GVizqqzXpy");
        setField(term5051, term5051.getClass(), "header", term5100);
        setBooleanField(term5051, term5051.getClass(), "skipHeaderRecord", false);
        Character term24604 = new Character('y');
        Class<? extends Object> term24841 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term24840 = ((Class) term24841).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term24840).setAccessible(true);
        Object enum73 = ((Field) term24840).get((Object) null);
        Character term24608 = new Character('S');
        Character term24609 = new Character('M');
        term24603 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term24614 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term24603, term24603.getClass(), "delimiter", 'T');
        setField(term24603, term24603.getClass(), "quoteChar", term24604);
        setField(term24603, term24603.getClass(), "quotePolicy", enum73);
        setField(term24603, term24603.getClass(), "commentStart", term24608);
        setField(term24603, term24603.getClass(), "escape", term24609);
        setBooleanField(term24603, term24603.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term24603, term24603.getClass(), "ignoreEmptyLines", true);
        setField(term24603, term24603.getClass(), "recordSeparator", "jSpAteRute");
        setField(term24603, term24603.getClass(), "nullString", "swZVeJAxjt");
        setElement(term24614, 0, "xOcJIiQQDu");
        setElement(term24614, 1, "GVizqqzXpy");
        setField(term24603, term24603.getClass(), "header", term24614);
        setBooleanField(term24603, term24603.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEscaping", argTypes, term5051, args);
        assertTrue(recursiveEquals(term5051, term24603));
        assertTrue(recursiveEquals(retValue, true));
    }

};


