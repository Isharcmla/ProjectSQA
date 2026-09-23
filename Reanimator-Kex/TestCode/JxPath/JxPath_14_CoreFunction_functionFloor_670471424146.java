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
import java.lang.Double;

public class CoreFunction_functionFloor_670471424146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35816;
     Object term36080;
     Object term36078;

    public CoreFunction_functionFloor_670471424146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35816 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term35692 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        Object term35922 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setElement(term35692, 0, term35922);
        setField(term35816, term35816.getClass(), "args", term35692);
        term36080 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term36081 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        Object term36082 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term36080, term36080.getClass(), "functionCode", 0);
        setIntField(term36082, term36082.getClass(), "functionCode", 0);
        setField(term36082, term36082.getClass(), "args", null);
        setBooleanField(term36082, term36082.getClass(), "contextDependencyKnown", false);
        setBooleanField(term36082, term36082.getClass(), "contextDependent", false);
        setElement(term36081, 0, term36082);
        setField(term36080, term36080.getClass(), "args", term36081);
        setBooleanField(term36080, term36080.getClass(), "contextDependencyKnown", false);
        setBooleanField(term36080, term36080.getClass(), "contextDependent", false);
        term36078 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "functionFloor", argTypes, term35816, args);
        assertTrue(recursiveEquals(term35816, term36080));
        assertTrue(recursiveEquals(retValue, term36078));
    }

};


