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
import java.lang.Integer;
import java.lang.Boolean;

public class CSVFormat_printAndQuote_19052926120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76624;
     Object term76634;
     Object term76636;
     Object term76638;

    public CSVFormat_printAndQuote_19052926120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76624 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76624, term76624.getClass(), "allowMissingColumnNames", false);
        setField(term76624, term76624.getClass(), "commentMarker", null);
        setCharField(term76624, term76624.getClass(), "delimiter", (char) 0);
        setField(term76624, term76624.getClass(), "escapeCharacter", null);
        setField(term76624, term76624.getClass(), "header", null);
        setField(term76624, term76624.getClass(), "headerComments", null);
        setBooleanField(term76624, term76624.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76624, term76624.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76624, term76624.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76624, term76624.getClass(), "nullString", null);
        setField(term76624, term76624.getClass(), "quoteCharacter", null);
        setField(term76624, term76624.getClass(), "quoteMode", null);
        setField(term76624, term76624.getClass(), "recordSeparator", null);
        setBooleanField(term76624, term76624.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76624, term76624.getClass(), "trailingDelimiter", false);
        setBooleanField(term76624, term76624.getClass(), "trim", false);
        setBooleanField(term76624, term76624.getClass(), "autoFlush", false);
        term76634 = new Integer(0);
        term76636 = new Integer(0);
        term76638 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.Appendable");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term76634;
        args[3] = term76636;
        args[4] = null;
        args[5] = term76638;
        callMethod(klass, "printAndQuote", argTypes, term76624, args);
    }

};


