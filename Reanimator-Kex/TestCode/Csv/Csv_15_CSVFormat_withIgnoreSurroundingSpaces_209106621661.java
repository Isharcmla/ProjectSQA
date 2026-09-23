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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withIgnoreSurroundingSpaces_209106621661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26085;

    public CSVFormat_withIgnoreSurroundingSpaces_209106621661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term26087 = new Character('x');
        Character term26090 = new Character('G');
        Character term26217 = new Character('V');
        Class<? extends Object> term26351 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term26350 = ((Class) term26351).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term26350).setAccessible(true);
        Object enum58 = ((Field) term26350).get((Object) null);
        term26085 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term26092 = (Object[]) newArray("java.lang.String", 6);
        Object[] term26165 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term26085, term26085.getClass(), "allowMissingColumnNames", true);
        setField(term26085, term26085.getClass(), "commentMarker", term26087);
        setCharField(term26085, term26085.getClass(), "delimiter", 'v');
        setField(term26085, term26085.getClass(), "escapeCharacter", term26090);
        setElement(term26092, 0, "uWqXrwAsDU");
        setElement(term26092, 1, "hgFbWAUtsu");
        setElement(term26092, 2, "HqoTWlkbwF");
        setElement(term26092, 3, "CwNELDTAPP");
        setElement(term26092, 4, "GSzQdbHLHw");
        setElement(term26092, 5, "IkfarsYNJO");
        setField(term26085, term26085.getClass(), "header", term26092);
        setElement(term26165, 0, "aZKOWhHMEh");
        setElement(term26165, 1, "YfkhviKZwl");
        setElement(term26165, 2, "DcOhhAfJTI");
        setField(term26085, term26085.getClass(), "headerComments", term26165);
        setBooleanField(term26085, term26085.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term26085, term26085.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term26085, term26085.getClass(), "ignoreSurroundingSpaces", false);
        setField(term26085, term26085.getClass(), "nullString", "gYTIkBFOoS");
        setField(term26085, term26085.getClass(), "quoteCharacter", term26217);
        setField(term26085, term26085.getClass(), "quoteMode", enum58);
        setField(term26085, term26085.getClass(), "recordSeparator", "xmzSoVgiED");
        setBooleanField(term26085, term26085.getClass(), "skipHeaderRecord", false);
        setBooleanField(term26085, term26085.getClass(), "trailingDelimiter", true);
        setBooleanField(term26085, term26085.getClass(), "trim", true);
        setBooleanField(term26085, term26085.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withIgnoreSurroundingSpaces", argTypes, term26085, args);
    }

};


