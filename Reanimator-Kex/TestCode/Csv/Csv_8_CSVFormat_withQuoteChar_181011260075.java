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

public class CSVFormat_withQuoteChar_181011260075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10526;
     Object term10606;
     Object term39266;
     Object term39284;
     Object term39038;

    public CSVFormat_withQuoteChar_181011260075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term10528 = new Character('X');
        Class<? extends Object> term39286 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term39285 = ((Class) term39286).getDeclaredField((String) "NONE");
        ((Field) term39285).setAccessible(true);
        Object enum113 = ((Field) term39285).get((Object) null);
        Character term10538 = new Character('R');
        Character term10540 = new Character('o');
        term10526 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10568 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term10526, term10526.getClass(), "delimiter", 'w');
        setField(term10526, term10526.getClass(), "quoteChar", term10528);
        setField(term10526, term10526.getClass(), "quotePolicy", enum113);
        setField(term10526, term10526.getClass(), "commentStart", term10538);
        setField(term10526, term10526.getClass(), "escape", term10540);
        setBooleanField(term10526, term10526.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term10526, term10526.getClass(), "ignoreEmptyLines", false);
        setField(term10526, term10526.getClass(), "recordSeparator", "iikZEapDlu");
        setField(term10526, term10526.getClass(), "nullString", "nhoHrZfnIN");
        setElement(term10568, 0, "ZkMALXpEAZ");
        setElement(term10568, 1, "tXfQjSqDzN");
        setElement(term10568, 2, "BjugTaMcxJ");
        setField(term10526, term10526.getClass(), "header", term10568);
        setBooleanField(term10526, term10526.getClass(), "skipHeaderRecord", true);
        term10606 = new Character('V');
        Character term39267 = new Character('X');
        Class<? extends Object> term39495 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term39494 = ((Class) term39495).getDeclaredField((String) "NONE");
        ((Field) term39494).setAccessible(true);
        Object enum114 = ((Field) term39494).get((Object) null);
        Character term39271 = new Character('R');
        Character term39272 = new Character('o');
        term39266 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term39277 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term39266, term39266.getClass(), "delimiter", 'w');
        setField(term39266, term39266.getClass(), "quoteChar", term39267);
        setField(term39266, term39266.getClass(), "quotePolicy", enum114);
        setField(term39266, term39266.getClass(), "commentStart", term39271);
        setField(term39266, term39266.getClass(), "escape", term39272);
        setBooleanField(term39266, term39266.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term39266, term39266.getClass(), "ignoreEmptyLines", false);
        setField(term39266, term39266.getClass(), "recordSeparator", "iikZEapDlu");
        setField(term39266, term39266.getClass(), "nullString", "nhoHrZfnIN");
        setElement(term39277, 0, "ZkMALXpEAZ");
        setElement(term39277, 1, "tXfQjSqDzN");
        setElement(term39277, 2, "BjugTaMcxJ");
        setField(term39266, term39266.getClass(), "header", term39277);
        setBooleanField(term39266, term39266.getClass(), "skipHeaderRecord", true);
        term39284 = new Character('V');
        Character term39040 = new Character('V');
        Class<? extends Object> term39704 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term39703 = ((Class) term39704).getDeclaredField((String) "NONE");
        ((Field) term39703).setAccessible(true);
        Object enum115 = ((Field) term39703).get((Object) null);
        Character term39050 = new Character('R');
        Character term39052 = new Character('o');
        term39038 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term39080 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term39038, term39038.getClass(), "delimiter", 'w');
        setField(term39038, term39038.getClass(), "quoteChar", term39040);
        setField(term39038, term39038.getClass(), "quotePolicy", enum115);
        setField(term39038, term39038.getClass(), "commentStart", term39050);
        setField(term39038, term39038.getClass(), "escape", term39052);
        setBooleanField(term39038, term39038.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term39038, term39038.getClass(), "ignoreEmptyLines", false);
        setField(term39038, term39038.getClass(), "recordSeparator", "iikZEapDlu");
        setField(term39038, term39038.getClass(), "nullString", "nhoHrZfnIN");
        setElement(term39080, 0, "ZkMALXpEAZ");
        setElement(term39080, 1, "tXfQjSqDzN");
        setElement(term39080, 2, "BjugTaMcxJ");
        setField(term39038, term39038.getClass(), "header", term39080);
        setBooleanField(term39038, term39038.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term10606;
        Object retValue = callMethod(klass, "withQuoteChar", argTypes, term10526, args);
        assertTrue(recursiveEquals(term10526, term39266));
        assertTrue(recursiveEquals(term10606, term39284));
        assertTrue(recursiveEquals(retValue, term39038));
    }

};


