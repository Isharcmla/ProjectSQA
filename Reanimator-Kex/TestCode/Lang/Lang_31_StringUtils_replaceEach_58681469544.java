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
import java.lang.Object;

public class StringUtils_replaceEach_58681469544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462630;
     Object term462631;

    public StringUtils_replaceEach_58681469544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462630 = (Object[]) newArray("java.lang.String", 496);
        term462631 = (Object[]) newArray("java.lang.String", 496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        args[1] = term462630;
        args[2] = term462631;
        args[3] = false;
        args[4] = 0;
        callMethod(klass, "replaceEach", argTypes, null, args);
    }

};


