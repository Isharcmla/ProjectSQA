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

public class CoreOperationLessThanOrEqual_computeValue_81261268623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4374;

    public CoreOperationLessThanOrEqual_computeValue_81261268623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4374 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual"));
        Object[] term4138 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 234);
        Object term4472 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.Constant"));
        Object term4602 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan"));
        setField(term4472, term4472.getClass(), "value", null);
        setElement(term4138, 0, term4472);
        setElement(term4138, 1, term4602);
        setField(term4374, term4374.getClass(), "args", term4138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "computeValue", argTypes, term4374, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


