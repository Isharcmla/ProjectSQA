package org.apache.commons.jxpath.ri.model.jdom;

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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getRelativePositionOfPI_172532433779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3361;

    public JDOMNodePointer_getRelativePositionOfPI_172532433779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3380 = new HashMap();
        HashMap term3385 = new HashMap();
        HashMap term3391 = new HashMap();
        HashMap term3396 = new HashMap();
        HashMap term3402 = new HashMap();
        HashMap term3407 = new HashMap();
        HashMap term3418 = new HashMap();
        HashMap term3423 = new HashMap();
        HashMap term3429 = new HashMap();
        HashMap term3434 = new HashMap();
        HashMap term3440 = new HashMap();
        HashMap term3445 = new HashMap();
        term3361 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3362 = newInstance(Class.forName("java.lang.Object"));
        Object term3375 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3376 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3377 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3378 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3415 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3416 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3417 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3451 = newInstance(Class.forName("java.lang.Object"));
        setField(term3361, term3361.getClass(), "node", term3362);
        setField(term3361, term3361.getClass(), "id", "jDtqGUpnZN");
        setField(term3378, term3378.getClass(), "parent", null);
        setField(term3378, term3378.getClass(), "namespaceMap", null);
        setField(term3378, term3378.getClass(), "reverseMap", null);
        setField(term3378, term3378.getClass(), "pointer", null);
        setBooleanField(term3378, term3378.getClass(), "sealed", false);
        setField(term3377, term3377.getClass(), "parent", term3378);
        setField(term3377, term3377.getClass(), "namespaceMap", term3380);
        setField(term3377, term3377.getClass(), "reverseMap", term3385);
        setField(term3377, term3377.getClass(), "pointer", null);
        setBooleanField(term3377, term3377.getClass(), "sealed", false);
        setField(term3376, term3376.getClass(), "parent", term3377);
        setField(term3376, term3376.getClass(), "namespaceMap", term3391);
        setField(term3376, term3376.getClass(), "reverseMap", term3396);
        setField(term3376, term3376.getClass(), "pointer", null);
        setBooleanField(term3376, term3376.getClass(), "sealed", false);
        setField(term3375, term3375.getClass(), "parent", term3376);
        setField(term3375, term3375.getClass(), "namespaceMap", term3402);
        setField(term3375, term3375.getClass(), "reverseMap", term3407);
        setField(term3375, term3375.getClass(), "pointer", null);
        setBooleanField(term3375, term3375.getClass(), "sealed", false);
        setField(term3361, term3361.getClass(), "localNamespaceResolver", term3375);
        setIntField(term3361, term3361.getClass(), "index", -203030934);
        setBooleanField(term3361, term3361.getClass(), "attribute", true);
        setField(term3417, term3417.getClass(), "parent", null);
        setField(term3417, term3417.getClass(), "namespaceMap", term3418);
        setField(term3417, term3417.getClass(), "reverseMap", term3423);
        setField(term3417, term3417.getClass(), "pointer", null);
        setBooleanField(term3417, term3417.getClass(), "sealed", false);
        setField(term3416, term3416.getClass(), "parent", term3417);
        setField(term3416, term3416.getClass(), "namespaceMap", term3429);
        setField(term3416, term3416.getClass(), "reverseMap", term3434);
        setField(term3416, term3416.getClass(), "pointer", null);
        setBooleanField(term3416, term3416.getClass(), "sealed", false);
        setField(term3415, term3415.getClass(), "parent", term3416);
        setField(term3415, term3415.getClass(), "namespaceMap", term3440);
        setField(term3415, term3415.getClass(), "reverseMap", term3445);
        setField(term3415, term3415.getClass(), "pointer", null);
        setBooleanField(term3415, term3415.getClass(), "sealed", false);
        setField(term3361, term3361.getClass(), "namespaceResolver", term3415);
        setField(term3361, term3361.getClass(), "rootNode", term3451);
        setField(term3361, term3361.getClass(), "parent", null);
        setField(term3361, term3361.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfPI", argTypes, term3361, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


