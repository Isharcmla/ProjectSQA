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

public class StringUtils_splitWorker_1484357056493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207843;

    public StringUtils_splitWorker_1484357056493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207843 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "";
        args[1] = null;
        args[2] = 0;
        args[3] = false;
        Object retValue = callMethod(klass, "splitWorker", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term207843));
    }

};


