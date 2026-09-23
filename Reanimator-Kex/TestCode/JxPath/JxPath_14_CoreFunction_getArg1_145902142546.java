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

public class CoreFunction_getArg1_145902142546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term306;

    public CoreFunction_getArg1_145902142546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term16 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 4);
        setIntField(term14, term14.getClass(), "functionCode", 391863371);
        setField(term14, term14.getClass(), "args", term16);
        setBooleanField(term14, term14.getClass(), "contextDependencyKnown", true);
        setBooleanField(term14, term14.getClass(), "contextDependent", true);
        term306 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term307 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 4);
        setIntField(term306, term306.getClass(), "functionCode", 391863371);
        setField(term306, term306.getClass(), "args", term307);
        setBooleanField(term306, term306.getClass(), "contextDependencyKnown", true);
        setBooleanField(term306, term306.getClass(), "contextDependent", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArg1", argTypes, term14, args);
        assertTrue(recursiveEquals(term14, term306));
        assertTrue(recursiveEquals(retValue, null));
    }

};


