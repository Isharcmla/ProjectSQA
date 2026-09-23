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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Character;

public class CSVFormat_withFirstRecordAsHeader_769595769160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124871;

    public CSVFormat_withFirstRecordAsHeader_769595769160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term134382 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term134381 = ((Class) term134382).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term134381).setAccessible(true);
        Object enum250 = ((Field) term134381).get((Object) null);
        Character term125031 = new Character((char) 0);
        term124871 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term124708 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term124871, term124871.getClass(), "delimiter", (char) 13);
        setField(term124871, term124871.getClass(), "quoteCharacter", null);
        setField(term124871, term124871.getClass(), "quoteMode", enum250);
        setField(term124871, term124871.getClass(), "commentMarker", term125031);
        setField(term124871, term124871.getClass(), "escapeCharacter", null);
        setBooleanField(term124871, term124871.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term124871, term124871.getClass(), "ignoreEmptyLines", false);
        setField(term124871, term124871.getClass(), "recordSeparator", "");
        setField(term124871, term124871.getClass(), "nullString", "NONE");
        setElement(term124708, 0, "");
        setElement(term124708, 1, "");
        setElement(term124708, 2, "");
        setField(term124871, term124871.getClass(), "headerComments", term124708);
        setBooleanField(term124871, term124871.getClass(), "skipHeaderRecord", false);
        setBooleanField(term124871, term124871.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term124871, term124871.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term124871, term124871.getClass(), "trim", false);
        setBooleanField(term124871, term124871.getClass(), "trailingDelimiter", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "withFirstRecordAsHeader", argTypes, term124871, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


