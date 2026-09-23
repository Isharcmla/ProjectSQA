package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class ClassUtils_convertClassesToClassNames_103833903848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224;
     Object term2955;
     Object term2947;

    public ClassUtils_convertClassesToClassNames_103833903848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224 = new LinkedList();
        ((LinkedList) term224).add((Object)null);
        term2955 = new LinkedList();
        ((LinkedList) term2955).add((Object)null);
        term2947 = new ArrayList();
        ((ArrayList) term2947).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.ClassUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term224;
        Object retValue = callMethod(klass, "convertClassesToClassNames", argTypes, null, args);
        assertTrue(recursiveEquals(term224, term2955));
        assertTrue(recursiveEquals(retValue, term2947));
    }

};


