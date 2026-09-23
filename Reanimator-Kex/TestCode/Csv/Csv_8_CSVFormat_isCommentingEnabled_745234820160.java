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

public class CSVFormat_isCommentingEnabled_745234820160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75253;
     Object term75261;

    public CSVFormat_isCommentingEnabled_745234820160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75253 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term75253, term75253.getClass(), "commentStart", null);
        term75261 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term75261, term75261.getClass(), "delimiter", (char) 0);
        setField(term75261, term75261.getClass(), "quoteChar", null);
        setField(term75261, term75261.getClass(), "quotePolicy", null);
        setField(term75261, term75261.getClass(), "commentStart", null);
        setField(term75261, term75261.getClass(), "escape", null);
        setBooleanField(term75261, term75261.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term75261, term75261.getClass(), "ignoreEmptyLines", false);
        setField(term75261, term75261.getClass(), "recordSeparator", null);
        setField(term75261, term75261.getClass(), "nullString", null);
        setField(term75261, term75261.getClass(), "header", null);
        setBooleanField(term75261, term75261.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCommentingEnabled", argTypes, term75253, args);
        assertTrue(recursiveEquals(term75253, term75261));
        assertTrue(recursiveEquals(retValue, false));
    }

};


