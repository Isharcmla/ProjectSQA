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
import java.lang.Boolean;

public class CoreFunction_compute_1957299869136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34649;
     Object term34790;
     Object term34788;

    public CoreFunction_compute_1957299869136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34649 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term34649, term34649.getClass(), "functionCode", 20);
        term34790 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term34790, term34790.getClass(), "functionCode", 20);
        setField(term34790, term34790.getClass(), "args", null);
        setBooleanField(term34790, term34790.getClass(), "contextDependencyKnown", false);
        setBooleanField(term34790, term34790.getClass(), "contextDependent", false);
        term34788 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "compute", argTypes, term34649, args);
        assertTrue(recursiveEquals(term34649, term34790));
        assertTrue(recursiveEquals(retValue, term34788));
    }

};


