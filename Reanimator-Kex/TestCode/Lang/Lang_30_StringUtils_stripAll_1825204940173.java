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

public class StringUtils_stripAll_1825204940173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;
     Object term7584;
     Object term7486;

    public StringUtils_stripAll_1825204940173() {
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
        term7584 = (Object[]) newArray("java.lang.String", 4);
        setElement(term7584, 0, "tbcdzjIfER");
        setElement(term7584, 1, "HyxfbSQYBe");
        setElement(term7584, 2, "pCTimMblYc");
        setElement(term7584, 3, "hNxWaHcfhY");
        term7486 = (Object[]) newArray("java.lang.String", 4);
        setElement(term7486, 0, "tbcdzjIfE");
        setElement(term7486, 1, "HyxfbSQYBe");
        setElement(term7486, 2, "CTimMblYc");
        setElement(term7486, 3, "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term376;
        args[1] = "RkybSrpybU";
        Object retValue = callMethod(klass, "stripAll", argTypes, null, args);
        assertTrue(recursiveEquals(term376, "RkybSrpybU"));
        assertTrue(recursiveEquals(retValue, term7486));
    }

};


