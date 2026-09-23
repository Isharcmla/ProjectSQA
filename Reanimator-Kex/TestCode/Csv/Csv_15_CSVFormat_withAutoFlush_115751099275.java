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
import java.lang.Boolean;

public class CSVFormat_withAutoFlush_115751099275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32798;
     Object term33003;

    public CSVFormat_withAutoFlush_115751099275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term32800 = new Character('A');
        Character term32803 = new Character('f');
        Character term32978 = new Character('y');
        Class<? extends Object> term33146 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term33145 = ((Class) term33146).getDeclaredField((String) "ALL");
        ((Field) term33145).setAccessible(true);
        Object enum73 = ((Field) term33145).get((Object) null);
        term32798 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term32805 = (Object[]) newArray("java.lang.String", 6);
        Object[] term32878 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term32798, term32798.getClass(), "allowMissingColumnNames", true);
        setField(term32798, term32798.getClass(), "commentMarker", term32800);
        setCharField(term32798, term32798.getClass(), "delimiter", 'i');
        setField(term32798, term32798.getClass(), "escapeCharacter", term32803);
        setElement(term32805, 0, "ngYxiXTZrk");
        setElement(term32805, 1, "YTxBqWRAlo");
        setElement(term32805, 2, "ReruUQRXwl");
        setElement(term32805, 3, "DWEsVQwuaE");
        setElement(term32805, 4, "qGkNzZAeDN");
        setElement(term32805, 5, "wdtiuPgTVJ");
        setField(term32798, term32798.getClass(), "header", term32805);
        setElement(term32878, 0, "HUgzMgrpsK");
        setElement(term32878, 1, "ubaBUfLolu");
        setElement(term32878, 2, "itAUCFhZhq");
        setElement(term32878, 3, "bIqaKgXgPm");
        setElement(term32878, 4, "uOJFOUcNvv");
        setElement(term32878, 5, "tkmmGweDwJ");
        setElement(term32878, 6, "pMfTuAFXxg");
        setField(term32798, term32798.getClass(), "headerComments", term32878);
        setBooleanField(term32798, term32798.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term32798, term32798.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term32798, term32798.getClass(), "ignoreSurroundingSpaces", true);
        setField(term32798, term32798.getClass(), "nullString", "XCZmhkblRc");
        setField(term32798, term32798.getClass(), "quoteCharacter", term32978);
        setField(term32798, term32798.getClass(), "quoteMode", enum73);
        setField(term32798, term32798.getClass(), "recordSeparator", "gFUWMydGCU");
        setBooleanField(term32798, term32798.getClass(), "skipHeaderRecord", false);
        setBooleanField(term32798, term32798.getClass(), "trailingDelimiter", true);
        setBooleanField(term32798, term32798.getClass(), "trim", false);
        setBooleanField(term32798, term32798.getClass(), "autoFlush", true);
        term33003 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term33003;
        callMethod(klass, "withAutoFlush", argTypes, term32798, args);
    }

};


