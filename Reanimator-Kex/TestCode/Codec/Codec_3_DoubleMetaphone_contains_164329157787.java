package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Object;

public class DoubleMetaphone_contains_164329157787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3642;
     Object term3644;
     Object term3646;
     Object term18041;

    public DoubleMetaphone_contains_164329157787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3642 = new Integer(-1845499264);
        term3644 = new Integer(-505439934);
        term3646 = (Object[]) newArray("java.lang.String", 5);
        setElement(term3646, 0, "XPKmummaqg");
        setElement(term3646, 1, "BKLfkLiZTH");
        setElement(term3646, 2, "SPpkrGcPRr");
        setElement(term3646, 3, "sEccwbJKYE");
        setElement(term3646, 4, "AWRooQKkdW");
        term18041 = (Object[]) newArray("java.lang.String", 5);
        setElement(term18041, 0, "XPKmummaqg");
        setElement(term18041, 1, "BKLfkLiZTH");
        setElement(term18041, 2, "SPpkrGcPRr");
        setElement(term18041, 3, "sEccwbJKYE");
        setElement(term18041, 4, "AWRooQKkdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = "JiVRgTZvKc";
        args[1] = term3642;
        args[2] = term3644;
        args[3] = term3646;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term3642, -1845499264));
        assertTrue(recursiveEquals(term3644, -505439934));
        assertTrue(recursiveEquals(term3646, term18041));
        assertTrue(recursiveEquals(retValue, false));
    }

};


