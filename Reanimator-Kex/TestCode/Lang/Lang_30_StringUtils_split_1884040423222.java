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
import java.lang.Object;

public class StringUtils_split_1884040423222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2356;
     Object term11502;

    public StringUtils_split_1884040423222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2356 = new Integer(-1685132342);
        term11502 = (Object[]) newArray("java.lang.String", 2);
        setElement(term11502, 0, "AW");
        setElement(term11502, 1, "ooQKkdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "AWRooQKkdW";
        args[1] = "vjxIhXHxGR";
        args[2] = term2356;
        Object retValue = callMethod(klass, "split", argTypes, null, args);
        assertTrue(recursiveEquals(term2356, -1685132342));
        assertTrue(recursiveEquals(retValue, term11502));
    }

};


