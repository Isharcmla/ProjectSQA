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
import org.apache.commons.jxpath.JXPathInvalidSyntaxException;
import static org.apache.commons.jxpath.ri.compiler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CoreFunction_functionConcat_712123640213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63316;

    public CoreFunction_functionConcat_712123640213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63316 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setField(term63316, term63316.getClass(), "args", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "functionConcat", argTypes, term63316, args);
            assertTrue(false);
        }
        catch (JXPathInvalidSyntaxException e) {
        }

    }

};


