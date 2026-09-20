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

public class DOMNodePointer_isActual_151940046259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1195;
     Object term6709;

    public DOMNodePointer_isActual_151940046259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1196 = new HashMap();
        HashMap term1233 = new HashMap();
        HashMap term1238 = new HashMap();
        HashMap term1244 = new HashMap();
        HashMap term1249 = new HashMap();
        HashMap term1255 = new HashMap();
        HashMap term1260 = new HashMap();
        term1195 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1227 = newInstance(Class.forName("java.lang.Object"));
        Object term1228 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1229 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1230 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1231 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1195, term1195.getClass(), "node", null);
        setField(term1195, term1195.getClass(), "namespaces", term1196);
        setField(term1195, term1195.getClass(), "defaultNamespace", "TEParAifyi");
        setField(term1195, term1195.getClass(), "id", "OWDIEULEFu");
        setIntField(term1195, term1195.getClass(), "index", -522618178);
        setBooleanField(term1195, term1195.getClass(), "attribute", false);
        setField(term1195, term1195.getClass(), "rootNode", term1227);
        setField(term1231, term1231.getClass(), "parent", null);
        setField(term1231, term1231.getClass(), "namespaceMap", null);
        setField(term1231, term1231.getClass(), "reverseMap", null);
        setField(term1231, term1231.getClass(), "pointer", null);
        setField(term1231, term1231.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1231, term1231.getClass(), "sealed", false);
        setField(term1230, term1230.getClass(), "parent", term1231);
        setField(term1230, term1230.getClass(), "namespaceMap", term1233);
        setField(term1230, term1230.getClass(), "reverseMap", term1238);
        setField(term1230, term1230.getClass(), "pointer", null);
        setField(term1230, term1230.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1230, term1230.getClass(), "sealed", false);
        setField(term1229, term1229.getClass(), "parent", term1230);
        setField(term1229, term1229.getClass(), "namespaceMap", term1244);
        setField(term1229, term1229.getClass(), "reverseMap", term1249);
        setField(term1229, term1229.getClass(), "pointer", null);
        setField(term1229, term1229.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1229, term1229.getClass(), "sealed", false);
        setField(term1228, term1228.getClass(), "parent", term1229);
        setField(term1228, term1228.getClass(), "namespaceMap", term1255);
        setField(term1228, term1228.getClass(), "reverseMap", term1260);
        setField(term1228, term1228.getClass(), "pointer", null);
        setField(term1228, term1228.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1228, term1228.getClass(), "sealed", false);
        setField(term1195, term1195.getClass(), "namespaceResolver", term1228);
        setField(term1195, term1195.getClass(), "parent", null);
        setField(term1195, term1195.getClass(), "locale", null);
        HashMap term6710 = new HashMap();
        HashMap term6720 = new HashMap();
        HashMap term6721 = new HashMap();
        HashMap term6722 = new HashMap();
        HashMap term6723 = new HashMap();
        HashMap term6724 = new HashMap();
        HashMap term6725 = new HashMap();
        term6709 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6715 = newInstance(Class.forName("java.lang.Object"));
        Object term6716 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6717 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6718 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6719 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6709, term6709.getClass(), "node", null);
        setField(term6709, term6709.getClass(), "namespaces", term6710);
        setField(term6709, term6709.getClass(), "defaultNamespace", "TEParAifyi");
        setField(term6709, term6709.getClass(), "id", "OWDIEULEFu");
        setIntField(term6709, term6709.getClass(), "index", -522618178);
        setBooleanField(term6709, term6709.getClass(), "attribute", false);
        setField(term6709, term6709.getClass(), "rootNode", term6715);
        setField(term6719, term6719.getClass(), "parent", null);
        setField(term6719, term6719.getClass(), "namespaceMap", null);
        setField(term6719, term6719.getClass(), "reverseMap", null);
        setField(term6719, term6719.getClass(), "pointer", null);
        setField(term6719, term6719.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6719, term6719.getClass(), "sealed", false);
        setField(term6718, term6718.getClass(), "parent", term6719);
        setField(term6718, term6718.getClass(), "namespaceMap", term6720);
        setField(term6718, term6718.getClass(), "reverseMap", term6721);
        setField(term6718, term6718.getClass(), "pointer", null);
        setField(term6718, term6718.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6718, term6718.getClass(), "sealed", false);
        setField(term6717, term6717.getClass(), "parent", term6718);
        setField(term6717, term6717.getClass(), "namespaceMap", term6722);
        setField(term6717, term6717.getClass(), "reverseMap", term6723);
        setField(term6717, term6717.getClass(), "pointer", null);
        setField(term6717, term6717.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6717, term6717.getClass(), "sealed", false);
        setField(term6716, term6716.getClass(), "parent", term6717);
        setField(term6716, term6716.getClass(), "namespaceMap", term6724);
        setField(term6716, term6716.getClass(), "reverseMap", term6725);
        setField(term6716, term6716.getClass(), "pointer", null);
        setField(term6716, term6716.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6716, term6716.getClass(), "sealed", false);
        setField(term6709, term6709.getClass(), "namespaceResolver", term6716);
        setField(term6709, term6709.getClass(), "parent", null);
        setField(term6709, term6709.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isActual", argTypes, term1195, args);
        assertTrue(recursiveEquals(term1195, term6709));
        assertTrue(recursiveEquals(retValue, 1));
    }

};
