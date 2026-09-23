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
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_printRecord_644468015171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143372;
     Object term141714;

    public CSVFormat_printRecord_644468015171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term143424 = new Character((char) 0);
        Class<? extends Object> term144367 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term144366 = ((Class) term144367).getDeclaredField((String) "NONE");
        ((Field) term144366).setAccessible(true);
        Object enum264 = ((Field) term144366).get((Object) null);
        Character term143584 = new Character((char) 1024);
        term143372 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term143372, term143372.getClass(), "trim", false);
        setField(term143372, term143372.getClass(), "quoteCharacter", term143424);
        setCharField(term143372, term143372.getClass(), "delimiter", (char) 2048);
        setField(term143372, term143372.getClass(), "quoteMode", enum264);
        setField(term143372, term143372.getClass(), "escapeCharacter", term143584);
        Class<? extends Object> term144546 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term144545 = ((Class) term144546).getDeclaredField((String) "ALL");
        ((Field) term144545).setAccessible(true);
        Object enum265 = ((Field) term144545).get((Object) null);
        term141714 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term141714, 0, enum265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term141714;
        try {
            callMethod(klass, "printRecord", argTypes, term143372, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


