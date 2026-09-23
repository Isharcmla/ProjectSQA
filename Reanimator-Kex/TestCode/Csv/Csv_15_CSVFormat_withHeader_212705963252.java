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

public class CSVFormat_withHeader_212705963252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22388;

    public CSVFormat_withHeader_212705963252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term22390 = new Character('h');
        Character term22393 = new Character('x');
        Character term22496 = new Character('W');
        Class<? extends Object> term22611 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term22610 = ((Class) term22611).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term22610).setAccessible(true);
        Object enum49 = ((Field) term22610).get((Object) null);
        term22388 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term22395 = (Object[]) newArray("java.lang.String", 3);
        Object[] term22432 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term22388, term22388.getClass(), "allowMissingColumnNames", false);
        setField(term22388, term22388.getClass(), "commentMarker", term22390);
        setCharField(term22388, term22388.getClass(), "delimiter", 'N');
        setField(term22388, term22388.getClass(), "escapeCharacter", term22393);
        setElement(term22395, 0, "xeyjTOCOJb");
        setElement(term22395, 1, "DGRqjjdhzy");
        setElement(term22395, 2, "lQFkjJUPAR");
        setField(term22388, term22388.getClass(), "header", term22395);
        setElement(term22432, 0, "BsuVlGUUjV");
        setElement(term22432, 1, "bHHjfDCntT");
        setElement(term22432, 2, "sEphiduvkv");
        setElement(term22432, 3, "PbLgCSAHce");
        setField(term22388, term22388.getClass(), "headerComments", term22432);
        setBooleanField(term22388, term22388.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term22388, term22388.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term22388, term22388.getClass(), "ignoreSurroundingSpaces", true);
        setField(term22388, term22388.getClass(), "nullString", "NWldOLAbqk");
        setField(term22388, term22388.getClass(), "quoteCharacter", term22496);
        setField(term22388, term22388.getClass(), "quoteMode", enum49);
        setField(term22388, term22388.getClass(), "recordSeparator", "qnYaYSpDwO");
        setBooleanField(term22388, term22388.getClass(), "skipHeaderRecord", false);
        setBooleanField(term22388, term22388.getClass(), "trailingDelimiter", false);
        setBooleanField(term22388, term22388.getClass(), "trim", false);
        setBooleanField(term22388, term22388.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withHeader", argTypes, term22388, args);
    }

};


