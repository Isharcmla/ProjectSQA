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
import java.lang.Integer;

public class StringUtils_repeat_1926810296100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4160;

    public StringUtils_repeat_1926810296100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4160 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "VGizxZnyHX";
        args[1] = term4160;
        callMethod(klass, "repeat", argTypes, null, args);
    }

};


