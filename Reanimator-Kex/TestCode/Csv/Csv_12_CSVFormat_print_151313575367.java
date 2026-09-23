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
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_print_151313575367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7090;

    public CSVFormat_print_151313575367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7092 = new Character('r');
        Class<? extends Object> term32563 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term32562 = ((Class) term32563).getDeclaredField((String) "NONE");
        ((Field) term32562).setAccessible(true);
        Object enum84 = ((Field) term32562).get((Object) null);
        Character term7102 = new Character('c');
        Character term7104 = new Character('R');
        term7090 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7133 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term7090, term7090.getClass(), "delimiter", 'I');
        setField(term7090, term7090.getClass(), "quoteCharacter", term7092);
        setField(term7090, term7090.getClass(), "quoteMode", enum84);
        setField(term7090, term7090.getClass(), "commentMarker", term7102);
        setField(term7090, term7090.getClass(), "escapeCharacter", term7104);
        setBooleanField(term7090, term7090.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term7090, term7090.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term7090, term7090.getClass(), "ignoreEmptyLines", true);
        setField(term7090, term7090.getClass(), "recordSeparator", "pORebkoRdD");
        setField(term7090, term7090.getClass(), "nullString", "mXGCWJDOqA");
        setElement(term7133, 0, "dpNsDgfPso");
        setElement(term7133, 1, "hCWPJQKpdc");
        setElement(term7133, 2, "WzMEhMXkKx");
        setElement(term7133, 3, "XOiDvlDhdc");
        setElement(term7133, 4, "AdxvLJhNLe");
        setElement(term7133, 5, "lHfTrWKMPk");
        setElement(term7133, 6, "JDaAnsVTGV");
        setElement(term7133, 7, "mLUZFTfjle");
        setElement(term7133, 8, "xIeFjkHkOe");
        setField(term7090, term7090.getClass(), "header", term7133);
        setBooleanField(term7090, term7090.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "print", argTypes, term7090, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


