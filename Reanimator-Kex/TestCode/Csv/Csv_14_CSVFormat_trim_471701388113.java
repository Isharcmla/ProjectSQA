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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_trim_471701388113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16668;

    public CSVFormat_trim_471701388113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term16670 = new Character('L');
        Character term16673 = new Character('B');
        Character term16716 = new Character('a');
        Class<? extends Object> term69761 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term69760 = ((Class) term69761).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term69760).setAccessible(true);
        Object enum142 = ((Field) term69760).get((Object) null);
        term16668 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term16675 = (Object[]) newArray("java.lang.String", 1);
        Object[] term16688 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term16668, term16668.getClass(), "allowMissingColumnNames", true);
        setField(term16668, term16668.getClass(), "commentMarker", term16670);
        setCharField(term16668, term16668.getClass(), "delimiter", 'W');
        setField(term16668, term16668.getClass(), "escapeCharacter", term16673);
        setElement(term16675, 0, "OUeBWNTQDh");
        setField(term16668, term16668.getClass(), "header", term16675);
        setElement(term16688, 0, "gltJarNuUk");
        setField(term16668, term16668.getClass(), "headerComments", term16688);
        setBooleanField(term16668, term16668.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term16668, term16668.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term16668, term16668.getClass(), "ignoreSurroundingSpaces", true);
        setField(term16668, term16668.getClass(), "nullString", "ZwZIDwYcSW");
        setField(term16668, term16668.getClass(), "quoteCharacter", term16716);
        setField(term16668, term16668.getClass(), "quoteMode", enum142);
        setField(term16668, term16668.getClass(), "recordSeparator", "sOdkipUKRu");
        setBooleanField(term16668, term16668.getClass(), "skipHeaderRecord", false);
        setBooleanField(term16668, term16668.getClass(), "trailingDelimiter", true);
        setBooleanField(term16668, term16668.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "trim", argTypes, term16668, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


