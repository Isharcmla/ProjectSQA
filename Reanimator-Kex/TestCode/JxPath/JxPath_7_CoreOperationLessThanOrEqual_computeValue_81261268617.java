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

public class CoreOperationLessThanOrEqual_computeValue_81261268617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2953;
     Object term3240;
     Object term3226;

    public CoreOperationLessThanOrEqual_computeValue_81261268617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2953 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual"));
        Object[] term2710 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 41);
        Object term3051 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.Constant"));
        Object term3149 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(term3051, term3051.getClass(), "value", null);
        setElement(term2710, 0, term3051);
        setField(term3149, term3149.getClass(), "value", "");
        setElement(term2710, 1, term3149);
        setField(term2953, term2953.getClass(), "args", term2710);
        term3240 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual"));
        Object[] term3241 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 41);
        Object term3242 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.Constant"));
        Object term3243 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(term3242, term3242.getClass(), "value", null);
        setBooleanField(term3242, term3242.getClass(), "contextDependencyKnown", false);
        setBooleanField(term3242, term3242.getClass(), "contextDependent", false);
        setElement(term3241, 0, term3242);
        setField(term3243, term3243.getClass(), "value", "");
        setBooleanField(term3243, term3243.getClass(), "contextDependencyKnown", false);
        setBooleanField(term3243, term3243.getClass(), "contextDependent", false);
        setElement(term3241, 1, term3243);
        setField(term3240, term3240.getClass(), "args", term3241);
        setBooleanField(term3240, term3240.getClass(), "contextDependencyKnown", false);
        setBooleanField(term3240, term3240.getClass(), "contextDependent", false);
        term3226 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "computeValue", argTypes, term2953, args);
        assertTrue(recursiveEquals(term2953, term3240));
        assertTrue(recursiveEquals(retValue, term3226));
    }

};


