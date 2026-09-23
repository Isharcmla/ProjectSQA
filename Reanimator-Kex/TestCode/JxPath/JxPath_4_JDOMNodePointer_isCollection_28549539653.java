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

public class JDOMNodePointer_isCollection_28549539653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696;
     Object term4238;

    public JDOMNodePointer_isCollection_28549539653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term718 = new HashMap();
        HashMap term723 = new HashMap();
        HashMap term729 = new HashMap();
        HashMap term734 = new HashMap();
        HashMap term740 = new HashMap();
        HashMap term745 = new HashMap();
        term696 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term697 = newInstance(Class.forName("java.lang.Object"));
        Object term712 = newInstance(Class.forName("java.lang.Object"));
        Object term713 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term714 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term715 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term716 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term696, term696.getClass(), "node", term697);
        setField(term696, term696.getClass(), "id", "oVcInYnLWB");
        setIntField(term696, term696.getClass(), "index", 1227103734);
        setBooleanField(term696, term696.getClass(), "attribute", true);
        setField(term696, term696.getClass(), "rootNode", term712);
        setField(term716, term716.getClass(), "parent", null);
        setField(term716, term716.getClass(), "namespaceMap", null);
        setField(term716, term716.getClass(), "reverseMap", null);
        setField(term716, term716.getClass(), "pointer", null);
        setField(term716, term716.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term716, term716.getClass(), "sealed", false);
        setField(term715, term715.getClass(), "parent", term716);
        setField(term715, term715.getClass(), "namespaceMap", term718);
        setField(term715, term715.getClass(), "reverseMap", term723);
        setField(term715, term715.getClass(), "pointer", null);
        setField(term715, term715.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term715, term715.getClass(), "sealed", false);
        setField(term714, term714.getClass(), "parent", term715);
        setField(term714, term714.getClass(), "namespaceMap", term729);
        setField(term714, term714.getClass(), "reverseMap", term734);
        setField(term714, term714.getClass(), "pointer", null);
        setField(term714, term714.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term714, term714.getClass(), "sealed", false);
        setField(term713, term713.getClass(), "parent", term714);
        setField(term713, term713.getClass(), "namespaceMap", term740);
        setField(term713, term713.getClass(), "reverseMap", term745);
        setField(term713, term713.getClass(), "pointer", null);
        setField(term713, term713.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term713, term713.getClass(), "sealed", false);
        setField(term696, term696.getClass(), "namespaceResolver", term713);
        setField(term696, term696.getClass(), "parent", null);
        setField(term696, term696.getClass(), "locale", null);
        HashMap term4247 = new HashMap();
        HashMap term4248 = new HashMap();
        HashMap term4249 = new HashMap();
        HashMap term4250 = new HashMap();
        HashMap term4251 = new HashMap();
        HashMap term4252 = new HashMap();
        term4238 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term4239 = newInstance(Class.forName("java.lang.Object"));
        Object term4242 = newInstance(Class.forName("java.lang.Object"));
        Object term4243 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4244 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4245 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4246 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4238, term4238.getClass(), "node", term4239);
        setField(term4238, term4238.getClass(), "id", "oVcInYnLWB");
        setIntField(term4238, term4238.getClass(), "index", 1227103734);
        setBooleanField(term4238, term4238.getClass(), "attribute", true);
        setField(term4238, term4238.getClass(), "rootNode", term4242);
        setField(term4246, term4246.getClass(), "parent", null);
        setField(term4246, term4246.getClass(), "namespaceMap", null);
        setField(term4246, term4246.getClass(), "reverseMap", null);
        setField(term4246, term4246.getClass(), "pointer", null);
        setField(term4246, term4246.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4246, term4246.getClass(), "sealed", false);
        setField(term4245, term4245.getClass(), "parent", term4246);
        setField(term4245, term4245.getClass(), "namespaceMap", term4247);
        setField(term4245, term4245.getClass(), "reverseMap", term4248);
        setField(term4245, term4245.getClass(), "pointer", null);
        setField(term4245, term4245.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4245, term4245.getClass(), "sealed", false);
        setField(term4244, term4244.getClass(), "parent", term4245);
        setField(term4244, term4244.getClass(), "namespaceMap", term4249);
        setField(term4244, term4244.getClass(), "reverseMap", term4250);
        setField(term4244, term4244.getClass(), "pointer", null);
        setField(term4244, term4244.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4244, term4244.getClass(), "sealed", false);
        setField(term4243, term4243.getClass(), "parent", term4244);
        setField(term4243, term4243.getClass(), "namespaceMap", term4251);
        setField(term4243, term4243.getClass(), "reverseMap", term4252);
        setField(term4243, term4243.getClass(), "pointer", null);
        setField(term4243, term4243.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4243, term4243.getClass(), "sealed", false);
        setField(term4238, term4238.getClass(), "namespaceResolver", term4243);
        setField(term4238, term4238.getClass(), "parent", null);
        setField(term4238, term4238.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCollection", argTypes, term696, args);
        assertTrue(recursiveEquals(term696, term4238));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


