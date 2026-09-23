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

public class CSVFormat_withHeader_196358528353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22823;

    public CSVFormat_withHeader_196358528353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term22825 = new Character('a');
        Character term22828 = new Character('c');
        Character term22943 = new Character('f');
        Class<? extends Object> term23067 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term23066 = ((Class) term23067).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term23066).setAccessible(true);
        Object enum50 = ((Field) term23066).get((Object) null);
        term22823 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term22830 = (Object[]) newArray("java.lang.String", 8);
        Object[] term22927 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term22823, term22823.getClass(), "allowMissingColumnNames", false);
        setField(term22823, term22823.getClass(), "commentMarker", term22825);
        setCharField(term22823, term22823.getClass(), "delimiter", 'H');
        setField(term22823, term22823.getClass(), "escapeCharacter", term22828);
        setElement(term22830, 0, "dgbFDCdHtj");
        setElement(term22830, 1, "EKpdCBubDE");
        setElement(term22830, 2, "zMsSLTfGhl");
        setElement(term22830, 3, "bEmHScVZaQ");
        setElement(term22830, 4, "TcuXODkzBV");
        setElement(term22830, 5, "coJPjrBZNe");
        setElement(term22830, 6, "vMsWjuPTnO");
        setElement(term22830, 7, "zHvfKaOstO");
        setField(term22823, term22823.getClass(), "header", term22830);
        setField(term22823, term22823.getClass(), "headerComments", term22927);
        setBooleanField(term22823, term22823.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term22823, term22823.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term22823, term22823.getClass(), "ignoreSurroundingSpaces", false);
        setField(term22823, term22823.getClass(), "nullString", "tOszriqETr");
        setField(term22823, term22823.getClass(), "quoteCharacter", term22943);
        setField(term22823, term22823.getClass(), "quoteMode", enum50);
        setField(term22823, term22823.getClass(), "recordSeparator", "ncSPTkhKjO");
        setBooleanField(term22823, term22823.getClass(), "skipHeaderRecord", true);
        setBooleanField(term22823, term22823.getClass(), "trailingDelimiter", true);
        setBooleanField(term22823, term22823.getClass(), "trim", true);
        setBooleanField(term22823, term22823.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.ResultSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withHeader", argTypes, term22823, args);
    }

};


