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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class StringUtils_join_1213891363241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2935;
     Object term2950;
     Object term2952;

    public StringUtils_join_1213891363241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2935 = (Object[]) newArray("java.lang.Object", 2);
        Object term2936 = newInstance(Class.forName("java.lang.Object"));
        Object term2937 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2935, 0, term2936);
        setElement(term2935, 1, term2937);
        term2950 = new Integer(-1007160944);
        term2952 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term2935;
        args[1] = "mLUZFTfjle";
        args[2] = term2950;
        args[3] = term2952;
        try {
            callMethod(klass, "join", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


