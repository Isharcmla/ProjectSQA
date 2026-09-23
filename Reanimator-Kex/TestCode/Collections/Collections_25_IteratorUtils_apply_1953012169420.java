package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;

public class IteratorUtils_apply_1953012169420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66894;
     Object term67000;
     Object term67006;
     Object term67007;

    public IteratorUtils_apply_1953012169420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66894 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Itr"));
        term67000 = newInstance(Class.forName("org.apache.commons.collections4.functors.IfClosure"));
        term67006 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Itr"));
        setField(term67006, term67006.getClass(), "next", null);
        setField(term67006, term67006.getClass(), "nextItem", null);
        setField(term67006, term67006.getClass(), "lastRet", null);
        setField(term67006, term67006.getClass(), "ancestor", null);
        setField(term67006, term67006.getClass(), "this$0", null);
        term67007 = newInstance(Class.forName("org.apache.commons.collections4.functors.IfClosure"));
        setField(term67007, term67007.getClass(), "iPredicate", null);
        setField(term67007, term67007.getClass(), "iTrueClosure", null);
        setField(term67007, term67007.getClass(), "iFalseClosure", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Closure");
        Object[] args = new Object[2];
        args[0] = term66894;
        args[1] = term67000;
        callMethod(klass, "apply", argTypes, null, args);
        assertTrue(recursiveEquals(term66894, term67006));
        assertTrue(recursiveEquals(term67000, term67007));
    }

};


