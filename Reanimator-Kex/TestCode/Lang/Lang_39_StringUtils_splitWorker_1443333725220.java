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
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;

public class StringUtils_splitWorker_1443333725220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2760;
     Object term2762;
     Object term13444;

    public StringUtils_splitWorker_1443333725220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2760 = new Integer(-1456670397);
        term2762 = new Boolean(false);
        term13444 = (Object[]) newArray("java.lang.String", 2);
        setElement(term13444, 0, "NsDgf");
        setElement(term13444, 1, "so");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "dpNsDgfPso";
        args[1] = "hCWPJQKpdc";
        args[2] = term2760;
        args[3] = term2762;
        Object retValue = callMethod(klass, "splitWorker", argTypes, null, args);
        assertTrue(recursiveEquals(term2760, -1456670397));
        assertTrue(recursiveEquals(term2762, false));
        assertTrue(recursiveEquals(retValue, term13444));
    }

};


