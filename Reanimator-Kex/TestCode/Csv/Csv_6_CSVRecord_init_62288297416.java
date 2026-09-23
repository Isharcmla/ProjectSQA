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
import java.util.LinkedHashMap;
import java.lang.Long;

public class CSVRecord_init_62288297416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term62;
     Object term97;
     Object term2232;
     Object term2247;
     Object term2258;

    public CSVRecord_init_62288297416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1, 0, "PAEBtnZtTD");
        setElement(term1, 1, "sjlJAEtRrb");
        setElement(term1, 2, "MuLcgQHgqz");
        setElement(term1, 3, "xxtlPwDYFs");
        setElement(term1, 4, "jJCZpVmanW");
        term62 = new LinkedHashMap();
        term97 = new Long(2442117782898005296L);
        LinkedHashMap term2235 = new LinkedHashMap();
        term2232 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term2236 = (Object[]) newArray("java.lang.String", 5);
        setField(term2232, term2232.getClass(), "comment", "SzjVpOQTyS");
        setField(term2232, term2232.getClass(), "mapping", term2235);
        setLongField(term2232, term2232.getClass(), "recordNumber", 2442117782898005296L);
        setElement(term2236, 0, "PAEBtnZtTD");
        setElement(term2236, 1, "sjlJAEtRrb");
        setElement(term2236, 2, "MuLcgQHgqz");
        setElement(term2236, 3, "xxtlPwDYFs");
        setElement(term2236, 4, "jJCZpVmanW");
        setField(term2232, term2232.getClass(), "values", term2236);
        term2247 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2247, 0, "PAEBtnZtTD");
        setElement(term2247, 1, "sjlJAEtRrb");
        setElement(term2247, 2, "MuLcgQHgqz");
        setElement(term2247, 3, "xxtlPwDYFs");
        setElement(term2247, 4, "jJCZpVmanW");
        term2258 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = long.class;
        Object[] args = new Object[4];
        args[0] = term1;
        args[1] = term62;
        args[2] = "SzjVpOQTyS";
        args[3] = term97;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2232));
        assertTrue(recursiveEquals(term1, term2247));
        assertTrue(recursiveEquals(term62, term2258));
        assertTrue(recursiveEquals(term97, 2442117782898005296L));
    }

};


