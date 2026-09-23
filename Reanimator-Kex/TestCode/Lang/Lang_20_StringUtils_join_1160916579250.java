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

public class StringUtils_join_1160916579250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1786;
     Object term11139;

    public StringUtils_join_1160916579250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1786 = (Object[]) newArray("java.lang.Object", 5);
        Object term1787 = newInstance(Class.forName("java.lang.Object"));
        Object term1788 = newInstance(Class.forName("java.lang.Object"));
        Object term1789 = newInstance(Class.forName("java.lang.Object"));
        Object term1790 = newInstance(Class.forName("java.lang.Object"));
        Object term1791 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1786, 0, term1787);
        setElement(term1786, 1, term1788);
        setElement(term1786, 2, term1789);
        setElement(term1786, 3, term1790);
        setElement(term1786, 4, term1791);
        term11139 = (Object[]) newArray("java.lang.Object", 5);
        Object term11140 = newInstance(Class.forName("java.lang.Object"));
        Object term11141 = newInstance(Class.forName("java.lang.Object"));
        Object term11142 = newInstance(Class.forName("java.lang.Object"));
        Object term11143 = newInstance(Class.forName("java.lang.Object"));
        Object term11144 = newInstance(Class.forName("java.lang.Object"));
        setElement(term11139, 0, term11140);
        setElement(term11139, 1, term11141);
        setElement(term11139, 2, term11142);
        setElement(term11139, 3, term11143);
        setElement(term11139, 4, term11144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1786;
        args[1] = "MAcUBcBckh";
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term1786, term11139));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@1e1b1f2bMAcUBcBckhjava.lang.Object@7f4297c6MAcUBcBckhjava.lang.Object@4396196aMAcUBcBckhjava.lang.Object@6d83fa1MAcUBcBckhjava.lang.Object@7d729bed"));
    }

};


