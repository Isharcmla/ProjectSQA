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
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;

public class StringUtils_splitByWholeSeparatorWorker_1708897275212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2528;
     Object term2530;
     Object term12322;

    public StringUtils_splitByWholeSeparatorWorker_1708897275212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2528 = new Integer(597278769);
        term2530 = new Boolean(false);
        term12322 = (Object[]) newArray("java.lang.String", 1);
        setElement(term12322, 0, "eVpkWxjuki");
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
        args[0] = "eVpkWxjuki";
        args[1] = "SJiQaLvSKv";
        args[2] = term2528;
        args[3] = term2530;
        Object retValue = callMethod(klass, "splitByWholeSeparatorWorker", argTypes, null, args);
        assertTrue(recursiveEquals(term2528, 597278769));
        assertTrue(recursiveEquals(term2530, false));
        assertTrue(recursiveEquals(retValue, term12322));
    }

};


