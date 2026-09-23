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

public class CoreOperationLessThanOrEqual_computeValue_81261268615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2198;

    public CoreOperationLessThanOrEqual_computeValue_81261268615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2198 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual"));
        Object[] term1962 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 498);
        Object term2296 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.Constant"));
        Object term2434 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual"));
        setField(term2296, term2296.getClass(), "value", null);
        setElement(term1962, 0, term2296);
        setElement(term1962, 1, term2434);
        setField(term2198, term2198.getClass(), "args", term1962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "computeValue", argTypes, term2198, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


