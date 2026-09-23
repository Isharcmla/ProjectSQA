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

public class ClassUtils_convertClassNamesToClasses_70712094047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;
     Object term2891;
     Object term2853;

    public ClassUtils_convertClassNamesToClasses_70712094047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146 = new LinkedList();
        ((LinkedList) term146).add("SzjVpOQTyS");
        ((LinkedList) term146).add("MjGYSRKTNF");
        ((LinkedList) term146).add("");
        ((LinkedList) term146).add((Object)null);
        ((LinkedList) term146).add((Object)null);
        ((LinkedList) term146).add((Object)null);
        term2891 = new LinkedList();
        ((LinkedList) term2891).add("SzjVpOQTyS");
        ((LinkedList) term2891).add("MjGYSRKTNF");
        ((LinkedList) term2891).add("");
        ((LinkedList) term2891).add((Object)null);
        ((LinkedList) term2891).add((Object)null);
        ((LinkedList) term2891).add((Object)null);
        term2853 = new ArrayList();
        ((ArrayList) term2853).add((Object)null);
        ((ArrayList) term2853).add((Object)null);
        ((ArrayList) term2853).add((Object)null);
        ((ArrayList) term2853).add((Object)null);
        ((ArrayList) term2853).add((Object)null);
        ((ArrayList) term2853).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.ClassUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term146;
        Object retValue = callMethod(klass, "convertClassNamesToClasses", argTypes, null, args);
        assertTrue(recursiveEquals(term146, term2891));
        assertTrue(recursiveEquals(retValue, term2853));
    }

};


