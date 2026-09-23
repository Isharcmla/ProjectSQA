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

public class CSVFormat_printRecord_644468015173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146039;
     Object term144923;

    public CSVFormat_printRecord_644468015173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term146091 = new Character((char) 0);
        Class<? extends Object> term146719 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term146718 = ((Class) term146719).getDeclaredField((String) "ALL");
        ((Field) term146718).setAccessible(true);
        Object enum268 = ((Field) term146718).get((Object) null);
        Character term146251 = new Character((char) 0);
        term146039 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term146039, term146039.getClass(), "trim", false);
        setField(term146039, term146039.getClass(), "quoteCharacter", term146091);
        setCharField(term146039, term146039.getClass(), "delimiter", (char) 65532);
        setField(term146039, term146039.getClass(), "quoteMode", enum268);
        setField(term146039, term146039.getClass(), "escapeCharacter", term146251);
        term144923 = (Object[]) newArray("java.lang.Object", 1);
        Object[] term144924 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term144923, 0, term144924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term144923;
        try {
            callMethod(klass, "printRecord", argTypes, term146039, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


