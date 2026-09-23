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

public class CoreOperationEqual_getSymbol_19489905135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term273;

    public CoreOperationEqual_getSymbol_19489905135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual"));
        Object[] term6 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 4);
        setField(term5, term5.getClass(), "args", term6);
        setBooleanField(term5, term5.getClass(), "contextDependencyKnown", false);
        setBooleanField(term5, term5.getClass(), "contextDependent", false);
        term273 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual"));
        Object[] term274 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 4);
        setField(term273, term273.getClass(), "args", term274);
        setBooleanField(term273, term273.getClass(), "contextDependencyKnown", false);
        setBooleanField(term273, term273.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSymbol", argTypes, term5, args);
        assertTrue(recursiveEquals(term5, term273));
        assertTrue(recursiveEquals(retValue, "="));
    }

};


