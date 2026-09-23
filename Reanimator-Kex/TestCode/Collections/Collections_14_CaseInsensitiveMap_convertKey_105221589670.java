package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;

public class CaseInsensitiveMap_convertKey_105221589670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12551;
     Object term12643;
     Object term12838;
     Object term12839;

    public CaseInsensitiveMap_convertKey_105221589670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12551 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term12643 = newInstance(Class.forName("java.lang.invoke.InvokerBytecodeGenerator$1"));
        term12838 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term12838, term12838.getClass(), "loadFactor", 0.0F);
        setIntField(term12838, term12838.getClass(), "size", 0);
        setField(term12838, term12838.getClass(), "data", null);
        setIntField(term12838, term12838.getClass(), "threshold", 0);
        setIntField(term12838, term12838.getClass(), "modCount", 0);
        setField(term12838, term12838.getClass(), "entrySet", null);
        setField(term12838, term12838.getClass(), "keySet", null);
        setField(term12838, term12838.getClass(), "values", null);
        setField(term12838, term12838.getClass(), "keySet", null);
        setField(term12838, term12838.getClass(), "values", null);
        term12839 = newInstance(Class.forName("java.lang.invoke.InvokerBytecodeGenerator$1"));
        setField(term12839, term12839.getClass(), "val$className", null);
        setField(term12839, term12839.getClass(), "val$classFile", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12643;
        Object retValue = callMethod(klass, "convertKey", argTypes, term12551, args);
        assertTrue(recursiveEquals(term12551, term12838));
        assertTrue(recursiveEquals(term12643, term12839));
        assertTrue(recursiveEquals(retValue, "java.lang.invoke.invokerbytecodegenerator$1@d46f8ba"));
    }

};


