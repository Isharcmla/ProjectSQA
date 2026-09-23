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

public class CSVParser_getHeaderMap_83002299733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27506;
     Object term27510;

    public CSVParser_getHeaderMap_83002299733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27506 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        setField(term27506, term27506.getClass(), "headerMap", null);
        term27510 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        setField(term27510, term27510.getClass(), "format", null);
        setField(term27510, term27510.getClass(), "headerMap", null);
        setField(term27510, term27510.getClass(), "lexer", null);
        setField(term27510, term27510.getClass(), "record", null);
        setLongField(term27510, term27510.getClass(), "recordNumber", 0L);
        setField(term27510, term27510.getClass(), "reusableToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeaderMap", argTypes, term27506, args);
        assertTrue(recursiveEquals(term27506, term27510));
        assertTrue(recursiveEquals(retValue, null));
    }

};


