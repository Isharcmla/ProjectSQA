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

public class DOMNodePointer_namespacePointer_148955853954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682;
     Object term5974;
     Object term5877;

    public DOMNodePointer_namespacePointer_148955853954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term683 = new HashMap();
        HashMap term717 = new HashMap();
        HashMap term722 = new HashMap();
        HashMap term728 = new HashMap();
        HashMap term733 = new HashMap();
        HashMap term739 = new HashMap();
        HashMap term744 = new HashMap();
        HashMap term753 = new HashMap();
        HashMap term758 = new HashMap();
        term682 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term712 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term713 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term714 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term715 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term752 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term682, term682.getClass(), "node", null);
        setField(term682, term682.getClass(), "namespaces", term683);
        setField(term682, term682.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term682, term682.getClass(), "id", "tbcdzjIfER");
        setField(term715, term715.getClass(), "parent", null);
        setField(term715, term715.getClass(), "namespaceMap", null);
        setField(term715, term715.getClass(), "reverseMap", null);
        setField(term715, term715.getClass(), "pointer", null);
        setBooleanField(term715, term715.getClass(), "sealed", false);
        setField(term714, term714.getClass(), "parent", term715);
        setField(term714, term714.getClass(), "namespaceMap", term717);
        setField(term714, term714.getClass(), "reverseMap", term722);
        setField(term714, term714.getClass(), "pointer", null);
        setBooleanField(term714, term714.getClass(), "sealed", false);
        setField(term713, term713.getClass(), "parent", term714);
        setField(term713, term713.getClass(), "namespaceMap", term728);
        setField(term713, term713.getClass(), "reverseMap", term733);
        setField(term713, term713.getClass(), "pointer", null);
        setBooleanField(term713, term713.getClass(), "sealed", false);
        setField(term712, term712.getClass(), "parent", term713);
        setField(term712, term712.getClass(), "namespaceMap", term739);
        setField(term712, term712.getClass(), "reverseMap", term744);
        setField(term712, term712.getClass(), "pointer", null);
        setBooleanField(term712, term712.getClass(), "sealed", false);
        setField(term682, term682.getClass(), "localNamespaceResolver", term712);
        setIntField(term682, term682.getClass(), "index", -616727354);
        setBooleanField(term682, term682.getClass(), "attribute", true);
        setField(term752, term752.getClass(), "parent", null);
        setField(term752, term752.getClass(), "namespaceMap", term753);
        setField(term752, term752.getClass(), "reverseMap", term758);
        setField(term752, term752.getClass(), "pointer", null);
        setBooleanField(term752, term752.getClass(), "sealed", false);
        setField(term682, term682.getClass(), "namespaceResolver", term752);
        setField(term682, term682.getClass(), "exceptionHandler", null);
        setField(term682, term682.getClass(), "rootNode", null);
        setField(term682, term682.getClass(), "parent", null);
        setField(term682, term682.getClass(), "locale", null);
        HashMap term5975 = new HashMap();
        HashMap term5983 = new HashMap();
        HashMap term5984 = new HashMap();
        HashMap term5985 = new HashMap();
        HashMap term5986 = new HashMap();
        HashMap term5988 = new HashMap();
        HashMap term5989 = new HashMap();
        term5974 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5987 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5974, term5974.getClass(), "node", null);
        setField(term5974, term5974.getClass(), "namespaces", term5975);
        setField(term5974, term5974.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term5974, term5974.getClass(), "id", "tbcdzjIfER");
        setField(term5982, term5982.getClass(), "parent", null);
        setField(term5982, term5982.getClass(), "namespaceMap", null);
        setField(term5982, term5982.getClass(), "reverseMap", null);
        setField(term5982, term5982.getClass(), "pointer", null);
        setBooleanField(term5982, term5982.getClass(), "sealed", false);
        setField(term5981, term5981.getClass(), "parent", term5982);
        setField(term5981, term5981.getClass(), "namespaceMap", term5983);
        setField(term5981, term5981.getClass(), "reverseMap", term5984);
        setField(term5981, term5981.getClass(), "pointer", null);
        setBooleanField(term5981, term5981.getClass(), "sealed", false);
        setField(term5980, term5980.getClass(), "parent", term5981);
        setField(term5980, term5980.getClass(), "namespaceMap", term5985);
        setField(term5980, term5980.getClass(), "reverseMap", term5986);
        setField(term5980, term5980.getClass(), "pointer", null);
        setBooleanField(term5980, term5980.getClass(), "sealed", false);
        setField(term5974, term5974.getClass(), "localNamespaceResolver", term5980);
        setIntField(term5974, term5974.getClass(), "index", -616727354);
        setBooleanField(term5974, term5974.getClass(), "attribute", true);
        setField(term5987, term5987.getClass(), "parent", null);
        setField(term5987, term5987.getClass(), "namespaceMap", term5988);
        setField(term5987, term5987.getClass(), "reverseMap", term5989);
        setField(term5987, term5987.getClass(), "pointer", null);
        setBooleanField(term5987, term5987.getClass(), "sealed", false);
        setField(term5974, term5974.getClass(), "namespaceResolver", term5987);
        setField(term5974, term5974.getClass(), "exceptionHandler", null);
        setField(term5974, term5974.getClass(), "rootNode", null);
        setField(term5974, term5974.getClass(), "parent", null);
        setField(term5974, term5974.getClass(), "locale", null);
        HashMap term5893 = new HashMap();
        HashMap term5926 = new HashMap();
        HashMap term5931 = new HashMap();
        HashMap term5937 = new HashMap();
        HashMap term5942 = new HashMap();
        HashMap term5951 = new HashMap();
        HashMap term5956 = new HashMap();
        term5877 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5892 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5922 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5923 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5924 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5950 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5877, term5877.getClass(), "prefix", "HyxfbSQYBe");
        setField(term5877, term5877.getClass(), "namespaceURI", null);
        setIntField(term5877, term5877.getClass(), "index", -2147483648);
        setBooleanField(term5877, term5877.getClass(), "attribute", false);
        setField(term5877, term5877.getClass(), "namespaceResolver", null);
        setField(term5877, term5877.getClass(), "exceptionHandler", null);
        setField(term5877, term5877.getClass(), "rootNode", null);
        setField(term5892, term5892.getClass(), "node", null);
        setField(term5892, term5892.getClass(), "namespaces", term5893);
        setField(term5892, term5892.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term5892, term5892.getClass(), "id", "tbcdzjIfER");
        setField(term5924, term5924.getClass(), "parent", null);
        setField(term5924, term5924.getClass(), "namespaceMap", null);
        setField(term5924, term5924.getClass(), "reverseMap", null);
        setField(term5924, term5924.getClass(), "pointer", null);
        setBooleanField(term5924, term5924.getClass(), "sealed", false);
        setField(term5923, term5923.getClass(), "parent", term5924);
        setField(term5923, term5923.getClass(), "namespaceMap", term5926);
        setField(term5923, term5923.getClass(), "reverseMap", term5931);
        setField(term5923, term5923.getClass(), "pointer", null);
        setBooleanField(term5923, term5923.getClass(), "sealed", false);
        setField(term5922, term5922.getClass(), "parent", term5923);
        setField(term5922, term5922.getClass(), "namespaceMap", term5937);
        setField(term5922, term5922.getClass(), "reverseMap", term5942);
        setField(term5922, term5922.getClass(), "pointer", null);
        setBooleanField(term5922, term5922.getClass(), "sealed", false);
        setField(term5892, term5892.getClass(), "localNamespaceResolver", term5922);
        setIntField(term5892, term5892.getClass(), "index", -616727354);
        setBooleanField(term5892, term5892.getClass(), "attribute", true);
        setField(term5950, term5950.getClass(), "parent", null);
        setField(term5950, term5950.getClass(), "namespaceMap", term5951);
        setField(term5950, term5950.getClass(), "reverseMap", term5956);
        setField(term5950, term5950.getClass(), "pointer", null);
        setBooleanField(term5950, term5950.getClass(), "sealed", false);
        setField(term5892, term5892.getClass(), "namespaceResolver", term5950);
        setField(term5892, term5892.getClass(), "exceptionHandler", null);
        setField(term5892, term5892.getClass(), "rootNode", null);
        setField(term5892, term5892.getClass(), "parent", null);
        setField(term5892, term5892.getClass(), "locale", null);
        setField(term5877, term5877.getClass(), "parent", term5892);
        setField(term5877, term5877.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        Object retValue = callMethod(klass, "namespacePointer", argTypes, term682, args);
        assertTrue(recursiveEquals(term682, term5974));
        assertTrue(recursiveEquals(retValue, term5877));
    }

};


