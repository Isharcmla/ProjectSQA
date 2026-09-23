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

public class CSVFormat_isCommentMarkerSet_206455644362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5388;
     Object term29229;

    public CSVFormat_isCommentMarkerSet_206455644362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5390 = new Character('y');
        Class<? extends Object> term29247 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term29246 = ((Class) term29247).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term29246).setAccessible(true);
        Object enum75 = ((Field) term29246).get((Object) null);
        Character term5407 = new Character('S');
        Character term5409 = new Character('M');
        term5388 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5438 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term5388, term5388.getClass(), "delimiter", 'T');
        setField(term5388, term5388.getClass(), "quoteCharacter", term5390);
        setField(term5388, term5388.getClass(), "quoteMode", enum75);
        setField(term5388, term5388.getClass(), "commentMarker", term5407);
        setField(term5388, term5388.getClass(), "escapeCharacter", term5409);
        setBooleanField(term5388, term5388.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term5388, term5388.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term5388, term5388.getClass(), "ignoreEmptyLines", true);
        setField(term5388, term5388.getClass(), "recordSeparator", "jSpAteRute");
        setField(term5388, term5388.getClass(), "nullString", "swZVeJAxjt");
        setElement(term5438, 0, "xOcJIiQQDu");
        setElement(term5438, 1, "GVizqqzXpy");
        setField(term5388, term5388.getClass(), "header", term5438);
        setBooleanField(term5388, term5388.getClass(), "skipHeaderRecord", true);
        Character term29230 = new Character('y');
        Class<? extends Object> term29487 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term29486 = ((Class) term29487).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term29486).setAccessible(true);
        Object enum76 = ((Field) term29486).get((Object) null);
        Character term29234 = new Character('S');
        Character term29235 = new Character('M');
        term29229 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term29240 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term29229, term29229.getClass(), "delimiter", 'T');
        setField(term29229, term29229.getClass(), "quoteCharacter", term29230);
        setField(term29229, term29229.getClass(), "quoteMode", enum76);
        setField(term29229, term29229.getClass(), "commentMarker", term29234);
        setField(term29229, term29229.getClass(), "escapeCharacter", term29235);
        setBooleanField(term29229, term29229.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term29229, term29229.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term29229, term29229.getClass(), "ignoreEmptyLines", true);
        setField(term29229, term29229.getClass(), "recordSeparator", "jSpAteRute");
        setField(term29229, term29229.getClass(), "nullString", "swZVeJAxjt");
        setElement(term29240, 0, "xOcJIiQQDu");
        setElement(term29240, 1, "GVizqqzXpy");
        setField(term29229, term29229.getClass(), "header", term29240);
        setBooleanField(term29229, term29229.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCommentMarkerSet", argTypes, term5388, args);
        assertTrue(recursiveEquals(term5388, term29229));
        assertTrue(recursiveEquals(retValue, true));
    }

};


