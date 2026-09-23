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

public class StringUtils_join_1160916579240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2907;
     Object term14424;

    public StringUtils_join_1160916579240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2907 = (Object[]) newArray("java.lang.Object", 5);
        Object term2908 = newInstance(Class.forName("java.lang.Object"));
        Object term2909 = newInstance(Class.forName("java.lang.Object"));
        Object term2910 = newInstance(Class.forName("java.lang.Object"));
        Object term2911 = newInstance(Class.forName("java.lang.Object"));
        Object term2912 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2907, 0, term2908);
        setElement(term2907, 1, term2909);
        setElement(term2907, 2, term2910);
        setElement(term2907, 3, term2911);
        setElement(term2907, 4, term2912);
        term14424 = (Object[]) newArray("java.lang.Object", 5);
        Object term14425 = newInstance(Class.forName("java.lang.Object"));
        Object term14426 = newInstance(Class.forName("java.lang.Object"));
        Object term14427 = newInstance(Class.forName("java.lang.Object"));
        Object term14428 = newInstance(Class.forName("java.lang.Object"));
        Object term14429 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14424, 0, term14425);
        setElement(term14424, 1, term14426);
        setElement(term14424, 2, term14427);
        setElement(term14424, 3, term14428);
        setElement(term14424, 4, term14429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2907;
        args[1] = "JDaAnsVTGV";
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term2907, term14424));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@6d05b05aJDaAnsVTGVjava.lang.Object@784aabb6JDaAnsVTGVjava.lang.Object@da15505JDaAnsVTGVjava.lang.Object@8902b4bJDaAnsVTGVjava.lang.Object@5dddaf85"));
    }

};


