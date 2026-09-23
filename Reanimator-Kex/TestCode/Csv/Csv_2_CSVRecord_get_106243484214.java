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
import java.lang.Object;
import java.util.HashMap;

public class CSVRecord_get_106243484214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197;
     Object term2384;

    public CSVRecord_get_106243484214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term247 = new HashMap();
        term197 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term198 = (Object[]) newArray("java.lang.String", 4);
        setElement(term198, 0, "RMFIsYGgne");
        setElement(term198, 1, "NRdvgJlhkX");
        setElement(term198, 2, "uuaPigETmJ");
        setElement(term198, 3, "MxlszYVzRf");
        setField(term197, term197.getClass(), "values", term198);
        setField(term197, term197.getClass(), "mapping", term247);
        setField(term197, term197.getClass(), "comment", "oVcInYnLWB");
        setLongField(term197, term197.getClass(), "recordNumber", -8257434502486459194L);
        HashMap term2394 = new HashMap();
        term2384 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term2385 = (Object[]) newArray("java.lang.String", 4);
        setElement(term2385, 0, "RMFIsYGgne");
        setElement(term2385, 1, "NRdvgJlhkX");
        setElement(term2385, 2, "uuaPigETmJ");
        setElement(term2385, 3, "MxlszYVzRf");
        setField(term2384, term2384.getClass(), "values", term2385);
        setField(term2384, term2384.getClass(), "mapping", term2394);
        setField(term2384, term2384.getClass(), "comment", "oVcInYnLWB");
        setLongField(term2384, term2384.getClass(), "recordNumber", -8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aJlieCFVtF";
        Object retValue = callMethod(klass, "get", argTypes, term197, args);
        assertTrue(recursiveEquals(term197, term2384));
        assertTrue(recursiveEquals(retValue, null));
    }

};


