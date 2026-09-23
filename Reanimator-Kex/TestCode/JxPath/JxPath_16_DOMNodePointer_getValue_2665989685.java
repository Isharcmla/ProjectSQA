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

public class DOMNodePointer_getValue_2665989685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3528;

    public DOMNodePointer_getValue_2665989685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3529 = new HashMap();
        HashMap term3563 = new HashMap();
        HashMap term3568 = new HashMap();
        HashMap term3574 = new HashMap();
        HashMap term3579 = new HashMap();
        HashMap term3585 = new HashMap();
        HashMap term3590 = new HashMap();
        HashMap term3600 = new HashMap();
        term3528 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3558 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3559 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3560 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3561 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3598 = newInstance(Class.forName("java.lang.Object"));
        Object term3599 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3528, term3528.getClass(), "node", null);
        setField(term3528, term3528.getClass(), "namespaces", term3529);
        setField(term3528, term3528.getClass(), "defaultNamespace", "jUbSRrkrYZ");
        setField(term3528, term3528.getClass(), "id", "bWWfajKbEX");
        setField(term3561, term3561.getClass(), "parent", null);
        setField(term3561, term3561.getClass(), "namespaceMap", null);
        setField(term3561, term3561.getClass(), "reverseMap", null);
        setField(term3561, term3561.getClass(), "pointer", null);
        setBooleanField(term3561, term3561.getClass(), "sealed", false);
        setField(term3560, term3560.getClass(), "parent", term3561);
        setField(term3560, term3560.getClass(), "namespaceMap", term3563);
        setField(term3560, term3560.getClass(), "reverseMap", term3568);
        setField(term3560, term3560.getClass(), "pointer", null);
        setBooleanField(term3560, term3560.getClass(), "sealed", false);
        setField(term3559, term3559.getClass(), "parent", term3560);
        setField(term3559, term3559.getClass(), "namespaceMap", term3574);
        setField(term3559, term3559.getClass(), "reverseMap", term3579);
        setField(term3559, term3559.getClass(), "pointer", null);
        setBooleanField(term3559, term3559.getClass(), "sealed", false);
        setField(term3558, term3558.getClass(), "parent", term3559);
        setField(term3558, term3558.getClass(), "namespaceMap", term3585);
        setField(term3558, term3558.getClass(), "reverseMap", term3590);
        setField(term3558, term3558.getClass(), "pointer", null);
        setBooleanField(term3558, term3558.getClass(), "sealed", false);
        setField(term3528, term3528.getClass(), "localNamespaceResolver", term3558);
        setIntField(term3528, term3528.getClass(), "index", -226514366);
        setBooleanField(term3528, term3528.getClass(), "attribute", true);
        setField(term3528, term3528.getClass(), "rootNode", term3598);
        setField(term3599, term3599.getClass(), "parent", null);
        setField(term3599, term3599.getClass(), "namespaceMap", term3600);
        setField(term3599, term3599.getClass(), "reverseMap", null);
        setField(term3599, term3599.getClass(), "pointer", null);
        setBooleanField(term3599, term3599.getClass(), "sealed", false);
        setField(term3528, term3528.getClass(), "namespaceResolver", term3599);
        setField(term3528, term3528.getClass(), "parent", null);
        setField(term3528, term3528.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getValue", argTypes, term3528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


