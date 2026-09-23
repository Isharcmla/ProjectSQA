package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;

public class StringUtils_replaceEachRepeatedly_1392782780257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3602;
     Object term3603;
     Object term16535;
     Object term16536;

    public StringUtils_replaceEachRepeatedly_1392782780257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3602 = (Object[]) newArray("java.lang.String", 0);
        term3603 = (Object[]) newArray("java.lang.String", 2);
        setElement(term3603, 0, "PtirvZmsGt");
        setElement(term3603, 1, "HWkpTmtlrc");
        term16535 = (Object[]) newArray("java.lang.String", 0);
        term16536 = (Object[]) newArray("java.lang.String", 2);
        setElement(term16536, 0, "PtirvZmsGt");
        setElement(term16536, 1, "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "HHmNoYxIGj";
        args[1] = term3602;
        args[2] = term3603;
        Object retValue = callMethod(klass, "replaceEachRepeatedly", argTypes, null, args);
        assertTrue(recursiveEquals(term3602, term16535));
        assertTrue(recursiveEquals(term3603, term16536));
        assertTrue(recursiveEquals(retValue, "HHmNoYxIGj"));
    }

};


