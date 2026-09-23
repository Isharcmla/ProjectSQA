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

public class CoreFunction_computeValue_131113367053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term1065;

    public CoreFunction_computeValue_131113367053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term51 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 6);
        setIntField(term49, term49.getClass(), "functionCode", 1725571209);
        setField(term49, term49.getClass(), "args", term51);
        setBooleanField(term49, term49.getClass(), "contextDependencyKnown", false);
        setBooleanField(term49, term49.getClass(), "contextDependent", false);
        term1065 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term1066 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 6);
        setIntField(term1065, term1065.getClass(), "functionCode", 1725571209);
        setField(term1065, term1065.getClass(), "args", term1066);
        setBooleanField(term1065, term1065.getClass(), "contextDependencyKnown", false);
        setBooleanField(term1065, term1065.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "computeValue", argTypes, term49, args);
        assertTrue(recursiveEquals(term49, term1065));
        assertTrue(recursiveEquals(retValue, null));
    }

};


