package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getRelativePositionOfPI_35429022978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3323;

    public DOMNodePointer_getRelativePositionOfPI_35429022978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3324 = new HashMap();
        HashMap term3358 = new HashMap();
        HashMap term3363 = new HashMap();
        HashMap term3369 = new HashMap();
        HashMap term3374 = new HashMap();
        HashMap term3380 = new HashMap();
        HashMap term3385 = new HashMap();
        HashMap term3394 = new HashMap();
        HashMap term3399 = new HashMap();
        term3323 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3353 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3354 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3355 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3356 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3393 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3323, term3323.getClass(), "node", null);
        setField(term3323, term3323.getClass(), "namespaces", term3324);
        setField(term3323, term3323.getClass(), "defaultNamespace", "MAcUBcBckh");
        setField(term3323, term3323.getClass(), "id", "oVgzLbrsFr");
        setField(term3356, term3356.getClass(), "parent", null);
        setField(term3356, term3356.getClass(), "namespaceMap", null);
        setField(term3356, term3356.getClass(), "reverseMap", null);
        setField(term3356, term3356.getClass(), "pointer", null);
        setBooleanField(term3356, term3356.getClass(), "sealed", false);
        setField(term3355, term3355.getClass(), "parent", term3356);
        setField(term3355, term3355.getClass(), "namespaceMap", term3358);
        setField(term3355, term3355.getClass(), "reverseMap", term3363);
        setField(term3355, term3355.getClass(), "pointer", null);
        setBooleanField(term3355, term3355.getClass(), "sealed", false);
        setField(term3354, term3354.getClass(), "parent", term3355);
        setField(term3354, term3354.getClass(), "namespaceMap", term3369);
        setField(term3354, term3354.getClass(), "reverseMap", term3374);
        setField(term3354, term3354.getClass(), "pointer", null);
        setBooleanField(term3354, term3354.getClass(), "sealed", false);
        setField(term3353, term3353.getClass(), "parent", term3354);
        setField(term3353, term3353.getClass(), "namespaceMap", term3380);
        setField(term3353, term3353.getClass(), "reverseMap", term3385);
        setField(term3353, term3353.getClass(), "pointer", null);
        setBooleanField(term3353, term3353.getClass(), "sealed", false);
        setField(term3323, term3323.getClass(), "localNamespaceResolver", term3353);
        setIntField(term3323, term3323.getClass(), "index", -203030934);
        setBooleanField(term3323, term3323.getClass(), "attribute", true);
        setField(term3393, term3393.getClass(), "parent", null);
        setField(term3393, term3393.getClass(), "namespaceMap", term3394);
        setField(term3393, term3393.getClass(), "reverseMap", term3399);
        setField(term3393, term3393.getClass(), "pointer", null);
        setBooleanField(term3393, term3393.getClass(), "sealed", false);
        setField(term3323, term3323.getClass(), "namespaceResolver", term3393);
        setField(term3323, term3323.getClass(), "exceptionHandler", null);
        setField(term3323, term3323.getClass(), "rootNode", null);
        setField(term3323, term3323.getClass(), "parent", null);
        setField(term3323, term3323.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfPI", argTypes, term3323, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


