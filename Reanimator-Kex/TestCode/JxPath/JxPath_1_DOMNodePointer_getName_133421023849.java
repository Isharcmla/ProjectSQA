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

public class DOMNodePointer_getName_133421023849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194;

    public DOMNodePointer_getName_133421023849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term195 = new HashMap();
        HashMap term232 = new HashMap();
        HashMap term237 = new HashMap();
        HashMap term243 = new HashMap();
        HashMap term248 = new HashMap();
        HashMap term254 = new HashMap();
        HashMap term259 = new HashMap();
        term194 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term226 = newInstance(Class.forName("java.lang.Object"));
        Object term227 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term228 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term229 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term230 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term194, term194.getClass(), "node", null);
        setField(term194, term194.getClass(), "namespaces", term195);
        setField(term194, term194.getClass(), "defaultNamespace", "EGtDIRbSSb");
        setField(term194, term194.getClass(), "id", "SzjVpOQTyS");
        setIntField(term194, term194.getClass(), "index", 1162663216);
        setBooleanField(term194, term194.getClass(), "attribute", false);
        setField(term194, term194.getClass(), "rootNode", term226);
        setField(term230, term230.getClass(), "parent", null);
        setField(term230, term230.getClass(), "namespaceMap", null);
        setField(term230, term230.getClass(), "reverseMap", null);
        setField(term230, term230.getClass(), "pointer", null);
        setField(term230, term230.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term230, term230.getClass(), "sealed", false);
        setField(term229, term229.getClass(), "parent", term230);
        setField(term229, term229.getClass(), "namespaceMap", term232);
        setField(term229, term229.getClass(), "reverseMap", term237);
        setField(term229, term229.getClass(), "pointer", null);
        setField(term229, term229.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term229, term229.getClass(), "sealed", false);
        setField(term228, term228.getClass(), "parent", term229);
        setField(term228, term228.getClass(), "namespaceMap", term243);
        setField(term228, term228.getClass(), "reverseMap", term248);
        setField(term228, term228.getClass(), "pointer", null);
        setField(term228, term228.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term228, term228.getClass(), "sealed", false);
        setField(term227, term227.getClass(), "parent", term228);
        setField(term227, term227.getClass(), "namespaceMap", term254);
        setField(term227, term227.getClass(), "reverseMap", term259);
        setField(term227, term227.getClass(), "pointer", null);
        setField(term227, term227.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term227, term227.getClass(), "sealed", false);
        setField(term194, term194.getClass(), "namespaceResolver", term227);
        setField(term194, term194.getClass(), "parent", null);
        setField(term194, term194.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getName", argTypes, term194, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
