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

public class StringUtils_join_1160916579227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2875;
     Object term14893;

    public StringUtils_join_1160916579227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2875 = (Object[]) newArray("java.lang.Object", 5);
        Object term2876 = newInstance(Class.forName("java.lang.Object"));
        Object term2877 = newInstance(Class.forName("java.lang.Object"));
        Object term2878 = newInstance(Class.forName("java.lang.Object"));
        Object term2879 = newInstance(Class.forName("java.lang.Object"));
        Object term2880 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2875, 0, term2876);
        setElement(term2875, 1, term2877);
        setElement(term2875, 2, term2878);
        setElement(term2875, 3, term2879);
        setElement(term2875, 4, term2880);
        term14893 = (Object[]) newArray("java.lang.Object", 5);
        Object term14894 = newInstance(Class.forName("java.lang.Object"));
        Object term14895 = newInstance(Class.forName("java.lang.Object"));
        Object term14896 = newInstance(Class.forName("java.lang.Object"));
        Object term14897 = newInstance(Class.forName("java.lang.Object"));
        Object term14898 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14893, 0, term14894);
        setElement(term14893, 1, term14895);
        setElement(term14893, 2, term14896);
        setElement(term14893, 3, term14897);
        setElement(term14893, 4, term14898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2875;
        args[1] = "lHfTrWKMPk";
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term2875, term14893));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@3aed9018lHfTrWKMPkjava.lang.Object@75749afblHfTrWKMPkjava.lang.Object@be52200lHfTrWKMPkjava.lang.Object@3dcf8e55lHfTrWKMPkjava.lang.Object@41c114e0"));
    }

};


