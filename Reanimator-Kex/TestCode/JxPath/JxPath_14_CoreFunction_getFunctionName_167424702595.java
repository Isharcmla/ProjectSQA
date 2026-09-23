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

public class CoreFunction_getFunctionName_167424702595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25967;
     Object term26018;

    public CoreFunction_getFunctionName_167424702595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25967 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term25967, term25967.getClass(), "functionCode", 21);
        term26018 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term26018, term26018.getClass(), "functionCode", 21);
        setField(term26018, term26018.getClass(), "args", null);
        setBooleanField(term26018, term26018.getClass(), "contextDependencyKnown", false);
        setBooleanField(term26018, term26018.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFunctionName", argTypes, term25967, args);
        assertTrue(recursiveEquals(term25967, term26018));
        assertTrue(recursiveEquals(retValue, "false"));
    }

};


