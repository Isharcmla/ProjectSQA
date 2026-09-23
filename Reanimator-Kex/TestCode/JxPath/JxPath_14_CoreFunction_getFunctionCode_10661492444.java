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

public class CoreFunction_getFunctionCode_10661492444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;
     Object term236;

    public CoreFunction_getFunctionCode_10661492444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term6 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 4);
        setIntField(term4, term4.getClass(), "functionCode", 1162663216);
        setField(term4, term4.getClass(), "args", term6);
        setBooleanField(term4, term4.getClass(), "contextDependencyKnown", false);
        setBooleanField(term4, term4.getClass(), "contextDependent", false);
        term236 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term237 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 4);
        setIntField(term236, term236.getClass(), "functionCode", 1162663216);
        setField(term236, term236.getClass(), "args", term237);
        setBooleanField(term236, term236.getClass(), "contextDependencyKnown", false);
        setBooleanField(term236, term236.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFunctionCode", argTypes, term4, args);
        assertTrue(recursiveEquals(term4, term236));
        assertTrue(recursiveEquals(retValue, 1162663216));
    }

};


