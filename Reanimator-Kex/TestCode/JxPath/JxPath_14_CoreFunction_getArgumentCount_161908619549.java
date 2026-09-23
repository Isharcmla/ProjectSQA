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

public class CoreFunction_getArgumentCount_161908619549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term606;

    public CoreFunction_getArgumentCount_161908619549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term31 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 2);
        setIntField(term29, term29.getClass(), "functionCode", -1955890973);
        setField(term29, term29.getClass(), "args", term31);
        setBooleanField(term29, term29.getClass(), "contextDependencyKnown", false);
        setBooleanField(term29, term29.getClass(), "contextDependent", true);
        term606 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term607 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 2);
        setIntField(term606, term606.getClass(), "functionCode", -1955890973);
        setField(term606, term606.getClass(), "args", term607);
        setBooleanField(term606, term606.getClass(), "contextDependencyKnown", false);
        setBooleanField(term606, term606.getClass(), "contextDependent", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArgumentCount", argTypes, term29, args);
        assertTrue(recursiveEquals(term29, term606));
        assertTrue(recursiveEquals(retValue, 2));
    }

};


