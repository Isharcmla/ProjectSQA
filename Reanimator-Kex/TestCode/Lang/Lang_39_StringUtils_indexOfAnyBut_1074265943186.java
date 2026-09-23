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

public class StringUtils_indexOfAnyBut_1074265943186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1195;
     Object term9688;

    public StringUtils_indexOfAnyBut_1074265943186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1195 = (char[]) newCharArray(1);
        setCharElement(term1195, 0, 'l');
        term9688 = (char[]) newCharArray(1);
        setCharElement(term9688, 0, 'l');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "UoYtihxVaS";
        args[1] = term1195;
        Object retValue = callMethod(klass, "indexOfAnyBut", argTypes, null, args);
        assertTrue(recursiveEquals(term1195, term9688));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


