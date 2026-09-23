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

public class CSVFormat_toString_993527463199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94721;
     Object term94802;

    public CSVFormat_toString_993527463199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94721 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term94721, term94721.getClass(), "delimiter", (char) 0);
        setField(term94721, term94721.getClass(), "escape", null);
        setField(term94721, term94721.getClass(), "quoteChar", null);
        setField(term94721, term94721.getClass(), "commentStart", null);
        setField(term94721, term94721.getClass(), "nullString", null);
        setField(term94721, term94721.getClass(), "recordSeparator", null);
        setBooleanField(term94721, term94721.getClass(), "ignoreEmptyLines", true);
        term94802 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term94802, term94802.getClass(), "delimiter", (char) 0);
        setField(term94802, term94802.getClass(), "quoteChar", null);
        setField(term94802, term94802.getClass(), "quotePolicy", null);
        setField(term94802, term94802.getClass(), "commentStart", null);
        setField(term94802, term94802.getClass(), "escape", null);
        setBooleanField(term94802, term94802.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term94802, term94802.getClass(), "ignoreEmptyLines", true);
        setField(term94802, term94802.getClass(), "recordSeparator", null);
        setField(term94802, term94802.getClass(), "nullString", null);
        setField(term94802, term94802.getClass(), "header", null);
        setBooleanField(term94802, term94802.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term94721, args);
        assertTrue(recursiveEquals(term94721, term94802));
        assertTrue(recursiveEquals(retValue, "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    }

};


