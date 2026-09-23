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

public class DOMNodePointer_getRelativePositionOfElement_110568450076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3119;

    public DOMNodePointer_getRelativePositionOfElement_110568450076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3120 = new HashMap();
        HashMap term3154 = new HashMap();
        HashMap term3159 = new HashMap();
        HashMap term3165 = new HashMap();
        HashMap term3170 = new HashMap();
        HashMap term3176 = new HashMap();
        HashMap term3181 = new HashMap();
        HashMap term3190 = new HashMap();
        HashMap term3195 = new HashMap();
        term3119 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3149 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3150 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3151 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3152 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3189 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3119, term3119.getClass(), "node", null);
        setField(term3119, term3119.getClass(), "namespaces", term3120);
        setField(term3119, term3119.getClass(), "defaultNamespace", "IgRJUzaCwW");
        setField(term3119, term3119.getClass(), "id", "JUmudUmaaV");
        setField(term3152, term3152.getClass(), "parent", null);
        setField(term3152, term3152.getClass(), "namespaceMap", null);
        setField(term3152, term3152.getClass(), "reverseMap", null);
        setField(term3152, term3152.getClass(), "pointer", null);
        setBooleanField(term3152, term3152.getClass(), "sealed", false);
        setField(term3151, term3151.getClass(), "parent", term3152);
        setField(term3151, term3151.getClass(), "namespaceMap", term3154);
        setField(term3151, term3151.getClass(), "reverseMap", term3159);
        setField(term3151, term3151.getClass(), "pointer", null);
        setBooleanField(term3151, term3151.getClass(), "sealed", false);
        setField(term3150, term3150.getClass(), "parent", term3151);
        setField(term3150, term3150.getClass(), "namespaceMap", term3165);
        setField(term3150, term3150.getClass(), "reverseMap", term3170);
        setField(term3150, term3150.getClass(), "pointer", null);
        setBooleanField(term3150, term3150.getClass(), "sealed", false);
        setField(term3149, term3149.getClass(), "parent", term3150);
        setField(term3149, term3149.getClass(), "namespaceMap", term3176);
        setField(term3149, term3149.getClass(), "reverseMap", term3181);
        setField(term3149, term3149.getClass(), "pointer", null);
        setBooleanField(term3149, term3149.getClass(), "sealed", false);
        setField(term3119, term3119.getClass(), "localNamespaceResolver", term3149);
        setIntField(term3119, term3119.getClass(), "index", -1275173084);
        setBooleanField(term3119, term3119.getClass(), "attribute", false);
        setField(term3189, term3189.getClass(), "parent", null);
        setField(term3189, term3189.getClass(), "namespaceMap", term3190);
        setField(term3189, term3189.getClass(), "reverseMap", term3195);
        setField(term3189, term3189.getClass(), "pointer", null);
        setBooleanField(term3189, term3189.getClass(), "sealed", false);
        setField(term3119, term3119.getClass(), "namespaceResolver", term3189);
        setField(term3119, term3119.getClass(), "exceptionHandler", null);
        setField(term3119, term3119.getClass(), "rootNode", null);
        setField(term3119, term3119.getClass(), "parent", null);
        setField(term3119, term3119.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfElement", argTypes, term3119, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


