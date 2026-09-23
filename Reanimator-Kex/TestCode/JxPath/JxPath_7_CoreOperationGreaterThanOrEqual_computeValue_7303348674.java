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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.compiler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CoreOperationGreaterThanOrEqual_computeValue_7303348674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CoreOperationGreaterThanOrEqual_computeValue_7303348674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual"));
        Object[] term2 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 5);
        setField(term1, term1.getClass(), "args", term2);
        setBooleanField(term1, term1.getClass(), "contextDependencyKnown", false);
        setBooleanField(term1, term1.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "computeValue", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


