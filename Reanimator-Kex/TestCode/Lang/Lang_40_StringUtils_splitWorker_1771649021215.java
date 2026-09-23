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
import java.lang.Character;
import java.lang.Boolean;
import java.lang.Object;

public class StringUtils_splitWorker_1771649021215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2610;
     Object term2612;
     Object term12632;

    public StringUtils_splitWorker_1771649021215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2610 = new Character('c');
        term2612 = new Boolean(false);
        term12632 = (Object[]) newArray("java.lang.String", 1);
        setElement(term12632, 0, "yGtHPyvYiQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = char.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "yGtHPyvYiQ";
        args[1] = term2610;
        args[2] = term2612;
        Object retValue = callMethod(klass, "splitWorker", argTypes, null, args);
        assertTrue(recursiveEquals(term2610, 'c'));
        assertTrue(recursiveEquals(term2612, false));
        assertTrue(recursiveEquals(retValue, term12632));
    }

};


