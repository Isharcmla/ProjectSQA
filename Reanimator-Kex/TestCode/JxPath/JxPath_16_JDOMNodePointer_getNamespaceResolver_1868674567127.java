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

public class JDOMNodePointer_getNamespaceResolver_1868674567127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20713;
     Object term21006;
     Object term20980;

    public JDOMNodePointer_getNamespaceResolver_1868674567127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20713 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term20713, term20713.getClass(), "localNamespaceResolver", null);
        HashMap term21008 = new HashMap();
        term21006 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term21007 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term21006, term21006.getClass(), "node", null);
        setField(term21006, term21006.getClass(), "id", null);
        setField(term21007, term21007.getClass(), "parent", null);
        setField(term21007, term21007.getClass(), "namespaceMap", term21008);
        setField(term21007, term21007.getClass(), "reverseMap", null);
        setField(term21007, term21007.getClass(), "pointer", term21006);
        setBooleanField(term21007, term21007.getClass(), "sealed", false);
        setField(term21006, term21006.getClass(), "localNamespaceResolver", term21007);
        setIntField(term21006, term21006.getClass(), "index", 0);
        setBooleanField(term21006, term21006.getClass(), "attribute", false);
        setField(term21006, term21006.getClass(), "rootNode", null);
        setField(term21006, term21006.getClass(), "namespaceResolver", null);
        setField(term21006, term21006.getClass(), "parent", null);
        setField(term21006, term21006.getClass(), "locale", null);
        HashMap term20981 = new HashMap();
        term20980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term20979 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term20980, term20980.getClass(), "parent", null);
        setField(term20980, term20980.getClass(), "namespaceMap", term20981);
        setField(term20980, term20980.getClass(), "reverseMap", null);
        setField(term20979, term20979.getClass(), "node", null);
        setField(term20979, term20979.getClass(), "id", null);
        setField(term20979, term20979.getClass(), "localNamespaceResolver", term20980);
        setIntField(term20979, term20979.getClass(), "index", 0);
        setBooleanField(term20979, term20979.getClass(), "attribute", false);
        setField(term20979, term20979.getClass(), "rootNode", null);
        setField(term20979, term20979.getClass(), "namespaceResolver", null);
        setField(term20979, term20979.getClass(), "parent", null);
        setField(term20979, term20979.getClass(), "locale", null);
        setField(term20980, term20980.getClass(), "pointer", term20979);
        setBooleanField(term20980, term20980.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceResolver", argTypes, term20713, args);
        assertTrue(recursiveEquals(term20713, term21006));
        assertTrue(recursiveEquals(retValue, term20980));
    }

};


