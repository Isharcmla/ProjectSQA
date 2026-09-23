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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class NamespaceResolver_getPrefix_202566755116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317;

    public NamespaceResolver_getPrefix_202566755116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term323 = new HashMap();
        HashMap term328 = new HashMap();
        HashMap term334 = new HashMap();
        HashMap term339 = new HashMap();
        HashMap term345 = new HashMap();
        HashMap term350 = new HashMap();
        HashMap term356 = new HashMap();
        HashMap term361 = new HashMap();
        term317 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term318 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term320 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term321 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term321, term321.getClass(), "parent", null);
        setField(term321, term321.getClass(), "namespaceMap", null);
        setField(term321, term321.getClass(), "reverseMap", null);
        setField(term321, term321.getClass(), "pointer", null);
        setBooleanField(term321, term321.getClass(), "sealed", false);
        setField(term320, term320.getClass(), "parent", term321);
        setField(term320, term320.getClass(), "namespaceMap", term323);
        setField(term320, term320.getClass(), "reverseMap", term328);
        setField(term320, term320.getClass(), "pointer", null);
        setBooleanField(term320, term320.getClass(), "sealed", false);
        setField(term319, term319.getClass(), "parent", term320);
        setField(term319, term319.getClass(), "namespaceMap", term334);
        setField(term319, term319.getClass(), "reverseMap", term339);
        setField(term319, term319.getClass(), "pointer", null);
        setBooleanField(term319, term319.getClass(), "sealed", false);
        setField(term318, term318.getClass(), "parent", term319);
        setField(term318, term318.getClass(), "namespaceMap", term345);
        setField(term318, term318.getClass(), "reverseMap", term350);
        setField(term318, term318.getClass(), "pointer", null);
        setBooleanField(term318, term318.getClass(), "sealed", false);
        setField(term317, term317.getClass(), "parent", term318);
        setField(term317, term317.getClass(), "namespaceMap", term356);
        setField(term317, term317.getClass(), "reverseMap", term361);
        setField(term317, term317.getClass(), "pointer", null);
        setBooleanField(term317, term317.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        try {
            callMethod(klass, "getPrefix", argTypes, term317, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


