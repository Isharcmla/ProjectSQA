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
import java.util.HashMap;

public class NamespaceResolver_getNamespaceContextPointer_165876668014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;
     Object term954;

    public NamespaceResolver_getNamespaceContextPointer_165876668014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term201 = new HashMap();
        HashMap term206 = new HashMap();
        HashMap term212 = new HashMap();
        HashMap term217 = new HashMap();
        HashMap term223 = new HashMap();
        HashMap term228 = new HashMap();
        HashMap term234 = new HashMap();
        HashMap term239 = new HashMap();
        term195 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term196 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term197 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term198 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term199 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term199, term199.getClass(), "parent", null);
        setField(term199, term199.getClass(), "namespaceMap", null);
        setField(term199, term199.getClass(), "reverseMap", null);
        setField(term199, term199.getClass(), "pointer", null);
        setBooleanField(term199, term199.getClass(), "sealed", false);
        setField(term198, term198.getClass(), "parent", term199);
        setField(term198, term198.getClass(), "namespaceMap", term201);
        setField(term198, term198.getClass(), "reverseMap", term206);
        setField(term198, term198.getClass(), "pointer", null);
        setBooleanField(term198, term198.getClass(), "sealed", false);
        setField(term197, term197.getClass(), "parent", term198);
        setField(term197, term197.getClass(), "namespaceMap", term212);
        setField(term197, term197.getClass(), "reverseMap", term217);
        setField(term197, term197.getClass(), "pointer", null);
        setBooleanField(term197, term197.getClass(), "sealed", false);
        setField(term196, term196.getClass(), "parent", term197);
        setField(term196, term196.getClass(), "namespaceMap", term223);
        setField(term196, term196.getClass(), "reverseMap", term228);
        setField(term196, term196.getClass(), "pointer", null);
        setBooleanField(term196, term196.getClass(), "sealed", false);
        setField(term195, term195.getClass(), "parent", term196);
        setField(term195, term195.getClass(), "namespaceMap", term234);
        setField(term195, term195.getClass(), "reverseMap", term239);
        setField(term195, term195.getClass(), "pointer", null);
        setBooleanField(term195, term195.getClass(), "sealed", false);
        HashMap term959 = new HashMap();
        HashMap term960 = new HashMap();
        HashMap term961 = new HashMap();
        HashMap term962 = new HashMap();
        HashMap term963 = new HashMap();
        HashMap term964 = new HashMap();
        HashMap term965 = new HashMap();
        HashMap term966 = new HashMap();
        term954 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term955 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term956 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term957 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term958 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term958, term958.getClass(), "parent", null);
        setField(term958, term958.getClass(), "namespaceMap", null);
        setField(term958, term958.getClass(), "reverseMap", null);
        setField(term958, term958.getClass(), "pointer", null);
        setBooleanField(term958, term958.getClass(), "sealed", false);
        setField(term957, term957.getClass(), "parent", term958);
        setField(term957, term957.getClass(), "namespaceMap", term959);
        setField(term957, term957.getClass(), "reverseMap", term960);
        setField(term957, term957.getClass(), "pointer", null);
        setBooleanField(term957, term957.getClass(), "sealed", false);
        setField(term956, term956.getClass(), "parent", term957);
        setField(term956, term956.getClass(), "namespaceMap", term961);
        setField(term956, term956.getClass(), "reverseMap", term962);
        setField(term956, term956.getClass(), "pointer", null);
        setBooleanField(term956, term956.getClass(), "sealed", false);
        setField(term955, term955.getClass(), "parent", term956);
        setField(term955, term955.getClass(), "namespaceMap", term963);
        setField(term955, term955.getClass(), "reverseMap", term964);
        setField(term955, term955.getClass(), "pointer", null);
        setBooleanField(term955, term955.getClass(), "sealed", false);
        setField(term954, term954.getClass(), "parent", term955);
        setField(term954, term954.getClass(), "namespaceMap", term965);
        setField(term954, term954.getClass(), "reverseMap", term966);
        setField(term954, term954.getClass(), "pointer", null);
        setBooleanField(term954, term954.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceContextPointer", argTypes, term195, args);
        assertTrue(recursiveEquals(term195, term954));
        assertTrue(recursiveEquals(retValue, null));
    }

};


