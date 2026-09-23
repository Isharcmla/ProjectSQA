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

public class CoreFunction_functionStringLength_1075280517366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102631;
     Object term710129;
     Object term710127;

    public CoreFunction_functionStringLength_1075280517366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102631 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term102503 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        Object term102737 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setElement(term102503, 0, term102737);
        setField(term102631, term102631.getClass(), "args", term102503);
        term710129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term710130 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        Object term710131 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term710129, term710129.getClass(), "functionCode", 0);
        setIntField(term710131, term710131.getClass(), "functionCode", 0);
        setField(term710131, term710131.getClass(), "args", null);
        setBooleanField(term710131, term710131.getClass(), "contextDependencyKnown", false);
        setBooleanField(term710131, term710131.getClass(), "contextDependent", false);
        setElement(term710130, 0, term710131);
        setField(term710129, term710129.getClass(), "args", term710130);
        setBooleanField(term710129, term710129.getClass(), "contextDependencyKnown", false);
        setBooleanField(term710129, term710129.getClass(), "contextDependent", false);
        term710127 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "functionStringLength", argTypes, term102631, args);
        assertTrue(recursiveEquals(term102631, term710129));
        assertTrue(recursiveEquals(retValue, term710127));
    }

};


