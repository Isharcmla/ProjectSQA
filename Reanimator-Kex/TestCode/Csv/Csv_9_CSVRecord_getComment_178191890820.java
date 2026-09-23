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
import java.util.HashMap;
import java.lang.Object;

public class CSVRecord_getComment_178191890820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;
     Object term3448;

    public CSVRecord_getComment_178191890820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term502 = new HashMap();
        term489 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term514 = (Object[]) newArray("java.lang.String", 0);
        setField(term489, term489.getClass(), "comment", "eZFUvlxvGV");
        setField(term489, term489.getClass(), "mapping", term502);
        setLongField(term489, term489.getClass(), "recordNumber", 5270370404989704783L);
        setField(term489, term489.getClass(), "values", term514);
        HashMap term3451 = new HashMap();
        term3448 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term3452 = (Object[]) newArray("java.lang.String", 0);
        setField(term3448, term3448.getClass(), "comment", "eZFUvlxvGV");
        setField(term3448, term3448.getClass(), "mapping", term3451);
        setLongField(term3448, term3448.getClass(), "recordNumber", 5270370404989704783L);
        setField(term3448, term3448.getClass(), "values", term3452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getComment", argTypes, term489, args);
        assertTrue(recursiveEquals(term489, term3448));
        assertTrue(recursiveEquals(retValue, "eZFUvlxvGV"));
    }

};


