package org.mockito;

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
import static org.mockito.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Matchers_refEq_124881142231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;
     Object term19;

    public Matchers_refEq_124881142231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = newInstance(Class.forName("java.lang.Object"));
        term19 = (Object[]) newArray("java.lang.String", 5);
        setElement(term19, 0, "PAEBtnZtTD");
        setElement(term19, 1, "sjlJAEtRrb");
        setElement(term19, 2, "MuLcgQHgqz");
        setElement(term19, 3, "xxtlPwDYFs");
        setElement(term19, 4, "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.Matchers");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term18;
        args[1] = term19;
        callMethod(klass, "refEq", argTypes, null, args);
    }

};


