package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;

public class StringUtils_stripAll_1102485841165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;
     Object term7926;
     Object term7828;

    public StringUtils_stripAll_1102485841165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376 = (Object[]) newArray("java.lang.String", 4);
        setElement(term376, 0, "tbcdzjIfER");
        setElement(term376, 1, "HyxfbSQYBe");
        setElement(term376, 2, "pCTimMblYc");
        setElement(term376, 3, "hNxWaHcfhY");
        term7926 = (Object[]) newArray("java.lang.String", 4);
        setElement(term7926, 0, "tbcdzjIfER");
        setElement(term7926, 1, "HyxfbSQYBe");
        setElement(term7926, 2, "pCTimMblYc");
        setElement(term7926, 3, "hNxWaHcfhY");
        term7828 = (Object[]) newArray("java.lang.String", 4);
        setElement(term7828, 0, "tbcdzjIfE");
        setElement(term7828, 1, "HyxfbSQYBe");
        setElement(term7828, 2, "CTimMblYc");
        setElement(term7828, 3, "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term376;
        args[1] = "RkybSrpybU";
        Object retValue = callMethod(klass, "stripAll", argTypes, null, args);
        assertTrue(recursiveEquals(term376, "RkybSrpybU"));
        assertTrue(recursiveEquals(retValue, term7828));
    }

};


