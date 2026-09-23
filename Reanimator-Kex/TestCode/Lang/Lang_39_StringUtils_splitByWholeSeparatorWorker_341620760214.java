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

public class StringUtils_splitByWholeSeparatorWorker_341620760214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2550;
     Object term2552;
     Object term12768;

    public StringUtils_splitByWholeSeparatorWorker_341620760214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2550 = new Integer(597278769);
        term2552 = new Boolean(false);
        term12768 = (Object[]) newArray("java.lang.String", 1);
        setElement(term12768, 0, "SJiQaLvSKv");
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
        args[0] = "SJiQaLvSKv";
        args[1] = "OEXDRUKcFl";
        args[2] = term2550;
        args[3] = term2552;
        Object retValue = callMethod(klass, "splitByWholeSeparatorWorker", argTypes, null, args);
        assertTrue(recursiveEquals(term2550, 597278769));
        assertTrue(recursiveEquals(term2552, false));
        assertTrue(recursiveEquals(retValue, term12768));
    }

};


