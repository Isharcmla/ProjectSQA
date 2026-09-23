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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;

public class CSVRecord_get_91017979718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;
     Object term269;

    public CSVRecord_get_91017979718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term208 = new HashMap();
        term195 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term220 = (Object[]) newArray("java.lang.String", 4);
        setField(term195, term195.getClass(), "comment", "RMFIsYGgne");
        setField(term195, term195.getClass(), "mapping", term208);
        setLongField(term195, term195.getClass(), "recordNumber", -8257434502486459194L);
        setElement(term220, 0, "uuaPigETmJ");
        setElement(term220, 1, "MxlszYVzRf");
        setElement(term220, 2, "LQFpaHEwXR");
        setElement(term220, 3, "oVcInYnLWB");
        setField(term195, term195.getClass(), "values", term220);
        term269 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term269;
        try {
            callMethod(klass, "get", argTypes, term195, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


