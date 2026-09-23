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

public class CSVFormat_withCommentMarker_186172062870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8224;
     Object term8341;
     Object term34996;
     Object term34886;

    public CSVFormat_withCommentMarker_186172062870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8226 = new Character('N');
        Class<? extends Object> term35021 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term35020 = ((Class) term35021).getDeclaredField((String) "NONE");
        ((Field) term35020).setAccessible(true);
        Object enum89 = ((Field) term35020).get((Object) null);
        Character term8236 = new Character('R');
        Character term8238 = new Character('d');
        term8224 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8267 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term8224, term8224.getClass(), "delimiter", 'e');
        setField(term8224, term8224.getClass(), "quoteCharacter", term8226);
        setField(term8224, term8224.getClass(), "quoteMode", enum89);
        setField(term8224, term8224.getClass(), "commentMarker", term8236);
        setField(term8224, term8224.getClass(), "escapeCharacter", term8238);
        setBooleanField(term8224, term8224.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term8224, term8224.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term8224, term8224.getClass(), "ignoreEmptyLines", true);
        setField(term8224, term8224.getClass(), "recordSeparator", "yVMkkQhvmN");
        setField(term8224, term8224.getClass(), "nullString", "mvrkADEgpp");
        setElement(term8267, 0, "pXOkjyeIRb");
        setElement(term8267, 1, "GgZWSjxjyE");
        setElement(term8267, 2, "EeBVbzjcCI");
        setElement(term8267, 3, "UfQtPRyWRC");
        setElement(term8267, 4, "FPvxVzzSvD");
        setElement(term8267, 5, "WHcwFgsGFC");
        setField(term8224, term8224.getClass(), "header", term8267);
        setBooleanField(term8224, term8224.getClass(), "skipHeaderRecord", false);
        term8341 = new Character('v');
        Character term34997 = new Character('N');
        Class<? extends Object> term35280 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term35279 = ((Class) term35280).getDeclaredField((String) "NONE");
        ((Field) term35279).setAccessible(true);
        Object enum90 = ((Field) term35279).get((Object) null);
        Character term35001 = new Character('R');
        Character term35002 = new Character('d');
        term34996 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term35007 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term34996, term34996.getClass(), "delimiter", 'e');
        setField(term34996, term34996.getClass(), "quoteCharacter", term34997);
        setField(term34996, term34996.getClass(), "quoteMode", enum90);
        setField(term34996, term34996.getClass(), "commentMarker", term35001);
        setField(term34996, term34996.getClass(), "escapeCharacter", term35002);
        setBooleanField(term34996, term34996.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term34996, term34996.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term34996, term34996.getClass(), "ignoreEmptyLines", true);
        setField(term34996, term34996.getClass(), "recordSeparator", "yVMkkQhvmN");
        setField(term34996, term34996.getClass(), "nullString", "mvrkADEgpp");
        setElement(term35007, 0, "pXOkjyeIRb");
        setElement(term35007, 1, "GgZWSjxjyE");
        setElement(term35007, 2, "EeBVbzjcCI");
        setElement(term35007, 3, "UfQtPRyWRC");
        setElement(term35007, 4, "FPvxVzzSvD");
        setElement(term35007, 5, "WHcwFgsGFC");
        setField(term34996, term34996.getClass(), "header", term35007);
        setBooleanField(term34996, term34996.getClass(), "skipHeaderRecord", false);
        Character term34888 = new Character('N');
        Class<? extends Object> term35539 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term35538 = ((Class) term35539).getDeclaredField((String) "NONE");
        ((Field) term35538).setAccessible(true);
        Object enum91 = ((Field) term35538).get((Object) null);
        Character term34890 = new Character('v');
        Character term34892 = new Character('d');
        term34886 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term34921 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term34886, term34886.getClass(), "delimiter", 'e');
        setField(term34886, term34886.getClass(), "quoteCharacter", term34888);
        setField(term34886, term34886.getClass(), "quoteMode", enum91);
        setField(term34886, term34886.getClass(), "commentMarker", term34890);
        setField(term34886, term34886.getClass(), "escapeCharacter", term34892);
        setBooleanField(term34886, term34886.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term34886, term34886.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term34886, term34886.getClass(), "ignoreEmptyLines", true);
        setField(term34886, term34886.getClass(), "recordSeparator", "yVMkkQhvmN");
        setField(term34886, term34886.getClass(), "nullString", "mvrkADEgpp");
        setElement(term34921, 0, "pXOkjyeIRb");
        setElement(term34921, 1, "GgZWSjxjyE");
        setElement(term34921, 2, "EeBVbzjcCI");
        setElement(term34921, 3, "UfQtPRyWRC");
        setElement(term34921, 4, "FPvxVzzSvD");
        setElement(term34921, 5, "WHcwFgsGFC");
        setField(term34886, term34886.getClass(), "header", term34921);
        setBooleanField(term34886, term34886.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term8341;
        Object retValue = callMethod(klass, "withCommentMarker", argTypes, term8224, args);
        assertTrue(recursiveEquals(term8224, term34996));
        assertTrue(recursiveEquals(term8341, 'v'));
        assertTrue(recursiveEquals(retValue, term34886));
    }

};


