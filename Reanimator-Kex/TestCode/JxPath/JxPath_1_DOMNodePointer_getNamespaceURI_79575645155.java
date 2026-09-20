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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getNamespaceURI_79575645155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;
     Object term6145;

    public DOMNodePointer_getNamespaceURI_79575645155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term810 = new HashMap();
        HashMap term847 = new HashMap();
        HashMap term852 = new HashMap();
        HashMap term858 = new HashMap();
        HashMap term863 = new HashMap();
        HashMap term869 = new HashMap();
        HashMap term874 = new HashMap();
        term809 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term841 = newInstance(Class.forName("java.lang.Object"));
        Object term842 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term843 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term845 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term809, term809.getClass(), "node", null);
        setField(term809, term809.getClass(), "namespaces", term810);
        setField(term809, term809.getClass(), "defaultNamespace", "hNxWaHcfhY");
        setField(term809, term809.getClass(), "id", "RkybSrpybU");
        setIntField(term809, term809.getClass(), "index", -2038273078);
        setBooleanField(term809, term809.getClass(), "attribute", false);
        setField(term809, term809.getClass(), "rootNode", term841);
        setField(term845, term845.getClass(), "parent", null);
        setField(term845, term845.getClass(), "namespaceMap", null);
        setField(term845, term845.getClass(), "reverseMap", null);
        setField(term845, term845.getClass(), "pointer", null);
        setField(term845, term845.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term845, term845.getClass(), "sealed", false);
        setField(term844, term844.getClass(), "parent", term845);
        setField(term844, term844.getClass(), "namespaceMap", term847);
        setField(term844, term844.getClass(), "reverseMap", term852);
        setField(term844, term844.getClass(), "pointer", null);
        setField(term844, term844.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term844, term844.getClass(), "sealed", false);
        setField(term843, term843.getClass(), "parent", term844);
        setField(term843, term843.getClass(), "namespaceMap", term858);
        setField(term843, term843.getClass(), "reverseMap", term863);
        setField(term843, term843.getClass(), "pointer", null);
        setField(term843, term843.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term843, term843.getClass(), "sealed", false);
        setField(term842, term842.getClass(), "parent", term843);
        setField(term842, term842.getClass(), "namespaceMap", term869);
        setField(term842, term842.getClass(), "reverseMap", term874);
        setField(term842, term842.getClass(), "pointer", null);
        setField(term842, term842.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term842, term842.getClass(), "sealed", false);
        setField(term809, term809.getClass(), "namespaceResolver", term842);
        setField(term809, term809.getClass(), "parent", null);
        setField(term809, term809.getClass(), "locale", null);
        HashMap term6146 = new HashMap();
        HashMap term6160 = new HashMap();
        HashMap term6161 = new HashMap();
        HashMap term6162 = new HashMap();
        HashMap term6163 = new HashMap();
        HashMap term6164 = new HashMap();
        HashMap term6165 = new HashMap();
        term6145 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6155 = newInstance(Class.forName("java.lang.Object"));
        Object term6156 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6157 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6158 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6159 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6145, term6145.getClass(), "node", null);
        setField(term6145, term6145.getClass(), "namespaces", term6146);
        setField(term6145, term6145.getClass(), "defaultNamespace", "hNxWaHcfhY");
        setField(term6145, term6145.getClass(), "id", "RkybSrpybU");
        setIntField(term6145, term6145.getClass(), "index", -2038273078);
        setBooleanField(term6145, term6145.getClass(), "attribute", false);
        setField(term6145, term6145.getClass(), "rootNode", term6155);
        setField(term6159, term6159.getClass(), "parent", null);
        setField(term6159, term6159.getClass(), "namespaceMap", null);
        setField(term6159, term6159.getClass(), "reverseMap", null);
        setField(term6159, term6159.getClass(), "pointer", null);
        setField(term6159, term6159.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6159, term6159.getClass(), "sealed", false);
        setField(term6158, term6158.getClass(), "parent", term6159);
        setField(term6158, term6158.getClass(), "namespaceMap", term6160);
        setField(term6158, term6158.getClass(), "reverseMap", term6161);
        setField(term6158, term6158.getClass(), "pointer", null);
        setField(term6158, term6158.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6158, term6158.getClass(), "sealed", false);
        setField(term6157, term6157.getClass(), "parent", term6158);
        setField(term6157, term6157.getClass(), "namespaceMap", term6162);
        setField(term6157, term6157.getClass(), "reverseMap", term6163);
        setField(term6157, term6157.getClass(), "pointer", null);
        setField(term6157, term6157.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6157, term6157.getClass(), "sealed", false);
        setField(term6156, term6156.getClass(), "parent", term6157);
        setField(term6156, term6156.getClass(), "namespaceMap", term6164);
        setField(term6156, term6156.getClass(), "reverseMap", term6165);
        setField(term6156, term6156.getClass(), "pointer", null);
        setField(term6156, term6156.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6156, term6156.getClass(), "sealed", false);
        setField(term6145, term6145.getClass(), "namespaceResolver", term6156);
        setField(term6145, term6145.getClass(), "parent", null);
        setField(term6145, term6145.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term809, args);
        assertTrue(recursiveEquals(term809, term6145));
        assertTrue(recursiveEquals(retValue, null));
    }

};
