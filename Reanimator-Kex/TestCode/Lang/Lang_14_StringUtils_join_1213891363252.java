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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class StringUtils_join_1213891363252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1813;
     Object term1831;
     Object term1833;

    public StringUtils_join_1213891363252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1813 = (Object[]) newArray("java.lang.Object", 5);
        Object term1814 = newInstance(Class.forName("java.lang.Object"));
        Object term1815 = newInstance(Class.forName("java.lang.Object"));
        Object term1816 = newInstance(Class.forName("java.lang.Object"));
        Object term1817 = newInstance(Class.forName("java.lang.Object"));
        Object term1818 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1813, 0, term1814);
        setElement(term1813, 1, term1815);
        setElement(term1813, 2, term1816);
        setElement(term1813, 3, term1817);
        setElement(term1813, 4, term1818);
        term1831 = new Integer(-244121226);
        term1833 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term1813;
        args[1] = "oVgzLbrsFr";
        args[2] = term1831;
        args[3] = term1833;
        try {
            callMethod(klass, "join", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


