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

public class CoreFunction_compute_195729986952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term1058;

    public CoreFunction_compute_195729986952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term46 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        setIntField(term44, term44.getClass(), "functionCode", -1339778481);
        setField(term44, term44.getClass(), "args", term46);
        setBooleanField(term44, term44.getClass(), "contextDependencyKnown", true);
        setBooleanField(term44, term44.getClass(), "contextDependent", true);
        term1058 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term1059 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 1);
        setIntField(term1058, term1058.getClass(), "functionCode", -1339778481);
        setField(term1058, term1058.getClass(), "args", term1059);
        setBooleanField(term1058, term1058.getClass(), "contextDependencyKnown", true);
        setBooleanField(term1058, term1058.getClass(), "contextDependent", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "compute", argTypes, term44, args);
        assertTrue(recursiveEquals(term44, term1058));
        assertTrue(recursiveEquals(retValue, null));
    }

};


