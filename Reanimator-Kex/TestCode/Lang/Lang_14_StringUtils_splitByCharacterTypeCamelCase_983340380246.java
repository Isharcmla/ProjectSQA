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
import java.lang.Object;

public class StringUtils_splitByCharacterTypeCamelCase_983340380246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10585;

    public StringUtils_splitByCharacterTypeCamelCase_983340380246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10585 = (Object[]) newArray("java.lang.String", 5);
        setElement(term10585, 0, "Koy");
        setElement(term10585, 1, "Gr");
        setElement(term10585, 2, "U");
        setElement(term10585, 3, "Je");
        setElement(term10585, 4, "JW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KoyGrUJeJW";
        Object retValue = callMethod(klass, "splitByCharacterTypeCamelCase", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term10585));
    }

};


