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
import java.lang.Character;
import java.lang.Boolean;
import java.lang.Object;

public class StringUtils_splitWorker_1156041760217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2632;
     Object term2634;
     Object term13078;

    public StringUtils_splitWorker_1156041760217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2632 = new Character('c');
        term2634 = new Boolean(false);
        term13078 = (Object[]) newArray("java.lang.String", 1);
        setElement(term13078, 0, "MvRIxilFMJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = char.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "MvRIxilFMJ";
        args[1] = term2632;
        args[2] = term2634;
        Object retValue = callMethod(klass, "splitWorker", argTypes, null, args);
        assertTrue(recursiveEquals(term2632, 'c'));
        assertTrue(recursiveEquals(term2634, false));
        assertTrue(recursiveEquals(retValue, term13078));
    }

};


