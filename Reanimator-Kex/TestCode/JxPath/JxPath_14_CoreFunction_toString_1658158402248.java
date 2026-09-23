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

public class CoreFunction_toString_1658158402248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71814;
     Object term72719;

    public CoreFunction_toString_1658158402248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71814 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term71814, term71814.getClass(), "functionCode", 14);
        term72719 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term72719, term72719.getClass(), "functionCode", 14);
        setField(term72719, term72719.getClass(), "args", null);
        setBooleanField(term72719, term72719.getClass(), "contextDependencyKnown", false);
        setBooleanField(term72719, term72719.getClass(), "contextDependent", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term71814, args);
        assertTrue(recursiveEquals(term71814, term72719));
        assertTrue(recursiveEquals(retValue, "substring()"));
    }

};


