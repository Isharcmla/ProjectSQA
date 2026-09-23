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

public class StringUtils_stripAll_1400325423528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172012;
     Object term316101;
     Object term316080;

    public StringUtils_stripAll_1400325423528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172012 = (Object[]) newArray("java.lang.String", 10);
        setElement(term172012, 0, "                                                                ");
        setElement(term172012, 1, "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        setElement(term172012, 2, "                                                                ");
        setElement(term172012, 3, "                                                                ");
        setElement(term172012, 4, "                                                                ");
        setElement(term172012, 5, "                                                                ");
        setElement(term172012, 6, "                                                                ");
        setElement(term172012, 7, "                                                                ");
        setElement(term172012, 8, "                                                                ");
        setElement(term172012, 9, "                                                                ");
        term316101 = (Object[]) newArray("java.lang.String", 10);
        setElement(term316101, 0, "                                                                ");
        setElement(term316101, 1, "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        setElement(term316101, 2, "                                                                ");
        setElement(term316101, 3, "                                                                ");
        setElement(term316101, 4, "                                                                ");
        setElement(term316101, 5, "                                                                ");
        setElement(term316101, 6, "                                                                ");
        setElement(term316101, 7, "                                                                ");
        setElement(term316101, 8, "                                                                ");
        setElement(term316101, 9, "                                                                ");
        term316080 = (Object[]) newArray("java.lang.String", 10);
        setElement(term316080, 0, "");
        setElement(term316080, 1, "");
        setElement(term316080, 2, "");
        setElement(term316080, 3, "");
        setElement(term316080, 4, "");
        setElement(term316080, 5, "");
        setElement(term316080, 6, "");
        setElement(term316080, 7, "");
        setElement(term316080, 8, "");
        setElement(term316080, 9, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term172012;
        Object retValue = callMethod(klass, "stripAll", argTypes, null, args);
        assertTrue(recursiveEquals(term172012, term316101));
        assertTrue(recursiveEquals(retValue, term316080));
    }

};


