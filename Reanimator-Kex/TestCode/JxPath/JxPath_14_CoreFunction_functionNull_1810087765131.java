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

public class CoreFunction_functionNull_1810087765131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33863;
     Object term34242;

    public CoreFunction_functionNull_1810087765131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33863 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setField(term33863, term33863.getClass(), "args", null);
        term34242 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term34242, term34242.getClass(), "functionCode", 0);
        setField(term34242, term34242.getClass(), "args", null);
        setBooleanField(term34242, term34242.getClass(), "contextDependencyKnown", false);
        setBooleanField(term34242, term34242.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "functionNull", argTypes, term33863, args);
        assertTrue(recursiveEquals(term33863, term34242));
        assertTrue(recursiveEquals(retValue, null));
    }

};


