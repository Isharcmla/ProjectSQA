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
import java.lang.Object;
import java.lang.String;

public class CSVParser_parse_86360699220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717;

    public CSVParser_parse_86360699220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term719 = new Character('t');
        Character term722 = new Character('Z');
        Character term825 = new Character('t');
        Class<? extends Object> term15885 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term15884 = ((Class) term15885).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term15884).setAccessible(true);
        Object enum35 = ((Field) term15884).get((Object) null);
        term717 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term724 = (Object[]) newArray("java.lang.String", 3);
        Object[] term761 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term717, term717.getClass(), "allowMissingColumnNames", false);
        setField(term717, term717.getClass(), "commentMarker", term719);
        setCharField(term717, term717.getClass(), "delimiter", 'n');
        setField(term717, term717.getClass(), "escapeCharacter", term722);
        setElement(term724, 0, "MxlszYVzRf");
        setElement(term724, 1, "LQFpaHEwXR");
        setElement(term724, 2, "oVcInYnLWB");
        setField(term717, term717.getClass(), "header", term724);
        setElement(term761, 0, "aJlieCFVtF");
        setElement(term761, 1, "ZiaGIbnzTs");
        setElement(term761, 2, "tbcdzjIfER");
        setElement(term761, 3, "HyxfbSQYBe");
        setField(term717, term717.getClass(), "headerComments", term761);
        setBooleanField(term717, term717.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term717, term717.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term717, term717.getClass(), "ignoreSurroundingSpaces", true);
        setField(term717, term717.getClass(), "nullString", "pCTimMblYc");
        setField(term717, term717.getClass(), "quoteCharacter", term825);
        setField(term717, term717.getClass(), "quoteMode", enum35);
        setField(term717, term717.getClass(), "recordSeparator", "hNxWaHcfhY");
        setBooleanField(term717, term717.getClass(), "skipHeaderRecord", false);
        setBooleanField(term717, term717.getClass(), "trailingDelimiter", true);
        setBooleanField(term717, term717.getClass(), "trim", false);
        setBooleanField(term717, term717.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        argTypes[2] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term717;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


