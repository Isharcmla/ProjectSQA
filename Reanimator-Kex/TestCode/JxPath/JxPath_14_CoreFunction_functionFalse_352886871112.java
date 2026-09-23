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
import java.lang.Boolean;

public class CoreFunction_functionFalse_352886871112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29954;
     Object term30081;
     Object term30079;

    public CoreFunction_functionFalse_352886871112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29954 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term29835 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 0);
        setField(term29954, term29954.getClass(), "args", term29835);
        term30081 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term30082 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 0);
        setIntField(term30081, term30081.getClass(), "functionCode", 0);
        setField(term30081, term30081.getClass(), "args", term30082);
        setBooleanField(term30081, term30081.getClass(), "contextDependencyKnown", false);
        setBooleanField(term30081, term30081.getClass(), "contextDependent", false);
        term30079 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "functionFalse", argTypes, term29954, args);
        assertTrue(recursiveEquals(term29954, term30081));
        assertTrue(recursiveEquals(retValue, term30079));
    }

};


