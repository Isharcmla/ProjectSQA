package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;
import java.lang.Integer;

public class DoubleMetaphone_contains_181178137286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3484;
     Object term3486;

    public DoubleMetaphone_contains_181178137286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3484 = new Integer(-556405712);
        term3486 = new Integer(-1772434990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        Object[] args = new Object[9];
        args[0] = "swZVeJAxjt";
        args[1] = term3484;
        args[2] = term3486;
        args[3] = "xOcJIiQQDu";
        args[4] = "GVizqqzXpy";
        args[5] = "JqXGgAhZPl";
        args[6] = "jiKYgYHqIS";
        args[7] = "DfISiziTgG";
        args[8] = "XqgfKFvPSD";
        callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term3484, -556405712));
        assertTrue(recursiveEquals(term3486, -1772434990));
    }

};


