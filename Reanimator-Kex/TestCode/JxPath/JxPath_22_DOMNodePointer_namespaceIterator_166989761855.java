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

public class DOMNodePointer_namespaceIterator_166989761855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806;

    public DOMNodePointer_namespaceIterator_166989761855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term807 = new HashMap();
        HashMap term841 = new HashMap();
        HashMap term846 = new HashMap();
        HashMap term852 = new HashMap();
        HashMap term857 = new HashMap();
        HashMap term863 = new HashMap();
        HashMap term868 = new HashMap();
        HashMap term877 = new HashMap();
        HashMap term882 = new HashMap();
        term806 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term836 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term837 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term838 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term839 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term876 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term806, term806.getClass(), "node", null);
        setField(term806, term806.getClass(), "namespaces", term807);
        setField(term806, term806.getClass(), "defaultNamespace", "pCTimMblYc");
        setField(term806, term806.getClass(), "id", "hNxWaHcfhY");
        setField(term839, term839.getClass(), "parent", null);
        setField(term839, term839.getClass(), "namespaceMap", null);
        setField(term839, term839.getClass(), "reverseMap", null);
        setField(term839, term839.getClass(), "pointer", null);
        setBooleanField(term839, term839.getClass(), "sealed", false);
        setField(term838, term838.getClass(), "parent", term839);
        setField(term838, term838.getClass(), "namespaceMap", term841);
        setField(term838, term838.getClass(), "reverseMap", term846);
        setField(term838, term838.getClass(), "pointer", null);
        setBooleanField(term838, term838.getClass(), "sealed", false);
        setField(term837, term837.getClass(), "parent", term838);
        setField(term837, term837.getClass(), "namespaceMap", term852);
        setField(term837, term837.getClass(), "reverseMap", term857);
        setField(term837, term837.getClass(), "pointer", null);
        setBooleanField(term837, term837.getClass(), "sealed", false);
        setField(term836, term836.getClass(), "parent", term837);
        setField(term836, term836.getClass(), "namespaceMap", term863);
        setField(term836, term836.getClass(), "reverseMap", term868);
        setField(term836, term836.getClass(), "pointer", null);
        setBooleanField(term836, term836.getClass(), "sealed", false);
        setField(term806, term806.getClass(), "localNamespaceResolver", term836);
        setIntField(term806, term806.getClass(), "index", -1955890973);
        setBooleanField(term806, term806.getClass(), "attribute", true);
        setField(term876, term876.getClass(), "parent", null);
        setField(term876, term876.getClass(), "namespaceMap", term877);
        setField(term876, term876.getClass(), "reverseMap", term882);
        setField(term876, term876.getClass(), "pointer", null);
        setBooleanField(term876, term876.getClass(), "sealed", false);
        setField(term806, term806.getClass(), "namespaceResolver", term876);
        setField(term806, term806.getClass(), "exceptionHandler", null);
        setField(term806, term806.getClass(), "rootNode", null);
        setField(term806, term806.getClass(), "parent", null);
        setField(term806, term806.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "namespaceIterator", argTypes, term806, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


