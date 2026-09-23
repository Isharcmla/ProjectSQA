package org.apache.commons.lang3.reflect;

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
import static org.apache.commons.lang3.reflect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeUtils_normalizeUpperBounds_1633234157157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25142;

    public TypeUtils_normalizeUpperBounds_1633234157157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25240 = Class.forName((String) "java.nio.DirectFloatBufferU");
        term25142 = (Object[]) newArray("java.lang.reflect.Type", 4);
        setElement(term25142, 0, term25240);
        setElement(term25142, 1, term25240);
        setElement(term25142, 2, term25240);
        setElement(term25142, 3, term25240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.reflect.TypeUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.reflect.Type"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term25142;
        callMethod(klass, "normalizeUpperBounds", argTypes, null, args);
    }

};


