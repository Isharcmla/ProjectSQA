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

public class CoreFunction_toString_165815840251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term982;

    public CoreFunction_toString_165815840251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term41 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 7);
        setIntField(term39, term39.getClass(), "functionCode", 1227103734);
        setField(term39, term39.getClass(), "args", term41);
        setBooleanField(term39, term39.getClass(), "contextDependencyKnown", false);
        setBooleanField(term39, term39.getClass(), "contextDependent", false);
        term982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term983 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 7);
        setIntField(term982, term982.getClass(), "functionCode", 1227103734);
        setField(term982, term982.getClass(), "args", term983);
        setBooleanField(term982, term982.getClass(), "contextDependencyKnown", false);
        setBooleanField(term982, term982.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term39, args);
        assertTrue(recursiveEquals(term39, term982));
        assertTrue(recursiveEquals(retValue, "unknownFunction1227103734()(null, null, null, null, null, null, null)"));
    }

};


