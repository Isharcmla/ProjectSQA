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
import java.lang.Object;

public class StringUtils_splitPreserveAllTokens_1491201307216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2608;
     Object term13009;

    public StringUtils_splitPreserveAllTokens_1491201307216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2608 = new Character('L');
        term13009 = (Object[]) newArray("java.lang.String", 1);
        setElement(term13009, 0, "yGtHPyvYiQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = "yGtHPyvYiQ";
        args[1] = term2608;
        Object retValue = callMethod(klass, "splitPreserveAllTokens", argTypes, null, args);
        assertTrue(recursiveEquals(term2608, 'L'));
        assertTrue(recursiveEquals(retValue, term13009));
    }

};


