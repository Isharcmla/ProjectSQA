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
import java.lang.StackOverflowError;
import static org.apache.commons.jxpath.ri.compiler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CoreFunction_functionFormatNumber_780921604365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102395;

    public CoreFunction_functionFormatNumber_780921604365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102395 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term102186 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 2);
        Object term102501 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term102501, term102501.getClass(), "functionCode", 0);
        setElement(term102186, 0, term102501);
        setElement(term102186, 1, term102395);
        setField(term102395, term102395.getClass(), "args", term102186);
        setIntField(term102395, term102395.getClass(), "functionCode", 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "functionFormatNumber", argTypes, term102395, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


