package org.apache.commons.jxpath.ri.compiler;

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
import static org.apache.commons.jxpath.ri.compiler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.compiler.EqualityUtils.*;
import java.lang.Object;

public class CoreOperationEqual_init_17538525103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;

    public CoreOperationEqual_init_17538525103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual"));
        Object[] term15 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 2);
        setField(term14, term14.getClass(), "args", term15);
        setBooleanField(term14, term14.getClass(), "contextDependencyKnown", false);
        setBooleanField(term14, term14.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.Expression");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.Expression");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14));
    }

};


