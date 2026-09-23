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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getLength_144090184054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761;
     Object term4330;

    public JDOMNodePointer_getLength_144090184054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term783 = new HashMap();
        HashMap term788 = new HashMap();
        HashMap term794 = new HashMap();
        HashMap term799 = new HashMap();
        HashMap term805 = new HashMap();
        HashMap term810 = new HashMap();
        term761 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term762 = newInstance(Class.forName("java.lang.Object"));
        Object term777 = newInstance(Class.forName("java.lang.Object"));
        Object term778 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term779 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term780 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term781 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term761, term761.getClass(), "node", term762);
        setField(term761, term761.getClass(), "id", "aJlieCFVtF");
        setIntField(term761, term761.getClass(), "index", -1339778481);
        setBooleanField(term761, term761.getClass(), "attribute", false);
        setField(term761, term761.getClass(), "rootNode", term777);
        setField(term781, term781.getClass(), "parent", null);
        setField(term781, term781.getClass(), "namespaceMap", null);
        setField(term781, term781.getClass(), "reverseMap", null);
        setField(term781, term781.getClass(), "pointer", null);
        setField(term781, term781.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term781, term781.getClass(), "sealed", false);
        setField(term780, term780.getClass(), "parent", term781);
        setField(term780, term780.getClass(), "namespaceMap", term783);
        setField(term780, term780.getClass(), "reverseMap", term788);
        setField(term780, term780.getClass(), "pointer", null);
        setField(term780, term780.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term780, term780.getClass(), "sealed", false);
        setField(term779, term779.getClass(), "parent", term780);
        setField(term779, term779.getClass(), "namespaceMap", term794);
        setField(term779, term779.getClass(), "reverseMap", term799);
        setField(term779, term779.getClass(), "pointer", null);
        setField(term779, term779.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term779, term779.getClass(), "sealed", false);
        setField(term778, term778.getClass(), "parent", term779);
        setField(term778, term778.getClass(), "namespaceMap", term805);
        setField(term778, term778.getClass(), "reverseMap", term810);
        setField(term778, term778.getClass(), "pointer", null);
        setField(term778, term778.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term778, term778.getClass(), "sealed", false);
        setField(term761, term761.getClass(), "namespaceResolver", term778);
        setField(term761, term761.getClass(), "parent", null);
        setField(term761, term761.getClass(), "locale", null);
        HashMap term4339 = new HashMap();
        HashMap term4340 = new HashMap();
        HashMap term4341 = new HashMap();
        HashMap term4342 = new HashMap();
        HashMap term4343 = new HashMap();
        HashMap term4344 = new HashMap();
        term4330 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term4331 = newInstance(Class.forName("java.lang.Object"));
        Object term4334 = newInstance(Class.forName("java.lang.Object"));
        Object term4335 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4336 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4337 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4338 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4330, term4330.getClass(), "node", term4331);
        setField(term4330, term4330.getClass(), "id", "aJlieCFVtF");
        setIntField(term4330, term4330.getClass(), "index", -1339778481);
        setBooleanField(term4330, term4330.getClass(), "attribute", false);
        setField(term4330, term4330.getClass(), "rootNode", term4334);
        setField(term4338, term4338.getClass(), "parent", null);
        setField(term4338, term4338.getClass(), "namespaceMap", null);
        setField(term4338, term4338.getClass(), "reverseMap", null);
        setField(term4338, term4338.getClass(), "pointer", null);
        setField(term4338, term4338.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4338, term4338.getClass(), "sealed", false);
        setField(term4337, term4337.getClass(), "parent", term4338);
        setField(term4337, term4337.getClass(), "namespaceMap", term4339);
        setField(term4337, term4337.getClass(), "reverseMap", term4340);
        setField(term4337, term4337.getClass(), "pointer", null);
        setField(term4337, term4337.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4337, term4337.getClass(), "sealed", false);
        setField(term4336, term4336.getClass(), "parent", term4337);
        setField(term4336, term4336.getClass(), "namespaceMap", term4341);
        setField(term4336, term4336.getClass(), "reverseMap", term4342);
        setField(term4336, term4336.getClass(), "pointer", null);
        setField(term4336, term4336.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4336, term4336.getClass(), "sealed", false);
        setField(term4335, term4335.getClass(), "parent", term4336);
        setField(term4335, term4335.getClass(), "namespaceMap", term4343);
        setField(term4335, term4335.getClass(), "reverseMap", term4344);
        setField(term4335, term4335.getClass(), "pointer", null);
        setField(term4335, term4335.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4335, term4335.getClass(), "sealed", false);
        setField(term4330, term4330.getClass(), "namespaceResolver", term4335);
        setField(term4330, term4330.getClass(), "parent", null);
        setField(term4330, term4330.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLength", argTypes, term761, args);
        assertTrue(recursiveEquals(term761, term4330));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


