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

public class CoreFunction_computeValue_1311133670369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178429;

    public CoreFunction_computeValue_1311133670369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178429 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term178172 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 2);
        Object term178549 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide"));
        Object term178665 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ExtensionFunction"));
        setIntField(term178429, term178429.getClass(), "functionCode", 9);
        setElement(term178172, 0, term178549);
        setElement(term178172, 1, term178665);
        setField(term178429, term178429.getClass(), "args", term178172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "computeValue", argTypes, term178429, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


