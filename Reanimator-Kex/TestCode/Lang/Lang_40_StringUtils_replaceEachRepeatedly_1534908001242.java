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
import java.lang.Object;

public class StringUtils_replaceEachRepeatedly_1534908001242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3528;
     Object term3529;
     Object term16584;
     Object term16585;

    public StringUtils_replaceEachRepeatedly_1534908001242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3528 = (Object[]) newArray("java.lang.String", 0);
        term3529 = (Object[]) newArray("java.lang.String", 2);
        setElement(term3529, 0, "XkIoWJRNwN");
        setElement(term3529, 1, "aNWLJdrZMq");
        term16584 = (Object[]) newArray("java.lang.String", 0);
        term16585 = (Object[]) newArray("java.lang.String", 2);
        setElement(term16585, 0, "XkIoWJRNwN");
        setElement(term16585, 1, "aNWLJdrZMq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "VYkqXKVlAJ";
        args[1] = term3528;
        args[2] = term3529;
        Object retValue = callMethod(klass, "replaceEachRepeatedly", argTypes, null, args);
        assertTrue(recursiveEquals(term3528, term16584));
        assertTrue(recursiveEquals(term3529, term16585));
        assertTrue(recursiveEquals(retValue, "VYkqXKVlAJ"));
    }

};


