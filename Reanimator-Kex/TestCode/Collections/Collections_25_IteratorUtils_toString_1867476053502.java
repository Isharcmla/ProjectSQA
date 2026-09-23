package org.apache.commons.collections4;

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
import java.lang.NullPointerException;
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IteratorUtils_toString_1867476053502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91570;
     Object term91686;

    public IteratorUtils_toString_1867476053502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91570 = newInstance(Class.forName("java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue$Itr"));
        term91686 = newInstance(Class.forName("org.apache.commons.collections4.functors.NOPTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Transformer");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term91570;
        args[1] = term91686;
        args[2] = "";
        args[3] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ";
        try {
            callMethod(klass, "toString", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


