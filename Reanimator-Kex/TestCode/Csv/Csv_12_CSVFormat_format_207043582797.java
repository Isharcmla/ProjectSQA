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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVFormat_format_207043582797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56733;

    public CSVFormat_format_207043582797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term56785 = new Character((char) 65089);
        Class<? extends Object> term57405 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term57404 = ((Class) term57405).getDeclaredField((String) "ALL");
        ((Field) term57404).setAccessible(true);
        Object enum136 = ((Field) term57404).get((Object) null);
        term56733 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term55841 = (Object[]) newArray("java.lang.String", 0);
        setField(term56733, term56733.getClass(), "header", term55841);
        setField(term56733, term56733.getClass(), "quoteCharacter", term56785);
        setCharField(term56733, term56733.getClass(), "delimiter", (char) 4);
        setField(term56733, term56733.getClass(), "quoteMode", enum136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "format", argTypes, term56733, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


