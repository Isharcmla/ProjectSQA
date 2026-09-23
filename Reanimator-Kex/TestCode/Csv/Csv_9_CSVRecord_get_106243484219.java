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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class CSVRecord_get_106243484219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321;

    public CSVRecord_get_106243484219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term334 = new HashMap();
        term321 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term346 = (Object[]) newArray("java.lang.String", 5);
        setField(term321, term321.getClass(), "comment", "aJlieCFVtF");
        setField(term321, term321.getClass(), "mapping", term334);
        setLongField(term321, term321.getClass(), "recordNumber", -8400487765614892086L);
        setElement(term346, 0, "tbcdzjIfER");
        setElement(term346, 1, "HyxfbSQYBe");
        setElement(term346, 2, "pCTimMblYc");
        setElement(term346, 3, "hNxWaHcfhY");
        setElement(term346, 4, "RkybSrpybU");
        setField(term321, term321.getClass(), "values", term346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        try {
            callMethod(klass, "get", argTypes, term321, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


