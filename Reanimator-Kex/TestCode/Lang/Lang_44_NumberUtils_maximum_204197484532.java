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
import java.lang.Long;

public class NumberUtils_maximum_204197484532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235;
     Object term237;
     Object term239;

    public NumberUtils_maximum_204197484532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235 = new Long(-8400487765614892086L);
        term237 = new Long(5270370404989704783L);
        term239 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term235;
        args[1] = term237;
        args[2] = term239;
        Object retValue = callMethod(klass, "maximum", argTypes, null, args);
        assertTrue(recursiveEquals(term235, -8400487765614892086L));
        assertTrue(recursiveEquals(term237, 5270370404989704783L));
        assertTrue(recursiveEquals(term239, 7411271909051562686L));
        assertTrue(recursiveEquals(retValue, 7411271909051562686L));
    }

};


