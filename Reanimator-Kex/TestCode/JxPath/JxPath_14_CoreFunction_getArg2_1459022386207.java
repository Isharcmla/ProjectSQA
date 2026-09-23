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

public class CoreFunction_getArg2_1459022386207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50013;
     Object term63173;

    public CoreFunction_getArg2_1459022386207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50013 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term49897 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 490);
        setField(term50013, term50013.getClass(), "args", term49897);
        term63173 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term63174 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 490);
        setIntField(term63173, term63173.getClass(), "functionCode", 0);
        setField(term63173, term63173.getClass(), "args", term63174);
        setBooleanField(term63173, term63173.getClass(), "contextDependencyKnown", false);
        setBooleanField(term63173, term63173.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArg2", argTypes, term50013, args);
        assertTrue(recursiveEquals(term50013, term63173));
        assertTrue(recursiveEquals(retValue, null));
    }

};


