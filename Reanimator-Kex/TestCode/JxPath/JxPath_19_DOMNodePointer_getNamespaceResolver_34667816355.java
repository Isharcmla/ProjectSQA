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

public class DOMNodePointer_getNamespaceResolver_34667816355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term915;
     Object term6670;
     Object term6587;

    public DOMNodePointer_getNamespaceResolver_34667816355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term916 = new HashMap();
        HashMap term950 = new HashMap();
        HashMap term955 = new HashMap();
        HashMap term961 = new HashMap();
        HashMap term966 = new HashMap();
        HashMap term972 = new HashMap();
        HashMap term977 = new HashMap();
        HashMap term986 = new HashMap();
        HashMap term991 = new HashMap();
        term915 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term945 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term946 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term947 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term948 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term985 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term997 = newInstance(Class.forName("java.lang.Object"));
        setField(term915, term915.getClass(), "node", null);
        setField(term915, term915.getClass(), "namespaces", term916);
        setField(term915, term915.getClass(), "defaultNamespace", "RkybSrpybU");
        setField(term915, term915.getClass(), "id", "xOEqzGAmDU");
        setField(term948, term948.getClass(), "parent", null);
        setField(term948, term948.getClass(), "namespaceMap", null);
        setField(term948, term948.getClass(), "reverseMap", null);
        setField(term948, term948.getClass(), "pointer", null);
        setBooleanField(term948, term948.getClass(), "sealed", false);
        setField(term947, term947.getClass(), "parent", term948);
        setField(term947, term947.getClass(), "namespaceMap", term950);
        setField(term947, term947.getClass(), "reverseMap", term955);
        setField(term947, term947.getClass(), "pointer", null);
        setBooleanField(term947, term947.getClass(), "sealed", false);
        setField(term946, term946.getClass(), "parent", term947);
        setField(term946, term946.getClass(), "namespaceMap", term961);
        setField(term946, term946.getClass(), "reverseMap", term966);
        setField(term946, term946.getClass(), "pointer", null);
        setBooleanField(term946, term946.getClass(), "sealed", false);
        setField(term945, term945.getClass(), "parent", term946);
        setField(term945, term945.getClass(), "namespaceMap", term972);
        setField(term945, term945.getClass(), "reverseMap", term977);
        setField(term945, term945.getClass(), "pointer", null);
        setBooleanField(term945, term945.getClass(), "sealed", false);
        setField(term915, term915.getClass(), "localNamespaceResolver", term945);
        setIntField(term915, term915.getClass(), "index", -2038273078);
        setBooleanField(term915, term915.getClass(), "attribute", false);
        setField(term985, term985.getClass(), "parent", null);
        setField(term985, term985.getClass(), "namespaceMap", term986);
        setField(term985, term985.getClass(), "reverseMap", term991);
        setField(term985, term985.getClass(), "pointer", null);
        setBooleanField(term985, term985.getClass(), "sealed", false);
        setField(term915, term915.getClass(), "namespaceResolver", term985);
        setField(term915, term915.getClass(), "rootNode", term997);
        setField(term915, term915.getClass(), "parent", null);
        setField(term915, term915.getClass(), "locale", null);
        HashMap term6671 = new HashMap();
        HashMap term6680 = new HashMap();
        HashMap term6681 = new HashMap();
        HashMap term6682 = new HashMap();
        HashMap term6683 = new HashMap();
        HashMap term6684 = new HashMap();
        HashMap term6685 = new HashMap();
        HashMap term6687 = new HashMap();
        HashMap term6688 = new HashMap();
        term6670 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6676 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6677 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6678 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6679 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6686 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6689 = newInstance(Class.forName("java.lang.Object"));
        setField(term6670, term6670.getClass(), "node", null);
        setField(term6670, term6670.getClass(), "namespaces", term6671);
        setField(term6670, term6670.getClass(), "defaultNamespace", "RkybSrpybU");
        setField(term6670, term6670.getClass(), "id", "xOEqzGAmDU");
        setField(term6679, term6679.getClass(), "parent", null);
        setField(term6679, term6679.getClass(), "namespaceMap", null);
        setField(term6679, term6679.getClass(), "reverseMap", null);
        setField(term6679, term6679.getClass(), "pointer", null);
        setBooleanField(term6679, term6679.getClass(), "sealed", false);
        setField(term6678, term6678.getClass(), "parent", term6679);
        setField(term6678, term6678.getClass(), "namespaceMap", term6680);
        setField(term6678, term6678.getClass(), "reverseMap", term6681);
        setField(term6678, term6678.getClass(), "pointer", null);
        setBooleanField(term6678, term6678.getClass(), "sealed", false);
        setField(term6677, term6677.getClass(), "parent", term6678);
        setField(term6677, term6677.getClass(), "namespaceMap", term6682);
        setField(term6677, term6677.getClass(), "reverseMap", term6683);
        setField(term6677, term6677.getClass(), "pointer", null);
        setBooleanField(term6677, term6677.getClass(), "sealed", false);
        setField(term6676, term6676.getClass(), "parent", term6677);
        setField(term6676, term6676.getClass(), "namespaceMap", term6684);
        setField(term6676, term6676.getClass(), "reverseMap", term6685);
        setField(term6676, term6676.getClass(), "pointer", null);
        setBooleanField(term6676, term6676.getClass(), "sealed", false);
        setField(term6670, term6670.getClass(), "localNamespaceResolver", term6676);
        setIntField(term6670, term6670.getClass(), "index", -2038273078);
        setBooleanField(term6670, term6670.getClass(), "attribute", false);
        setField(term6686, term6686.getClass(), "parent", null);
        setField(term6686, term6686.getClass(), "namespaceMap", term6687);
        setField(term6686, term6686.getClass(), "reverseMap", term6688);
        setField(term6686, term6686.getClass(), "pointer", null);
        setBooleanField(term6686, term6686.getClass(), "sealed", false);
        setField(term6670, term6670.getClass(), "namespaceResolver", term6686);
        setField(term6670, term6670.getClass(), "rootNode", term6689);
        setField(term6670, term6670.getClass(), "parent", null);
        setField(term6670, term6670.getClass(), "locale", null);
        HashMap term6592 = new HashMap();
        HashMap term6597 = new HashMap();
        HashMap term6603 = new HashMap();
        HashMap term6608 = new HashMap();
        HashMap term6614 = new HashMap();
        HashMap term6619 = new HashMap();
        term6587 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6588 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6589 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6590 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6590, term6590.getClass(), "parent", null);
        setField(term6590, term6590.getClass(), "namespaceMap", null);
        setField(term6590, term6590.getClass(), "reverseMap", null);
        setField(term6590, term6590.getClass(), "pointer", null);
        setBooleanField(term6590, term6590.getClass(), "sealed", false);
        setField(term6589, term6589.getClass(), "parent", term6590);
        setField(term6589, term6589.getClass(), "namespaceMap", term6592);
        setField(term6589, term6589.getClass(), "reverseMap", term6597);
        setField(term6589, term6589.getClass(), "pointer", null);
        setBooleanField(term6589, term6589.getClass(), "sealed", false);
        setField(term6588, term6588.getClass(), "parent", term6589);
        setField(term6588, term6588.getClass(), "namespaceMap", term6603);
        setField(term6588, term6588.getClass(), "reverseMap", term6608);
        setField(term6588, term6588.getClass(), "pointer", null);
        setBooleanField(term6588, term6588.getClass(), "sealed", false);
        setField(term6587, term6587.getClass(), "parent", term6588);
        setField(term6587, term6587.getClass(), "namespaceMap", term6614);
        setField(term6587, term6587.getClass(), "reverseMap", term6619);
        setField(term6587, term6587.getClass(), "pointer", null);
        setBooleanField(term6587, term6587.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceResolver", argTypes, term915, args);
        assertTrue(recursiveEquals(term915, term6670));
        assertTrue(recursiveEquals(retValue, term6587));
    }

};


