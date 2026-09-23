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

public class CSVFormat_withQuoteChar_69596942774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10163;
     Object term10274;
     Object term38250;
     Object term38153;

    public CSVFormat_withQuoteChar_69596942774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term10165 = new Character('p');
        Class<? extends Object> term38273 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term38272 = ((Class) term38273).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term38272).setAccessible(true);
        Object enum110 = ((Field) term38272).get((Object) null);
        Character term10182 = new Character('a');
        Character term10184 = new Character('H');
        term10163 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10212 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term10163, term10163.getClass(), "delimiter", 'F');
        setField(term10163, term10163.getClass(), "quoteChar", term10165);
        setField(term10163, term10163.getClass(), "quotePolicy", enum110);
        setField(term10163, term10163.getClass(), "commentStart", term10182);
        setField(term10163, term10163.getClass(), "escape", term10184);
        setBooleanField(term10163, term10163.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term10163, term10163.getClass(), "ignoreEmptyLines", true);
        setField(term10163, term10163.getClass(), "recordSeparator", "tRxZafjqIx");
        setField(term10163, term10163.getClass(), "nullString", "DhjNLmRMCu");
        setElement(term10212, 0, "PgPzMSEjjX");
        setElement(term10212, 1, "wzsPSPcRdj");
        setElement(term10212, 2, "kGMQdqJYyB");
        setElement(term10212, 3, "XJJNClzHRf");
        setElement(term10212, 4, "HDaezxQfQR");
        setField(term10163, term10163.getClass(), "header", term10212);
        setBooleanField(term10163, term10163.getClass(), "skipHeaderRecord", true);
        term10274 = new Character('E');
        Character term38251 = new Character('p');
        Class<? extends Object> term38523 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term38522 = ((Class) term38523).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term38522).setAccessible(true);
        Object enum111 = ((Field) term38522).get((Object) null);
        Character term38255 = new Character('a');
        Character term38256 = new Character('H');
        term38250 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term38261 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term38250, term38250.getClass(), "delimiter", 'F');
        setField(term38250, term38250.getClass(), "quoteChar", term38251);
        setField(term38250, term38250.getClass(), "quotePolicy", enum111);
        setField(term38250, term38250.getClass(), "commentStart", term38255);
        setField(term38250, term38250.getClass(), "escape", term38256);
        setBooleanField(term38250, term38250.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term38250, term38250.getClass(), "ignoreEmptyLines", true);
        setField(term38250, term38250.getClass(), "recordSeparator", "tRxZafjqIx");
        setField(term38250, term38250.getClass(), "nullString", "DhjNLmRMCu");
        setElement(term38261, 0, "PgPzMSEjjX");
        setElement(term38261, 1, "wzsPSPcRdj");
        setElement(term38261, 2, "kGMQdqJYyB");
        setElement(term38261, 3, "XJJNClzHRf");
        setElement(term38261, 4, "HDaezxQfQR");
        setField(term38250, term38250.getClass(), "header", term38261);
        setBooleanField(term38250, term38250.getClass(), "skipHeaderRecord", true);
        Character term38155 = new Character('E');
        Class<? extends Object> term38773 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term38772 = ((Class) term38773).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term38772).setAccessible(true);
        Object enum112 = ((Field) term38772).get((Object) null);
        Character term38157 = new Character('a');
        Character term38159 = new Character('H');
        term38153 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term38187 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term38153, term38153.getClass(), "delimiter", 'F');
        setField(term38153, term38153.getClass(), "quoteChar", term38155);
        setField(term38153, term38153.getClass(), "quotePolicy", enum112);
        setField(term38153, term38153.getClass(), "commentStart", term38157);
        setField(term38153, term38153.getClass(), "escape", term38159);
        setBooleanField(term38153, term38153.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term38153, term38153.getClass(), "ignoreEmptyLines", true);
        setField(term38153, term38153.getClass(), "recordSeparator", "tRxZafjqIx");
        setField(term38153, term38153.getClass(), "nullString", "DhjNLmRMCu");
        setElement(term38187, 0, "PgPzMSEjjX");
        setElement(term38187, 1, "wzsPSPcRdj");
        setElement(term38187, 2, "kGMQdqJYyB");
        setElement(term38187, 3, "XJJNClzHRf");
        setElement(term38187, 4, "HDaezxQfQR");
        setField(term38153, term38153.getClass(), "header", term38187);
        setBooleanField(term38153, term38153.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term10274;
        Object retValue = callMethod(klass, "withQuoteChar", argTypes, term10163, args);
        assertTrue(recursiveEquals(term10163, term38250));
        assertTrue(recursiveEquals(term10274, 'E'));
        assertTrue(recursiveEquals(retValue, term38153));
    }

};


