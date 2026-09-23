package org.apache.commons.collections4.keyvalue;

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
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_readResolve_12679746427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term1070;
     Object term1053;

    public MultiKey_readResolve_12679746427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term83 = (Object[]) newArray("java.lang.Object", 7);
        Object term84 = newInstance(Class.forName("java.lang.Object"));
        Object term85 = newInstance(Class.forName("java.lang.Object"));
        Object term86 = newInstance(Class.forName("java.lang.Object"));
        Object term87 = newInstance(Class.forName("java.lang.Object"));
        Object term88 = newInstance(Class.forName("java.lang.Object"));
        Object term89 = newInstance(Class.forName("java.lang.Object"));
        Object term90 = newInstance(Class.forName("java.lang.Object"));
        setElement(term83, 0, term84);
        setElement(term83, 1, term85);
        setElement(term83, 2, term86);
        setElement(term83, 3, term87);
        setElement(term83, 4, term88);
        setElement(term83, 5, term89);
        setElement(term83, 6, term90);
        setField(term82, term82.getClass(), "keys", term83);
        term1070 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term1071 = (Object[]) newArray("java.lang.Object", 7);
        Object term1072 = newInstance(Class.forName("java.lang.Object"));
        Object term1073 = newInstance(Class.forName("java.lang.Object"));
        Object term1074 = newInstance(Class.forName("java.lang.Object"));
        Object term1075 = newInstance(Class.forName("java.lang.Object"));
        Object term1076 = newInstance(Class.forName("java.lang.Object"));
        Object term1077 = newInstance(Class.forName("java.lang.Object"));
        Object term1078 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1071, 0, term1072);
        setElement(term1071, 1, term1073);
        setElement(term1071, 2, term1074);
        setElement(term1071, 3, term1075);
        setElement(term1071, 4, term1076);
        setElement(term1071, 5, term1077);
        setElement(term1071, 6, term1078);
        setField(term1070, term1070.getClass(), "keys", term1071);
        term1053 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term1054 = (Object[]) newArray("java.lang.Object", 7);
        Object term1055 = newInstance(Class.forName("java.lang.Object"));
        Object term1056 = newInstance(Class.forName("java.lang.Object"));
        Object term1057 = newInstance(Class.forName("java.lang.Object"));
        Object term1058 = newInstance(Class.forName("java.lang.Object"));
        Object term1059 = newInstance(Class.forName("java.lang.Object"));
        Object term1060 = newInstance(Class.forName("java.lang.Object"));
        Object term1061 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1054, 0, term1055);
        setElement(term1054, 1, term1056);
        setElement(term1054, 2, term1057);
        setElement(term1054, 3, term1058);
        setElement(term1054, 4, term1059);
        setElement(term1054, 5, term1060);
        setElement(term1054, 6, term1061);
        setField(term1053, term1053.getClass(), "keys", term1054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term82, args);
        assertTrue(recursiveEquals(term82, term1070));
        assertTrue(recursiveEquals(retValue, term1053));
    }

};


