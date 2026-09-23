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

public class CSVFormat_toString_993527463321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198734;
     Object term198868;

    public CSVFormat_toString_993527463321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term198786 = new Character((char) 0);
        term198734 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term198734, term198734.getClass(), "delimiter", (char) 0);
        setField(term198734, term198734.getClass(), "escape", null);
        setField(term198734, term198734.getClass(), "quoteChar", null);
        setField(term198734, term198734.getClass(), "commentStart", term198786);
        Character term198869 = new Character((char) 0);
        term198868 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term198868, term198868.getClass(), "delimiter", (char) 0);
        setField(term198868, term198868.getClass(), "quoteChar", null);
        setField(term198868, term198868.getClass(), "quotePolicy", null);
        setField(term198868, term198868.getClass(), "commentStart", term198869);
        setField(term198868, term198868.getClass(), "escape", null);
        setBooleanField(term198868, term198868.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term198868, term198868.getClass(), "ignoreEmptyLines", false);
        setField(term198868, term198868.getClass(), "recordSeparator", null);
        setField(term198868, term198868.getClass(), "nullString", null);
        setField(term198868, term198868.getClass(), "header", null);
        setBooleanField(term198868, term198868.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term198734, args);
        assertTrue(recursiveEquals(term198734, term198868));
        assertTrue(recursiveEquals(retValue, "Delimiter=< > CommentStart=< > SkipHeaderRecord:false"));
    }

};


