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

public class CoreFunction_functionNormalizeSpace_1620447901336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97307;
     Object term396915;

    public CoreFunction_functionNormalizeSpace_1620447901336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97307 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term97183 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        Object term97413 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setElement(term97183, 0, term97413);
        setField(term97307, term97307.getClass(), "args", term97183);
        term396915 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term396916 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        Object term396917 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term396915, term396915.getClass(), "functionCode", 0);
        setIntField(term396917, term396917.getClass(), "functionCode", 0);
        setField(term396917, term396917.getClass(), "args", null);
        setBooleanField(term396917, term396917.getClass(), "contextDependencyKnown", false);
        setBooleanField(term396917, term396917.getClass(), "contextDependent", false);
        setElement(term396916, 0, term396917);
        setField(term396915, term396915.getClass(), "args", term396916);
        setBooleanField(term396915, term396915.getClass(), "contextDependencyKnown", false);
        setBooleanField(term396915, term396915.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "functionNormalizeSpace", argTypes, term97307, args);
        assertTrue(recursiveEquals(term97307, term396915));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


