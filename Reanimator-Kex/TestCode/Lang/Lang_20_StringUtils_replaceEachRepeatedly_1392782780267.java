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

public class StringUtils_replaceEachRepeatedly_1392782780267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2506;
     Object term2519;
     Object term13272;
     Object term13275;

    public StringUtils_replaceEachRepeatedly_1392782780267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2506 = (Object[]) newArray("java.lang.String", 1);
        setElement(term2506, 0, "sEnIVFtZuQ");
        term2519 = (Object[]) newArray("java.lang.String", 0);
        term13272 = (Object[]) newArray("java.lang.String", 1);
        setElement(term13272, 0, "sEnIVFtZuQ");
        term13275 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "xBsXSDjXYK";
        args[1] = term2506;
        args[2] = term2519;
        Object retValue = callMethod(klass, "replaceEachRepeatedly", argTypes, null, args);
        assertTrue(recursiveEquals(term2506, term13272));
        assertTrue(recursiveEquals(term2519, term13275));
        assertTrue(recursiveEquals(retValue, "xBsXSDjXYK"));
    }

};


