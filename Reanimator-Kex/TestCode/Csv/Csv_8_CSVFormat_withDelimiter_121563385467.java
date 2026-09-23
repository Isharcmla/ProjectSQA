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

public class CSVFormat_withDelimiter_121563385467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7723;
     Object term7839;
     Object term30923;
     Object term30585;

    public CSVFormat_withDelimiter_121563385467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7725 = new Character('d');
        Class<? extends Object> term30948 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term30947 = ((Class) term30948).getDeclaredField((String) "NONE");
        ((Field) term30947).setAccessible(true);
        Object enum89 = ((Field) term30947).get((Object) null);
        Character term7735 = new Character('v');
        Character term7737 = new Character('g');
        term7723 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7765 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term7723, term7723.getClass(), "delimiter", 'R');
        setField(term7723, term7723.getClass(), "quoteChar", term7725);
        setField(term7723, term7723.getClass(), "quotePolicy", enum89);
        setField(term7723, term7723.getClass(), "commentStart", term7735);
        setField(term7723, term7723.getClass(), "escape", term7737);
        setBooleanField(term7723, term7723.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term7723, term7723.getClass(), "ignoreEmptyLines", false);
        setField(term7723, term7723.getClass(), "recordSeparator", "yVMkkQhvmN");
        setField(term7723, term7723.getClass(), "nullString", "mvrkADEgpp");
        setElement(term7765, 0, "pXOkjyeIRb");
        setElement(term7765, 1, "GgZWSjxjyE");
        setElement(term7765, 2, "EeBVbzjcCI");
        setElement(term7765, 3, "UfQtPRyWRC");
        setElement(term7765, 4, "FPvxVzzSvD");
        setElement(term7765, 5, "WHcwFgsGFC");
        setField(term7723, term7723.getClass(), "header", term7765);
        setBooleanField(term7723, term7723.getClass(), "skipHeaderRecord", false);
        term7839 = new Character('J');
        Character term30924 = new Character('d');
        Class<? extends Object> term31187 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term31186 = ((Class) term31187).getDeclaredField((String) "NONE");
        ((Field) term31186).setAccessible(true);
        Object enum90 = ((Field) term31186).get((Object) null);
        Character term30928 = new Character('v');
        Character term30929 = new Character('g');
        term30923 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term30934 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term30923, term30923.getClass(), "delimiter", 'R');
        setField(term30923, term30923.getClass(), "quoteChar", term30924);
        setField(term30923, term30923.getClass(), "quotePolicy", enum90);
        setField(term30923, term30923.getClass(), "commentStart", term30928);
        setField(term30923, term30923.getClass(), "escape", term30929);
        setBooleanField(term30923, term30923.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term30923, term30923.getClass(), "ignoreEmptyLines", false);
        setField(term30923, term30923.getClass(), "recordSeparator", "yVMkkQhvmN");
        setField(term30923, term30923.getClass(), "nullString", "mvrkADEgpp");
        setElement(term30934, 0, "pXOkjyeIRb");
        setElement(term30934, 1, "GgZWSjxjyE");
        setElement(term30934, 2, "EeBVbzjcCI");
        setElement(term30934, 3, "UfQtPRyWRC");
        setElement(term30934, 4, "FPvxVzzSvD");
        setElement(term30934, 5, "WHcwFgsGFC");
        setField(term30923, term30923.getClass(), "header", term30934);
        setBooleanField(term30923, term30923.getClass(), "skipHeaderRecord", false);
        Character term30587 = new Character('d');
        Class<? extends Object> term31426 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term31425 = ((Class) term31426).getDeclaredField((String) "NONE");
        ((Field) term31425).setAccessible(true);
        Object enum91 = ((Field) term31425).get((Object) null);
        Character term30597 = new Character('v');
        Character term30599 = new Character('g');
        term30585 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term30627 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term30585, term30585.getClass(), "delimiter", 'J');
        setField(term30585, term30585.getClass(), "quoteChar", term30587);
        setField(term30585, term30585.getClass(), "quotePolicy", enum91);
        setField(term30585, term30585.getClass(), "commentStart", term30597);
        setField(term30585, term30585.getClass(), "escape", term30599);
        setBooleanField(term30585, term30585.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term30585, term30585.getClass(), "ignoreEmptyLines", false);
        setField(term30585, term30585.getClass(), "recordSeparator", "yVMkkQhvmN");
        setField(term30585, term30585.getClass(), "nullString", "mvrkADEgpp");
        setElement(term30627, 0, "pXOkjyeIRb");
        setElement(term30627, 1, "GgZWSjxjyE");
        setElement(term30627, 2, "EeBVbzjcCI");
        setElement(term30627, 3, "UfQtPRyWRC");
        setElement(term30627, 4, "FPvxVzzSvD");
        setElement(term30627, 5, "WHcwFgsGFC");
        setField(term30585, term30585.getClass(), "header", term30627);
        setBooleanField(term30585, term30585.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term7839;
        Object retValue = callMethod(klass, "withDelimiter", argTypes, term7723, args);
        assertTrue(recursiveEquals(term7723, term30923));
        assertTrue(recursiveEquals(term7839, 'J'));
        assertTrue(recursiveEquals(retValue, term30585));
    }

};


