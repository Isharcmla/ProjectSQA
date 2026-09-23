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
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withRecordSeparator_204673662577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11329;
     Object term11440;
     Object term41687;
     Object term41599;

    public CSVFormat_withRecordSeparator_204673662577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11331 = new Character('L');
        Class<? extends Object> term41710 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term41709 = ((Class) term41710).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term41709).setAccessible(true);
        Object enum121 = ((Field) term41709).get((Object) null);
        Character term11348 = new Character('W');
        Character term11350 = new Character('B');
        term11329 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11378 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term11329, term11329.getClass(), "delimiter", 'n');
        setField(term11329, term11329.getClass(), "quoteChar", term11331);
        setField(term11329, term11329.getClass(), "quotePolicy", enum121);
        setField(term11329, term11329.getClass(), "commentStart", term11348);
        setField(term11329, term11329.getClass(), "escape", term11350);
        setBooleanField(term11329, term11329.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term11329, term11329.getClass(), "ignoreEmptyLines", true);
        setField(term11329, term11329.getClass(), "recordSeparator", "izPpKDErnQ");
        setField(term11329, term11329.getClass(), "nullString", "NnpwZBUTvx");
        setElement(term11378, 0, "tlQSNgTkQX");
        setElement(term11378, 1, "PCipZnmBOF");
        setElement(term11378, 2, "zcorEihhLK");
        setElement(term11378, 3, "GrqozDKFOk");
        setElement(term11378, 4, "CFyoseFGLF");
        setField(term11329, term11329.getClass(), "header", term11378);
        setBooleanField(term11329, term11329.getClass(), "skipHeaderRecord", true);
        term11440 = new Character('a');
        Character term41688 = new Character('L');
        Class<? extends Object> term41960 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term41959 = ((Class) term41960).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term41959).setAccessible(true);
        Object enum122 = ((Field) term41959).get((Object) null);
        Character term41692 = new Character('W');
        Character term41693 = new Character('B');
        term41687 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term41698 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term41687, term41687.getClass(), "delimiter", 'n');
        setField(term41687, term41687.getClass(), "quoteChar", term41688);
        setField(term41687, term41687.getClass(), "quotePolicy", enum122);
        setField(term41687, term41687.getClass(), "commentStart", term41692);
        setField(term41687, term41687.getClass(), "escape", term41693);
        setBooleanField(term41687, term41687.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term41687, term41687.getClass(), "ignoreEmptyLines", true);
        setField(term41687, term41687.getClass(), "recordSeparator", "izPpKDErnQ");
        setField(term41687, term41687.getClass(), "nullString", "NnpwZBUTvx");
        setElement(term41698, 0, "tlQSNgTkQX");
        setElement(term41698, 1, "PCipZnmBOF");
        setElement(term41698, 2, "zcorEihhLK");
        setElement(term41698, 3, "GrqozDKFOk");
        setElement(term41698, 4, "CFyoseFGLF");
        setField(term41687, term41687.getClass(), "header", term41698);
        setBooleanField(term41687, term41687.getClass(), "skipHeaderRecord", true);
        Character term41601 = new Character('L');
        Class<? extends Object> term42210 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term42209 = ((Class) term42210).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term42209).setAccessible(true);
        Object enum123 = ((Field) term42209).get((Object) null);
        Character term41603 = new Character('W');
        Character term41605 = new Character('B');
        term41599 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term41624 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term41599, term41599.getClass(), "delimiter", 'n');
        setField(term41599, term41599.getClass(), "quoteChar", term41601);
        setField(term41599, term41599.getClass(), "quotePolicy", enum123);
        setField(term41599, term41599.getClass(), "commentStart", term41603);
        setField(term41599, term41599.getClass(), "escape", term41605);
        setBooleanField(term41599, term41599.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term41599, term41599.getClass(), "ignoreEmptyLines", true);
        setField(term41599, term41599.getClass(), "recordSeparator", "a");
        setField(term41599, term41599.getClass(), "nullString", "NnpwZBUTvx");
        setElement(term41624, 0, "tlQSNgTkQX");
        setElement(term41624, 1, "PCipZnmBOF");
        setElement(term41624, 2, "zcorEihhLK");
        setElement(term41624, 3, "GrqozDKFOk");
        setElement(term41624, 4, "CFyoseFGLF");
        setField(term41599, term41599.getClass(), "header", term41624);
        setBooleanField(term41599, term41599.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term11440;
        Object retValue = callMethod(klass, "withRecordSeparator", argTypes, term11329, args);
        assertTrue(recursiveEquals(term11329, term41687));
        assertTrue(recursiveEquals(term11440, 'a'));
        assertTrue(recursiveEquals(retValue, term41599));
    }

};


