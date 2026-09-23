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

public class JDOMNodePointer_getNamespaceResolver_1868674567126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23335;
     Object term23698;
     Object term23657;

    public JDOMNodePointer_getNamespaceResolver_1868674567126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23335 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term23335, term23335.getClass(), "localNamespaceResolver", null);
        HashMap term23700 = new HashMap();
        HashMap term23701 = new HashMap();
        term23698 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term23699 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term23698, term23698.getClass(), "node", null);
        setField(term23698, term23698.getClass(), "id", null);
        setField(term23699, term23699.getClass(), "parent", null);
        setField(term23699, term23699.getClass(), "namespaceMap", term23700);
        setField(term23699, term23699.getClass(), "reverseMap", term23701);
        setField(term23699, term23699.getClass(), "pointer", term23698);
        setBooleanField(term23699, term23699.getClass(), "sealed", false);
        setField(term23698, term23698.getClass(), "localNamespaceResolver", term23699);
        setIntField(term23698, term23698.getClass(), "index", 0);
        setBooleanField(term23698, term23698.getClass(), "attribute", false);
        setField(term23698, term23698.getClass(), "namespaceResolver", null);
        setField(term23698, term23698.getClass(), "rootNode", null);
        setField(term23698, term23698.getClass(), "parent", null);
        setField(term23698, term23698.getClass(), "locale", null);
        HashMap term23658 = new HashMap();
        HashMap term23663 = new HashMap();
        term23657 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term23656 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term23657, term23657.getClass(), "parent", null);
        setField(term23657, term23657.getClass(), "namespaceMap", term23658);
        setField(term23657, term23657.getClass(), "reverseMap", term23663);
        setField(term23656, term23656.getClass(), "node", null);
        setField(term23656, term23656.getClass(), "id", null);
        setField(term23656, term23656.getClass(), "localNamespaceResolver", term23657);
        setIntField(term23656, term23656.getClass(), "index", 0);
        setBooleanField(term23656, term23656.getClass(), "attribute", false);
        setField(term23656, term23656.getClass(), "namespaceResolver", null);
        setField(term23656, term23656.getClass(), "rootNode", null);
        setField(term23656, term23656.getClass(), "parent", null);
        setField(term23656, term23656.getClass(), "locale", null);
        setField(term23657, term23657.getClass(), "pointer", term23656);
        setBooleanField(term23657, term23657.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceResolver", argTypes, term23335, args);
        assertTrue(recursiveEquals(term23335, term23698));
        assertTrue(recursiveEquals(retValue, term23657));
    }

};


