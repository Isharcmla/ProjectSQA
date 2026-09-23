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

public class CSVRecord_init_62288297412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term62;
     Object term97;
     Object term1791;
     Object term1806;
     Object term1817;

    public CSVRecord_init_62288297412() {
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
        LinkedHashMap term1803 = new LinkedHashMap();
        term1791 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1792 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1792, 0, "PAEBtnZtTD");
        setElement(term1792, 1, "sjlJAEtRrb");
        setElement(term1792, 2, "MuLcgQHgqz");
        setElement(term1792, 3, "xxtlPwDYFs");
        setElement(term1792, 4, "jJCZpVmanW");
        setField(term1791, term1791.getClass(), "values", term1792);
        setField(term1791, term1791.getClass(), "mapping", term1803);
        setField(term1791, term1791.getClass(), "comment", "SzjVpOQTyS");
        setLongField(term1791, term1791.getClass(), "recordNumber", 2442117782898005296L);
        term1806 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1806, 0, "PAEBtnZtTD");
        setElement(term1806, 1, "sjlJAEtRrb");
        setElement(term1806, 2, "MuLcgQHgqz");
        setElement(term1806, 3, "xxtlPwDYFs");
        setElement(term1806, 4, "jJCZpVmanW");
        term1817 = new LinkedHashMap();
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
        assertTrue(recursiveEquals(instance, term1791));
        assertTrue(recursiveEquals(term1, term1806));
        assertTrue(recursiveEquals(term62, term1817));
        assertTrue(recursiveEquals(term97, 2442117782898005296L));
    }

};


