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
import java.lang.Character;

public class StringUtils_join_1313170632238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2886;
     Object term2893;
     Object term13599;

    public StringUtils_join_1313170632238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2886 = (Object[]) newArray("java.lang.Object", 6);
        Object term2887 = newInstance(Class.forName("java.lang.Object"));
        Object term2888 = newInstance(Class.forName("java.lang.Object"));
        Object term2889 = newInstance(Class.forName("java.lang.Object"));
        Object term2890 = newInstance(Class.forName("java.lang.Object"));
        Object term2891 = newInstance(Class.forName("java.lang.Object"));
        Object term2892 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2886, 0, term2887);
        setElement(term2886, 1, term2888);
        setElement(term2886, 2, term2889);
        setElement(term2886, 3, term2890);
        setElement(term2886, 4, term2891);
        setElement(term2886, 5, term2892);
        term2893 = new Character('g');
        term13599 = (Object[]) newArray("java.lang.Object", 6);
        Object term13600 = newInstance(Class.forName("java.lang.Object"));
        Object term13601 = newInstance(Class.forName("java.lang.Object"));
        Object term13602 = newInstance(Class.forName("java.lang.Object"));
        Object term13603 = newInstance(Class.forName("java.lang.Object"));
        Object term13604 = newInstance(Class.forName("java.lang.Object"));
        Object term13605 = newInstance(Class.forName("java.lang.Object"));
        setElement(term13599, 0, term13600);
        setElement(term13599, 1, term13601);
        setElement(term13599, 2, term13602);
        setElement(term13599, 3, term13603);
        setElement(term13599, 4, term13604);
        setElement(term13599, 5, term13605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term2886;
        args[1] = term2893;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term2886, term13599));
        assertTrue(recursiveEquals(term2893, 'g'));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@7c39def6gjava.lang.Object@1a4d73bdgjava.lang.Object@4f74ffbbgjava.lang.Object@b004abagjava.lang.Object@4575e228gjava.lang.Object@3e0c3aca"));
    }

};


