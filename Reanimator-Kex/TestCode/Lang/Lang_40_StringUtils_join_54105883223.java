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
import java.lang.Character;

public class StringUtils_join_54105883223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2832;
     Object term2839;
     Object term13883;

    public StringUtils_join_54105883223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2832 = (Object[]) newArray("java.lang.Object", 6);
        Object term2833 = newInstance(Class.forName("java.lang.Object"));
        Object term2834 = newInstance(Class.forName("java.lang.Object"));
        Object term2835 = newInstance(Class.forName("java.lang.Object"));
        Object term2836 = newInstance(Class.forName("java.lang.Object"));
        Object term2837 = newInstance(Class.forName("java.lang.Object"));
        Object term2838 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2832, 0, term2833);
        setElement(term2832, 1, term2834);
        setElement(term2832, 2, term2835);
        setElement(term2832, 3, term2836);
        setElement(term2832, 4, term2837);
        setElement(term2832, 5, term2838);
        term2839 = new Character('g');
        term13883 = (Object[]) newArray("java.lang.Object", 6);
        Object term13884 = newInstance(Class.forName("java.lang.Object"));
        Object term13885 = newInstance(Class.forName("java.lang.Object"));
        Object term13886 = newInstance(Class.forName("java.lang.Object"));
        Object term13887 = newInstance(Class.forName("java.lang.Object"));
        Object term13888 = newInstance(Class.forName("java.lang.Object"));
        Object term13889 = newInstance(Class.forName("java.lang.Object"));
        setElement(term13883, 0, term13884);
        setElement(term13883, 1, term13885);
        setElement(term13883, 2, term13886);
        setElement(term13883, 3, term13887);
        setElement(term13883, 4, term13888);
        setElement(term13883, 5, term13889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term2832;
        args[1] = term2839;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term2832, term13883));
        assertTrue(recursiveEquals(term2839, 'g'));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@33dce534gjava.lang.Object@3e5d6cbfgjava.lang.Object@10f0d3bdgjava.lang.Object@14f611begjava.lang.Object@ea5115bgjava.lang.Object@3650ab22"));
    }

};


