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
import java.lang.Object;

public class CoreFunction_functionFalse_35288687176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;

    public CoreFunction_functionFalse_35288687176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term166 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 5);
        setIntField(term164, term164.getClass(), "functionCode", -226514366);
        setField(term164, term164.getClass(), "args", term166);
        setBooleanField(term164, term164.getClass(), "contextDependencyKnown", false);
        setBooleanField(term164, term164.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "functionFalse", argTypes, term164, args);
            assertTrue(false);
        }
        catch (JXPathInvalidSyntaxException e) {
        }

    }

};


