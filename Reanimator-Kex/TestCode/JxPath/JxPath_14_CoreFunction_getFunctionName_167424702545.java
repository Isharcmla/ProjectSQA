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

public class CoreFunction_getFunctionName_167424702545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term272;

    public CoreFunction_getFunctionName_167424702545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term11 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 3);
        setIntField(term9, term9.getClass(), "functionCode", 1484323161);
        setField(term9, term9.getClass(), "args", term11);
        setBooleanField(term9, term9.getClass(), "contextDependencyKnown", false);
        setBooleanField(term9, term9.getClass(), "contextDependent", false);
        term272 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term273 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 3);
        setIntField(term272, term272.getClass(), "functionCode", 1484323161);
        setField(term272, term272.getClass(), "args", term273);
        setBooleanField(term272, term272.getClass(), "contextDependencyKnown", false);
        setBooleanField(term272, term272.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFunctionName", argTypes, term9, args);
        assertTrue(recursiveEquals(term9, term272));
        assertTrue(recursiveEquals(retValue, "unknownFunction1484323161()"));
    }

};


