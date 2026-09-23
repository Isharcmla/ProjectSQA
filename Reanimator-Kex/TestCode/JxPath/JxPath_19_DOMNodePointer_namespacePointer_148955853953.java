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

public class DOMNodePointer_namespacePointer_148955853953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687;
     Object term5917;
     Object term5819;

    public DOMNodePointer_namespacePointer_148955853953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term688 = new HashMap();
        HashMap term722 = new HashMap();
        HashMap term727 = new HashMap();
        HashMap term733 = new HashMap();
        HashMap term738 = new HashMap();
        HashMap term744 = new HashMap();
        HashMap term749 = new HashMap();
        HashMap term758 = new HashMap();
        HashMap term763 = new HashMap();
        term687 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term717 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term718 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term719 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term720 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term757 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term769 = newInstance(Class.forName("java.lang.Object"));
        setField(term687, term687.getClass(), "node", null);
        setField(term687, term687.getClass(), "namespaces", term688);
        setField(term687, term687.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term687, term687.getClass(), "id", "tbcdzjIfER");
        setField(term720, term720.getClass(), "parent", null);
        setField(term720, term720.getClass(), "namespaceMap", null);
        setField(term720, term720.getClass(), "reverseMap", null);
        setField(term720, term720.getClass(), "pointer", null);
        setBooleanField(term720, term720.getClass(), "sealed", false);
        setField(term719, term719.getClass(), "parent", term720);
        setField(term719, term719.getClass(), "namespaceMap", term722);
        setField(term719, term719.getClass(), "reverseMap", term727);
        setField(term719, term719.getClass(), "pointer", null);
        setBooleanField(term719, term719.getClass(), "sealed", false);
        setField(term718, term718.getClass(), "parent", term719);
        setField(term718, term718.getClass(), "namespaceMap", term733);
        setField(term718, term718.getClass(), "reverseMap", term738);
        setField(term718, term718.getClass(), "pointer", null);
        setBooleanField(term718, term718.getClass(), "sealed", false);
        setField(term717, term717.getClass(), "parent", term718);
        setField(term717, term717.getClass(), "namespaceMap", term744);
        setField(term717, term717.getClass(), "reverseMap", term749);
        setField(term717, term717.getClass(), "pointer", null);
        setBooleanField(term717, term717.getClass(), "sealed", false);
        setField(term687, term687.getClass(), "localNamespaceResolver", term717);
        setIntField(term687, term687.getClass(), "index", -616727354);
        setBooleanField(term687, term687.getClass(), "attribute", true);
        setField(term757, term757.getClass(), "parent", null);
        setField(term757, term757.getClass(), "namespaceMap", term758);
        setField(term757, term757.getClass(), "reverseMap", term763);
        setField(term757, term757.getClass(), "pointer", null);
        setBooleanField(term757, term757.getClass(), "sealed", false);
        setField(term687, term687.getClass(), "namespaceResolver", term757);
        setField(term687, term687.getClass(), "rootNode", term769);
        setField(term687, term687.getClass(), "parent", null);
        setField(term687, term687.getClass(), "locale", null);
        HashMap term5918 = new HashMap();
        HashMap term5926 = new HashMap();
        HashMap term5927 = new HashMap();
        HashMap term5928 = new HashMap();
        HashMap term5929 = new HashMap();
        HashMap term5931 = new HashMap();
        HashMap term5932 = new HashMap();
        term5917 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5923 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5924 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5925 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5930 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5933 = newInstance(Class.forName("java.lang.Object"));
        setField(term5917, term5917.getClass(), "node", null);
        setField(term5917, term5917.getClass(), "namespaces", term5918);
        setField(term5917, term5917.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term5917, term5917.getClass(), "id", "tbcdzjIfER");
        setField(term5925, term5925.getClass(), "parent", null);
        setField(term5925, term5925.getClass(), "namespaceMap", null);
        setField(term5925, term5925.getClass(), "reverseMap", null);
        setField(term5925, term5925.getClass(), "pointer", null);
        setBooleanField(term5925, term5925.getClass(), "sealed", false);
        setField(term5924, term5924.getClass(), "parent", term5925);
        setField(term5924, term5924.getClass(), "namespaceMap", term5926);
        setField(term5924, term5924.getClass(), "reverseMap", term5927);
        setField(term5924, term5924.getClass(), "pointer", null);
        setBooleanField(term5924, term5924.getClass(), "sealed", false);
        setField(term5923, term5923.getClass(), "parent", term5924);
        setField(term5923, term5923.getClass(), "namespaceMap", term5928);
        setField(term5923, term5923.getClass(), "reverseMap", term5929);
        setField(term5923, term5923.getClass(), "pointer", null);
        setBooleanField(term5923, term5923.getClass(), "sealed", false);
        setField(term5917, term5917.getClass(), "localNamespaceResolver", term5923);
        setIntField(term5917, term5917.getClass(), "index", -616727354);
        setBooleanField(term5917, term5917.getClass(), "attribute", true);
        setField(term5930, term5930.getClass(), "parent", null);
        setField(term5930, term5930.getClass(), "namespaceMap", term5931);
        setField(term5930, term5930.getClass(), "reverseMap", term5932);
        setField(term5930, term5930.getClass(), "pointer", null);
        setBooleanField(term5930, term5930.getClass(), "sealed", false);
        setField(term5917, term5917.getClass(), "namespaceResolver", term5930);
        setField(term5917, term5917.getClass(), "rootNode", term5933);
        setField(term5917, term5917.getClass(), "parent", null);
        setField(term5917, term5917.getClass(), "locale", null);
        HashMap term5835 = new HashMap();
        HashMap term5868 = new HashMap();
        HashMap term5873 = new HashMap();
        HashMap term5879 = new HashMap();
        HashMap term5884 = new HashMap();
        HashMap term5893 = new HashMap();
        HashMap term5898 = new HashMap();
        term5819 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5834 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5864 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5865 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5866 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5892 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5904 = newInstance(Class.forName("java.lang.Object"));
        setField(term5819, term5819.getClass(), "prefix", "HyxfbSQYBe");
        setField(term5819, term5819.getClass(), "namespaceURI", null);
        setIntField(term5819, term5819.getClass(), "index", -2147483648);
        setBooleanField(term5819, term5819.getClass(), "attribute", false);
        setField(term5819, term5819.getClass(), "namespaceResolver", null);
        setField(term5819, term5819.getClass(), "rootNode", null);
        setField(term5834, term5834.getClass(), "node", null);
        setField(term5834, term5834.getClass(), "namespaces", term5835);
        setField(term5834, term5834.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term5834, term5834.getClass(), "id", "tbcdzjIfER");
        setField(term5866, term5866.getClass(), "parent", null);
        setField(term5866, term5866.getClass(), "namespaceMap", null);
        setField(term5866, term5866.getClass(), "reverseMap", null);
        setField(term5866, term5866.getClass(), "pointer", null);
        setBooleanField(term5866, term5866.getClass(), "sealed", false);
        setField(term5865, term5865.getClass(), "parent", term5866);
        setField(term5865, term5865.getClass(), "namespaceMap", term5868);
        setField(term5865, term5865.getClass(), "reverseMap", term5873);
        setField(term5865, term5865.getClass(), "pointer", null);
        setBooleanField(term5865, term5865.getClass(), "sealed", false);
        setField(term5864, term5864.getClass(), "parent", term5865);
        setField(term5864, term5864.getClass(), "namespaceMap", term5879);
        setField(term5864, term5864.getClass(), "reverseMap", term5884);
        setField(term5864, term5864.getClass(), "pointer", null);
        setBooleanField(term5864, term5864.getClass(), "sealed", false);
        setField(term5834, term5834.getClass(), "localNamespaceResolver", term5864);
        setIntField(term5834, term5834.getClass(), "index", -616727354);
        setBooleanField(term5834, term5834.getClass(), "attribute", true);
        setField(term5892, term5892.getClass(), "parent", null);
        setField(term5892, term5892.getClass(), "namespaceMap", term5893);
        setField(term5892, term5892.getClass(), "reverseMap", term5898);
        setField(term5892, term5892.getClass(), "pointer", null);
        setBooleanField(term5892, term5892.getClass(), "sealed", false);
        setField(term5834, term5834.getClass(), "namespaceResolver", term5892);
        setField(term5834, term5834.getClass(), "rootNode", term5904);
        setField(term5834, term5834.getClass(), "parent", null);
        setField(term5834, term5834.getClass(), "locale", null);
        setField(term5819, term5819.getClass(), "parent", term5834);
        setField(term5819, term5819.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        Object retValue = callMethod(klass, "namespacePointer", argTypes, term687, args);
        assertTrue(recursiveEquals(term687, term5917));
        assertTrue(recursiveEquals(retValue, term5819));
    }

};


