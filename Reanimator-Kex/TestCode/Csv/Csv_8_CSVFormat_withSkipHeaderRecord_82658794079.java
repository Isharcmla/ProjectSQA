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
import java.lang.Boolean;

public class CSVFormat_withSkipHeaderRecord_82658794079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11987;
     Object term12031;
     Object term42818;
     Object term42650;

    public CSVFormat_withSkipHeaderRecord_82658794079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11989 = new Character('F');
        Class<? extends Object> term42969 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term42966 = ((Class) term42969).getDeclaredField((String) "NONE");
        ((Field) term42966).setAccessible(true);
        Object enum125 = ((Field) term42966).get((Object) null);
        Character term11999 = new Character('V');
        Character term12001 = new Character('t');
        term11987 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term12029 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term11987, term11987.getClass(), "delimiter", 'C');
        setField(term11987, term11987.getClass(), "quoteChar", term11989);
        setField(term11987, term11987.getClass(), "quotePolicy", enum125);
        setField(term11987, term11987.getClass(), "commentStart", term11999);
        setField(term11987, term11987.getClass(), "escape", term12001);
        setBooleanField(term11987, term11987.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term11987, term11987.getClass(), "ignoreEmptyLines", false);
        setField(term11987, term11987.getClass(), "recordSeparator", "wKWbJssZuG");
        setField(term11987, term11987.getClass(), "nullString", "NzBMMhkhpT");
        setField(term11987, term11987.getClass(), "header", term12029);
        setBooleanField(term11987, term11987.getClass(), "skipHeaderRecord", true);
        term12031 = new Boolean(false);
        Character term42820 = new Character('F');
        Class<? extends Object> term43613 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term43612 = ((Class) term43613).getDeclaredField((String) "NONE");
        ((Field) term43612).setAccessible(true);
        Object enum127 = ((Field) term43612).get((Object) null);
        Character term42850 = new Character('V');
        Character term42851 = new Character('t');
        term42818 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term42856 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term42818, term42818.getClass(), "delimiter", 'C');
        setField(term42818, term42818.getClass(), "quoteChar", term42820);
        setField(term42818, term42818.getClass(), "quotePolicy", enum127);
        setField(term42818, term42818.getClass(), "commentStart", term42850);
        setField(term42818, term42818.getClass(), "escape", term42851);
        setBooleanField(term42818, term42818.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term42818, term42818.getClass(), "ignoreEmptyLines", false);
        setField(term42818, term42818.getClass(), "recordSeparator", "wKWbJssZuG");
        setField(term42818, term42818.getClass(), "nullString", "NzBMMhkhpT");
        setField(term42818, term42818.getClass(), "header", term42856);
        setBooleanField(term42818, term42818.getClass(), "skipHeaderRecord", true);
        Character term42652 = new Character('F');
        Class<? extends Object> term43792 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term43791 = ((Class) term43792).getDeclaredField((String) "NONE");
        ((Field) term43791).setAccessible(true);
        Object enum129 = ((Field) term43791).get((Object) null);
        Character term42662 = new Character('V');
        Character term42664 = new Character('t');
        term42650 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term42692 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term42650, term42650.getClass(), "delimiter", 'C');
        setField(term42650, term42650.getClass(), "quoteChar", term42652);
        setField(term42650, term42650.getClass(), "quotePolicy", enum129);
        setField(term42650, term42650.getClass(), "commentStart", term42662);
        setField(term42650, term42650.getClass(), "escape", term42664);
        setBooleanField(term42650, term42650.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term42650, term42650.getClass(), "ignoreEmptyLines", false);
        setField(term42650, term42650.getClass(), "recordSeparator", "wKWbJssZuG");
        setField(term42650, term42650.getClass(), "nullString", "NzBMMhkhpT");
        setField(term42650, term42650.getClass(), "header", term42692);
        setBooleanField(term42650, term42650.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term12031;
        Object retValue = callMethod(klass, "withSkipHeaderRecord", argTypes, term11987, args);
        assertTrue(recursiveEquals(term11987, term42818));
        assertTrue(recursiveEquals(term12031, false));
        assertTrue(recursiveEquals(retValue, term42650));
    }

};


