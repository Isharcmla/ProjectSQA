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

public class CSVFormat_withRecordSeparator_204673662567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29232;
     Object term29326;

    public CSVFormat_withRecordSeparator_204673662567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term29234 = new Character('x');
        Character term29237 = new Character('Y');
        Character term29292 = new Character('x');
        Class<? extends Object> term29369 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term29368 = ((Class) term29369).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term29368).setAccessible(true);
        Object enum65 = ((Field) term29368).get((Object) null);
        term29232 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term29239 = (Object[]) newArray("java.lang.String", 0);
        Object[] term29240 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term29232, term29232.getClass(), "allowMissingColumnNames", false);
        setField(term29232, term29232.getClass(), "commentMarker", term29234);
        setCharField(term29232, term29232.getClass(), "delimiter", 'y');
        setField(term29232, term29232.getClass(), "escapeCharacter", term29237);
        setField(term29232, term29232.getClass(), "header", term29239);
        setElement(term29240, 0, "VuLLXpvPpZ");
        setElement(term29240, 1, "UEdzEKEEEV");
        setElement(term29240, 2, "BcENaQFYSd");
        setField(term29232, term29232.getClass(), "headerComments", term29240);
        setBooleanField(term29232, term29232.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term29232, term29232.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term29232, term29232.getClass(), "ignoreSurroundingSpaces", false);
        setField(term29232, term29232.getClass(), "nullString", "POPYycoDBy");
        setField(term29232, term29232.getClass(), "quoteCharacter", term29292);
        setField(term29232, term29232.getClass(), "quoteMode", enum65);
        setField(term29232, term29232.getClass(), "recordSeparator", "LuWMOXdAPA");
        setBooleanField(term29232, term29232.getClass(), "skipHeaderRecord", true);
        setBooleanField(term29232, term29232.getClass(), "trailingDelimiter", false);
        setBooleanField(term29232, term29232.getClass(), "trim", false);
        setBooleanField(term29232, term29232.getClass(), "autoFlush", true);
        term29326 = new Character('B');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term29326;
        callMethod(klass, "withRecordSeparator", argTypes, term29232, args);
    }

};


