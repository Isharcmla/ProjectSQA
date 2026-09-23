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

public class CoreFunction_functionName_1828535121234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68415;
     Object term68924;

    public CoreFunction_functionName_1828535121234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68415 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term68287 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        Object term68521 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setElement(term68287, 0, term68521);
        setField(term68415, term68415.getClass(), "args", term68287);
        term68924 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term68925 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        Object term68926 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term68924, term68924.getClass(), "functionCode", 0);
        setIntField(term68926, term68926.getClass(), "functionCode", 0);
        setField(term68926, term68926.getClass(), "args", null);
        setBooleanField(term68926, term68926.getClass(), "contextDependencyKnown", false);
        setBooleanField(term68926, term68926.getClass(), "contextDependent", false);
        setElement(term68925, 0, term68926);
        setField(term68924, term68924.getClass(), "args", term68925);
        setBooleanField(term68924, term68924.getClass(), "contextDependencyKnown", false);
        setBooleanField(term68924, term68924.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "functionName", argTypes, term68415, args);
        assertTrue(recursiveEquals(term68415, term68924));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


