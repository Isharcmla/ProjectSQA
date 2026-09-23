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

public class DoubleMetaphone_isSilentStart_1600717128233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329312;
     Object term330416;

    public DoubleMetaphone_isSilentStart_1600717128233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329312 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        term330416 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term330416, term330416.getClass(), "maxCodeLen", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "  \u0004                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        Object retValue = callMethod(klass, "isSilentStart", argTypes, term329312, args);
        assertTrue(recursiveEquals(term329312, term330416));
        assertTrue(recursiveEquals(retValue, false));
    }

};


