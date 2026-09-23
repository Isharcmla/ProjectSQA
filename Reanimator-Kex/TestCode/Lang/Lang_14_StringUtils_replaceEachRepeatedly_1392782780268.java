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

public class StringUtils_replaceEachRepeatedly_1392782780268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2505;
     Object term2518;
     Object term13896;
     Object term13899;

    public StringUtils_replaceEachRepeatedly_1392782780268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2505 = (Object[]) newArray("java.lang.String", 1);
        setElement(term2505, 0, "sEnIVFtZuQ");
        term2518 = (Object[]) newArray("java.lang.String", 0);
        term13896 = (Object[]) newArray("java.lang.String", 1);
        setElement(term13896, 0, "sEnIVFtZuQ");
        term13899 = (Object[]) newArray("java.lang.String", 0);
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
        args[1] = term2505;
        args[2] = term2518;
        Object retValue = callMethod(klass, "replaceEachRepeatedly", argTypes, null, args);
        assertTrue(recursiveEquals(term2505, term13896));
        assertTrue(recursiveEquals(term2518, term13899));
        assertTrue(recursiveEquals(retValue, "xBsXSDjXYK"));
    }

};


