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

public class CoreFunction_functionName_1828535121342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98562;
     Object term406856;

    public CoreFunction_functionName_1828535121342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98562 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term98431 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        Object term98668 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term98668, term98668.getClass(), "functionCode", 28);
        setElement(term98431, 0, term98668);
        setField(term98562, term98562.getClass(), "args", term98431);
        term406856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term406857 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        Object term406858 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term406856, term406856.getClass(), "functionCode", 0);
        setIntField(term406858, term406858.getClass(), "functionCode", 28);
        setField(term406858, term406858.getClass(), "args", null);
        setBooleanField(term406858, term406858.getClass(), "contextDependencyKnown", false);
        setBooleanField(term406858, term406858.getClass(), "contextDependent", false);
        setElement(term406857, 0, term406858);
        setField(term406856, term406856.getClass(), "args", term406857);
        setBooleanField(term406856, term406856.getClass(), "contextDependencyKnown", false);
        setBooleanField(term406856, term406856.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "functionName", argTypes, term98562, args);
        assertTrue(recursiveEquals(term98562, term406856));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


