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

public class CSVFormat_withIgnoreSurroundingSpaces_209106528662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26560;
     Object term26721;

    public CSVFormat_withIgnoreSurroundingSpaces_209106528662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term26562 = new Character('B');
        Character term26565 = new Character('q');
        Character term26692 = new Character('F');
        Class<? extends Object> term26824 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term26823 = ((Class) term26824).getDeclaredField((String) "MINIMAL");
        ((Field) term26823).setAccessible(true);
        Object enum59 = ((Field) term26823).get((Object) null);
        term26560 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term26567 = (Object[]) newArray("java.lang.String", 4);
        Object[] term26616 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term26560, term26560.getClass(), "allowMissingColumnNames", true);
        setField(term26560, term26560.getClass(), "commentMarker", term26562);
        setCharField(term26560, term26560.getClass(), "delimiter", 'Y');
        setField(term26560, term26560.getClass(), "escapeCharacter", term26565);
        setElement(term26567, 0, "pdSvedKgPq");
        setElement(term26567, 1, "epPTwvcoyb");
        setElement(term26567, 2, "UBPHmOICBs");
        setElement(term26567, 3, "IDJUVPgUJf");
        setField(term26560, term26560.getClass(), "header", term26567);
        setElement(term26616, 0, "JmnWRJUxGr");
        setElement(term26616, 1, "wgRGBNrTGP");
        setElement(term26616, 2, "FIdNVptZpW");
        setElement(term26616, 3, "rQjxAhisjm");
        setElement(term26616, 4, "ZDhASPHjDG");
        setField(term26560, term26560.getClass(), "headerComments", term26616);
        setBooleanField(term26560, term26560.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term26560, term26560.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term26560, term26560.getClass(), "ignoreSurroundingSpaces", false);
        setField(term26560, term26560.getClass(), "nullString", "HNVOAXYNEZ");
        setField(term26560, term26560.getClass(), "quoteCharacter", term26692);
        setField(term26560, term26560.getClass(), "quoteMode", enum59);
        setField(term26560, term26560.getClass(), "recordSeparator", "gbbYBYyfvr");
        setBooleanField(term26560, term26560.getClass(), "skipHeaderRecord", false);
        setBooleanField(term26560, term26560.getClass(), "trailingDelimiter", true);
        setBooleanField(term26560, term26560.getClass(), "trim", true);
        setBooleanField(term26560, term26560.getClass(), "autoFlush", true);
        term26721 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term26721;
        callMethod(klass, "withIgnoreSurroundingSpaces", argTypes, term26560, args);
    }

};


