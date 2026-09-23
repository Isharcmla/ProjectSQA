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

public class StringUtils_splitByWholeSeparatorPreserveAllTokens_1944679075226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2536;
     Object term11954;

    public StringUtils_splitByWholeSeparatorPreserveAllTokens_1944679075226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2536 = new Integer(1622346318);
        term11954 = (Object[]) newArray("java.lang.String", 1);
        setElement(term11954, 0, "eVpkWxjuki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "eVpkWxjuki";
        args[1] = "SJiQaLvSKv";
        args[2] = term2536;
        Object retValue = callMethod(klass, "splitByWholeSeparatorPreserveAllTokens", argTypes, null, args);
        assertTrue(recursiveEquals(term2536, 1622346318));
        assertTrue(recursiveEquals(retValue, term11954));
    }

};


