package org.apache.commons.jxpath.ri;

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
import static org.apache.commons.jxpath.ri.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.EqualityUtils.*;
import java.lang.Object;

public class NamespaceResolver_getNamespaceContextPointer_165876668025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2820;
     Object term2929;

    public NamespaceResolver_getNamespaceContextPointer_165876668025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2820 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2918 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2820, term2820.getClass(), "pointer", null);
        setField(term2918, term2918.getClass(), "pointer", null);
        setField(term2918, term2918.getClass(), "parent", null);
        setField(term2820, term2820.getClass(), "parent", term2918);
        term2929 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2930 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2930, term2930.getClass(), "parent", null);
        setField(term2930, term2930.getClass(), "namespaceMap", null);
        setField(term2930, term2930.getClass(), "reverseMap", null);
        setField(term2930, term2930.getClass(), "pointer", null);
        setBooleanField(term2930, term2930.getClass(), "sealed", false);
        setField(term2929, term2929.getClass(), "parent", term2930);
        setField(term2929, term2929.getClass(), "namespaceMap", null);
        setField(term2929, term2929.getClass(), "reverseMap", null);
        setField(term2929, term2929.getClass(), "pointer", null);
        setBooleanField(term2929, term2929.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceContextPointer", argTypes, term2820, args);
        assertTrue(recursiveEquals(term2820, term2929));
        assertTrue(recursiveEquals(retValue, null));
    }

};


