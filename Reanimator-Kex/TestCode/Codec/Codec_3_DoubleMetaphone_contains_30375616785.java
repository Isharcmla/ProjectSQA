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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DoubleMetaphone_contains_30375616785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3348;
     Object term3350;

    public DoubleMetaphone_contains_30375616785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3348 = new Integer(1442160736);
        term3350 = new Integer(1114000454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        Object[] args = new Object[8];
        args[0] = "cAPeiZHKGJ";
        args[1] = term3348;
        args[2] = term3350;
        args[3] = "LvJFtLBaxj";
        args[4] = "PHvxnGHptP";
        args[5] = "TimdotUuNC";
        args[6] = "PkWMRdJcBb";
        args[7] = "jSpAteRute";
        try {
            callMethod(klass, "contains", argTypes, null, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


