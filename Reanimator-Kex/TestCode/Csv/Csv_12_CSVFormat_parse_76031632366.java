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

public class CSVFormat_parse_76031632366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6824;

    public CSVFormat_parse_76031632366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6826 = new Character('z');
        Class<? extends Object> term32066 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term32065 = ((Class) term32066).getDeclaredField((String) "NONE");
        ((Field) term32065).setAccessible(true);
        Object enum83 = ((Field) term32065).get((Object) null);
        Character term6836 = new Character('Y');
        Character term6838 = new Character('Y');
        term6824 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6867 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term6824, term6824.getClass(), "delimiter", 'S');
        setField(term6824, term6824.getClass(), "quoteCharacter", term6826);
        setField(term6824, term6824.getClass(), "quoteMode", enum83);
        setField(term6824, term6824.getClass(), "commentMarker", term6836);
        setField(term6824, term6824.getClass(), "escapeCharacter", term6838);
        setBooleanField(term6824, term6824.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term6824, term6824.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term6824, term6824.getClass(), "ignoreEmptyLines", true);
        setField(term6824, term6824.getClass(), "recordSeparator", "MvRIxilFMJ");
        setField(term6824, term6824.getClass(), "nullString", "iNwOJRBEjp");
        setElement(term6867, 0, "XylxrMBraH");
        setField(term6824, term6824.getClass(), "header", term6867);
        setBooleanField(term6824, term6824.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.Reader");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parse", argTypes, term6824, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


